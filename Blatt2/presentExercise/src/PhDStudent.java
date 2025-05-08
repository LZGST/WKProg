public class PhDStudent extends Student{
    private String dissTopic;

    public PhDStudent(String firstName, String lastName, int age, int matNumber, int semester, String dissTopic) {
        super(firstName, lastName, age, matNumber, semester);
        this.dissTopic = dissTopic;
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder(super.getInfo());
        info.append(", Dissertation Topic: ").append(dissTopic);
        return info.toString();
    }
}
