public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen(); //created a pen object called p1
        //p1.setColor("blue");
        p1.setColor = "yellow";
        System.out.println(p1.getColor);
        p1.setTip(5);
        System.out.println(p1.getTip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "ayushianand";
        //myAcc.passworrd = "abcde"; throws error
        myAcc.setPassword("abcde");

        //Student s1 = new Student();
        //System.out.println(s1.name);
    }
}

class BankAccount{
     public String username;
     private String password;
     public void setPassword(String pwd){
        password = pwd;
     }
}
class Pen{
    public char[] getTip;  
    public char[] getColor;
    public String setColor;
    // properties + functions
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
 
/*class Student{
    String name;
    int age;
    float percentage; //CGPA

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
    }
}*/

class Student{
    String name;
    int roll;

    Student(){
        //this.name = name;
        //System.out.println();
        System.out.println("constructor is called");
    }
}