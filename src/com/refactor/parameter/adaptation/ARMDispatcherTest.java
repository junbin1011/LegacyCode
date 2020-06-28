package com.refactor.parameter.adaptation;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ARMDispatcherTest {

    @Test
    public void populate() {
        ARMDispatcher armDispatcher = new ARMDispatcher();
        FakeParameterSource fakeParameterSource = new FakeParameterSource();
        fakeParameterSource.value = "hello world";
        armDispatcher.populate(fakeParameterSource);
        assertThat(armDispatcher.marketBinding.size(),is(1));
        assertThat(armDispatcher.marketBinding.get(0),is("hello world"));
    }
}