import java.util.*;

public class Scheduler {

    //members of the class
    Process arr[];

    //default constructor of the class
    Scheduler(int count){
        arr = new Process[count];
    }

    //function for implementing a FCFS scheduling algorithm 
    void FCFS ()
    {
        System.out.println("\nImplementing FCFS: \n\nSCHEDULING ORDER IS AS FOLLOWS: ");
        float waitime = 0;
        for (int i = 0; i < arr.length; i++)
        {    int num;

            arr[i].describe();
            System.out.println("Waited for: "+ waitime+" cycles");
            waitime += arr[i].processtime;
        }
        System.out.println("\nAvg wait time: "+ waitime/arr.length);
    }


    //function for implementing a SJF algorithm
    void SJF()
    {
        //write code here
    }

    void PBS()
    {
        //write code here
    }

    void RR()
    {
        //write code here
    }
    public static void main(String[] args) throws Exception {

        // accepting all the processes from the user as input
        System.out.print("Enter the number of tasks you want to schedule: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //creating object for scheduler class
        Scheduler obj = new Scheduler(num);

        //creating an object for each reference in the array
        for (int i = 0; i < num; i++) {
            obj.arr[i] = new Process();
        }

        //implementing a menu driven program
        int choice = 1;
        while (choice != 0) {

            // asking the user which Scheduling technique they want to follow
            System.out.println("\n********** MENU ***********\n\n1. First Come First Serve\n2. Shortest Job First\n3. Priority Based Scheduling\n4. Round Robin\n0. Exit Program");
            System.out.print("Enter the scheduling method you want to perform: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.FCFS();
                    break;

                case 2:
                    obj.SJF();
                    break;

                case 3:
                    //obj.PBS();
                    break;

                case 4:
                    //obj.RR();
                    break;

                default:

                    break;
            }
        }

        System.out.println("Thank you!");
    }
}
