package org.congestion;

public class Overload {
    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.makeHTTPRequest();
        overload.makeHTTPRequest("POST");
        overload.makeHTTPRequest("DELETE","http//facebook.loh");
    }
    public void makeHTTPRequest(){
        makeHTTPRequest("GET");
        //gotovuy dlia vukonnannia metod z gotovum tipom zaputy
    }

        public void makeHTTPRequest(String requestType){
        makeHTTPRequest(requestType,"http//google:lox");
        //z mozhluvistiy zminutu tip zaputy
    }
    public void makeHTTPRequest(String requestType,String url){
        System.out.println("Making " + requestType + "  request to  " + url);
        // z mozhluvum zminenniam tipy zaputy ta adressy
        //max.skladnuy metod
    }}
       /* printFullName("Lilo");
        printFullName("Lilo","Kon");
        printFullName("Lilo","Kon","Dodo");

        Overload overload = new Overload ();
        Overload overload2 = new Overload ("");
        Overload overload3 = new Overload ("","");}
       public Overload (){};
    public Overload (String  name){};
    public Overload (String name,String secondName){};
    /*}public static void smth(String aString) {
    }public static void smth(String aString, String bString) {
    }public static void smth(String aString,int bInt) {
    }
    public static void printFullName(String name) {
        printFullName(name,"","");
    }
    public static void printFullName(String name,String secondName) {
        printFullName(name, secondName,"");
    }
    public static void printFullName(String name,String secondName,String middleName) {
        System.out.println(name + " " + secondName + " " + middleName + " ");
    }*/

