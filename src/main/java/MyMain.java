import java.util.Arrays;

public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        if (board[row][col] == true) {
            return true;
        }
        else {
            return false;
        }
    }


    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
        if (direction.equals("right")) {
            // Sets the top-left location
            board[row][col] = true;
            // Change to true for two locations to the right of the initial one
            for (int i = 1; i < boatLength; i++) {
                board[row][col + (i)] = true;
            }
        }
        else if (direction.equals("down")) {
            board[row][col] = true;
            // Change to true for the two locations below
            for (int j = 1; j < boatLength; j++) {
                board[row + (j)][col] = true;
            }
        }
        
        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) { 
        boolean checker = false;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[0].length - 1; j++) {
                // Convert the elements in 2d array to strings in order
                // to check thier first letter
                String word1 = words[i][j];
                String word2 = words[i][j + 1];
                // Use charAt to check the first letter of each word
                char first_letter = word1.charAt(0);
                char second_letter = word2.charAt(0);
                if (first_letter > second_letter || word1.length() > word2.length()) {
                    checker = false;
                }
                else {
                    checker = true;
                }
            }
        }
        return checker;    
    }        

    public static void main(String[] args) {
        // You can test your code here
    }
}
