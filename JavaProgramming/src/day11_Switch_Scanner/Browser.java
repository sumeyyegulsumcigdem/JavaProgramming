package day11_Switch_Scanner;

public class Browser {

    public static void main(String[] args) {

        String browserName = "edge";


        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera" || browserName == "safari" || browserName == "edge";

        if (validBrowser) {
            if (browserName == "chrome") {
                System.out.println(browserName + " is selected");
            } else if (browserName == "firefox") {
                System.out.println(browserName + " is selected");
            } else if (browserName == "opera") {
                System.out.println(browserName + "is selected");
            } else if (browserName == "safari") {
                System.out.println(browserName + " is selected");
            } else {
                System.out.println(browserName + " is selected");
            }
        } else {
            System.out.println("Invalid");
        }

        System.out.println("--------------------------------");

        String browserName2 = "firefox";
        String result = "";

        boolean validBrowser2 = browserName2 == "chrome" || browserName2 == "firefox" || browserName2 == "opera" || browserName2 == "safari" || browserName2 == "edge";

        if (validBrowser2) {
            if (browserName2 == "chrome") {
                result = " chrome is selected";
            } else if (browserName2 == "firefox") {
                result = " firefox is selected";
            } else if (browserName2 == "opera") {
                result = "opera is selected";
            } else if (browserName2 == "safari") {
                result = "safari is selected";
            } else {
                result = " edge is selected";
            }
        } else {
            result = "Invalid";
        }


        System.out.println(result);


    }


}


