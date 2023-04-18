public class Main {

    public static void main(String[] args) {
        Post query = new Post();
        query.birthday = new FormDate();
        query.birthday.day = 14;
        query.birthday.month = 4;
        query.birthday.year = 2023;
        query.name = "Полиграф";
        query.passport = "5475 551224";
        query.patronymic = "Полиграфович";
        query.phone = "+79234015478";
        query.surname = "Шариков";
        query.subscription = false;
    }
}
