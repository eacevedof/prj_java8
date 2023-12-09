import Creational.AbstractFactory.Views.CursosView;
import Creational.AbstractFactory.Enums.DbTypeEnum;

public final class Main {
    public static void main(String[] args) {
        String inputDbType = args.length>0 ? args[0] : "";

        DbTypeEnum dbTypeEnum = DbTypeEnum.RELATIONAL;
        if (inputDbType.equals(DbTypeEnum.NOSQL.getValue()))
            dbTypeEnum = DbTypeEnum.NOSQL;

        CursosView.getInstance().printCursos(dbTypeEnum);
    }
}