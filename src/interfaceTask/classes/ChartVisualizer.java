package interfaceTask.classes;

import interfaceTask.interfaces.Visualizer;

public class ChartVisualizer implements Visualizer {
    public ChartVisualizer() {
    }

    @Override
    public void visualize() {
        System.out.println("ChartVisualizer: Visualizing chart...");
    }

    @Override
    public void execute() {
        System.out.println("ChartVisualizer: Executing...");
    }
}
