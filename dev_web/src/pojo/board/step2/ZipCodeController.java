package pojo.board.step2;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class ZipCodeController {
	Logger logger = Logger.getLogger(ZipCodeController.class);
	private ZipCodeLogic zipCodeLogic = new ZipCodeLogic();
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) {
		logger.info("execute 호출 성공");
		ActionForward forward = new ActionForward();
		List<Map<String,Object>> zipCodeList = zipCodeLogic.getZipCodeList();
		logger.info("zipCodeList ==> "+zipCodeList);
		req.setAttribute("zipCodeList", zipCodeList);
		logger.info("req.getAtt ==> "+req.getAttribute("zipCodeList"));
		forward.setPath("../board/boardInsertSuccess.jsp");
		return forward;
	}
}
