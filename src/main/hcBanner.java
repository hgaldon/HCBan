package main;

import org.bukkit.plugin.java.JavaPlugin;

public class hcBanner extends JavaPlugin{

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new MyListener(), this);
    }
}
