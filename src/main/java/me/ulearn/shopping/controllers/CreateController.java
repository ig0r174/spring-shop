package me.ulearn.shopping.controllers;

import com.google.gson.Gson;
import me.ulearn.shopping.ShoppingList;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class CreateController {

    @RequestMapping(path = "/api/new", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    private ResponseEntity doCreate(@ModelAttribute("text") String text){
        ShoppingList.add(text);
        HashMap<String, String> result = new HashMap<>();
        result.put("status", "success");
        result.put("id", String.valueOf(ShoppingList.getNextId() - 1));
        Gson gson = new Gson();
        return new ResponseEntity(gson.toJson(result), HttpStatus.CREATED);
    }

}
