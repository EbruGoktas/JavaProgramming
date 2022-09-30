package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "James King",
                 buildingNumber = "1123B",
                 streetName = "Jones Branch Dr",
                 city = "McLean",
                 state = "VA",
                 zipCode = "22031A";

        // System.out.println(name + "\n" +buildingNumber + " " + streetName + "\n" + city + ", " + state + zipCode);
        String address = name + "\n" +buildingNumber + " " + streetName + "\n" + city + ", " + state + zipCode;

        System.out.println(address);

        /*
1.name
2.buildingNumber
3.streetName
4.city
5.state
6.zipCode
         */
    }
}
