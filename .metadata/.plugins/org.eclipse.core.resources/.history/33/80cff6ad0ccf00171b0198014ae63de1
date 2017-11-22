
package test.parts;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.TooManyListenersException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.TabFolder;
import swing2swt.layout.FlowLayout;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import gnu.io.UnsupportedCommOperationException;
import gnu.io.*;

import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Text;

public class SWTViewer extends Composite implements SerialPortEventListener {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	private Enumeration portList = CommPortIdentifier.getPortIdentifiers();
	private CommPortIdentifier portId;
	private OutputStream outputStream;
	private InputStream inputStream;
	private SerialPort serialPort;
	private String[] comListStringArr;
	private Group groupboxTmp;
	private Spinner spinner_3;
	private Spinner spinner_2;
	private Spinner spinner_1;
	private Spinner slave_spinner;
	private Combo combo_1;
	private byte[] readBuffer;
	private String readData = "";
	private TabFolder tabFolder;
	private TabItem tbtmNewItem;
	private TabItem panelItem;
	private Composite composite_1;
	private String logFile = "log.txt";

	private Group groupbox_ld0_per;

	private int regLengthld0_per = 16;
	private int regOffsetld0_per = 0x0;

	private Label label_ld0_per;
	private Spinner numericUpDown_ld0_per;

	private Group groupbox_duty_cycle_ld0_blue;

	private int regLengthduty_cycle_ld0_blue = 16;
	private int regOffsetduty_cycle_ld0_blue = 0x2;

	private Label label_duty_cycle_ld0_blue;
	private Spinner numericUpDown_duty_cycle_ld0_blue;

	private Group groupbox_duty_cycle_ld0_green;

	private int regLengthduty_cycle_ld0_green = 16;
	private int regOffsetduty_cycle_ld0_green = 0x4;

	private Label label_duty_cycle_ld0_green;
	private Spinner numericUpDown_duty_cycle_ld0_green;

	private Group groupbox_ld4_ctrl;

	private int regLengthld4_ctrl = 8;
	private int regOffsetld4_ctrl = 0x6;

	private Button checkBox_ld4_ctrl;

	private Group groupbox_ld5_ctrl;

	private int regLengthld5_ctrl = 8;
	private int regOffsetld5_ctrl = 0x7;

	private Button checkBox_ld5_ctrl;

	private Group groupbox_ld6_ctrl;

	private int regLengthld6_ctrl = 8;
	private int regOffsetld6_ctrl = 0x8;

	private Button checkBox_ld6_ctrl;

	private Group groupbox_ld7_ctrl;

	private int regLengthld7_ctrl = 8;
	private int regOffsetld7_ctrl = 0x9;

	private Button checkBox_ld7_ctrl;

	private Group groupbox_sensor_en;

	private int regLengthsensor_en = 8;
	private int regOffsetsensor_en = 0xa;

	private Button checkBox_sensor_en;

	private Group groupbox_sensor_meas;

	private int regLengthsensor_meas = 8;
	private int regOffsetsensor_meas = 0xb;

	private Button checkBox_sensor_meas;

	private Group groupbox_heater_voltage;

	private int regLengthheater_voltage = 16;
	private int regOffsetheater_voltage = 0xc;

	private Label label_heater_voltage;
	private Spinner numericUpDown_heater_voltage;

	private Group groupbox_rheat_ref;

	private int regLengthrheat_ref = 16;
	private int regOffsetrheat_ref = 0xe;

	private Label label_rheat_ref;
	private Spinner numericUpDown_rheat_ref;

	private Group groupbox_rheat_alpha;

	private int regLengthrheat_alpha = 16;
	private int regOffsetrheat_alpha = 0x10;

	private Label label_rheat_alpha;
	private Spinner numericUpDown_rheat_alpha;

	private Group groupbox_adc_input_gain;

	private int regLengthadc_input_gain = 8;
	private int regOffsetadc_input_gain = 0x12;

	private Label label_adc_input_gain;
	private Spinner numericUpDown_adc_input_gain;

	private Group groupbox_sample_rate;

	private int regLengthsample_rate = 8;
	private int regOffsetsample_rate = 0x13;

	private Label label_sample_rate;
	private Spinner numericUpDown_sample_rate;

	private Group groupbox_on_cycles;

	private int regLengthon_cycles = 8;
	private int regOffseton_cycles = 0x14;

	private Label label_on_cycles;
	private Spinner numericUpDown_on_cycles;

	private Group groupbox_off_cycles;

	private int regLengthoff_cycles = 8;
	private int regOffsetoff_cycles = 0x15;

	private Label label_off_cycles;
	private Spinner numericUpDown_off_cycles;

	private Group groupbox_set_hh_temp;

	private int regLengthset_hh_temp = 16;
	private int regOffsetset_hh_temp = 0x16;

	private Label label_set_hh_temp;
	private Spinner numericUpDown_set_hh_temp;

	private Group groupbox_wait_cycles;

	private int regLengthwait_cycles = 16;
	private int regOffsetwait_cycles = 0x18;

	private Label label_wait_cycles;
	private Spinner numericUpDown_wait_cycles;

	private Group groupbox_meas_cnt;

	private int regLengthmeas_cnt = 16;
	private int regOffsetmeas_cnt = 0x1a;

	private Label label_meas_cnt;
	private Spinner numericUpDown_meas_cnt;

	private Group groupbox_led_ctrl;

	private int regLengthled_ctrl = 8;
	private int regOffsetled_ctrl = 0x1c;

	private Label label_led_ctrl;
	private Spinner numericUpDown_led_ctrl;

	private Group groupbox_meas_done;

	private int regLengthmeas_done = 8;
	private int regOffsetmeas_done = 0x1d;

	private Label label_meas_done;
	private Text textBox_meas_done;

	private Group groupbox_meas_result;

	private int regLengthmeas_result = 16;
	private int regOffsetmeas_result = 0x1e;

	private Label label_meas_result;
	private Text textBox_meas_result;

	private Group groupbox_smpl_first;

	private int regLengthsmpl_first = 8;
	private int regOffsetsmpl_first = 0x20;

	private Label label_smpl_first;
	private Spinner numericUpDown_smpl_first;

	private Group groupbox_smpl_last;

	private int regLengthsmpl_last = 8;
	private int regOffsetsmpl_last = 0x21;

	private Label label_smpl_last;
	private Spinner numericUpDown_smpl_last;

	private Group groupbox_k_factor;

	private int regLengthk_factor = 16;
	private int regOffsetk_factor = 0x22;

	private Label label_k_factor;
	private Spinner numericUpDown_k_factor;

	private Group groupbox_ppm;

	private int regLengthppm = 16;
	private int regOffsetppm = 0x24;

	private Label label_ppm;
	private Text textBox_ppm;

