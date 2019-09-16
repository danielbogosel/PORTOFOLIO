package ro.portofolio.countiesGame;

import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        CountryReader countryReader = new CountryReader("src/main/resources/countries2.txt");
        System.out.println(countryReader.getCountries());
        CountryStatistics countryStatistics = new CountryStatistics(countryReader.getCountries());
       /* System.out.println(countryStatistics.getCountriesForRegion("GRC"));
        System.out.println(countryStatistics.getArea("Romania"));
        System.out.println(countryStatistics.getPopulation("Hungary"));
        System.out.println(countryStatistics.getCountriesStartingWithLetter("P"));
        System.out.println(countryStatistics.getMostPeopleCountry());
        System.out.println(countryStatistics.getCountryCapital("France"));*/
    }
}
