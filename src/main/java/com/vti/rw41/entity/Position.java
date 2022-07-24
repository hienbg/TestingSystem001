package com.vti.rw41.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="`Position`")
@ToString
@Setter
@Getter
public class Position implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PositionID", nullable = false)
    private Integer id;

    @Column(name = "PositionName", nullable = false)
    private String positionName;

}