package interfaceTask.classes;

import interfaceTask.interfaces.DataProcessor;

public class DataAnalyzer implements DataProcessor {

    public DataAnalyzer() {
    }

    @Override
    public void processData(String data) {
        System.out.println("DataAnalyzer: Processing data - " + data);
    }

    @Override
    public void execute() {
        System.out.println("DataAnalyzer: Executing...");
    }
}
