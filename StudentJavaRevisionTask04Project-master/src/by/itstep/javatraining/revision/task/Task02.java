package by.itstep.javatraining.revision.task;

/*	Task 02. Desks [рабочие столы]
 *
 *	В Академии решили набрать три новых группы и оборудовать аудитории
 *  для них новыми рабочими столами. За каждым столом может сидеть только
 *  два учащихся. Известно количество учащихся в каждой из трёх групп.
 *	Высчитайте НАИМЕНЬШЕЕ число рабочих столов, которое нужно приобрести
 *  для Академии. Каждая группа сидит в своей отдельной аудитории.
 *
 *	Примечание
 *	1) Не забудьте про "защиту от дурака": если данные неправильны,
 *  то нужно возвратить 0.
 *  2) Данную задачу можно решить, используя только встроенные операции языка.
 *
 *	Формат входных данных [input]
 *	Метод получает на вход три натуральных числа: количество учащихся
 *  в каждой из трёх групп.
 *
 *	Формат выходных данных [output]
 *	Метод должен возвратить одно целое число - ответ на задачу,
 *  или ноль, если данные ошибочны.
 *
 *	[ input 1]: 20 21 22
 *	[output 1]: 32
 *
 *	[ input 2]: 16 18 20
 *	[output 2]: 27
 *
 *	[ input 3]: 1 1 1
 *	[output 3]: 3
 *
 *	[ input 4]: -5 15 23
 *	[output 4]: 0
 *
 *	[ input 5]: 19 0 23
 *	[output 5]: 0
 */
public class Task02 {
    public static final int PEOPLE_ONE_TABLE = 2;

    public static int start(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 0;
        }

        int tableFirst = a % PEOPLE_ONE_TABLE == 0
                ? a / PEOPLE_ONE_TABLE : a / PEOPLE_ONE_TABLE + 1;
        int tableSec = b % PEOPLE_ONE_TABLE == 0
                ? b / PEOPLE_ONE_TABLE : b / PEOPLE_ONE_TABLE + 1;
        int tableThird = c % PEOPLE_ONE_TABLE == 0
                ? c / PEOPLE_ONE_TABLE : c / PEOPLE_ONE_TABLE + 1;

        return tableFirst + tableSec + tableThird;
    }
}