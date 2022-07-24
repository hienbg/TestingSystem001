package com.vti.rw41.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
@ToString
@Setter
@Getter
public class GroupAccountId implements Serializable {
    private static final Long serialVersionUID = 1L;

    @Column(name = "GroupID", nullable = false)
    private Integer groupID;

    @Column(name = "AccountID", nullable = false)
    private Integer accountID;

}