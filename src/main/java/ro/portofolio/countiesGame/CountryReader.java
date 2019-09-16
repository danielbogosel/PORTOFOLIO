package ro.portofolio.countiesGame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountryReader {
    private final List<Country> countries;

    public List<Country> getCountries() {
        return countries;
    }

    public CountryReader(String path) throws IOException {
        this.countries = fetchCountry(path);

    }

    private List<Country> fetchCountry(String path) throws IOException {
        List<Country> result = new ArrayList<>();
        List<String> border = new ArrayList<>();
        String line;
        String splitString[];
        String splitBorder[];
        BufferedReader breader = new BufferedReader(new FileReader(new File(path)));
        while ((line = breader.readLine()) != null) {
            splitString = line.split("\\|");

            if (splitString.length == 6) {
                splitBorder = splitString[5].split("~");
                border = Arrays.asList(splitBorder);
            }


            result.add(new Country(splitString[0],
                    splitString[1],
                    Long.parseLong(splitString[2]),
                    Integer.parseInt(splitString[3]),
                    splitString[4],
                    border)
            );


        }


        return result;
    }
}



