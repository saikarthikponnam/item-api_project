package com.karthik.itemapi.dto;

import java.time.LocalDateTime;

public class ItemResponse {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private LocalDateTime createdAt;

    public ItemResponse(Long id, String name, String description, Double price, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public Double getPrice() { return price; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}