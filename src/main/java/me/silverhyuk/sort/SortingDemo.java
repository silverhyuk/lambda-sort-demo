package me.silverhyuk.sort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {

    public static void main(String[] args) {
        List<Person> personList = getPersons();

        System.out.println("=======================");
        System.out.println("Before Sort");
        System.out.println("=======================");


        for(Person person : personList) {
            System.out.println(person);
        }

        // list sort java8
        /*personList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
        });*/

        //lambda sort java8
        personList.sort((Person o1, Person o2)->o1.getAge()-o2.getAge());
        System.out.println("=======================");
        System.out.println("After Sort");
        System.out.println("=======================");
        personList.forEach((person -> {
            System.out.println(person);
        }));



    }

    private static List<Person> getPersons() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("eunhyuk", new BigDecimal("70000"), 35));
        personList.add(new Person("alvic", new BigDecimal("80000"), 20));
        personList.add(new Person("fred", new BigDecimal("150000"), 15));
        personList.add(new Person("mongos", new BigDecimal("170000"), 55));

        return personList;
    }

}
