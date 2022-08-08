public class Chairs {
    
    //forward referencing
    int chairs[];
    static int full = 0; //to keep track of full chairs 
    static int empty;   //to keep track of empty chairs

    Chairs(int num)
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
}
