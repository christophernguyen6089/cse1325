import java.lang.Math;
import java.util.Scanner;

public class Die{
    private int faces=0;
    
    public void Die(int newFaces){
        faces = newFaces;
    }
    public int getFaces(){
        return faces;
    }
    public int roll(){
        return (int)(Math.random()*faces) +1;
    }
}
