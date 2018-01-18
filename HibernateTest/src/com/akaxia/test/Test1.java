package com.akaxia.test;

import java.util.List;

import com.akaxia.dao.SjzdflDAO;
import com.akaxia.po.Sjzdfl;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SjzdflDAO sdao=new SjzdflDAO();
		/*
		 * 
		 * 
		List<Sjzdfl> all=sdao.findAll();
		for(Sjzdfl sjzdfl:all){
			System.out.println(sjzdfl.getSjzdflid());
			System.out.println(sjzdfl.getSjzdflmc());
		}
		*/
		Sjzdfl sjzdfl=sdao.findById(1);
		System.out.println(sjzdfl.getSjzdflid());
		System.out.println(sjzdfl.getSjzdflmc());
	}

}
