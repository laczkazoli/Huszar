package pkg;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.SwingUtilities;

public class Huszar {
	int x1=0,y1=0,x2=7,y2=7;

	protected static int poz = 11;
	protected static int poz2 = 88;
	private JFrame frame;
	private JFrame frame1;
	
	/**
	 * Print into a frame who is the winner.
	 */
	
	public void nyertes(int lepes)
	{

		if(lepesek(lepes)==0)
		{
			JFrame frame1 = new JFrame();
		    JLabel label = new JLabel("A fekete huszar nyert");
		    label.setFont(new Font("Eredmeny", Font.PLAIN, 36));
		    frame1.add(label);
		    frame1.setBounds(200, 200, 400, 150);
		    frame1.setVisible(true);
			
		}
		if(lepesek(lepes)==1)
		{
			JFrame frame1 = new JFrame();
		    JLabel label = new JLabel("A feher huszar nyert");
		    label.setFont(new Font("Eredmeny", Font.PLAIN, 36));
		    frame1.add(label);
		    frame1.setBounds(200, 200, 400, 150);
		    frame1.setVisible(true);
		}
	}
	/**
	 * Check who's round is it.
	 */
	
	public int lepesek(int lepes )
	{
		if (lepes % 2 ==0)
			return 0;
		else
			return 1;
	}
	final static int matrix[][]=new int[8][8];
	
