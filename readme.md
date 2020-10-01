#Постановка задачи

Написать программу ”Hello, World!”. В ходе выполнения программы она должна выбросить исключение и завершиться с ошибкой.

- Смоделировав ошибку «NullPointerException»
- Смоделировав ошибку «ArrayIndexOutOfBoundsException»
- Вызвав свой вариант ошибки через оператор throw

#Пояснение к задаче

Выбран интерактивный подход чтобы в одном коде покрыть все описанные ситуации.
Пользователю предлагается выбраться режим выполнения программы от 0 до 3, где:
- 0 - просто вывод ”Hello, World!”
- 1 - NPE
- 2 - ArrayIndexOutOfBoundsException
- 3 - своя кастомная ошибка

Режим считывается при выполнении из консоли. Есть защита от неверено выбранных режимов.