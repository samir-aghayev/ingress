package interfaceTask.classes;

import interfaceTask.interfaces.Exporter;

public class PDFExporter implements Exporter {

    public PDFExporter() {
    }

    @Override
    public void export(String format) {
        System.out.println("PDFExporter: Exporting in format - " + format);
    }

    @Override
    public void execute() {
        System.out.println("PDFExporter: Executing...");
    }
}
