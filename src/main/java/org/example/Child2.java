package org.example;

public class Child2 extends ParentClass{
    public Child2( String Descendant) {
        super(Descendant);}
       public String Inheritance= "emulation";
    public void copy1(){
        Descendant2 = "";
        MyPublicMethod();
        MyProtectedMethod();
    }

    public void MySuperMethod() {
        super.MyPublicMethod();}

    public void MyPublicMethod() {
        System.out.println("This is Child2's  public method");

    }
}
