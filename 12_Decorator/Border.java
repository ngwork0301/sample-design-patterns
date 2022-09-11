public abstract class Border extends Display {
    protected Display display;   // この飾り枠がくるんでいる「中身」

    protected Border(Display display) {
        this.display = display;
    }
}
