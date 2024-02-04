public class Pair {
    private int a;
    private int b;
    
    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void setA(int a) {
        this.a = a;
    }
    
    public void setB(int b) {
        this.b = b;
    }
    
    public int getA() {
        return this.a;
    }
    
    public int getB() {
        return this.b;
    }
    
    public void swap() {
        int temp = this.a;
        this.a = this.b;
        this.b = temp;
    }
}