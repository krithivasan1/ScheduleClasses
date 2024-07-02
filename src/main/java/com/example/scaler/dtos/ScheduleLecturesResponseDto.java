package com.example.scaler.dtos;

import com.example.scaler.models.ScheduledLecture;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class ScheduleLecturesResponseDto {
    private List<ScheduledLecture> scheduledLectures;
    private ResponseStatus responseStatus;
}
