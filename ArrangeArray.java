import java.util.Arrays;

public class ArrangeArray {
    public static void main(String[] args) {
        int[] array1 = {10,5,4,7,6,2,3,1,9,8};
        int[] newArray = new int[10];
        Arrays.sort(array1);
        for(int i=9; i>=0; i++){
            for(int j=0; j<10; j++){
                if(i%2==0){
                    newArray[j] = array1[i];
                }
            }
        }
    }    
}
