
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.border.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.HashMap;
import java.io.*;

public class Main {
	private boolean flag = true;
	private HashMap<String, Register> registerData = new data().dataGenerate();
	private LinkedList<BitField> bitField;
	private int registerValue;
	public static void main(String[] args) {
		new Main().Form();
	}
	//layout part
	public void Form() {

		//Form form = new Form();
		JFrame f = new JFrame("container");
		Container con = f.getContentPane();
		JPanel panelTotal = new JPanel();
		JPanel parentPanel = panelTotal;

		JScrollPane scrollPane = new JScrollPane(panelTotal);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setAutoscrolls(true);
		panelTotal.setLayout(new BoxLayout(panelTotal, BoxLayout.Y_AXIS));
		con.add(scrollPane, BorderLayout.CENTER);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension sc = toolkit.getScreenSize();
		//f.setSize(840, 560);
		f.setLocation(sc.width / 3, sc.height / 4);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.setResizable(false);
		Border border = BorderFactory.createEtchedBorder(Color.gray, Color.black);
		Border border0 = BorderFactory.createTitledBorder(border, "Register Configuration", TitledBorder.LEFT,
				TitledBorder.TOP);

		Border border1;
		Border border3 = BorderFactory.createTitledBorder(border, "Register Attributes", TitledBorder.LEFT,
				TitledBorder.TOP);
		Border border4 = BorderFactory.createTitledBorder(border, "BitField Overview", TitledBorder.LEFT,
				TitledBorder.TOP);

		panelTotal.setBorder(border0);

		JPanel Configuration = new JPanel();
		Configuration.setLayout(new BoxLayout(Configuration, BoxLayout.Y_AXIS));
		Border Configurationborder = BorderFactory.createTitledBorder(border, "Configuration", TitledBorder.LEFT,
				TitledBorder.TOP);
		Configuration.setBorder(Configurationborder);

		parentPanel.add(Configuration);
		JPanel ConfigurationParentPanel = parentPanel;
		parentPanel = Configuration;

		JPanel register = new JPanel();
		register.setLayout(new BoxLayout(register, BoxLayout.Y_AXIS));
		Border registerborder = BorderFactory.createTitledBorder(border, "register", TitledBorder.LEFT,
				TitledBorder.TOP);
		register.setBorder(registerborder);

		parentPanel.add(register);
		JPanel registerParentPanel = parentPanel;
		parentPanel = register;

		JComboBox registerName = new JComboBox();

		for (String item : registerData.keySet()) {
			registerName.addItem(item);
		}

		parentPanel.add(registerName);

		parentPanel = registerParentPanel;

		JPanel infos = new JPanel();
		infos.setLayout(new BoxLayout(infos, BoxLayout.Y_AXIS));
		Border infosborder = BorderFactory.createTitledBorder(border, "infos", TitledBorder.LEFT, TitledBorder.TOP);
		infos.setBorder(infosborder);

		parentPanel.add(infos);
		JPanel infosParentPanel = parentPanel;
		parentPanel = infos;

		JLabel name = new JLabel();

		name.setText("Name: " + registerData.get(registerName.getSelectedItem()).getName());

		parentPanel.add(name);

		JLabel offset = new JLabel();

		offset.setText("offset: " + registerData.get(registerName.getSelectedItem()).getOffset());

		parentPanel.add(offset);

		JLabel dataWidth = new JLabel();

		dataWidth.setText("data width: " + registerData.get(registerName.getSelectedItem()).getDataWidth());

		parentPanel.add(dataWidth);

		parentPanel = infosParentPanel;

		JPanel values = new JPanel();
		values.setLayout(new BoxLayout(values, BoxLayout.X_AXIS));
		Border valuesborder = BorderFactory.createTitledBorder(border, "values", TitledBorder.LEFT, TitledBorder.TOP);
		values.setBorder(valuesborder);

		parentPanel.add(values);
		JPanel valuesParentPanel = parentPanel;
		parentPanel = values;

		JPanel bitField1 = new JPanel();
		bitField1.setLayout(new BoxLayout(bitField1, BoxLayout.Y_AXIS));
		Border bitField1border = BorderFactory.createTitledBorder(border, "bitField1", TitledBorder.LEFT,
				TitledBorder.TOP);
		bitField1.setBorder(bitField1border);

		parentPanel.add(bitField1);
		JPanel bitField1ParentPanel = parentPanel;
		parentPanel = bitField1;

		JLabel bitField1Name = new JLabel();

		if (registerData.get(registerName.getSelectedItem()).getBitField().size() == 1)
			bitField1Name.setText("Not used");
		else {
			bitField1Name.setText(registerData.get(registerName.getSelectedItem()).getBitField().get(1).getName());
		}

		parentPanel.add(bitField1Name);

		JComboBox bitField1Value = new JComboBox();

		if (registerData.get(registerName.getSelectedItem()).getBitField().size() == 1)
			bitField1Value.setEnabled(false);
		else {
			for (int i = 0; i < Math.pow(2,
					registerData.get(registerName.getSelectedItem()).getBitField().get(1).getWidth()); i++)
				bitField1Value.addItem(i);
		}

		parentPanel.add(bitField1Value);

		parentPanel = bitField1ParentPanel;

		JPanel bitField2 = new JPanel();
		bitField2.setLayout(new BoxLayout(bitField2, BoxLayout.Y_AXIS));
		Border bitField2border = BorderFactory.createTitledBorder(border, "bitField2", TitledBorder.LEFT,
				TitledBorder.TOP);
		bitField2.setBorder(bitField2border);

		parentPanel.add(bitField2);
		JPanel bitField2ParentPanel = parentPanel;
		parentPanel = bitField2;

		JLabel bitField2Name = new JLabel();

		bitField2Name.setText(registerData.get(registerName.getSelectedItem()).getBitField().get(0).getName());

		parentPanel.add(bitField2Name);

		JComboBox bitField2Value = new JComboBox();

		for (int i = 0; i < Math.pow(2,
				registerData.get(registerName.getSelectedItem()).getBitField().get(0).getWidth()); i++)
			bitField2Value.addItem(i);

		parentPanel.add(bitField2Value);

		parentPanel = bitField2ParentPanel;

		parentPanel = valuesParentPanel;

		parentPanel = ConfigurationParentPanel;

		registerName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update(registerData, name, offset, dataWidth, bitField1Name, bitField2Name, registerName,
						bitField1Value, bitField2Value);
			}
		});
		bitField1Value.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (flag == true && e.getStateChange() == ItemEvent.SELECTED)
					writeToFile1(registerData, name, offset, dataWidth, bitField1Name, bitField2Name, registerName,
							bitField1Value, bitField2Value);
			}
		});
		bitField2Value.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (flag == true && e.getStateChange() == ItemEvent.SELECTED)
					writeToFile2(registerData, name, offset, dataWidth, bitField1Name, bitField2Name, registerName,
							bitField1Value, bitField2Value);
			}
		});
		f.pack();
		f.setVisible(true);
		update(registerData, name, offset, dataWidth, bitField1Name, bitField2Name, registerName, bitField1Value,
				bitField2Value);
	}

	public void update(HashMap<String, Register> registerData, JLabel name, JLabel offset, JLabel dataWidth,
			JLabel bitField1Name, JLabel bitField2Name, JComboBox registerName, JComboBox bitField1Value,
			JComboBox bitField2Value) {
		//read data from the file
		String[] parts;
		try {
			FileInputStream fstream = new FileInputStream(
					new File("C:/eclipseWorkspace/masterthesis_layout_1004.project/src-gen/file.txt"));
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				parts = strLine.split(" ");
				if (parts[0].equals(registerName.getSelectedItem())) {
					registerValue = Integer.parseInt(parts[1]);
					break;
				}
			}
			fstream.close();
		} catch (Exception e) {
		}
		name.setText("Name: " + registerData.get(registerName.getSelectedItem()).getName());
		offset.setText("offset: " + registerData.get(registerName.getSelectedItem()).getOffset());
		dataWidth.setText("data width: " + registerData.get(registerName.getSelectedItem()).getDataWidth());
		if (registerData.get(registerName.getSelectedItem()).getBitField().size() == 1)
			bitField1Name.setText("Not used");
		else {
			bitField1Name.setText(registerData.get(registerName.getSelectedItem()).getBitField().get(1).getName());
		}
		bitField2Name.setText(registerData.get(registerName.getSelectedItem()).getBitField().get(0).getName());
		flag = false;
		if (registerData.get(registerName.getSelectedItem()).getBitField().size() == 1)
			bitField1Value.setEnabled(false);
		else {
			bitField1Value.setEnabled(true);
			bitField1Value.removeAllItems();
			for (int i = 0; i < Math.pow(2,
					registerData.get(registerName.getSelectedItem()).getBitField().get(1).getWidth()); i++)
				bitField1Value.addItem(i);
			bitField1Value.setSelectedIndex((registerValue & ((int) Math.pow(2,
					registerData.get(registerName.getSelectedItem()).getBitField().get(1).getWidth())
					- 1) << registerData.get(registerName.getSelectedItem()).getBitField().get(1)
							.getOffset()) >> registerData.get(registerName.getSelectedItem()).getBitField().get(1)
									.getOffset());
		}
		bitField2Value.removeAllItems();
		for (int i = 0; i < Math.pow(2,
				registerData.get(registerName.getSelectedItem()).getBitField().get(0).getWidth()); i++)
			bitField2Value.addItem(i);
		bitField2Value.setSelectedIndex((registerValue
				& ((int) Math.pow(2, registerData.get(registerName.getSelectedItem()).getBitField().get(0).getWidth())
						- 1) << registerData.get(registerName.getSelectedItem()).getBitField().get(0)
								.getOffset()) >> registerData.get(registerName.getSelectedItem()).getBitField().get(0)
										.getOffset());
		flag = true;
	}

	public void writeToFile1(HashMap<String, Register> registerData, JLabel name, JLabel offset, JLabel dataWidth,
			JLabel bitField1Name, JLabel bitField2Name, JComboBox registerName, JComboBox bitField1Value,
			JComboBox bitField2Value) {
		registerValue = (registerValue
				& ((int) Math.pow(2, registerData.get(registerName.getSelectedItem()).getBitField().get(1).getWidth())
						- 1) << registerData.get(registerName.getSelectedItem()).getBitField().get(1).getOffset())
				^ registerValue
				| ((int) bitField1Value.getSelectedItem() << registerData.get(registerName.getSelectedItem())
						.getBitField().get(1).getOffset());
		try {
			Writer output = new BufferedWriter(
					new FileWriter("C:/eclipseWorkspace/masterthesis_layout_1006.project/src-gen/file.txt", true)); //clears file every time
			output.append(" " + registerName.getSelectedItem() + " " + registerValue);
			output.close();
		} catch (IOException e) {
		} ;
	}

	public void writeToFile2(HashMap<String, Register> registerData, JLabel name, JLabel offset, JLabel dataWidth,
			JLabel bitField1Name, JLabel bitField2Name, JComboBox registerName, JComboBox bitField1Value,
			JComboBox bitField2Value) {
		registerValue = (registerValue
				& ((int) Math.pow(2, registerData.get(registerName.getSelectedItem()).getBitField().get(0).getWidth())
						- 1) << registerData.get(registerName.getSelectedItem()).getBitField().get(0).getOffset())
				^ registerValue
				| ((int) bitField2Value.getSelectedIndex() << registerData.get(registerName.getSelectedItem())
						.getBitField().get(0).getOffset());
		try {
			Writer output = new BufferedWriter(
					new FileWriter("C:/eclipseWorkspace/masterthesis_layout_1006.project/src-gen/file.txt", true)); //clears file every time
			output.append(" " + registerName.getSelectedItem() + " " + registerValue);
			output.close();
		} catch (IOException e) {
		} ;
	}
}

