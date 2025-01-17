package interfacedefinitions;

public class PDFExporter implements Exporter{
    @Override
    public void export(String format) {
        System.out.println("Exporting in format: " + format);
    }

    @Override
    public void execute() {
        System.out.println("Executing PDF exporter plugin ");
    }
}
