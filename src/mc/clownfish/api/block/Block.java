package mc.clownfish.api.block;

public abstract class Block
{

	private float	breakSpeed;

	public Block (float breakSpeed)
	{
		this.breakSpeed = breakSpeed;
	}

	public float getBreakSpeed ()
	{
		return breakSpeed;
	}

}
