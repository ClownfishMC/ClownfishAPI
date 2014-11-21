package mc.clownfish.api.access;

import java.util.ArrayList;

import mc.clownfish.api.player.Player;

/**
 * Abstract class used for lists
 * 
 * @author Xesau
 * @since 0.1a
 */
public abstract class AccessList
{
	/**
	 * ArrayList with the players that are on this list
	 */
	private ArrayList <Player>	players	= new ArrayList <Player> ();

	/**
	 * If enabled is false, AccessList::isAllowed(Player) will not check if the
	 * player is in the ArrayList or not
	 */
	private boolean				enabled	= true;

	/**
	 * Add a player to the access list
	 * 
	 * @param p
	 *            The player to add
	 */
	public final void addPlayer (Player p)
	{
		if (!players.contains (p) && canBeAdded (p))
			players.add (p);
	}

	/**
	 * Remove a player from the access list
	 * 
	 * @param p
	 *            The player to remove
	 */
	public final void removePlayer (Player p)
	{
		if (players.contains (p) && canBeRemoved (p))
			players.remove (p);
	}

	/**
	 * Get an ArrayList with the Players that are on the list
	 * 
	 * @return the players on the list
	 */
	@SuppressWarnings ("unchecked")
	public final ArrayList <Player> getPlayerList ()
	{
		return (ArrayList <Player>) players.clone ();
	}

	/**
	 * Get an array of the Players that are on the list
	 * 
	 * @return the players on the list
	 */
	public final Player [] getPlayers ()
	{
		return (Player []) getPlayerList ().toArray (new Player [0]);
	}

	/**
	 * Check if player <code>p</code> is on the list or not
	 * 
	 * @param p
	 *            the player to check for
	 * @return whether the player is on the list
	 */
	public final boolean hasPlayer (Player p)
	{
		return players.contains (p);
	}

	/**
	 * Check if player <code>p</code> is allowed for whatever the AccessList is
	 * used for
	 * 
	 * @param p
	 *            the player to check for
	 * @return whether the player is allowed
	 */
	public final boolean isAllowed (Player p)
	{
		return isEnabled () ? hasPlayer (p) : true;
	}

	/**
	 * Enable or disable the access list
	 * 
	 * @param enabled
	 *            true for enabled, false for disabled
	 */
	public final void setEnabled (boolean enabled)
	{
		this.enabled = enabled;
	}

	/**
	 * Check whether the access list is enabled or not
	 * 
	 * @return true if enabled, false if not
	 */
	public boolean isEnabled ()
	{
		return enabled;
	}

	/**
	 * Abstract method that checks whether a player can be added or not
	 * 
	 * @param p
	 *            the player to check for
	 * @return true if the player can be added, false if not
	 */
	public abstract boolean canBeAdded (Player p);

	/**
	 * Abstract method that checks whether a player can be removed or not
	 * 
	 * @param p
	 *            the player to check for
	 * @return true if the player can be removed, false if not
	 */
	public abstract boolean canBeRemoved (Player p);
}
