package first.one;

public class App {
    static Person firstPerson = new Person(1, "Timea", 15, "f");
    static first.two.Person secondPerson = new first.two.Person();

    public static void main(String[] args) {
        System.out.println(firstPerson.age + firstPerson.id + firstPerson.gender);
        System.out.println(secondPerson.gender);
    }
}
