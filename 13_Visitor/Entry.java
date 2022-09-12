public abstract class Entry implements Element {
    // 名前を彫る
    public abstract String getName();

    // サイズを得る
    public abstract int getSize();

    // 文字列表現
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
