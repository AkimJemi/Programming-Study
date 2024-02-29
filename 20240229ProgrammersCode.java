    public String solution(String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));

        return String.join("", set);
    }
    public String solution(String my_string) {
        return my_string.chars()
                .mapToObj(Character::toString)
                .distinct()
                .collect(Collectors.joining());
    }
