package com.concrete.demo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractClass1 {
    @Autowired
    private ConcreteDependance1 concreteDependance1;
    @Autowired
    private ConcreteDependance2 concreteDependance2;
}
