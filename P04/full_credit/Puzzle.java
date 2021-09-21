public class Puzzle{
    private String solution;
    private boolean[] guesses;
    
    public void Puzzle(String solution){
        this.solution = solution;
        this.guesses = new boolean[solution.length()];
        for(int h=0; h<solution.length(); h++){
            this.guesses[h]=false;
        }
    }
    public boolean guess(char c){
        boolean flag=false;
        if(this.solution.indexOf(c)!=-1){
            flag=true;
            for(int i=0; i<solution.length(); i++){
                if(solution.indexOf(c,i)==i){
                    guesses[i]=true;
                }
            }
        }
        return flag;
    }
    public boolean solve(String proposedSolution){
        if(proposedSolution.equals(this.solution)){
            return true;
        }
        else{
            return false;
        }
    }
    public String getSolution(){
        return solution;
    }
    @Override
    public String toString(){
        String str2 = "";
        for(int j=0; j<solution.length(); j++){
            if(this.guesses[j]==true){
            //Note to self: please check up on this when I go home
                System.out.print(this.solution.charAt(j));
            }
            else if(solution.indexOf(' ',j)==j){
                System.out.print(" ");
            }
            else{
                System.out.print("_");
            }
        }
        System.out.println("");
        return str2;
    }
    
}
