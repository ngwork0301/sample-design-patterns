public abstract class Entry {
    // 名前を彫る
    public abstract String getName();

    // サイズを得る
    public abstract int getSize();

    // 一覧を得る
    public void printList() {
        printList("");
    }

    // prefixを前につけて、一覧を表示する
    protected abstract void printList(String prefix);

    // 文字列表現
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}