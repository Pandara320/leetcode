class Solution(object):
    def stringMatching(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        
        array = ' '.join(words)
        subStr = [i for i in words if array.count(i) >=2]
        return subStr 
    
    # KMP algorithm
# arr is a string consisting of the elements of words joined by spaces. Spaces are necessary to avoid false matches.
# A conditional list comprehension on elements of words. Only accept the element if the pattern of the element occurs at least twice.
