package com.vti.rw41.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity

@Setter
@Getter
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="DepartmentID", nullable = false)
    private Integer id;

    @Column(name="DepartmentName", length = 100)
    private String name;

    @OneToMany(mappedBy = "departmentID")
    private List<Account> accounts;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
