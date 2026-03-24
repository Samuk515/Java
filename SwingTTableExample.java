

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SwingTTableExample extends JFrame implements ActionListener{
  JLabel title;
  JButton show;
  JTable tbl_customer;

  public SwingTTableExample() {
	 setTitle("Swing JTable Example") ;
	 setBounds(100, 120, 400, 500);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 JPanel panel = new JPanel();
	 panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	 title = new JLabel("Swing JTable Example");
	 show  = new JButton ("Show");
	 show.addActionListener(this);
	 panel.add(title);
	 panel.add(show);
	 //jtable
	 String columns[] = {"S.NO", "Full Name", "Contact", "Address"};
	 String data[][] = {
			 { "1","Himal Bohoara", "981234567", "Kathmandu"},
			 {"2", "Mira Bhatta","9887654323", "Lalitpur"},
			 {"3","Niraj Magar", "98245356455", "Pokhara"},
			 {"4", "Kamal Bajagain", "9712345434", "Biratnagar"},
			 {"5", "Sita Sharma", "9845123456", "Bhaktapur"},
			 {"6", "Ram Prasad", "9856789012", "Dharan"},
			 {"7", "Gita Thapa", "9867890123", "Butwal"},
			 {"8", "Bikash Rai", "9878901234", "Itahari"},
			 {"9", "Anita Gurung", "9889012345", "Hetauda"},
			 {"10", "Prakash Lama", "9890123456", "Nepalgunj"},
			 {"11", "Sunita Pandey", "9801234567", "Janakpur"},
			 {"12", "Rajesh Khadka", "9812345678", "Bharatpur"},
			 {"13", "Maya Tamang", "9823456789", "Dhangadhi"},
			 {"14", "Suresh Adhikari", "9834567890", "Tulsipur"},
			 {"15", "Kumari Joshi", "9845678901", "Birgunj"},
			 {"16", "Dipak Bhattarai", "9856789012", "Lumbini"},
			 {"17", "Rekha Poudel", "9867890123", "Palpa"},
			 {"18", "Nabin Shrestha", "9878901234", "Sindhuli"},
			 {"19", "Manju Karki", "9889012345", "Dhankuta"},
			 {"20", "Arjun Basnet", "9890123456", "Rolpa"}

	 };
	 tbl_customer = new JTable(data, columns);
	 JScrollPane scroll = new JScrollPane(tbl_customer);
	 panel.add(scroll);
	 add(panel);
	 setVisible(true);


  }

  @Override
  public void actionPerformed(ActionEvent e) {
	  if(e.getSource() == show) {
		  JOptionPane.showMessageDialog(this, "Table is displayed!");
	  }
  }

  public static void main(String[] args) {
	  new SwingTTableExample();
  }
}
