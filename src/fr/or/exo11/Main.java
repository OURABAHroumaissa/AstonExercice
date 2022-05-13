package fr.or.exo11;

public class Main {
    public static void main(String[] args) {
        Person personne1 = new Person();
        Student student1 = new Student();
        Teacher teacher = new Teacher();

        personne1.sayHello();
        System.out.println();

        student1.setAge(15);
        student1.sayHello();
        student1.goToClass();
        student1.displayAge();
        System.out.println();

        teacher.setAge(40);
        teacher.sayHello();
        teacher.Explain();


    }
}
