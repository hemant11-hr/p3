public class OuterClass {

    // Static field in the outer class
    private static String staticField = "I am a static field of the outer class.";

    // Non-static field in the outer class
    private String instanceField;

    // Constructor
    public OuterClass(String instanceField) {
        this.instanceField = instanceField;
    }

    // Static method in the outer class
    public static void printStaticField() {
        System.out.println(staticField);
    }

    // Instance method in the outer class
    public void printInstanceField() {
        System.out.println(instanceField);
    }

    // Inner class
    public class InnerClass {
        public void displayOuterFields() {
            // Inner class has access to outer class fields (both static and instance)
            System.out.println("Accessing static field from inner class: " + staticField);
            System.out.println("Accessing instance field from inner class: " + instanceField);
        }
    }

    // Static nested class
    public static class StaticNestedClass {
        public void displayStaticField() {
            // Static nested class can only access static fields of the outer class
            System.out.println("Accessing static field from static nested class: " + staticField);
        }
    }

    public static void main(String[] args) {
        // Access and display static field directly
        OuterClass.printStaticField();

        // Create an instance of the outer class
        OuterClass outer = new OuterClass("I am an instance field of the outer class.");

        // Access and display instance field via method
        outer.printInstanceField();

        // Create an instance of the inner class and use it
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.displayOuterFields();

        // Create an instance of the static nested class and use it
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.displayStaticField();
    }
}
