package org.launchcode.techjobs.oo;

public class PositionType extends JobField{

    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType(String value) {
        super(value);
    }
}
//        id = nextId;
//        nextId++;
//    }
//
//    public PositionType(String value) {
//        this();
//        this.value = value;
//    }
//
//    // TODO: Add a custom toString() method that returns the data stored in 'value'.
////    public PositionType(String value){
////        PositionType.toString();
////    }
//    @Override
//    public String toString(){
//        return value;
//    }
//
//    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
//    //  their id fields match.
//    @Override
//    public boolean equals(Object obj){
//        if(this == obj) return true;
//        if(obj == null || getClass() != obj.getClass()) return false;
//        PositionType positionType =(PositionType) obj;
//        return id == positionType.id;
//    }
//    @Override
//    public int hashCode(){
//        return Integer.hashCode(id);
//    }
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//}
