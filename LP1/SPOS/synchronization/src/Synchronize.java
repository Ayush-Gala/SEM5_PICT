import java.util.*;

public class Synchronize extends Thread{
    
    //forward referencing
    int chairs[];
    static int full = 0; //to keep track of full chairs 
    static int empty;   //to keep track of empty chairs

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

        empty = num;
    }

    public void assign(char c)
    {
        //getting the barber to cut hair and empty the chair
        if(c == 'B')
        {
            chairs[full--] = 0;
            empty++;
        }
        //getting the customer to sit in a chair
        else if(c == 'C')
        {
            chairs[full++] = 1;
            empty--;
        }
    }

    public void run(char c)
    {

    }


    public static void main(String[] args) throws Exception {
        //scanner class to take a new input from user
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Welcome to V&A Salon!");

        System.out.print("Enter the number of chairs in the salon: ");
        num = sc.nextInt();
        
        Synchronize obj = new Synchronize(num);
        System.out.print("Enter a string of Bs and Cs: ");
        String input = sc.nextLine();
        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i) == 'B')
            {

            }
            else if(input.charAt(i) == 'C')
            {
                
            }
        }
    }
}
