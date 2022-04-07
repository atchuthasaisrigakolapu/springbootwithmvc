package com.example.spring.with.mvc.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {
    private Integer bookId;
    private String bookName;
    private Double bookPrice;

}
