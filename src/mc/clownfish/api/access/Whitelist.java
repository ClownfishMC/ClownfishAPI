package mc.clownfish.api.access;

import mc.clownfish.api.player.Player;

public class Whitelist extends AccessList
{

	@Override
	public boolean canBeAdded (Player p)
	{
		return true;
	}

	@Override
	public boolean canBeRemoved (Player p)
	{
		return true;
	}

}
