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
	
	// 채팅방 insert 동시에 채팅방 페이지(채팅이 이루어지는 공간)로 이동 + roomInfo(roomId, chatRequestor) 데이터 보내기
	@RequestMapping("chatRoom")
	public void insert(ChatRoomShareVO bag, Model model) {
		// 만들어진 채팅방의 roomId, chatRequestor 가져와서 views의 chatRoom.jsp에 전달
		ChatRoomShareVO roomInfo = dao.one(bag);
//		System.out.println(roomInfo);
		
		// db에 채팅방이 없으면 채팅방생성
		if (roomInfo == null) {
			System.out.println(bag);
			dao.insert(bag); // 채팅방 생성 -> db삽입
			
			ChatRoomShareVO roomInfo2 = dao.one(bag);
//			System.out.println(roomInfo2.getRoomId());
//			System.out.println(roomInfo2.getChatRequestor());
			model.addAttribute("roomInfo", roomInfo2);
		}
		
		// db에 채팅방이 이미 있으면 채팅방생성x
		else {
			model.addAttribute("roomInfo", roomInfo);
		}
	
	}
	
	// 채팅방 목록
	@RequestMapping("chatList")
	public void list(Model model) {
		List<ChatRoomShareVO> list = dao.list();
		
		model.addAttribute("list", list);
	}
}
