package other;

import org.example.Child2;

public class GrandChild1 extends Child2 {
    public GrandChild1() {
        super("grandchildFocus");}
    public void descendant(){
        Inheritance = "ChildEmulation";
        Descendant2 = "";
        MyPublicMethod();
        MyProtectedMethod();
    }

}
