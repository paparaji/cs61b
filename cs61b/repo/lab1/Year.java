public class Year{
    public static void main (String[] operands) {
        if (Integer.parseInt(operands[0]) % 4 == 0 && Integer.parseInt(operands[0]) % 100 != 0) 
            System.out.println("is leap year");
        else if (Integer.parseInt(operands[0]) % 400 == 0)
            System.out.println("is leap year");
        else 
            System.out.println("is not leap year");
        
    }
}
