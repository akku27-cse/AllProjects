#include<iostream.h>
#include<fstream.h>
#include<process.h>
#include<string.h>
#include<stdlib.h>
#include<stdio.h>
#include<ctyppe.h>
#include<conio.h>
#include<dos.h>
#include<iomanip.h>
using namespace std;
// The menus class display the menu
class menus
{
	public:
		void showmenu(void);
		privet:
			void closemenu(void);
};
//the class displays all the customer Accounted related functions
class dispRecords
{
	public:
		void addDetails(int,char name[30],char address[60],float);
		void displayCustomers(void);
		void deleteAccount(int);
		void updateBalnce(int,float);
		void updateCustomers(void);
		int lastAccount(void);
		int accountExists(int);
		char *getName(int);
		char *getAddress(int);
		float getBalnce(int);
		int getRecord(int);
		void display(int);
		void displayList(void);
		int AccountNumber;
		char name[50],address[50];
		float intBlance;
};
//The class has all the transaction related methods
class accountTransactions
{
	public:
		void new_account(void);
		void closeAccount(void);
		void display_account(void);
		void transaction(void);
		void addDetails(int,int,int,char,char typeTranactions[15],float,float,float);
		void deleteAccount(int);
		int dateDiffer(int,int,int,int,int,int);
		float getINterest(int,float);
		void display(int);
		void showAccount(int);
		int Accountnumber;//variable for account number
		char trantype[10];//variable of cheque or cash input or output
		int dday,mmonth,yyear;//transaction date
	    char transaction;//type of transaction - Deposit or Withdrawof of amount
	    float intInterest,intAmount,intBlance;
	    static float calcInterest;
	    void showInterest;//added
		};
		//showmenu() method to diplay the main menu in the application
		void menus::showmenu(void)
		{
			char choice;
			while (1)
			{
				clrscr();
				cout<<"\n   -------welcome to Banking system apllication---\n";
				cout<<"**************************************\n\n";
				cout<<"     Choose from Opctions \n";
				cout<<"_____________________\n";
				cout<<"             1:Open an Account\n";
				cout<<"             2:view an account    \n";
				cout<<"             3:Show All Account  \n";
				cout<<"             4:Make a Transaction  \n";
				cout<<"             5:Calculate Interest \n";
				cout<<"             6:close an Account\n";
				cout<<"             7:Exit\n\n";
				cout<<"             please select a choice :";
				choice=getch();
				if(choice=='1')
				{
					accountTransaction objAT;
					objAT.new_account();
				}
				else
				if(choice=='2')
				{
					accountTransaction objAT;
					objAT.display_account();
				}
				else
				if(choice=='3')
				{
					displayTransaction newRec;
					newRec.diplaycustomers();
				}
				else
				if(choice=='4')
				{
					accountTransaction objAT;
					objAT.Transaction();
				}
				else
				if(choice=='5')
				{
					accountTransaction objAT;
					objAT.showInterest();
				}
				else
				if(choice=='6')
				{
					closemenu();
				}
				else
				if(choice=='7')
				{
					cout<<"\n Thanks for using this application.please press any key to exit.\n";
					getch();
					break;
				}
			}
		}
		//closemenu() method display the closing account of the customer in the Application
		void menus::closemenu(void)
		{
			char choice;
			while(1)
			{
				clrscr();
				cout<<"          -close menu-\n";
				cout<<"           1.close/delete an Account\n";
				cout<<"           2.exit from the menu\n\n";
				cout<<"            select a choice:";
				choice=getch();
				if(choice=='1')
				{
					accountTransaction at;
					at.closeaccount();
					break;
				}
				else
				if(choice=='0')
				{
					cout<<"\n  You have entered 0 to go to the previous Menu.\n";
					getch();
					break;
				}
			}
		}
		//last account()method returns at the last Account Number from the newrecords.dat file
		int dispRecords::lastAccount(void)
		{
			fstream filename;
			filename.open("newrecords.dat",ios::in);
			filename.seekg(0,ios::beg);
			int count=0;
			while(filename.read((char*) this,sizeof(dispRecords)))
			count=AccountNumber;
			filename.close();
			return count;
		}
		//getRecord() method returns the record number from the newrecords.dat file when a banking staff enters the Account Number
		    int dispRecords::getRecord(int retrive__AccNo)
		    {
		    	fstream filename;
		    	filename.open("newrecords.dat",ios::in);
			    	filename.seekg(0,ios::beg);
		    	int count=0;
		    	while(filename.read((char*) this,sizeof(dispRecords)))
		    	{
		    		count++;
		    		if(retrieve_AccNo==AccountNumber)
		    		break;
		    		/*keep on counting the record till the Account Number is fouded and exit from the newrecords.dat file*/
				}
				filename.close();
				return count;
			}
			//display() method display all the details of the Account Number from the newrecords.dat file
			void dispRecords::display(int retrieve__AccNo)
			{
				int record;
				record=getRecord(retrieve__AccNo);
				fstream filename;
				filename.open("newrecords.dat",ios::in);
				filename.seekg(0,ios::end);
				int location;
				location=(record)*sizeof(dispRecords);
				filename.seekp(location);
				while(filename.read((char*) this,sizeof(dispRecords)))
				{
					if(retrieve__AccnNo==AccountNumber)
					{
						cout<<"\n      ACCOUNT NO.:"<<Account Number;
						cout<<"\n      Name        :"<<name;
						cout<<"\n      Address      :"<<address;
						cout<<"\n      Blance:"<<intBlance;
					}
				}
				filename.close();
			}
			//getName() method returns the Account Holder's Name from the newrecords.dat file 
			char*dispRecords::getRecord(int retrieve__AccNo)
			{
				fstream filename;
				filename.open("newrecords.dat",ios::in);
				filename.seekg(0,ios::beg);
				char retrieve__CustName[30];
				while(filename.read((char*) this,sizeof(dispRecords)))
				{
					if(AccountNumber==retrieve__AccNo)
					{
						strcpy(retrieve__CustName,name);
					}
				}
				filename.close();
					return retrieve__CustName;
			}
			//getAdderss() method retuens the Address of the account Holder from the newrecords.dat file
			char*dispRecords::getAddress(int retrieve__AccNo)
			{
				fstream filename;
				filename.open("newrecords.dat",ios::in);
				filename.seekg(0,ios::beg);
				char retrieve___Address[60];
				while(filename.raed((char*) this,sizeof(dispRecords)))
				{
					if(AccountNumber==retrieve__AccNo)
					{
						strcpy(retrieve__Address,address);
					}
				}
				filename.close();
					return retrieve__Address;
			}
			/*getBalance() method returns the Blance of the Account Holder from the newreords.dat file*/
				float dispRecords::getBalance(int retrieve__AccNo)
			{
				fstream filename;
				filename.open("newrecords.dat",ios::in);
				filename.seekg(0,ios::beg);
				float iBlance;
				while(filename.raed((char*) this,sizeof(dispRecords)))
				{
					if(AccountNumber==retrieve__AccNo)
					{
						iBlance=intBlance;
					}
				}
				filename.close();
					return retrieve__iBlance;
			}
			//accountExists() method cheaks if the Account exists in the newrecords.dat file or not.
				int dispRecords::accountExists(int retrieve__AccNo)
			{
				fstream filename;
				filename.open("newrecords.dat",ios::in);
				filename.seekg(0,ios::beg);
				int count=0;
				while(filename.raed((char*) this,sizeof(dispRecords)))
				{
					if(AccountNumber==retrieve__AccNo)
					{
			          count=1;
			          break;
					}
				}
				filename.close();
					return count;
			}
			//display list() method display the output of all the Accounts in a proper fromat for the 3*/
			void dispRecords::displayList()
			{
				cout<<"                        \n";
				int day1,month1,year1;
				struct date dateval;
				getdate(&dateval);
				day1=dateval.da__day;
				month1=dateval.da__mon;
				year1=dateval.da__year;
				cout<<"\n DAte:"<<day1<<"/"<<month1<<"/"<<year1<<"\n";
				cout<<setw(80)<<"_______________________________\n";
				cout<<setw(23)<<"Account No.";
                cout<<setw(23)<<"NAME OF THE PERSON:";
                cout<<setw(23)<<"BLANCE\n";
                cout<<setw(80)<<"____________________________\n";
	 			}
	 			//displayCustomers() method display all the Account Holders/Customers from the newrecord.dat file
	 			void dispRecords::displayCustomers(void)
	 			{
	 				clrscr();
	 				int len1;
	 				int row=8,check;
	 				fstream filename;
	 				FILE*pFILE;
	 				pFILE=fopen("newrecords.dat","r");
	 				if(pFILE==NULL)
	 				{
	 					cout<<"\n No Account Exists.Please go bck to previous menu.\n";
	 					getch();
	 					return;
	 					//fclose(pFile);
					 }
					 else
					 {
					 	displayList();
					 	filename.open("newrecords.dat",ios::in);
					 	filename.seekg(0,ios::beg);
					 		while(filename.raed((char*) this,sizeof(dispRecords)))
					 		{
					 			cheak=0;
					 			cout.file('');
					 			cout<<setw(20);
					 			cout.setf(ios::right,ios::adjustfield);
					 			cout<<Accountnumber;
					 			cout.file('');
					 			cout<<setw(25);
					 			cout.setf(ios::internal,ios::adjustifield);
					 			cout<<name;
					 			cout<<setw(23);
					 			cout.setf(ios::right,ios::adjustfield);
					 			cout<<intBalance<<"\n";
					 			row++;
					 			if(row==23)
					 			{
					 				check=1;
					 				row=8;
					 				cout<<"\n\n Continue the application....\n";
					 				getch();
					 				clrscr();
					 				displayList();
								 }
							 }
					 }
					 filename.close();
					 if(!check)
					 {
					 	cout<<"\n\n Continue The application....\n";
					 	getch();
					 }
				 }
