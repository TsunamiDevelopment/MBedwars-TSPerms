package org.tsunamidev.team_permission;

import de.marcely.bedwars.api.GameAPI;
import de.marcely.bedwars.api.arena.Arena;
import de.marcely.bedwars.api.game.lobby.LobbyItemHandler;
import de.marcely.bedwars.api.game.lobby.LobbyItemHandlerType;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class LobbyItem extends LobbyItemHandler {

    private TeamPermissionPlugin plugin;
    public LobbyItem(TeamPermissionPlugin plugin) {
        super("team_selector_modified", plugin);
        this.plugin = plugin;
    }

    @Override
    public void handleUse(Player player, Arena arena, de.marcely.bedwars.api.game.lobby.LobbyItem lobbyItem) {
        if (!player.hasPermission("mbedwars.team_selector.use")) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou do not have permission to use this."));
            return;
        }
        GameAPI.get().getLobbyItemHandler(LobbyItemHandlerType.SELECT_TEAM.getId()).handleUse(player, arena, lobbyItem);
    }

    @Override
    public boolean isVisible(Player player, Arena arena, de.marcely.bedwars.api.game.lobby.LobbyItem lobbyItem) {
        return true;
    }
}
