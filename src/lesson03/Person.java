package lesson03;

public class Person {
    String firstName, lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ivan", "Ivanov", 15);
        Person p2 = new Person("Ivan", "Ivanov", 15);
        Person p3 = p1;

        System.out.printf("p1=p2 is %s%n", p1 == p2);
        System.out.printf("p1.equals(p2) is %s%n", p1.equals((p2)));
        System.out.printf("p1 == p3 is %s%n", p1 == p3);

        System.out.println(p1);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        return lastName != null ? lastName.equals(person.lastName) : person.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }


}
