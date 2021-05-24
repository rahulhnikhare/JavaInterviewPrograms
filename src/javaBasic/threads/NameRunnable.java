package javaBasic.threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class NameRunnable implements Runnable{

    private Person person;
    private String name;

    public NameRunnable(Person person, String name) {
        this.person = person;
        this.name = name;
    }

    @Override
    public void run() {
        ReentrantLock lock = person.getLock();
        Condition condition = person.getNameCondition();
        lock.lock();
        System.out.println("AGE::"+ person.getAge());
        try {
            person.setName(name);
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}
