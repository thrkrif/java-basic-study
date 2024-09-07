package com.hello.order;
import com.hello.user.*;
import com.hello.product.*;
public class Order {
    User user;
    Product product;

    public Order(User user, Product product){
        this.user = user;
        this.product = product;
    }
}
