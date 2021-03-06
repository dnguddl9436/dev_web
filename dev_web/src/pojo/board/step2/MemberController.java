package pojo.board.step2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class MemberController {
	Logger logger = Logger.getLogger(MemberController.class);
	private MemberLogic MemberLogic = new MemberLogic();
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) {
		logger.info("execute 호출 성공");
		ActionForward forward = new ActionForward();
		String viewName = null;
		boolean isRedirect = false;
		String[] upmu = (String[])req.getAttribute("upmu");
		if("memberInsert".equals(upmu[1])) {
			logger.info("memberInsert 호출 성공");
			viewName = "getMemberList.po2";
			isRedirect = true;
			forward.setRedirect(isRedirect);
			forward.setPath(viewName);
		}
		else if("getMemberList".equals(upmu[1])) {
			logger.info("getMemberList 호출 성공");
			forward.setRedirect(isRedirect);
			forward.setPath("../board/boardInsertSuccess.jsp");
		}
		return forward;
	}
}
