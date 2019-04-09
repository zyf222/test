package tranport;

import javax.lang.model.type.ArrayType;
import javax.servlet.annotation.WebServlet;
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
@WebServlet
public class tranportServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");


        String start = request.getParameter("start");
        String end = request.getParameter("end");
        String roomtype = request.getParameter("roomtype");
        String price = request.getParameter("price");
        //int packagenum = Integer.valueOf(request.getParameter("packagenum"));
        String packagenum = request.getParameter("packagenum");
        double weight = Double.valueOf(request.getParameter("weight"));
        double x= Double.valueOf(request.getParameter("x"));
        double y = Double.valueOf(request.getParameter("y"));
        double z= Double.valueOf(request.getParameter("z"));
        double weight1 = Double.valueOf(request.getParameter("weight1"));
        double x1= Double.valueOf(request.getParameter("x1"));
        double y1 = Double.valueOf(request.getParameter("y1"));
        double z1= Double.valueOf(request.getParameter("z1"));
        double weight2 = Double.valueOf(request.getParameter("weight2"));
        double x2= Double.valueOf(request.getParameter("x2"));
        double y2 = Double.valueOf(request.getParameter("y2"));
        double z2= Double.valueOf(request.getParameter("z2"));
        double weight3 = Double.valueOf(request.getParameter("weight3"));
        double x3= Double.valueOf(request.getParameter("x3"));
        double y3 = Double.valueOf(request.getParameter("y3"));
        double z3= Double.valueOf(request.getParameter("z3"));
        double weight4 = Double.valueOf(request.getParameter("weight4"));
        double x4= Double.valueOf(request.getParameter("x4"));
        double y4 = Double.valueOf(request.getParameter("y4"));
        double z4= Double.valueOf(request.getParameter("z4"));
        String peopletype = request.getParameter("peopletype");
        String isvip = request.getParameter("isvip");

        visitor user = new visitor();

        double weightxyz[][] = {{weight,x,y,z},{weight1,x1,y1,z1},{weight2,x2,y2,z2},{weight3,x3,y3,z3},{weight4,x4,y4,z4}};

//        packageinfo p = new packageinfo();
//        p.setWeight(weight);p.setX(x);p.setY(y);p.setZ(z);
//        packageinfo p1 = new packageinfo();
//        p1.setWeight(weight1);p1.setX(x1);p1.setY(y1);p1.setZ(z1);
//        packageinfo p2 = new packageinfo();
//        p2.setWeight(weight2);p2.setX(x2);p2.setY(y2);p2.setZ(z2);
//        packageinfo p3 = new packageinfo();
//        p3.setWeight(weight3);p3.setX(x3);p3.setY(y3);p3.setZ(z3);
//        packageinfo p4 = new packageinfo();
//        p4.setWeight(weight4);p4.setX(x4);p4.setY(y4);p4.setZ(z4);
//
//        ArrayList<packageinfo> pi = new ArrayList<>();
//        pi.add(p);pi.add(p1);pi.add(p2);pi.add(p3);pi.add(p4);

        user.setStart(start);
        user.setEnd(end);
        user.setRoomtype(roomtype);
        user.setPrice(Double.valueOf(price));
        user.setPackagenum(Integer.valueOf(packagenum));
        user.setWeightxyz(weightxyz);
        user.setPeopletype(peopletype);
        user.setIsvip(isvip);

        String money = compute.computemoney(user);

        PrintWriter pw =response.getWriter();
        pw.print("<script language='javascript'> alert(<%=money%>);window.location.href='index.jsp';</script>");
        request.getSession().setAttribute("money",money);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
