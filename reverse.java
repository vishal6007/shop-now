import java.lang.Math;
class Solution {
    public int reverse(int x) {
        int count=0;
        long res=0;
        int num1=x;
        int num2=x;
        while(num1 != 0)
        {
            count+=1;
            num1=num1/10;
        }
        while(num2 != 0)
        {
            int rem = num2%10;
            res = res + (int)(rem*(Math.pow(10,count-1)));
            if(res>2147483647 || res<-2147483648)
            {
                return 0;
            }
            num2 = num2/10;
            count = count-1;
        }
        return (int)res;

    }
}
