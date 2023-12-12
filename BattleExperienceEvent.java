package Homework.HM_002;


public class BattleExperienceEvent implements ExperienceEvent {
    private int experience;

    public BattleExperienceEvent(int experience) {
        this.experience = experience;
    }

    @Override
    public int getExperience() {
        return experience;
    }
}

