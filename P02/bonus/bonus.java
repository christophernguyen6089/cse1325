public class bonus{
    public static void main(String args[]){
        Die d20 = new Die();
        d20.Die(20);
        System.out.println("D20: "+d20.roll());
        Die d12 = new Die();
        d12.Die(12);
        System.out.println("D12: "+d12.roll());
        Die d8 = new Die();
        d8.Die(8);
        System.out.println("D08: "+d8.roll());
        Die d6 = new Die();
        d6.Die(6);
        System.out.println("D06: "+d6.roll());
        Die d4 = new Die();
        d4.Die(4);
        System.out.println("D04: "+d4.roll());
    }
}
