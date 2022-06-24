// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int level = Integer.parseInt(a[0]);
            int pos = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            if(ob.profession(level, pos) == 'd')
                System.out.println("Doctor");
            else
                System.out.println("Engineer");
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static char profession(int level, int pos){
       
         char prof=findProfession(level,pos);
         return prof;
       
    }
    
    static char findProfession(int level,int pos)
    {
        if(level==1 || pos==1)
        {
            return 'e';
        }//at level 1 it is engineer 
        
        // if the parent is doctor then if the pos is odd then engineer else doctor 
        if(findProfession(level-1,(pos+1)/2)=='d')//check the parent is doctior ? 
        {
            return  (pos%2==0)?'e':'d';
        }
        //elseif the parent is engineer 
         return (pos%2==0)?'d':'e';
         
    }//find profession ...
}