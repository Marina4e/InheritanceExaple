package org.example;

public class ParentClass {
    public String Inheritance = "parent";
    private String Descendant;
    protected String Descendant2;
    public ParentClass(String Descendant){
        this.Descendant = Descendant;
    }
    public void MyPublicMethod(){
        System.out.println( "This is ParentClass' method");
    }
    protected void MyProtectedMethod(){
        System.out.println( "This is ParentClass' method");
    }
    public void printDescendant(){
        System.out.println(Descendant);
    }
}
