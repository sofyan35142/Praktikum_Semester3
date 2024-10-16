package coba;

public abstract class pemesanan implements Tiket {
    protected String nm;
    protected String asal;
    protected String dst;
    protected double Tiket;
    protected double disk;

    public pemesanan(String aSal, String dst, double Tiket) {
        this.nm = nm;
        this.asal = aSal;
        this.dst = dst;
        this.Tiket = Tiket;
        this.disk = disk;
    }

    @Override
    public abstract double hbt();

    @Override
    public abstract double h();

    @Override
    public abstract void t();
}
