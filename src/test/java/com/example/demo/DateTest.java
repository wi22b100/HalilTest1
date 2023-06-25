package com.example.demo;

import com.example.demo.controller.DateController;
import com.example.demo.service.DateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class DateTest {

    @Autowired
    private DateService dateService;

    @Autowired
    private DateController dateController;

    @Test
    public void testGetTime() {
        //Arrange - Act - Assert
        assertThat(dateService.getTime()).isBeforeOrEqualTo(LocalTime.now());
    }

    @Test
    public void testGetDateFormatNull() {
        assertThat(dateController.getDate(null)).isEqualTo(LocalDate.now().toString());
    }
}
