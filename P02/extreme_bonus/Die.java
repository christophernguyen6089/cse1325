import java.lang.Math;
import java.util.Arrays;

public class Die{
    private int faces=0;

    //The Character creation method when using six sided die is a bit more advanced than using a 20 sided dice:
    //1: Roll 4 six sided dice
    //2: Subtract the lowest dice roll from the total
    public int rollAmount=4;
    private int rollSum=0;
    private int rollArray[] = new int[rollAmount];
    
    public void setFaces (int newFaces){
        faces = newFaces;
    }
    public int getFaces(){
        return faces;
    }
    public int roll(){
        return (int)(Math.random()*faces)+1;
    }
    

    public int AdvancedRoll(){
        rollSum=0;
        for(int i=0; i<rollAmount; i++){
            rollArray[i]=roll();
            rollSum += rollArray[i];
        }
        //Roll a six sided dice 4 times
    
        Arrays.sort(rollArray);
        //find out the lowest dice roll
        rollSum-=rollArray[0];
        //subtract the lowest dice roll
    
        return rollSum;
    }
}
