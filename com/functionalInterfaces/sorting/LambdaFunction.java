package com.functionalInterfaces.sorting;

import com.utils.EmployeePojo;
import com.utils.EmployeeService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaFunction {
    public static void main(String args[]){
        getSortedLists();
    }

    private static void getSortedLists() {
        List<EmployeePojo> employeePojoList= EmployeeService.getALlEmployees();

        Collections.sort(employeePojoList, new Comparator<EmployeePojo>() {
            @Override
            public int compare(EmployeePojo o1, EmployeePojo o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(employeePojoList);

        Collections.sort(employeePojoList,(o1,o2) -> o1.getLocation().compareTo(o2.getLocation()));
        System.out.println(employeePojoList);

        Collections.sort(employeePojoList,(o1,o2) -> o1.getId()-o2.getId());
        System.out.println(employeePojoList);
    }
}
