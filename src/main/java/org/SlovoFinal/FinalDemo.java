package org.SlovoFinal;

public class FinalDemo {
    private final String s;
    // zastosovyetsa v poliax
    private final FinalClass finalClass = new FinalClass();
    public static void main(String[] args) {
        new FinalDemo();
    }
    public FinalDemo(){
        this.s = "a";
        finalClass.s = "b";//s ce  1 poverx,finalClass. ce bydunok,"a",'b' ce magazun IKEA
    }
    private final void smth(){};// v metodax
     private final class InnerClass{};//do klassiv,final class ne mozlivo ynaslidyvatu
}
