package com.akaxia.test;

import java.util.List;
import java.util.Set;

import org.hibernate.Transaction;

import com.akaxia.dao.SjzdflDAO;
import com.akaxia.po.Sjzdfl;
import com.akaxia.po.Sjzdxx;
import com.akaxia.sessionFactory.HibernateSessionFactory;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SjzdflDAO sjzdflDAO=new SjzdflDAO();
		//第一种方法
		//Sjzdfl sjzdfl=new Sjzdfl();
		//sjzdfl.setSjzdflid(6);
		Sjzdfl sjzdfl=sjzdflDAO.findById(6);
		//sjzdfl.setSjzdflmc("测试更新数据字典分类");
		
		
		Transaction transaction=HibernateSessionFactory.getSession().beginTransaction();
		
		//sjzdflDAO.attachDirty(sjzdfl);
		sjzdflDAO.delete(sjzdfl);
		//sjzdflDAO.save(sjzdfl);
		
		transaction.commit();
		
		
		//Sjzdfl sjzdfl=sjzdflDAO.findById(1);
		//Sjzdfl sjzdfl=(Sjzdfl) sjzdflDAO.findBySjzdflmc("企业类型-分类").get(0);
		//Sjzdfl sjzdfl=(Sjzdfl) sjzdflDAO.findByProperty("sjzdflid", 3).get(0);
		//System.out.println(sjzdfl.getSjzdflid());
		//System.out.println(sjzdfl.getSjzdflmc());
		
		//findall测试
		/*List<Sjzdfl> sjzdflAll=sjzdflDAO.findAll();
		
		for(Sjzdfl sjzdfl:sjzdflAll){
			System.out.println(sjzdfl.getSjzdflid());
			System.out.println(sjzdfl.getSjzdflmc());
			Set<Sjzdxx> sjzdxxAll= sjzdfl.getSjzdxxes();
			for(Sjzdxx sjzdxx:sjzdxxAll){
				System.out.println(sjzdxx.getSjzdxxmc()+",");
			}
			System.out.println();
			System.out.println("---------------------------");
		}*
		*/
	}

}
