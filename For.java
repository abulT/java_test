public class For{
    public static void main(String[] a){
        for(int i = 1, j = 1; (i<19)&&(j<19); i++,j++){
            i++;
            j++;
            System.out.println("Expression: "+i+"<<"+j);
        }
    }
}