/**
 * creating a populated 2D array
 * accessing an element in a 2D array
 * updating a 2D array
 * creating an empty 2D array
 * traversing a 2D array
 */

public class Array_2D {
    public static void main(String[] args){
        // 2D int array
        int[][] nums = {{10, 9, 8}, {7, 6, 5}, {4, 3, 2}};
        System.out.println(nums[0][1]); // Prints: 9
        // This will create an int array with 2 arrays containing 3 elements each:
        int[][] intArray = new int[2][3];
        //Traverse an 2D array--Row-Major order
        char[][] letters = {{'A', 'a'}, {'B', 'b'}, {'C', 'c'}};
        for (int i = 0; i < letters.length; i++){
            for (int j = 0; j < letters[i].length; j++){
                System.out.print(letters[i][j]);
            }
        }
        //TRaverse an 2D array using column major order
        char[][] letters2 = {{'A', 'a'}, {'B', 'b'}, {'C', 'c'}};
        for (int i = 0; i < letters2[0].length; i++){
            for (int j = 0; j < letters2.length; j++){
                System.out.print(letters2[j][i]);
            }
        }
    }


}
