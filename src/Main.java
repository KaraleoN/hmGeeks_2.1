public class Main {
    public static void main(String[] args) {
        ThirdLevel thirdObject = new ThirdLevel(true);
        SecondLevel objectA = new SecondLevel(1, "Object A", thirdObject, LevelEnum.HIGH);

        ThirdLevel objectB = new ThirdLevel(true);
        ThirdLevel objectC = new ThirdLevel(false);

        System.out.println("Properties of Object A:");
        System.out.println("ID: " + objectA.getId());
        System.out.println("Name: " + objectA.getName());
        System.out.println("Complex Object: " + objectA.getComplexObject());
        System.out.println("Enum Value: " + objectA.getLevelEnum());

        objectA.overloadedMethod(10);
        objectA.overriddenMethod();

        System.out.println("\nProperties of Object B:");
        System.out.println("Flag: " + objectB.isFlag());

        System.out.println("\nProperties of Object C:");
        System.out.println("Flag: " + objectC.isFlag());
    }
}