//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int grid[][] = new int[9][9];
            for(int i = 0; i < 9; i++)
            {
                for(int j = 0; j < 9; j++)
                grid[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            if(ob.SolveSudoku(grid) == true)
                ob.printGrid(grid);
            else
                System.out.print("NO solution exists");
            System.out.println();
            
        }
    }
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
         return SolveSudokuUtil(grid,0,0);
    }
    
    static boolean SolveSudokuUtil(int Board[][],int i,int j){
           int nextI=0;
           int nextJ=0;

           //case 1 
           if(i==Board.length)
           	   return true;
           //case 2 : reached last col
           if(j==(Board[i].length-1)){
           	nextI=i+1;
           	nextJ=0;
           }

           //case 3 :not the last column 

           if(j<Board.length-1){
           	nextI=i;
           	nextJ=j+1;
           }

           if(Board[i][j]!=0)
           	  return SolveSudokuUtil(Board,nextI,nextJ);

           if(Board[i][j]==0){
             
             for(int possibleVal=1;possibleVal<=9;possibleVal++){
             	  if(isValid(Board,i,j,possibleVal)){
             	  	   Board[i][j]=possibleVal;
             	  	   if(SolveSudokuUtil(Board,nextI,nextJ)==true)
             	  	   	     return true;
             	  	   	//backtrack
             	  	   Board[i][j]=0;
             	  }//isValid?

             }//1--9
           }//place a val between 1 -->> 9

           return false;
       }//solve soduku
    
    public static boolean isValid(int Board[][],int row,int col,int val){
       	//check col
         for(int j=0;j<9;j++){
         	if(Board[row][j]==val)
         		return false;
         }
       	//check row 
         for(int i=0;i<9;i++){
         	if(Board[i][col]==val)
         		     return false;
         }
       	//check submatrix 
         int SubMatI=(row/3)*3;
         int SubMatJ=(col/3)*3;

         for(int i=0;i<3;i++){
         	for(int j=0;j<3;j++){
         		if(Board[SubMatI+i][SubMatJ+j]==val)
         			return false;
         	}
         }

         return true;
       }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        
     for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            System.out.print(grid[i][j]+" ");
        }
    }   
    }
}