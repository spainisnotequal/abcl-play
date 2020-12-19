import org.armedbear.lisp.Function;
import org.armedbear.lisp.Interpreter;
import org.armedbear.lisp.Package;
import org.armedbear.lisp.Packages;
import org.armedbear.lisp.Symbol;

public class Main
{
        /**
         * This example creates an Interpreter instance, loads our
         * lisp code from a file and then looks up a function defined
         * in the loaded lisp file and executes the function.
         */
        public static void main(String[] argv)
                {
                        try
                        {
                                Interpreter interpreter = Interpreter.createInstance();
                                interpreter.eval("(load \"hello-world.lisp\")");
                                // the function is not in a separate package, thus the
                                // correct package is CL-USER. Symbol names are
                                // (usually) upper case. 
                                Package defaultPackage 
                                        = Packages.findPackage("CL-USER");
                                Symbol sym 
                                        = defaultPackage.findAccessibleSymbol("SAY-HELLO-WORLD");
                                Function function = (Function) sym.getSymbolFunction();
                                function.execute();
                        }
                        catch (Throwable t)
                        {
                                System.out.println("exception!");
                                t.printStackTrace();
                        }
                }
}
