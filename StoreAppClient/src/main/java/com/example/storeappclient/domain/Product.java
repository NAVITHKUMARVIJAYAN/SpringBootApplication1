package com.example.storeappclient.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "name", "price"})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer id;
    private String name;
    private Double price;
}
