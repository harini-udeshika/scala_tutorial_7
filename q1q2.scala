object q1q2 extends App {

  class Rational(x:Int,y:Int){
    var number=x;
    var denom=y;

    def neg(): Unit = {
      number = number * (-1)
    }
    def sub(r: Rational)=new Rational(number*r.denom-r.number*denom,denom*r.denom)

  }
  val r1=new Rational(3,5)
  r1.neg();
  var x = new Rational(3, 4)
  var y = new Rational(5, 8)
  var z = new Rational(2, 7)
  val ans=x.sub(y).sub(z)
  println(ans.number+"/"+ans.denom)


}
