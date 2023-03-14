package other;

import org.example.Child1;
import org.example.Child2;
import org.example.ParentClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass("ParentSinheritance");
        parentClass.printDescendant();
        Child2 child2 = new Child2("Child2inheritance");
        child2.printDescendant();//передали змінену строку в паренткласс
        GrandChild1 grandChild1 = new GrandChild1();
        grandChild1.printDescendant();//має постійну строку значення через метод() i peredae ii;
        //class matyme odne te same znachennya.kontrakt
        System.out.println(grandChild1.Inheritance);
        System.out.println(((ParentClass)grandChild1).Inheritance);
        grandChild1.MySuperMethod();
        grandChild1.MyPublicMethod();
    }
}