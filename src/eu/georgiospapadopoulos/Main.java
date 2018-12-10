package eu.georgiospapadopoulos;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {

        String result = getDurationString(-1, 45);
        System.out.println(result);

        result = getDurationString(3945);
        System.out.println(result);

    }


    private static String getDurationString(int minutes, int seconds) {

        /**
         * Calculates the number of hours.
         *
         * @param minutes Minutes to convert into hours.
         * @param seconds Seconds remaining after conversion.
         * @return String containing the format as explained by the challenge.
         */

        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;

        minutes -= hours * 60;

        return hours + "h " + minutes + "m " + seconds + " s";
    }


    private static String getDurationString(int seconds) {
        /**
         * Calculates the number of minutes contained in a given seconds parameter.
         *
         * @param seconds Seconds to be converted to minutes.
         * @return result String that contains the result of the conversion as explained by the challenge
         */
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        seconds -= minutes * 60;

        return getDurationString(minutes, seconds);

    }

}
