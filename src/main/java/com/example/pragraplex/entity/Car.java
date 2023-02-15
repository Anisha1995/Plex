package com.example.pragraplex.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;

@Builder
@ToString

public class Car {
     private String carName;
}