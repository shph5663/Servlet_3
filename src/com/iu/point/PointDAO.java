package com.iu.point;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Set;

import com.iu.util.DBConnect;

public class PointDAO {
	//DAO (data access object)
	
	//3. Delete
	
	public int pointDelete(int num) throws Exception{
		int result = 0;
		//1. db연결
		Connection con = DBConnect.getConnect();
		//2. sql문 작성
		String sql = "delete point where num = ?";
		//3. 미리전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ?값 있으면 세팅
		st.setInt(1, num);
		//5. 최종 전송후 결과 처리
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	
	//2. SelectOne
	public PointDTO pointSelect(int num) throws Exception{
		PointDTO pointDTO = null;
		//1. db연결
		Connection con = DBConnect.getConnect();
		//2. sql문 작성
		String sql = "select * from point where num=?";
		//3. 미리전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ?값 있으면 세팅
		st.setInt(1, num);
		//5. 최종 전송후 결과 처리
		ResultSet rs = st.executeQuery();
		
		if (rs.next()) {
			pointDTO = new PointDTO();
			pointDTO.setName(rs.getString("name"));
			pointDTO.setNum(rs.getInt("num"));
			pointDTO.setKor(rs.getInt("kor"));
			pointDTO.setEng(rs.getInt("eng"));
			pointDTO.setMath(rs.getInt("math"));
			pointDTO.setTotal(rs.getInt("total"));
			pointDTO.setAvg(rs.getDouble("avg"));
		}
		
		//6. 자원 해제
		rs.close();
		st.close();
		con.close();
		
		return pointDTO;
		
	}
	
	//1. LIST
	public ArrayList<PointDTO> pointList() throws Exception{ //리턴하는값의 데이터타입//
		
		ArrayList<PointDTO> ar = new ArrayList<PointDTO>();
		
		//1. db연결
		Connection con = DBConnect.getConnect();
		//2. sql문 작성
		String sql = "SELECT*FROM point ORDER BY num asc";
		//3. 미리전송
		PreparedStatement st = con.prepareStatement(sql);
		//4. ?값 있으면 세팅
		//5. 최종 전송후 결과 처리
		ResultSet rs = st.executeQuery();
		
		while (rs.next()) {	
			PointDTO pointDTO = new PointDTO();
			pointDTO.setName(rs.getString("name"));
			pointDTO.setNum(rs.getInt("num"));
			pointDTO.setKor(rs.getInt("kor"));
			pointDTO.setEng(rs.getInt("eng"));
			pointDTO.setMath(rs.getInt("math"));
			pointDTO.setTotal(rs.getInt("total"));
			pointDTO.setAvg(rs.getDouble("avg"));
			ar.add(pointDTO);
		}
		//6. 자원 해제
		rs.close();
		st.close();
		con.close();
		
		return ar;
	}
	//2. SELECT ONE
	
	//3. INSERT
	
	//4. UPDATE
	
	//5. DELETE
}
