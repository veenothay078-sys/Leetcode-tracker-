// Last updated: 7/9/2026, 11:59:43 AM
class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        // records at what level word was visited
        Map<String, Integer> costs = new HashMap<>();
        // records all parents (with same distance from source)
        Map<String, List<String>> parents = new HashMap<>();
        Queue<String> queue = new LinkedList<>();
        // all words
        Set<String> wordSet = new HashSet<>(wordList);
        wordSet.add(beginWord);

        queue.offer(beginWord);
        int lvl = 0;
        int m = beginWord.length();

        // initialize cost and parents for begin word
        costs.put(beginWord, 1);
        parents.put(beginWord, new ArrayList<>());

        while (!queue.isEmpty()){
            int sz = queue.size();
            lvl++;
            for (int i = 0; i<sz; i++){
                String cur = queue.poll();
                
                // end word is found so stop bfs 
                if (cur.equals(endWord)){
                    break;
                }

                // construct all possible neighbors
                for (int k = 0; k<m; k++){
                char[] temp = cur.toCharArray();
                // go through all possible letters
                    for(char ch = 97; ch <= 123; ch++){
                        temp[k] = ch;
                        String tempStr = String.valueOf(temp);
                        // skip if word not valid
                        if (!wordSet.contains(tempStr) || tempStr.equals(cur)){
                            continue;
                        }
                        // add to queue if neighbor unvisited
                        if (!costs.containsKey(tempStr)){
                            queue.offer(tempStr);
                            costs.put(tempStr, lvl + 1);
                            List<String> parentList = new ArrayList<>();
                             
                            parentList.add(cur);
                            parents.put(tempStr, parentList);
                        }
                        // update parents if another shortest seq found between source and this neighbor
                        else if (costs.get(tempStr) == lvl + 1){
                            parents.get(tempStr).add(cur);
                        }
                    }
                }
            }
        }

        List<List<String>> res = new ArrayList<>();
        // no sequence found till end word
        if (!costs.containsKey(endWord)){
            return res;
        }

        //get all paths
        getPaths(parents, endWord, beginWord, new ArrayList<>(), res);
           
        return res;
    }

    public void getPaths(Map<String, List<String>> parents, String cur, String src, List<String> path, List<List<String>> res){
// stop when beginWord is reached
        if (cur.equals(src)){
            path.add(cur);
// reverse the list to get order from source to end
            Collections.reverse(path);
// add path to the result
            res.add(path);
            return;
        }
// forking more paths because of multiple parents for the cur
        if (parents.get(cur).size() > 1){
            for (String parent : parents.get(cur)){
                List<String> newPath = new ArrayList<>(path);
                newPath.add(cur);
                getPaths(parents, parent, src, newPath, res);
            }
            return;
        }

// continue along this path
        path.add(cur);
        getPaths(parents, parents.get(cur).get(0), src, path, res);
    }
}