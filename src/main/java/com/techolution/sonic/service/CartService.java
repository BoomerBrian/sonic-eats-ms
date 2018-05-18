package com.techolution.sonic.service;

import com.techolution.sonic.model.Product;

import java.util.List;

public interface CartService {

    boolean processCheckOut(List<Product> productsList);

}
