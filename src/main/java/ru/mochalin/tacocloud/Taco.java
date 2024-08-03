package ru.mochalin.tacocloud;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;


import java.util.List;
import java.util.Date;

@Data
public class Taco {
    
    private Long id;

    private Date createdAt = new Date();

    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;

    @NotNull
    @Size(min=1, message="You most choose least 1 ingredient")
    private List<Ingredient> ingredients;
}
