package ch9;

public class IntFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 向上取整
		System.out.println("使用ceil()方法取整：" + Math.ceil(5.2));
		// 向下取整
		System.out.println("使用floor()方法取整：" + Math.floor(2.5));
		// 返回最接近
		System.out.println("使用rint()方法取整：" + Math.rint(2.7));
		System.out.println("使用rint()方法取整：" + Math.rint(2.5));
		// 将参数加0.5再返回最接近
		System.out.println("使用round()方法取整：" + Math.round(3.4f));
		System.out.println("使用round()方法取整：" + Math.round(2.5));
	}

}
