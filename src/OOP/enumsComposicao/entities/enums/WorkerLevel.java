package OOP.enumsComposicao.entities.enums;

public enum WorkerLevel {
    JUNIOR("I"),
    MID_LEVEL("II"),
    SENIOR("III");

    private String code;

    WorkerLevel(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
