package cn.hxk.solar;

import java.awt.Graphics;
import java.awt.Image;

import cn.hxk.util.Constant;
import cn.hxk.util.GameUtil;
import cn.hxk.util.MyFrame;

/**
 * 太阳系的主窗口
 * @author Administrator
 *
 */
public class SolarFrame  extends MyFrame{
	
	Image bg = GameUtil.getImage("images/bg.jpg");
	Star sun = new Star("images/sun.jpg",Constant.GAME_WIDTH/2,Constant.GAME_HEIGHT/2);
	Planet earth = new Planet("images/Earth.jpg",150,100,0.1,sun);
	Planet Mars = new Planet("images/Mars.jpg",200,130,0.2,sun);
	Planet moon = new Planet("images/moon.jpg",30,20,0.3,earth,true);
	
	public void paint(Graphics g){
		
		g.drawImage(bg,0,0,null);
		sun.draw(g);
		earth.draw(g);
		Mars.draw(g);
		
		moon.draw(g);
	}
	
	public static void main(String[] args){
		new SolarFrame().launchFrame();
	}
	
}