//addDetails() method adds new records of Account Holders/Customers in the newrecords.dat file
void dispRecords::addDetails(int retrieve__AccNo,char retrieve__CustName[30],char retrieve__Address[60],float iBlance)
{
	AccountNumber=retrieve__AccNo;
	strcpy(name,retrieve__CustName);
	strcpy(address,retrieve__Address);
	intBlance=iBlance;
	fstream filename;
	filename.open("newrecords.dat",ios::out | ios::app);
     filename.write((char*) this,sizeof(dispRecords));
	filename.close();
}
//deleteAccount() method deletes the particular record from the newrecords.dat file on the basis of the account number.
{
	fstream filename;
	filename.open("newrecords.dat",ios::in);
	fstream temp;
	temp.open("calculate.txt",ios::out);
	filename.seekg(0,ios::beg);
	while(!filename.eof())
	{
		filename.read((char*) this,sizeof(dispRecords));
		if(filename.eof())
		break;
		if(AccountNumber !=retrieve__AccNo)
		temp.write((char*) this,sizeof(dispRecords));
	}
	filename.close();
	temp.close();
	filename.open("newrecords.dat",ios::out);
	temp.open("calculations.txt",ios::in);
	temp.seekg(0,ios::beg);
	while(!temp.eof());
	{
		temp.read((char*) this,sizeof(dispRecords));
		if(temp.eof())
		break;
		filename.write((char*) this,sizeof(dispRecords));
	}
	filename.close();
	temp.close;
}
//updateBlance() method updates the blance of the Account after a transaction is done in the newrecords.dat file
void dispRecord::updateBlance(int retrieve__AccNo,float iBlance)
{
	int record;
	record=getRecord(retrieve__AccNo);
	fstream filename;
	filename.open("newrecords.dat",ios::out | ios::ate);
	intBlance=iBlance;
	int location;
	location=(record-1)*sizeof(dispRecords);
	filename.skeep(location);
	filename.write((char*) this,sizeof(dispRecords));
	filename.close();
}
//addDetails() method adds the details of a transactions.dat file void accountTransaction::addDetails(int retrieve__AccNo,int day1,intmonth1,int year1,char t__tran,char typeTransaction[10],float interest__accrued,float t_amount,float iBlance)
{
	fstream filename;
	filename.open("transactions.dat",ios::app);
	AccountNumber=retrieve__AccNo;
	dday=day1;
	mmonth=month1;
	yyear=year1;
	transactions=t__tran;
	strcpy(trantype,typeTransaction);
	intInterest=interest__accrued;
	intAmount=t__amount;
	intBlance=iBlance;
	filename.write((char*) this,sizeof(accountTransactions));
	filename.close();
}
//deleteAccount() method deletes the record of a transaction from the transaction.dat file
void accountTransactions::deleteAccount(int retrieve__AccNo)
{
	fstream filename;
	filename.open("transactionsdat",ios::in);
	fstream temp;
	temp.open("calculate.txt",ios::out);
	filename.seekg(0,ios::beg);
	while(!filename.eof())
	{
		filename.raed((char*) this,sizeof(accountTransactions));
		if(filename.eof())
	break;
	temp.write((char*) this,sizeof(accountTransactions));
	}
	filename.close();
	temp.close;
	filename.open("transactions.dat",ios::out);
	temp.open("calculations.txt",ios::in);
	temp.seekg(0,ios::beg);
	while(!temp.eof())
	{
		temp.read((char*) this,sizeof(accountTransactions));
		if(temp.eof())
		break;
		filename.write((char*)this,sizeof(accountTransactions));
	}
	filename.close();
	temp.close();
}
//new__account() method adds a new record inn the record in the newrecords file and transaction.dat files(choice 1)
void accountTransactions::new__account(void)
{
	char choice;
	int i,cheak;
	clrscr();
	dispRecords newRec;
	cout<<"             Please press 0 to go back to previous menu.\n";
	cout<<"                                            \n";
	cout<<"             -open a  new Bank Account-  \n";
	cout<<"               ************ \n";
	int day1,month1,year1;
	struct date dateval;
	getdate(&dateval);
	day1=dateval.da__day;
	month1=dateval.da__mon;
	year1=dateval.da__year;
	int retrieve__AccNo;
	retrieve__AccNo=newRec.lastAccount();
	retrieve__AccNo++;
	
	
	if(retrieve__AccNo==1)
	{
		newRec.addDetails(retrieve__AccNo,"Akash",,"Tamluk",1.1);
		newRec.deleteAccount(retrieve__AccNo);
		addDetails(retrieve__AccNo,1,1,1999,'D',"default value",1.1,1.1,1.1.1);
		deleteAccount(retrieve__AccNo);
		}
		char retrieve__CustName[30],tran__acc[10],retrieve__Address[60];
		float t_bal,iBlance;
		cout<<"     Date:"<<day1"<<"/"<<month1<<"/"<<year1<<"\n"
		cout<<"     Account no.#"<<retrieve__AccNo;
		do
	{
		cout<<"\n\n Please enter the Name of the Account Holder:";
		check=1;
		gets(retrieve__CustName);
		if(retrieve__CustName[0]=='0')
		{
			cout<<"\n\t  Invalid Customer Name.";
			getch();
			return;
		}
		strupr(retrieve__CustName);
		if(strlen(retrieve__CustName)==0 || strlen(retrieve__CustName)>30)
		{
			check=0;
			cout<<"\t\n Customer Name is either blank or its length is greater than 30 charcters.\n";
			getch();
		}
	}while(!check);
	do
	{
		cout<<"\n Please enter the Account Holder's Address:";
		check=1;
		gets(retrieve__Address);
		if(retrieve__Address[0]=='0')
		{
			cout<<"\n\t      Invalid Customer Address.";
			geth();
			return;
		}
		struper(retrieve__Address);
		if(strlen(retrieve__Address)<1 ||strlen(retrieve__Address)>60)
		{
			check=0;
			cout<<"\t\n    Customer Address is either is blank or its length is greater then 60 charcter.\n";
			getch();
		}
	}while(!check);
	do
	{
		char chr__verifyingPerson[30];
		cout<<"\n     Please  enetr the name of the verifying person of the Account Holder:";
		check=1;
		gets(chr__verifyingPerson);
		if(chr__verifyingPerson[0]=='0')
		{
			cout<<"\n\t   Invalid verifying Person.";
			getch();
			return;
		}
		strupt(cha__verifyingPerson);
		if(strlen(chr__verifyingPerson)<1 || strlen(chr__verifyingPerson)>30)
		{
			check=0;
			cout<<"\t\n   The VerifyingPerson's Name is either blank or greather then 30 charcters.please Try again.\n";
			getch();
		}
	}while(!check);
	do
	{
		cout<<"\n Please enter the Depoisit Amount while opening a New Account:";
		check=1;
		gets(tran__acc);
		t__bal=atof(tran__acc);
		iBlance=t__bal;
		if (strlen(tran__acc)<1){
			cout<<"\n Invalid Transaction value.Exiting from the current Menu.\n";
			getch();
			return;
		}
		if (iBlance<1000)
		{
			check=0;
			cout<<"\t\n the Minimum Deposit Amount Should be rs.1000.please try Again.\n";
			getch();
		}
	}while(!check);
	do
	{
		cout<<"\n Do you want to save the record?(y/n):";
		choice=getche();
		choice=topper(choice);
	}while(choice != 'N' && choice !='Y');
	if (choice == 'N' || choice =='n')
	{
		cout<<"\n The customer Account is not created\n.please continue with the Appliccation.\n";
		getch();
		return;
	}
	float t__amount,interest__accrued;
	t__amount=iBlance;
	interest__accrued=0.0;
	char t__tran,typeTransaction[10];
	t__tran='D';
	strcpy(typeTransaction," ");
	newRec.addDetails(retrieve__AccNo,retrieve__CustomerName,retieve__Address,iBlance);
	addDetails(retrieve__AccNo,day1,month1,year1,t__tran,typeTransaction,interest__accrued,t__amount,iBlance);
	cout<<"\n\n              The account is successfully created.\n Please continue with the application.\n";
	getch();
}
//showAccount() method formats the display of the records from the transactions.dat file for particular account(choice 2).
void accountTransactions::showAccount(int retrieve__AccNo);
{
	cout<<"                                      \n";
	int day1,month1,year1;
	struct date dateval;
	getdate(&dateval);
	day1=dateval.da__day;
	month1=dateval.da___mon;
	year1=dateval.da__year;
	cout<<"Date:"<<day1<<"/"<<month1<<"/"<<year1<<"/n";
	cout<<"Account no.n"<<retrieve__AccNo;
	dispRecords newRec;
	char retrieve___CustName[30];
	strcpy(retrieve__custName,newRec.getName(retrieve__AccNo));
	char retrieve__Address[60];
	strcpy(retrieve__Address,newRec.getAddress(retrieve__AccNo));
	cout<<setw(25)<<"\n Account holder"
 } 

	
