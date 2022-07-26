import java.util.*;

public class Process {
    
    Scanner sc = new Scanner(System.in);
    int priority;
    String name;
    int processtime;
    int arrivaltime;
    static int processnum = 1;

    //defualt constructor 
    Process()
    {
        System.out.print("\nEnter the name for process no. "+ processnum+": ");
        name = sc.nextLine();
        System.out.print("Enter the processing time for "+ name + ": ");
        processtime = sc.nextInt();
        System.out.print("Enter the priority of "+ name + ": ");
        priority= sc.nextInt();
        arrivaltime = processnum;
        processnum++;
        System.out.println("Process added to list!");
    }

    //function that describes the task
    public void describe()
    {
        System.out.println("\nProcess name is: "+name);
        System.out.println("Processing time required: "+processtime);
        System.out.println("Process priority is: "+priority);
    }
}
