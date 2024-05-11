package EasyProblemSolutions.RelativeRanks;

public class Solution {
    public static void main(String[] args) {
        int [] s = {5,4,3,2,1};
        findRelativeRanks(s);
    }
    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String [] result =new String[n];

        // Step 1: Find the maximum score
        int maxScore = Integer.MIN_VALUE;
        for(int s : score){
            maxScore=Math.max(maxScore ,s);
        }
        // Step 2: Assign ranks
        for(int i = 0 ; i < n ; i++){
            if(score[i]==maxScore){
                result[i] = "Gold Medal";
            }
            else {
                int rank = 1;
                for (int j = 0 ; j<n; j++){
                    if (score[j]> score[i]){
                        rank++;
                    }
                }
                if (rank == 2) {
                    result[i] = "Silver Medal";
                } else if (rank == 3) {
                    result[i] = "Bronze Medal";
                } else {
                    result[i] = String.valueOf(rank);
                }
            }
        }

        return result;
    }
}
