package day_11_SwitchAndScanner;
/*
1. Create a class called Browser. Write a program that can display the name of
selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put
        should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */

public class Browser {
    public static void main(String[] args) {
        String browserName = "safari",
                result = "";
        boolean validBrowser = browserName == "firefox" || browserName == "chrome" || browserName == "edge" ||
                browserName == "safari";

        if(validBrowser){
            if (browserName == "firefox"){
                result = "firefox is selected";
            }else if(browserName == "Chrome"){
                result = "Chrome is selected";
            }else if(browserName == "edge"){
                result = "Edge is selected";
            }else{
                result = "Safari is selected";
            }
        }else {
            result = "Invalid browser";
        }

        System.out.println(result);
    }
}
