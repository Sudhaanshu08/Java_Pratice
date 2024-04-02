public class LogicalExample {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        
        // AND
        boolean resultAnd = x && y;
        System.out.println("x && y: " + resultAnd);
        
        // OR
        boolean resultOr = x || y;
        System.out.println("x || y: " + resultOr);
        
        // NOT
        boolean resultNotX = !x;
        System.out.println("!x: " + resultNotX);
    }
}
