package Creational.AbstractFactory.Enums;

public enum DbTypeEnum {
    RELATIONAL("relational"),
    NOSQL("nosql");

    private final String strValue;

    DbTypeEnum(String strValue) {
        this.strValue = strValue;
    }

    public String getValue() {
        return strValue;
    }
}
