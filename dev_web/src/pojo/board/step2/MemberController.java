package pojo.board.step2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class MemberController extends HttpServlet implements Action{
	Logger logger = Logger.getLogger(MemberController.class);
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		logger.info("execute 호출");
		return null;
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		execute(req,res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		execute(req,res);
	}
}
