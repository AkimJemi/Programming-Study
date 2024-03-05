    // 로그인 성공?
    public String solution(String[] idPw, String[][] db) {
        return getDb(db).get(idPw[0]) != null ? getDb(db).get(idPw[0]).equals(idPw[1]) ? "login" : "wrong pw" : "fail";
    }

    private Map<String, String> getDb(String[][] db) {
        Map<String, String> map = new HashMap<>();

        for (String[] array : db) {
            map.put(array[0], array[1]);
        }
        return map;
    }
    // 직사각형 넓이 구하기
    public int solution(int[][] dots) {
        int answer = 0;
        int tmp = dots[0][0];
        int tmp2 = 0;
        int tmp3 = 0;
        for(int i = 1; i<dots.length; i++){
            if(dots[i][0] == tmp){
                tmp2 = Math.abs(dots[i][1] - dots[0][1]);
            }else{
                tmp3 = Math.abs(dots[i][0] - dots[0][0]);
            }
        }
        answer = tmp2 * tmp3;
        return answer;
    }
    public int solution(int[][] dots) {
        int x = Math.max(Math.abs(dots[0][0] - dots[1][0]),Math.abs(dots[0][0] - dots[2][0]));
        int y = Math.max(Math.abs(dots[0][1] - dots[1][1]),Math.abs(dots[0][1] - dots[2][1]));
        return x*y;
    }
    public int solution(int[][] dots) {
        Arrays.sort(dots,Comparator.comparing((int[] it)-> it[0]).thenComparing((int[] it)->it[1]));
        return (dots[3][0] - dots[0][0]) * (dots[3][1] - dots[0][1]);
    }

    // 
    public int solution(String[] spell, String[] dic) {
        return Arrays.stream(dic).
        map(s -> 
        s.chars().sorted().mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining())
        ).
        collect(Collectors.toList()).
        contains(
        Arrays.stream(spell).sorted().collect(Collectors.joining())
        ) ? 1 : 2;
    }
    public int solution(int i, int j, int k) {
        int count = 0;
        for (int t = i; t <= j; t++) {
            for (int p : Arrays.stream(String.valueOf(t).split("")).mapToInt(Integer::parseInt).toArray()) {
                if (p == k) {
                    count++;
                }
            }
        }
        return count;
    }
    public int solution(String my_string) {
        Matcher matcher = Pattern.compile("[-|+]\\s([0-9])+(,[0-9]+)?").matcher(my_string);
        Matcher firstNum = Pattern.compile("^[0-9]+(,[0-9]+)?").matcher(my_string);
        firstNum.find();
        int result = Integer.parseInt(firstNum.group().replace(",", "j"));
        while (matcher.find()) {
            String matchStr = matcher.group().replace(",", "");
            if (matchStr.contains("-")) {
                result -= Integer.parseInt(matchStr.replace("- ", ""));
            } else {
                result += Integer.parseInt(matchStr.replace("+ ", ""));
            }
        }
        return result;
    }
    public int solution(String myString) {
        return Arrays.stream(myString.replaceAll("- ", "-").replaceAll("[+] ", "").trim().split(" ")).mapToInt(Integer::parseInt).sum();
    }
    public String[] solution(String myStr, int n) {
        return IntStream.range(0, myStr.length() / n + (myStr.length() % n > 0 ? 1 : 0))
                .mapToObj(i -> i == myStr.length() / n ? myStr.substring(i * n) : myStr.substring(i * n, (i + 1) * n))
                .toArray(String[]::new);
    }
 

    public int solution(String myString) {
        return Arrays.stream(myString.split("[A-Z|a-z]")).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum();
    }
    public String solution(String s) {
        return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() <= 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());
    }
    public int solution(int i, int j, int k) {
        String str = "";
        for(int a = i; a <= j; a++) {
            str += a+"";
        }

        return str.length() - str.replace(k+"", "").length();
    }
    public int solution(int i, int j, int k) {
        return (int) Arrays.stream(IntStream.rangeClosed(i, j)
                        .mapToObj(String::valueOf)
                        .flatMap(String::lines)
                        .collect(Collectors.joining())
                        .split(""))
                .filter(s -> s.equals(String.valueOf(k)))
                .count();
    }
    public int solution(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
    }
    public String solution(String myString, int num1, int num2) {
        List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());

        Collections.swap(list, num1, num2);
        return String.join("", list);
    }
    public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
    }
class Solution {
    public String solution(String myString) {
        return myString.chars().mapToObj(operand -> String.valueOf((char) (Character.isLowerCase(operand) ? Character.toUpperCase(operand) : Character.toLowerCase(operand)))).collect(Collectors.joining());
    }
}

