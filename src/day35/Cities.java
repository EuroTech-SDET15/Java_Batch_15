package day35;

import java.util.Arrays;
import java.util.Random;

public class Cities {
    public static void main(String[] args) {

        System.out.println(getCityFrom("Greece"));
        System.out.println(getCityFrom("Germany"));
        System.out.println(getCityFrom("UK"));
//Berlin from Germany

        // getCity()
        //get input from user
        //from user get the country
        // print a city from that country
    }

    //print capitals

    public static String getCityFrom(String country) {
        String city = "";
        if (country.equals("Germany")) {
            city = germanCities();
        } else if (country.equals("Greece")) {
            city = greeceCities();
        } else if (country.equals("UK")) {
            city = ukCities();
        }
//        city = city + " from "+country;

        return city + " from " + country;
    }

    public static String germanCities() {
        String[] cities = {"Berlin", "Dortmund", "Munich", "Hamburg", "mainz", "Essen"};
        //                      0            1       2         3
        Random random = new Random();
        int index = random.nextInt(cities.length);
        return cities[index];
    }


    public static String ukCities() {
        String[] cities = {"London", "York", "Leeds", "Leicester", "Manchester"};
        //                      0            1       2         3             4
        Random random = new Random();
        int index = random.nextInt(cities.length);
        return cities[index];
    }

    public static String greeceCities() {
        String[] cities = {"Athens", "Larissa", "Patras", "Thessaloniki"};
        //                      0            1       2         3
        Random random = new Random();
        int index = random.nextInt(cities.length);
        return cities[index];
    }


    // greece cities
    //Athens   Larissa  Patras    Heraklion Thessaloniki
    //german cities
    //Dortmund Munich Berlin  Hamburg   mainz


    //create a method
    //create an array
    //put 5 city into array cities={"","","","",""}
    //return random 1 city
}
