
import javax.swing.JOptionPane;

/** **********************************************************
 * Programmer:	Bedi - T
 * Class:		CS30S
 * 
 * Assignment:	A4 Inheriance
 *
 * Description:	 This is the main super class
 *		
 *              
 *
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class BankAccount
 {  // begin class
 	
	public enum Types{
		Savings, Chequings;
	} // end types
        
        
        static int nextID = 1000;
 	// ********** instance variable **********
         private int id = 0000;
         private String name		
	 private Savings Savings = null;	
         private Chequings Chequings = null;	
  
 	// ********** constructors ***********
/*****************************************************
 Purpose: create a new Account
 Interface: IN: Name:           
							
 Returns: none
       
 *****************************************************/
	 public BankAccount (String n, int ls, Savings S, 
			{
                 id = nextID++;
                 name = n;
		 
		 Savings = S;
		 Chequings = Cq;
                 
	 } // and initialized constructor

/*****************************************************
 Purpose: create a new animal object no properties set
 Interface: IN: none							
 Returns: none
 *****************************************************/
	 public BankAccount() 
			{
        this.name = "";
                 id = nextID++;
                 name = n;
		 
		 Savings = S;
		 Chequings = Cq;
                 
	 } // and initialized constructor

/*****************************************************
 Purpose: create a new animal object no properties set
 Interface: IN: none							
 Returns: none
 *****************************************************/
	 public BankAccount(){
        this.name = "";
		 id = nextID++;		
	 } // and default constructor
         

 	// ********** getters **********
        public static int getNextID() {
            return nextID;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }


 	// ********** mutators **********

        public static void setNextID(int nextID) {
            BankAccount.nextID = nextID;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }


} // end class