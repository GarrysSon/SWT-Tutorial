import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

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
		Button pushButton = new Button(shell, SWT.PUSH);
		pushButton.setText("Exit");
		
		// Assigning close operation to the button.
		pushButton.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				shell.dispose();
			}
		});
		
		// SWT equivalent of a panel.
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setLayout(new FillLayout());
		
		// Toggle button.
		Button toggleButton = new Button(composite, SWT.TOGGLE);
		toggleButton.setText("Happy");
		
		// Text field.
		Text text = new Text(composite, SWT.BORDER);
		text.setText("Type in me!");
		
		// Label field.
		Label label = new Label(composite, SWT.NONE);
		label.setText("This is a label!");
		
		// While the shell is open.
		while(!shell.isDisposed())
		{
			// Wait until the next event, then process that event.
			display.sleep();
			display.readAndDispatch();
		}
	}
}
