
public class Main {

    public static void main(String[] args) throws Exception {
        // write some test code here
        // for testing purposes, project has files
        //    src/textfile.txt
        //    src/kalevala.txt
        Printer print = new Printer("src/textfile.txt");
        Printer print2 = new Printer("src/kalevala.txt");
        print.printLinesWhichContain("on");
        print.printLinesWhichContain("tuli");
        print2.printLinesWhichContain("runoja");

    }
}
