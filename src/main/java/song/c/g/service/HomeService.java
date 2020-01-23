package song.c.g.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import song.c.g.dao.HomeDAO;

@Service
public class HomeService {

	@Autowired
	HomeDAO homeDAO;
	
	public String test() {
		return homeDAO.test();
	}
}
