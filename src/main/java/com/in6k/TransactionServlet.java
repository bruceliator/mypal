package com.in6k;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.Date;

public class TransactionServlet extends HttpServlet{

    private static Logger logger = Logger.getLogger(TransactionServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String sender = req.getParameter("sender");
        String receiver = req.getParameter("receiver");
        String amount = req.getParameter("amount");
        Timestamp ts = new Timestamp(new Date().getTime());
        int amountInt= Integer.parseInt(amount);

        Transaction t = new Transaction(receiver, sender, amountInt, ts);
        TransactionLog tl = new TransactionLog();
        try {
            tl.addTransaction(t);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

            logger.warn("Date: " + t.getDate());
            logger.warn("Sender name: " + t.getCreditAccount());
            logger.warn("Receiver name: " + t.getDebetAccount());
            logger.warn("Amount: " + t.getAmount());

        req.getRequestDispatcher("/WEB-INF/success.jsp").include(req, resp);

    }

}
