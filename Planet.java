public class Planet {

    private String designation;

    private double massKg;

    private double orbitEarthYears;

    private String type;



    public Planet(String designation, String  type){

        this.designation = designation;

        this.type = type;

    }



    public Planet(String designation, double massKg, double orbitEarthYears, String type) {

        this.designation = designation;

        this.massKg = massKg;

        this.orbitEarthYears = orbitEarthYears;

        this.type = type;

    }
    @Override
    public int hashCode(){
        return type.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Planet){
            Planet other = (Planet)obj;
            if(type == other.type){
                return true;
            }
            return false;
        }
        return false;
    }
    @Override
    public String toString(){
        return type;
    }
}
