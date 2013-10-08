package com.in6k;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet1 extends HttpServlet{

    private static Logger transactionLog = Logger.getLogger(Servlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String sender = req.getParameter("sender");
        String receiver = req.getParameter("receiver");
        String amount = req.getParameter("amount");

        req.getRequestDispatcher("/WEB-INF/success.jsp").include(req, resp);
        transactionLog.warn("Sender name: " + sender);
        transactionLog.warn("Receiver name: " + receiver);
        transactionLog.warn("Amount: " + amount);
    }

}
