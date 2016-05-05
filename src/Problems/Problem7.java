

package Problems;

public class Problem7 {

//    Problem 7: 10001st prime
    
    public Problem7(int n){
        int i =1;
        while (n>=0){
            if(isPrime(i)){
                n--;
            }
            i++;
        }
        System.out.println(i-1);
    }
    
     private boolean isPrime(int j) {
        for(int i=2; i<=Math.sqrt(j); i++){
            if(j%i==0) return false;
        }
        return true;
    }
}
