package Converter;
import weka.core.Instances;
import weka.core.converters.CSVLoader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Main {

    public static void Convert(String sourcePath, String destPath) throws Exception {

        // load CSV
        CSVLoader loader = new CSVLoader();
        loader.setSource(new File(sourcePath));
        Instances dataSet = loader.getDataSet();
        System.out.println("Received CSV File");

        // save ARFF
        BufferedWriter writer = new BufferedWriter(new FileWriter(destPath));
        writer.write(dataSet.toString());
        writer.flush();
        writer.close();
        System.out.println("Converted to ARFF File");
    }

    public static void main(String[] args) throws Exception{

        Convert("C:\\Users\\Example.csv",
                "C:\\Users\\Example.arff");

    }
}

