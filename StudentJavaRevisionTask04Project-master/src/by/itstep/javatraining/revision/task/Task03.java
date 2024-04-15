package by.itstep.javatraining.revision.task;

/*	Task 03. Digital Watch [электронные часы]
 *
 *	Электронные часы показывают время в формате h:mm:ss (от 0:00:00 до 23:59:59),
 *	т.е. сначала записывается количество часов, потом обязательно ДВУЗНАЧНОЕ количество минут,
 *	затем обязательно ДВУЗНАЧНОЕ количество секунд. Количество минут и секунд при необходимости
 *  дополняются до двузначного числа нулями.
 *	С начала суток прошло N секунд. Выведите в виде строки, что покажут электронные часы.
 *
 *  Примечание
 *  1) Не забудьте про "защиту от дурака": если данные некорректны, то нужно возвратить "error".
 *  2) Необходимо учесть, что с начало суток может пройти несколько дней.
 *  3) Данную задачу можно решить, используя только встроенные операции языка.
 *
 *	Формат входных данных [input]
 *	На вход метод получает целое число в диапазоне типа int.
 *
 *	Формат выходных данных
 *	Метод должен возвратить ответ на задачу в виде строки.
 *
 *	[ input 1]: 0
 *	[output 1]: 0:00:00
 *
 *	[ input 2]: 3602
 *	[output 2]: 1:00:02
 *
 *	[ input 3]: 86399
 *	[output 3]: 23:59:59
 *
 *	[ input 4]: 129700
 *	[output 4]: 12:01:40
 *
 *	[ input 5]: -1
 *	[output 5]: error
 */

public class Task03 {
    public static final int SEC_IN_DAY = 86400;
    public static final int SEC_IN_HOUR = 3600;
    public static final int MIN_IN_HOUR = 60;
    public static final int SEC_IN_MINUTE = 60;
    public static final int SINGLE_DIGIT_RES = 10;

    public static String start(int number) {
        if (number < 0) {
            return "error";
        }

        number = getOneDayTime(number);

        StringBuilder builder = new StringBuilder();

        int hour = number / SEC_IN_HOUR;

        builder.append(hour).append(":");

        int minutes = (number % SEC_IN_HOUR) / MIN_IN_HOUR;
        if (minutes < SINGLE_DIGIT_RES) {
            builder.append("0").append(minutes).append(":");
        } else {
            builder.append(minutes).append(":");
        }

        int second = number % SEC_IN_MINUTE;
        if (second < SINGLE_DIGIT_RES) {
            builder.append("0").append(second);
        } else {
            builder.append(second);
        }

        return builder.toString();
    }

    private static int getOneDayTime(int number) {
        while (number >= SEC_IN_DAY) {
            number = number - SEC_IN_DAY;
        }

        return number;
    }
}