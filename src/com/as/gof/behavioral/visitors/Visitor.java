package com.as.gof.behavioral.visitors;

/**
 * Created by Andrey Slesarchuk on 05/25/2020.
 */
public interface Visitor {

    void visit(Employee employee);

    //void visit(Boss boss);
    //void visit(SuperBoss superBoss);

}
