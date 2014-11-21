package mc.clownfish.api.command;

import java.util.ArrayList;

import mc.clownfish.api.CommonFunctions;
import mc.clownfish.api.Permission;
import mc.clownfish.api.plugin.Plugin;

public class Command
{

	private ArrayList <SubCommand>	subcommands;
	private String					name;
	private String					helpText;
	private Permission				requiredPermission;
	private CommandHandler			handler;
	private Plugin					plugin;

	public Command (String name, String helpText, CommandHandler handler,
			Plugin plugin)
	{
		if (CommonFunctions.eitherIs (null, handler, plugin))
			throw new IllegalArgumentException ("");

		this.name = name;
		this.helpText = helpText;
		this.handler = handler;
		this.plugin = plugin;
	}

	public Command (String name, String helpText,
			Permission requiredPermission, CommandHandler handler, Plugin plugin)
	{
		this (name, helpText, handler, plugin);
		this.requiredPermission = requiredPermission;
	}

	public CommandHandler getHandler ()
	{
		return handler;
	}

	public String getName ()
	{
		return name;
	}

	public SubCommand [] getSubCommands ()
	{
		return subcommands.toArray (new SubCommand [0]);
	}

	@SuppressWarnings ("unchecked")
	public ArrayList <SubCommand> getSubCommandList ()
	{
		return (ArrayList <SubCommand>) subcommands.clone ();
	}

	public Permission getPermission ()
	{
		return requiredPermission;
	}

	public boolean needPermission ()
	{
		return requiredPermission != null;
	}

	public Plugin getPlugin ()
	{
		return plugin;
	}

	public String getHelpText ()
	{
		return helpText;
	}

}
