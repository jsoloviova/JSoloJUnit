import utils.PropertiesReaderClassLoader;

public class PropertiesUsage {
    public static void main(String[] args) {
        String timeoutValue = PropertiesReaderClassLoader.getInstance().getValueFromProperty("defaultTimeout");
        String baseUrlValue = PropertiesReaderClassLoader.getInstance().getValueFromProperty("baseUrl");

        System.out.println(timeoutValue);
        System.out.println(baseUrlValue);
    }
}
