package song.c.g.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HomeDAO {

	@Autowired
	SqlSession sql;
	
	public String test() {
		return sql.selectOne("test.test");
	}
}
