import java.util.Objects;

public class Komplex {
    public double vanligt;
    public double Negativt;

    public Komplex(double v, double I) {
        this.vanligt = v;
        this.Negativt = I;
    }


    @Override
    public String toString() {
        return "(" + vanligt + " + " + Negativt + "i)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Komplex komplex = (Komplex) o;
        return Double.compare(komplex.vanligt, vanligt) == 0 &&
                Double.compare(komplex.Negativt, Negativt) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vanligt, Negativt);
    }

    public Komplex add(Komplex b) {
        return new Komplex((b.vanligt + this.vanligt), (b.Negativt + this.Negativt));
    }

    public Komplex sub(Komplex b) {
        return new Komplex((this.vanligt - b.vanligt), (this.Negativt - b.Negativt));
    }

    public Komplex multiply(Komplex b) {
        return new Komplex(((b.vanligt * this.vanligt) - (b.Negativt * this.Negativt)), ((this.vanligt * b.Negativt) + (this.Negativt * b.vanligt)));
    }

    public  Komplex division(Komplex b) {
        double E = ((b.vanligt*b.vanligt) + (b.Negativt*b.Negativt));
        return  new Komplex(((this.vanligt*b.vanligt)+(this.Negativt*b.Negativt))/(E),(((this.Negativt*b.vanligt)-(this.vanligt*b.Negativt))/(E)));
    }


    public double arg() {
        if (this.vanligt > 0) {
            return (Math.atan(this.Negativt / this.vanligt));
        } else if (this.Negativt >= 0 && this.vanligt < 0) {
            return (Math.atan((this.Negativt / this.vanligt) + Math.PI));
        } else if (this.Negativt < 0 && this.vanligt < 0) {
            return (Math.atan((this.Negativt / this.vanligt) - Math.PI));
        } else if (this.Negativt > 0 && this.vanligt==0) {
            return (Math.PI/2);
        } else if (this.Negativt < 0 && this.vanligt==0) {
            return (-1*(Math.PI/2));
        } else {
            return 0;
        }
    }
}

