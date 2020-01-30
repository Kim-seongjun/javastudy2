package service;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.UploadContext;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class FileService {
	HttpServletRequest request; 
	HttpServletResponse response;
	public FileService(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
				
	}
	public String execute() {
		//String name = request.getParameter("name");
		//String file = request.getParameter("file");
		//System.out.println("name="+name);
		//System.out.println("file="+file);
		String uploadPath = request.getSession().getServletContext().getRealPath("/upload");
		int size = 10*1024*1024; //업로드 할수있는 최대크기 10MB까지
		String name = null;
		String subject = null;
		String sysfileName = null; //upload폴더(서버)에 저장된 파일명 
		String orifileName = null; // 원래 파일명
		File dir = new File(uploadPath);
		if(!dir.isDirectory()) {
			System.out.println("폴더가 없습니다. 재생성합니다.");
			if(!dir.mkdirs()) {
				System.out.println("생성에러");
			}
		}
		try {
			MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());
			name = multi.getParameter("name");
			subject = multi.getParameter("subject");
			orifileName = multi.getOriginalFileName("file");
			sysfileName = multi.getFilesystemName("file");
			request.setAttribute("name", name);
			request.setAttribute("subject", subject);
			request.setAttribute("orifileName", orifileName);
			request.setAttribute("sysfileName", sysfileName);
			return "result.jsp";
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return "fileUpFrom.jsp";
	}

}
