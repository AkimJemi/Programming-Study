    public static void main(String[] args) {
        int a = 400;
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