	public static void main(String[] args) {
		Display myDisplay = new Display();
		Shell myShell = new Shell(myDisplay);
		myShell.setText("My Text Box");
		myShell.setLayout(new FillLayout());
		SWTViewer test = new SWTViewer(myShell, SWT.NONE);
		myShell.open();
		while (!myShell.isDisposed()) {
			if (!myDisplay.readAndDispatch())
				myDisplay.sleep();
		}
		test.close();
		myDisplay.dispose();
	}
	public SWTViewer(Composite parent, int style) {
		super(parent, SWT.NONE);
		setLayout(null);

		Group grpConnect = new Group(this, SWT.NONE);
		grpConnect.setBounds(10, 10, 760, 59);
		grpConnect.setText("Connect");

		Label lblComPort = new Label(grpConnect, SWT.NONE);
		lblComPort.setBounds(11, 26, 55, 15);
		lblComPort.setText("COM Port");

		Combo combo = new Combo(grpConnect, SWT.NONE);
		comListStringArr = new String[getPortList().size()];
		int i = 0;
		for (String s : getPortList()) {
			comListStringArr[i] = s;
			i++;
		}

		combo.setItems(comListStringArr);
		combo.setBounds(77, 22, 67, 23);
		combo.select(0);

		Button btnRefresh = new Button(grpConnect, SWT.NONE);
		btnRefresh.setBounds(155, 21, 75, 25);
		btnRefresh.setText("Refresh");

		Group group_1 = new Group(grpConnect, SWT.NONE);
		group_1.setBounds(240, 15, 499, 44);

		Label label_1 = new Label(group_1, SWT.NONE);
		label_1.setText("Protocol");
		label_1.setBounds(10, 14, 55, 15);

		combo_1 = new Combo(group_1, SWT.NONE);
		combo_1.setToolTipText("");
		combo_1.setItems(new String[]{"I2C", "SPI"});
		combo_1.setBounds(76, 10, 67, 23);
		combo_1.select(0);

		Group group_2 = new Group(group_1, SWT.NONE);
		group_2.setBounds(147, 0, 109, 35);

		Label label_2 = new Label(group_2, SWT.NONE);
		label_2.setText("Slave");
		label_2.setBounds(10, 14, 31, 15);

		slave_spinner = new Spinner(group_2, SWT.BORDER);
		slave_spinner.setMaximum(255);
		slave_spinner.setSelection(32);
		slave_spinner.setBounds(51, 10, 47, 22);

		Group group = new Group(group_1, SWT.NONE);
		group.setBounds(145, 0, 344, 40);

		Label label = new Label(group, SWT.NONE);
		label.setText("Channel");
		label.setBounds(113, 14, 55, 15);

		spinner_1 = new Spinner(group, SWT.BORDER);
		spinner_1.setMaximum(3);
		spinner_1.setSelection(3);
		spinner_1.setBounds(164, 10, 47, 22);

		Label label_3 = new Label(group, SWT.NONE);
		label_3.setText("Address");
		label_3.setBounds(223, 14, 55, 15);

		spinner_2 = new Spinner(group, SWT.BORDER);
		spinner_2.setMaximum(255);
		spinner_2.setSelection(32);
		spinner_2.setBounds(279, 10, 55, 22);

		Label label_4 = new Label(group, SWT.NONE);
		label_4.setText("Port");
		label_4.setBounds(10, 14, 31, 15);

		spinner_3 = new Spinner(group, SWT.BORDER);
		spinner_3.setMaximum(2);
		spinner_3.setMinimum(1);
		spinner_3.setSelection(2);
		spinner_3.setBounds(53, 10, 47, 22);

		tabFolder = new TabFolder(this, SWT.NONE);
		tabFolder.setBounds(20, 75, 772, 600);
		tabFolder.setVisible(false);

		tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("Control");

		panelItem = new TabItem(tabFolder, SWT.NONE);
		panelItem.setText("Panel");
		Composite composite = new Composite(tabFolder, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		composite.setLayout(new GridLayout(3, false));
		panelItem.setControl(composite);

		composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem.setControl(composite_1);

		Group group_3 = new Group(composite_1, SWT.NONE);
		group_3.setBounds(91, 10, 501, 41);

		Button btnNewButton = new Button(group_3, SWT.NONE);
		btnNewButton.setBounds(46, 10, 150, 25);
		btnNewButton.setText("Read Sensor");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				allSensorRead();
			}
		});

		Button btnNewButton_1 = new Button(group_3, SWT.NONE);
		btnNewButton_1.setBounds(321, 10, 135, 25);
		btnNewButton_1.setText("Execute Measurement");

		combo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				CommportOpen(combo.getItem(combo.getSelectionIndex()));
				if (combo.getSelectionIndex() != 0) {
					group_1.setVisible(true);
					tabFolder.setVisible(true);
					if (combo_1.getItem(combo_1.getSelectionIndex()).equals("I2C")) {
						group.setVisible(true);
						group_2.setVisible(false);
					} else {
						group.setVisible(false);
						group_2.setVisible(true);
					}
				} else {
					group_1.setVisible(false);
					tabFolder.setVisible(false);
				}
			}
		});

		btnRefresh.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				group_1.setVisible(false);
				tabFolder.setVisible(false);
				close();
				combo.select(0);
			}
		});

		combo_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (combo_1.getItem(combo_1.getSelectionIndex()).equals("I2C")) {
					group.setVisible(true);
					group_2.setVisible(false);
				} else {
					group.setVisible(false);
					group_2.setVisible(true);
				}
			}
		});

		groupbox_ld0_per = new Group(composite, SWT.NONE);
		groupbox_ld0_per.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_ld0_per = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_ld0_per.widthHint = 200;
		groupbox_ld0_per.setLayoutData(gd_groupbox_ld0_per);
		groupbox_ld0_per.setText("ld0_per");
		groupboxTmp = groupbox_ld0_per;

		regLengthld0_per = 16;
		regOffsetld0_per = 0x0;

		Composite groupTmpld0_per = new Composite(groupboxTmp, SWT.NONE);
		groupTmpld0_per.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_ld0_per = new Label(groupTmpld0_per, SWT.NONE);
		label_ld0_per.setText("ld0_per");
		numericUpDown_ld0_per = new Spinner(groupTmpld0_per, SWT.BORDER);
		numericUpDown_ld0_per.setMaximum((int) Math.pow(2, regLengthld0_per) - 1);

		numericUpDown_ld0_per.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthld0_per / 8));
				int[] valueAsByteArray = new int[nobytes];
				int value = (int) numericUpDown_ld0_per.getSelection();
				for (int index = 0; index < nobytes; index++) {
					valueAsByteArray[index] = (value % 256);
					value = ((value - valueAsByteArray[index]) / 256);
				}
				send_write_command(regOffsetld0_per, valueAsByteArray);
			}
		});
		numericUpDown_ld0_per.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.character == SWT.CR || arg0.character == SWT.LF) {
					int nobytes = (int) Math.ceil((regLengthld0_per / 8));
					int[] valueAsByteArray = new int[nobytes];
					int value = (int) numericUpDown_ld0_per.getSelection();
					for (int index = 0; index < nobytes; index++) {
						valueAsByteArray[index] = (value % 256);
						value = ((value - valueAsByteArray[index]) / 256);
					}
					send_write_command(regOffsetld0_per, valueAsByteArray);
				}
			}
		});

		groupbox_duty_cycle_ld0_blue = new Group(composite, SWT.NONE);
		groupbox_duty_cycle_ld0_blue.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_duty_cycle_ld0_blue = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_duty_cycle_ld0_blue.widthHint = 200;
		groupbox_duty_cycle_ld0_blue.setLayoutData(gd_groupbox_duty_cycle_ld0_blue);
		groupbox_duty_cycle_ld0_blue.setText("duty_cycle_ld0_blue");
		groupboxTmp = groupbox_duty_cycle_ld0_blue;

		regLengthduty_cycle_ld0_blue = 16;
		regOffsetduty_cycle_ld0_blue = 0x2;

		Composite groupTmpduty_cycle_ld0_blue = new Composite(groupboxTmp, SWT.NONE);
		groupTmpduty_cycle_ld0_blue.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_duty_cycle_ld0_blue = new Label(groupTmpduty_cycle_ld0_blue, SWT.NONE);
		label_duty_cycle_ld0_blue.setText("duty_cycle_ld0_blue");
		numericUpDown_duty_cycle_ld0_blue = new Spinner(groupTmpduty_cycle_ld0_blue, SWT.BORDER);
		numericUpDown_duty_cycle_ld0_blue.setMaximum((int) Math.pow(2, regLengthduty_cycle_ld0_blue) - 1);

		numericUpDown_duty_cycle_ld0_blue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthduty_cycle_ld0_blue / 8));
				int[] valueAsByteArray = new int[nobytes];
				int value = (int) numericUpDown_duty_cycle_ld0_blue.getSelection();
				for (int index = 0; index < nobytes; index++) {
					valueAsByteArray[index] = (value % 256);
					value = ((value - valueAsByteArray[index]) / 256);
				}
				send_write_command(regOffsetduty_cycle_ld0_blue, valueAsByteArray);
			}
		});
		numericUpDown_duty_cycle_ld0_blue.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.character == SWT.CR || arg0.character == SWT.LF) {
					int nobytes = (int) Math.ceil((regLengthduty_cycle_ld0_blue / 8));
					int[] valueAsByteArray = new int[nobytes];
					int value = (int) numericUpDown_duty_cycle_ld0_blue.getSelection();
					for (int index = 0; index < nobytes; index++) {
						valueAsByteArray[index] = (value % 256);
						value = ((value - valueAsByteArray[index]) / 256);
					}
					send_write_command(regOffsetduty_cycle_ld0_blue, valueAsByteArray);
				}
			}
		});

		groupbox_duty_cycle_ld0_green = new Group(composite, SWT.NONE);
		groupbox_duty_cycle_ld0_green.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_duty_cycle_ld0_green = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_duty_cycle_ld0_green.widthHint = 200;
		groupbox_duty_cycle_ld0_green.setLayoutData(gd_groupbox_duty_cycle_ld0_green);
		groupbox_duty_cycle_ld0_green.setText("duty_cycle_ld0_green");
		groupboxTmp = groupbox_duty_cycle_ld0_green;

		regLengthduty_cycle_ld0_green = 16;
		regOffsetduty_cycle_ld0_green = 0x4;

		Composite groupTmpduty_cycle_ld0_green = new Composite(groupboxTmp, SWT.NONE);
		groupTmpduty_cycle_ld0_green.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_duty_cycle_ld0_green = new Label(groupTmpduty_cycle_ld0_green, SWT.NONE);
		label_duty_cycle_ld0_green.setText("duty_cycle_ld0_green");
		numericUpDown_duty_cycle_ld0_green = new Spinner(groupTmpduty_cycle_ld0_green, SWT.BORDER);
		numericUpDown_duty_cycle_ld0_green.setMaximum((int) Math.pow(2, regLengthduty_cycle_ld0_green) - 1);

		numericUpDown_duty_cycle_ld0_green.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthduty_cycle_ld0_green / 8));
				int[] valueAsByteArray = new int[nobytes];
				int value = (int) numericUpDown_duty_cycle_ld0_green.getSelection();
				for (int index = 0; index < nobytes; index++) {
					valueAsByteArray[index] = (value % 256);
					value = ((value - valueAsByteArray[index]) / 256);
				}
				send_write_command(regOffsetduty_cycle_ld0_green, valueAsByteArray);
			}
		});
		numericUpDown_duty_cycle_ld0_green.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.character == SWT.CR || arg0.character == SWT.LF) {
					int nobytes = (int) Math.ceil((regLengthduty_cycle_ld0_green / 8));
					int[] valueAsByteArray = new int[nobytes];
					int value = (int) numericUpDown_duty_cycle_ld0_green.getSelection();
					for (int index = 0; index < nobytes; index++) {
						valueAsByteArray[index] = (value % 256);
						value = ((value - valueAsByteArray[index]) / 256);
					}
					send_write_command(regOffsetduty_cycle_ld0_green, valueAsByteArray);
				}
			}
		});

		groupbox_ld4_ctrl = new Group(composite, SWT.NONE);
		groupbox_ld4_ctrl.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_ld4_ctrl = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_ld4_ctrl.widthHint = 200;
		groupbox_ld4_ctrl.setLayoutData(gd_groupbox_ld4_ctrl);
		groupbox_ld4_ctrl.setText("ld4_ctrl");
		groupboxTmp = groupbox_ld4_ctrl;

		regLengthld4_ctrl = 8;
		regOffsetld4_ctrl = 0x6;

		checkBox_ld4_ctrl = new Button(groupboxTmp, SWT.CHECK);

		checkBox_ld4_ctrl.setText("ld4_ctrl");
		checkBox_ld4_ctrl.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				send_write_command(regOffsetld4_ctrl, new int[]{(checkBox_ld4_ctrl.getSelection() ? 1 : 0)});
			}
		});

		checkBox_ld5_ctrl = new Button(groupbox_ld4_ctrl, SWT.CHECK);

		checkBox_ld5_ctrl.setText("ld5_ctrl");
		checkBox_ld5_ctrl.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				send_write_command(regOffsetld5_ctrl, new int[]{(checkBox_ld5_ctrl.getSelection() ? 1 : 0)});
			}
		});

		checkBox_ld6_ctrl = new Button(groupbox_ld4_ctrl, SWT.CHECK);

		checkBox_ld6_ctrl.setText("ld6_ctrl");
		checkBox_ld6_ctrl.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				send_write_command(regOffsetld6_ctrl, new int[]{(checkBox_ld6_ctrl.getSelection() ? 1 : 0)});
			}
		});

		checkBox_ld7_ctrl = new Button(groupbox_ld4_ctrl, SWT.CHECK);

		checkBox_ld7_ctrl.setText("ld7_ctrl");
		checkBox_ld7_ctrl.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				send_write_command(regOffsetld7_ctrl, new int[]{(checkBox_ld7_ctrl.getSelection() ? 1 : 0)});
			}
		});

		groupbox_sensor_en = new Group(composite, SWT.NONE);
		groupbox_sensor_en.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_sensor_en = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_sensor_en.widthHint = 200;
		groupbox_sensor_en.setLayoutData(gd_groupbox_sensor_en);
		groupbox_sensor_en.setText("sensor_en");
		groupboxTmp = groupbox_sensor_en;

		regLengthsensor_en = 8;
		regOffsetsensor_en = 0xa;

		checkBox_sensor_en = new Button(groupboxTmp, SWT.CHECK);

		checkBox_sensor_en.setText("sensor_en");
		checkBox_sensor_en.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				send_write_command(regOffsetsensor_en, new int[]{(checkBox_sensor_en.getSelection() ? 1 : 0)});
			}
		});

		groupbox_sensor_meas = new Group(composite, SWT.NONE);
		groupbox_sensor_meas.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_sensor_meas = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_sensor_meas.widthHint = 200;
		groupbox_sensor_meas.setLayoutData(gd_groupbox_sensor_meas);
		groupbox_sensor_meas.setText("sensor_meas");
		groupboxTmp = groupbox_sensor_meas;

		regLengthsensor_meas = 8;
		regOffsetsensor_meas = 0xb;

		checkBox_sensor_meas = new Button(groupboxTmp, SWT.CHECK);

		checkBox_sensor_meas.setText("sensor_meas");
		checkBox_sensor_meas.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				send_write_command(regOffsetsensor_meas, new int[]{(checkBox_sensor_meas.getSelection() ? 1 : 0)});
			}
		});

		groupbox_heater_voltage = new Group(composite, SWT.NONE);
		groupbox_heater_voltage.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_heater_voltage = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_heater_voltage.widthHint = 200;
		groupbox_heater_voltage.setLayoutData(gd_groupbox_heater_voltage);
		groupbox_heater_voltage.setText("heater_voltage");
		groupboxTmp = groupbox_heater_voltage;

		regLengthheater_voltage = 16;
		regOffsetheater_voltage = 0xc;

		Composite groupTmpheater_voltage = new Composite(groupboxTmp, SWT.NONE);
		groupTmpheater_voltage.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_heater_voltage = new Label(groupTmpheater_voltage, SWT.NONE);
		label_heater_voltage.setText("heater_voltage");
		numericUpDown_heater_voltage = new Spinner(groupTmpheater_voltage, SWT.BORDER);
		numericUpDown_heater_voltage.setMaximum((int) Math.pow(2, regLengthheater_voltage) - 1);

		numericUpDown_heater_voltage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthheater_voltage / 8));
				int[] valueAsByteArray = new int[nobytes];
				int value = (int) numericUpDown_heater_voltage.getSelection();
				for (int index = 0; index < nobytes; index++) {
					valueAsByteArray[index] = (value % 256);
					value = ((value - valueAsByteArray[index]) / 256);
				}
				send_write_command(regOffsetheater_voltage, valueAsByteArray);
			}
		});
		numericUpDown_heater_voltage.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.character == SWT.CR || arg0.character == SWT.LF) {
					int nobytes = (int) Math.ceil((regLengthheater_voltage / 8));
					int[] valueAsByteArray = new int[nobytes];
					int value = (int) numericUpDown_heater_voltage.getSelection();
					for (int index = 0; index < nobytes; index++) {
						valueAsByteArray[index] = (value % 256);
						value = ((value - valueAsByteArray[index]) / 256);
					}
					send_write_command(regOffsetheater_voltage, valueAsByteArray);
				}
			}
		});

		groupbox_rheat_ref = new Group(composite, SWT.NONE);
		groupbox_rheat_ref.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_rheat_ref = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_rheat_ref.widthHint = 200;
		groupbox_rheat_ref.setLayoutData(gd_groupbox_rheat_ref);
		groupbox_rheat_ref.setText("rheat_ref");
		groupboxTmp = groupbox_rheat_ref;

		regLengthrheat_ref = 16;
		regOffsetrheat_ref = 0xe;

		Composite groupTmprheat_ref = new Composite(groupboxTmp, SWT.NONE);
		groupTmprheat_ref.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_rheat_ref = new Label(groupTmprheat_ref, SWT.NONE);
		label_rheat_ref.setText("rheat_ref");
		numericUpDown_rheat_ref = new Spinner(groupTmprheat_ref, SWT.BORDER);
		numericUpDown_rheat_ref.setMaximum((int) Math.pow(2, regLengthrheat_ref) - 1);

		numericUpDown_rheat_ref.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthrheat_ref / 8));
				int[] valueAsByteArray = new int[nobytes];
				int value = (int) numericUpDown_rheat_ref.getSelection();
				for (int index = 0; index < nobytes; index++) {
					valueAsByteArray[index] = (value % 256);
					value = ((value - valueAsByteArray[index]) / 256);
				}
				send_write_command(regOffsetrheat_ref, valueAsByteArray);
			}
		});
		numericUpDown_rheat_ref.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.character == SWT.CR || arg0.character == SWT.LF) {
					int nobytes = (int) Math.ceil((regLengthrheat_ref / 8));
					int[] valueAsByteArray = new int[nobytes];
					int value = (int) numericUpDown_rheat_ref.getSelection();
					for (int index = 0; index < nobytes; index++) {
						valueAsByteArray[index] = (value % 256);
						value = ((value - valueAsByteArray[index]) / 256);
					}
					send_write_command(regOffsetrheat_ref, valueAsByteArray);
				}
			}
		});

		groupbox_rheat_alpha = new Group(composite, SWT.NONE);
		groupbox_rheat_alpha.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_rheat_alpha = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_rheat_alpha.widthHint = 200;
		groupbox_rheat_alpha.setLayoutData(gd_groupbox_rheat_alpha);
		groupbox_rheat_alpha.setText("rheat_alpha");
		groupboxTmp = groupbox_rheat_alpha;

		regLengthrheat_alpha = 16;
		regOffsetrheat_alpha = 0x10;

		Composite groupTmprheat_alpha = new Composite(groupboxTmp, SWT.NONE);
		groupTmprheat_alpha.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_rheat_alpha = new Label(groupTmprheat_alpha, SWT.NONE);
		label_rheat_alpha.setText("rheat_alpha");
		numericUpDown_rheat_alpha = new Spinner(groupTmprheat_alpha, SWT.BORDER);
		numericUpDown_rheat_alpha.setMaximum((int) Math.pow(2, regLengthrheat_alpha) - 1);

		numericUpDown_rheat_alpha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthrheat_alpha / 8));
				int[] valueAsByteArray = new int[nobytes];
				int value = (int) numericUpDown_rheat_alpha.getSelection();
				for (int index = 0; index < nobytes; index++) {
					valueAsByteArray[index] = (value % 256);
					value = ((value - valueAsByteArray[index]) / 256);
				}
				send_write_command(regOffsetrheat_alpha, valueAsByteArray);
			}
		});
		numericUpDown_rheat_alpha.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.character == SWT.CR || arg0.character == SWT.LF) {
					int nobytes = (int) Math.ceil((regLengthrheat_alpha / 8));
					int[] valueAsByteArray = new int[nobytes];
					int value = (int) numericUpDown_rheat_alpha.getSelection();
					for (int index = 0; index < nobytes; index++) {
						valueAsByteArray[index] = (value % 256);
						value = ((value - valueAsByteArray[index]) / 256);
					}
					send_write_command(regOffsetrheat_alpha, valueAsByteArray);
				}
			}
		});

		groupbox_adc_input_gain = new Group(composite, SWT.NONE);
		groupbox_adc_input_gain.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_adc_input_gain = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_adc_input_gain.widthHint = 200;
		groupbox_adc_input_gain.setLayoutData(gd_groupbox_adc_input_gain);
		groupbox_adc_input_gain.setText("adc_input_gain");
		groupboxTmp = groupbox_adc_input_gain;

		regLengthadc_input_gain = 8;
		regOffsetadc_input_gain = 0x12;

		Composite groupTmpadc_input_gain = new Composite(groupboxTmp, SWT.NONE);
		groupTmpadc_input_gain.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_adc_input_gain = new Label(groupTmpadc_input_gain, SWT.NONE);
		label_adc_input_gain.setText("adc_input_gain");
		numericUpDown_adc_input_gain = new Spinner(groupTmpadc_input_gain, SWT.BORDER);
		numericUpDown_adc_input_gain.setMaximum((int) Math.pow(2, regLengthadc_input_gain) - 1);

		numericUpDown_adc_input_gain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthadc_input_gain / 8));
				int[] valueAsByteArray = new int[nobytes];
				int value = (int) numericUpDown_adc_input_gain.getSelection();
				for (int index = 0; index < nobytes; index++) {
					valueAsByteArray[index] = (value % 256);
					value = ((value - valueAsByteArray[index]) / 256);
				}
				send_write_command(regOffsetadc_input_gain, valueAsByteArray);
			}
		});
		numericUpDown_adc_input_gain.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.character == SWT.CR || arg0.character == SWT.LF) {
					int nobytes = (int) Math.ceil((regLengthadc_input_gain / 8));
					int[] valueAsByteArray = new int[nobytes];
					int value = (int) numericUpDown_adc_input_gain.getSelection();
					for (int index = 0; index < nobytes; index++) {
						valueAsByteArray[index] = (value % 256);
						value = ((value - valueAsByteArray[index]) / 256);
					}
					send_write_command(regOffsetadc_input_gain, valueAsByteArray);
				}
			}
		});

		groupbox_sample_rate = new Group(composite, SWT.NONE);
		groupbox_sample_rate.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_sample_rate = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_sample_rate.widthHint = 200;
		groupbox_sample_rate.setLayoutData(gd_groupbox_sample_rate);
		groupbox_sample_rate.setText("sample_rate");
		groupboxTmp = groupbox_sample_rate;

		regLengthsample_rate = 8;
		regOffsetsample_rate = 0x13;

		Composite groupTmpsample_rate = new Composite(groupboxTmp, SWT.NONE);
		groupTmpsample_rate.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_sample_rate = new Label(groupTmpsample_rate, SWT.NONE);
		label_sample_rate.setText("sample_rate");
		numericUpDown_sample_rate = new Spinner(groupTmpsample_rate, SWT.BORDER);
		numericUpDown_sample_rate.setMaximum((int) Math.pow(2, regLengthsample_rate) - 1);

		numericUpDown_sample_rate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthsample_rate / 8));
				int[] valueAsByteArray = new int[nobytes];
				int value = (int) numericUpDown_sample_rate.getSelection();
				for (int index = 0; index < nobytes; index++) {
					valueAsByteArray[index] = (value % 256);
					value = ((value - valueAsByteArray[index]) / 256);
				}
				send_write_command(regOffsetsample_rate, valueAsByteArray);
			}
		});
		numericUpDown_sample_rate.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.character == SWT.CR || arg0.character == SWT.LF) {
					int nobytes = (int) Math.ceil((regLengthsample_rate / 8));
					int[] valueAsByteArray = new int[nobytes];
					int value = (int) numericUpDown_sample_rate.getSelection();
					for (int index = 0; index < nobytes; index++) {
						valueAsByteArray[index] = (value % 256);
						value = ((value - valueAsByteArray[index]) / 256);
					}
					send_write_command(regOffsetsample_rate, valueAsByteArray);
				}
			}
		});

		groupbox_on_cycles = new Group(composite, SWT.NONE);
		groupbox_on_cycles.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_on_cycles = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_on_cycles.widthHint = 200;
		groupbox_on_cycles.setLayoutData(gd_groupbox_on_cycles);
		groupbox_on_cycles.setText("on_cycles");
		groupboxTmp = groupbox_on_cycles;

		regLengthon_cycles = 8;
		regOffseton_cycles = 0x14;

		Composite groupTmpon_cycles = new Composite(groupboxTmp, SWT.NONE);
		groupTmpon_cycles.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_on_cycles = new Label(groupTmpon_cycles, SWT.NONE);
		label_on_cycles.setText("on_cycles");
		numericUpDown_on_cycles = new Spinner(groupTmpon_cycles, SWT.BORDER);
		numericUpDown_on_cycles.setMaximum((int) Math.pow(2, regLengthon_cycles) - 1);

		numericUpDown_on_cycles.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthon_cycles / 8));
				int[] valueAsByteArray = new int[nobytes];
				int value = (int) numericUpDown_on_cycles.getSelection();
				for (int index = 0; index < nobytes; index++) {
					valueAsByteArray[index] = (value % 256);
					value = ((value - valueAsByteArray[index]) / 256);
				}
				send_write_command(regOffseton_cycles, valueAsByteArray);
			}
		});
		numericUpDown_on_cycles.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.character == SWT.CR || arg0.character == SWT.LF) {
					int nobytes = (int) Math.ceil((regLengthon_cycles / 8));
					int[] valueAsByteArray = new int[nobytes];
					int value = (int) numericUpDown_on_cycles.getSelection();
					for (int index = 0; index < nobytes; index++) {
						valueAsByteArray[index] = (value % 256);
						value = ((value - valueAsByteArray[index]) / 256);
					}
					send_write_command(regOffseton_cycles, valueAsByteArray);
				}
			}
		});

		groupbox_off_cycles = new Group(composite, SWT.NONE);
		groupbox_off_cycles.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_off_cycles = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_off_cycles.widthHint = 200;
		groupbox_off_cycles.setLayoutData(gd_groupbox_off_cycles);
		groupbox_off_cycles.setText("off_cycles");
		groupboxTmp = groupbox_off_cycles;

		regLengthoff_cycles = 8;
		regOffsetoff_cycles = 0x15;

		Composite groupTmpoff_cycles = new Composite(groupboxTmp, SWT.NONE);
		groupTmpoff_cycles.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_off_cycles = new Label(groupTmpoff_cycles, SWT.NONE);
		label_off_cycles.setText("off_cycles");
		numericUpDown_off_cycles = new Spinner(groupTmpoff_cycles, SWT.BORDER);
		numericUpDown_off_cycles.setMaximum((int) Math.pow(2, regLengthoff_cycles) - 1);

		numericUpDown_off_cycles.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthoff_cycles / 8));
				int[] valueAsByteArray = new int[nobytes];
				int value = (int) numericUpDown_off_cycles.getSelection();
				for (int index = 0; index < nobytes; index++) {
					valueAsByteArray[index] = (value % 256);
					value = ((value - valueAsByteArray[index]) / 256);
				}
				send_write_command(regOffsetoff_cycles, valueAsByteArray);
			}
		});
		numericUpDown_off_cycles.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.character == SWT.CR || arg0.character == SWT.LF) {
					int nobytes = (int) Math.ceil((regLengthoff_cycles / 8));
					int[] valueAsByteArray = new int[nobytes];
					int value = (int) numericUpDown_off_cycles.getSelection();
					for (int index = 0; index < nobytes; index++) {
						valueAsByteArray[index] = (value % 256);
						value = ((value - valueAsByteArray[index]) / 256);
					}
					send_write_command(regOffsetoff_cycles, valueAsByteArray);
				}
			}
		});

		groupbox_set_hh_temp = new Group(composite, SWT.NONE);
		groupbox_set_hh_temp.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_set_hh_temp = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_set_hh_temp.widthHint = 200;
		groupbox_set_hh_temp.setLayoutData(gd_groupbox_set_hh_temp);
		groupbox_set_hh_temp.setText("set_hh_temp");
		groupboxTmp = groupbox_set_hh_temp;

		regLengthset_hh_temp = 16;
		regOffsetset_hh_temp = 0x16;

		Composite groupTmpset_hh_temp = new Composite(groupboxTmp, SWT.NONE);
		groupTmpset_hh_temp.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_set_hh_temp = new Label(groupTmpset_hh_temp, SWT.NONE);
		label_set_hh_temp.setText("set_hh_temp");
		numericUpDown_set_hh_temp = new Spinner(groupTmpset_hh_temp, SWT.BORDER);
		numericUpDown_set_hh_temp.setMaximum((int) Math.pow(2, regLengthset_hh_temp) - 1);

		numericUpDown_set_hh_temp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthset_hh_temp / 8));
				int[] valueAsByteArray = new int[nobytes];
				int value = (int) numericUpDown_set_hh_temp.getSelection();
				for (int index = 0; index < nobytes; index++) {
					valueAsByteArray[index] = (value % 256);
					value = ((value - valueAsByteArray[index]) / 256);
				}
				send_write_command(regOffsetset_hh_temp, valueAsByteArray);
			}
		});
		numericUpDown_set_hh_temp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.character == SWT.CR || arg0.character == SWT.LF) {
					int nobytes = (int) Math.ceil((regLengthset_hh_temp / 8));
					int[] valueAsByteArray = new int[nobytes];
					int value = (int) numericUpDown_set_hh_temp.getSelection();
					for (int index = 0; index < nobytes; index++) {
						valueAsByteArray[index] = (value % 256);
						value = ((value - valueAsByteArray[index]) / 256);
					}
					send_write_command(regOffsetset_hh_temp, valueAsByteArray);
				}
			}
		});

		groupbox_wait_cycles = new Group(composite, SWT.NONE);
		groupbox_wait_cycles.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_wait_cycles = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_wait_cycles.widthHint = 200;
		groupbox_wait_cycles.setLayoutData(gd_groupbox_wait_cycles);
		groupbox_wait_cycles.setText("wait_cycles");
		groupboxTmp = groupbox_wait_cycles;

		regLengthwait_cycles = 16;
		regOffsetwait_cycles = 0x18;

		Composite groupTmpwait_cycles = new Composite(groupboxTmp, SWT.NONE);
		groupTmpwait_cycles.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_wait_cycles = new Label(groupTmpwait_cycles, SWT.NONE);
		label_wait_cycles.setText("wait_cycles");
		numericUpDown_wait_cycles = new Spinner(groupTmpwait_cycles, SWT.BORDER);
		numericUpDown_wait_cycles.setMaximum((int) Math.pow(2, regLengthwait_cycles) - 1);

		numericUpDown_wait_cycles.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthwait_cycles / 8));
				int[] valueAsByteArray = new int[nobytes];
				int value = (int) numericUpDown_wait_cycles.getSelection();
				for (int index = 0; index < nobytes; index++) {
					valueAsByteArray[index] = (value % 256);
					value = ((value - valueAsByteArray[index]) / 256);
				}
				send_write_command(regOffsetwait_cycles, valueAsByteArray);
			}
		});
		numericUpDown_wait_cycles.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.character == SWT.CR || arg0.character == SWT.LF) {
					int nobytes = (int) Math.ceil((regLengthwait_cycles / 8));
					int[] valueAsByteArray = new int[nobytes];
					int value = (int) numericUpDown_wait_cycles.getSelection();
					for (int index = 0; index < nobytes; index++) {
						valueAsByteArray[index] = (value % 256);
						value = ((value - valueAsByteArray[index]) / 256);
					}
					send_write_command(regOffsetwait_cycles, valueAsByteArray);
				}
			}
		});

		groupbox_meas_cnt = new Group(composite, SWT.NONE);
		groupbox_meas_cnt.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_meas_cnt = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_meas_cnt.widthHint = 200;
		groupbox_meas_cnt.setLayoutData(gd_groupbox_meas_cnt);
		groupbox_meas_cnt.setText("meas_cnt");
		groupboxTmp = groupbox_meas_cnt;

		regLengthmeas_cnt = 16;
		regOffsetmeas_cnt = 0x1a;

		Composite groupTmpmeas_cnt = new Composite(groupboxTmp, SWT.NONE);
		groupTmpmeas_cnt.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_meas_cnt = new Label(groupTmpmeas_cnt, SWT.NONE);
		label_meas_cnt.setText("meas_cnt");
		numericUpDown_meas_cnt = new Spinner(groupTmpmeas_cnt, SWT.BORDER);
		numericUpDown_meas_cnt.setMaximum((int) Math.pow(2, regLengthmeas_cnt) - 1);

		numericUpDown_meas_cnt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthmeas_cnt / 8));
				int[] valueAsByteArray = new int[nobytes];
				int value = (int) numericUpDown_meas_cnt.getSelection();
				for (int index = 0; index < nobytes; index++) {
					valueAsByteArray[index] = (value % 256);
					value = ((value - valueAsByteArray[index]) / 256);
				}
				send_write_command(regOffsetmeas_cnt, valueAsByteArray);
			}
		});
		numericUpDown_meas_cnt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.character == SWT.CR || arg0.character == SWT.LF) {
					int nobytes = (int) Math.ceil((regLengthmeas_cnt / 8));
					int[] valueAsByteArray = new int[nobytes];
					int value = (int) numericUpDown_meas_cnt.getSelection();
					for (int index = 0; index < nobytes; index++) {
						valueAsByteArray[index] = (value % 256);
						value = ((value - valueAsByteArray[index]) / 256);
					}
					send_write_command(regOffsetmeas_cnt, valueAsByteArray);
				}
			}
		});

		groupbox_led_ctrl = new Group(composite, SWT.NONE);
		groupbox_led_ctrl.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_led_ctrl = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_led_ctrl.widthHint = 200;
		groupbox_led_ctrl.setLayoutData(gd_groupbox_led_ctrl);
		groupbox_led_ctrl.setText("led_ctrl");
		groupboxTmp = groupbox_led_ctrl;

		regLengthled_ctrl = 8;
		regOffsetled_ctrl = 0x1c;

		Composite groupTmpled_ctrl = new Composite(groupboxTmp, SWT.NONE);
		groupTmpled_ctrl.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_led_ctrl = new Label(groupTmpled_ctrl, SWT.NONE);
		label_led_ctrl.setText("led_ctrl");
		numericUpDown_led_ctrl = new Spinner(groupTmpled_ctrl, SWT.BORDER);
		numericUpDown_led_ctrl.setMaximum((int) Math.pow(2, regLengthled_ctrl) - 1);

		numericUpDown_led_ctrl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthled_ctrl / 8));
				int[] valueAsByteArray = new int[nobytes];
				int value = (int) numericUpDown_led_ctrl.getSelection();
				for (int index = 0; index < nobytes; index++) {
					valueAsByteArray[index] = (value % 256);
					value = ((value - valueAsByteArray[index]) / 256);
				}
				send_write_command(regOffsetled_ctrl, valueAsByteArray);
			}
		});
		numericUpDown_led_ctrl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.character == SWT.CR || arg0.character == SWT.LF) {
					int nobytes = (int) Math.ceil((regLengthled_ctrl / 8));
					int[] valueAsByteArray = new int[nobytes];
					int value = (int) numericUpDown_led_ctrl.getSelection();
					for (int index = 0; index < nobytes; index++) {
						valueAsByteArray[index] = (value % 256);
						value = ((value - valueAsByteArray[index]) / 256);
					}
					send_write_command(regOffsetled_ctrl, valueAsByteArray);
				}
			}
		});

		groupbox_meas_done = new Group(composite, SWT.NONE);
		groupbox_meas_done.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_meas_done = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_meas_done.widthHint = 200;
		groupbox_meas_done.setLayoutData(gd_groupbox_meas_done);
		groupbox_meas_done.setText("meas_done");
		groupboxTmp = groupbox_meas_done;

		regLengthmeas_done = 8;
		regOffsetmeas_done = 0x1d;

		Composite groupTmpmeas_done = new Composite(groupboxTmp, SWT.NONE);
		groupTmpmeas_done.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_meas_done = new Label(groupTmpmeas_done, SWT.NONE);
		label_meas_done.setText("meas_done");
		textBox_meas_done = new Text(groupTmpmeas_done, SWT.BORDER);
		textBox_meas_done.setText("---");
		textBox_meas_done.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthmeas_done / 8));
				int[] result = send_read_command(regOffsetmeas_done, nobytes, false);
				if (result == null)
					return;
				int value = 0;
				for (int i = nobytes - 1; i >= 0; i--) {
					value = value * 256 + result[i];
				}
				textBox_meas_done.setText(value + "");
			}
		});

		groupbox_meas_result = new Group(composite, SWT.NONE);
		groupbox_meas_result.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_meas_result = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_meas_result.widthHint = 200;
		groupbox_meas_result.setLayoutData(gd_groupbox_meas_result);
		groupbox_meas_result.setText("meas_result");
		groupboxTmp = groupbox_meas_result;

		regLengthmeas_result = 16;
		regOffsetmeas_result = 0x1e;

		Composite groupTmpmeas_result = new Composite(groupboxTmp, SWT.NONE);
		groupTmpmeas_result.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_meas_result = new Label(groupTmpmeas_result, SWT.NONE);
		label_meas_result.setText("meas_result");
		textBox_meas_result = new Text(groupTmpmeas_result, SWT.BORDER);
		textBox_meas_result.setText("---");
		textBox_meas_result.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthmeas_result / 8));
				int[] result = send_read_command(regOffsetmeas_result, nobytes, false);
				if (result == null)
					return;
				int value = 0;
				for (int i = nobytes - 1; i >= 0; i--) {
					value = value * 256 + result[i];
				}
				textBox_meas_result.setText(value + "");
			}
		});

		groupbox_smpl_first = new Group(composite, SWT.NONE);
		groupbox_smpl_first.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_smpl_first = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_smpl_first.widthHint = 200;
		groupbox_smpl_first.setLayoutData(gd_groupbox_smpl_first);
		groupbox_smpl_first.setText("smpl_first");
		groupboxTmp = groupbox_smpl_first;

		regLengthsmpl_first = 8;
		regOffsetsmpl_first = 0x20;

		Composite groupTmpsmpl_first = new Composite(groupboxTmp, SWT.NONE);
		groupTmpsmpl_first.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_smpl_first = new Label(groupTmpsmpl_first, SWT.NONE);
		label_smpl_first.setText("smpl_first");
		numericUpDown_smpl_first = new Spinner(groupTmpsmpl_first, SWT.BORDER);
		numericUpDown_smpl_first.setMaximum((int) Math.pow(2, regLengthsmpl_first) - 1);

		numericUpDown_smpl_first.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthsmpl_first / 8));
				int[] valueAsByteArray = new int[nobytes];
				int value = (int) numericUpDown_smpl_first.getSelection();
				for (int index = 0; index < nobytes; index++) {
					valueAsByteArray[index] = (value % 256);
					value = ((value - valueAsByteArray[index]) / 256);
				}
				send_write_command(regOffsetsmpl_first, valueAsByteArray);
			}
		});
		numericUpDown_smpl_first.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.character == SWT.CR || arg0.character == SWT.LF) {
					int nobytes = (int) Math.ceil((regLengthsmpl_first / 8));
					int[] valueAsByteArray = new int[nobytes];
					int value = (int) numericUpDown_smpl_first.getSelection();
					for (int index = 0; index < nobytes; index++) {
						valueAsByteArray[index] = (value % 256);
						value = ((value - valueAsByteArray[index]) / 256);
					}
					send_write_command(regOffsetsmpl_first, valueAsByteArray);
				}
			}
		});

		groupbox_smpl_last = new Group(composite, SWT.NONE);
		groupbox_smpl_last.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_smpl_last = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_smpl_last.widthHint = 200;
		groupbox_smpl_last.setLayoutData(gd_groupbox_smpl_last);
		groupbox_smpl_last.setText("smpl_last");
		groupboxTmp = groupbox_smpl_last;

		regLengthsmpl_last = 8;
		regOffsetsmpl_last = 0x21;

		Composite groupTmpsmpl_last = new Composite(groupboxTmp, SWT.NONE);
		groupTmpsmpl_last.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_smpl_last = new Label(groupTmpsmpl_last, SWT.NONE);
		label_smpl_last.setText("smpl_last");
		numericUpDown_smpl_last = new Spinner(groupTmpsmpl_last, SWT.BORDER);
		numericUpDown_smpl_last.setMaximum((int) Math.pow(2, regLengthsmpl_last) - 1);

		numericUpDown_smpl_last.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthsmpl_last / 8));
				int[] valueAsByteArray = new int[nobytes];
				int value = (int) numericUpDown_smpl_last.getSelection();
				for (int index = 0; index < nobytes; index++) {
					valueAsByteArray[index] = (value % 256);
					value = ((value - valueAsByteArray[index]) / 256);
				}
				send_write_command(regOffsetsmpl_last, valueAsByteArray);
			}
		});
		numericUpDown_smpl_last.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.character == SWT.CR || arg0.character == SWT.LF) {
					int nobytes = (int) Math.ceil((regLengthsmpl_last / 8));
					int[] valueAsByteArray = new int[nobytes];
					int value = (int) numericUpDown_smpl_last.getSelection();
					for (int index = 0; index < nobytes; index++) {
						valueAsByteArray[index] = (value % 256);
						value = ((value - valueAsByteArray[index]) / 256);
					}
					send_write_command(regOffsetsmpl_last, valueAsByteArray);
				}
			}
		});

		groupbox_k_factor = new Group(composite, SWT.NONE);
		groupbox_k_factor.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_k_factor = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_k_factor.widthHint = 200;
		groupbox_k_factor.setLayoutData(gd_groupbox_k_factor);
		groupbox_k_factor.setText("k_factor");
		groupboxTmp = groupbox_k_factor;

		regLengthk_factor = 16;
		regOffsetk_factor = 0x22;

		Composite groupTmpk_factor = new Composite(groupboxTmp, SWT.NONE);
		groupTmpk_factor.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_k_factor = new Label(groupTmpk_factor, SWT.NONE);
		label_k_factor.setText("k_factor");
		numericUpDown_k_factor = new Spinner(groupTmpk_factor, SWT.BORDER);
		numericUpDown_k_factor.setMaximum((int) Math.pow(2, regLengthk_factor) - 1);

		numericUpDown_k_factor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthk_factor / 8));
				int[] valueAsByteArray = new int[nobytes];
				int value = (int) numericUpDown_k_factor.getSelection();
				for (int index = 0; index < nobytes; index++) {
					valueAsByteArray[index] = (value % 256);
					value = ((value - valueAsByteArray[index]) / 256);
				}
				send_write_command(regOffsetk_factor, valueAsByteArray);
			}
		});
		numericUpDown_k_factor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.character == SWT.CR || arg0.character == SWT.LF) {
					int nobytes = (int) Math.ceil((regLengthk_factor / 8));
					int[] valueAsByteArray = new int[nobytes];
					int value = (int) numericUpDown_k_factor.getSelection();
					for (int index = 0; index < nobytes; index++) {
						valueAsByteArray[index] = (value % 256);
						value = ((value - valueAsByteArray[index]) / 256);
					}
					send_write_command(regOffsetk_factor, valueAsByteArray);
				}
			}
		});

		groupbox_ppm = new Group(composite, SWT.NONE);
		groupbox_ppm.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupbox_ppm = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_groupbox_ppm.widthHint = 200;
		groupbox_ppm.setLayoutData(gd_groupbox_ppm);
		groupbox_ppm.setText("ppm");
		groupboxTmp = groupbox_ppm;

		regLengthppm = 16;
		regOffsetppm = 0x24;

		Composite groupTmpppm = new Composite(groupboxTmp, SWT.NONE);
		groupTmpppm.setLayout(new FlowLayout(SWT.HORIZONTAL | SWT.LEFT));
		label_ppm = new Label(groupTmpppm, SWT.NONE);
		label_ppm.setText("ppm");
		textBox_ppm = new Text(groupTmpppm, SWT.BORDER);
		textBox_ppm.setText("---");
		textBox_ppm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent arg0) {
				int nobytes = (int) Math.ceil((regLengthppm / 8));
				int[] result = send_read_command(regOffsetppm, nobytes, false);
				if (result == null)
					return;
				int value = 0;
				for (int i = nobytes - 1; i >= 0; i--) {
					value = value * 256 + result[i];
				}
				textBox_ppm.setText(value + "");
			}
		});

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	public String[] enumToStringArray(Class<? extends Enum<?>> e) {
		return Arrays.toString(e.getEnumConstants()).replaceAll("^.|.$", "").split(", ");
	}

	public LinkedList<String> getPortList() {
		LinkedList<String> comList = new LinkedList<>();
		comList.add("off");
		portList = CommPortIdentifier.getPortIdentifiers();
		while (portList.hasMoreElements()) {
			portId = (CommPortIdentifier) portList.nextElement();
			comList.add(portId.getName());
		}
		return comList;
	}

	public void close() {
		if (serialPort != null) {
			serialPort.close();
		}
	}

	public void send(String sendData) {
		if (serialPort != null) {
			try {
				if (sendData.length() > 0) {
					outputStream.write(sendData.getBytes());
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				FileWriter fw = new FileWriter("log.txt", true); //the true will append the new data
				fw.write(sendData + "\n");//appends the string to the file
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void CommportOpen(String comName) {
		if (comName.equals("off")) {
			if (serialPort != null)
				serialPort.close();
		} else {
			portList = CommPortIdentifier.getPortIdentifiers();
			while (portList.hasMoreElements()) {
				portId = (CommPortIdentifier) portList.nextElement();
				if (comName.equals(portId.getName())) {
					break;
				}
			}
			try {
				if (serialPort != null)
					serialPort.close();
				serialPort = (SerialPort) portId.open("commreadapp", 2000);
				try {
					outputStream = serialPort.getOutputStream();
					try {
						inputStream = serialPort.getInputStream();
						try {
							serialPort.addEventListener(this);
							serialPort.notifyOnDataAvailable(true);
							try {
								serialPort.setSerialPortParams(115200, 8, 1, 0);
							} catch (UnsupportedCommOperationException e) {
							}
						} catch (TooManyListenersException e) {
						}
					} catch (IOException e) {
					}
				} catch (IOException e) {
					System.out.println("problem!");
				}
			} catch (PortInUseException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void serialEvent(SerialPortEvent arg0) {
		switch (arg0.getEventType()) {
			case SerialPortEvent.BI :
			case SerialPortEvent.OE :
			case SerialPortEvent.CD :
			case SerialPortEvent.CTS :
			case SerialPortEvent.DSR :
			case SerialPortEvent.FE :
			case SerialPortEvent.RI :
			case SerialPortEvent.PE :
			case SerialPortEvent.OUTPUT_BUFFER_EMPTY :
				break;
			//read the data from the port
			case SerialPortEvent.DATA_AVAILABLE : {
				readBuffer = new byte[256];
				try {
					int numByte = 0;
					while (inputStream.available() > 0) {
						numByte = inputStream.read(readBuffer);
					}
					//System.out.println(new String(readBuffer));
					readData += new String(readBuffer).trim();
				} catch (IOException e) {
				}
				try {
					FileWriter fw = new FileWriter("log.txt", true); //the true will append the new data
					fw.write(new String(readBuffer).trim());//appends the string to the file
					fw.close();
				} catch (IOException ioe) {
					System.err.println("IOException: " + ioe.getMessage());
				}
				break;
			}
		}
	}

	//	spinner_1;//channel
	//	spinner_2;//address
	//	spinner_3; //port
	private void send_write_command(int register, int[] value) {
		switch (combo_1.getSelectionIndex()) {
			case 0 : // I2C Protocol selected
				this.Write((this.spinner_3.getSelection()), (1 + (int) this.spinner_1.getSelection()),
						this.spinner_2.getSelection(), register, value);
				break;
			case 1 : // SPI Protocol selected
				this.Write(this.slave_spinner.getSelection(), register, value);
				break;
			default : // not a valid selection
			{
			}
			//                throw new ApplicationException("Unknown protocol selected.");
		}
	}
	// Write via SPI
	public void Write(int SlaveAddress, int RegisterAddress, int[] Value) {
		String cmdString = "$spi_write c=" + SlaveAddress;
		cmdString += "; r=" + RegisterAddress + "; b=";
		for (int b : Value)
			cmdString += b + " ";
		cmdString += "; s=" + 0 + "\n";

		send(cmdString);
		//        readTest();
	}

	// Write via I2C
	public void Write(int HubPort, int Channel, int DeviceAddress, int[] RegisterAddress, int[] Value) {
		String cmdString = "$i2c_write p=" + HubPort;
		cmdString += "; c=" + Channel;
		cmdString += "; a=" + DeviceAddress;
		if (RegisterAddress.length == 1)
			cmdString += "; r=" + RegisterAddress[0];
		else if (RegisterAddress.length == 2)
			cmdString += "; r=" + (RegisterAddress[0] + 256 * RegisterAddress[1]);
		else {
		}
		cmdString += "; b=";
		for (int b : Value)
			cmdString += b + " ";

		if (RegisterAddress.length == 1)
			cmdString += "; s=0\n";
		else if (RegisterAddress.length == 2)
			cmdString += "; s=0\n";

		send(cmdString);
		//        readTest();
	}

	public void Write(int HubPort, int Channel, int DeviceAddress, int RegisterAddress, int[] Value) {
		this.Write(HubPort, Channel, DeviceAddress, new int[]{RegisterAddress}, Value);
	}

	//	spinner_1;//channel
	//	spinner_2;//address
	//	spinner_3; //port
	private int[] send_read_command(int register, int noBytes, boolean skipRead) {
		// if skipRead variable is set to true, the first read only triggers the reading and the second
		// read returns the value. This needs to be set to false for fifo readings after the first read.
		try {
			readData = "";
			switch (combo_1.getSelectionIndex()) {
				case 0 : // I2C Protocol selected
					if (skipRead)
						this.Read((byte) (this.spinner_3.getSelection()), (1 + this.spinner_1.getSelection()),
								this.spinner_2.getSelection(), register, noBytes);
					return this.Read((byte) (this.spinner_3.getSelection()), (1 + this.spinner_1.getSelection()),
							this.spinner_2.getSelection(), register, noBytes);
				case 1 : // SPI Protocol selected
					if (skipRead)
						this.Read(this.slave_spinner.getSelection(), register, noBytes);
					return this.Read(this.slave_spinner.getSelection(), register, noBytes);
				default : // not a valid selection
				{
				}
			}
		} catch (Exception ex) {
			//             MessageBox.Show("During runtime, some error occurred. For details see below:\n\n" + ex.Message, "An Error Occurred:", MessageBoxButtons.OK, MessageBoxIcon.Warning);
			return null;
		}
		return null;
	}

	//SPI read
	public int[] Read(int SlaveAddress, int RegisterAddress, int noBytes) throws Exception {
		String cmdString = "$spi_read c=" + SlaveAddress;
		cmdString += "; r=" + RegisterAddress;
		cmdString += "; l=" + noBytes;
		cmdString += "; s=" + "0" + "\n";

		this.send(cmdString);

		int[] payload = new int[noBytes];
		String result = readData;
		System.out.println(result + "ok");
		if (result.contains("NACK"))
			throw new Exception("Read command answered with NACK\n\nWritten Command: " + cmdString);
		String[] byteResults = result.trim().replace("$", "").split(";");
		if (byteResults.length != noBytes)
			throw new Exception("Number of received bytes (" + byteResults.length
					+ ") does not match the expected number of bytes (" + noBytes + ")");
		for (int index = 0; index < noBytes; index++) {
			if (!tryParseInt(byteResults[index]))
				throw new Exception("Byte " + index + " in buffer cannot be interpreted as byte value. Byte contains: "
						+ byteResults[index] + ".\n\nWritten Command: " + cmdString);
			else {
				payload[index] = Integer.parseInt(byteResults[index]);
			}
		}
		return payload;
	}

	//I2C read
	public int[] Read(int HubPort, int Channel, int DeviceAddress, int[] RegisterAddress, int noBytes)
			throws Exception {
		String cmdString = "$i2c_read p=" + HubPort;
		cmdString += "; c=" + Channel;
		cmdString += "; a=" + DeviceAddress;
		if (RegisterAddress.length == 1)
			cmdString += "; r=" + RegisterAddress[0];
		else if (RegisterAddress.length == 2)
			cmdString += "; r=" + (RegisterAddress[0] + 256 * RegisterAddress[1]);
		else {
		}
		cmdString += "; l=" + noBytes;
		if (RegisterAddress.length == 1)
			cmdString += "; s=0\n";
		else if (RegisterAddress.length == 2)
			cmdString += "; s=0\n";

		this.send(cmdString);
		Thread.sleep(50);

		int[] payload = new int[noBytes];
		String result = readData;
		if (result.contains("NACK"))
			throw new Exception("Read command answered with NACK\n\nWritten Command: " + cmdString);
		String[] byteResults = result.trim().replace("$", "").split(";");
		if (byteResults.length != noBytes)
			throw new Exception("Number of received bytes (" + byteResults.length
					+ ") does not match the expected number of bytes (" + noBytes + ")");
		for (int index = 0; index < noBytes; index++) {
			if (!tryParseInt(byteResults[index]))
				throw new Exception("Byte " + index + " in buffer cannot be interpreted as byte value. Byte contains: "
						+ byteResults[index] + ".\n\nWritten Command: " + cmdString);
			else {
				payload[index] = Integer.parseInt(byteResults[index]);
			}
		}
		return payload;
	}

	public int[] Read(int HubPort, int Channel, int DeviceAddress, int RegisterAddress, int noBytes) throws Exception {
		return this.Read(HubPort, Channel, DeviceAddress, new int[]{RegisterAddress}, noBytes);
	}

	boolean tryParseInt(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private void ld0_perRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthld0_per / 8));
		int[] result = send_read_command(regOffsetld0_per, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		numericUpDown_ld0_per.setSelection(value);
	}

	private void duty_cycle_ld0_blueRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthduty_cycle_ld0_blue / 8));
		int[] result = send_read_command(regOffsetduty_cycle_ld0_blue, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		numericUpDown_duty_cycle_ld0_blue.setSelection(value);
	}

	private void duty_cycle_ld0_greenRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthduty_cycle_ld0_green / 8));
		int[] result = send_read_command(regOffsetduty_cycle_ld0_green, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		numericUpDown_duty_cycle_ld0_green.setSelection(value);
	}

	private void ld4_ctrlRead() {
		// Read current value of register
		int[] result = send_read_command(regOffsetld4_ctrl, 1, true);
		if (result == null)
			return;
		checkBox_ld4_ctrl.setSelection(result[0] != 0);
	}

	private void ld5_ctrlRead() {
		// Read current value of register
		int[] result = send_read_command(regOffsetld5_ctrl, 1, true);
		if (result == null)
			return;
		checkBox_ld5_ctrl.setSelection(result[0] != 0);
	}

	private void ld6_ctrlRead() {
		// Read current value of register
		int[] result = send_read_command(regOffsetld6_ctrl, 1, true);
		if (result == null)
			return;
		checkBox_ld6_ctrl.setSelection(result[0] != 0);
	}

	private void ld7_ctrlRead() {
		// Read current value of register
		int[] result = send_read_command(regOffsetld7_ctrl, 1, true);
		if (result == null)
			return;
		checkBox_ld7_ctrl.setSelection(result[0] != 0);
	}

	private void sensor_enRead() {
		// Read current value of register
		int[] result = send_read_command(regOffsetsensor_en, 1, true);
		if (result == null)
			return;
		checkBox_sensor_en.setSelection(result[0] != 0);
	}

	private void sensor_measRead() {
		// Read current value of register
		int[] result = send_read_command(regOffsetsensor_meas, 1, true);
		if (result == null)
			return;
		checkBox_sensor_meas.setSelection(result[0] != 0);
	}

	private void heater_voltageRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthheater_voltage / 8));
		int[] result = send_read_command(regOffsetheater_voltage, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		numericUpDown_heater_voltage.setSelection(value);
	}

	private void rheat_refRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthrheat_ref / 8));
		int[] result = send_read_command(regOffsetrheat_ref, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		numericUpDown_rheat_ref.setSelection(value);
	}

	private void rheat_alphaRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthrheat_alpha / 8));
		int[] result = send_read_command(regOffsetrheat_alpha, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		numericUpDown_rheat_alpha.setSelection(value);
	}

	private void adc_input_gainRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthadc_input_gain / 8));
		int[] result = send_read_command(regOffsetadc_input_gain, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		numericUpDown_adc_input_gain.setSelection(value);
	}

	private void sample_rateRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthsample_rate / 8));
		int[] result = send_read_command(regOffsetsample_rate, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		numericUpDown_sample_rate.setSelection(value);
	}

	private void on_cyclesRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthon_cycles / 8));
		int[] result = send_read_command(regOffseton_cycles, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		numericUpDown_on_cycles.setSelection(value);
	}

	private void off_cyclesRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthoff_cycles / 8));
		int[] result = send_read_command(regOffsetoff_cycles, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		numericUpDown_off_cycles.setSelection(value);
	}

	private void set_hh_tempRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthset_hh_temp / 8));
		int[] result = send_read_command(regOffsetset_hh_temp, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		numericUpDown_set_hh_temp.setSelection(value);
	}

	private void wait_cyclesRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthwait_cycles / 8));
		int[] result = send_read_command(regOffsetwait_cycles, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		numericUpDown_wait_cycles.setSelection(value);
	}

	private void meas_cntRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthmeas_cnt / 8));
		int[] result = send_read_command(regOffsetmeas_cnt, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		numericUpDown_meas_cnt.setSelection(value);
	}

	private void led_ctrlRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthled_ctrl / 8));
		int[] result = send_read_command(regOffsetled_ctrl, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		numericUpDown_led_ctrl.setSelection(value);
	}

	private void meas_doneRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthmeas_done / 8));
		int[] result = send_read_command(regOffsetmeas_done, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		textBox_meas_done.setText(value + "");
	}

	private void meas_resultRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthmeas_result / 8));
		int[] result = send_read_command(regOffsetmeas_result, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		textBox_meas_result.setText(value + "");
	}

	private void smpl_firstRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthsmpl_first / 8));
		int[] result = send_read_command(regOffsetsmpl_first, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		numericUpDown_smpl_first.setSelection(value);
	}

	private void smpl_lastRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthsmpl_last / 8));
		int[] result = send_read_command(regOffsetsmpl_last, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		numericUpDown_smpl_last.setSelection(value);
	}

	private void k_factorRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthk_factor / 8));
		int[] result = send_read_command(regOffsetk_factor, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		numericUpDown_k_factor.setSelection(value);
	}

	private void ppmRead() {
		// Read current value of register
		int nobytes = (int) Math.ceil((regLengthppm / 8));
		int[] result = send_read_command(regOffsetppm, nobytes, false);
		if (result == null)
			return;
		int value = 0;
		for (int i = nobytes - 1; i >= 0; i--) {
			value = value * 256 + result[i];
		}
		textBox_ppm.setText(value + "");
	}

	private void allSensorRead() {

		ld0_perRead();

		duty_cycle_ld0_blueRead();

		duty_cycle_ld0_greenRead();

		ld4_ctrlRead();

		ld5_ctrlRead();

		ld6_ctrlRead();

		ld7_ctrlRead();

		sensor_enRead();

		sensor_measRead();

		heater_voltageRead();

		rheat_refRead();

		rheat_alphaRead();

		adc_input_gainRead();

		sample_rateRead();

		on_cyclesRead();

		off_cyclesRead();

		set_hh_tempRead();

		wait_cyclesRead();

		meas_cntRead();

		led_ctrlRead();

		meas_doneRead();

		meas_resultRead();

		smpl_firstRead();

		smpl_lastRead();

		k_factorRead();

		ppmRead();

	}
}
