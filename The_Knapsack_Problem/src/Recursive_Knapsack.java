/**
 *
 * While this recursive solution works, it has a big O runtime of O(2^n).
 * In the worst case, each step would require us to evaluate two subproblems,
 * sometimes repeatedly, as there’s overlap between subproblems. We can drastically
 * improve on this runtime by using dynamic programming.
 */


public class Recursive_Knapsack {
    static int knapSack (int weightCap, int weights[], int values[], int i)
    {
        if (i == 0 || weightCap == 0) {
            return 0;
        }

        else if (weights[i - 1] > weightCap) {
            return knapSack(weightCap, weights, values, i - 1);

        } else {
            return Math.max(
                    values[i - 1] + knapSack(weightCap - weights[i - 1], weights, values, i - 1),
                    knapSack(weightCap, weights, values, i - 1));
        }
    }
}
