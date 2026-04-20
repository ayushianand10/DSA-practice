import java.util.*;
public class JavaBasics {
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int calculateSum(int num1,int num2){ //parameters or formal parameters
        int sum = num1+num2;
    return sum;
}

    public static void swap(int a, int b){
        //swap
       int temp = a;
       a = b;
       b = temp;

       System.out.println("a = "+ a);
       System.out.println("b = "+ b);
    }

    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    }

    public static int factorial(int n){
        int f = 1;
        for(int i=1;i<n;i++){
            f = f*i;
        }
        return f; //factorial of n
    }

    public static int binCoeff(int n,int r){
        int coeff = factorial(n)/(factorial(r)*factorial(n-r));
        return coeff;
    }
    //function to calculate sum of two numbers
    //public static int sum(int a, int b){
       // return a+b;
   // }

    //func to calc sum of three numbers
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    //func to cal int sum
    public static int sum(int a, int b){
        return a+b;
    }

    //func to cal float sum
    public static float sum(float a, float b){
        return a+b;
    }
    //only for n>=2
    /*public static boolean isPrime(int n){
        //corner cases
        //2
        if(n==2){
            return true;
        }
        boolean isPrime = true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){//completely dividing
                isPrime = false;
                break;
            }
        }
        return isPrime;}*/

    //optimized code for prime number
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){ //true
                System.out.println(i + " ");
                }
        }
        System.out.println();
    }
    
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum>0){
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
    System.out.println("decimal of "+myNum+"="+decNum);
    }    
    public static void main(String args[]){
        /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b); //arguments or actual parameters
        System.out.println("sum is "+sum); */ 
       // printHelloWorld();//function call

       /* swap - values exchange
       int a = 5;
       int b = 10;
       swap(a,b);*/ 

       /*int a =3;
       int b =5;
      int pro = multiply(a,b);
      System.out.println("a*b = " + pro);*/

      //System.out.println(factorial(6));

      //System.out.println(binCoeff(5,2));

      //System.out.println(sum(1,3));
      //System.out.println(sum(2.32f,4.4f));

       //System.out.println(isPrime(29));

    //primesInRange(20);

    binToDec(101);
    }
}
