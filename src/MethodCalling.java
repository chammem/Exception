public class MethodCalling {
    private int recursionCount = 0;
    private static final int MAX_RECURSION = 100;
    public void method1(){

        if (recursionCount < MAX_RECURSION) {
            recursionCount++;
            this.method2();
        } else {
            System.out.println("Limite de récursivité atteinte.");
        }
    }

    private void method2() {

        if (recursionCount < MAX_RECURSION) {
            recursionCount++;
            this.method1();
        } else {
            System.out.println("Limite de récursivité atteinte.");
        }
    }

    public static void main(String[] args) {
        MethodCalling mc = new MethodCalling();
        mc.method1();
    }
}
