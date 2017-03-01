package cn.pushhand.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.pushhand.blog.mapper.TlableMapper;
import cn.pushhand.blog.model.Tlable;
import cn.pushhand.blog.service.LableService;

/**
 * 标签Service实现
 * @author Errol
 *
 */
@Service("lableService")
public class LableServiceImpl implements LableService {
	
	@Autowired
	private TlableMapper lablerMapper;

	@Override
	public List<Tlable> findAllLables() {
		return lablerMapper.selectByExample(null);
	}

}
