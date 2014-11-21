package mc.clownfish.api;

public class CommonFunctions
{

	public static <M> boolean eitherIs (M what, Object... objects)
	{
		for (Object e : objects)
		{
			if (e == what)
				return true;
		}
		return false;
	}

	public static <M> boolean neitherIs (M what, Object... objects)
	{
		for (Object e : objects)
		{
			if (e != what)
				return false;
		}
		return true;
	}

}
