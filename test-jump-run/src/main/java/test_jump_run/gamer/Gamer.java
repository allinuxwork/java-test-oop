package test_jump_run.gamer;

public interface Gamer {

    String getName();

    int getMaxLength();

    int getMaxHeight();

    boolean getSuccess();

    void setSuccess(boolean success);

    String runStr();

    String jumpStr();
}