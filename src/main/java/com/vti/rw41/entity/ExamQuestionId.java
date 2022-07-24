package com.vti.rw41.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;
@ToString
@Setter
@Getter
@Embeddable
public class ExamQuestionId implements Serializable {
    private static final Long serialVersionUID = 1L;
    @Column(name = "ExamID", nullable = false)
    private Integer examID;

    @Column(name = "QuestionID", nullable = false)
    private Integer questionID;

    public Integer getExamID() {
        return examID;
    }

}