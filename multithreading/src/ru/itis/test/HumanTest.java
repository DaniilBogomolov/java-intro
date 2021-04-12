package ru.itis.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HumanTest {

    // TDD - Test Driven Development
    @Test
    public void testHumanNameIsSet() {
        Human human = new Human("myname");
        Assertions.assertEquals("myname", human.getName());
    }
}
