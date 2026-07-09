// Last updated: 7/9/2026, 12:28:13 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(nums,new ArrayList<>(),result);
        return result;
    }
    static void backtrack(int arr[],List<Integer> cur_arr,List<List<Integer>> result){
     if(cur_arr.size()==arr.length){
       result.add(new ArrayList<>(cur_arr));
       return;
     }
     for(int n : arr){
       if(cur_arr.contains(n))
       continue;
       cur_arr.add(n);
       backtrack(arr,cur_arr,result);
       cur_arr.remove(cur_arr.size()-1);
       
     }
   }
}