import java.util.ArrayList;
import java.text.NumberFormat;
import java.lang.*;

// Committed to the Public Domain by Prof Rice
// You MAY adopt and modify this code without attribution

public class Primes {
    ArrayList<Integer> primes = new ArrayList<Integer>();
    public Primes(int numThreads) {
    }
    public Primes findPrimes(int lower, int upper) {
        for(int i=lower; i<upper; i++){
            if(isPrime(i)==true){
                primes.add(i);    
            }
        }
        return this;    
    }
    protected boolean isPrime(int number){
        boolean flag = true;
        for(int i=1; i<Math.sqrt(number); i++){
            if(number%i==0){
                flag = false;
            }
        }
        return flag;
    }
    public int numberOfPrimes() {
        return primes.size();
    }
    public Integer[] toArray() {
        Integer[] primesArray = new Integer[primes.size()];
        for(int i=0; i<primes.size(); i++){
            primesArray[i]=primes.get(i);
        }
        return primesArray;
    }
    
    public static void main(String[] args) {
        int numThreads = 1;
        int lower = 0;
        int upper = 10000000; // defaults
        if(args.length > 0) numThreads = Integer.parseInt(args[0]);
        if(args.length > 1) lower = Integer.parseInt(args[1]);
        if(args.length > 2) upper = Integer.parseInt(args[2]);
        if(args.length > 3) {
            System.err.println("usage: java Primes [lower upper]");
            System.exit(-args.length);
        }
        
        Primes primes = new Primes(numThreads); // Search using one thread
        int sumOfPrimes = 0;
        for(int prime : primes.findPrimes(lower, upper).toArray())
            sumOfPrimes += prime;
        System.out.println("Sum of the " + primes.numberOfPrimes() + " primes between " + lower + " and " + upper + " is " + NumberFormat.getIntegerInstance().format(sumOfPrimes));
    }
}

