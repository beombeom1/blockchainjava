package sec08;

public class UpcastDemo {
    public static void main(String[] args) {
        Person p;
        Student s = new Student();
        Student s1;

        p = s;
        s1 = (Student)p;

        p.whoami();
        s1.work();
        s1.whoami();
    }
}