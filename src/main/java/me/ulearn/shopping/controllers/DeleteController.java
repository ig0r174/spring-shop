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
public class DeleteController {
    @RequestMapping(path = "/api/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    private ResponseEntity delete(@PathVariable("id") int id) {
        ShoppingList.remove(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
