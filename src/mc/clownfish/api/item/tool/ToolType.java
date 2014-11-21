package mc.clownfish.api.item.tool;

import mc.clownfish.api.Type;

public abstract class ToolType extends Type
{
	private int	diggingMultiplier;

	public ToolType (int diggingMultiplier)
	{
		super ("tool");
		this.diggingMultiplier = diggingMultiplier;
	}

	public int getDiggingMultiplier ()
	{
		return diggingMultiplier;
	}
}
