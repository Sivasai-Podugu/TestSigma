/*
4. Write a program for TicketCounter as mentioned below
a. User can get Bus/Train/Flight ticket from Multiple Vendors
b. Take at least 3 vendors for each
c. Ticket pricing Strategy should vary from vendor to vendor based on the distance.
d. Minimum charges for each category defined as Bus (100), Train(50), Flight( 500).
For each vendor of bus per km fare should differ 2%
For each vendor of train per km fare should differ 5%
For each vendor of fight per km fare should differ 8%
(Note: Create a vendor fare data table with above fare details)

Inputs:
Category : Bus/ Train/ Flight
Vendor: < vendor selected based under the category >
Distance: < km >

Final output :
Total fare
*/


class Fare{

    public enum Category {Bus, Flight, Train};
    public enum Vendor {V1, V2, V3};

    static final float busBasePrice = 100f;
    static final float trainBasePrice = 50f;
    static final float flightBasePrice = 500f;

    static final float busV1 = 10f;
    static final float busV2 = (float)(busV1+(0.02 * busV1));
    static final float busV3 = (float)(busV2+(0.02 * busV2));

    static final float trainV1 = 5f;
    static final float trainV2 = (float)(trainV1+(0.05 * trainV1));
    static final float trainV3 = (float)(trainV2+(0.05 * trainV2));

    static final float flightV1 = 30f;
    static final float flightV2 = (float)(flightV1+(0.08 * flightV1));
    static final float flightV3 = (float)(flightV2+(0.08 * flightV2));

    

    Category c;
    Vendor v;
    float distance;

    Fare(Category cat, Vendor ven, float dist){
        c = cat;
        v = ven;
        distance = dist;
    }

    void calculateTotalFare(){
        float basePrice = 0f;
        float farePerKm = 0f;
        switch(c){
            case Bus:
                basePrice = busBasePrice;
                switch(v){
                    case V1:
                        farePerKm = busV1;
                        break;
                       
                    case V2:
                        farePerKm = busV2;
                        break;
                    
                    case V3:
                        farePerKm = busV3;
                        break;

                    default:
                        System.out.println("Vendor not found");

                }
                break;
            
            case Train:
                basePrice = trainBasePrice;
                switch(v){
                    case V1:
                        farePerKm = trainV1;
                        break;
                       
                    case V2:
                        farePerKm = trainV2;
                        break;
                    
                    case V3:
                        farePerKm = trainV3;
                        break;

                    default:
                        System.out.println("Vendor not found");

                }
                break;
            
            case Flight:
                basePrice = flightBasePrice;
                switch(v){
                    case V1:
                        farePerKm = flightV1;
                        break;
                       
                    case V2:
                        farePerKm = flightV2;
                        break;
                    
                    case V3:
                        farePerKm = flightV3;
                        break;

                    default:
                        System.out.println("Vendor not found");

                }
                break;

            default:
                System.out.println("Category not found");

        }

        System.out.println("TotalFare = "+(basePrice+ (distance * farePerKm)));
    }

}

class Program4{
    public static void main(String[] args) {
        Fare.Category c1 = Fare.Category.Bus;
        Fare.Vendor v1 = Fare.Vendor.V1;
        Fare f1 = new Fare(c1, v1, 500);
        f1.calculateTotalFare();

        Fare.Category c2 = Fare.Category.Flight;
        Fare.Vendor v2 = Fare.Vendor.V2;
        Fare f2 = new Fare(c2, v2, 1000);
        f2.calculateTotalFare();
    }
}
