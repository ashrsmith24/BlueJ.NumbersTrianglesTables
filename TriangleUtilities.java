 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String result = "";
       for(int i = 0; i < numberOfStars; i++){
         result = result + "*";
    }
    return result ;
}
    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        for(int i = 1; i <= numberOfRows; i++) {
            for(int j = 0 ; j  < i ; j++) {
                triangle = triangle + "*";
            }
            triangle = triangle + "\n";
    }
    return triangle ;
}
    public static String getSmallTriangle() {
        String triangle = "";
        for(int i = 1; i <= 4; i++) {
            for(int j = 0 ; j  < i ; j++) {
                triangle = triangle + "*";
            }
            triangle = triangle + "\n";
    }
    return triangle ;
    }

    public static String getLargeTriangle() {
       String triangle = "";
        for(int i = 1; i <= 9; i++) {
            for(int j = 0 ; j  < i ; j++) {
                triangle = triangle + "*";
            }
            triangle = triangle + "\n";
    }
    return triangle ;
    }
}
