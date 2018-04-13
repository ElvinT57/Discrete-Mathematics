import java.util.Scanner;

public class BinaryAddition
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String firstNum = sc.nextLine();
        System.out.println("You Entered: " + convertToBin(Integer.parseInt(firstNum)));
        System.out.print("Enter second number: ");
        String secondNum = sc.nextLine();
        System.out.println("You Entered: " + convertToBin(Integer.parseInt(secondNum)));
        
        String binAddition = convertToBin((Integer.parseInt(firstNum)+Integer.parseInt(secondNum)));
        
        System.out.println("Addition result in Binary: " + binAddition);
        System.out.println("Addition result in decimal: " + convertToInt(binAddition));
        
    }
    
    public static int convertToInt(String binNum){
        int [] states = new int[binNum.length()];
        int total = 0;
        for(int i = 0; i < states.length; i++){
            states[i] = binNum.charAt(i) - '0';
            total += states[i] * Math.pow(2, (states.length - (i+1)));
        }
        return total;
    }
    
    public static String convertToBin(int dec){
        String bin = "";
        while(dec > 0)
        {
            int a = dec % 2;
            bin = a + bin;
            dec = dec / 2;
        }
        return bin;
    }
}
