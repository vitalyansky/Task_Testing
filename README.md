# Тестирование

В данной работе была проведена работа по тестированию арифметических операций на языке Java. Были протестированы
следующие операции:
 - поиск максимума в массиве
 - поиск минимума в масисве
 - нахождение суммы элементов массива
 - нахождение произведение элементов массива

В работе был написаны тесты, сравнивающие время выполнения программы при различных размерах входный данных. Программа
тестировалась на выборках от 10<sup>5</sup> до 7 * 10<sup>5</sup>. Также по результатам проделанной работы можно
построить график на основе библиотеки `javafx`

При первом вызове метода мы можем наблюдать большой скачок времени, это связано с тем, что при первом запуске будет
будет осуществляться загрузка и инициализация класса, а также компиляция и оптимизация байт-кода.