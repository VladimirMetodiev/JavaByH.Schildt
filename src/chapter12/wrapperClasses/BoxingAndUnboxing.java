package chapter12.wrapperClasses;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        // Процеса на капсулиране, на значението на стойностен тип, в обвиващ тип, се нарича опаковане

        byte byteVar = 5;
        short shortVar = 12000;
        int intVar = 1000000;
        long longVar = -9223372036854775808L;
        float floatVar = 81.27f;
        double doubleVar = 3.1415926535897932d;
        char charVar = 'A';
        boolean boolVar = true;

        // Опаковането се извършва "ръчно", а не автоматично

        Byte byteObj = new Byte(byteVar);
        Short shortObj = new Short(shortVar);
        Integer intObj = new Integer(intVar);
        Long longObj = new Long(longVar);
        Float floatObj = new Float(floatVar);
        Double doubleObj = new Double(doubleVar);
        Character charObj = new Character(charVar);
        Boolean boolObj = new Boolean(boolVar);

        // Процеса на извличане, на значението на стойностен тип, от обект на обвиващ тип, се нарича разопаковане.
        // Разопаковането се извършва ("ръчно", а не автоматично) чрез следните методи:

        byte newByteVar = byteObj.byteValue();
        short newShortVar = shortObj.shortValue();
        int newIntVar = intObj.intValue();
        long newLongVar = longObj.longValue();
        float newFloatVar = floatObj.floatValue();
        double newDoubleVar = doubleObj.doubleValue();
        char newCharVar = charObj.charValue();
        boolean newBoolVar = boolObj.booleanValue();

        System.out.println(newByteVar);
        System.out.println(newShortVar);
        System.out.println(newIntVar);
        System.out.println(newLongVar);
        System.out.println(newFloatVar);
        System.out.println(newDoubleVar);
        System.out.println(newCharVar);
        System.out.println(newBoolVar);
    }
}
