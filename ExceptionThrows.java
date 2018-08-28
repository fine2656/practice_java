package my.day17;

public class ExceptionThrows {
	
	private String name;
	private String hakjum;
	private String point;
	
	public ExceptionThrows() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHakjum() {
	

		return hakjum;
	}

	public String getPoint() {
		
		return point;
		
	}
	public void setPoint(String point) 
			throws NumberFormatException {// 이 매소드를 호출할 때 이 매소드를 쓰는 곳에서 NumberFormatException 발생할 수 있다
		int jumsu = Integer.parseInt(point);
		switch (jumsu/10) {
		case 10: 
		case 9:  hakjum = "A"; break;
		case 8:  hakjum= "B"; break;
		case 7:  hakjum = "C"; break;
		case 6:  hakjum= "D"; break;
		default:  hakjum = "F";break;
		}
				
		
		
		this.point = point;
	}
	
	
}
