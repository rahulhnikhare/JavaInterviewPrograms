package javaBasic.threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class AgeRunnable implements Runnable{

    private Person person;
    private Integer age;

    public AgeRunnable(Person person, Integer age) {
        this.person = person;
        this.age = age;
    }

    @Override
    public void run() {
        ReentrantLock lock = person.getLock();
        Condition condition = person.getNameCondition();
        lock.lock();
        System.out.println("NAME::" + person.getName());
        try {
            while (person.getName() == null) {
                condition.await();
            }
            System.out.println("SET AGE");
            person.setAge(age);
        } catch (InterruptedException e) {
            // TODO
        } finally {
            lock.unlock();
        }
    }
}
