package com.vti.rw41.entity;

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
@Table(name = "`Group`")
public class Group implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GroupID", nullable = false)
    private Integer id;

    @Column(name = "GroupName", nullable = false, length = 50)
    private String groupName;

    @OneToOne
    @JoinColumn(name = "CreatorID")
    private Account creatorID;

    @Column(name = "CreateDate")
    private LocalDateTime createDate;

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", creatorID=" + creatorID.getId()+
                ", createDate=" + createDate +
                '}';
    }
}