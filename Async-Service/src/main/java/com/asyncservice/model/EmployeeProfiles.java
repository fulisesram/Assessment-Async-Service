package com.asyncservice.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class EmployeeProfiles implements Serializable {
    private static final long serialVersionUID = 1L;

    public List<EmployeeProfile> employeeProfileList;



}
