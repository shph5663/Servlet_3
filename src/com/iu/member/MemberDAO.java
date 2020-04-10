package com.iu.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.point.PointDTO;
import com.iu.util.DBConnect;

public class MemberDAO {
	
	//update
	//5. Update
		public int memberUpdate(MemberDTO memberDTO) throws Exception{
			//1. db연결
			Connection con = DBConnect.getConnect();
			//2. sql문 작성
			String sql = "Update member set email=?,phone=?,age=? where id=?";
			//3. 미리전송
			PreparedStatement st = con.prepareStatement(sql);
			//4. ?값 있으면 세팅
			st.setString(1, memberDTO.getEmail());
			st.setString(2, memberDTO.getPhone());
			st.setInt(3, memberDTO.getAge());
			st.setString(4, memberDTO.getId());

			//5. 최종 전송후 결과 처리
			int result = st.executeUpdate();
					
			//6. 자원 해제
						
			st.close();
			con.close();
							
			return result;
		}
	
	//delete
	
	public int memberDelete(MemberDTO memberDTO) throws Exception{
		
		//1. db연결
		Connection con = DBConnect.getConnect();
		//2. sql문 작성
		String sql = "delete member where id = ?";
		//3. 미리전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ?값 있으면 세팅
		st.setString(1, memberDTO.getId());
		//5. 최종 전송후 결과 처리
		int result = st.executeUpdate();
				
		st.close();
		con.close();
				
		return result;
	}
	
	public int memberJoin(MemberDTO memberDTO)throws Exception{
		int result=0;
		Connection con = DBConnect.getConnect();
		
		String sql ="insert into member values (?,?,?,?,?,?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, memberDTO.getId());
		st.setString(2, memberDTO.getPw());
		st.setString(3, memberDTO.getName());
		st.setString(4, memberDTO.getEmail());
		st.setString(5, memberDTO.getPhone());
		st.setInt(6, memberDTO.getAge());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
		
	}
	
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception{
		//1. db연결
		Connection con = DBConnect.getConnect();
		//2. sql문 작성
		String sql = "select * from member where id=? and pw=?";
		//3. 미리전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ?값 있으면 세팅
		st.setString(1, memberDTO.getId());
		st.setString(2, memberDTO.getPw());
		//5. 최종 전송후 결과 처리
		ResultSet rs = st.executeQuery();
		
		if (rs.next()) {
			memberDTO.setName(rs.getString("name"));
			memberDTO.setEmail(rs.getString("email"));
			memberDTO.setPhone(rs.getString("phone"));
			memberDTO.setAge(rs.getInt("age"));
		}else {
			memberDTO = null;
		}
		//6. 자원 해제
		rs.close();
		st.close();
		con.close();
		
		return memberDTO;
	}
	
//	public MemberDTO memberPage() throws Exception{
		//1. db연결
//				Connection con = DBConnect.getConnect();
//				//2. sql문 작성
//				String sql = "select * from member where id=? and pw=?";
//				//3. 미리전송
//				PreparedStatement st = con.prepareStatement(sql);
//				//4. ?값 있으면 세팅
//				st.setString(1, memberDTO.getId());
//				st.setString(2, memberDTO.getPw());
//				//5. 최종 전송후 결과 처리
//				ResultSet rs = st.executeQuery();
//		
//	}

}
