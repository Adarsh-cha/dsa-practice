class Solution {
    public ArrayList<Integer> find3Numbers(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> answer = new ArrayList<>();
        
        int first = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        int prevFirst = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] <= first) {
                first = arr[i];
            }
            else if (arr[i] <= sec) {
                sec = arr[i];
                prevFirst = first;
            }
            else {
                answer.add(prevFirst);
                answer.add(sec);
                answer.add(arr[i]);
                return answer;
            }
        }
        
        return answer;
    }
}