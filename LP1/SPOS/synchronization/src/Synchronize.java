import java.util.*;

public class Synchronize {
    
    //forward referencing
    int chairs[];

    Synchronize(int num)
    {
        chairs = new int[num];
        //setting each value in the array to 0
        //empty --> 0
        //filled --> 1
        for(int i=0;i<num;i++)
        {
            chairs[i] = 0;
        }
    }

    public static void main(String[] args) throws Exception {
        //scanner class to take a new input from user
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Welcome to V&A Salon!");

        System.out.print("Enter the number of chairs in the salon: ");
        num = sc.nextInt();
        
        Synchronize obj = new Synchronize(num);
    }
}
