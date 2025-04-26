class LinkedObject<T> {
    T value;
    LinkedObject<T> next;
    LinkedObject(T value, LinkedObject<T> next) {
        this.value = value;
        this.next = next;
    }
}
