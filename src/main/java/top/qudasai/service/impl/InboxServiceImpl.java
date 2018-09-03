package top.qudasai.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import top.qudasai.mapper.InboxMapper;
import top.qudasai.service.InboxService;
import top.qudasai.vo.ClubInbox;
/**
 * ÑûÇëÂë²Ù×÷
 * @author cuian
 *
 */

@Service
public class InboxServiceImpl implements InboxService {

	@Resource
	private InboxMapper inboxMapper;
	public List<ClubInbox> allClubInbox() {
		List<ClubInbox> listInbox = inboxMapper.findAll();
		return listInbox;
	}

	public Boolean findInboxBy(String inbox) {
		return null;
	}

	public List<String> findAllInbox() {
		List<String> listInbox = inboxMapper.findAllInbox();
		return listInbox;
	}

}
