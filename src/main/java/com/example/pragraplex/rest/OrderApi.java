package com.example.pragraplex.rest;

import com.example.pragraplex.dto.ErrorDto;
import com.example.pragraplex.entity.Order;
import com.example.pragraplex.exceptions.CustomerNotFoundException;
import com.example.pragraplex.exceptions.MovieNotFoundException;
import com.example.pragraplex.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class OrderApi {

    private final OrderService service;

    public OrderApi(OrderService service) {
        this.service = service;
    }

    @PostMapping("/{id}/order")
    public ResponseEntity<Order> addOrder(@PathVariable("id") int customerId, @RequestBody Order order ) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .header("x-CREATOR", "anisha")
                .body(service.createOrder(customerId, order));


    }



    //getAllorders
    @GetMapping("/orders")
    public List<Order>getAll(){
        return service.finAll();
    }
}
