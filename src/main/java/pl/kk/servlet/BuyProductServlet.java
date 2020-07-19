package pl.kk.servlet;

import pl.kk.model.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class BuyProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productName = req.getParameter("product");
        Map<Product, Integer> warehouse = (Map<Product, Integer>) req.getServletContext().getAttribute("warehouse");
        for (Map.Entry<Product, Integer> entries : warehouse.entrySet()) {
            if (entries.getKey().getProductName().equals(productName)) {
                entries.setValue(entries.getValue() - 1);
            }
        }
        resp.sendRedirect("index.jsp");
    }
}
