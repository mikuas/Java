package index.Object.PolymorphicDemo;

public class Student extends Person{

    @Override
    public void show() {
        System.out.println("Student Show");
        System.out.println("Name: " + getName() + " Age: " + getAge());
    }
}
