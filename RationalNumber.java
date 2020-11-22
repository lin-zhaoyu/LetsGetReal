public class RationalNumber extends RealNumber{
  private int numerator, denominator;
  public RationalNumber(int nume, int deno){
    super(0.0);
    if(deno ==0){
      deno = 1;
    }
    if(deno < 0){
      nume = -1*nume;
      deno = -1*deno;
    }
    denominator = deno;
    numerator = nume;
  }
  public double getValue(){
    return 0.0;
  }
  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

}