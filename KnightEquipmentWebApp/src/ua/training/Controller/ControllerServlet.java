package ua.training.Controller;

import ua.training.Util.Equipment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;
import static ua.training.Constants.Constants.*;

@WebServlet(name = "ControllerServlet")
public class ControllerServlet extends HttpServlet {
    public static ResourceBundle bundle;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Equipment equipment = new Equipment();

        String language = request.getParameter("language");
        bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale(language));
        PrintWriter printWriter = response.getWriter();
        printWriter.println(bundle.getString(ITEM_LIST));
        printWriter.println(equipment);
        printWriter.println(bundle.getString(EQUIPMENT_COST));
        printWriter.println(equipment.getEquipmentCost());
        printWriter.println(SORT_RESULT);
        equipment.sortEquipmentByWeight();
        printWriter.println(equipment);
    }
}
