

package Problems;

public class Problem7 {

//    Problem 7: 10001st prime
    
    public Problem7(){
        int i =10001, j=1;
        while (i>=0){
            if(isPrime(j)){
                i--;
            }
            j++;
        }
        System.out.println(j-1);
    }
    
     private boolean isPrime(int j) {
        for(int i=2; i<j/2+1; i++){
            if(j%i==0) return false;
        }
        return true;
    }
}
