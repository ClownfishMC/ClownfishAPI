package mc.clownfish.api.player;

import java.util.UUID;

import mc.clownfish.api.world.Location;

public interface Player
{

	public String getName ();

	public UUID getUUID ();

	public Location getLocation ();

}
