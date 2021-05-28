package pojo.board.step2;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.util.MyBatisCommonFactory;

public class SqlMapZipCodeDao {
	Logger logger = Logger.getLogger(SqlMapZipCodeDao.class);
	SqlSessionFactory sqlSessionFactory = MyBatisCommonFactory.getSqlSessionFactory();
	public List<Map<String, Object>> getZipCodeList() {
		logger.info("getZipCodeList 호출 성공 ===> "+sqlSessionFactory);
		List<Map<String,Object>> time = null;
		try {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			time = sqlSession.selectList("getZipCodeList");
			logger.info("단위 테스트 : "+time);
		} catch (Exception e) {
			logger.info(e.toString());
		}
		return time;
	}

}
