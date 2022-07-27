import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BubbleSortAscending {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[5];
        int i, temp, pass = 1;
        
        for (i = 0; i < numbers.length; i++) {
            System.out.print("Enter value for index["+i+"] here --> ");
            numbers[i] = Integer.parseInt(br.readLine());
        }
        
        while (pass < numbers.length) {
            for (i = 0; i < (numbers.length - pass); i++) {
                if (numbers[i] > numbers[i+1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp; 
                }
            }
            pass++;
        }
        
        System.out.println("\n\nThe numbers sorted Ascendingly: \n");
        for (int num: numbers) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }
    
}