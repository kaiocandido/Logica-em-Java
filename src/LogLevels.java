public class LogLevels {

    public static String message(String logLine) {
        int valueIndex = logLine.indexOf("]:");
        String frase = logLine.substring(valueIndex + 2);
        String formatada = frase.trim();

        return formatada;

    }

    public static String logLevel(String logLine) {
        int error = logLine.indexOf("]");
        String fraseError = logLine.substring(1, error);
        String minusculoError = fraseError.toLowerCase();

        return minusculoError;

    }

    public static String reformat(String logLine) {
        String info = logLevel(logLine);
        String operacao = message(logLine);
        String messageFormatada = operacao + " (" + info + ")";

        return messageFormatada;
    }
}
