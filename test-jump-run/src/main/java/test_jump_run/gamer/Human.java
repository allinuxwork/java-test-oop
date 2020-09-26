package test_jump_run.gamer;

public class Human implements Gamer {
    private String name;
    private int maxLength;
    private int maxHeight;
    private boolean success = true;

    public Human(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    public String runStr() {
        return name + " может пробежать: " + maxLength + " км";
    }
    public String jumpStr() {
        return name + " может прыгнуть: " + maxHeight + " м";
    }
    public String getName() {
        return name;
    }
    public int getMaxLength() {
        return maxLength;
    }
    public int getMaxHeight() {
        return maxHeight;
    }
    public boolean getSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
}