public class Queue {
    int top = -1;
    int tail = -1;
    int arr[];
    Queue(int len)
    {
        arr = new int[len];
    }

    void enqueue(int item)
    {
        if (top == -1)
        {
            top++;
        }
        arr[++tail] = item;
    }

    int dequeue()
    {  
        if (top == arr.length)
        {
            return -1;
        }

        return arr[top++];
    }
}
