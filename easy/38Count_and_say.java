class Solution {
    public String countAndSay(int n) 
    {
        // basic condition
        if(n == 1){
            return "1";
        }
        if(n == 2){
            return "11";
        }
        String str = "11";// every Term is generated by the previous term


        for(int i = 3; i <= n; i++)
        {        
            str += '@';
            String tmp = ""; // Initialize i th term in series.
            int count = 1; // Initialize c@ount of matching chars.
            int mylength = str.length();
            char [] myArray = str.toCharArray();
            for (int j = 1; j < mylength; j++)
            {
                if(myArray[j] != myArray[j-1])
                {
                    // append count of str[j-1] to the temp buffer
                    tmp += count + 0;
                    tmp += myArray[j-1];
                    // reset count;
                    count = 1;
                }
                else count = count +1; 
                //matched, then increse the matching count.
            }
            
        // update str
        str = tmp;        

        }
    return str;
    }
    public void main(String[] args)
    {
        int N = 3;
        System.out.println(countAndSay(N)); 
    }

}