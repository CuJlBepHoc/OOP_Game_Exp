package Homework.HM_002;


public class Main {
    public static void main(String[] args) {
        ExperienceHandlerImpl player = new ExperienceHandlerImpl(1, 0, 100);

        System.out.println("Начало игры!");
        printPlayerInfo(player);

        // Обработка события "Бой"
        ExperienceEvent battleEvent = new BattleExperienceEvent(150);
        player.handleExperienceEvent(battleEvent);
        System.out.println("Бой окончен!");
        printPlayerInfo(player);

        // Обработка события "Задание"
        ExperienceEvent questEvent = new QuestExperienceEvent(80);
        player.handleExperienceEvent(questEvent);
        System.out.println("Задание завершено!");
        printPlayerInfo(player);
    }


    private static void printPlayerInfo(ExperienceHandler player) {
        System.out.println("Уровень: " + player.getCurrentLevel());
        System.out.println("Очки опыта: " + player.getCurrentExperience());
        System.out.println("Очков опыта для следующего уровня: " + player.getLevelExperience());
        System.out.println("------------");
    }
}

