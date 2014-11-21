package mc.clownfish.api;

public class Permission
{

	private Permission	parent;
	private String		permission;

	public Permission (String permission)
	{
		this.permission = permission;
	}
	
	public Permission getParent ()
	{
		return parent;
	}
	
	public String getPermission ()
	{
		return permission;
	}

}
