public class InputOutputSchema {
    public static void main(String[] args) {
        GenericInputOutputSchema<java.lang.String, Mac> schema = new GenericInputOutputSchema<>("input", new Mac("Mac", 12));
        System.out.println(schema.getInput());
        System.out.println(schema.getOutput());

    }
}
record Mac (String name, int age) {}
class GenericInputOutputSchema<I, O> {
    private final I input;
    private final O output;

    public GenericInputOutputSchema(I input, O output) {
        this.input = input;
        this.output = output;
    }

    public I getInput() {
        return input;
    }

    public O getOutput() {
        return output;
    }

}