class Solution {
    public String solution(String cipher, int code) {
        return IntStream.range(0, cipher.length())
                .filter(value -> value % code == code - 1)
                .mapToObj(c -> String.valueOf(cipher.charAt(c)))
                .collect(Collectors.joining());
    }
}
    public int solution(int[] array, int n) {
        return Math.min(array[Arrays.stream(array).map(operand -> Math.abs(n - operand)).boxed().collect(Collectors.toList()).indexOf(Arrays.stream(array).map(operand -> Math.abs(n - operand)).min().orElse(0))], array[Arrays.stream(array).map(operand -> Math.abs(n - operand)).boxed().collect(Collectors.toList()).lastIndexOf(Arrays.stream(array).map(operand -> Math.abs(n - operand)).min().orElse(0))]);
    }
    public int solution(String[] babbling) {
        String regex = "(aya|ye|woo|ma)";
        int result = 0;
        for (String str :
                babbling) {
            if (str.replaceAll(regex, "").length() == 0) {
                result++;
            }
        }
        return result;
    }
    public int solution(String my_string) {
        int result = 0;
        Matcher matcher = Pattern.compile("[0-9]").matcher(my_string);
        while (matcher.find()) {
            result += Integer.valueOf(matcher.group());
        }
        return result;
    }
    public int solution(int n) {
        int answer = 0;
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
    public String solution(String my_string) {
        String answer = "";

        answer = my_string.replaceAll("[aeiou]", "");

        return answer;
    public int solution(int n, int t) {
        int answer = 1;

        answer = n * (int)Math.pow(2, t);

        return answer;
    }
    public int solution(int n, int t) {
        int answer = 0;

        answer = n << t;

        return answer;
    }
    public int solution(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>(Arrays.asList(s1));
        return (int)Arrays.stream(s2).filter(set::contains).count();
    }
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        if (direction.equals("right")) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public int[][] solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length / n)
                .mapToObj(i -> IntStream.range(0, n)
                        .map(j -> num_list[i * n + j])
                        .toArray())
                .toArray(int[][]::new);
    }
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};

        int length = num_list.length;

        answer = new int[length/n][n];

        for(int i=0; i<length; i++){
            answer[i/n][i%n]=num_list[i];
        }

        return answer;
    }
    Map<String, String> dictionary = new HashMap<>() {{
        put(".-", "a");
        put("-...", "b");
        put("-.-.", "c");
        put("-..", "d");
        put(".", "e");
        put("..-.", "f");
        put("--.", "g");
        put("....", "h");
        put("..", "i");
        put(".---", "j");
        put("-.-", "k");
        put(".-..", "l");
        put("--", "m");
        put("-.", "n");
        put("---", "o");
        put(".--.", "p");
        put("--.-", "q");
        put(".-.", "r");
        put("...", "s");
        put("-", "t");
        put("..-", "u");
        put("...-", "v");
        put(".--", "w");
        put("-..-", "x");
        put("-.--", "y");
        put("--..", "z");
    }};

    public String solution(String letter) {
        return Arrays.stream(letter.split(" "))
            .map(dictionary::get)
            .collect(Collectors.joining());
    }
 

 

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++){
            if(answer[i] != 0){
                continue;
            }
            int idx = 1;
            for(int j = 0; j < answer.length; j++){
                if(emergency[i] < emergency[j]){
                    idx++;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }
    public int[] solution(int[] e) {
        return Arrays.stream(e).map(i -> Arrays.stream(e).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1).toArray();
    }
 

    public String solution(int age) {
        return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
    }
 

    public long solution(String numbers) {

            String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            for (int i = 0; i < numbers_arr.length; i++) {
                numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
            }

            long answer = Long.parseLong(numbers);
            return answer;
        }
    public long solution(String numbers) {
        return Long.parseLong(
                numbers.replaceAll("zero", "0")
                        .replaceAll("one", "1")
                        .replaceAll("two", "2")
                        .replaceAll("three", "3")
                        .replaceAll("four", "4")
                        .replaceAll("five", "5")
                        .replaceAll("six", "6")
                        .replaceAll("seven", "7")
                        .replaceAll("eight", "8")
                        .replaceAll("nine", "9")
        );
    }
 

 

짝수 홀수 개수
 
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list)
                .boxed()
                .collect(Collectors.partitioningBy(number -> number % 2 == 1, Collectors.counting()))
                .values().stream()
                .mapToInt(Long::intValue)
                .toArray();
    }
    public int[] solution(int[] numList) {
        return IntStream.of((int) Arrays.stream(numList).filter(i -> i % 2 == 0).count(), (int) Arrays.stream(numList).filter(i -> i % 2 == 1).count()).toArray();
    }
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }
 
        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();
 

 

문자 반복 출력하기
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            answer += str[i].repeat(n);
        }
        return answer;
    }
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }
