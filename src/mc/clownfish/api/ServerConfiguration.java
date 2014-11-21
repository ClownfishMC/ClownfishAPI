package mc.clownfish.api;

import java.io.File;

public class ServerConfiguration
{

	public String	name			= "A Minecraft Server";
	public String	motd			= "Clownfish Minecraft Server";

	public int		playermax		= 20;

	public File		whitelistFile	= new File ("whitelist.json");
	public File		oplistFile		= new File ("ops.json");
	public File		banlistFile		= new File ("bans.json");

	public boolean	commandBlocks	= false;

}
