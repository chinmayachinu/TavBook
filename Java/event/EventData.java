package event;

public class EventData {
    private final String anchorReservationId;
    private final String insuranceOrderId;
    private final String channel;
    private final String region;
    private final String city;
    private final String ipCountry;
    private final String currency;
    private final String language;
    private final String locale;

    public EventData(String anchorReservationId, String insuranceOrderId, String channel, String region, String city, String ipCountry, String currency, String language, String locale) {
        this.anchorReservationId = anchorReservationId;
        this.insuranceOrderId = insuranceOrderId;
        this.channel = channel;
        this.region = region;
        this.city = city;
        this.ipCountry = ipCountry;
        this.currency = currency;
        this.language = language;
        this.locale = locale;
    }

    @Override
    public String toString() {
        return "EventData{" +
                "anchorReservationId='" + anchorReservationId + '\'' +
                ", insuranceOrderId='" + insuranceOrderId + '\'' +
                ", channel='" + channel + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", ipCountry='" + ipCountry + '\'' +
                ", currency='" + currency + '\'' +
                ", language='" + language + '\'' +
                ", locale='" + locale + '\'' +
                '}';
    }
}
