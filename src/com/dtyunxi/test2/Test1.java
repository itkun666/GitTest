package com.dtyunxi.test2;

import java.util.Date;
import java.util.Vector;

import javax.management.InstanceNotFoundException;
import javax.management.timer.TimerMBean;

/**
 * 定时任务
 * @Title Test1
 * @Descritpion 
 * @author 玄同
 * @Date 2018年9月5日
 * @since V0.1.0
 */
public class Test1 implements TimerMBean{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer addNotification(String type, String message, Object userData, Date date, long period,
			long nbOccurences, boolean fixedRate) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer addNotification(String type, String message, Object userData, Date date, long period,
			long nbOccurences) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer addNotification(String type, String message, Object userData, Date date, long period)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer addNotification(String type, String message, Object userData, Date date)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeNotification(Integer id) throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeNotifications(String type) throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAllNotifications() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNbNotifications() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Vector<Integer> getAllNotificationIDs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<Integer> getNotificationIDs(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNotificationType(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNotificationMessage(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getNotificationUserData(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getDate(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getPeriod(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getNbOccurences(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean getFixedRate(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getSendPastNotifications() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSendPastNotifications(boolean value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
