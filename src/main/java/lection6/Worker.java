package lection6;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("id:%d name:%s ln:%s salary: %d", id, firstName, lastName,salary);

    }

    @Override
    public boolean equals(Object o) {
        var t = (Worker) o;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
