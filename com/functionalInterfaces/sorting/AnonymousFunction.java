package com.functionalInterfaces.sorting;

import com.utils.EmployeePojo;
import com.utils.EmployeeService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousFunction {

    public static void main(String[] args){

        List<EmployeePojo> empList= EmployeeService.getALlEmployees();
        Collections.sort(empList,new NameComparator() );
        System.out.println(empList);

        List<EmployeePojo> empLocList= EmployeeService.getALlEmployees();
        Collections.sort(empLocList,new LocationComparator());
        System.out.println(empLocList);

        List<EmployeePojo> empIdList= EmployeeService.getALlEmployees();
        Collections.sort(empIdList,new IdComparator());
        System.out.println(empIdList);
    }
}

class NameComparator implements Comparator<EmployeePojo>{

    @Override
    public int compare(EmployeePojo o1, EmployeePojo o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

class LocationComparator implements Comparator<EmployeePojo> {

    @Override
    public int compare(EmployeePojo o1, EmployeePojo o2) {
        return o1.getLocation().compareTo(o2.getLocation());
    }
}
class IdComparator implements Comparator<EmployeePojo> {

    @Override
    public int compare(EmployeePojo o1, EmployeePojo o2) {
        return o1.getId()-o2.getId();
    }
}