class data {
	private HashMap<String, Register> registerData = new HashMap<>();
	private Register regTmp;
	private BitField bitTmp;
	public HashMap<String, Register> dataGenerate() {

		regTmp = new Register("pwm_per", 0x0, 16);

		bitTmp = new BitField("pwm_per", 0, 16);
		regTmp.addBitField(bitTmp);

		registerData.put("pwm_per", regTmp);

		regTmp = new Register("heat_smpls", 0x2, 8);

		bitTmp = new BitField("heat_smpls", 0, 6);
		regTmp.addBitField(bitTmp);

		registerData.put("heat_smpls", regTmp);

		regTmp = new Register("meas_smpls", 0x3, 8);

		bitTmp = new BitField("meas_smpls", 0, 6);
		regTmp.addBitField(bitTmp);

		registerData.put("meas_smpls", regTmp);

		regTmp = new Register("meas_accu", 0x4, 8);

		bitTmp = new BitField("meas_accu", 0, 3);
		regTmp.addBitField(bitTmp);

		registerData.put("meas_accu", regTmp);

		regTmp = new Register("gas_val", 0x5, 16);

		bitTmp = new BitField("gas_val", 0, 12);
		regTmp.addBitField(bitTmp);

		registerData.put("gas_val", regTmp);

		regTmp = new Register("meas_ctrl", 0x7, 8);

		bitTmp = new BitField("meas_run", 0, 1);
		regTmp.addBitField(bitTmp);

		bitTmp = new BitField("meas_cont", 1, 1);
		regTmp.addBitField(bitTmp);

		registerData.put("meas_ctrl", regTmp);

		regTmp = new Register("meas_per", 0x8, 8);

		bitTmp = new BitField("meas_per", 0, 8);
		regTmp.addBitField(bitTmp);

		registerData.put("meas_per", regTmp);

		regTmp = new Register("meas_mode", 0x9, 8);

		bitTmp = new BitField("meas_mode", 0, 2);
		regTmp.addBitField(bitTmp);

		registerData.put("meas_mode", regTmp);

		regTmp = new Register("meas_smpl_sts", 0xa, 8);

		bitTmp = new BitField("meas_smpl_sts", 0, 6);
		regTmp.addBitField(bitTmp);

		registerData.put("meas_smpl_sts", regTmp);

		regTmp = new Register("meas_accu_sts", 0xb, 8);

		bitTmp = new BitField("meas_accu_sts", 0, 6);
		regTmp.addBitField(bitTmp);

		registerData.put("meas_accu_sts", regTmp);

		regTmp = new Register("meas_ofs", 0xc, 8);

		bitTmp = new BitField("meas_ofs", 0, 8);
		regTmp.addBitField(bitTmp);

		registerData.put("meas_ofs", regTmp);

		regTmp = new Register("meas_gain", 0xd, 8);

		bitTmp = new BitField("meas_gain", 0, 3);
		regTmp.addBitField(bitTmp);

		registerData.put("meas_gain", regTmp);

		regTmp = new Register("pwm_duty_heat", 0xe, 16);

		bitTmp = new BitField("pwm_duty_heat", 0, 16);
		regTmp.addBitField(bitTmp);

		registerData.put("pwm_duty_heat", regTmp);

		regTmp = new Register("pwm_duty_cool", 0x10, 16);

		bitTmp = new BitField("pwm_duty_cool", 0, 16);
		regTmp.addBitField(bitTmp);

		registerData.put("pwm_duty_cool", regTmp);

		regTmp = new Register("temp_set_heat", 0x12, 16);

		bitTmp = new BitField("temp_set_heat", 0, 16);
		regTmp.addBitField(bitTmp);

		registerData.put("temp_set_heat", regTmp);

		regTmp = new Register("temp_set_cool", 0x14, 16);

		bitTmp = new BitField("temp_set_cool", 0, 16);
		regTmp.addBitField(bitTmp);

		registerData.put("temp_set_cool", regTmp);

		regTmp = new Register("temp_set_mode", 0x16, 8);

		bitTmp = new BitField("temp_set_mode", 0, 1);
		regTmp.addBitField(bitTmp);

		registerData.put("temp_set_mode", regTmp);

		regTmp = new Register("heat_reg_en", 0x17, 8);

		bitTmp = new BitField("heat_reg_en", 0, 1);
		regTmp.addBitField(bitTmp);

		registerData.put("heat_reg_en", regTmp);

		regTmp = new Register("temp_reg_p", 0x18, 8);

		bitTmp = new BitField("temp_reg_p", 0, 8);
		regTmp.addBitField(bitTmp);

		registerData.put("temp_reg_p", regTmp);

		regTmp = new Register("temp_reg_i", 0x19, 8);

		bitTmp = new BitField("temp_reg_i", 0, 8);
		regTmp.addBitField(bitTmp);

		registerData.put("temp_reg_i", regTmp);

		regTmp = new Register("temp_reg_d", 0x1a, 8);

		bitTmp = new BitField("temp_reg_d", 0, 8);
		regTmp.addBitField(bitTmp);

		registerData.put("temp_reg_d", regTmp);

		regTmp = new Register("util_run", 0x1b, 8);

		bitTmp = new BitField("util_run", 0, 1);
		regTmp.addBitField(bitTmp);

		registerData.put("util_run", regTmp);

		regTmp = new Register("util_tdie", 0x1c, 16);

		bitTmp = new BitField("util_tdie", 0, 16);
		regTmp.addBitField(bitTmp);

		registerData.put("util_tdie", regTmp);

		regTmp = new Register("util_vsup", 0x1e, 16);

		bitTmp = new BitField("util_vsup", 0, 16);
		regTmp.addBitField(bitTmp);

		registerData.put("util_vsup", regTmp);

		regTmp = new Register("int_en", 0x20, 8);

		bitTmp = new BitField("meas_int_en", 0, 1);
		regTmp.addBitField(bitTmp);

		bitTmp = new BitField("util_int_en", 1, 1);
		regTmp.addBitField(bitTmp);

		registerData.put("int_en", regTmp);

		regTmp = new Register("int_sts", 0x21, 8);

		bitTmp = new BitField("meas_int_sts", 0, 1);
		regTmp.addBitField(bitTmp);

		bitTmp = new BitField("util_int_sts", 1, 1);
		regTmp.addBitField(bitTmp);

		registerData.put("int_sts", regTmp);

		regTmp = new Register("nvm_addr", 0x22, 16);

		bitTmp = new BitField("nvm_addr", 0, 10);
		regTmp.addBitField(bitTmp);

		registerData.put("nvm_addr", regTmp);

		regTmp = new Register("nvm_data", 0x24, 8);

		bitTmp = new BitField("nvm_data", 0, 8);
		regTmp.addBitField(bitTmp);

		registerData.put("nvm_data", regTmp);

		regTmp = new Register("meas_data_fifo_status", 0x25, 8);

		bitTmp = new BitField("meas_data_fifo_status", 0, 8);
		regTmp.addBitField(bitTmp);

		registerData.put("meas_data_fifo_status", regTmp);

		regTmp = new Register("meas_data_fifo", 0x26, 16);

		bitTmp = new BitField("meas_data", 0, 16);
		regTmp.addBitField(bitTmp);

		registerData.put("meas_data_fifo", regTmp);

		return registerData;
	}
}
