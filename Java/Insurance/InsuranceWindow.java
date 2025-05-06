package Insurance;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class InsuranceWindow {
    public static void main(String[] args) {
        String reservationCreatedDate = "2024-04-16T09:03:07Z";
        long eligibleWindowInHours = 168; // 24 * 7 = 168 hours
        String checkInDate = "2024-04-30";
        boolean b = is7DaysBeforeCheckInWindowCheckSatisfied(
                reservationCreatedDate,
                eligibleWindowInHours,
                checkInDate);
        System.out.println(b);
    }

    private static boolean is7DaysBeforeCheckInWindowCheckSatisfiedNotWorkingAsPerLogic(
            String reservationCreatedDate,
            long eligibleWindowInHours,
            String checkInDate) {
        ZonedDateTime reservationCreatedDateTime = ZonedDateTime
                .ofInstant(Instant.parse(reservationCreatedDate), ZoneOffset.UTC);
        System.out.println("reservation created date time => " + reservationCreatedDateTime);

        LocalDate checkInLocalDate = LocalDate.parse(checkInDate);
        System.out.println("check in local date => " + checkInLocalDate);

        System.out.println(checkInLocalDate.atStartOfDay(ZoneOffset.UTC).minusHours(eligibleWindowInHours));

        return reservationCreatedDateTime.isBefore(
                checkInLocalDate.atStartOfDay(ZoneOffset.UTC).minusHours(eligibleWindowInHours));
    }

    private static boolean is7DaysBeforeCheckInWindowCheckSatisfied(
            String reservationCreatedDate,
            long eligibleWindowInHours,
            String checkInDate) {
        ZonedDateTime reservationCreatedDateTime = ZonedDateTime
                .ofInstant(Instant.parse(reservationCreatedDate), ZoneOffset.UTC);
        System.out.println("reservation created date time => " + reservationCreatedDateTime);

        LocalDate checkInLocalDate = LocalDate.parse(checkInDate);
        System.out.println("check in local date => " + checkInLocalDate);

        ZonedDateTime sevenDaysBeforeCheckIn = checkInLocalDate.atStartOfDay(ZoneOffset.UTC).minusHours(eligibleWindowInHours);
        System.out.println("seven days before check in => " + sevenDaysBeforeCheckIn);

        ZonedDateTime now = ZonedDateTime.parse("2024-04-23T07:10:44.697724Z");
                //ZonedDateTime.now(ZoneOffset.UTC);
        System.out.println("current date time => " + now);

        return now.isBefore(sevenDaysBeforeCheckIn) && reservationCreatedDateTime.isBefore(sevenDaysBeforeCheckIn);
    }

}
