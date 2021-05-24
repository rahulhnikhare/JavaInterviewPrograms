package javaBasic.threads;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
        Person person = new Person();
        NameRunnable nameRunnable = new NameRunnable(person, "Test");
        AgeRunnable ageRunnable = new AgeRunnable(person, 10);
        new Thread(nameRunnable).start();
        new Thread(ageRunnable).start();
    }

}
