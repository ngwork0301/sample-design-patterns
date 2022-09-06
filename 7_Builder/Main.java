import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("text")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getTextResult();
            System.out.println(result);
        } else if(args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getHTMLResult();
            System.out.println("HTMLファイル" + filename + "が作成されました。");
        } else {
            usage();
            System.exit(0);
        }
    }

    // 使い方を表示する
    public static void usage() {
        System.out.println("Usage: java Main text       テキストで文書作成");
        System.out.println("Usage: java Main html       HTMLファイルで文書作成");
    }
}