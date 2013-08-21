import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TennisGame extends JPanel {
	Image s1 = Toolkit.getDefaultToolkit().createImage("s1.gif");
	Image s2 = Toolkit.getDefaultToolkit().createImage("s2.gif");
	Image s3 = Toolkit.getDefaultToolkit().createImage("s3.gif");
	Image s4 = Toolkit.getDefaultToolkit().createImage("s4.gif");
	Image s5 = Toolkit.getDefaultToolkit().createImage("s5.gif");
	Image s6 = Toolkit.getDefaultToolkit().createImage("s6.gif");
	Image s7 = Toolkit.getDefaultToolkit().createImage("s7.gif");
	Image s8 = Toolkit.getDefaultToolkit().createImage("s8.gif");
	Image s9 = Toolkit.getDefaultToolkit().createImage("s9.gif");
	Image s10 = Toolkit.getDefaultToolkit().createImage("s10.gif");
	Image s11 = Toolkit.getDefaultToolkit().createImage("s11.gif");
	Image s12 = Toolkit.getDefaultToolkit().createImage("s12.gif");
	Image c40 = Toolkit.getDefaultToolkit().createImage("s4.gif");
	Image cd = Toolkit.getDefaultToolkit().createImage("cd.gif");
	Image ca = Toolkit.getDefaultToolkit().createImage("ca.gif");
	

	
	Image s0 = Toolkit.getDefaultToolkit().createImage("0.gif");
	Image s15 = Toolkit.getDefaultToolkit().createImage("15.gif");
	Image s30 = Toolkit.getDefaultToolkit().createImage("30.gif");
	Image s40 = Toolkit.getDefaultToolkit().createImage("40.gif");
	Image sd = Toolkit.getDefaultToolkit().createImage("deuce.gif");
	Image sa = Toolkit.getDefaultToolkit().createImage("adv.gif");
	
	Image wb = Toolkit.getDefaultToolkit().createImage("wb.gif");
	Image bg = Toolkit.getDefaultToolkit().createImage("bg.gif");
	Image p1 = Toolkit.getDefaultToolkit().createImage("p1.gif");
	Image p2 = Toolkit.getDefaultToolkit().createImage("p2.gif");
	Image ball = Toolkit.getDefaultToolkit().createImage("ball.gif");
	
	
	int whitescore[]={0,15,30,40,50};
	int blackscore[]={0,15,30,40,50};
	int wi=0,bi=0;
	int counter=0;
	int p1x=285;
	int p2x=p1x;
boolean start=false;
boolean atp1=false;
boolean atp2=false;
boolean p1left=false;
boolean p1right=false;
boolean p2left=false;
boolean p2right=false;
boolean addx=false;
boolean subx=false;
boolean scored=false;
boolean deuce=false,wadv=false,badv=false;

int x=1;
int p1wins=0,p2wins=0;
	int bx=p1x;int by=380;
	public TennisGame(String playerOneName, String playerTwoName) {
		
		
/*this.addKeyListener(new KeyListener(){
	

@Override
public void keyPressed(KeyEvent ke) {
	// TODO Auto-generated method stub
	
	if (ke.getKeyChar()=='d'){
		if(p1x<400)
p1right=true;
		p1x=p1x+12;
	}
	if (ke.getKeyChar()=='a'){
		if(p1x>50 )
		p1x=p1x-12;
		p1left=true;
	}
start=true;	
}

@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	p1left=false;
	 p1right=false;
	p2left=false;
 p2right=false;

}

@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}


	
	
	
	
});*/
	this.addMouseMotionListener(new MouseMotionListener(){

		@Override
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent me) {
			// TODO Auto-generated method stub
			if(me.getX()>130 &&me.getX()<380)
		p2x=me.getX();
			start=true;
		}});
	

this.setSize(570, 428);

//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
setFocusable(true);
}

@Override
public void paint(Graphics g) {
	
	// TODO Auto-generated method stub
	
g.drawImage(bg, 0, 0 , null);

g.drawImage(p1, p1x, 380, null);

g.drawImage(p2, p2x, 50, null);
g.drawImage(wb, 30, 428, null);

g.drawImage(ball, bx, by , null);


	if(wi==0){g.drawImage(s0, 42, 488, null);}
	if(wi==1){g.drawImage(s15, 42, 488, null);}
	if(wi==2){g.drawImage(s30, 42, 488, null);}
	if(wi==3){g.drawImage(s40, 42, 488, null);}
	if(whitescore[wi]==40 && blackscore[bi]==40){g.drawImage(sd, 42, 488, null);deuce=true; }
	if(wi==4 && deuce && !badv ){g.drawImage(sa, 42, 488, null);// deuce=false
			bi=3;;wadv=true;}
		
	
	if(bi==0){g.drawImage(s0, 470, 488, null);}
	if(bi==1){g.drawImage(s15, 470, 488, null);}
	if(bi==2){g.drawImage(s30, 470, 488, null);}
	if(bi==3){g.drawImage(s40, 470, 488, null);}
	if(whitescore[wi]==40 && blackscore[bi]==40){g.drawImage(sd, 470, 488, null);deuce=true;wadv=false;badv=false; }
	if(bi==4 && deuce && !wadv){g.drawImage(sa, 470, 488, null); deuce=true;badv=true;}
	
	
	
	
	
	




if(start){
	scored=false;
	if(by==380 && (bx>=p1x && bx<(p1x+80) )){	
	subx=false;
	addx=false;
		
		atp1=true;
	atp2=false;
	counter=0;
	if(p1left){
		subx=true;
			}
	if(p1right){
		addx=true;
			}

	}
	
	if(by==50 &&  (bx>=p2x && bx<(p2x+80)) ){	
		atp2=true;
		atp1=false;
	counter=0;	


	
	
	}
	
	if (atp1){
		by--;
		
	}		

	if (atp2){
		by++;
	}		
	
	if (subx && (counter%3==0)){
				
		bx--;}
	
	if (addx && (counter%3==0)){
		
		bx++;}
	
	
	
	counter++;
}
/*try {
	Thread.sleep(1);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}*/
if(by>450){
	scored=true;
	start=false;
	p1x=285;
	p2x=285;
	bx=p1x;
	by=380;
	if(bi<4){	
	bi++; }

if(bi==4){bi=0;wi=0;p2x++;}
	if(blackscore[bi]==50 && whitescore[wi]!=40){
		
p2x++;
if(p2x==2){
	System.out.println("Black Wins");
	
}

		bi=0;wi=0;
		
	};
}
else if (by<10) {	scored=true;
start=false;
bx=p1x;
p1x=285;
p2x=285;
by=380;

if(wi<4){wi++;}
if(wi==4){bi=0;wi=0;p1x++;}
if(blackscore[bi]!=40 && whitescore[wi]==50){
	//System.out.println("white Wins");
	p1x++;
	//by=55;
	bi=0;wi=0;
	if(p1x==2){
		System.out.println("white Wins");
		
	}
	
};

}
repaint();
	//super.paint(g);


}


}
