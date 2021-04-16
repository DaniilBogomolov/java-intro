package ru.itis.builder;

public class Human {
    private String name;
    private Integer height;
    private Integer age;
    private Integer weight;
    private String sex;

    public Human(String name, Integer height, Integer age, Integer weight, String sex) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
    }

    public Human(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Human(Integer height) {
        this.height = height;
    }

    public Human(String name) {
        this.name = name;
    }

    public static HumanBuilder builder() {
        return new HumanBuilder();
    }

    public Human() {

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                '}';
    }

    public static class HumanBuilder {
        private String name;
        private Integer height;
        private Integer age;
        private Integer weight;
        private String sex;

        public HumanBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public HumanBuilder setHeight(Integer height) {
            this.height = height;
            return this;
        }

        public HumanBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public HumanBuilder setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public HumanBuilder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Human build() {
            return new Human(name, height, age, weight, sex);
        }
    }
}
