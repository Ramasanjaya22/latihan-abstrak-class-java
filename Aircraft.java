public abstract class Aircraft {
    protected String name;
    protected String engineType;
    protected String engineCount;

    public abstract void fly();
    public abstract void landing();

    public void shoot(){}
}
