public final class ThirdLevel {
    private boolean flag;

    public ThirdLevel(boolean flag) {
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }

    @Override
    public String toString() {
        return "ThirdLevel{flag=" + flag + "}";
    }
}