package interfaceTask;

import interfaceTask.classes.AdvancedPlugin;
import interfaceTask.classes.ChartVisualizer;
import interfaceTask.classes.DataAnalyzer;
import interfaceTask.classes.PDFExporter;
import interfaceTask.interfaces.DataProcessor;
import interfaceTask.interfaces.Exporter;
import interfaceTask.interfaces.Plugin;
import interfaceTask.interfaces.Visualizer;

import java.util.ArrayList;
import java.util.List;


public class PluginManager {
    private final List<Plugin> plugins = new ArrayList<>();

    public PluginManager() {

    }

    public void loadPlugins() {
        plugins.add(new DataAnalyzer());
        plugins.add(new ChartVisualizer());
        plugins.add(new PDFExporter());
        plugins.add(new AdvancedPlugin());
    }

    public void runPlugin() {
        plugins.forEach(plugin -> {
            plugin.execute();
            switch (plugin) {
                case DataProcessor dataProcessor -> dataProcessor.processData("Data");
                case Visualizer visualizer -> visualizer.visualize();
                case Exporter exporter -> exporter.export("PDF");
                default -> plugin.execute();
            }
        });
    }
}
