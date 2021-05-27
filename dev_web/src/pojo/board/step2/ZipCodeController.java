package pojo.board.step2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class ZipCodeController {
	Logger logger = Logger.getLogger(ZipCodeController.class);
	private BoardLogic boardLogic = new BoardLogic();
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) {
		logger.info("execute 호출 성공");
		ActionForward forward = new ActionForward();
		String viewName = null;
		boolean isRedirect = false;
		String crud = (String)req.getAttribute("crud");
		if("zipCodeInsert".equals(crud)) {
			logger.info("zipcodeinsert 호출 성공");
			viewName = "getZipCodeList.po2";
			isRedirect = true;
			forward.setRedirect(isRedirect);
			forward.setPath(viewName);
		}
		else if("getZipCodeList".equals(crud)) {
			logger.info("getZipCodeList 호출 성공");
			forward.setRedirect(isRedirect);
			forward.setPath("../board/boardInsertSuccess.jsp");
		}
		return forward;
	}
}
