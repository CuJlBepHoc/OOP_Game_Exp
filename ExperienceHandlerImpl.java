package Homework.HM_002;

public class ExperienceHandlerImpl implements ExperienceHandler {
    private int currentLevel;
    private int currentExperience;
    private int levelExperience;

    public ExperienceHandlerImpl(int initialLevel, int initialExperience, int levelExperience) {
        this.currentLevel = initialLevel;
        this.currentExperience = initialExperience;
        this.levelExperience = levelExperience;
    }

    @Override
    public int getCurrentLevel() {
        return currentLevel;
    }

    @Override
    public int getCurrentExperience() {
        return currentExperience;
    }

    @Override
    public int getLevelExperience() {
        return levelExperience;
    }

    @Override
    public void setCurrentLevel(int level) {
        this.currentLevel = level;
    }

    @Override
    public void setCurrentExperience(int experience) {
        this.currentExperience = experience;
        checkLevelUp();
    }

    private void checkLevelUp() {
        while (currentExperience >= levelExperience) {
            currentExperience -= levelExperience;
            levelUp();
        }
    }

    private void levelUp() {
        currentLevel++;
        System.out.println("Повышение! Уровень: " + currentLevel);
    }

    public void handleExperienceEvent(ExperienceEvent event) {
        int experienceToAdd = event.getExperience();
        setCurrentExperience(currentExperience + experienceToAdd);
    }
}
