package com.as.gof.behavioral.visitors.biha;

/**
 * Created by Andrey Slesarchuk on 05/25/2020.
 */
public interface Visitor {

    void visit(Employee employee);

    void visit(Head head);

    void visit(Chairman chairman);

}
