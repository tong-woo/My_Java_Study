/**
 * Dynamic Programming is a programming technique
 * used to solve recursive problems more efficiently.
 */

import java.beans.PropertyEditorSupport;
import java.util.Map;
import java.util.HashMap;


public class Memoizing_Fibonacci {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        System.out.println(Memoizing_Fibonacci(10, map));

        map = new HashMap<Integer, Integer>();
        System.out.println(Memoizing_Fibonacci(20, map));
    }

    public static int Memoizing_Fibonacci(int n, Map<Integer, Integer> map) {
        int result;
        if(n==0 || n==1){
            return n;
        }
        if(map.containsKey(n)){
            return map.get(n);
        } else {
            result = Memoizing_Fibonacci(n-1, map) + Memoizing_Fibonacci(n-2, map);
            map.put(n, result);
        }




        return result;
    }
}
