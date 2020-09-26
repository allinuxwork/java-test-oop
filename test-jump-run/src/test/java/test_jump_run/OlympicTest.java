package test_jump_run;

import org.junit.jupiter.api.Test;
import test_jump_run.gamer.Cat;
import test_jump_run.gamer.Gamer;
import test_jump_run.gamer.Human;
import test_jump_run.gamer.Robot;
import test_jump_run.hurdles.Hurdles;
import test_jump_run.hurdles.Racecourse;
import test_jump_run.hurdles.Wall;

class OlympicTest {

    @Test
    void tryActionPositive() {
        Gamer catPirat = new Cat("Пират", 10, 13);
        Gamer catMyrzik = new Cat("Мурзик", 8, 15);

        Gamer humanOleg = new Human("Олег", 8, 5);
        Gamer humanAnton = new Human("Антон", 15, 7);

        Gamer robotKris = new Robot("Крис", 10, 10);
        Gamer robotVolf = new Robot("Вольф", 15, 15);

        Gamer[] gamers = {catPirat, catMyrzik, humanOleg, humanAnton, robotKris, robotVolf};


        Hurdles wall1 = new Wall(12);
        Hurdles wall2 = new Wall(17);

        Hurdles racecourse1 = new Racecourse(5);
        Hurdles racecourse2 = new Racecourse(18);

        Hurdles[] hurdles = {wall1, wall2, racecourse1, racecourse2};

        for (int i = 0; i < hurdles.length; i++) {

            for (Gamer gamer : gamers) {
                if (gamer.getSuccess()) {
                    hurdles[i].check(gamer);
                }


            }
        }
    }

    @Test
    void tryActionNegative() {

        Gamer catPirat = new Cat("Пират", 10, 13);
        Gamer catMyrzik = new Cat("Мурзик", 8, 15);

        Gamer humanOleg = new Human("Олег", 8, 5);
        Gamer humanAnton = new Human("Антон", 15, 7);

        Gamer robotKris = new Robot("Крис", 10, 10);
        Gamer robotVolf = new Robot("Вольф", 16, 15);

        Gamer[] gamers = {catPirat, catMyrzik, humanOleg, humanAnton, robotKris, robotVolf};


        Hurdles wall1 = new Wall(9);
        Hurdles wall2 = new Wall(16);

        Hurdles racecourse1 = new Racecourse(12);
        Hurdles racecourse2 = new Racecourse(20);

        Hurdles[] hurdles = {wall1, wall2, racecourse1, racecourse2};

        for (int i = 0; i < hurdles.length; i++) {
            for (Gamer gamer : gamers) {
                if (!gamer.getSuccess()) {
                    hurdles[i].check(gamer);
                }


            }
        }

    }
}