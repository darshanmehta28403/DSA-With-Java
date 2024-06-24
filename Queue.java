import java.util.Scanner;

public class Queue {
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
                    if (rear == queue.length - 1) {
                        System.out.println("Queue Overflow");
                    } else {
                        System.out.println("Enter element to enter: ");
                        int el = sc.nextInt();
                        rear += 1;
                        queue[rear] = el;
                        System.out.println("rear: "+rear);
                        if (front == -1) {
                            front = 0;
                        }
                    }
                    break;

                case 2:
                    if (front == -1) {
                        System.out.println("Queue Underflow");
                    } else {
                        int el = queue[front];
                        System.out.println("Element Deleted: "+queue[front]);
                        front++;
                        if (front == rear) {
                            front = rear = -1;
                        }
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
