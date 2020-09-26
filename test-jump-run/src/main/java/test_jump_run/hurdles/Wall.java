package test_jump_run.hurdles;

import org.junit.jupiter.api.Assertions;
import test_jump_run.gamer.Gamer;

public class Wall implements Hurdles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public String check(Gamer gamer) {
        gamer.jumpStr();
        gamer.setSuccess(gamer.getMaxHeight() >= height);
        if (gamer.getSuccess()) {
            Assertions.assertTrue(gamer.getSuccess());
            return "Игрок " + gamer.getName() + " перепрыгнул стену высотой: " + height + " м";
        } else {
            Assertions.assertFalse(gamer.getSuccess());
            return "Игрок " + gamer.getName() + " не перепрыгнул стену высотой: " + height + " м";
        }
    }


}