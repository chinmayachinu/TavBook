package language;

public interface LangFilter {

    default boolean checkForEligibility(String lang) {
        return false;
    }

    class LangFilterFactory {
        public static LangFilter getLangFilter(String lang) {
            if (lang == null || lang.isBlank()) {
                return new LangFilter() {};
            }
            return new AppLangFilterImpl();
        }
    }
}
