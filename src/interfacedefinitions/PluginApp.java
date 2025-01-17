package interfacedefinitions;

public class PluginApp {
    public static void main(String[] args) {

        AdvancedPlugin advancedPlugin = new AdvancedPlugin();
        ChartVisualizer chartVisualizer = new ChartVisualizer();
        DataAnalyzer dataAnalyzer = new DataAnalyzer();
        PDFExporter pdfExporter = new PDFExporter();


        PluginManager pluginManager = new PluginManager();

        pluginManager.loadPlugins(advancedPlugin, chartVisualizer, dataAnalyzer, pdfExporter);

        pluginManager.runPlugins();

    }
}
