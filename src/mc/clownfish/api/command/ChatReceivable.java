package mc.clownfish.api.command;

public interface ChatReceivable
{

	/**
	 * Send one or more messages to the receiver
	 * 
	 * @param message
	 *            the message to send
	 */
	public void sendMessage (String... message);

}
