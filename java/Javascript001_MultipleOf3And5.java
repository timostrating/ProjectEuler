import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Javascript001_MultipleOf3And5 {

    // I recently read that java has a javascript engine build into Java 8.
    // This is a terrible first test of that engine called JJS.
    // I truly don't know why anyone would like to use this.
    // But anyway it was nice to learn about.

    public static void main(String[] args) throws ScriptException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval("" +
                "var sum = 0;" +
                "for (var i=0; i < 1000; i++) { " +
                    "if(i % 3 == 0 || i % 5 == 0) {" +
                        "sum += i;" +
                    "}" +
                "}" +
                "print(sum)");
    }
}