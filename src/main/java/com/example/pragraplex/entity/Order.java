package com.example.pragraplex.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@Table(name = "TABLE_ORDER")

public class Order {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"

    )
    private UUID id;
     private String movieName;
//ONE ORDER HAS many MOVIE
@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
@JoinColumn(name = "MovieId", referencedColumnName = "Movie_ID")
private Movie movie;
    private Date orderDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern ="yyyy-MM-dd" )
    private  Date showDate;
    private  double amount;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name="CUSTOMER_ID" , referencedColumnName = "CUSTOMER_ID")
    @JsonIgnore
    private Customer customer;


}
