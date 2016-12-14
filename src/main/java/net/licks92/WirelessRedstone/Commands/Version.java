package net.licks92.WirelessRedstone.Commands;

import net.licks92.WirelessRedstone.Main;
import net.licks92.WirelessRedstone.Utils;
import org.bukkit.command.CommandSender;

@CommandInfo(description = "Get wirelessredstone version", usage = "", aliases = {"version", "v"},
        permission = "version", canUseInConsole = true, canUseInCommandBlock = true)
public class Version extends WirelessCommand {

    @Override
    public void onCommand(CommandSender sender, String[] args) {
        Utils.sendFeedback("You are currently using version " + Main.getInstance().getDescription().getVersion(), sender, false);
    }
}