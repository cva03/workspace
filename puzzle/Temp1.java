package puzzle;

import java.util.Arrays;

public class Temp1 {
    public static void main(String[] args) {
        int[][] lamps={
                {0,0},
                {0,4}
        };
        int[][] queries={
                {0,1},
                {0,4},
                {1,4}
        };
        int n=5;
        int[] ans= illumination(n,lamps,queries);
        System.out.println(Arrays.toString(ans));
    }
        public static int[] illumination(int n, int[][] lamps, int[][] queries) {

            boolean[] off = new boolean[lamps.length];
            int[] ans = new int[queries.length];

            for(int i=0; i<queries.length; i++){
                int[] q= queries[i];

                if(isOn(q[0], q[1], lamps, off)){
                    ans[i] = 1;
                    turnOff(q[0], q[1], lamps, off);
                }else{
                    ans[i] = 0;
                }

            }

            return ans;

        }

        private static boolean isOn(int x, int y, int[][] lamps, boolean[] offLamps ){

            for(int i=0; i<lamps.length; i++){
                if(offLamps[i]) {
                    continue;
                }
                if(x == lamps[i][0] || y == lamps[i][1] ){
                    return true;
                }
                if(x+y == lamps[i][0] + lamps[i][1]){
                    return true;
                }
            }

            return false;

        }

        private static void turnOff(int y, int x, int[][] lamps, boolean[] off){
            for(int i=0; i<lamps.length; i++){
                if(off[i]) continue;

                if((lamps[i][0] >= y-1 && lamps[i][0] <= y+1) && (lamps[i][1] >= x-1 && lamps[i][1] <= x+1)){
                    off[i] = true;
                    continue;
                }
            }
        }
}
