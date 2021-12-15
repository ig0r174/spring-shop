package me.ulearn.shopping.controllers;

import me.ulearn.shopping.ShoppingList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BuyController {
    @RequestMapping(path = "/api/buy/{id}", method = RequestMethod.PUT)
    @ResponseBody
    private ResponseEntity buy(@PathVariable("id") int id){
        ShoppingList.get(id).setIsBought();
        return new ResponseEntity(HttpStatus.OK);
    }
}
