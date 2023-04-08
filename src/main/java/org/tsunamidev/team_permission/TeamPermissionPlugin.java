package org.tsunamidev.team_permission;

import org.bukkit.plugin.java.JavaPlugin;

public class TeamPermissionPlugin extends JavaPlugin {

    private static TeamPermissionsAddon addon;
    private static TeamPermissionPlugin instance;

    public static TeamPermissionPlugin instance() {
        return instance;
    }

    public void onEnable() {
        instance = this;
        addon = new TeamPermissionsAddon(this);
        addon.registerEvents();
        getLogger().info("Loaded.");
    }

}
