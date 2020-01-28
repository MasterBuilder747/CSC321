package Week02;

public class DataTypes {

    public static void main(String[] args) {

        //this seems to cast immediately
        byte a = 127;

        //when forcing to cast back, this wraps around to the other side of the data type, which is -128
        a = (byte)(a + 1);
        System.out.println(a);

    }

}
