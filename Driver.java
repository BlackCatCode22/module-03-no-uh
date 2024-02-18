package mystuff;

public class Driver {
    public static void main(String[] args) {

        Stuff myDevice = new Stuff();

        myDevice.deviceType = "laptop";
        myDevice.deviceName = "Apple MacBook Air";
        myDevice.deviceYear = 2020;
        myDevice.deviceMemory = 8;
        myDevice.deviceProcessor = "M1";

        System.out.println("The " + myDevice.deviceType + " " + "I am typing on is the " + myDevice.deviceName);
        System.out.println("Its model year is " + myDevice.deviceYear);
        System.out.println("It has " + myDevice.deviceMemory + " gigabytes of memory and is using the " + myDevice.deviceProcessor + " chip");

    }
}