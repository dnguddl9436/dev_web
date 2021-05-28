package pojo.board.step2;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class ZipCodeLogic {
	Logger logger = Logger.getLogger(ZipCodeController.class);
	SqlMapZipCodeDao sqlZipCodeDao= new SqlMapZipCodeDao();
	public List<Map<String,Object>> getZipCodeList() {
		List<Map<String,Object>> zipCodeList = sqlZipCodeDao.getZipCodeList();
		logger.info("getZipCodeList 호출 성공 ==> "+zipCodeList);
		return zipCodeList;
	}

}
