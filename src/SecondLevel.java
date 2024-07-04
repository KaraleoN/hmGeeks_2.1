public class SecondLevel extends FirstLevel {
    private ThirdLevel complexObject;
    private LevelEnum levelEnum;

    public SecondLevel(int id, String name, ThirdLevel complexObject, LevelEnum levelEnum) {
        super(id, name);
        this.complexObject = complexObject;
        this.levelEnum = levelEnum;
    }

    public ThirdLevel getComplexObject() {
        return complexObject;
    }

    public LevelEnum getLevelEnum() {
        return levelEnum;
    }

    public void overloadedMethod(int value) {
        System.out.println("Overloaded method with int parameter: " + value);
    }

    public void overriddenMethod() {
        System.out.println("Original implementation in SecondLevel");
    }
}