public class casting {
    public static void main(String args[]){
        System.out.println("Variable created");
        char c = 'X'; 
        byte b = 50;
        short s = 1996;
        int i = 123456789;
        long l = 1234567890123L;
        float f1 = 3.142F;
        float f2 = 1.4e-5F;
        double d2 = 0.000000987;
        System.out.println("c = " + c);
        System.out.println(" b = " + b);
        System.out.println(" s = " + s);
        System.out.println(" i = " + i);
        System.out.println(" l " + l);
        System.out.println(" f1 = "+ f1);
        System.out.println(" f2 = " + f2);
        System.out.println(" d2 = " + d2);
        System.out.println(" ");

        System.out.println( " Types converted");
        
        short s1 = (short )b ;
        short s2 = (short) i;
        float n1 = (float)l;
        int m1 = (int)f1;
        System.out.println(" (short)b = " + s1);
        System.out.println(" (short) i = " + s2);
        System.out.println( " (float)l = "+ n1);
        System.out.println( " (int) f1 = " + m1);

    }
}
