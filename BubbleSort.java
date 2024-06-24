public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = new int[6];
        arr[0] = 12;
        arr[1] = 22;
        arr[2] = 84;
        arr[3] = 3;
        arr[4] = 1;
        arr[5] = 2;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    int temp = arr[i];    
                    arr[i] = arr[j];    
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Output: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
