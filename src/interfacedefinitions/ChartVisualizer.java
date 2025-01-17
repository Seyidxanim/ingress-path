package interfacedefinitions;

public class ChartVisualizer implements Visualizer{
    @Override
    public void execute() {
        System.out.println("Executing chart visualizer plugin");
    }

    @Override
    public void visualize() {
        System.out.println("Visualising chart ");
    }
}
