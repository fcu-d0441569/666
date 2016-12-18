
public class Course {//*可以儲存課程的名稱,代碼,評價與資料,教授姓名
	String courseName;
	String[] courseData;
	String teacherName;
	String courseCode;
	Course(String Cname,String Ccode, String[] Cdata, String Tname){
		courseName = Cname;
		courseData = Cdata;
		teacherName = Tname;
		courseCode = Ccode;
	}
}