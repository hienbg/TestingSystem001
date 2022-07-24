package com.vti.rw41.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
@Setter
@Getter
public class ExamQuestion {
    @EmbeddedId
    private ExamQuestionId id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ExamID", nullable = false, insertable = false, updatable = false)
    private Exam examID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "QuestionID", nullable = false, insertable = false, updatable = false)
    private Question questionID;

    public ExamQuestionId getId() {
        return id;
    }

    public void setId(ExamQuestionId id) {
        this.id = id;
    }
}
