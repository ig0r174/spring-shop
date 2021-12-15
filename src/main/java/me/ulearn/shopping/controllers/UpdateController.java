package me.ulearn.shopping.controllers;

import com.google.gson.Gson;
import me.ulearn.shopping.ShoppingList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@Controller
public class UpdateController {
    @RequestMapping(path = "/api/update/{id}", method = RequestMethod.PUT)
    @ResponseBody
    private ResponseEntity update(@PathVariable("id") int id, @ModelAttribute("text") String text){
        ShoppingList.get(id).setText(text);
        return new ResponseEntity(HttpStatus.OK);
    }
}
