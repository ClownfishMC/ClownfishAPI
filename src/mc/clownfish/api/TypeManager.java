package mc.clownfish.api;

import java.util.HashMap;

public abstract class TypeManager <T extends Type>
{

	private HashMap <String, T>	types	= new HashMap <String, T> ();

	public void addType (T type)
	{
		types.put (type.getName (), type);
	}

	public T getType (String typeName)
	{
		return types.containsKey (typeName) ? types.get (typeName) : null;
	}

	public boolean hasType (String typeName)
	{
		return types.containsKey (typeName);
	}

	public boolean isRegistered (T type)
	{
		return types.containsValue (type);
	}

}
