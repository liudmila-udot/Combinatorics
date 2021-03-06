# Правило сложения
Вероятность появления одного из двух несовместных событий равна сумме вероятностей этих событий.

P (A или B) = P(A) + P(B)

Вероятность того, что из колоды карт выпадет Hearts = 12/52.

Вероятность суммы совместных событий вычисляется по формуле

P(A или B)=P(A) + P(B) − P(A и B)

# Правило умножения

Если два события, A и B, независимы (т. е. возникновение одного события не влияет на возможность появления другого), 
то вероятность того, что оба события произойдут, равна произведению вероятности каждого:

P (A и B) = P(A) * P(B)

Теорема умножения вероятностей зависимых событий: вероятность совместного появления двух зависимых событий равна произведению вероятности одного из них на условную вероятность другого, вычисленную в предположении, что первое событие уже произошло:

P (AB) = P(A)*Pa(B)

где Pa(B) вероятность события B при условии что А произошло.

# Зависимые события

Сначала рассмотрим традиционный набор, состоящий из двух событий: событие B является зависимым, если помимо случайных факторов его вероятность зависит от появления либо непоявления события A. Вероятность события B, вычисленная в предположении того, что событие  A уже произошло, называется условной вероятностью наступления события B и обозначается через Pa(B). При этом события A и B называют зависимыми событиями (хотя, строго говоря, зависимо только одно из них).

**Пример:**

Из колоды в 36 карт последовательно извлекаются 2 карты. Найти вероятность того, что вторая карта окажется червой, если до этого:

а) была извлечена черва

б) была извлечена карта другой масти.

Ответ: 

a) 8/35

b) 9/35

# Sum

Из 2 непересекающихся множеств 1 элемент может быть выбран M + N способами
#### Пример:
Номер машины состоит из букв (26) и цифр (10)
36 различных выборов для одного символа

# Multiplication

Количество способов, которыми можно выбрать упорядоченную пару равно произведению количества вариантов выбора первого элемента на количество выборов второго элемента.

#### Пример:
Из 28 сортов мороженого и 4 сортов сиропа можно создать 28*4 = 112 мороженых с сиропом

# Строки

Строка - последовательность элементов S. 
Иногда, используется термин k-подстрока - строка длиной k.

Если алфавит содержит n элементов, то количество разных строк равно
n * n * n (k раз) = n<sup>k</sup>

Потому что есть n вариантов выбор каждого злемента.

#### Пример:
Количество двоичных чисел с длиной 3

2<sup>3</sup> = 8.

000, 001, 011, 100, 101, 010, 110, 111

# Permutation (Перестановка)

Упорядоченная последовательность всех элементов из S, в которой элементы не встречаются больше 1 раза.

Пусть в S n элементов.

Количество разных расположений:
n! = n * (n-1) * (n-2)

#### Пример:
Количество перестановок 3 шариков (красный, зеленый, синий)
![](150px-Permutations_RGB.svg.png)

# Permutation with repetition (Перестановка c повторениями)

In general, repetitions are taken care of by dividing the permutation by the factorial of the number of objects that are identical.

Пусть имеется n объектов различных типов:
n1 первого типа
n2 второго типа
......
n(k) k-го  типа

Сколькими способами можно переставить все объекты между собой?

Для все объектов n! и так как объекты одного типа взаизаменяемы и могут быть переставлены
n(k)! раз внутри, то надо разделить на все перестановки типов

n!/(n1!n2!...n(k)!)

# k-Permutation (Размещение)

Упорядоченная последовательность k элеметов,  в которой элементы не встречаются больше 1 раза.

n * (n - 1) * (n - k + 1) = n!/(n-k)!

# k-Combinations (Сочетания)

k элеметов из n, без упорядочивания (и без повторений).

Вывод формулы: берем количество размещений и убираем упорядочивание.
В k размерном множестве может быть k! различных выборов элементов из множества k.

Делим количества сочетаний на количество повторений.

n!/k!(n-k)!

Формула симметрична относительно k и (n - k)

(n, k) = (n, k -1)

#### Пример:

Количество возможных флопов в покере (первые 3 карты на столе).





