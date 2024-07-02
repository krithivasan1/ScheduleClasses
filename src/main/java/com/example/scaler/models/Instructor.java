package com.example.scaler.models;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
public class Instructor extends BaseModel{

    private String name;
    private String email;
}
