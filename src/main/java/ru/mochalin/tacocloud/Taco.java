package ru.mochalin.tacocloud;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;


import java.util.List;
import java.util.Date;

@Data
@Table
public class Taco {
    
    @Id
    private Long id;

    private Date createdAt = new Date();

    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;

    @NotNull
    @Size(min=1, message="You most choose least 1 ingredient")
    private List<Ingredient> ingredients;
}
