public class RealNumber extends Number{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  public boolean equals(RealNumber other){
    if (value == 0.0){
      return (other.getValue() == 0.0);
    }
    double diff = (value-other.getValue());
    return Math.abs(diff)<=0.00001;
  }

  public RealNumber add(RealNumber other){
    RealNumber a = new RealNumber(value+other.getValue());
    return a;
  }

  public RealNumber multiply(RealNumber other){
    RealNumber a = new RealNumber(value*other.getValue());
    return a;
  }


  public RealNumber divide(RealNumber other){
    RealNumber a = new RealNumber(value/other.getValue());
    return a;
  }

  public RealNumber subtract(RealNumber other){
    RealNumber a = new RealNumber(value-other.getValue());
    return a;
  }
}
