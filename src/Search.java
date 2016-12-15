
public class Search {
	String[] sourse = {"物件導向"};
	String[] sourse1 = {"體育"};
	String[] sourse2 = {"軟工導論"};
	String[] sourse3 = {"資料結構"};
	String[] sourse4 = {"戀愛心理學"};
	String[] course1 = {"學生人數:1","學生評價:上"};
	String[] course2 = {"學生人數:2","學生評價:中"};
	String[] course3 = {"學生人數:3","學生評價:下"};
	String[] course4 = {"學生人數:4","學生評價:中上"};
	String[] course5 = {"學生人數:5","學生評價:中下"};
	Teacher T1 = new Teacher("蔡昌銘",sourse,"畢業於逢甲大學");
	Teacher T2 = new Teacher("高維均",sourse1,"畢業於逢甲大學");
	Teacher T3 = new Teacher("陳柏翔",sourse2,"畢業於逢甲大學");
	Teacher T4 = new Teacher("劉俊甫",sourse3,"畢業於逢甲大學");
	Teacher T5 = new Teacher("王呈峻",sourse4,"畢業於逢甲大學");
	
	Course C1 = new Course("物件導向", course1, "蔡昌銘");
	Course C2 = new Course("體育", course2, "高維均");
	Course C3 = new Course("軟工導論", course3, "陳柏翔");
	Course C4 = new Course("資料結構", course4, "劉俊甫");
	Course C5 = new Course("戀愛心理學", course5,"王呈峻");
	
	public class search{
		
		
	}
}
