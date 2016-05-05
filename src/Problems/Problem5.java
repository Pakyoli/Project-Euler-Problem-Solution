

package Problems;

public class Problem5 {

//    Problem 5: Smallest multiple
//    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    
    public Problem5(){
        int n=1;
        boolean found = true;
        while (n>0){
            for(int i=1;i<=20;i++){
                if(n%i!=0){
                    found = false;
                    n++;
                    break;
                }
            }
            if(found == true)break;
            else found = true;
        }
        System.out.println(n);
    }
    
}
