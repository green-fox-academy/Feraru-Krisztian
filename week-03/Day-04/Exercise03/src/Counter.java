public class Counter {

    int value;
    int number;
    int enteredValue;

    Counter() {
        this.value = value;
    }

    Counter(int value) {
        this.value = value;
        this.enteredValue = value;
    }

    int add(int number) {
        this.value += number;
        return value;
    }

    int add() {
        this.value++;
        return value;
    }

    int get() {
        return value;
    }

    int reset() {
        value = enteredValue;
        return value;
    }
}
