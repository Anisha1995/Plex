package com.example.pragraplex.rest;

import com.example.pragraplex.dto.ErrorDto;
import com.example.pragraplex.entity.Order;
import com.example.pragraplex.exceptions.CustomerNotFoundException;
import com.example.pragraplex.exceptions.MovieNotFoundException;
import com.example.pragraplex.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/customer")
public class OrderApi {

    private final OrderService service;

    public OrderApi(OrderService service) {
        this.service = service;
    }

//    @PostMapping("/{id}/order")
//    public ResponseEntity<Order> addOrder(@RequestHeader(value = "X-COUNTRY", required = false) String country, @RequestHeader("Host") String host,  @PathVariable("id") int customerId, @RequestBody Order order){
//        Order serviceOrder = service.createOrder(customerId, order);
//        log.info("Processing order for country {} got from header", country);
//        log.info("Processing order for host  {} got from header", host);
//        if(country.equals("INDIA")) {
//            serviceOrder.setAmount(serviceOrder.getAmount()*1.18);
//        }
//
//        return ResponseEntity.status(HttpStatus.CREATED)
//                .header("x-CREATOR", "anisha")
//                .body(service.createOrder(customerId, order));
//
//
//    }

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
