package com.example.scaler.models;

import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Data
public class ScheduledLecture extends BaseModel{

    private Lecture lecture;
    @ManyToOne
    private Batch batch;
    private Instructor instructor;
    private Date lectureStartTime;
    private Date lectureEndTime;
    private String lectureLink;
}
