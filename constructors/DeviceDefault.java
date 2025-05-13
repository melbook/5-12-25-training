
public class DeviceDefault {
    int releaseYear;   
    String deviceName; 


    public DeviceDefault() {
        releaseYear = 2025;
        deviceName = "Apple iPhone";
    }


    public DeviceDefault(int year, String name) {
        releaseYear = year;  
        deviceName = name;  
    }

    public static void main(String[] args) {
        DeviceDefault defaultDevice = new DeviceDefault();
        System.out.println("Default Device: " + defaultDevice.releaseYear + " " + defaultDevice.deviceName);
    
        DeviceDefault customDevice = new DeviceDefault(2023, "Galaxy S23");
        System.out.println("Custom Device: " + customDevice.releaseYear + " " + customDevice.deviceName);
    }
}

