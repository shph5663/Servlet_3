package com.iu.point;

import java.util.ArrayList;

public class PointService {
	
	private PointDAO pointDAO;
	
	public PointService() {
		this.pointDAO = new PointDAO();//이 객체에 멤버변수를 호출하기위해
	}
	//1. LIST
	public ArrayList<PointDTO> pointList() throws Exception {
		return pointDAO.pointList();

	}
	//2. SELECT
	public PointDTO pointSelect(int num) throws Exception{
		return pointDAO.pointSelect(num);
	}
	
	//3. DELETE
	public int pointDelete(int num) throws Exception{
		return pointDAO.pointDelete(num);
	}
	
	//4. Add
	public int pointAdd(PointDTO pointDTO) throws Exception{
		pointDTO.setTotal(pointDTO.getKor()+pointDTO.getEng()+pointDTO.getMath());
		pointDTO.setAvg((pointDTO.getKor()+pointDTO.getEng()+pointDTO.getMath())/3.0);
		int result = pointDAO.pointAdd(pointDTO);
			
		return result;
	}
	
	//5. Update
	public int pointUpdate(PointDTO pointDTO) throws Exception{
		pointDTO.setTotal(pointDTO.getKor()+pointDTO.getEng()+pointDTO.getMath());
		pointDTO.setAvg((pointDTO.getKor()+pointDTO.getEng()+pointDTO.getMath())/3.0);
		int result = pointDAO.pointUpdate(pointDTO);
			
		return result;
	}

}
