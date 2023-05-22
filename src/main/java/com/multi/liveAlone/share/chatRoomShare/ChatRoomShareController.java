package com.multi.liveAlone.share.chatRoomShare;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatRoomShareController {

	@Autowired
	ChatRoomShareDAO dao;
	
	// 채팅방 insert 동시에 채팅방 페이지(채팅이 이루어지는 공간)로 이동
	@RequestMapping("chatRoom")
	public void insert(ChatRoomShareVO bag) {
		System.out.println(bag);
		dao.insert(bag);
		System.out.println("왜 chatRoom으로 이동안함?!");
	}
	
	
	// 채팅방 목록
	@RequestMapping("chatList")
	public void list(Model model) {
		List<ChatRoomShareVO> list = dao.list();
		
		model.addAttribute("list", list);
	}
}
