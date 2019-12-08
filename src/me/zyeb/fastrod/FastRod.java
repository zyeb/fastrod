package me.zyeb.fastrod;

import org.bukkit.plugin.java.*;
import org.bukkit.event.entity.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;

public class FastRod implements Listener
{
    public void onEnable() {
    }
    
    public void onDisable() {
    }
    
    @EventHandler
    public void rod(final ProjectileLaunchEvent e) {
        final double v = 1.1; //<--To make the rod even faster just change the value right here. ex. 2.0
        if (e.getEntityType().equals((Object)EntityType.FISHING_HOOK)) {
            e.getEntity().setVelocity(e.getEntity().getVelocity().multiply(v));
        }
    }
}
