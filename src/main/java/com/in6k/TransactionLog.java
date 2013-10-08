package com.in6k;

import java.sql.*;
import java.util.Date;

public class TransactionLog {
    private Transaction transaction;

    public void addTransaction(Transaction transaction) throws ClassNotFoundException, SQLException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        PreparedStatement statement= null;
        Connection connection = null;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/transaction", "root", "");

        String insertTableSQL = "INSERT INTO transactions"
                + "(date_at, debet_account, credit_account, amount) VALUES"
                + "(?,?,?,?)";
        statement = connection.prepareStatement(insertTableSQL);
        Timestamp ts = new Timestamp(new Date().getTime());
        statement.setTimestamp(1, ts);
        statement.setString(2, transaction.getDebetAccount());
        statement.setString(3, transaction.getCreditAccount());
        statement.setInt(4, transaction.getAmount());
        statement.executeUpdate();

    }

}
