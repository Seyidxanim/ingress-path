package interfacedefinitions;

public class DataAnalyzer implements  DataProcessor{
    @Override
    public void processData(String data) {
        System.out.println("Process data: " + data);
    }

    @Override
    public void execute() {
        System.out.println("Executing data analyzer plugin");
    }
}
