package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        StringBuilder s = new StringBuilder(message);
        /* OR DO THIS- longer way instead of putting it in one line
        s.reverse();
        message = s.toString();
        */
        s.reverse();
        return s.toString();
        
        
    }
    
}