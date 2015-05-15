import java.util.Arrays;

public class Matrix {
    
    private int[][] twoDIntArray;
    
    public Matrix(int col, int row) {
        this.twoDIntArray = new int[col][row];
        
        for (int colCount = 0; colCount < twoDIntArray[0].length; colCount++) {
            for (int rowCount = 0; rowCount < twoDIntArray.length; rowCount++) {
                twoDIntArray[colCount][rowCount] = 1;
            }
        }
    }
    
    public int[][] getMatrix() {
        return twoDIntArray;
    }
    
    public void setElement(int col, int row, int modify) {
        if (col > twoDIntArray[0].length-1) {
            return;
        }
        if (row > twoDIntArray.length-1) {
            return;
        }
        else {
            twoDIntArray[col][row] = modify;
        }
    }
    
    public void setRow(int row, String num) {
        if (row > twoDIntArray[0].length-1) {
            return;
        }
            
        String[] tokens = num.split(",");
        
        
        if (tokens.length > twoDIntArray.length) {
            return;
        }
        
        else {
            for (int count = 0; count < twoDIntArray[0].length; count++) {
                twoDIntArray[row][count] = Integer.parseInt(tokens[count]);
            }
        }
    }
    
    public void setColumn(int col, String numbers) {
        
        if (col > twoDIntArray.length-1) {
            return;
        }
            
        String[] tokens = numbers.split(",");
        
        
        if (tokens.length > twoDIntArray[0].length) {
            return;
        }
    
        else {
            for (int count = 0; count < twoDIntArray.length; count++) {
                twoDIntArray[count][col] = Integer.parseInt(tokens[count]);
            }
        }
    }
    
    public String toString() {
        
        String userString = Arrays.deepToString(this.getMatrix());
        
        return userString;
    }
    
    public void prettyPrint() {
        for (int colCount = 0; colCount < twoDIntArray[0].length; colCount++) {
            System.out.println();
            for (int rowCount = 0; rowCount < twoDIntArray.length; rowCount++) {
                System.out.print(twoDIntArray[colCount][rowCount] + "\t");
            }
        }
    }

        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
