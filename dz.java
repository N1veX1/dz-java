public class dz {

    public static void main(String[] args) {
        System.out.println("старт программы");

        double a = 1.0;
        double b = 2.0;
        double c = 0.0001;
        double d = 1.5;
        int e = 100;

        solve(d, c, e);

        System.out.println("конец программы");
    }

    public static void solve(double f, double g, int h) {
        System.out.println("[система]: вызвана функция solve(). начинаем расчет");
        
        double i = f;
        int j = 0;
        double k = 0.0;
        double m = 1.0; 

        while (j < h) {
            if (m > g) {
                k = Math.cbrt(i + 2.0);
                j = j + 1;

                System.out.println("итерация " + j + " значение x равно " + k);

                m = k - i;
                if (m < 0) {
                    m = -m;
                }

                i = k;
            }
        }

        System.out.println("корень успешно найден");
        System.out.println("приближенное значение корня равно " + i);
        System.out.println("количество затраченных итераций равно " + j);
    }
}

