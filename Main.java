public class Main{
    public static void main(String[] args) {
        LightBoard l = new LightBoard(5,5);
        l.getLights();
        System.err.println(l.evaluateLight(2,1));
    }
}
