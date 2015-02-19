import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Main
{
	public static void main(String[] args)
	{
		// The current users display.
		Display display = new Display();
		Shell shell = new Shell(display);
		
		// The window.
		shell.setText("SWT Demo");
		shell.setSize(800, 800);
		shell.setLayout(new RowLayout());
		shell.open();
		
		// Push button.
		Button button = new Button(shell, SWT.PUSH);
		button.setText("Exit");
		
		// Assigning close operation to the button.
		button.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				shell.dispose();
			}
		});
		
		// While the shell is open.
		while(!shell.isDisposed())
		{
			// Wait until the next event, then process that event.
			display.sleep();
			display.readAndDispatch();
		}
	}
}
