package com.techolution.sonic.controller;

import com.techolution.sonic.model.Product;
import com.techolution.sonic.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/sonic")
public class SonicOrderController {

    @Autowired
    CartService cartService;


    @PostMapping("/checkout")
    public ResponseEntity<String> processCheckout(@RequestBody List<Product> products) {
        //Now call the service
        cartService.processCheckOut(products);
        return new ResponseEntity("Success", HttpStatus.OK);
    }

}

