

    public static void main(String[] args) {
        int input = 77;
        int output = 0;
        while (input >= 10) {
            input = Arrays.stream(String.valueOf(input).split("")).
                    mapToInt(Integer::parseInt).reduce((a, b) -> a * b).getAsInt();
            output++;
        }
        System.out.println("Count result : " + output);
    }



        String s = "DCXXI";
        int result = Arrays.stream(s.replace("IV", "4 ")
                .replace("IV", "4 ")
                .replace("IX", "9 ")
                .replace("XL", "40 ")
                .replace("XC", "90 ")
                .replace("CD", "400 ")
                .replace("CM", "900 ")
                .replace("I", "1 ")
                .replace("V", "5 ")
                .replace("X", "10 ")
                .replace("L", "50 ")
                .replace("C", "100 ")
                .replace("D", "500 ")
                .replace("M", "1000 ").trim().split(" ")).mapToInt(Integer::parseInt).sum();

        StringBuilder stringBuilder = new StringBuilder();
        while (num != 0) {
            System.out.println(num);
            if (num >= 1000) {
                stringBuilder.append("M");
                num -= 1000;
            } else if (num >= 900) {
                stringBuilder.append("CM");
                num -= 900;
            } else if (num >= 500) {
                stringBuilder.append("D");
                num -= 500;
            } else if (num >= 400) {
                stringBuilder.append("CD");
                num -= 400;
            } else if (num >= 100) {
                stringBuilder.append("C");
                num -= 100;
            } else if (num >= 90) {
                stringBuilder.append("XC");
                num -= 90;
            } else if (num >= 50) {
                stringBuilder.append("L");
                num -= 50;
            } else if (num >= 40) {
                stringBuilder.append("XL");
                num -= 40;
            } else if (num >= 10) {
                stringBuilder.append("X");
                num -= 10;
            } else if (num >= 9) {
                stringBuilder.append("IX");
                num -= 9;
            } else if (num >= 5) {
                stringBuilder.append("V");
                num -= 5;
            } else if (num >= 4) {
                stringBuilder.append("IV");
                num -= 4;
            } else {
                stringBuilder.append("I");
                num -= 1;
            }
        }
        return stringBuilder.toString();

        public static void main(String[] args) {
        long result = IntStream.rangeClosed(1, 1000000).
                mapToLong(a -> {
                            int count = 0;
                            int num = Integer.parseInt(String.valueOf(a));
                            while (num < 10) {
                                num = Arrays.stream(String.valueOf(num).split("")).
                                        mapToInt(Integer::parseInt).
                                        reduce((b, c) -> b * c).
                                        getAsInt();
                                count++;
                            }
                            return count;
                        }
                ).
                filter(d -> d == 3).count();
    }
