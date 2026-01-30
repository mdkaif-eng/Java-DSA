import java.util.*;
public class inputoutput{
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

     //if  we want to update (mark is wrong)then

     marks[1] = marks[1] +2;
     System.out.println("phy: " +marks[1]);

    }
}