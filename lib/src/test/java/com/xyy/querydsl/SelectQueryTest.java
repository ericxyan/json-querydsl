package com.xyy.querydsl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectQueryTest {

    @Test
    public void test() {
        final String expected = "SELECT Employees.LastName, COUNT(Orders.OrderID) AS NumberOfOrders\n" +
                "FROM Orders\n" +
                "INNER JOIN Employees ON Orders.EmployeeID = Employees.EmployeeID\n" +
                "WHERE LastName = 'Davolio' OR LastName = 'Fuller'\n" +
                "GROUP BY LastName\n" +
                "HAVING COUNT(Orders.OrderID) > 25;";

        Query query = new SelectQuery();

        String actual = SQLQueryMaker.from(query);

        Assertions.assertEquals(expected, actual);
    }
}
