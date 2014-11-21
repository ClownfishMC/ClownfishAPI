package mc.clownfish.api.command;

public interface Commander extends ChatReceivable
{

	/**
	 * Execute a command as #INSTANCE#
	 * 
	 * @param command
	 *            The command to execute, including arguments
	 */
	public void exeucteCommand (String command);

	/**
	 * Execute a command as #INSTANCE#
	 * 
	 * @param command
	 *            The command to execute
	 * @param arguments
	 *            The arguments that come with the command
	 */
	public void executeCommand (String command, String [] arguments);

	/**
	 * Execute multiple commands as #INSTANCE#
	 * 
	 * @param commands
	 *            The commands to execute, including arguments
	 */
	public void executeCommand (String... commands);

}
