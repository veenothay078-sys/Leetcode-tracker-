// Last updated: 7/9/2026, 12:26:45 PM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),result);
        return result;
    }
    static void backtrack(int index,int nums[],List<Integer> cur_arr,List<List<Integer>> result)    { 
        if(index==nums.length){
        if(!result.contains(new ArrayList<>(cur_arr)))  
          result.add(new ArrayList<>(cur_arr));
          return;
        }
      
      cur_arr.add(nums[index]); 
      backtrack(index+1,nums,cur_arr,result);
      
      cur_arr.remove(cur_arr.size()-1); 
      backtrack(index+1,nums,cur_arr,result);
    }
    
}