package interfaceTask.classes;

import interfaceTask.interfaces.DataProcessor;
import interfaceTask.interfaces.Exporter;

public class AdvancedPlugin implements DataProcessor, Exporter {

    public AdvancedPlugin() {
    }

    @Override
    public void processData(String data) {
        System.out.println("AdvancedPlugin: Processing data - " + data);
    }

    @Override
    public void export(String format) {
        System.out.println("AdvancedPlugin: Exporting in format - " + format);
    }

    @Override
    public void execute() {
        System.out.println("AdvancedPlugin: Executing...");
    }
}
