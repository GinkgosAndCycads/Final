import TerminalIO.*;

public class Fib {
    //declare variables
    static int result;
    
    public static void main(String[] args) {
        KeyboardReader k = new KeyboardReader(); 
        //declare variables 
        int n = k.readInt("Enter the Number, Maximum is 15-> ");
        //Initiate a while true loop to process the fibonacci sequence.
        while(true){
            if(n>0 && n<16){
                result = fibonnaci(n);
                break;
            }
            else{
                System.out.println("Incorrect Fibonnaci Number, Must be between 1 and 15 ");
                n = k.readInt();
            }
        }
        System.out.println("Fibonnaci Output " + result);
    } 
    // Calculate fibonacci number at position n
    public static int fibonnaci(int n){
        if(n<=2) return 1;
        else return fibonnaci(n-1)+fibonnaci(n-2);
    }
    
}
