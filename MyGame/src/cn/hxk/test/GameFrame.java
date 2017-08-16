package cn.hxk.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 游戏窗口类
 * @author Administrator
 *
 */

public class GameFrame extends Frame { //GUT编程：AWT，swing等
	
	Image img = GameUtil.getImage("images/sun.jpg");
	
	
	/**
	 * 加载窗口
	 */
	public void launchFrame(){
		setSize(400, 400);
		setLocation(100,100);
		setVisible(true);
		
		new PaintThread().start();
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	
	double x = 100, y = 100;
	
	@Override
	public void paint(Graphics g) {
	
		g.drawLine(100, 100, 200, 200);
		g.drawRect(100, 100, 200, 200);
		g.drawOval(100,100,200,200);
		
		
		Font f = new Font("宋体",Font.BOLD, 100);
		g.setFont(f);
		
		g.drawString("我是",200,200);
		
		g.fillRect(100,100,20,20);
		Color c = g.getColor();//获取刚开始的颜色  
		g.setColor(Color.red);
		g.fillOval(300,300,20,20);
		g.setColor(c); //把笔的颜色变为最初的颜色
		
		g.drawImage(img,(int)x,(int)y,null);
		x += 3;
		y += 3;
		if(x>=300&&y>=300){
			x = 100;
			y = 100;
		}
	}
	/**
	 * 定义一个重画窗口的线程类，是一个内部类
	 * @author Administrator
	 *
	 */
	class PaintThread extends Thread{
		public void run(){
			while(true){
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		GameFrame gameFrame  = new GameFrame();
		gameFrame.launchFrame();
	}
}
