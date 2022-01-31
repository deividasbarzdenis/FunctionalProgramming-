package org.functionalProgrammingExamples;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.err;

/**
 *
 * The main() method in this example first verifies that a single command-line argument (the name of a script file)
 * has been specified. Otherwise, it displays usage information and terminates the application.
 *
 * Assuming the presence of this argument, main() instantiates the javax.script.ScriptEngineManager class.
 * ScriptEngineManager is the entry-point into Java's Scripting API.
 *
 * Next, the ScriptEngineManager object's ScriptEngine getEngineByName(String shortName) method is called
 * to obtain a script engine corresponding to the desired shortName value. Java 10 supports the Nashorn script engine,
 * which is obtained by passing "nashorn" to getEngineByName(). The returned object's class implements the
 * javax.script.ScriptEngine interface.
 *
 * ScriptEngine declares several eval() methods for evaluating a script. main() invokes the Object eval(Reader reader)
 * method to read the script from its java.io.FileReader object argument and
 * (assuming that java.io.IOException isn't thrown) then evaluate the script. This method returns any script
 * return value, which I ignore. Also, this method throws javax.script.ScriptException when an error occurs
 * in the script.
 * */
public class RunScript {
    public static void main(String[] args) {
        if (args.length != 1)
        {
            err.println("usage: java RunScript script");
            return;
        }
        ScriptEngineManager manager =
                new ScriptEngineManager();
        ScriptEngine engine =
                manager.getEngineByName("nashorn");
        try
        {
            engine.eval(new FileReader(args[0]));
        }
        catch (ScriptException se)
        {
            err.println(se.getMessage());
        }
        catch (IOException ioe)
        {
            err.println(ioe.getMessage());
        }
    }
}
