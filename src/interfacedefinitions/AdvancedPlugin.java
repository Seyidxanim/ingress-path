package interfacedefinitions;

public class AdvancedPlugin implements DataProcessor,Exporter{
    @Override
    public void processData(String data) {
        System.out.println("Advanced plugin processor data: " +data);
    }

    @Override
    public void export(String format) {
        System.out.println("Advanced plugin exporting in format: " + format);
    }

    @Override
    public void execute() {
        System.out.println("Executing Advanced Plugin");
    }
}
