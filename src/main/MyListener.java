package main;

import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.Date;

public class MyListener implements Listener {
    String reason = "Skill Issue";
    Date date = new Date(System.currentTimeMillis()+60*60*24*7*1000);
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        Bukkit.getBanList(BanList.Type.IP).addBan(player.getAddress().toString(), reason, date, null);
        player.kickPlayer("Skill Issue");
    }
}
