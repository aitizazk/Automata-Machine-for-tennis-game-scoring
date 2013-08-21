import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Automata extends JPanel {
	TennisGame tg=new TennisGame("p1","p2");;
	Image start = Toolkit.getDefaultToolkit().createImage("start.gif");
	Image left = Toolkit.getDefaultToolkit().createImage("right.gif");
	Image down = Toolkit.getDefaultToolkit().createImage("down.gif");
	Image right = Toolkit.getDefaultToolkit().createImage("left.gif");
	Image bg = Toolkit.getDefaultToolkit().createImage("fabg.gif");
	Image state = Toolkit.getDefaultToolkit().createImage("state.gif");
	Image fa = Toolkit.getDefaultToolkit().createImage("Tennis State Diagram.gif");
	Image states[]={tg.s1,tg.s2,tg.s3,tg.c40,tg.cd,tg.ca};;
	Label lab=new Label("FINITE AUTOMATA");
	//Image	 temp=scores[tg.wi];
//	Image	 temp2=scores[tg.bi];
//	boolean la =false;
	int startx=30;
	int starty =30;
int pos[]={0,0,0,0,0,0,0};
int posi=0;
	boolean scored;
		int j=0,k=0,l=0;
	int x=-1,y=-1,z=-1,a=0,b=-1;
	public Automata(){
		
JFrame frame=new JFrame("");
frame.setSize(1600, 600);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.setVisible(true);
frame.setBackground(Color.WHITE);

frame.addKeyListener(new KeyListener(){
	

@Override
public void keyPressed(KeyEvent ke) {
	// TODO Auto-generated method stub
	
	if (ke.getKeyChar()=='d'){
		if(tg.p1x<400)
tg.p1right=true;
		tg.p1x=tg.p1x+12;
	}
	if (ke.getKeyChar()=='a'){
		if(tg.p1x>50 )
		tg.p1x=tg.p1x-12;
		tg.p1left=true;
	}
tg.start=true;	
}

@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	tg.p1left=false;
	 tg.p1right=false;
	tg.p2left=false;
 tg.p2right=false;

}

@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}


	
	
	
	
});
	this.add(lab);
//tg= new TennisGame("p1","p2");
	frame.setLayout(new GridLayout(1,2));

	frame.add(tg);
	frame.add(this);
	}
	
	@Override
	public void paint(Graphics g) {
		
		// TODO Auto-generated method stub
		
	g.drawImage(bg, 0, 0 , null); 
	g.drawImage(start, 30, 30 , null);
	g.drawImage(fa, 30, 300 , null);
	
if(tg.scored){
	if(a==1){b=b+2;}
	if(b==9){b=b-2;}
	if(y==1&& x==7 && z!=9){
		z=z+2;
		
		
		
	}
	x=x+2;
	if(x==9&& y==-1){x=x-2;y=y+2;}
	if(x==9){
	x=x-2;}
	if(z==9){z=7; a=1;}
		tg.scored=false;

	}
	
if(x!=-1){
	
	if(x<9){printright(g);}
	if(b<9){
		for(int i=1;i<=b ;i=i+2){
			

			g.drawImage(right,l+(50*i), starty+200 , null);
			
			g.drawImage(state, l+(50*i)+50, starty+200 , null);
					
			
		
		}
		
		
	}
	if(z<9){
		
		printleft(g);}
	if(y==1){

	g.drawImage(down, j ,starty+50 , null);
	
	g.drawImage(state, j, starty+100 , null);;}
	
if(a==1){

	g.drawImage(down, l ,starty+150 , null);
	
	g.drawImage(state, l, starty+200 , null);;}
	}

	repaint();
	
	} 
	
	
	public void printright(Graphics g){
		posi=0;
		
		for(int i=1;i<=x ;i=i+2,posi++){
		

			g.drawImage(right, startx+(50*i), starty , null);
			
			g.drawImage(state, startx + ((50*i)+50), starty , null);
			
			
			if(i==1){		
			g.drawImage(states[0], startx + ((50*i)+50) + 12, starty + 13 , null);
			}j=startx + ((50*i)+50);
			k=j;
		}
		
	}
	
public void printleft(Graphics g){
		
		for(int i=1;i<=z ;i=i+2){
		

			g.drawImage(left, k-(50*i), starty+100 , null);
			
			g.drawImage(state, k - ((50*i)+50), starty+100 , null);
					
			l=k - ((50*i)+50);
		}
		
	}
}
