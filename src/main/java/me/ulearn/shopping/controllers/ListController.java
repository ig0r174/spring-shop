package me.ulearn.shopping.controllers;

import com.google.gson.Gson;
import me.ulearn.shopping.ShoppingList;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ListController {
    @RequestMapping(path = "/api/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String list(Model model) {
        Gson gson = new Gson();
        return gson.toJson(ShoppingList.getProductList());
    }
}
