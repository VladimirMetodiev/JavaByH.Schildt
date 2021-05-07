package chapter12.wrapperClasses;

public class Autoboxing2 {
    public static void main(String[] args) {
        Integer iObj, iObj2;
        int i;

        iObj = 19;
        System.out.println("Original value of iObj: " + iObj);

        // iObj, автоматично се разопакова, извършва се преинкрементация, а резултатът
        // отново се опакова в iOBj;
        ++iObj;
        System.out.println("After ++iObj: " + iObj);

        // iObj автоматично се разопакова, получената стойност се увеличава с 10,
        // а рузултатът се автоопакова в iObj;
        iObj += 10;
        System.out.println("After iObj += 10: " + iObj);

        // Обекта iObj се авто-разопакова, извършват се математическите действия, резултатът от тях
        // се автоопакова и се присвоява на обекта iObj2;
        iObj2 = iObj + (iObj / 3);
        System.out.println("iObj2 after expression: " + iObj2);

        // Обекта iObj се авто-разопакова, извършват се математическите действия, резултатът
        // се присвоява на променливата i;
        i = iObj + (iObj / 3);
        System.out.println("i after expression: " + i);
    }
}
