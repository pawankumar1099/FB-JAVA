import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr = new int [] {1,2,4,4,1};

        Arrays.sort(arr);

        String k = Arrays.toString(arr);

        System.out.println(k);

        Arrays.fill(arr,4);

        int[] copy = Arrays.copyOf(arr, 10);
        
        System.out.println(copy);
        
        for(int x:copy){
            System.out.println(x);
        }
        
    }
}
