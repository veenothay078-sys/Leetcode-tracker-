// Last updated: 7/9/2026, 12:25:36 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows==0){
            return result;
        }
       

        if(numRows==1){
             List<Integer> first =new ArrayList<>();
        first.add(1);
        result.add(first);
            return result;
        }

            result=generate(numRows-1);
            List<Integer> prevRow = result.get(numRows-2);

            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            for(int j=1;j<numRows-1;j++){
                
                curRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            curRow.add(1);
            result.add(curRow);
       
        return result;
    }
}