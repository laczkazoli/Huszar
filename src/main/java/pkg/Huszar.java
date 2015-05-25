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
	final int matrix[][]=new int[8][8];
	
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
		final JButton button1 = new JButton();
		final JButton button2 = new JButton();
		final JButton button3 = new JButton();
		final JButton button4 = new JButton();
		final JButton button5 = new JButton();
		final JButton button6 = new JButton();
		final JButton button7 = new JButton();
		final JButton button8 = new JButton();
		final JButton button9 = new JButton();
		final JButton button10 = new JButton();
		final JButton button11 = new JButton();
		final JButton button12 = new JButton();
		final JButton button13 = new JButton();
		final JButton button14 = new JButton();
		final JButton button15 = new JButton();
		final JButton button16 = new JButton();
		final JButton button17 = new JButton();
		final JButton button18 = new JButton();
		final JButton button19 = new JButton();
		final JButton button20 = new JButton();
		final JButton button21 = new JButton();
		final JButton button22 = new JButton();
		final JButton button23 = new JButton();
		final JButton button24 = new JButton();
		final JButton button25 = new JButton();
		final JButton button26 = new JButton();
		final JButton button27 = new JButton();
		final JButton button28 = new JButton();
		final JButton button29 = new JButton();
		final JButton button30 = new JButton();
		final JButton button31 = new JButton();
		final JButton button32 = new JButton();
		final JButton button33 = new JButton();
		final JButton button34 = new JButton();
		final JButton button35 = new JButton();
		final JButton button36 = new JButton();
		final JButton button37 = new JButton();
		final JButton button38 = new JButton();
		final JButton button39 = new JButton();
		final JButton button40 = new JButton();
		final JButton button41 = new JButton();
		final JButton button42 = new JButton();
		final JButton button43 = new JButton();
		final JButton button44 = new JButton();
		final JButton button45 = new JButton();
		final JButton button46 = new JButton();
		final JButton button47 = new JButton();
		final JButton button48 = new JButton();
		final JButton button49 = new JButton();
		final JButton button50 = new JButton();
		final JButton button51 = new JButton();
		final JButton button52 = new JButton();
		final JButton button53 = new JButton();
		final JButton button54 = new JButton();
		final JButton button55 = new JButton();
		final JButton button56 = new JButton();
		final JButton button57 = new JButton();
		final JButton button58 = new JButton();
		final JButton button59 = new JButton();
		final JButton button60 = new JButton();
		final JButton button61 = new JButton();
		final JButton button62 = new JButton();
		final JButton button63 = new JButton();
		final JButton button64 = new JButton();
		
		/**
		 * Initialize the imagines.
		 */
		ClassLoader cl = this.getClass().getClassLoader();
		Icon image1  = new ImageIcon(cl.getResource("feher.jpg"));
		final JLabel imagelabel = new JLabel(image1);
		imagelabel.setBounds(5, 5, 80, 80);
		
		Icon image3  = new ImageIcon(cl.getResource("fekete.jpg"));
		final JLabel imagelabel3 = new JLabel(image3);
		imagelabel.setBounds(565, 565, 80, 80);
		
		Icon image2  = new ImageIcon(cl.getResource("x.jpg"));
		final JLabel imagelabel2 = new JLabel(image2);
		
		
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
		frame.getContentPane().add(button1);
		button1.add(imagelabel);
		button64.add(imagelabel3);
		
		/**
		 * The button actions.
		 */
		button1.setBounds(5, 5, 80, 80);
		button1.setBackground(Color.WHITE);
		button1.addActionListener(new ActionListener() {
			int szamol=1;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(szamol==0 && (lepesek(lepes)==0))
				{
					SwingUtilities.updateComponentTreeUI(frame);
					button1.add(imagelabel2);
					lepes++;
				}
			//SwingUtilities.updateComponentTreeUI(frame);
			}

		});

		button2.setBounds(85, 5, 80, 80);
		button2.setBackground(Color.BLACK);
		if (matrix[0][1]==1)
		{
			imagelabel2.setBounds(5, 85, 80, 80);
		}
		frame.getContentPane().add(button2);
		button2.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
					if((szamol==0) && ((poz==24) || (poz ==31) || (poz==33)))
					{
						button2.add(imagelabel);
						SwingUtilities.updateComponentTreeUI(frame);
						szamol++;
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
					button2.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button2.add(imagelabel2);
				}
				
			}
			
		});
		
		button3.setBounds(165, 5, 80, 80);
		button3.setBackground(Color.WHITE);
		frame.getContentPane().add(button3);
		button3.addActionListener(new ActionListener() {

			int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==32) || (poz==34) || (poz ==21) || (poz==35)))
				{
				button3.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button3.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button3.add(imagelabel2);
				}
			}

		});
		button4.setBounds(245, 5, 80, 80);
		button4.setBackground(Color.BLACK);
		frame.getContentPane().add(button4);
		button4.addActionListener(new ActionListener() {

			int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==33) || (poz==35) || (poz ==22) || (poz==36)))
				{
				button4.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button4.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button4.add(imagelabel2);
				}
			}

		});
		button5.setBounds(325, 5, 80, 80);
		button5.setBackground(Color.WHITE);
		frame.getContentPane().add(button5);
		button5.addActionListener(new ActionListener() {

			int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0)  && ((poz==34) || (poz==36) || (poz ==23) || (poz==37)))
				{
				button5.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button5.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button5.add(imagelabel2);
				}
			}

		});
		button6.setBounds(405, 5, 80, 80);
		button6.setBackground(Color.BLACK);
		frame.getContentPane().add(button6);
		button6.addActionListener(new ActionListener() {

			int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==35) || (poz==37) || (poz ==24) || (poz==38)))
				{
				button6.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button6.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button6.add(imagelabel2);
				}
			}

		});
		button7.setBounds(485, 5, 80, 80);
		button7.setBackground(Color.WHITE);
		frame.getContentPane().add(button7);
		button7.addActionListener(new ActionListener() {

			int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==36) || (poz==38) || (poz ==25)))
				{
				button7.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button7.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button7.add(imagelabel2);
				}
			}

		});
		button8.setBounds(565, 5, 80, 80);
		button8.setBackground(Color.BLACK);
		frame.getContentPane().add(button8);
		button8.addActionListener(new ActionListener() {

			int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==37) || (poz ==26)))
				{
				button8.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button8.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button8.add(imagelabel2);
				}
			}

		});
		button9.setBounds(5, 85, 80, 80);
		button9.setBackground(Color.BLACK);
		frame.getContentPane().add(button9);
		button9.addActionListener(new ActionListener() {

			int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==42) || (poz ==33) || (poz==13)))
				{
				button9.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button9.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button9.add(imagelabel2);
				}
			}

		});
		button10.setBounds(85, 85, 80, 80);
		button10.setBackground(Color.WHITE);
		frame.getContentPane().add(button10);
		button10.addActionListener(new ActionListener() {

			int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==41) || (poz ==43) || (poz==34) || (poz==14)))
				{
				button10.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button10.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button10.add(imagelabel2);
				}
			}

		});
		button11.setBounds(165, 85, 80, 80);
		button11.setBackground(Color.BLACK);
		frame.getContentPane().add(button11);
		button11.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==42) || (poz ==44) || (poz==35) || (poz==15) || (poz==31) || (poz==11) ))
				{
				button11.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button11.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button11.add(imagelabel2);
				}
			}

		});
		button12.setBounds(245, 85, 80, 80);
		button12.setBackground(Color.WHITE);
		frame.getContentPane().add(button12);
		button12.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==43) || (poz ==45) || (poz==36) || (poz==16) || (poz==32) || (poz==12) ))
				{
				button12.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button12.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button12.add(imagelabel2);
				}
			}
			
		});
		button13.setBounds(325, 85, 80, 80);
		button13.setBackground(Color.BLACK);
		frame.getContentPane().add(button13);
		button13.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==44) || (poz ==46) || (poz==37) || (poz==17) || (poz==33) || (poz==13) ))
				{
				button13.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button13.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button13.add(imagelabel2);
				}
			}

		});
		button14.setBounds(405, 85, 80, 80);
		button14.setBackground(Color.WHITE);
		frame.getContentPane().add(button14);
		button14.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==45) || (poz ==47) || (poz==38) || (poz==18) || (poz==34) || (poz==14) ))
				{
				button14.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button14.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button14.add(imagelabel2);
				}
			}

		});button15.setBounds(485, 85, 80, 80);
		button15.setBackground(Color.BLACK);
		frame.getContentPane().add(button15);
		button15.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==46) || (poz ==48) || (poz==35) || (poz==15) ))
				{
				button15.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button15.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button15.add(imagelabel2);
				}
			}

		});
		button16.setBounds(565, 85, 80, 80);
		button16.setBackground(Color.WHITE);
		frame.getContentPane().add(button16);
		button16.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==47) || (poz==36) || (poz==16) ))
				{
				button16.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button16.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button16.add(imagelabel2);
				}
			}

		});
		button17.setBounds(5, 165, 80, 80);
		button17.setBackground(Color.WHITE);
		frame.getContentPane().add(button17);
		button17.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==52) || (poz==43) || (poz==23) || (poz==12)))
				{
				button17.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button17.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button17.add(imagelabel2);
				}
			}

		});
		button18.setBounds(85, 165, 80, 80);
		button18.setBackground(Color.BLACK);
		frame.getContentPane().add(button18);
		button18.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==51) || (poz==53) || (poz==44) || (poz==24) || (poz==11) || (poz==13)))
				{
				button18.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button18.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button18.add(imagelabel2);
				}
			}

		});
		button19.setBounds(165,165, 80, 80);
		button19.setBackground(Color.WHITE);
		frame.getContentPane().add(button19);
		button19.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==52) || (poz==54) || (poz==45) || (poz==25) || (poz==12) || (poz==14) || (poz==41) || (poz==21)))
				{
				button19.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button19.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button19.add(imagelabel2);
				}
			}

		});
		button20.setBounds(245, 165, 80, 80);
		button20.setBackground(Color.BLACK);
		frame.getContentPane().add(button20);
		button20.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==53) || (poz==55) || (poz==46) || (poz==26) || (poz==13) || (poz==15) || (poz==42) || (poz==22)))
				{
				button20.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
				button20.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button20.add(imagelabel2);
				}
			}

		});
		button21.setBounds(325, 165, 80, 80);
		button21.setBackground(Color.WHITE);
		frame.getContentPane().add(button21);
		button21.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==54) || (poz==56) || (poz==47) || (poz==27) || (poz==14) || (poz==16) || (poz==43) || (poz==23)))
				{
				button21.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button21.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button21.add(imagelabel2);
				}
			}

		});
		button22.setBounds(405, 165, 80, 80);
		button22.setBackground(Color.BLACK);
		frame.getContentPane().add(button22);
		button22.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==55) || (poz==57) || (poz==48) || (poz==28) || (poz==15) || (poz==17) || (poz==44) || (poz==24)))
				{
				button22.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button22.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button22.add(imagelabel2);
				}
			}

		});
		button23.setBounds(485, 165, 80, 80);
		button23.setBackground(Color.WHITE);
		frame.getContentPane().add(button23);
		button23.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==56) || (poz==58) || (poz==16) || (poz==18) || (poz==45) || (poz==25)))
				{
				button23.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button23.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button23.add(imagelabel2);
				}
			}

		});
		button24.setBounds(565, 165, 80, 80);
		button24.setBackground(Color.BLACK);
		frame.getContentPane().add(button24);
		button24.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==57) || (poz==17) || (poz==46) || (poz==26)))
				{
				button24.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button24.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button24.add(imagelabel2);
				}
			}

		});
		button25.setBounds(5, 245, 80, 80);
		button25.setBackground(Color.BLACK);
		frame.getContentPane().add(button25);
		button25.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==62) || (poz==53) || (poz==33) || (poz==22)))
				{
				button25.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button25.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button25.add(imagelabel2);
				}
			}

		});
		button26.setBounds(85, 245, 80, 80);
		button26.setBackground(Color.WHITE);
		frame.getContentPane().add(button26);
		button26.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==61) || (poz==63) || (poz==54) || (poz==34) || (poz==21) || (poz==23)))
				{
				button26.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button26.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button26.add(imagelabel2);
				}
			}
		});
		button27.setBounds(165, 245, 80, 80);
		button27.setBackground(Color.BLACK);
		frame.getContentPane().add(button27);
		button27.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==62) || (poz==64) || (poz==55) || (poz==35) || (poz==22) || (poz==24) || (poz==51) || (poz==31)))
				{
				button27.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button27.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button27.add(imagelabel2);
				}
			}

		});
		button28.setBounds(245, 245, 80, 80);
		button28.setBackground(Color.WHITE);
		frame.getContentPane().add(button28);
		button28.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0)& ((poz==63) || (poz==65) || (poz==56) || (poz==36) || (poz==23) || (poz==25) || (poz==52) || (poz==32)))
				{
				button28.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button28.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button28.add(imagelabel2);
				}
			}

		});
		button29.setBounds(325, 245, 80, 80);
		button29.setBackground(Color.BLACK);
		frame.getContentPane().add(button29);
		button29.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==64) || (poz==66) || (poz==57) || (poz==37) || (poz==24) || (poz==26) || (poz==53) || (poz==33)))
				{
				button29.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button29.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button29.add(imagelabel2);
				}
			}

		});
		button30.setBounds(405, 245, 80, 80);
		button30.setBackground(Color.WHITE);
		frame.getContentPane().add(button30);
		button30.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==65) || (poz==67) || (poz==58) || (poz==38) || (poz==25) || (poz==27) || (poz==54) || (poz==34)))
				{
				button30.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button30.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button30.add(imagelabel2);
				}
			}

		});
		button31.setBounds(485, 245, 80, 80);
		button31.setBackground(Color.BLACK);
		frame.getContentPane().add(button31);
		button31.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==66) || (poz==68) || (poz==26) || (poz==28) || (poz==55) || (poz==35)))
				{
				button31.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button31.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button31.add(imagelabel2);
				}
			}

		});
		button32.setBounds(565, 245, 80, 80);
		button32.setBackground(Color.WHITE);
		frame.getContentPane().add(button32);
		button32.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==67) || (poz==27) || (poz==56) || (poz==36)))
				{
				button32.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button32.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button32.add(imagelabel2);
				}
			}

		});
		button33.setBounds(5, 325, 80, 80);
		button33.setBackground(Color.WHITE);
		frame.getContentPane().add(button33);
		button33.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==72) || (poz==63) || (poz==43) || (poz==32)))
				{
				button33.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button33.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button33.add(imagelabel2);
				}
			}

		});
		button34.setBounds(85, 325, 80, 80);
		button34.setBackground(Color.BLACK);
		frame.getContentPane().add(button34);
		button34.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==71) || (poz==73) || (poz==64) || (poz==44) || (poz==31) || (poz==33)))
				{
				button34.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button34.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button34.add(imagelabel2);
				}
			}

		});
		button35.setBounds(165, 325, 80, 80);
		button35.setBackground(Color.WHITE);
		frame.getContentPane().add(button35);
		button35.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==72) || (poz==74) || (poz==65) || (poz==45) || (poz==32) || (poz==34) || (poz==61) || (poz==41)))
				{
				button35.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button35.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button35.add(imagelabel2);
				}
			}

		});
		button36.setBounds(245, 325, 80, 80);
		button36.setBackground(Color.BLACK);
		frame.getContentPane().add(button36);
		button36.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0)& ((poz==73) || (poz==75) || (poz==66) || (poz==46) || (poz==33) || (poz==35) || (poz==62) || (poz==42)))
				{
				button36.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button36.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button36.add(imagelabel2);
				}
			}

		});
		button37.setBounds(325, 325, 80, 80);
		button37.setBackground(Color.WHITE);
		frame.getContentPane().add(button37);
		button37.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==74) || (poz==76) || (poz==67) || (poz==47) || (poz==34) || (poz==36) || (poz==63) || (poz==43)))
				{
				button37.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button37.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button37.add(imagelabel2);
				}
			}

		});
		button38.setBounds(405, 325, 80, 80);
		button38.setBackground(Color.BLACK);
		frame.getContentPane().add(button38);
		button38.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==75) || (poz==77) || (poz==68) || (poz==48) || (poz==35) || (poz==37) || (poz==64) || (poz==44)))
				{
				button38.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button38.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button38.add(imagelabel2);
				}
			}

		});
		button39.setBounds(485, 325, 80, 80);
		button39.setBackground(Color.WHITE);
		frame.getContentPane().add(button39);
		button39.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==76) || (poz==78) || (poz==36) || (poz==38) || (poz==65) || (poz==45)))
				{
				button39.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button39.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button39.add(imagelabel2);
				}
			}

		});
		button40.setBounds(565, 325, 80, 80);
		button40.setBackground(Color.BLACK);
		frame.getContentPane().add(button40);
		button40.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==77) || (poz==37) || (poz==66) || (poz==46)))
				{
				button40.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button40.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button40.add(imagelabel2);
				}
			}

		});
		button41.setBounds(5, 405, 80, 80);
		button41.setBackground(Color.BLACK);
		frame.getContentPane().add(button41);
		button41.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==82) || (poz==73) || (poz==53) || (poz==42)))
				{
				button41.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button41.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button41.add(imagelabel2);
				}
			}

		});
		button42.setBounds(85, 405, 80, 80);
		button42.setBackground(Color.WHITE);
		frame.getContentPane().add(button42);
		button42.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==81) || (poz==83) || (poz==74) || (poz==54) || (poz==41) || (poz==43)))
				{
				button42.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button42.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button42.add(imagelabel2);
				}
			}

		});
		button43.setBounds(165, 405, 80, 80);
		button43.setBackground(Color.BLACK);
		frame.getContentPane().add(button43);
		button43.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==82) || (poz==84) || (poz==75) || (poz==55) || (poz==42) || (poz==44) || (poz==71) || (poz==51)))
				{
				button43.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button43.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button43.add(imagelabel2);
				}
			}

		});
		button44.setBounds(245, 405, 80, 80);
		button44.setBackground(Color.WHITE);
		frame.getContentPane().add(button44);
		button44.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0)& ((poz==83) || (poz==85) || (poz==76) || (poz==56) || (poz==43) || (poz==45) || (poz==72) || (poz==52)))
				{
				button44.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button44.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button44.add(imagelabel2);
				}
			}

		});
		button45.setBounds(325, 405, 80, 80);
		button45.setBackground(Color.BLACK);
		frame.getContentPane().add(button45);
		button45.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==84) || (poz==86) || (poz==77) || (poz==57) || (poz==44) || (poz==46) || (poz==73) || (poz==53)))
				{
				button45.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button45.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button45.add(imagelabel2);
				}
			}

		});
		button46.setBounds(405, 405, 80, 80);
		button46.setBackground(Color.WHITE);
		frame.getContentPane().add(button46);
		button46.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==85) || (poz==87) || (poz==78) || (poz==58) || (poz==45) || (poz==47) || (poz==74) || (poz==54)))
				{
				button46.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button46.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button46.add(imagelabel2);
				}
			}

		});
		button47.setBounds(485, 405, 80, 80);
		button47.setBackground(Color.BLACK);
		frame.getContentPane().add(button47);
		button47.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==86) || (poz==88) || (poz==46) || (poz==48) || (poz==75) || (poz==55)))
				{
				button47.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button47.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button47.add(imagelabel2);
				}
			}

		});
		button48.setBounds(565, 405, 80, 80);
		button48.setBackground(Color.WHITE);
		frame.getContentPane().add(button48);
		button48.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==87) || (poz==47) || (poz==76) || (poz==56)))
				{
				button48.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button48.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button48.add(imagelabel2);
				}
			}

		});
		button49.setBounds(5, 485, 80, 80);
		button49.setBackground(Color.WHITE);
		frame.getContentPane().add(button49);
		button49.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ( (poz==83) || (poz==63) || (poz==52)))
				{
				button49.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button49.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button49.add(imagelabel2);
				}
			}

		});
		button50.setBounds(85, 485, 80, 80);
		button50.setBackground(Color.BLACK);
		frame.getContentPane().add(button50);
		button50.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==84) || (poz==64) || (poz==51) || (poz==53)))
				{
				button50.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button50.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button50.add(imagelabel2);
				}
			}

		});
		button51.setBounds(165, 485, 80, 80);
		button51.setBackground(Color.WHITE);
		frame.getContentPane().add(button51);
		button51.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ( (poz==85) || (poz==65) || (poz==52) || (poz==54) || (poz==81) || (poz==61)))
				{
				button51.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button51.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button51.add(imagelabel2);
				}
			}

		});
		button52.setBounds(245, 485, 80, 80);
		button52.setBackground(Color.BLACK);
		frame.getContentPane().add(button52);
		button52.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0)& ((poz==86) || (poz==66) || (poz==53) || (poz==55) || (poz==82) || (poz==62)))
				{
				button52.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button52.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button52.add(imagelabel2);
				}
			}

		});
		button53.setBounds(325, 485, 80, 80);
		button53.setBackground(Color.WHITE);
		frame.getContentPane().add(button53);
		button53.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==87) || (poz==67) || (poz==54) || (poz==56) || (poz==83) || (poz==63)))
				{
				button53.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button53.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button53.add(imagelabel2);
				}
			}

		});
		button54.setBounds(405, 485, 80, 80);
		button54.setBackground(Color.BLACK);
		frame.getContentPane().add(button54);
		button54.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==88) || (poz==68) || (poz==55)|| (poz==57) || (poz==84)  || (poz==64)))
				{
				button54.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button54.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button54.add(imagelabel2);
				}
			}

		});
		button55.setBounds(485, 485, 80, 80);
		button55.setBackground(Color.WHITE);
		frame.getContentPane().add(button55);
		button55.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==56) || (poz==58) || (poz==85) || (poz==65)))
				{
				button55.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button55.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button55.add(imagelabel2);
				}
			}

		});
		button56.setBounds(565, 485, 80, 80);
		button56.setBackground(Color.BLACK);
		frame.getContentPane().add(button56);
		button56.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ( (poz==57) || (poz==86) || (poz==66)))
				{
				button56.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button56.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button56.add(imagelabel2);
				}
			}

		});
		button57.setBounds(5, 565, 80, 80);
		button57.setBackground(Color.BLACK);
		frame.getContentPane().add(button57);
		button57.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ( (poz==73) || (poz==62)))
				{
				button57.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button57.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button57.add(imagelabel2);
				}
			}

		});
		button58.setBounds(85, 565, 80, 80);
		button58.setBackground(Color.WHITE);
		frame.getContentPane().add(button58);
		button58.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==74) || (poz==61) || (poz==63)))
				{
				button58.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button58.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button58.add(imagelabel2);
				}
			}

		});
		button59.setBounds(165, 565, 80, 80);
		button59.setBackground(Color.BLACK);
		frame.getContentPane().add(button59);
		button59.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ( (poz==75) || (poz==62) || (poz==64) || (poz==71)))
				{
				button59.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button59.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button59.add(imagelabel2);
				}
			}

		});
		button60.setBounds(245, 565, 80, 80);
		button60.setBackground(Color.WHITE);
		frame.getContentPane().add(button60);
		button60.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0)& ((poz==76) || (poz==63) || (poz==65) || (poz==72)))
				{
				button60.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button60.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button60.add(imagelabel2);
				}
			}

		});
		button61.setBounds(325, 565, 80, 80);
		button61.setBackground(Color.BLACK);
		frame.getContentPane().add(button61);
		button61.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==77) || (poz==64) || (poz==66) || (poz==73)))
				{
				button61.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button61.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button61.add(imagelabel2);
				}
			}

		});
		button62.setBounds(405, 565, 80, 80);
		button62.setBackground(Color.WHITE);
		frame.getContentPane().add(button62);
		button62.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==65) || (poz==67) || (poz==78) || (poz==74)))
				{
				button62.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button62.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button62.add(imagelabel2);
				}
			}

		});
		button63.setBounds(485, 565, 80, 80);
		button63.setBackground(Color.BLACK);
		frame.getContentPane().add(button63);
		button63.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ((poz==66) || (poz==68) || (poz==75)))
				{
				button63.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button63.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button63.add(imagelabel2);
				}
			}

		});
		button64.setBounds(565, 565, 80, 80);
		button64.setBackground(Color.WHITE);
		frame.getContentPane().add(button64);
		button64.addActionListener(new ActionListener() {
		int szamol=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(lepesek(lepes)==0)
				{
				if((szamol==0) && ( (poz==67) || (poz==76)))
				{
				button64.add(imagelabel);
				SwingUtilities.updateComponentTreeUI(frame);
				szamol++;
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
					button64.add(imagelabel3);
					SwingUtilities.updateComponentTreeUI(frame);
					szamol++;
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
					button64.add(imagelabel2);
				}
			}

		});
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
