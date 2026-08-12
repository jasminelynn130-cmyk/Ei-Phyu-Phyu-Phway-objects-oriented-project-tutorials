public class Main {
    public static void main(String[] args) {

        Person p0 = new Person("Generic Person", "P000");
        Person p1 = new Student("Ei Phyu", "S001");
        Person p2 = new Lecturer("Dr. Ahmad", "L001");

        p0.introduce();
        p1.introduce();
        p2.introduce();
    }
}