package Day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("TX", "Zoa Energy", "CEO", 390000.00,
                true, true, false, true);

        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Clutch Center", "SDET",
                192999.99, true, true, true, false);

        Offer offer3 = new Offer();
        offer3.setInfo("Miami,FL", "Clutch arena", "QA", 97000.0,
                true, true, true, false);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapitalOne", "SM", 78000,
                false, false, true, true);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank Of America", "BA", 130000,
                true, true, false, true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        System.out.println("----------------------------------------");

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};

        ArrayList<Offer> fullTime = new ArrayList<>();
        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        ArrayList<Offer> offersWIthBenefits = new ArrayList<>(Arrays.asList(myOffers));
        ArrayList<Offer> sdetOffers = new ArrayList<>(Arrays.asList(myOffers));
        ArrayList<Offer> offersOf100K = new ArrayList<>(Arrays.asList(myOffers));

        for (Offer eachOffer : myOffers) {
            if (eachOffer.isFullTime == true) {
                fullTime.add(eachOffer);
            }
        }

        localOffers.removeIf(p -> !p.location.equals("TX") &&
                !p.location.equals("CA"));

        offersWIthBenefits.removeIf(p-> p.hasBenefit == false);

        sdetOffers.removeIf(p-> p.jobTitle.equalsIgnoreCase("qa") ||
                p.jobTitle.equalsIgnoreCase("sdet"));

        offersOf100K.removeIf(p-> p.salary < 100000.00);

        offersWIthBenefits.removeIf(p-> p.hasBenefit == false);



        System.out.println("fullTime = " + fullTime.size());
        for (Offer eachLocalOffer : localOffers){
            System.out.println("LocalOffers = " + eachLocalOffer.location + " : " + eachLocalOffer.companyName);
        }
        System.out.println("offersWIthBenefits = " + offersWIthBenefits.size());
        System.out.println("sdetOffers = " + sdetOffers.size());
        System.out.println("offersOf100K = " + offersOf100K.size());

    }
}
/*
2. Create a class named MyOffers:

				2.1 Create 7 objects of Offer
				2.2 Create an array of Offers named myOffers and store all 7 objects of offers
				2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
						2.3.1 Write a program that can remove the offer objects that are not full-time
				2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
						2.4.1 Write a program that can remove all the offers that are not from local
				2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
						2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
				2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
						2.6.1 Write a program that can remove all the offers that are not for SDET
				2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
						2.7.1 Write a program that can remove all the offers that are offering less than 100K salary

 */