package com.iu.point;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PointController
 */
@WebServlet("/PointController")
public class PointController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private PointService pointService;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PointController() {
        super();
        pointService = new PointService();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글 인코딩 처리
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//pathInfo
		String command = request.getPathInfo();
		
		//method 형식
		String method = request.getMethod();
		
		//forward(true), redirect(false) 선택
		boolean check = true;
		
		//URL(path)를 담을 변수
		String path ="";
		
		try {
		if (command.equals("/pointList")) {
				ArrayList<PointDTO> ar = pointService.pointList();
				request.setAttribute("list" , ar);
			check=true;
			path="../WEB-INF/views/point/pointList.jsp";
		
		}else if(command.equals("/pointAdd")){
			if (method.equals("POST")) {
				//데이터를 db에 저장하는 코드
				PointDTO pointDTO = new PointDTO();
				pointDTO.setName(request.getParameter("name"));
				pointDTO.setNum(Integer.parseInt(request.getParameter("num")));
				pointDTO.setKor(Integer.parseInt(request.getParameter("kor")));
				pointDTO.setEng(Integer.parseInt(request.getParameter("eng")));
				pointDTO.setMath(Integer.parseInt(request.getParameter("math")));
				
				int result = pointService.pointAdd(pointDTO);
				
				check = false;
				path="./pointList";
			} else {
				check=true;
				path="../WEB-INF/views/point/pointAdd.jsp";
			}
		
		}else if (command.equals("/pointMod")) {
			if (method.equals("POST")) {
				//데이터를 db에 저장하는 코드
				
				PointDTO pointDTO = new PointDTO();
				pointDTO.setKor(Integer.parseInt(request.getParameter("kor")));
				pointDTO.setEng(Integer.parseInt(request.getParameter("eng")));
				pointDTO.setMath(Integer.parseInt(request.getParameter("math")));
				pointDTO.setNum(Integer.parseInt(request.getParameter("num")));
				int result = pointService.pointUpdate(pointDTO);
				
				check = false;
				path="./pointSelect?num="+pointDTO.getNum();
				
			} else {
				check=true;
				int num = Integer.parseInt(request.getParameter("num"));
				PointDTO pointDTO = pointService.pointSelect(num);
				request.setAttribute("dto", pointDTO);
				path="../WEB-INF/views/point/pointMod.jsp";
			}
		
		}else if (command.equals("/pointSelect")) {
			
			int num = Integer.parseInt(request.getParameter("num"));
			
			PointDTO pointDTO = pointService.pointSelect(num);
			
			request.setAttribute("dto", pointDTO);
			
			check=true;
			path="../WEB-INF/views/point/pointSelect.jsp";
				
		}else if (command.equals("/pointDelete")) {
			int num = Integer.parseInt(request.getParameter("num"));
			
			int result = pointService.pointDelete(num);
			check=false;
			path="./pointList";
			
		}else {

		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//
		if (check) {
			RequestDispatcher view = request.getRequestDispatcher(path);
			view.forward(request, response);
		} else {
			response.sendRedirect(path);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
