package Part1.Charpter2;

/**
 * Класс реализует связанный список объектов, способный хранить объекты либого типа, реализующие вложенный интерфейс
 * Linkable
 * Все методы синхронизированы, так что класс могут безоспасно использовать несколько потоков одноврменно
 */

public class LinkedList {

    // методы необходимые любому объекту для присоединения к связанному списку
    private interface Linkable {
        public Linkable getNext();

        public void setNext(Linkable node);
    }

    // Содержит первый узел (head) списка;
    Linkable head;

    // Вставляет узел в начало списка
    public synchronized Linkable getHead() {
        return head;
    }

    // Вставляет узел в конец списка
    public synchronized void insertAtHead(Linkable node) {
        node.setNext(head);
        head = node;
    }

    // Вставляет узел в конец списка
    public synchronized void insertAtTail(Linkable node) {
        if (head == null) head = node;
        else {
            Linkable p, q;
            for (p = head; (q = p.getNext()) != null; p = q) ; //пустой цикл
            p.setNext(node);
        }
    }

    // Удаляет и возвращает в качестве значения узел находящийся в начале списка
    public synchronized Linkable removeFromHead() {
        Linkable node = head;
        if (node != null) {
            head = node.getNext();
            node.setNext(null);
        }
        return node;
    }

    // Удаляет и возвращает в качесте значения узел находящийся в конце списка
    public synchronized Linkable removeFromTail() {
        if (head == null) return null;
        Linkable p = head, q = null, next = head.getNext();
        if (next == null) {
            head = null;
            return p;
        }
        while ((next = p.getNext()) != null) {
            q = p;
            p = next;
        }
        q.setNext(null);
        return p;
    }

    // Удаляет из списка узел совпадающий с заданным, Для проверки применяется метод equals()
    public synchronized void remove(Linkable nod) {
        if (head == null) return;
        if (head.equals(head)) {
            head = head.getNext();
            return;
        }
        Linkable p = head, q = null;
        while ((q = p.getNext()) != null) {
            if (head.equals(q)) {
                p.setNext(q.getNext());
                return;
            }
            p = q;
        }
    }
//    public static class Test {
//        static class LinkableInteger implements Linkable {
//            int i;
//        }
//    }
}


