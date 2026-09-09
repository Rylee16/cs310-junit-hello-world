package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        String test = m.getTesting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
        System.out.println(test);
        System.out.println(m.reverse(test));
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        return new StringBuilder(message).reverse().toString();
    }
    
    public String getTesting() {
        return "This is a test.";
    }
    
}