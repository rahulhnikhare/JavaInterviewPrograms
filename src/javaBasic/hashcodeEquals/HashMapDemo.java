package javaBasic.hashcodeEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

class StudentHashCode {
    private int id;
    private String name;
    public StudentHashCode(int id, String name) {
        this.name = name;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof StudentHashCode))
            return false;
        if (obj == this)
            return true;
        return this.getId() == ((StudentHashCode) obj).getId();
    }

    /*@Override
    public int hashCode() {
        System.out.println("id = " + id);
        //return id;
        return 99;
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class HashMapDemo {
    public static void main(String[] args) {
        StudentHashCode alex1 = new StudentHashCode(1, "Alex1");
        StudentHashCode alex2 = new StudentHashCode(1, "Alex2");
        HashSet< StudentHashCode > students = new HashSet < StudentHashCode > ();
        students.add(alex2);
        students.add(alex1);
        System.out.println("HashSet size = " + students.size());
        System.out.println("HashSet contains Alex = " + students.contains(new StudentHashCode(1, "Alex")));

        System.out.println("==========================================================");
        System.out.println("==========================================================");

        // HashMap

        HashMap<Integer,StudentHashCode> hm = new HashMap();
        hm.put(1,alex2);
        hm.put(1,alex1);
        System.out.println("HashMap size = " + hm.size());
        System.out.println("HashMap contains  = " );

        hm.entrySet().forEach(entry -> {
            System.out.println("HashMap contains  = "   +entry.getKey().toString() + " " + entry.getValue().getName());
        });



    }
}

