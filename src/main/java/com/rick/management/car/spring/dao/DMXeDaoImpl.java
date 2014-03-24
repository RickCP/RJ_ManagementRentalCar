package com.rick.management.car.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.rick.management.car.spring.persit.domain.DmQuyen;
import com.rick.management.car.spring.persit.domain.DmXe;
import com.rick.management.car.spring.persit.domain.HangXe;

@Repository
public class DMXeDaoImpl extends BaseDAO implements DMXeDao {

	@Override
	public List<DmXe> getAllDmXes() {
		String sql = "FROM DmXe";
		Transaction tx = null;
		List<DmXe> dmxes = new ArrayList<DmXe>();
		Session session = getCurrentSession();
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery(sql);
			dmxes = query.list();

		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}

		}
		if (dmxes.size() > 0) {
			return dmxes;
		} else
			return null;

	}

	public static void main(String[] args) {
		DMXeDaoImpl dao = new DMXeDaoImpl();
		dao.getAllDmXes();
	}

	@Override
	public HangXe getHangXeById(int id) {
		Transaction tx = null;
		HangXe hangXe = null;
		Session session = getCurrentSession();
		try {
			tx = session.beginTransaction();
			hangXe = (HangXe) session.get(HangXe.class, id);
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		}
		if (hangXe != null)
			return hangXe;
		else
			return null;
	}

	@Override
	public List<DmQuyen> getAllDmQuyens() {
		String sql = "FROM DmQuyen";
		Transaction tx = null;
		List<DmQuyen> dmQuyens = new ArrayList<DmQuyen>();
		Session session = getCurrentSession();
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery(sql);
			dmQuyens = query.list();

		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}

		}
		if (dmQuyens.size() > 0) {
			return dmQuyens;
		} else
			return null;
	}

}
