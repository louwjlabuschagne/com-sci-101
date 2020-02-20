import java.util.Arrays;

public class L2ArrayOutOfBounds {
    public static void main(String[] args) {
        String[] arr = new String[10];
        arr[10] = "eggplant";
        System.out.println(Arrays.toString(arr)); 
    }
}