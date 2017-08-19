package cn.hxk.solar;

import java.awt.Graphics;
import java.awt.Image;
import cn.hxk.util.GameUtil;
import cn.hxk.util.MyFrame;

/**
 * 太阳系的主窗口
 * @author Administrator
 *
 */
public class SolarFrame  extends MyFrame{
	
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	public void paint(Graphics g){
		
		g.drawImage(bg,0,0,null);
	}
	
	public static void main(String[] args){
		new SolarFrame().launchFrame();
	}
	
}
