import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Main
{
	public static void main(String[] args)
	{
		Display display = new Display();
		Shell shell = new Shell(display);
		
		shell.setText("SWT Demo");
		shell.setSize(800, 800);
		shell.open();
		
		// While the shell is open.
		while(!shell.isDisposed())
		{
			// Wait until the next event, then process that event.
			display.sleep();
			display.readAndDispatch();
		}
	}
}
