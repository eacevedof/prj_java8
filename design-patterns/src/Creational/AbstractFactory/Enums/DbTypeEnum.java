package Creational.AbstractFactory.Enums;

public enum DbTypeEnum {
    RELATIONAL("relational"),
    NOSQL("nosql");

    private final String strValue;

    // Constructor privado para asignar el valor a cada constante
    DbTypeEnum(String strValue) {
        this.strValue = strValue;
    }

    public String getValue() {
        return strValue;
    }
}
