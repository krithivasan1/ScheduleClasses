package com.example.scaler.controllers;

import com.example.scaler.dtos.ResponseStatus;
import com.example.scaler.dtos.ScheduleLectureRequestDto;
import com.example.scaler.dtos.ScheduleLecturesResponseDto;
import com.example.scaler.exceptions.InvalidBatchException;
import com.example.scaler.exceptions.InvalidInstructorException;
import com.example.scaler.exceptions.InvalidLectureException;
import com.example.scaler.models.ScheduledLecture;
import com.example.scaler.services.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class LectureController {

    @Autowired
    public LectureService lectureService;

    public ScheduleLecturesResponseDto scheduleLectures(ScheduleLectureRequestDto requestDto) throws InvalidBatchException, InvalidLectureException, InvalidInstructorException {
        ScheduleLecturesResponseDto scheduleLecturesResponseDto = new ScheduleLecturesResponseDto();
        try {
            List<ScheduledLecture> scheduledLectureList = lectureService.scheduleLectures(requestDto.getLectureIds(), requestDto.getInstructorId(), requestDto.getBatchId());
            scheduleLecturesResponseDto.setScheduledLectures(scheduledLectureList);
            scheduleLecturesResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (InvalidBatchException e) {
            scheduleLecturesResponseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return scheduleLecturesResponseDto;

    }
}
