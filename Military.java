public class Military extends Aircraft implements Cargo {
    private String type;
    private String nation;

    public Military(String type, String nation) {
        this.type = type;
        this.nation = nation;
    }

    @Override
    public void shoot() {
        // TODO Auto-generated method stub
        System.out.println("pesawatnya nembak");
    }

    public Military(String nation) {
        this.nation = nation;
    }

    @Override
    public void loadCargo() {
        // TODO Auto-generated method stub

    }

    @Override
    public void unloadCargo() {
        // TODO Auto-generated method stub

    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub

    }

    @Override
    public void landing() {
        // TODO Auto-generated method stub

    }

}
