package mc.clownfish.api;

import java.util.ArrayList;
import java.util.logging.Logger;

import mc.clownfish.api.access.Banlist;
import mc.clownfish.api.access.Oplist;
import mc.clownfish.api.access.Whitelist;
import mc.clownfish.api.block.BlockTypeManager;
import mc.clownfish.api.item.ItemTypeManager;
import mc.clownfish.api.item.tool.ToolTypeManager;
import mc.clownfish.api.player.Player;

public interface Server
{

	public void startup ();

	public void shutdown ();

	public Whitelist getWhitelist ();

	public Banlist getBanlist ();

	public Oplist getOplist ();

	public Player [] getPlayers ();

	public ArrayList <Player> getPlayerList ();

	public BlockTypeManager getBlockTypeManager ();

	public ItemTypeManager getItemTypeManager ();

	public ToolTypeManager getToolTypeManager ();

	public Logger getLogger ();

}
