package index.Object.PolymorphicDemo;

public class Teacher extends Person {

    @Override
    public void show() {
        System.out.println("Teacher Show");
        System.out.println("Name: " + getName() + " Age: " + getAge());
    }
}
