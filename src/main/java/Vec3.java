public class Vec3 {
    private float x;
    private float y;
    private float z;

    private float initX;
    private float initY;
    private float initZ;

    Vec3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;

        this.initX = x;
        this.initY = y;
        this.initZ = z;
    }

    //more methods will be added later as i find that they are needed1

    public float getX() {return this.x;}
    public float getY() {return this.y;}
    public float getZ() {return this.z;}

    public float getInitX() {return this.initX;}
    public float getInitY() {return this.initY;}
    public float getInitZ() {return this.initZ;}

    public void setX(float newX) {this.x=newX;}
    public void setY(float newY) {this.y=newY;}
    public void setZ(float newZ) {this.z=newZ;}

    public void setCurrent(Vec3 newVec) {
        this.x = newVec.getX();
        this.y = newVec.getY();
        this.z = newVec.getZ();
    }

    public void setAll(Vec3 newVec) {
        this.x = newVec.getX();
        this.y = newVec.getY();
        this.z = newVec.getZ();

        this.initX = newVec.getInitX();
        this.initY = newVec.getInitY();
        this.initZ = newVec.getInitZ();
    }

    public void addX(float deltaX) { this.x += deltaX; }
    public void addY(float deltaY) { this.x += deltaY; }
    public void addZ(float deltaZ) { this.x += deltaZ; }

    public void add(Vec3 addVec) {
        this.x += addVec.getX();
        this.y += addVec.getY();
        this.z += addVec.getZ();
    }

    public void scale(float scalar) {
        this.x = this.x*scalar;
        this.y = this.y*scalar;
        this.z = this.z*scalar;
    }

    public void scaleX(float scalar) { this.x = this.x*scalar; }
    public void scaleY(float scalar) { this.y = this.y*scalar; }
    public void scaleZ(float scalar) { this.z = this.z*scalar; }

    public double distanceTo(Vec3 vec1) {
        double dX = Math.abs(this.getX()-vec1.getX());
        double dY = Math.abs(this.getY()-vec1.getY());
        double dZ = Math.abs(this.getZ()-vec1.getZ());

        return Math.sqrt(Math.pow(dX, 2)+Math.pow(dY, 2)+Math.pow(dZ, 2));
    }
}
