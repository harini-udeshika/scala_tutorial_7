object q4 extends App{

  class Account(id: String, n: Int, b: Double) {
    val nic: String = id
    val accNum: Int = n
    var balance: Double = b

    override def toString = "[" + nic + ":" + accNum + ":" + balance + "]"
  }

  //List of accounts

  val a:Account=new Account("acc1",4950302,-1500.00);
  val b:Account=new Account("acc2",30202,2500.00);
  var bank:List[Account]=List(a,b);

  //overdraft accounts
  val overdraft = bank.filter(x=>x.balance<0)
  println("Over Draft Accounts : "+overdraft);


  // Sum of all the balances
  var total = bank.map(x=>x.balance).reduce((x,y) => x+y)
  println("Total Balance = " +total)

  //interest of each account
  bank.map(x=> if(x.balance>0) x.balance=x.balance*1.05 else x.balance=x.balance*1.1)
  println("With Interest :"+bank);

}