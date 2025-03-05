package demo;

public class Example {
    public static void main(String[] args) {
        Example ex = new Example();
        int output = ex.add(5,10);
        System.out.println("Addition is: " +output);

    }
    public int add(int n1, int n2){
        return n1+n2;
    }

}
