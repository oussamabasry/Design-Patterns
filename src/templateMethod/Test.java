package templateMethod;

public class Test {
    public static void main(String[] args) {
        TemplateClass t1=new Implementation1();
        System.out.println(t1.operationTemplate());
        t1=new Implementation2();
        System.out.println(t1.operationTemplate());
    }
}
