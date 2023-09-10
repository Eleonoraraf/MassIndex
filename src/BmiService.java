public class BmiService {

    public int calculate(int BodyWeight, int height) {
        int BodyMassIndex = (BodyWeight * 10000) / (height * height);
        return BodyMassIndex;
    }
}
