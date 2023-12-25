package driverManager;

import java.io.*;
import java.util.Properties;

public class PropertyReader {
    private Properties prop;

    private String propertiesPath;
    private static PropertyReader instance;

    public PropertyReader() throws IOException {
        prop= getProperty();
    }

    public static PropertyReader getInstance() throws IOException {
        if(instance == null){
            instance = new PropertyReader();
        }
        return instance;
    }

    private Properties getProperty() throws IOException {

        String configPath = "./src/test/resources/Configuration/config.properties";
        prop = new Properties();

        try {
            InputStream ip = new FileInputStream(configPath);
            prop.load(ip);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public Properties getTestDataPropertyFile(String fileName) throws Exception {

        String path = null;

        try {
            path = System.getProperty("user.dir") + File.separator + "./src/test/resources/Configuration";
        }
        catch (Exception e) {
            System.err.println("Could not locate Test Data Properties file");
            e.getStackTrace();
        }
        return prop;
    }
    public String readProperty(String key){
        return prop.getProperty(key);
    }
}
