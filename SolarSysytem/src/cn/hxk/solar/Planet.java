package cn.hxk.solar;

import java.awt.Color;
import java.awt.Graphics;

import cn.hxk.util.GameUtil;

public class Planet extends Star{
	
	double longAxis;  //椭圆的长轴
	double shortAxis;//椭圆的短轴
	double speed;    //飞行的速度
	double degree;
	Star center;
	
	
	boolean satellite;
	
	public void draw(Graphics g){
		super.draw(g);
		move();
		if(!satellite){
			
			drawTrace(g);
		}
	}
	
	public void drawTrace(Graphics g){
		double _x, _y, _width, _height;
		
		_width = longAxis*2;
		_height = shortAxis*2;
		_x = (center.x + center.width/2)-longAxis;
		_y = (center.y + center.height/2)-shortAxis;
		
		Color c = g.getColor();
		g.setColor(Color.blue);
		g.drawOval((int)_x,(int)_y,(int)_width,(int)_height);
		g.setColor(c);
	}
	
	
	public void move(){
		//沿着椭圆飞
		x = (center.x+center.width/2) + longAxis*Math.cos(degree);
		y = (center.y+center.height/2) + shortAxis*Math.sin(degree);
				
		degree += speed;
	}
	
	
	public Planet(String imgpath,double longAxis,
			double shortAxis, double speed, Star center) {
		super(GameUtil.getImage(imgpath));
		this.center = center;
		this.x = center.x + longAxis;
		this.y = center.y;
				
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		
	}
	
	public Planet(String imgpath,double longAxis,
			double shortAxis, double speed, Star center,boolean satellite) {
		this(imgpath,longAxis,shortAxis,speed,center);
		this.satellite = satellite;
		
	}

	
	
}
