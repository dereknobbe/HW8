public class IUStudent extends CollegeStudent {
    double bookFees;
    double transpotationCost;
    double financialAid;

    public IUStudent(String residency, boolean livesOffCampus, double GPA) {
        residency = residency.toUpperCase();
        Residency residencyEnum;
        residencyEnum = Residency.valueOf(residency);
        this.residency = residencyEnum;
    }
}
