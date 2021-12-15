package me.ulearn.shopping.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list( Model model) {
        //model.addAttribute("list", ShoppingList.getProductList());
        return "list";
    }
}
