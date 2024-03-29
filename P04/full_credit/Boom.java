import java.util.Scanner;

public class Boom{
    public static int cli(){
        Scanner scan = new Scanner (System.in);
        Puzzle puzzle = new Puzzle();
        Fuse fuse = new Fuse();
        char charGuess;
        String solutionGuess;
        
        System.out.println("\n<Boom!>\n");
        fuse.Fuse(8);
        
        puzzle.Puzzle("garbage collection");
        
        System.out.println("Enter lowercase letters to guess,\n! to propose a solution,\n0 to exit.");
        while(true){
            charGuess = scan.nextLine().charAt(0);
            if(charGuess=='0'){
                System.out.println("Exiting...");
                System.exit(0);
            }
            if(charGuess=='!'){
                System.out.print("What is the phrase? ");
                solutionGuess = scan.nextLine();
                if(puzzle.solve(solutionGuess)==true){
                    System.out.println("Congrats! "+puzzle.getSolution()+" is the phrase!");
                    System.exit(2);
                }
                else{
                    System.out.println("Wrong...");
                    while(true){
                        fuse.burn();
                        if(fuse.burn()==false){
                            System.out.println("Game over...");
                            System.exit(1);
                        }
                    }
                }
                continue;
            }
            if(puzzle.guess(charGuess)==true){
                System.out.println("Correct, "+charGuess+" is in the phrase.");
            }
            else{
                System.out.println("Wrong, "+charGuess+" is not in the phrase.");
                if(fuse.burn()==false){
                    System.out.println("Game over...");
                    System.exit(1);
                }
            }
            
            fuse.toString();
            puzzle.toString();
            System.out.print("Guess a letter: ");
        }
    }
    
    public static void main(String args[]){
        cli();
    }
}
