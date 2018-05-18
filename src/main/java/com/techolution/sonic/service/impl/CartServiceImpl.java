package com.techolution.sonic.service.impl;

import com.techolution.sonic.model.Product;
import com.techolution.sonic.service.CartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Override
    public boolean processCheckOut(List<Product> productsList) {
        //save it to DB and return true after success.
        return true;
    }
}
