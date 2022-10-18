package FunctionnalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        System.out.println(getDBConnectionUrl());

        System.out.println(getDBConnectionUrlSupplier.get());

        System.out.println(getDBConnectionUrlSupplierList.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/someDB";
    }

    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:5432/someDB";

    static Supplier<List<String>> getDBConnectionUrlSupplierList = () -> List.of("toto","titi");

}
