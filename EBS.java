
import java.awt.*; 


import javax.swing.*; 


import java.io.*; 


import java.awt.event.*; 

 
public class EBS extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;	
	JButton b1,b2,b3;
	JTextArea ta1,ta2,th,tf,tb,tt;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JPanel contentPane;
	public EBS()
	{
		contentPane = (JPanel) this.getContentPane();
		th=new JTextArea("\n"
+"                                             INDRA   E-Energy   Limited"+"\n"
+
				"Contac No-xxxxxxxxx"+"\n"
+"Adres- Ahmedabad, India"+"\n"+
				"========================================================="+"\n");
		tt=new JTextArea("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+
				"\n"+"\n"+"========================================================="+
				"\n"+"Developed by Indra Kumar"+"\n"
);
		tf=new JTextArea("\n"+"========================================================="+
				"\n"+"Developed by Indra Kumar"+"\n"
);
		 l1=new JLabel("Energy Billing System");
		l1.setBounds(130,20,500,60);
		l1.setFont(new Font("Bold",20,50));
		contentPane.add(l1);
		l2=new JLabel("Coustmer Name : ");
		l2.setBounds(10,120,120,20);
		contentPane.add(l2);
		t1=new JTextField(10);
		t1.setBounds(130,117,150,30);
		contentPane.add(t1);
		l3=new JLabel("Address : ");
		l3.setBounds(10,170,100,20);
		contentPane.add(l3);
		ta1=new JTextArea(10,20);
		ta1.setBounds(130,167,150,80);
		contentPane.add(ta1);
		l4=new JLabel("Meater no : ");
		l4.setBounds(10,270,100,20);
		contentPane.add(l4);
		t2=new JTextField(10);
		t2.setBounds(130,267,150,30);
		contentPane.add(t2);
		l5=new JLabel("Date : ");
		l5.setBounds(10,320,100,20);
		contentPane.add(l5);
		t3=new JTextField(10);
		t3.setBounds(130,317,150,30);
		contentPane.add(t3);
		l6=new JLabel("Units Used : ");
		l6.setBounds(10,370,100,20);
		contentPane.add(l6);
		t4=new JTextField(10);
		t4.setBounds(130,367,150,30);
		contentPane.add(t4);
		l7=new JLabel("CGST : ");
		l7.setBounds(10,420,100,20);
		contentPane.add(l7);
		t5=new JTextField("18%");
		t5.setBounds(130,417,150,30);
		t5.setEditable(false);
		contentPane.add(t5);
		l8=new JLabel("Total Amount : ");
		l8.setBounds(10,470,100,20);
		contentPane.add(l8);
		t6=new JTextField(10);
		t6.setBounds(130,467,150,30);
		t6.setEditable(false);
		contentPane.add(t6);
		ta2=new JTextArea(th.getText()+tt.getText());
		ta2.setBounds(350,120,400,500);
		contentPane.add(ta2);
		b1=new JButton("Calculate Bill");
		b1.setBounds(20,640,150,30);
		contentPane.add(b1);
		b2=new JButton("Generate Bill");
		b2.setBounds(190,640,150,30);
		contentPane.add(b2);
		b3=new JButton("print");
		b3.setBounds(500,640,150,30);
		contentPane.add(b3);
		
	
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(b1==ae.getSource())
		{    
			int n1=Integer.parseInt(t4.getText());
			if(n1<100)
			{
				n1=n1*2;
 			}else if(n1<300)
			{
				n1=100*2+(n1-100)*2;
				
 			}else if(n1>300)
			{				
				n1=100*2+200*2+(n1-300)*3;
			}
			t6.setText(Integer.toString(n1)+".00");			
		}
		if(b2==ae.getSource())
		{    
			ta2.setText(th.getText()+	"\t"+"\t"+"\t"+"Date : "+t3.getText()+"\n"+
						"Coustmer Name : "+t1.getText()+"\n"+"\n"+
						"Address : "+ta1.getText()+"\n"+"\n"+
						"Meter no :"+t2.getText()+"\n"+"\n"+
						"\t"+"\t"+"Electricity Bill"+"\n"+
						"             ---------------------------------------------------------------------------------"+"\n"+
						"             Item"+"\t"+"             Meter no"+"\t"+"             Units"+"\t"+"             Total"+"\n"+
						"             ---------------------------------------------------------------------------------"+"\n"+
						"             Elec"+"\t"+"             "+t2.getText()+"\t"+"             "+t4.getText()+"\t"+"             "+t6.getText()+"\n"+
						"             ---------------------------------------------------------------------------------"+"\n"+
						"\t"+"\t"+"\t"+"              "+t6.getText()+"\n"+
						"                                                                                              --------------------"+"\n"+
						"\t"+"\t"+"Adding CGST"+"                   "+t5.getText()+"\n"+
						"                                                                                              --------------------"+"\n"+
						"\t"+"\t"+"Final Bill to pay"+"                "+t6.getText()+"\n"+
						"                                                                                              --------------------"+"\n"+
						"\n"+"\n"+
				tf.getText());			
		}
		if(b3==ae.getSource())
		{    
			try
			{	      
				// print the file 

                
				ta2.print(); 
			}
			catch (Exception evt){}
		}
	}
	public static void main(String args[])
	{
		EBS e=new EBS();
		e.setSize(800,720);
		e.setTitle("Energy Billing System - Mini Project - Indra");
		e.setLayout(null);
		e.setVisible(true);
		e.setBackground(Color.red);
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}