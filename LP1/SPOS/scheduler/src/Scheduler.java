import java.util.*;

public class Scheduler {

    //members of the class
    Process arr[];

    //default constructor of the class
    Scheduler(int count){
        arr = new Process[count];
    }

    //function for implementing a FCFS scheduling algorithm 
    //non-pre emptive
    void FCFS ()
    {
        System.out.println("\nImplementing FCFS: \n\nSCHEDULING ORDER IS AS FOLLOWS: ");
        float waitime = 0;
        float avg = 0;
        for (int i = 0; i < arr.length; i++)
        {
            arr[i].describe();
            System.out.println("Waited for: "+ waitime+" cycles");
            waitime += arr[i].processtime;
            avg += waitime;
        }
        System.out.println("\nAvg wait time: "+ avg/arr.length);
    }


    //function for implementing a SJF algorithm
    //assuming that arrival time of all processes is the same
    void SJF()
    {
        System.out.println("\nImplementing SJF: \n\nSCHEDULING ORDER IS AS FOLLOWS: ");
        float waitime = 0;
        float avg = 0;
        
        Process copy[] = new Process[arr.length];
        System.arraycopy(arr, 0, copy, 0, arr.length);

        //sorting the list by waitime
        for (int i = 0; i < arr.length; i++)
        {
            int shortest = i;
            Process temp;
            //finding next highest priority
            for(int j=i; j<arr.length; j++)
            {
                if(arr[j].processtime < arr[shortest].processtime)
                {
                    shortest = j;
                }
            }

            temp = copy[i];
            copy[i] = copy[shortest];
            copy[shortest] = temp;
        }

        for (int i = 0; i < arr.length; i++)
        {
            copy[i].describe();
            System.out.println("Waited for: "+ waitime+" cycles");
            waitime += copy[i].processtime;
            avg += waitime;
        }

        System.out.println("\nAvg wait time: "+ avg/arr.length);


    }

    void PBS()
    {
        System.out.println("\nImplementing PBS: \n\nSCHEDULING ORDER IS AS FOLLOWS: ");
        float waitime = 0;
        float avg = 0;
        Process copy[] = new Process[arr.length];
        System.arraycopy(arr, 0, copy, 0, arr.length);

        //sorting the list by priority
        for (int i = 0; i < arr.length; i++)
        {
            int highest = i;
            Process temp;
            //finding next highest priority
            for(int j=i; j<arr.length; j++)
            {
                if(arr[j].priority > arr[highest].priority)
                {
                    highest = j;
                }
            }

            temp = copy[i];
            copy[i] = copy[highest];
            copy[highest] = temp;
        }

        for (int i = 0; i < arr.length; i++)
        {
            copy[i].describe();
            System.out.println("Waited for: "+ waitime+" cycles");
            waitime += copy[i].processtime;
            avg += waitime;
        }

        System.out.println("\nAvg wait time: "+ avg/arr.length);
        
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
                //call for FCFS algorithm
                case 1:
                    obj.FCFS();
                    break;
                
                //call for SJF algorithm
                case 2:
                    obj.SJF();
                    break;

                //call for PBS algorithm
                case 3:
                    obj.PBS();
                    break;

                //call for RR algorithm
                case 4:
                    obj.RR();
                    break;

                default:    
                    break;
            }
        }

        System.out.println("\nThank you!");
    }
}
