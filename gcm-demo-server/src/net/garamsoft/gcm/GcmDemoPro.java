package net.garamsoft.gcm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.garamsoft.common.util.FileUtil;

/**
 * Servlet implementation class GcmDemoPro
 */
@WebServlet({"/gcm-demo","/register"})
public class GcmDemoPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GcmDemoPro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String regId = request.getParameter("regId");
		
		String pathname = getServletContext().getRealPath("/gcm_reg");
		String fileName = "gcm_id";
		
		log("regId : "+ regId);
		log("pathname : "+ pathname);
		
		FileUtil.saveFile(pathname, fileName, regId);
	}
}
