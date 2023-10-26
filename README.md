Задание:

Программа сортирует полученную строку определённым образом.
Строка состоит из слов и чисел, состоящих из 2-х цифр. 

Пример, строка на входе:
four 52 along 96 25 gym root 15 hat 73 bank success 38 46

Сортировка будет выглядеть следующим образом:
* 1 шаг: along four 52 25 gym root 15 hat 73 bank success 38 46 96
* 2 шаг: bank along four 52 25 gym root 15 hat success 38 46 96 73
* 3 шаг: four bank along 25 gym root 15 hat success 38 46 96 73 52
* 4 шаг: gym four bank along 25 root 15 hat success 38 96 73 52 46
* 5 шаг: hat gym four bank along 25 root 15 success 96 73 52 46 38
* 6 шаг: root hat gym four bank along 15 success 96 73 52 46 38 25
* 7 шаг: success root hat gym four bank along 96 73 52 46 38 25 15


Проанализируй шаги сортировки, на основании имеющихся данных напиши алгоритм, который воспроизводит ту же самую логику сортировки. 
Описать алгоритм сортировки можно словами, либо на языке программирования, который знаешь. 

Если на вход будет получена строка:
game 45 but 87 17 hook salary 10 image 70 computer table 35 40

Что будет находиться на 3-ей позиции на 4-ом шаге?
