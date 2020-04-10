## Servlet_3
 
####
 - 공지사항(notice) 게시판
 - 글쓰기, 수정 ,삭제 ,id가 admin만 가능
 - 글리스트 페이지, 최신순으로 출력
 - 리스트페이지에서 글쓰기 버튼을 누르면 글쓰기로 이동
 - 리스트페이지에서 글제목을 누르면 글보기로 이동
 - 글 상세보기에서 글수정, 글삭제 버튼 존재
 - 글 삭제버튼을 누르면 학인, 취소 창을 띄우고 확인을 누르면 삭제, 취소는 그대로
 - 글 수정은 글수정 누르면 글수정으로 이동


 #기능
 
- point list 출력
- point 등록
- point 상세 정보 출력
- point 수정
- point 삭제

## JSP
- pointList.jsp		: List 출력
- pointAdd.jsp		: 입력폼
- pointSelect.jsp	: point 상세정보 출력
- pointMod.jsp		: point 수정 폼

## URL 주소			/		JSP			/ Method
### /WEB-INF/views/point/**
- /point/pointList  /   pointList.jsp	/ GET

- /point/pointAdd	/	pointAdd.jsp	/ GET
- /point/pointAdd	/					/ POST

- /point/pointSelect/	pointSelect.jsp	/ GET

- /point/pointMod	/	pointMod.jsp	/ GET
- /point/pointMod	/					/ POST

- /point/pointDelete/					/ GET
