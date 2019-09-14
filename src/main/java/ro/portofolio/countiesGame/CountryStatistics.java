package ro.portofolio.countiesGame;

import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {
    private final List<Country> countries;

    public CountryStatistics(List<Country> countries) {
        this.countries = new ArrayList<>(countries);
    }

    public List<Country> getCountriesForRegion(String region) {
        List<Country> result = new ArrayList<>();
        for (Country country : countries) {
            if (country.getRegion().equals(region)) {
                result.add(country);
            }
        }
        return result;
    }

    public List<Country> getCountriesBordering(String borderInitials) {
        List<Country> result = new ArrayList<>();
        for (Country country : countries) {
            if (country.getBorders().contains(borderInitials)) {
                result.add(country);
            }
        }
        return result;
    }

    public List<String> getBorderingCountries(String countryName) {
        List<String> result = new ArrayList<>();
        for (Country country : countries) {
            if (country.getName().equals(countryName)) {
                return country.getBorders();
            }

        }
        return null;
    }

    public List<Country> getAllCountries() {
        return countries;
    }

    public Country getCountriesStartingWithLetter(String letter) {
        for (Country country : countries) {
            if (country.getName().startsWith(letter)) {
                return country;
            }
        }
        return null;
    }

    public String getCountryCapital(String countryName) {
        for (Country country : getAllCountries()) {
            if (country.getName().equals(countryName)) {
                return country.getCapital();
            }
        }
        return null;
    }

    public long getPopulation(String countryName) {
        for (Country country : countries) {
            if (country.getName().equals(countryName)) {
                return country.getPopulation();
            }
        }
        return 0;
    }

    public long getArea(String countryName) {
        for (Country country : countries) {
            if (country.getName().equals(countryName)) {
                return country.getArea();
            }
        }
        return 0;
    }

    public Country getLargestCountry() {
        int maxArea = 0;
        Country countryWithMaxArea = null;
        for (Country country : countries) {
            if (country.getArea() > maxArea) {
                maxArea = country.getArea();
                countryWithMaxArea = country;
            }
        }
        return countryWithMaxArea;
    }
    public Country getMostPeopleCountry(){
        long maxPopulation=0;
        Country countryWithMaxPopulation=null;
        for (Country country:countries){
            if(country.getPopulation()>maxPopulation){
                maxPopulation=country.getPopulation();
                countryWithMaxPopulation=country;
            }
        }
        return countryWithMaxPopulation;
    }
}