	/**
	 * Check that a step is right or not.
	 */

	
	public boolean lepheteke(int poz)
	{
		if(poz==11)
		{
			if(matrix[2][1]==1 && matrix[1][2]==1)
				return true;
			else 
			{
				matrix[0][1]=1;
				return false;
			}
				
		}
		
		if(poz==12)
		{
			if(matrix[2][0]==1 && matrix[2][2]==1 && matrix[1][3]==1)
				return true;
			else 
			{
				matrix[0][1]=1;
				return false;
			}
				
		}
		if(poz==13)
		{
			if(matrix[2][1]==1 && matrix[2][3]==1 && matrix[1][0]==1 && matrix[2][4]==1)
				return true;
			else 
			{
				matrix[0][2]=1;
				return false;
			}
		}
		if(poz==14)
		{
			if(matrix[2][2]==1 && matrix[2][4]==1 && matrix[1][1]==1 && matrix[2][5]==1)
				return true;
			else 
			{
				matrix[0][3]=1;
				return false;
			}
		}
		if(poz==15)
		{
			if(matrix[2][3]==1 && matrix[2][5]==1 && matrix[1][2]==1 && matrix[2][6]==1)
				return true;
			else 
			{
				matrix[0][4]=1;
				return false;
			}
		}
		if(poz==16)
		{
			if(matrix[2][4]==1 && matrix[2][6]==1 && matrix[1][3]==1 && matrix[2][7]==1)
				return true;
			else 
			{
				matrix[0][5]=1;
				return false;
			}
		}
		if(poz==17)
		{
			if(matrix[2][5]==1 && matrix[2][7]==1 && matrix[1][4]==1)
				return true;
			else 
			{
				matrix[0][6]=1;
				return false;
			}
		}
		if(poz==18)
		{
			if(matrix[2][6]==1 && matrix[1][5]==1)
				return true;
			else 
			{
				matrix[0][7]=1;
				return false;
			}
		}
		if(poz==21)
		{
			if(matrix[3][1]==1 && matrix[2][2]==1 && matrix[0][2]==1 )
				return true;
			else 
			{
				matrix[1][0]=1;
				return false;
			}
		}
		if(poz==22)
		{
			if(matrix[3][0]==1 && matrix[3][2]==1 && matrix[2][3]==1 && matrix[0][3]==1)
				return true;
			else 
			{
				matrix[1][1]=1;
				return false;
			}
		}
		if(poz==23)
		{
			if(matrix[3][1]==1 && matrix[3][3]==1 && matrix[2][4]==1 && matrix[0][4]==1 && matrix[2][0]==1 && matrix[0][0]==1)
				return true;
			else 
			{
				matrix[1][2]=1;
				return false;
			}
		}
		if(poz==24)
		{
			if(matrix[3][2]==1 && matrix[3][4]==1 && matrix[2][5]==1 && matrix[0][5]==1 && matrix[2][1]==1 && matrix[0][1]==1)
				return true;
			else 
			{
				matrix[1][3]=1;
				return false;
			}
		}
		if(poz==25)
		{
			if(matrix[3][3]==1 && matrix[3][5]==1 && matrix[2][6]==1 && matrix[0][6]==1 && matrix[2][2]==1 && matrix[0][2]==1)
				return true;
			else 
			{
				matrix[1][4]=1;
				return false;
			}
		}
		if(poz==26)
		{
			if(matrix[3][4]==1 && matrix[3][6]==1 && matrix[2][7]==1 && matrix[0][7]==1 && matrix[2][3]==1 && matrix[0][3]==1)
				return true;
			else 
			{
				matrix[1][5]=1;
				return false;
			}
		}
		if(poz==27)
		{
			if(matrix[3][5]==1 && matrix[3][7]==1 && matrix[2][4]==1 && matrix[0][4]==1)
				return true;
			else 
			{
				matrix[1][6]=1;
				return false;
			}
		}
		if(poz==28)
		{
			if(matrix[3][6]==1 && matrix[2][5]==1 && matrix[0][5]==1)
				return true;
			else 
			{
				matrix[1][7]=1;
				return false;
			}
		}
		if(poz==31)
		{
			if(matrix[4][1]==1 && matrix[3][2]==1 && matrix[1][2]==1 && matrix[0][1]==1)
				return true;
			else 
			{
				matrix[2][0]=1;
				return false;
			}
		}
		if(poz==32)
		{
			if(matrix[4][0]==1 && matrix[4][2]==1 && matrix[3][3]==1 && matrix[1][3]==1 && matrix[0][0]==1 && matrix[0][2]==1)
				return true;
			else 
			{
				matrix[2][1]=1;
				return false;
			}
		}
		if(poz==33)
		{
			if(matrix[4][1]==1 && matrix[4][3]==1 && matrix[3][4]==1 && matrix[1][4]==1 && matrix[0][1]==1 && matrix[0][3]==1 && matrix[3][0]==1 && matrix[1][0]==1)
				return true;
			else 
			{
				matrix[2][2]=1;
				return false;
			}
		}
		if(poz==34)
		{
			if(matrix[4][2]==1 && matrix[4][4]==1 && matrix[3][5]==1 && matrix[1][5]==1 && matrix[0][2]==1 && matrix[0][4]==1 && matrix[3][1]==1 && matrix[1][1]==1)
				return true;
			else 
			{
				matrix[2][3]=1;
				return false;
			}
		}
		if(poz==35)
		{
			if(matrix[4][3]==1 && matrix[4][5]==1 && matrix[3][6]==1 && matrix[1][6]==1 && matrix[0][3]==1 && matrix[0][5]==1 && matrix[3][2]==1 && matrix[1][2]==1)
				return true;
			else 
			{
				matrix[2][4]=1;
				return false;
			}
		}
		if(poz==36)
		{
			if(matrix[4][4]==1 && matrix[4][6]==1 && matrix[3][7]==1 && matrix[1][7]==1 && matrix[0][4]==1 && matrix[0][6]==1 && matrix[3][3]==1 && matrix[1][3]==1)
				return true;
			else 
			{
				matrix[2][5]=1;
				return false;
			}
		}
		if(poz==37)
		{
			if(matrix[4][5]==1 && matrix[4][7]==1 && matrix[0][5]==1 && matrix[0][7]==1 && matrix[3][4]==1 && matrix[1][4]==1)
				return true;
			else 
			{
				matrix[2][6]=1;
				return false;
			}
		}
		if(poz==38)
		{
			if(matrix[4][6]==1 && matrix[0][6]==1 && matrix[3][5]==1 && matrix[1][5]==1)
				return true;
			else 
			{
				matrix[2][7]=1;
				return false;
			}
		}
		if(poz==41)
		{
			if(matrix[5][1]==1 && matrix[5][2]==1 && matrix[2][2]==1 && matrix[1][1]==1)
				return true;
			else 
			{
				matrix[3][0]=1;
				return false;
			}
		}
		if(poz==42)
		{
			if(matrix[5][0]==1 && matrix[5][2]==1 && matrix[4][3]==1 && matrix[2][3]==1 && matrix[1][0]==1 && matrix[1][2]==1)
				return true;
			else 
			{
				matrix[3][1]=1;
				return false;
			}
		}
		if(poz==43)
		{
			if(matrix[5][1]==1 && matrix[5][3]==1 && matrix[4][4]==1 && matrix[2][4]==1 && matrix[1][1]==1 && matrix[1][3]==1 && matrix[4][0]==1 && matrix[2][0]==1)
				return true;
			else 
			{
				matrix[3][2]=1;
				return false;
			}
		}
		if(poz==44)
		{
			if(matrix[5][2]==1 && matrix[5][4]==1 && matrix[4][5]==1 && matrix[2][5]==1 && matrix[1][2]==1 && matrix[1][4]==1 && matrix[4][1]==1 && matrix[2][1]==1)
				return true;
			else 
			{
				matrix[3][3]=1;
				return false;
			}
		}
		if(poz==45)
		{
			if(matrix[5][3]==1 && matrix[5][5]==1 && matrix[4][6]==1 && matrix[2][6]==1 && matrix[1][3]==1 && matrix[1][5]==1 && matrix[4][2]==1 && matrix[2][2]==1)
				return true;
			else 
			{
				matrix[3][4]=1;
				return false;
			}
		}
		if(poz==46)
		{
			if(matrix[5][4]==1 && matrix[5][6]==1 && matrix[4][7]==1 && matrix[2][7]==1 && matrix[1][4]==1 && matrix[1][6]==1 && matrix[4][3]==1 && matrix[2][3]==1)
				return true;
			else 
			{
				matrix[3][5]=1;
				return false;
			}
		}
		if(poz==47)
		{
			if(matrix[5][5]==1 && matrix[5][7]==1 && matrix[1][5]==1 && matrix[1][7]==1 && matrix[4][4]==1 && matrix[2][4]==1)
				return true;
			else 
			{
				matrix[3][6]=1;
				return false;
			}
		}
		if(poz==48)
		{
			if(matrix[5][6]==1 && matrix[1][6]==1 && matrix[4][5]==1 && matrix[2][5]==1)
				return true;
			else 
			{
				matrix[3][7]=1;
				return false;
			}
		}
		if(poz==51)
		{
			if(matrix[6][1]==1 && matrix[6][2]==1 && matrix[3][2]==1 && matrix[2][1]==1)
				return true;
			else 
			{
				matrix[4][0]=1;
				return false;
			}
		}
		if(poz==52)
		{
			if(matrix[6][0]==1 && matrix[6][2]==1 && matrix[5][3]==1 && matrix[3][3]==1 && matrix[2][0]==1 && matrix[2][2]==1)
				return true;
			else 
			{
				matrix[4][1]=1;
				return false;
			}
		}
		if(poz==53)
		{
			if(matrix[6][1]==1 && matrix[6][3]==1 && matrix[5][4]==1 && matrix[3][4]==1 && matrix[2][1]==1 && matrix[2][3]==1 && matrix[5][0]==1 && matrix[3][0]==1)
				return true;
			else 
			{
				matrix[4][2]=1;
				return false;
			}
		}
		if(poz==54)
		{
			if(matrix[6][2]==1 && matrix[6][4]==1 && matrix[5][5]==1 && matrix[3][5]==1 && matrix[2][2]==1 && matrix[2][4]==1 && matrix[5][1]==1 && matrix[3][1]==1)
				return true;
			else 
			{
				matrix[4][3]=1;
				return false;
			}
		}
		if(poz==55)
		{
			if(matrix[6][3]==1 && matrix[6][5]==1 && matrix[5][6]==1 && matrix[3][6]==1 && matrix[2][3]==1 && matrix[2][5]==1 && matrix[5][2]==1 && matrix[3][2]==1)
				return true;
			else 
			{
				matrix[4][4]=1;
				return false;
			}
		}
		if(poz==56)
		{
			if(matrix[6][4]==1 && matrix[6][6]==1 && matrix[5][7]==1 && matrix[3][7]==1 && matrix[2][4]==1 && matrix[2][6]==1 && matrix[5][3]==1 && matrix[3][3]==1)
				return true;
			else 
			{
				matrix[4][5]=1;
				return false;
			}
		}
		if(poz==57)
		{
			if(matrix[6][5]==1 && matrix[6][7]==1 && matrix[2][5]==1 && matrix[2][7]==1 && matrix[5][4]==1 && matrix[3][4]==1)
				return true;
			else 
			{
				matrix[4][6]=1;
				return false;
			}
		}
		if(poz==58)
		{
			if(matrix[6][6]==1 && matrix[2][6]==1 && matrix[5][5]==1 && matrix[3][5]==1)
				return true;
			else 
			{
				matrix[4][7]=1;
				return false;
			}
		}
		
		if(poz==61)
		{
			if(matrix[7][1]==1 && matrix[7][2]==1 && matrix[4][2]==1 && matrix[3][1]==1)
				return true;
			else 
			{
				matrix[5][0]=1;
				return false;
			}
		}
		if(poz==62)
		{
			if(matrix[7][0]==1 && matrix[7][2]==1 && matrix[6][3]==1 && matrix[4][3]==1 && matrix[3][0]==1 && matrix[3][2]==1)
				return true;
			else 
			{
				matrix[5][1]=1;
				return false;
			}
		}
		if(poz==63)
		{
			if(matrix[7][1]==1 && matrix[7][3]==1 && matrix[6][4]==1 && matrix[4][4]==1 && matrix[3][1]==1 && matrix[3][3]==1 && matrix[6][0]==1 && matrix[4][0]==1)
				return true;
			else 
			{
				matrix[5][2]=1;
				return false;
			}
		}
		if(poz==64)
		{
			if(matrix[7][2]==1 && matrix[7][4]==1 && matrix[6][5]==1 && matrix[4][5]==1 && matrix[3][2]==1 && matrix[3][4]==1 && matrix[6][1]==1 && matrix[4][1]==1)
				return true;
			else 
			{
				matrix[5][3]=1;
				return false;
			}
		}
		if(poz==65)
		{
			if(matrix[7][3]==1 && matrix[7][5]==1 && matrix[6][6]==1 && matrix[4][6]==1 && matrix[3][3]==1 && matrix[3][5]==1 && matrix[6][2]==1 && matrix[4][2]==1)
				return true;
			else 
			{
				matrix[5][4]=1;
				return false;
			}
		}
		if(poz==66)
		{
			if(matrix[7][4]==1 && matrix[7][6]==1 && matrix[6][7]==1 && matrix[4][7]==1 && matrix[3][4]==1 && matrix[3][6]==1 && matrix[6][3]==1 && matrix[4][3]==1)
				return true;
			else 
			{
				matrix[5][5]=1;
				return false;
			}
		}
		if(poz==67)
		{
			if(matrix[7][5]==1 && matrix[7][7]==1 && matrix[3][5]==1 && matrix[3][7]==1 && matrix[6][4]==1 && matrix[4][4]==1)
				return true;
			else 
			{
				matrix[5][6]=1;
				return false;
			}
		}
		if(poz==68)
		{
			if(matrix[7][6]==1 && matrix[3][6]==1 && matrix[6][5]==1 && matrix[4][5]==1)
				return true;
			else 
			{
				matrix[5][7]=1;
				return false;
			}
		}
		if(poz==71)
		{
			if(matrix[5][2]==1 && matrix[4][1]==1)
				return true;
			else 
			{
				matrix[6][0]=1;
				return false;
			}
		}
		if(poz==72)
		{
			if(matrix[7][3]==1 && matrix[5][3]==1 && matrix[4][0]==1 && matrix[4][2]==1)
				return true;
			else 
			{
				matrix[6][1]=1;
				return false;
			}
		}
		if(poz==73)
		{
			if(matrix[7][4]==1 && matrix[5][4]==1 && matrix[4][1]==1 && matrix[4][3]==1 && matrix[7][0]==1 && matrix[5][0]==1)
				return true;
			else 
			{
				matrix[6][2]=1;
				return false;
			}
		}
		if(poz==74)
		{
			if( matrix[7][5]==1 && matrix[5][5]==1 && matrix[4][2]==1 && matrix[4][4]==1 && matrix[7][1]==1 && matrix[5][1]==1)
				return true;
			else 
			{
				matrix[6][3]=1;
				return false;
			}
		}
		if(poz==75)
		{
			if(matrix[7][6]==1 && matrix[5][6]==1 && matrix[4][3]==1 && matrix[4][5]==1 && matrix[7][2]==1 && matrix[5][2]==1)
				return true;
			else 
			{
				matrix[6][4]=1;
				return false;
			}
		}
		if(poz==76)
		{
			if(matrix[7][7]==1 && matrix[5][7]==1 && matrix[4][4]==1 && matrix[4][6]==1 && matrix[7][3]==1 && matrix[5][3]==1)
				return true;
			else 
			{
				matrix[6][5]=1;
				return false;
			}
		}
		if(poz==77)
		{
			if(matrix[4][5]==1 && matrix[4][7]==1 && matrix[7][4]==1 && matrix[5][4]==1)
				return true;
			else 
			{
				matrix[6][6]=1;
				return false;
			}
		}
		if(poz==78)
		{
			if(matrix[4][6]==1 && matrix[7][5]==1 && matrix[5][5]==1)
				return true;
			else 
			{
				matrix[6][7]=1;
				return false;
			}
		}
		if(poz==81)
		{
			if(matrix[6][2]==1 && matrix[5][1]==1)
				return true;
			else 
			{
				matrix[7][0]=1;
				return false;
			}
		}
		if(poz==82)
		{
			if(matrix[6][3]==1 && matrix[5][0]==1 && matrix[5][2]==1)
				return true;
			else 
			{
				matrix[7][1]=1;
				return false;
			}
		}
		if(poz==83)
		{
			if( matrix[6][4]==1 && matrix[5][1]==1 && matrix[5][3]==1 && matrix[6][0]==1)
				return true;
			else 
			{
				matrix[7][2]=1;
				return false;
			}
		}
		if(poz==84)
		{
			if( matrix[6][5]==1 && matrix[5][2]==1 && matrix[5][4]==1 && matrix[6][1]==1)
				return true;
			else 
			{
				matrix[7][3]=1;
				return false;
			}
		}
		if(poz==85)
		{
			if( matrix[6][6]==1 && matrix[5][3]==1 && matrix[5][5]==1 && matrix[6][2]==1)
				return true;
			else 
			{
				matrix[7][4]=1;
				return false;
			}
		}
		if(poz==86)
		{
			if(matrix[6][7]==1 && matrix[5][4]==1 && matrix[5][6]==1 && matrix[6][3]==1)
				return true;
			else 
			{
				matrix[7][5]=1;
				return false;
			}
		}
		if(poz==87)
		{
			if(matrix[5][5]==1 && matrix[5][7]==1 && matrix[6][4]==1)
				return true;
			else 
			{
				matrix[7][6]=1;
				return false;
			}
		}
		if(poz==88)
		{
			if(matrix[5][6]==1 && matrix[6][5]==1)
				return true;
			else 
			{
				matrix[7][7]=1;
				return false;
			}
		}
		
		return false;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Huszar window = new Huszar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		});
	}
	ClassLoader cl = this.getClass().getClassLoader();
	JButton button[][] = new JButton[8][8];
	Icon image2  = new ImageIcon(cl.getResource("x.png"));
	final JLabel imagelabel2 = new JLabel(image2);
	
	public void check()
	{
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
			{
				if(matrix[i][j]==1 && ((i!=x1 && j!=y1) && (i!=x2 && j!=y2)))
				{
					frame.invalidate();
					frame.validate();
					frame.repaint();
					System.out.println("x1:"+x1+" y1:"+y1);
					System.out.println("x2:"+x2+" y2:"+y2);
					button[i][j].setIcon(image2);
					
					
				}
			}
	}

	/**
	 * Create the application.
	 */
	public Huszar() {
		initialize();
	}
	
	

	int lepes=0;
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
			{
				button[i][j]=new JButton();  
			}

		
		/**
		 * Initialize the imagines.
		 */
		ClassLoader cl = this.getClass().getClassLoader();
		Icon image1  = new ImageIcon(cl.getResource("feher.png"));
		final JLabel imagelabel = new JLabel(image1);
		imagelabel.setBounds(5, 5, 80, 80);
		
		Icon image3  = new ImageIcon(cl.getResource("fekete.png"));
		final JLabel imagelabel3 = new JLabel(image3);
		imagelabel.setBounds(565, 565, 80, 80);
		

		
		
		
		/**
		 * Reset the matrix.
		 */
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
			{
				matrix[i][j]=0;
			}
		
		/**
		 * Initialize the frame.
		 */
		frame.setBounds(50, 50, 650, 650);
		frame.getContentPane().setLayout(null);	
		frame.getContentPane().add(button[0][0]);
		button[0][0].add(imagelabel);
		button[7][7].add(imagelabel3);
		
		/**
		 * The button actions.
		 */
		button[0][0].setBounds(5, 5, 80, 80);
		button[0][0].setBackground(Color.WHITE);
		button[0][0].addActionListener(new ActionListener() {
			int szamol=1;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(szamol==0 && (lepesek(lepes)==0))
				{
					//SwingUtilities.updateComponentTreeUI(frame);
					button[0][0].add(imagelabel2);
					lepes++;
					matrix[0][0]=1;
				}
			SwingUtilities.updateComponentTreeUI(frame);
			}

		});

		button[0][1].setBounds(85, 5, 80, 80);
		button[0][1].setBackground(Color.BLACK);
		if (matrix[0][1]==1)
		{
			imagelabel2.setBounds(5, 85, 80, 80);
		}
		frame.getContentPane().add(button[0][1]);
		button[0][1].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
					if((szamol==0) && ((poz==24) || (poz ==31) || (poz==33)))
					{
						
						button[0][1].add(imagelabel);
						SwingUtilities.updateComponentTreeUI(frame);
						szamol++;
						x1=0;y1=1;check();
						matrix[0][1]=1;
						poz=12;				
						lepes++;
						if(lepheteke(poz))
						{
							nyertes(0);
						}
					}
				}
				else
				{
					if((szamol==0) && ((poz2==24) || (poz2 ==31) || (poz2==33)))
					{
					button[0][1].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=0;y2=1;check();
					matrix[0][1]=1;
					poz2=12;				
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}	
					}
				}
				if(szamol==1)
				{
					button[0][1].add(imagelabel2);
				}
				
			}
			
		});
		
		button[0][2].setBounds(165, 5, 80, 80);
		button[0][2].setBackground(Color.WHITE);
		frame.getContentPane().add(button[0][2]);
		button[0][2].addActionListener(new ActionListener() {

			int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==32) || (poz==34) || (poz ==21) || (poz==35)))
				{
				button[0][2].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=0;y1=2;check();
				matrix[0][2]=1;
				poz=13;				
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else
				{
					if((szamol==0) && ((poz2==32) || (poz2==34) || (poz2 ==21) || (poz2==35)))
					{
					button[0][2].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=0;y2=2;check();
					matrix[0][2]=1;
					poz2=13;				
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[0][2].add(imagelabel2);
				}
			}

		});
		button[0][3].setBounds(245, 5, 80, 80);
		button[0][3].setBackground(Color.BLACK);
		frame.getContentPane().add(button[0][3]);
		button[0][3].addActionListener(new ActionListener() {

			int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==33) || (poz==35) || (poz ==22) || (poz==36)))
				{
				button[0][3].add(imagelabel);
			//	SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=0;y1=3;check();
				matrix[0][3]=1;
				poz=14;				
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else
				{
					if((szamol==0) && ((poz2==33) || (poz2==35) || (poz2 ==22) || (poz2==36)))
					{
					button[0][3].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=0;y2=3;check();
					matrix[0][3]=1;
					poz2=14;				
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[0][3].add(imagelabel2);
				}
			}

		});
		button[0][4].setBounds(325, 5, 80, 80);
		button[0][4].setBackground(Color.WHITE);
		frame.getContentPane().add(button[0][4]);
		button[0][4].addActionListener(new ActionListener() {

			int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0)  && ((poz==34) || (poz==36) || (poz ==23) || (poz==37)))
				{
				button[0][4].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=0;
				y1=4;
				check();
				matrix[0][4]=1;
				
				poz=15;				
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else
				{
					if((szamol==0) && ((poz2==34) || (poz2==36) || (poz2 ==23) || (poz2==37)))
					{
					button[0][4].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=0;y2=4;check();
					matrix[0][4]=1;
					poz2=15;				
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[0][4].add(imagelabel2);
				}
			}

		});
		button[0][5].setBounds(405, 5, 80, 80);
		button[0][5].setBackground(Color.BLACK);
		frame.getContentPane().add(button[0][5]);
		button[0][5].addActionListener(new ActionListener() {

			int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==35) || (poz==37) || (poz ==24) || (poz==38)))
				{
				button[0][5].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=0;
				y1=5;
				x1=0;y1=5;check();
				matrix[0][5]=1;
				poz=16;				
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==35) || (poz2==37) || (poz2 ==24) || (poz2==38)))
					{
					button[0][5].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=0;y2=5;check();
					matrix[0][5]=1;
					poz2=16;				
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[0][5].add(imagelabel2);
				}
			}

		});
		button[0][6].setBounds(485, 5, 80, 80);
		button[0][6].setBackground(Color.WHITE);
		frame.getContentPane().add(button[0][6]);
		button[0][6].addActionListener(new ActionListener() {

			int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==36) || (poz==38) || (poz ==25)))
				{
				button[0][6].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=0;y1=6;check();
				matrix[0][6]=1;
				poz=17;				
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else 
				{
					if((szamol==0) && ((poz2==36) || (poz2==38) || (poz2 ==25)))
					{
					button[0][6].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=0;y2=6;check();
					matrix[0][6]=1;
					poz2=17;				
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}	
				}
				if(szamol==1)
				{
					button[0][6].add(imagelabel2);
				}
			}

		});
		button[0][7].setBounds(565, 5, 80, 80);
		button[0][7].setBackground(Color.BLACK);
		frame.getContentPane().add(button[0][7]);
		button[0][7].addActionListener(new ActionListener() {

			int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==37) || (poz ==26)))
				{
				button[0][7].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=0;y1=7;check();
				matrix[0][7]=1;
				poz=18;				
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else 
				{
					if((szamol==0) && ((poz2==37) || (poz2 ==26)))
					{
					button[0][7].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=0;y2=7;check();
					matrix[0][7]=1;
					poz2=18;				
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[0][7].add(imagelabel2);
				}
			}

		});
		button[1][0].setBounds(5, 85, 80, 80);
		button[1][0].setBackground(Color.BLACK);
		frame.getContentPane().add(button[1][0]);
		button[1][0].addActionListener(new ActionListener() {

			int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==42) || (poz ==33) || (poz==13)))
				{
				button[1][0].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=1;y1=0;check();
				matrix[1][0]=1;
				poz=21;				
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else 
				{
					if((szamol==0) && ((poz2==42) || (poz2 ==33) || (poz2==13)))
					{
					button[1][0].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=1;y2=0;check();
					matrix[1][0]=1;
					poz2=21;				
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[1][0].add(imagelabel2);
				}
			}

		});
		button[1][1].setBounds(85, 85, 80, 80);
		button[1][1].setBackground(Color.WHITE);
		frame.getContentPane().add(button[1][1]);
		button[1][1].addActionListener(new ActionListener() {

			int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==41) || (poz ==43) || (poz==34) || (poz==14)))
				{
				button[1][1].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=1;y1=1;check();
				matrix[1][1]=1;
				poz=22;				
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else {
					if((szamol==0) && ((poz2==41) || (poz2 ==43) || (poz2==34) || (poz2==14)))
					{
					button[1][1].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=1;y2=1;check();
					matrix[1][1]=1;
					poz2=22;				
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[1][1].add(imagelabel2);
				}
			}

		});
		button[1][2].setBounds(165, 85, 80, 80);
		button[1][2].setBackground(Color.BLACK);
		frame.getContentPane().add(button[1][2]);
		button[1][2].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==42) || (poz ==44) || (poz==35) || (poz==15) || (poz==31) || (poz==11) ))
				{
				button[1][2].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				matrix[0][0]=1;
				x1=1;
				y1=2;check();
				
				matrix[1][2]=1;
				
				poz=23;
				lepes++;
				
			    
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else {
					if((szamol==0) && ((poz2==42) || (poz2 ==44) || (poz2==35) || (poz2==15) || (poz2==31) || (poz2==11) ))
					{
					button[1][2].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=1;y2=2;check();
					matrix[1][2]=1;
					poz2=23;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[1][2].add(imagelabel2);
				}
			}

		});
		button[1][3].setBounds(245, 85, 80, 80);
		button[1][3].setBackground(Color.WHITE);
		frame.getContentPane().add(button[1][3]);
		button[1][3].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==43) || (poz ==45) || (poz==36) || (poz==16) || (poz==32) || (poz==12) ))
				{
				button[1][3].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=1;y1=3;check();
				matrix[1][3]=1;
				poz=24;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else {
					if((szamol==0) && ((poz2==43) || (poz2 ==45) || (poz2==36) || (poz2==16) || (poz2==32) || (poz2==12) ))
					{
					button[1][3].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=1;y2=3;check();
					matrix[1][3]=1;
					poz2=24;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				
				if(szamol==1)
				{
					button[1][3].add(imagelabel2);
				}
			}
			
		});
		button[1][4].setBounds(325, 85, 80, 80);
		button[1][4].setBackground(Color.BLACK);
		frame.getContentPane().add(button[1][4]);
		button[1][4].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==44) || (poz ==46) || (poz==37) || (poz==17) || (poz==33) || (poz==13) ))
				{
				button[1][4].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=1;y1=4;check();
				matrix[1][4]=1;
				poz=25;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==44) || (poz2 ==46) || (poz2==37) || (poz2==17) || (poz2==33) || (poz2==13) ))
					{
					button[1][4].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=1;y2=4;check();
					matrix[1][4]=1;
					poz2=25;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[1][4].add(imagelabel2);
				}
			}

		});
		button[1][5].setBounds(405, 85, 80, 80);
		button[1][5].setBackground(Color.WHITE);
		frame.getContentPane().add(button[1][5]);
		button[1][5].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==45) || (poz ==47) || (poz==38) || (poz==18) || (poz==34) || (poz==14) ))
				{
				button[1][5].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=1;y1=5;check();
				matrix[1][5]=1;
				poz=26;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else {
					if((szamol==0) && ((poz2==45) || (poz2==47) || (poz2==38) || (poz2==18) || (poz2==34) || (poz2==14) ))
					{
					button[1][5].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=1;y2=5;check();
					matrix[1][5]=1;
					poz2=26;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[1][5].add(imagelabel2);
				}
			}

		});button[1][6].setBounds(485, 85, 80, 80);
		button[1][6].setBackground(Color.BLACK);
		frame.getContentPane().add(button[1][6]);
		button[1][6].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==46) || (poz ==48) || (poz==35) || (poz==15) ))
				{
				button[1][6].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=1;y1=6;check();
				matrix[1][6]=1;
				poz=27;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==46) || (poz2 ==48) || (poz2==35) || (poz2==15) ))
					{
					button[1][6].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=1;y2=6;check();
					matrix[1][6]=1;
					poz2=27;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				
				if(szamol==1)
				{
					button[1][6].add(imagelabel2);
				}
			}

		});
		button[1][7].setBounds(565, 85, 80, 80);
		button[1][7].setBackground(Color.WHITE);
		frame.getContentPane().add(button[1][7]);
		button[1][7].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==47) || (poz==36) || (poz==16) ))
				{
				button[1][7].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=1;y1=7;check();
				matrix[1][7]=1;
				poz=28;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else {
					if((szamol==0) && ((poz2==47) || (poz2==36) || (poz2==16) ))
					{
					button[1][7].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=1;y2=7;check();
					matrix[1][7]=1;
					poz2=28;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[1][7].add(imagelabel2);
				}
			}

		});
		button[2][0].setBounds(5, 165, 80, 80);
		button[2][0].setBackground(Color.WHITE);
		frame.getContentPane().add(button[2][0]);
		button[2][0].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==52) || (poz==43) || (poz==23) || (poz==12)))
				{
				button[2][0].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=2;y1=0;check();
				matrix[2][0]=1;
				poz=31;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==52) || (poz2==43) || (poz2==23) || (poz2==12)))
					{
					button[2][0].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=2;y2=0;check();
					matrix[2][0]=1;
					poz2=31;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				
				if(szamol==1)
				{
					button[2][0].add(imagelabel2);
				}
			}

		});
		button[2][1].setBounds(85, 165, 80, 80);
		button[2][1].setBackground(Color.BLACK);
		frame.getContentPane().add(button[2][1]);
		button[2][1].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==51) || (poz==53) || (poz==44) || (poz==24) || (poz==11) || (poz==13)))
				{
				button[2][1].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				matrix[0][0]=1;
				x1=2;y1=1;check();
				matrix[2][1]=1;
				poz=32;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==51) || (poz2==53) || (poz2==44) || (poz2==24) || (poz2==11) || (poz2==13)))
					{
					button[2][1].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=2;y2=1;check();
					matrix[2][1]=1;
					poz2=32;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[2][1].add(imagelabel2);
				}
			}

		});
		button[2][2].setBounds(165,165, 80, 80);
		button[2][2].setBackground(Color.WHITE);
		frame.getContentPane().add(button[2][2]);
		button[2][2].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==52) || (poz==54) || (poz==45) || (poz==25) || (poz==12) || (poz==14) || (poz==41) || (poz==21)))
				{
				button[2][2].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=2;y1=2;check();
				matrix[2][2]=1;
				poz=33;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==52) || (poz2==54) || (poz2==45) || (poz2==25) || (poz2==12) || (poz2==14) || (poz2==41) || (poz2==21)))
					{
					button[2][2].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=2;y2=2;check();
					matrix[2][2]=1;
					poz2=33;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[2][2].add(imagelabel2);
				}
			}

		});
		button[2][3].setBounds(245, 165, 80, 80);
		button[2][3].setBackground(Color.BLACK);
		frame.getContentPane().add(button[2][3]);
		button[2][3].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==53) || (poz==55) || (poz==46) || (poz==26) || (poz==13) || (poz==15) || (poz==42) || (poz==22)))
				{
				button[2][3].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=2;y1=3;check();
				matrix[2][3]=1;
				poz=34;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==53) || (poz2==55) || (poz2==46) || (poz2==26) || (poz2==13) || (poz2==15) || (poz2==42) || (poz2==22)))
				{
				button[2][3].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x2=2;y2=3;check();
				matrix[2][3]=1;
				poz2=34;
				lepes++;
				if(lepheteke(poz2))
				{
					nyertes(1);
				}
				}}
				if(szamol==1)
				{
					button[2][3].add(imagelabel2);
				}
			}

		});
		button[2][4].setBounds(325, 165, 80, 80);
		button[2][4].setBackground(Color.WHITE);
		frame.getContentPane().add(button[2][4]);
		button[2][4].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==54) || (poz==56) || (poz==47) || (poz==27) || (poz==14) || (poz==16) || (poz==43) || (poz==23)))
				{
				button[2][4].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=2;y1=4;check();
				matrix[2][4]=1;
				poz=35;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==54) || (poz2==56) || (poz2==47) || (poz2==27) || (poz2==14) || (poz2==16) || (poz2==43) || (poz2==23)))
					{
					button[2][4].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=2;y2=4;check();
					matrix[2][4]=1;
					poz2=35;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[2][4].add(imagelabel2);
				}
			}

		});
		button[2][5].setBounds(405, 165, 80, 80);
		button[2][5].setBackground(Color.BLACK);
		frame.getContentPane().add(button[2][5]);
		button[2][5].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==55) || (poz==57) || (poz==48) || (poz==28) || (poz==15) || (poz==17) || (poz==44) || (poz==24)))
				{
				button[2][5].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=2;y1=5;check();
				matrix[2][5]=1;
				poz=36;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else {
					if((szamol==0) && ((poz2==55) || (poz2==57) || (poz2==48) || (poz2==28) || (poz2==15) || (poz2==17) || (poz2==44) || (poz2==24)))
					{
					button[2][5].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=2;y2=5;check();
					matrix[2][5]=1;
					poz2=36;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[2][5].add(imagelabel2);
				}
			}

		});
		button[2][6].setBounds(485, 165, 80, 80);
		button[2][6].setBackground(Color.WHITE);
		frame.getContentPane().add(button[2][6]);
		button[2][6].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==56) || (poz==58) || (poz==16) || (poz==18) || (poz==45) || (poz==25)))
				{
				button[2][6].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=2;y1=6;check();
				matrix[2][6]=1;
				poz=37;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else {
					if((szamol==0) && ((poz2==56) || (poz2==58) || (poz2==16) || (poz2==18) || (poz2==45) || (poz2==25)))
					{
					button[2][6].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=2;y2=6;check();
					matrix[2][6]=1;
					poz2=37;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[2][6].add(imagelabel2);
				}
			}

		});
		button[2][7].setBounds(565, 165, 80, 80);
		button[2][7].setBackground(Color.BLACK);
		frame.getContentPane().add(button[2][7]);
		button[2][7].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==57) || (poz==17) || (poz==46) || (poz==26)))
				{
				button[2][7].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=2;y1=7;check();
				matrix[2][7]=1;
				poz=38;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==57) || (poz2==17) || (poz2==46) || (poz2==26)))
					{
					button[2][7].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=2;y2=7;check();
					matrix[2][7]=1;
					poz2=38;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[2][7].add(imagelabel2);
				}
			}

		});
		button[3][0].setBounds(5, 245, 80, 80);
		button[3][0].setBackground(Color.BLACK);
		frame.getContentPane().add(button[3][0]);
		button[3][0].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==62) || (poz==53) || (poz==33) || (poz==22)))
				{
				button[3][0].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=3;y1=0;check();
				matrix[3][0]=1;
				poz=41;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else {
					if((szamol==0) && ((poz2==62) || (poz2==53) || (poz2==33) || (poz2==22)))
					{
					button[3][0].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=3;y2=0;check();
					matrix[3][0]=1;
					poz2=41;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[3][0].add(imagelabel2);
				}
			}

		});
		button[3][1].setBounds(85, 245, 80, 80);
		button[3][1].setBackground(Color.WHITE);
		frame.getContentPane().add(button[3][1]);
		button[3][1].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==61) || (poz==63) || (poz==54) || (poz==34) || (poz==21) || (poz==23)))
				{
				button[3][1].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=3;y1=1;check();
				matrix[3][1]=1;
				poz=42;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==61) || (poz2==63) || (poz2==54) || (poz2==34) || (poz2==21) || (poz2==23)))
					{
					button[3][1].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=3;y2=1;check();
					matrix[3][1]=1;
					poz2=42;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[3][1].add(imagelabel2);
				}
			}
		});
		button[3][2].setBounds(165, 245, 80, 80);
		button[3][2].setBackground(Color.BLACK);
		frame.getContentPane().add(button[3][2]);
		button[3][2].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==62) || (poz==64) || (poz==55) || (poz==35) || (poz==22) || (poz==24) || (poz==51) || (poz==31)))
				{
				button[3][2].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=3;y1=2;check();
				matrix[3][2]=1;
				poz=43;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==62) || (poz2==64) || (poz2==55) || (poz2==35) || (poz2==22) || (poz2==24) || (poz2==51) || (poz2==31)))
					{
					button[3][2].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=3;y2=2;check();
					matrix[3][2]=1;
					poz2=43;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[3][2].add(imagelabel2);
				}
			}

		});
		button[3][3].setBounds(245, 245, 80, 80);
		button[3][3].setBackground(Color.WHITE);
		frame.getContentPane().add(button[3][3]);
		button[3][3].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0)& ((poz==63) || (poz==65) || (poz==56) || (poz==36) || (poz==23) || (poz==25) || (poz==52) || (poz==32)))
				{
				button[3][3].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=3;y1=3;check();
				matrix[3][3]=1;
				poz=44;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0)& ((poz2==63) || (poz2==65) || (poz2==56) || (poz2==36) || (poz2==23) || (poz2==25) || (poz2==52) || (poz2==32)))
					{
					button[3][3].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=3;y2=3;check();
					matrix[3][3]=1;
					poz2=44;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				
				if(szamol==1)
				{
					button[3][3].add(imagelabel2);
				}
			}

		});
		button[3][4].setBounds(325, 245, 80, 80);
		button[3][4].setBackground(Color.BLACK);
		frame.getContentPane().add(button[3][4]);
		button[3][4].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==64) || (poz==66) || (poz==57) || (poz==37) || (poz==24) || (poz==26) || (poz==53) || (poz==33)))
				{
				button[3][4].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=3;y1=4;check();
				matrix[3][4]=1;
				poz=45;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else
				{
					if((szamol==0) && ((poz2==64) || (poz2==66) || (poz2==57) || (poz2==37) || (poz2==24) || (poz2==26) || (poz2==53) || (poz2==33)))
					{
					button[3][4].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=3;y2=4;check();
					matrix[3][4]=1;
					poz2=45;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[3][4].add(imagelabel2);
				}
			}

		});
		button[3][5].setBounds(405, 245, 80, 80);
		button[3][5].setBackground(Color.WHITE);
		frame.getContentPane().add(button[3][5]);
		button[3][5].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==65) || (poz==67) || (poz==58) || (poz==38) || (poz==25) || (poz==27) || (poz==54) || (poz==34)))
				{
				button[3][5].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=3;y1=5;check();
				matrix[3][5]=1;
				poz=46;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==65) || (poz2==67) || (poz2==58) || (poz2==38) || (poz2==25) || (poz2==27) || (poz2==54) || (poz2==34)))
					{
					button[3][5].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=3;y2=5;check();
					matrix[3][5]=1;
					poz2=46;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[3][5].add(imagelabel2);
				}
			}

		});
		button[3][6].setBounds(485, 245, 80, 80);
		button[3][6].setBackground(Color.BLACK);
		frame.getContentPane().add(button[3][6]);
		button[3][6].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==66) || (poz==68) || (poz==26) || (poz==28) || (poz==55) || (poz==35)))
				{
				button[3][6].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=3;y1=6;check();
				matrix[3][6]=1;
				poz=47;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==66) || (poz2==68) || (poz2==26) || (poz2==28) || (poz2==55) || (poz2==35)))
					{
					button[3][6].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=3;y2=6;check();
					matrix[3][6]=1;
					poz2=47;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[3][6].add(imagelabel2);
				}
			}

		});
		button[3][7].setBounds(565, 245, 80, 80);
		button[3][7].setBackground(Color.WHITE);
		frame.getContentPane().add(button[3][7]);
		button[3][7].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==67) || (poz==27) || (poz==56) || (poz==36)))
				{
				button[3][7].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=3;y1=7;check();
				matrix[3][7]=1;
				poz=48;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==67) || (poz2==27) || (poz2==56) || (poz2==36)))
					{
					button[3][7].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=3;y2=7;check();
					matrix[3][7]=1;
					poz2=48;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[3][7].add(imagelabel2);
				}
			}

		});
		button[4][0].setBounds(5, 325, 80, 80);
		button[4][0].setBackground(Color.WHITE);
		frame.getContentPane().add(button[4][0]);
		button[4][0].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==72) || (poz==63) || (poz==43) || (poz==32)))
				{
				button[4][0].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=4;y1=0;check();
				matrix[4][0]=1;
				poz=51;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==72) || (poz2==63) || (poz2==43) || (poz2==32)))
					{
					button[4][0].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=4;y2=0;check();
					matrix[4][0]=1;
					poz2=51;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}	
				}
				if(szamol==1)
				{
					button[4][0].add(imagelabel2);
				}
			}

		});
		button[4][1].setBounds(85, 325, 80, 80);
		button[4][1].setBackground(Color.BLACK);
		frame.getContentPane().add(button[4][1]);
		button[4][1].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==71) || (poz==73) || (poz==64) || (poz==44) || (poz==31) || (poz==33)))
				{
				button[4][1].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=4;y1=1;check();
				matrix[4][1]=1;
				poz=52;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==71) || (poz2==73) || (poz2==64) || (poz2==44) || (poz2==31) || (poz2==33)))
					{
					button[4][1].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=4;y2=1;check();
					matrix[4][1]=1;
					poz2=52;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[4][1].add(imagelabel2);
				}
			}

		});
		button[4][2].setBounds(165, 325, 80, 80);
		button[4][2].setBackground(Color.WHITE);
		frame.getContentPane().add(button[4][2]);
		button[4][2].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==72) || (poz==74) || (poz==65) || (poz==45) || (poz==32) || (poz==34) || (poz==61) || (poz==41)))
				{
				button[4][2].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=4;y1=2;check();
				matrix[4][2]=1;
				poz=53;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==72) || (poz2==74) || (poz2==65) || (poz2==45) || (poz2==32) || (poz2==34) || (poz2==61) || (poz2==41)))
					{
					button[4][2].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=4;y2=2;check();
					matrix[4][2]=1;
					poz2=53;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[4][2].add(imagelabel2);
				}
			}

		});
		button[4][3].setBounds(245, 325, 80, 80);
		button[4][3].setBackground(Color.BLACK);
		frame.getContentPane().add(button[4][3]);
		button[4][3].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0)& ((poz==73) || (poz==75) || (poz==66) || (poz==46) || (poz==33) || (poz==35) || (poz==62) || (poz==42)))
				{
				button[4][3].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=4;y1=3;check();
				matrix[4][3]=1;
				poz=54;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0)& ((poz2==73) || (poz2==75) || (poz2==66) || (poz2==46) || (poz2==33) || (poz2==35) || (poz2==62) || (poz2==42)))
					{
					button[4][3].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=4;y2=3;check();
					matrix[4][3]=1;
					poz2=54;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[4][3].add(imagelabel2);
				}
			}

		});
		button[4][4].setBounds(325, 325, 80, 80);
		button[4][4].setBackground(Color.WHITE);
		frame.getContentPane().add(button[4][4]);
		button[4][4].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==74) || (poz==76) || (poz==67) || (poz==47) || (poz==34) || (poz==36) || (poz==63) || (poz==43)))
				{
				button[4][4].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=4;y1=4;check();
				matrix[4][4]=1;
				poz=55;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==74) || (poz2==76) || (poz2==67) || (poz2==47) || (poz2==34) || (poz2==36) || (poz2==63) || (poz2==43)))
					{
					button[4][4].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=4;y2=4;check();
					matrix[4][4]=1;
					poz2=55;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[4][4].add(imagelabel2);
				}
			}

		});
		button[4][5].setBounds(405, 325, 80, 80);
		button[4][5].setBackground(Color.BLACK);
		frame.getContentPane().add(button[4][5]);
		button[4][5].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==75) || (poz==77) || (poz==68) || (poz==48) || (poz==35) || (poz==37) || (poz==64) || (poz==44)))
				{
				button[4][5].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=4;y1=5;check();
				matrix[4][5]=1;
				poz=56;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==75) || (poz2==77) || (poz2==68) || (poz2==48) || (poz2==35) || (poz2==37) || (poz2==64) || (poz2==44)))
					{
					button[4][5].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=4;y2=5;check();
					matrix[4][5]=1;
					poz2=56;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[4][5].add(imagelabel2);
				}
			}

		});
		button[4][6].setBounds(485, 325, 80, 80);
		button[4][6].setBackground(Color.WHITE);
		frame.getContentPane().add(button[4][6]);
		button[4][6].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==76) || (poz==78) || (poz==36) || (poz==38) || (poz==65) || (poz==45)))
				{
				button[4][6].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=4;y1=6;check();
				matrix[4][6]=1;
				poz=57;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==76) || (poz2==78) || (poz2==36) || (poz2==38) || (poz2==65) || (poz2==45)))
					{
					button[4][6].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=4;y2=6;check();
					matrix[4][6]=1;
					poz2=57;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[4][6].add(imagelabel2);
				}
			}

		});
		button[4][7].setBounds(565, 325, 80, 80);
		button[4][7].setBackground(Color.BLACK);
		frame.getContentPane().add(button[4][7]);
		button[4][7].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==77) || (poz==37) || (poz==66) || (poz==46)))
				{
				button[4][7].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=4;y1=7;check();
				matrix[4][7]=1;
				poz=58;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==77) || (poz2==37) || (poz2==66) || (poz2==46)))
					{
					button[4][7].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=4;y2=7;check();
					matrix[4][7]=1;
					poz2=58;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[4][7].add(imagelabel2);
				}
			}

		});
		button[5][0].setBounds(5, 405, 80, 80);
		button[5][0].setBackground(Color.BLACK);
		frame.getContentPane().add(button[5][0]);
		button[5][0].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==82) || (poz==73) || (poz==53) || (poz==42)))
				{
				button[5][0].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=5;y1=0;check();
				matrix[5][0]=1;
				poz=61;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==82) || (poz2==73) || (poz2==53) || (poz2==42)))
					{
					button[5][0].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=5;y2=0;check();
					matrix[5][0]=1;
					poz2=61;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[5][0].add(imagelabel2);
				}
			}

		});
		button[5][1].setBounds(85, 405, 80, 80);
		button[5][1].setBackground(Color.WHITE);
		frame.getContentPane().add(button[5][1]);
		button[5][1].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==81) || (poz==83) || (poz==74) || (poz==54) || (poz==41) || (poz==43)))
				{
				button[5][1].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=5;y1=1;check();
				matrix[5][1]=1;
				poz=62;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==81) || (poz2==83) || (poz2==74) || (poz2==54) || (poz2==41) || (poz2==43)))
					{
					button[5][1].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=5;y2=1;check();
					matrix[5][1]=1;
					poz2=62;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[5][1].add(imagelabel2);
				}
			}

		});
		button[5][2].setBounds(165, 405, 80, 80);
		button[5][2].setBackground(Color.BLACK);
		frame.getContentPane().add(button[5][2]);
		button[5][2].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==82) || (poz==84) || (poz==75) || (poz==55) || (poz==42) || (poz==44) || (poz==71) || (poz==51)))
				{
				button[5][2].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=5;y1=2;check();
				matrix[5][2]=1;
				poz=63;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==82) || (poz2==84) || (poz2==75) || (poz2==55) || (poz2==42) || (poz2==44) || (poz2==71) || (poz2==51)))
					{
					button[5][2].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=5;y2=2;check();
					matrix[5][2]=1;
					poz2=63;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[5][2].add(imagelabel2);
				}
			}

		});
		button[5][3].setBounds(245, 405, 80, 80);
		button[5][3].setBackground(Color.WHITE);
		frame.getContentPane().add(button[5][3]);
		button[5][3].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0)& ((poz==83) || (poz==85) || (poz==76) || (poz==56) || (poz==43) || (poz==45) || (poz==72) || (poz==52)))
				{
				button[5][3].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=5;y1=3;check();
				matrix[5][3]=1;
				poz=64;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0)& ((poz2==83) || (poz2==85) || (poz2==76) || (poz2==56) || (poz2==43) || (poz2==45) || (poz2==72) || (poz2==52)))
					{
					button[5][3].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=5;y2=3;check();
					matrix[5][3]=1;
					poz2=64;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[5][3].add(imagelabel2);
				}
			}

		});
		button[5][4].setBounds(325, 405, 80, 80);
		button[5][4].setBackground(Color.BLACK);
		frame.getContentPane().add(button[5][4]);
		button[5][4].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==84) || (poz==86) || (poz==77) || (poz==57) || (poz==44) || (poz==46) || (poz==73) || (poz==53)))
				{
				button[5][4].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=5;y1=4;check();
				matrix[5][4]=1;
				poz=65;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==84) || (poz2==86) || (poz2==77) || (poz2==57) || (poz2==44) || (poz2==46) || (poz2==73) || (poz2==53)))
					{
					button[5][4].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=5;y2=4;check();
					matrix[5][4]=1;
					poz2=65;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[5][4].add(imagelabel2);
				}
			}

		});
		button[5][5].setBounds(405, 405, 80, 80);
		button[5][5].setBackground(Color.WHITE);
		frame.getContentPane().add(button[5][5]);
		button[5][5].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==85) || (poz==87) || (poz==78) || (poz==58) || (poz==45) || (poz==47) || (poz==74) || (poz==54)))
				{
				button[5][5].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=5;y1=5;check();
				matrix[5][5]=1;
				poz=66;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==85) || (poz2==87) || (poz2==78) || (poz2==58) || (poz2==45) || (poz2==47) || (poz2==74) || (poz2==54)))
					{
					button[5][5].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=5;y2=5;check();
					matrix[5][5]=1;
					poz2=66;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[5][5].add(imagelabel2);
				}
			}

		});
		button[5][6].setBounds(485, 405, 80, 80);
		button[5][6].setBackground(Color.BLACK);
		frame.getContentPane().add(button[5][6]);
		button[5][6].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==86) || (poz==88) || (poz==46) || (poz==48) || (poz==75) || (poz==55)))
				{
				button[5][6].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				matrix[7][7]=1;
				x1=5;y1=6;check();
				matrix[5][6]=1;
				poz=67;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else
				{
					if((szamol==0) && ((poz2==86) || (poz2==88) || (poz2==46) || (poz2==48) || (poz2==75) || (poz2==55)))
					{
					button[5][6].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					matrix[7][7]=1;
					x2=5;y2=6;check();
					matrix[5][6]=1;
					poz2=67;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[5][6].add(imagelabel2);
				}
			}

		});
		button[5][7].setBounds(565, 405, 80, 80);
		button[5][7].setBackground(Color.WHITE);
		frame.getContentPane().add(button[5][7]);
		button[5][7].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==87) || (poz==47) || (poz==76) || (poz==56)))
				{
				button[5][7].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=5;y1=7;check();
				matrix[5][7]=1;
				poz=68;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==87) || (poz2==47) || (poz2==76) || (poz2==56)))
					{
					button[5][7].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=5;y2=7;check();
					matrix[5][7]=1;
					poz2=68;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[5][7].add(imagelabel2);
				}
			}

		});
		button[6][0].setBounds(5, 485, 80, 80);
		button[6][0].setBackground(Color.WHITE);
		frame.getContentPane().add(button[6][0]);
		button[6][0].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ( (poz==83) || (poz==63) || (poz==52)))
				{
				button[6][0].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=6;y1=0;check();
				matrix[6][0]=1;
				poz=71;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ( (poz2==83) || (poz2==63) || (poz2==52)))
					{
					button[6][0].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=6;y2=0;check();
					matrix[6][0]=1;
					poz2=71;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[6][0].add(imagelabel2);
				}
			}

		});
		button[6][1].setBounds(85, 485, 80, 80);
		button[6][1].setBackground(Color.BLACK);
		frame.getContentPane().add(button[6][1]);
		button[6][1].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==84) || (poz==64) || (poz==51) || (poz==53)))
				{
				button[6][1].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=6;y1=1;check();
				matrix[6][1]=1;
				poz=72;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==84) || (poz2==64) || (poz2==51) || (poz2==53)))
					{
					button[6][1].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=6;y2=1;check();
					matrix[6][1]=1;
					poz2=72;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[6][1].add(imagelabel2);
				}
			}

		});
		button[6][2].setBounds(165, 485, 80, 80);
		button[6][2].setBackground(Color.WHITE);
		frame.getContentPane().add(button[6][2]);
		button[6][2].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ( (poz==85) || (poz==65) || (poz==52) || (poz==54) || (poz==81) || (poz==61)))
				{
				button[6][2].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=6;y1=2;check();
				matrix[6][2]=1;
				poz=73;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ( (poz2==85) || (poz2==65) || (poz2==52) || (poz2==54) || (poz2==81) || (poz2==61)))
					{
					button[6][2].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=6;y2=2;check();
					matrix[6][2]=1;
					poz2=73;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[6][2].add(imagelabel2);
				}
			}

		});
		button[6][3].setBounds(245, 485, 80, 80);
		button[6][3].setBackground(Color.BLACK);
		frame.getContentPane().add(button[6][3]);
		button[6][3].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0)& ((poz==86) || (poz==66) || (poz==53) || (poz==55) || (poz==82) || (poz==62)))
				{
				button[6][3].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=6;y1=3;check();
				matrix[6][3]=1;
				poz=74;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0)& ((poz2==86) || (poz2==66) || (poz2==53) || (poz2==55) || (poz2==82) || (poz2==62)))
					{
					button[6][3].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=6;y2=3;check();
					matrix[6][3]=1;
					poz2=74;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[6][3].add(imagelabel2);
				}
			}

		});
		button[6][4].setBounds(325, 485, 80, 80);
		button[6][4].setBackground(Color.WHITE);
		frame.getContentPane().add(button[6][4]);
		button[6][4].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==87) || (poz==67) || (poz==54) || (poz==56) || (poz==83) || (poz==63)))
				{
				button[6][4].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=6;y1=4;check();
				matrix[6][4]=1;
				poz=75;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==87) || (poz2==67) || (poz2==54) || (poz2==56) || (poz2==83) || (poz2==63)))
					{
					button[6][4].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=6 ;y2=4;check();
					matrix[6][4]=1;
					poz2=75;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[6][4].add(imagelabel2);
				}
			}

		});
		button[6][5].setBounds(405, 485, 80, 80);
		button[6][5].setBackground(Color.BLACK);
		frame.getContentPane().add(button[6][5]);
		button[6][5].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==88) || (poz==68) || (poz==55)|| (poz==57) || (poz==84)  || (poz==64)))
				{
				button[6][5].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				matrix[7][7]=1;
				x1=6;y1=5;check();
				matrix[6][5]=1;
				poz=76;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==88) || (poz2==68) || (poz2==55)|| (poz2==57) || (poz2==84)  || (poz2==64)))
					{
					button[6][5].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					matrix[7][7]=1;
					x2=6;y2=5;check();
					matrix[6][5]=1;
					poz2=76;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[6][5].add(imagelabel2);
				}
			}

		});
		button[6][6].setBounds(485, 485, 80, 80);
		button[6][6].setBackground(Color.WHITE);
		frame.getContentPane().add(button[6][6]);
		button[6][6].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==56) || (poz==58) || (poz==85) || (poz==65)))
				{
				button[6][6].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=6;y1=6;check();
				matrix[6][6]=1;
				poz=77;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==56) || (poz2==58) || (poz2==85) || (poz2==65)))
					{
					button[6][6].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=6;y2=6;check();
					matrix[6][6]=1;
					poz2=77;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[6][6].add(imagelabel2);
				}
			}

		});
		button[6][7].setBounds(565, 485, 80, 80);
		button[6][7].setBackground(Color.BLACK);
		frame.getContentPane().add(button[6][7]);
		button[6][7].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ( (poz==57) || (poz==86) || (poz==66)))
				{
				button[6][7].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=6;y1=7;check();
				matrix[6][7]=1;
				poz=78;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ( (poz2==57) || (poz2==86) || (poz2==66)))
					{
					button[6][7].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=6;y2=7;check();
					matrix[6][7]=1;
					poz2=78;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[6][7].add(imagelabel2);
				}
			}

		});
		button[7][0].setBounds(5, 565, 80, 80);
		button[7][0].setBackground(Color.BLACK);
		frame.getContentPane().add(button[7][0]);
		button[7][0].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ( (poz==73) || (poz==62)))
				{
				button[7][0].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=7;y1=0;check();
				matrix[7][0]=1;
				poz=81;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ( (poz2==73) || (poz2==62)))
					{
					button[7][0].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=7;y2=0;check();
					matrix[7][0]=1;
					poz2=81;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}	
				}
				if(szamol==1)
				{
					button[7][0].add(imagelabel2);
				}
			}

		});
		button[7][1].setBounds(85, 565, 80, 80);
		button[7][1].setBackground(Color.WHITE);
		frame.getContentPane().add(button[7][1]);
		button[7][1].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==74) || (poz==61) || (poz==63)))
				{
				button[7][1].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=7;y1=1;check();
				matrix[7][1]=1;
				poz=82;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==74) || (poz2==61) || (poz2==63)))
					{
					button[7][1].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=7;y2=1;check();
					matrix[7][1]=1;
					poz2=82;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[7][1].add(imagelabel2);
				}
			}

		});
		button[7][2].setBounds(165, 565, 80, 80);
		button[7][2].setBackground(Color.BLACK);
		frame.getContentPane().add(button[7][2]);
		button[7][2].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ( (poz==75) || (poz==62) || (poz==64) || (poz==71)))
				{
				button[7][2].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=7;y1=2;check();
				matrix[7][2]=1;
				poz=83;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ( (poz2==75) || (poz2==62) || (poz2==64) || (poz2==71)))
					{
					button[7][2].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=7;y2=2;check();
					matrix[7][2]=1;
					poz2=83;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[7][2].add(imagelabel2);
				}
			}

		});
		button[7][3].setBounds(245, 565, 80, 80);
		button[7][3].setBackground(Color.WHITE);
		frame.getContentPane().add(button[7][3]);
		button[7][3].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0)& ((poz==76) || (poz==63) || (poz==65) || (poz==72)))
				{
				button[7][3].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=7;y1=3;check();
				matrix[7][3]=1;
				poz=84;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0)& ((poz2==76) || (poz2==63) || (poz2==65) || (poz2==72)))
					{
					button[7][3].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=7;y2=3;check();
					matrix[7][3]=1;
					poz2=84;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[7][3].add(imagelabel2);
				}
			}

		});
		button[7][4].setBounds(325, 565, 80, 80);
		button[7][4].setBackground(Color.BLACK);
		frame.getContentPane().add(button[7][4]);
		button[7][4].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==77) || (poz==64) || (poz==66) || (poz==73)))
				{
				button[7][4].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=7;y1=4;check();
				matrix[7][4]=1;
				poz=85;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==77) || (poz2==64) || (poz2==66) || (poz2==73)))
					{
					button[7][4].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=7;y2=4;check();
					matrix[7][4]=1;
					poz2=85;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[7][4].add(imagelabel2);
				}
			}

		});
		button[7][5].setBounds(405, 565, 80, 80);
		button[7][5].setBackground(Color.WHITE);
		frame.getContentPane().add(button[7][5]);
		button[7][5].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==65) || (poz==67) || (poz==78) || (poz==74)))
				{
				button[7][5].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=7;y1=5;check();
				matrix[7][5]=1;
				poz=86;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==65) || (poz2==67) || (poz2==78) || (poz2==74)))
					{
					button[7][5].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=7;y2=5;check();
					matrix[7][5]=1;
					poz2=86;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[7][5].add(imagelabel2);
				}
			}

		});
		button[7][6].setBounds(485, 565, 80, 80);
		button[7][6].setBackground(Color.BLACK);
		frame.getContentPane().add(button[7][6]);
		button[7][6].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==66) || (poz==68) || (poz==75)))
				{
				button[7][6].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=7;y1=6;check();
				matrix[7][6]=1;
				poz=87;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ((poz2==66) || (poz2==68) || (poz2==75)))
					{
					button[7][6].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=7;y2=6;check();
					matrix[7][6]=1;
					poz2=87;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[7][6].add(imagelabel2);
				}
			}

		});
		button[7][7].setBounds(565, 565, 80, 80);
		button[7][7].setBackground(Color.WHITE);
		frame.getContentPane().add(button[7][7]);
		button[7][7].addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ( (poz==67) || (poz==76)))
				{
				button[7][7].add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
				x1=7;y1=7;check();
				matrix[7][7]=1;
				poz=88;
				lepes++;
				if(lepheteke(poz))
				{
					nyertes(0);
				}
				}
				}
				else{
					if((szamol==0) && ( (poz2==67) || (poz2==76)))
					{
					button[7][7].add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
					x2=7;y2=7;check();
					matrix[7][7]=1;
					poz2=88;
					lepes++;
					if(lepheteke(poz2))
					{
						nyertes(1);
					}
					}
				}
				if(szamol==1)
				{
					button[7][7].add(imagelabel2);
				}
			}

		});
		
		
		

		
		
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
