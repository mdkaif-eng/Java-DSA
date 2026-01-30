
 import java.util.*;

public class Question1{
    public static void main(String[]args){
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        // int maths
        // maths = sc.nextInt();
    
     marks[0] = sc.nextInt();  //maths
     marks[1] = sc.nextInt();  //phy
     marks[2] = sc.nextInt();  //chem
    
     System.out.println("maths: " +marks[0]);  //maths
     System.out.println("phy: " +marks[1]);  //phy
     System.out.println("chem: " +marks[2]);  //chem

     int percentage = (marks[0] + marks[1] + marks[2]) / 3;
     System.out.println("Percentage = " +percentage + "%");
    }
}