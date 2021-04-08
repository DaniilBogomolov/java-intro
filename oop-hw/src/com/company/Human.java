package com.company;

public class Human implements Comparable<Human> {
    private String name;
    private Integer age;

    public Human(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Human other = (Human) obj;
        return this.name.equals(other.name) && this.age.equals(other.age);
    }

    @Override
    public int compareTo(Human o) {
        return this.age - o.age;
    }
}
