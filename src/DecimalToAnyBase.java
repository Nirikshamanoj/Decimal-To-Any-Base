import java.util.Scanner;
public class DecimalToAnyBase {
    static String convertDecimalToAnyBase(int d,int b)
    {
        String result="";
        while (d>0)
        {
            result+=d%b;
            d/=b;
        }
        String converted="";
        for (int i=result.length()-1;i>=0;i--)
        {
            converted+= String.valueOf(result.charAt(i));
        }
        return converted;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int decimal= scanner.nextInt();
        int base= scanner.nextInt();
        String result=convertDecimalToAnyBase(decimal,base);
        System.out.println(result);
    }
}

