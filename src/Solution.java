/* 
Нужно добавить в программу новую функциональность
Сделать класс Pegas(пегас) на основе класса Horse(лошадь) и интерфейса Fly(летать).


Требования:
1. Класс Solution должен содержать интерфейс Fly с методом fly().
2. Класс Solution должен содержать класс Horse с методом run().
3. Класс Solution должен содержать класс Pegas.
4. Класс Pegas должен наследоваться от класса Horse.
5. Класс Pegas должен реализовывать интерфейс Fly.


public class Solution {
    public static void main(String[] args) {
        Pegas horse = new Pegas();
    }

    public static interface Fly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegas {
    }
}
*/
public class Solution {
    public static void main(String[] args) {
        Pegas horse = new Pegas();
    }

    public static interface Fly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegas extends Horse implements Fly{
        @Override
        public void fly() {

        }
    }
}