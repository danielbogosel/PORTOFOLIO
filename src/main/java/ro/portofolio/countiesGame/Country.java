package ro.portofolio.countiesGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {
    private final String name;
    private final String capital;
    private final long population;
    private final int area;
    private final String region;
    private final List<String> borders;

    public Country(String name, String capital, long population, int area, String region, List<String> borders) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.region = region;
        this.borders = new ArrayList<>(borders);
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }

    public int getArea() {
        return area;
    }

    public String getRegion() {
        return region;
    }

    public List<String> getBorders() {
        return borders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return population == country.population &&
                area == country.area &&
                Objects.equals(name, country.name) &&
                Objects.equals(capital, country.capital) &&
                Objects.equals(region, country.region) &&
                Objects.equals(borders, country.borders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capital, population, area, borders);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", region=" + region +
                ", borders=" + borders +
                '}' + '\n';
    }
}
