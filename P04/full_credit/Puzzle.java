public class Puzzle{
    private String solution;
    private boolean[] guesses;
    
    public void Puzzle(String solution){
        this.solution = solution;
        for(int h=0; h<solution.length(); h++){
            this.guesses[h]=false;
        }
    }
    public boolean guess(char c){
        boolean flag=false;
        if(this.solution.indexOf(c)!=-1){
            flag=true;
            for(int i=0; i<solution.length(); i++){
                if(c==solution.indexOf(i)){
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
                System.out.print(solution.charAt(j));
            }
            else{
                System.out.print("_");
            }
        }
        return str2;
    }
    
}
