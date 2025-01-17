package interfacedefinitions;

import java.util.ArrayList;
import java.util.List;

public class PluginManager {
    private List<Plugin> plugins;

    PluginManager() {
        this.plugins = new ArrayList<>();
    }


    public void loadPlugins(AdvancedPlugin advancedPlugin, ChartVisualizer chartVisualizer, DataAnalyzer dataAnalyzer, PDFExporter pdfExporter) {
        plugins.add(advancedPlugin);
        plugins.add(chartVisualizer);
        plugins.add(dataAnalyzer);
        plugins.add(pdfExporter);
    }

    public void runPlugins() {
        for (Plugin plugin : plugins) {
            plugin.execute();


            if (plugin instanceof DataProcessor) {
                ((DataProcessor) plugin).processData("Data");
            }

            if (plugin instanceof Visualizer) {
                ((Visualizer) plugin).visualize();
            }
            if (plugin instanceof Exporter) {
                ((Exporter) plugin).export("Format");
            }


//            Plugin plugin1=new Visualizer() {
//                @Override
//                public void visualize() {
//
//                }
//
//                @Override
//                public void execute() {
//
//                }
//            };
        }
    }


}
