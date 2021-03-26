class Solution:
    def minTimeToVisitAllPoints(self, points: List[List[int]]) -> int:
        result = 0
        for i in range(len(points)-1):
            x2 = points[i+1][0]
            x1 = points[i][0]
            y2 = points[i+1][1]
            y1 = points[i][1]
            x = abs(x2-x1)
            y = abs(y2-y1)
            result = result + max(x,y)
        return result
