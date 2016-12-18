
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
	
	Teacher [] T = new Teacher[5];{
	T[0] = new Teacher("蔡昌銘",sourse,"畢業於逢甲大學");
	T[1] = new Teacher("高維均",sourse1,"畢業於逢甲大學");
	T[2] = new Teacher("陳柏翔",sourse2,"畢業於逢甲大學");
	T[3] = new Teacher("劉俊甫",sourse3,"畢業於逢甲大學");
	T[4] = new Teacher("王呈峻",sourse4,"畢業於逢甲大學");
	}
	Course [] C = new Course[5];{
	C[0] = new Course("物件導向","9487", course1, "蔡昌銘");
	C[1] = new Course("體育","9478", course2, "高維均");
	C[2] = new Course("軟工導論","9477", course3, "陳柏翔");
	C[3] = new Course("資料結構","9488", course4, "劉俊甫");
	C[4] = new Course("戀愛心理學","9466", course5,"王呈峻");
	}
	
	public  void search(String str){//*搜尋
			boolean found = false;
			int i,a;
			for(i = 0;i < T.length;i++){//*使用課程代碼搜尋
				if(str.equals(T[i].teacherName)){
					found = true;
					System.out.print(T[i].teacherName+','+T[i].teacherData+',');
					for(String e : T[i].courseName){
			            System.out.println(e+"\t");
			        }
					break;
				}else if(str.equals(C[i].courseCode)){//*使用課程名稱搜尋
					found = true;
					System.out.print(C[i].teacherName+','+C[i].courseName+',');
					for(String e : C[i].courseData){
			            System.out.println(e+"\t");
			        }
					break;
				}else if(str.equals(C[i].courseName)){//*搜尋不到結果時
					found = true;
					System.out.print(C[i].teacherName+','+C[i].courseCode+',');
					for(String e : C[i].courseData){
			            System.out.println(e+"\t");
			        }
					break;
				}
			}
			if(found == false){//*搜尋不到結果時
			System.out.println("沒有搜尋結果!請重新輸入:");
			}
		}
	}
