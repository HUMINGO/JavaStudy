package com.imooc.test;

import com.imooc.Fruits.Car;
import com.imooc.Fruits.HomeCar;
import com.imooc.Fruits.Taxi;

public class Test2 {
    public static void main(String[] args){ 
		//实例化父类对象，并传入两组相同的属性值
    	Car one=new Car("红色","张三");
    	Car two=new Car("红色","张三");
    	boolean flag=one.equals(two);
    	System.out.println("car1和car2的引用比较为："+flag);

		//调用父类use方法
    	one.use();
		//通过重写equals方法，比较两个对象是否相等


		System.out.println("==================================");
        //实例化子类Taxi对象，并传入属性值
		Taxi ta=new Taxi("蓝色","李四","长生公司");

		//调用ride和use方法
		ta.ride();
		ta.use();

		//输出重写toString后的taxi信息
		System.out.println(ta);

		System.out.println("==================================");
		//实例化子类HomeCar对象，并传入属性值
		HomeCar home=new HomeCar("白色","jack",4);
		

		//调用display方法及它的重载方法
		home.display();
//		home.setNum(5);
		home.display(5);


	}
}

