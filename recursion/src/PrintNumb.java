public class PrintNumb {
    
public static void printNum(int n) {
if (n<=0) {
    System.out.println("number should be greater than 0");
    return;
}
     printNum(n-1);
    System.out.print(n-1+1 + " ");    
    
}
    public static void main(String[] args) {
            printNum(0);
    }
}
