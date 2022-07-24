package com.vti.rw41.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@ToString
@Setter
@Getter
public class GroupAccount implements Serializable {

    @EmbeddedId
    private GroupAccountId id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "GroupID", nullable = false, insertable = false, updatable = false)
    private Group groupID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "AccountID", nullable = false , insertable = false, updatable = false)

    private Account accountID;

    @Column(name = "JoinDate")
    private LocalDateTime joinDate;

}
