public class Main {
    public static void main(String[] args) {
        int [] weight1 = new int [3];
        for(int i=0; i<=2;i++){
            weight1[i]=i+1;
        }
        double [] weight2 = {1.57, 7.654, 9.986};
        int [] weight3 = {1, 2, 3, 4, 5};
//
        for(int i=0; i<=weight1.length-1; i++) {
            if (i != (weight1.length - 1)) {
                System.out.print(weight1[i] + ",");
            } else {
                System.out.println(weight1[i]);
            }
        }
        //
        for(int i=0; i<=weight2.length-1; i++){
            System.out.print(weight2[i]+",");
            if (i != (weight2.length - 1)) {
                System.out.print(weight2[i] + ",");
            } else {
                System.out.println(weight2[i]);
            }
        }
        //
        for(int i=0; i<=weight3.length-1; i++){
            if (i != (weight3.length - 1)) {
                System.out.print(weight3[i] + ",");
            } else {
                System.out.println(weight3[i]);
            }
        }
//
        for(int i=(weight1.length-1); i>=0; i--){
            if (i != 0) {
                System.out.print(weight1[i] + ",");
            } else {
                System.out.println(weight1[i]);
            }
        }


        for(int i=(weight2.length-1); i>=0; i--){
            if (i != 0) {
                System.out.print(weight2[i] + ",");
            } else {
                System.out.println(weight2[i]);
            }
        }

        for(int i=(weight3.length-1); i>=0; i--){
            if (i != 0) {
                System.out.print(weight3[i] + ",");
            } else {
                System.out.println(weight3[i]);
            };
        }
//
        for(int i=0; i<=weight1.length-1; i++){
            if ((weight1[i]%2)==1){
                weight1[i]=weight1[i]+1;
            }
        }
        for(int i=0; i< weight1.length-1; i++){
            System.out.print(weight1[i]+",");
        }
        System.out.println(weight1[(weight1.length - 1)]);



    }
}