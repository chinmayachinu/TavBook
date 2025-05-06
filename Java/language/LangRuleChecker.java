package language;

public class LangRuleChecker {
    public static void main(String[] args) {

        //get lang filter instance dynamically
        LangFilter filter = LangFilter.LangFilterFactory.getLangFilter("Java");

        System.out.println(filter);
        if (filter.checkForEligibility("Java")) {
            System.out.println("Language is eligible");
        } else {
            System.out.println("Language is not eligible");
        }
    }
}
