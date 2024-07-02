package com.example.scaler.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
public class Batch extends BaseModel{

    private String name;
    private Schedule schedule;
    @ManyToOne
    private Instructor instructor;

}
