package com.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeService {



    public static List<EmployeePojo> getALlEmployees(){

        List<EmployeePojo> empList=new ArrayList<EmployeePojo>();

        empList.add(new EmployeePojo(1,"Jagan","Hyderabad"));
        empList.add(new EmployeePojo(2,"Kumar","Chennai"));
        empList.add(new EmployeePojo(3,"Ganamaina","Bangalore"));

        return empList;

    }
}
