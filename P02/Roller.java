import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

public class Roller{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int diceMax = 0;
        int diceRollAmount=0;
        int diceRoll= 0;
        
        int rollSum=0;
        int rollAverage=0;
        
        System.out.print("Please tell me the amount of dice you want to roll: ");
        diceRollAmount = scan.nextInt();
        int arr1[] = new int[diceRollAmount];
        
        System.out.print("Please tell me the number of faces for your di(c)e: ");
        diceMax = scan.nextInt();
        
        for(int i=0; i<diceRollAmount; i++){
            diceRoll = (int)(Math.random()*diceMax) +1;
            arr1[i]=diceRoll;
            rollSum += diceRoll;
            //rolls dice from [1,diceMax], then stores it into the array and adds it into the sum.
        }
        
        Arrays.sort(arr1);
        rollAverage = rollSum/diceRoll;
        
        for(int j=0; j<diceRollAmount; j++){
            System.out.print(arr1[j] + "    ");
        }
        System.out.println("\nSum of all rolls: "+rollSum);
        System.out.print("Avg of all rolls: "+rollAverage);
    }
}
