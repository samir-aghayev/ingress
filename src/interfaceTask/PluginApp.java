package interfaceTask;

public class PluginApp {
    public static void main(String[] args) {
        PluginManager manager = new PluginManager();
        manager.loadPlugins();
        manager.runPlugin();
    }
}
