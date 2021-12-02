package be.intecbrussel.sellers;

public class Stock {
    private int iceRocket;
    private int cones;
    private int balls;
    private int magni;

    public Stock(int iceRocket, int cones, int balls, int magni) {
        setIceRocket(iceRocket);
        setBalls(balls);
        setCones(cones);
        setMagni(magni);
    }

    public int getIceRocket() {
        return iceRocket;
    }

    public int getCones() {
        return cones;
    }

    public int getBalls() {
        return balls;
    }

    public int getMagni() {
        return magni;
    }

    public void setIceRocket(int iceRocket) {
        this.iceRocket = iceRocket;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public void setMagni(int magni) {
        this.magni = magni;
    }
}
