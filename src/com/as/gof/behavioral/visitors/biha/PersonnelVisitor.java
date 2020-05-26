package com.as.gof.behavioral.visitors.biha;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Slesarchuk on 05/26/2020.
 */
public class PersonnelVisitor implements Visitor {
    private int employeeAmount;
    private int headAmount;
    private int chairmanAmount;

    private List<String> personnel = new ArrayList<>();

    @Override
    public void visit(Employee employee) {
        employeeAmount++;
        personnel.add( "Employee: " + employee.getName() );
    }

    @Override
    public void visit(Head head) {
        headAmount++;
        personnel.add( "Head: " + head.getName() );
    }

    @Override
    public void visit(Chairman chairman) {
        chairmanAmount++;
        personnel.add( "Chairman: " + chairman.getName() );
    }

    public int getEmployeeAmount() {
        return employeeAmount;
    }

    public int getHeadAmount() {
        return headAmount;
    }

    public int getChairmanAmount() {
        return chairmanAmount;
    }

    public int getPersonnelAmount(){
        return employeeAmount + headAmount + chairmanAmount;
    }

    public String getPersonnel(){
        return personnel.toString();
    }

}
