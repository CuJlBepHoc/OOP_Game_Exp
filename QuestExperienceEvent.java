package Homework.HM_002;

public class QuestExperienceEvent implements ExperienceEvent {
    private int experience;

    public QuestExperienceEvent(int experience) {
        this.experience = experience;
    }

    @Override
    public int getExperience() {
        return experience;
    }
}

