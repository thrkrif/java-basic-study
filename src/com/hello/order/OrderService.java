package com.hello.order;

import com.hello.product.Product;
import com.hello.user.User;

public class OrderService {
    User user = new User();
    Product product = new Product();
    Order order = new Order(user,product);
}
