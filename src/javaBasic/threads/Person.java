package javaBasic.threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Person {

    private ReentrantLock lock;
    private Condition nameCondition;
    private String name;
    private Integer age;

    public Person() {
        this.lock = new ReentrantLock();
        this.nameCondition = lock.newCondition();
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

    public Condition getNameCondition() {
        return nameCondition;
    }

    public ReentrantLock getLock() {
        return lock;
    }

}
