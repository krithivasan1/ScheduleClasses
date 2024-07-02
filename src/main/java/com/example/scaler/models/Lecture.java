package com.example.scaler.models;

import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Lecture extends BaseModel{

    private String name;
    private String description;
    @ManyToOne
    private Batch batch;
    @ManyToOne
    private Instructor instructor;
}
