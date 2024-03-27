import java.util.ArrayList;
import java.util.List;

public class MaxCandies {
    public static void main(String[] args) {
        int candies[]={2,3,4,5,1,6};
        int extraCandies=1;
        List<Boolean> ans=kidsWithCandies(candies,extraCandies);
        System.out.println(ans);
    }
        public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int max=0;
            for(int candy:candies){
                max=Math.max(max,candy);
            }
            List<Boolean> result=new ArrayList<>();
            for(int candy:candies){
                result.add(max<=candy+extraCandies);
            }
            return result;
        }
    }

