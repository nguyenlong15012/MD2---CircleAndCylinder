public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder("Blue", 2.8, 10 );
        System.out.println("Thể tích hình trụ bằng " + cylinder.getVolume() + " Color: " + cylinder.getColor());
    }
}
