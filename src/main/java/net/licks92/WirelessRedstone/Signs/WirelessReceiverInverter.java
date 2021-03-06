package net.licks92.WirelessRedstone.Signs;

import net.licks92.WirelessRedstone.WirelessRedstone;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.configuration.serialization.SerializableAs;

import java.util.Map;

@SerializableAs("WirelessReceiverInverter")
public class WirelessReceiverInverter extends WirelessReceiver {

    public WirelessReceiverInverter(Map<String,Object> map) {
        super(map);
    }

    public WirelessReceiverInverter() {
        super();
    }

    @Override
    public void turnOn(String channelName) {
        super.turnOff(channelName);
    }

    @Override
    public void turnOff(String channelName) {
        super.turnOn(channelName);
    }

    @Override
    public void changeSignContent(Block block, String channelName){
        Sign sign = (Sign) getLocation().getBlock().getState();
        sign.setLine(0, WirelessRedstone.getStringManager().tagsReceiver.get(0));
        sign.setLine(1, channelName);
        sign.setLine(2, WirelessRedstone.getStringManager().tagsReceiverInverterType.get(0));
        sign.update();
    }
}
