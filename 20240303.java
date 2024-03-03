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
