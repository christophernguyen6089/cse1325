import java.lang.Math;
import java.util.Scanner;

public class Die{
    private int faces=0;
    //It kind of makes me curious and confused as to why there is a class named "Die" and a function called "Die" in the UML?
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
