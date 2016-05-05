

package Problems;

public class Problem6 {

//    Problem 6: Sum square difference
//    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
    private final int N = 100;
    public Problem6(){
        int a = (N*(N+1)/2)*(N*(N+1)/2), b=(N*(N+1)*(2*N+1)/6);
        System.out.println(a>b?a-b:b-a);
    }
}
