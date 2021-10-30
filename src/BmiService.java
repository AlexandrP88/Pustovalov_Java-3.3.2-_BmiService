public class BmiService {
    public int calculate(int height, int weight) {
        int bmi = weight * 10000 / (height * height);

        return bmi;
    }
}

