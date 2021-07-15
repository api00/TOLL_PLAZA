import javax.swing.JOptionPane;
public class TollManagment  extends Customer implements Customer1  // inherite the class Customer and implement the class License
		{
			int fee;
			int amount;
			int weight;
			int exchange;
			int amounts;
			int License;
			int LicenseA =1234;
			int LicenseB=2345;
			int LicenseC=123456;
			int LicenseD=45678;
			int deposit;
 
 
public void CustomerDetails()     //overriding abstract method
		{
                String nm =JOptionPane.showInputDialog("Enter Driver Name  :");
				JOptionPane.showMessageDialog(null,(nm),"Name",JOptionPane.INFORMATION_MESSAGE);
				String id =JOptionPane.showInputDialog("Enter Driver NID No");
			   
		}
void entry()
		{
        License =Integer.parseInt(JOptionPane.showInputDialog("Enter Vehicles License Number"));
        JOptionPane.showMessageDialog(null,+License);
			
if(License == LicenseA || License ==  LicenseB || License ==  LicenseC || License ==  LicenseD)

  {

		JOptionPane.showMessageDialog(null,"EVERYTHING OK");
		String am =JOptionPane.showInputDialog("Total Receive Amount:");
		int amounts=Integer.parseInt(am);
		JOptionPane.showMessageDialog(null,+amounts);
		String fe =JOptionPane.showInputDialog("Fee Cost:");
		int fee =Integer.parseInt(fe);
		JOptionPane.showMessageDialog(null,+fee);
							
    if (amounts < fee)                      
		{           
        JOptionPane.showMessageDialog(null,"Enter amount again must be more than  :" +fee);
				 
		String de =JOptionPane.showInputDialog("Deposit the due amount :");
		int amount =Integer.parseInt(de);
		JOptionPane.showMessageDialog(null,"The deposited amount is   :" +amount);

				
		amounts=amount+amounts;
		JOptionPane.showMessageDialog(null,"The Total amount is :" +amounts);
		
				
		}
		{
				
		weight =Integer.parseInt(JOptionPane.showInputDialog("Enter the Vehicles weight"));
				
		}  
if (weight>500)
		{
		fee=fee*2;
		JOptionPane.showMessageDialog(null,"Double Fee will be charged for having over-weight!");
				
		}
		{
        exchange=amounts-fee;
     	if(exchange>0)
		{
            JOptionPane.showMessageDialog(null,"Money tO be returned to the Driver  :    " +exchange);
		}
		else	
		{
			JOptionPane.showMessageDialog(null,"Driver have to pay  :    " +exchange );
	    }
			JOptionPane.showMessageDialog(null,"THANK YOU");
			  
		}
		}		
else
	    {
		JOptionPane.showMessageDialog(null,"SORRY!!You Dont Have any Permission to GO    ", "Error",JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null,"TALK TO OUR LOCAL OFFICER FOR MORE DETAILS..!!" );
		JOptionPane.showMessageDialog(null,"THANK YOU");	
		}
		}
		}


					