public class TntPacket extends Tnt {

    TntPacket(int count, Vec3 pos, Vec3 vel, SimulationManager sim){
        super(pos, vel, sim);
        setCount();
    }

    protected void setCount() { super.count=count; }

    @Override
    protected void explode() {

    }

    public static TntPacket createEntity(int count, Vec3 initPos, Vec3 initVel, SimulationManager sim) {
        TntPacket tntPacket = new TntPacket(count, initPos, initVel, sim);
        return tntPacket;
    }
}