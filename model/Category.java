package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Category {
    @Id
    @Column(nullable = false)
    private Long id ;
    private String name ;
}
