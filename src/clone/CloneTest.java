package clone;

public class CloneTest {
    public static void main(String [] args) throws CloneNotSupportedException {
        Employee john = new Employee("John", 5000);
        john.setHireDay(2000,1,1);

        Employee clone = john.clone();
        System.out.println(clone);
        System.out.println(john);

        clone.raiseSalary(10);
        clone.setHireDay(2002,12,31);
        System.out.println(clone);
        System.out.println(john);
    }
}

