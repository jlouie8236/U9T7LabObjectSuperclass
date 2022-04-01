public class ThreeDPoint extends Point
{
    private int z;

    public ThreeDPoint(String label, int x, int y, int z)
    {
        super(label, x, y);
        this.z = z;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", z = " + z;
    }

    @Override
    public boolean equals(Object obj)
    {
        /*
        if (obj == null || !(obj instanceof ThreeDPoint))
        {
            return false;
        }
        */
        return super.equals(obj) && this.z == ((ThreeDPoint) obj).z;
    }
}
