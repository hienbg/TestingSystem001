package com.vti.rw41.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@ToString
@Setter
@Getter
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ExamID", nullable = false)
    private Integer id;

    @Column(name = "`Code`", nullable = false, length = 10)
    private String code;

    @Column(name = "Title", nullable = false, length = 50)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CategoryID", nullable = false)
    private CategoryQuestion categoryID;

    @Column(name = "Duration", nullable = false)
    private Integer duration;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CreatorID", nullable = false)
    private Account creatorID;

    @Column(name = "CreateDate")
    private LocalDateTime createDate;


}
