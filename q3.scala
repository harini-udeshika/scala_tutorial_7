object q3 extends App {
  var bank: List[Account] = List()

  class Account(id: String, n: Int, b: Double) {
    val nic: String = id
    val acno: Int = n
    var bal: Double = b

    def transfer(a: Account, amount: Int): Unit = {
      if (bal < amount) {
        println("No sufficient money")
      } else {
        a.bal = a.bal + amount;
        bal = bal - amount;
        println("Balance " + nic + ":" + bal + "\nBalance " + a.nic + ":" + a.bal)
      }
    }
  }
  var acc1=new Account("acc1",200048339,500)
  var acc2=new Account("acc2",230405056,2000)
  acc1.transfer(acc2,1000)
}

