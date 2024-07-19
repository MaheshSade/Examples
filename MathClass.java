public class MathClass {
    public static void main(String[] args) {

        //returns positive
        int abs1 = Math.abs(-4);                                      // 4
        int abs2 = (int) Math.abs(-4.2);                              // 4
        int abs3 = Math.abs(400);                                     // 400

        //round-off to big number
        int ceil1 = (int) Math.ceil(-4.1);                             // -4
        int ceil2 = (int) Math.ceil(4.2);                              // 5
        double ceil3 = Math.ceil(40);                                  // 40.0

        //round-off to low number
        double floor1 = Math.floor(-4.6);                              // -5.0
        double floor2 = Math.floor(-4.4);                              // -5.0
        double floor3 = Math.floor(-4.5);                              // -5.0
        double floor4 = Math.floor(4.6);                               // 4.0
        double floor5 = Math.floor(4.3);                               // 4.0


        //round-off to closest
        int round1 = (int) Math.round(-4.2);                           // -4
        int round2 = (int) Math.round(-4.6);                           // -5
        double round3 = Math.round(4.4);                               // 4.0
        double round4 = Math.round(4.5);                               // 5.0
        double round5 = Math.round(4.6);                               // 5.0

        // returns max value
        int max1 = Math.max(1,2);                                      // 2
        int max2 = Math.max(1,1);                                      // 1
        int max3 = (int) Math.max(-1.2,1.2);                           // 1
        int max4 = (int) Math.max(1.2,2.1);                            // 2
        double max5 = Math.max(1.2,2.1);                               // 2.1


        int absExact1 = Math.absExact(-4);                             // 4
        int absExact2 = Math.absExact((int) -4.2);                     // 4
        int absExact3 = Math.absExact(4);                              // 4

        System.out.println(absExact1);
        System.out.println(absExact2);
        System.out.println(absExact3);
    }
}
