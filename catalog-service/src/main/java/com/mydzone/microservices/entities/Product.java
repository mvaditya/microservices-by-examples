package com.mydzone.microservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="products", schema="dbo")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
    @Column(nullable = false, unique = true) private String code;
    @Column(nullable = false) private String name;
    private String description;
    private double price;
}
