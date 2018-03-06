public class CollegeStudent {
    double dormCost;
    double tuition;
    Residency residency;
    boolean livesOffCampus;

    public CollegeStudent(String residency) {
        residency = residency.toUpperCase();
        Residency residencyEnum;
        residencyEnum = Residency.valueOf(residency);
        this.residency = residencyEnum;
        livesOffCampus = false;
        dormCost = 800;
        if (residencyEnum == Residency.OUT_OF_STATE) {
            tuition = 42000;
        }
        else if (residencyEnum == Residency.IN_STATE) {
            tuition = 23000;
        }
        else {
            tuition = 44500;
        }
    }

    public CollegeStudent(String residency, boolean livesOffCampus) {
        residency = residency.toUpperCase();
        Residency residencyEnum;
        residencyEnum = Residency.valueOf(residency);
        this.residency = residencyEnum;
        this.livesOffCampus = livesOffCampus;

        if (livesOffCampus == true) {
            dormCost = 500;
        }
        else {
            dormCost = 800;
        }

        if (residencyEnum == Residency.OUT_OF_STATE) {
            tuition = 42000;
        }
        else if (residencyEnum == Residency.IN_STATE) {
            tuition = 23000;
        }
        else {
            tuition = 44500;
        }

    }

    void setTuition(double tuition) {
        this.tuition = tuition;
    }

    void setDormCost(double dormCost) {
        this.dormCost = dormCost;
    }

    double calculateYearlyCost() {
        return dormCost + tuition;
    }

    double getTuition() {
        return tuition;
    }

    double getDormCost() {
        return dormCost;
    }

    Residency getResidency() {
        return residency;
    }

    boolean isLivesOffCampus() {
        return livesOffCampus;
    }

    public String toString() {
        String student = ("The total expenses are " + calculateYearlyCost() + "\nHere is the breakdoown:\n" +
                "This student is " + residency + "\nYearly Tuition: " + tuition + "\nDorm Costs: " + dormCost);
        return student;
    }

    public static void main(String[] args) {
        CollegeStudent Derek = new CollegeStudent("OUT_OF_STATE",true);
        System.out.println(Derek.toString());
    }

}
