public interface Mediator {
    // Colleague たちを生成する
    public abstract void createColleagues();

    // Colleagueの状態が変化したときに呼ばれる
    public abstract void colleagueChanged();
}
