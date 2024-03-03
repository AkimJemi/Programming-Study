    public static void main(String[] args) {
        int a = 400;
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


    public static void main(String[] args) {
        int c = 130000;
        boolean stop = false;
        for (int i = 1; i < c; i++) {
            for (int j = 1; j < c; j++) {
                if ((i * i + j * j) == c * c) {
                    System.out.println("true : " + i + ", " + j);
                    stop = true;
                    break;
                }
            }
            if (stop) {
                break;
            }
        }
        System.out.println("impossible");
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int min = 0;
        int max = (int) IntStream.rangeClosed(a > b ? a : b, a * b).filter(c -> c % a == 0 && c % b == 0).min().getAsInt();
        boolean stop = false;
        int[] arrayA = IntStream.rangeClosed(2, a).filter(c -> a % c == 0).toArray();
        int[] arrayB = IntStream.rangeClosed(2, b).filter(c -> b % c == 0).toArray();
        for (int x : arrayA) {
            for (int y : arrayB) {
                if (x == y) {
                    min = x;
                    stop = true;
                    break;
                }
            }
            if (stop) {
                break;
            }
        }
        System.out.println("최소공배수 : " + min);
        System.out.println("최대공배수 : " + max);
    }
