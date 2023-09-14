package jbk;

class BindDynamic{
	protected String val;
	
	void display(String str) {
		val="Base Class Function".concat(str);
		System.out.println(val);	
	}
}
class BindDynamicSubclass extends BindDynamic{
	void display(String str) {
		if(val == null) {
			str = "Derived Class Function ".concat(str);
			System.out.println(str);
		}
	}
}
class BindDynSubClass extends BindDynamic {
	
	void display(String str) {
		super.display(str);
		if (val == null) {
		str = "Derived Class Fuction ".concat(str);
		System.out.println(str);
		}
	}
}

public class BindDynamicMainClass {
	public static void main(String[] args) {
		BindDynamicSubclass obj = new BindDynamicSubclass();
		obj.display("Called");
	}

}
