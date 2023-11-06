import java.util.regex.*;

 class RegularExpressionsExample {
    public static void main(String[] args) {
        // 1. Валідація телефонного номера українського оператора у форматі (+380)50-333-33-33
        String phoneNumber = "(+380)50-333-33-33";
        String phoneRegex = "^\\(\\+380\\)\\d{2}-\\d{3}-\\d{2}-\\d{2}$";
        boolean isPhoneNumberValid = phoneNumber.matches(phoneRegex);
        System.out.println("1. Валідація телефонного номера: " + isPhoneNumberValid);

        // 2. Заміна пробілів більше одного на один
        String text = "Я хочу    бути     програмістом";
        String normalizedText = text.replaceAll("\\s+", " ");
        System.out.println("2. Нормалізований текст: " + normalizedText);

        // 3. Видалення html тегів із тексту
        String htmlText = "<div>\n<p>Символи круглих дужок <code>'('</code> та <code>')'</code>. <br />Ці символи\nдозволяють отримати з рядка додаткову інформацію.\n<br/>Зазвичай, якщо парсер регулярних виразів шукає в тексті інформацію\nза заданим виразом і знаходить її - він просто повертає\nзнайдений рядок.</p>\n<p align=\"right\">А ось тут <a href=\"google.com\">посилання</a>, щоб життя медом не здавалося.</p>\n</div>";
        String textWithoutHtml = htmlText.replaceAll("<[^>]*>", "");
        System.out.println("3. Текст без HTML тегів:\n" + textWithoutHtml);
    }
}
