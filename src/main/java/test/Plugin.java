package test;

import technologycommunity.net.core.color.Corelor;
import technologycommunity.net.core.plugin.Core;

import test.commands.GetMap;
import test.commands.Inventory;

public class Plugin extends Core {
    @Override
    protected void onStart() {
        new GetMap().register();
        new Inventory().register();

        getCoreLogger().information(Corelor.GREEN + "Plugin is started.");
    }

    @Override
    protected void onFinish() {
        getCoreLogger().information(Corelor.DARK_RED + "Plugin is finished.");
    }

    public static Plugin getInstance() {
        return (Plugin) Core.getInstance();
    }
}
