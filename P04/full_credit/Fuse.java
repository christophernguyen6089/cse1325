public class Fuse{
    private int time;
    public void Fuse(int time){
        this.time = time; 
    }
    public boolean burn(){
        this.time--;
        if(this.time!=0){
            return true;
        }
        else{
            return false;
        }
    }
    
   @Override
    public String toString(){
        String str1 = "";
        System.out.print("    ");
        for(int i=0; i<time; i++){
            System.out.print("-");
        }
        System.out.println("*\n  _/__\n /    \\ \n!      !\n \\____/");
        return str1;
    }
}
