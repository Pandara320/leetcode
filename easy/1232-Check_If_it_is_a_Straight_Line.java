class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int x2 = coordinates[1][0];
        int y1 = coordinates[0][1];
        int y2 = coordinates[1][1];
        // because 2 <= coordiantes.length <= 1000. loop start from 2
        for(int i = 2 ; i < coordinates.length; i++){
            int x3 = coordinates[i][0];
            int y3 = coordinates[i][1];
            if((x2-x1) * (y3-y1) == (x3 - x1) * (y2 - y1)){
                return true;
            }
        }
        return true;
        
               
    }
}
