
public class Memoizing_Knapsack {

    static int Knapsack(int weightCap, int[] weights, int[] values, int i)
    {
        int index, weight;
        int[][] matrix = new int[i + 1][weightCap + 1];
//wt = weights[], w=weight, i = index, val = values, W=weightCap
        for (index = 0; index <= i; index++) {
            for (weight = 0; weight <= weightCap; weight++) {
                // add code here
                if(index == 0 || weight == 0){
                    matrix[index][weight] = 0;
                } else if(weights[i-1] <= weight){
                    matrix[index][weight]
                            = Math.max(values[index - 1]
                                    + matrix[index - 1][weight - weights[index - 1]],
                            matrix[index - 1][weight]);
                    //matrix[index][weight] = Math.max(values[index-1] + matrix[index-1][weight-weights[index-1]], matrix[index-1][weight]);
                } else{
                    matrix[index][weight] = matrix[index-1][weight];
                }
            }
        }
        return matrix[i][weightCap];
    }


    public static void main(String[] args) {
        int[] values = new int[] { 70, 20, 39, 37, 7, 5, 10 };
        int[] weights = new int[] { 31, 10, 20, 19, 4, 3, 6 };
        int weightCap = 50;
        int i = values.length;
        Memoizing_Knapsack myNapsack = new Memoizing_Knapsack();
        System.out.println(myNapsack.Knapsack(weightCap, weights, values, i));
    }
}
