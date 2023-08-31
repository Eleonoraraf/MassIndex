public class BmiService {

    public int calculate(int m , int h) {
        int hh = (m* 10000)/(h * h);
        return hh;
    }
}
