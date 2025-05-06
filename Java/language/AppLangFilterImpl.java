package language;

import java.util.Arrays;

public class AppLangFilterImpl implements LangFilter {
    @Override
    public boolean checkForEligibility(String lang) {

        String[] supportedLangs = {"Java", "JavaScript", "Python", "C#", "C++", "C", "SQL"};
        return Arrays.asList(supportedLangs).contains(lang);
    }
}
