

package Problems;

import java.math.BigInteger;

public class Problem3 {

    private final double n = 600851475143.0;
    public Problem3() {
        int x = (int)Math.sqrt(n);

        while(x>0){
            if(n%x==0){
                if(isPrime(x)){
                    System.out.println(x);
                }
            }
            x--;
        }
//        BigInteger i = n, z = BigInteger.ZERO;
//        while(i.compareTo(z)>0){
//            if(n.mod(i).equals(BigInteger.ZERO)){
////                if(isPrime(i)){
////                    System.out.println(i.toString());
////                }
//            }
//            i.subtract(BigInteger.ONE);
//        }
//        
//        System.out.println(i.toString());
//    }
//
//    private boolean isPrime(BigInteger i) {
//        
//        BigInteger j;
//        j =  new BigInteger("2");
//        while(j.compareTo(i)<0){
//            if(i.mod(j).equals(BigInteger.ZERO)){
//                return false;
//            }
//            j.add(BigInteger.ONE);
//        }
//        return true;
    }

    private boolean isPrime(int x) {
        double i = 2;
        while (i<x){
            if(x%i==0)return false;
            i++;
        }
        return true;
    }

   

}
