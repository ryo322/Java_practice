class Main {
    public static void main(String[] args) {
        int month = 12;
        int day = 29;
        float weight = 63.0f; //floatはfを忘れてはならない
        double height = 168.5;
        char bloodType = 'A';
        String name = "田中";

        System.out.println("こんにちは！" + name + "です");
        System.out.println("身長は" + height + "cm、体重は" + weight + "kg、");
        System.out.println("誕生日は" + month + "月" + day + "日、");
        System.out.println("血液型は" + bloodType + "型です");
    }
}