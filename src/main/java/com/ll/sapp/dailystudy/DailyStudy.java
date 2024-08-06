package com.ll.sapp.dailystudy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DailyStudy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dailyStudyId;

    private Integer nDay;

    private Integer temp;

}