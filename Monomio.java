
public class Monomio{

    private double c;
    private int p;

	public Monomio(int p, double c){
        this.c = c;
        this.p = p;
	}

    public double getC(){
        return this.c;
    }

    public int getP(){
        return this.p;
    }

    public void setC(double novo){
        this.c=novo;
    }
    public void setP(int novo){
        this.p=novo;
    }

    public Monomio mais (Monomio outro) throws Exception{
        if (outro == null)
            throw Exception("Ta nulo");
	if (this.p != outro.p)
            throw Exception("Potencias Diferentes");

        return new Monomio(this.c + outro.c, outro.p)
    }

    public Monomio menos (Monomio outro) throws Exception{
        if (outro == null)
            throw Exception("Ta nulo");
	if (this.p != outro.p)
            throw Exception("Potencias Diferentes");
        return new Monomio(this.c - outro.c, outro.p)
    }

    public double aplicadoA(double x){
        return this.c * Math.pow(x, this.p);
    }
}