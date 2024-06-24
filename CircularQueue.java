import java.util.Scanner;

public class CircularQueue {
    public static void main(String[] args) {
        int queue[] = new int[5];
        int front = -1;
        int rear = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Operation No.: \n 1) Enqueue \n 2) Dequeue \n 3) Display \n 4) Exit ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    if(rear == queue.length-1){
                        rear = 0;
                        if(rear == front){
                            System.out.println("Queue Overflow");
                        }
                        else{
                            System.out.println("Enter Element: ");
                            int el = sc.nextInt();
                            rear++;
                            queue[rear] = el;
                            if(front == -1){
                                front = 0;
                            }
                        }
                    }
                    else{
                        System.out.println("Enter Element: ");
                        int el = sc.nextInt();
                        rear +=1;
                        queue[rear] = el;
                        if(front == -1){
                            front = 0;
                        }
                    }
                    break;

                case 2:
                    if(rear == -1){
                        System.out.println("Queue Underflow");
                    }
                    else if(front == rear){
                        System.out.println("Deleted element: "+queue[front]);
                        front = rear = -1;
                    }
                    else{
                        System.out.println("Deleted element: "+queue[front]);
                        front += 1;
                    }
                    break;

                case 3:
                    if (rear == -1) {
                        System.out.println("Queue Underflow");
                    } else {
                        for (int i = front; i <= rear; i++) {
                            System.out.print(queue[i] + " ");
                        }
                    }
                    break;

                case 4:
                    System.exit(n);
                default:
                    break;
            }
        }
    }
}
