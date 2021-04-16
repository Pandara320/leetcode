class Solution(object):
    def removeCoveredIntervals(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: int
        """
        
        """
        sort intervals by increasing of starttIME AND DECREASING OF ENDtIME
        last = -1: last is the farest end time of browsed intervals
        for each interval in intervals
            if interval. endTime <= last, means interval is overlapped then we count removed
            else last - interval.endTime
        result = number of intervals - removed
        """
        intervals.sort(key = lambda x:(x[0], -x[1]))
        last = -1
        removed = 0
        for i in intervals:
            if i[1] <= last:
                removed = removed + 1 
            else:
                last = i[1]
        return len(intervals) - removed 
