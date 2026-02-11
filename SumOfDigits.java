public class SumOfDigits{
    public static void main(String[] a){
        int n = 1234;
        int digits = 0;
        while(true){
            digits +=n%10;
            n=n/10;
            if(n<1){
                break;
            }
        }
        System.out.print(digits);
    }
}