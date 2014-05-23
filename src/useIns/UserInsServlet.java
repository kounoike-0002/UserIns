package useIns;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserInsServlet
 */
@WebServlet("/UserInsServlet")
public class UserInsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void prosess(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String getName = request.getParameter("name");
        String getNikk = request.getParameter("nikk");
        String getMail = request.getParameter("mail");
        String getPass = request.getParameter("pass");

        //String botan = request.getParameter("botan");
        request.getSession().setAttribute("getName", getName);
        request.getSession().setAttribute("getNikk", getNikk);
        request.getSession().setAttribute("getMail", getMail);
        request.getSession().setAttribute("getPass", getPass);

        RequestDispatcher dispatcher = request
                .getRequestDispatcher("/userInsConf.jsp");
     }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // jsp側からの値の受け取り
        String getName = request.getParameter("name");
        String getNikk = request.getParameter("nikk");
        String getMail = request.getParameter("mail");
        String getPass = request.getParameter("pass");

        //String botan = request.getParameter("botan");
        request.getSession().setAttribute("getName", getName);
        request.getSession().setAttribute("getNikk", getNikk);
        request.getSession().setAttribute("getMail", getMail);
        request.getSession().setAttribute("getPass", getPass);

        RequestDispatcher dispatcher = request
                .getRequestDispatcher("/userInsConf.jsp");
        dispatcher.forward(request, response);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // jsp側からの値の受け取り
        String getName = request.getParameter("name");
        String getNikk = request.getParameter("nikk");
        String getMail = request.getParameter("mail");
        String getPass = request.getParameter("pass");

        if (getName == null && getNikk == null && getMail == null
                && getPass == null) {
            RequestDispatcher dispatcher = request
                    .getRequestDispatcher("/userIns.jsp");
            dispatcher.forward(request, response);
            ;
        } else {
            request.getSession().setAttribute("getName", getName);
            request.getSession().setAttribute("getNikk", getNikk);
            request.getSession().setAttribute("getMail", getMail);
            request.getSession().setAttribute("getPass", getPass);

            RequestDispatcher dispatcher = request
                    .getRequestDispatcher("/userInsConf.jsp");
            dispatcher.forward(request, response);
        }
    }

}
