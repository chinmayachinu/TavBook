package url;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class QueryParamFind {
    private static final Pattern QUERY_STRING_PATTERN = Pattern.compile("[?](.*)");

    public static void main(String[] args) {
        String urlString = "/InstantCheckout?auth_key=NMNfc5ur9cxBcZA1&requestContext.localization.ipCountry=gb&requestContext.localization.locale=en-gb&requestContext.localization.currency=GBP&requestContext.localization.language=en&requestContext.sessions.0.type=frontend&requestContext.sessions.0.id=09056b03754fd3384206f891998971dd&requestContext.requestType.siteType=1&source=mySourceValue";

        System.out.println(getQueryString(urlString));
        try {
            URI uri = new URI(urlString);
            String query = uri.getQuery();
            Map<String, String> queryParams = getQueryParams(query);

            String sourceValue = queryParams.get("source");
            System.out.println("Source: " + sourceValue);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private static Map<String, String> getQueryParams(String query) {
        Map<String, String> queryParams = new HashMap<>();
        String[] pairs = query.split("&");
        for (String pair : pairs) {
            System.out.println(pair);
            int idx = pair.indexOf("=");
            if (idx > 0 && idx < pair.length() - 1) {
                String key = pair.substring(0, idx);
                String value = pair.substring(idx + 1);
                queryParams.put(key, value);
            }
        }
        return queryParams;
    }

    public static String getQueryString(String url) {
        var matcher = QUERY_STRING_PATTERN.matcher(url);
        if (matcher.find()) {
            return matcher.group(1);
        }

        return "";
    }

}
