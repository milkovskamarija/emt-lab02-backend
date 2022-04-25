package emt.labs.lab02.model.dto;

import lombok.Data;

@Data
public class BookDto {

    private String name;

    private String category;

    private String author;

    private Integer availableCopies;

    public BookDto() {

    }

    public BookDto(String name, String category, String author, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.availableCopies = availableCopies;
    }
}
