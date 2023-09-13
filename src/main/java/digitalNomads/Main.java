package digitalNomads;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Test.InnerClassOfTest nestedClass = new Test.InnerClassOfTest();
        nestedClass.protectedField = "sds";
        nestedClass.defaultField = "dsas";
        nestedClass.name = "dsadasd";
        nestedClass.nonStaticMethod();
        Test.InnerClassOfTest.staticField = "sds";
        Test.InnerClassOfTest.staticVoidMethod();

        Test test = new Test();
        }
}