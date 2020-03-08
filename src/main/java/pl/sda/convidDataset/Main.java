package pl.sda.convidDataset;

import pl.sda.covidDataset.FileUtils;

import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        FileUtils fileUtils = new FileUtils();
        fileUtils.openFile("2019_nCoV_data.csv");
    }
}
