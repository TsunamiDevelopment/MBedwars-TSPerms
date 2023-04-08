package org.tsunamidev.team_permission;

import de.marcely.bedwars.api.BedwarsAddon;
import de.marcely.bedwars.api.GameAPI;
import de.marcely.bedwars.api.event.player.PlayerUseLobbyItemEvent;
import de.marcely.bedwars.api.game.lobby.LobbyItemHandler;
import de.marcely.bedwars.api.game.lobby.LobbyItemHandlerType;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class TeamPermissionsAddon extends BedwarsAddon implements Listener {

    private final TeamPermissionPlugin plugin;

    public TeamPermissionsAddon(TeamPermissionPlugin plugin) {
        super(plugin);
        this.plugin = plugin;
    }

    public void registerEvents() {
        GameAPI.get().registerLobbyItemHandler(new LobbyItem(plugin));
    }

    @Override
    public String getName() {
        return "TeamSelectorPermissions";
    }



}
