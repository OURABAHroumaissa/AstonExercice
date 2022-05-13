package fr.or.exo11;

public class Teacher extends Person{
    private String subject;

    public Teacher() {
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void Explain(){
        System.out.println("Explanation Begins");
    }
}
