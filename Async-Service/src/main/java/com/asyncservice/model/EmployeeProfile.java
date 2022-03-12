package com.asyncservice.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeProfile implements Serializable {
    private static final long serialVersionUID = 1L;

    public String profile;
    public String specialization;

}
