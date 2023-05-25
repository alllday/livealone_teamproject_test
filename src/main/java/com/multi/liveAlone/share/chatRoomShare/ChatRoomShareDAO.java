package com.multi.liveAlone.share.chatRoomShare;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChatRoomShareDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(ChatRoomShareVO bag) {
		my.insert("chatroomshare.insert", bag);
		System.out.println("저장완료");
	}
	
	public List<ChatRoomShareVO> list(){
		List<ChatRoomShareVO> list = my.selectList("chatroomshare.all");
		System.out.println("채팅방 개수 : " + list.size());
		return list;
	}
	
	public ChatRoomShareVO one(ChatRoomShareVO bag) {
		ChatRoomShareVO bag2 = my.selectOne("chatroomshare.one", bag);
		return bag2;
	}
}
