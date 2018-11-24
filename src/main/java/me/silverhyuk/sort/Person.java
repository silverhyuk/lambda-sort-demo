package me.silverhyuk.sort;

import java.math.BigDecimal;

public class Person {
    private String name;
    private BigDecimal money;
    private int age;

    public Person(String name, BigDecimal money, int age) {
        this.name = name;
        this.money = money;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", age=" + age +
                '}';
    }
}
