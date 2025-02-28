
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) return true;
        if (!(compared instanceof Person)) return false;
        Person person = (Person) compared;
        return height == person.height && weight == person.weight && name.equals(person.name) && birthday.equals(person.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday, height, weight);
    }
}
