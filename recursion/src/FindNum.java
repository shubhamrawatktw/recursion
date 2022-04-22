

public class FindNum {
    public static boolean check(int input[] , int x ,int startindex) {
       if (startindex == input.length) {
           return false;
       }

       if (input[startindex] == x) {
           return true;
       }

       return check(input, x, startindex+1);

        
    }

    public static void main(String[] args) {
     int input[] = {9,8,10,4};
     System.out.println(check(input, 8 ,0));

    }
}
