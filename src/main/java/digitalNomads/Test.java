package digitalNomads;

public   class Test {

    public static class InnerClassOfTest{
        public String name = "public field";
        public static  String staticField = "staticField";
        private static String privateStaticField = "privateStaticField";
        String defaultField = "defaultField";
        protected String protectedField = "protectedField";


        public static void staticVoidMethod(){
            System.out.println(staticField  + " " + privateStaticField);
        }

        public void nonStaticMethod(){
            InnerClassOfTest innerClass = new InnerClassOfTest();
            System.out.println(innerClass.name + " "+ innerClass.defaultField + " "+ innerClass.protectedField);
        }
    }

}
