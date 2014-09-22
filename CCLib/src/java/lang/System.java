package java.lang;

import java.io.PrintStream;
import cc.terminal.TerminalOutputStream;
import cc.terminal.SystemTerminal;

public final class System {
	public static SystemTerminal term;
	public static PrintStream out;
	public static PrintStream err;

	static {
		term = new SystemTerminal();
		out = new PrintStream(new TerminalOutputStream(term), true);
		err = new PrintStream(new TerminalOutputStream(term), true);
	}

	native public static void load(String nativeName);

	public static native void arraycopy(Object src,  int  srcPos, Object dest, int destPos, int length);
}