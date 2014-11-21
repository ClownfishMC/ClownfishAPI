package mc.clownfish.api.world;

public class Location
{

	private double	x, y, z;
	private float	pitch	= 0, yaw = 0;
	private World	world;

	public Location (World world, double x, double y, double z)
	{
		if (world == null)
			throw new IllegalArgumentException (
					"Location (world, x, y, z): Parameter world can not be null.");

		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Location (World world, double x, double y, double z, float pitch,
			float yaw)
	{
		if (world == null)
			throw new IllegalArgumentException (
					"Location (world, x, y, z): Parameter world can not be null.");

		this.x = x;
		this.y = y;
		this.z = z;
		this.pitch = pitch;
		this.yaw = yaw;
	}

	public World getWorld ()
	{
		return world;
	}

	public double getX ()
	{
		return x;
	}

	public double getY ()
	{
		return y;
	}

	public double getZ ()
	{
		return z;
	}

	public float getPitch ()
	{
		return pitch;
	}

	public float getYaw ()
	{
		return yaw;
	}

	public Location add (double x, double y, double z)
	{
		this.x += x;
		this.y += y;
		this.z += z;
		return this;
	}

	public Location add (double x, double y, double z, float pitch, float yaw)
	{
		this.pitch = pitch;
		this.yaw = yaw;
		return add (x, y, z);
	}

	public Location subtract (double x, double y, double z)
	{
		return add (-x, -y, -z);
	}

	public Location subtract (double x, double y, double z, float pitch,
			float yaw)
	{
		return add (-x, -y, -z, -pitch, -yaw);
	}

}
