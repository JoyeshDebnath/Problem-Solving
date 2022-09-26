class Solution {
    
    HashMap<String,Integer> Memo=new HashMap<>();
    
    public int minimumTotal(List<List<Integer>> triangle) {
        return findMinPath(triangle,0,0);
    }
    
    public int findMinPath(List<List<Integer>> triangle,int i,int j){
    //base case 1 : 
        if(i>=triangle.size())
               return (Integer.MAX_VALUE-1);
        
   //base case 2 : 
        if(j<0 || j>=triangle.get(i).size())
                    return (Integer.MAX_VALUE-1);
  //base case 3 :#last ROW 
        if(i==triangle.size()-1)
                return triangle.get(i).get(j);
        if(Memo.containsKey(i+"#"+j))
               return Memo.get(i+"#"+j);
        
        int diagonalDownLeft=findMinPath(triangle,i+1,j);
        int diagonalDownRight=findMinPath(triangle,i+1,j+1);
        
        int temp=Math.min(diagonalDownLeft,diagonalDownRight)+triangle.get(i).get(j);
        Memo.put((i+"#"+j),temp);
        return temp;
    }//find the min path 
}