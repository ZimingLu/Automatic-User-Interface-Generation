
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		new Main().Form();
	}

	private Component[] getComponents(Component container) {
		ArrayList<Component> list = null;

		try {
			list = new ArrayList<Component>(Arrays.asList(((Container) container).getComponents()));
			for (int index = 0; index < list.size(); index++) {
				for (Component currentComponent : getComponents(list.get(index))) {
					list.add(currentComponent);
				}
			}
		} catch (ClassCastException e) {
			list = new ArrayList<Component>();
		}

		return list.toArray(new Component[list.size()]);
	}

	public boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
		return true;
	}

	public void Form() {
		Form form = new Form();
		String name;
		int dataWidth;
		JLabel[] labelTemp;
		JComboBox<Integer>[] comboboxTemp;
		Integer[] selection = new Integer[]{0, 1};
		JFrame f = new JFrame("User Interface");
		Container con = f.getContentPane();
		JPanel panelTotal = new JPanel();
		JScrollPane scrollPane = new JScrollPane(panelTotal);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setAutoscrolls(true);
		panelTotal.setLayout(new BoxLayout(panelTotal, BoxLayout.Y_AXIS));
		con.add(scrollPane, BorderLayout.CENTER);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension sc = toolkit.getScreenSize();
		f.setSize(840, 560);
		f.setLocation(sc.width / 3, sc.height / 4);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.setResizable(false);
		Border border = BorderFactory.createEtchedBorder(Color.gray, Color.black);
		Border border0 = BorderFactory.createTitledBorder(border, "Register Configuration", TitledBorder.LEFT,
				TitledBorder.TOP);
		Border border1;
		Border border2 = BorderFactory.createTitledBorder(border, "General Info", TitledBorder.LEFT, TitledBorder.TOP);
		Border border3 = BorderFactory.createTitledBorder(border, "Register Attributes", TitledBorder.LEFT,
				TitledBorder.TOP);
		Border border4 = BorderFactory.createTitledBorder(border, "BitField Overview", TitledBorder.LEFT,
				TitledBorder.TOP);

		panelTotal.setBorder(border0);

		JPanel pwm_perPanel = new JPanel();
		JPanel pwm_perGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel pwm_perRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel pwm_perBitField = new JPanel();
		JTextField pwm_perDataInput = new JTextField();
		pwm_perDataInput.setText("0x");
		pwm_perDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "pwm_per", TitledBorder.LEFT,
				TitledBorder.TOP);
		pwm_perPanel.setBorder(border1);
		pwm_perPanel.setLayout(new BoxLayout(pwm_perPanel, BoxLayout.Y_AXIS));

		//General info part
		pwm_perGeneralInfo.setBorder(border2);
		//pwm_perGeneralInfo.setLayout(new BoxLayout(pwm_perGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel pwm_perLabel = new JLabel("Name: " + "pwm_per");
		//pwm_perLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, pwm_perLabel.getMinimumSize().height));
		pwm_perGeneralInfo.add(pwm_perLabel);
		JLabel pwm_perShortNameLabel = new JLabel("shortName: " + "");
		pwm_perGeneralInfo.add(pwm_perShortNameLabel);
		JLabel pwm_perHiddenLabel = new JLabel("hidden: " + "false");
		pwm_perGeneralInfo.add(pwm_perHiddenLabel);
		pwm_perPanel.add(pwm_perGeneralInfo);
		//Register attribute part
		pwm_perRegAttributes.setBorder(border3);
		//pwm_perRegAttributes.setLayout(new BoxLayout(pwm_perRegAttributes, BoxLayout.Y_AXIS));
		pwm_perPanel.add(pwm_perRegAttributes);
		JLabel pwm_perOffsetLabel = new JLabel("Offset: " + "0x0");
		pwm_perRegAttributes.add(pwm_perOffsetLabel);
		JLabel pwm_perRelOffsetLabel = new JLabel("Rel Offset: " + "0x0");
		pwm_perRegAttributes.add(pwm_perRelOffsetLabel);
		JLabel pwm_perDataWidth = new JLabel("Rel Offset: " + "16");
		pwm_perRegAttributes.add(pwm_perDataWidth);
		JLabel pwm_perNoShadowLabel = new JLabel("No Shadow: ");
		pwm_perRegAttributes.add(pwm_perNoShadowLabel);
		JCheckBox pwm_perNoShadowCheckBox = new JCheckBox();
		pwm_perNoShadowCheckBox.setSelected(true);

		pwm_perRegAttributes.add(pwm_perNoShadowCheckBox);
		JLabel pwm_perMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		pwm_perRegAttributes.add(pwm_perMirrorSizeLabel);
		//BitField Overview

		pwm_perBitField.setBorder(border4);
		pwm_perBitField.setLayout(new BoxLayout(pwm_perBitField, BoxLayout.Y_AXIS));
		pwm_perPanel.add(pwm_perBitField);

		JCheckBox pwm_perBitCheck = new JCheckBox("BitField Configuration");
		pwm_perBitCheck.setSelected(true);
		pwm_perBitField.add(pwm_perBitCheck);
		JCheckBox pwm_perDataInputCheck = new JCheckBox("Data Input Configuration");
		pwm_perDataInputCheck.setSelected(false);

		JPanel pwm_perBitFieldPanel = new JPanel();
		pwm_perBitField.add(pwm_perBitFieldPanel);
		pwm_perBitFieldPanel.setLayout(new BoxLayout(pwm_perBitFieldPanel, BoxLayout.X_AXIS));

		JPanel pwm_perBitInputPanel = new JPanel();
		pwm_perBitField.add(pwm_perBitInputPanel);
		pwm_perBitInputPanel.setLayout(new BoxLayout(pwm_perBitInputPanel, BoxLayout.X_AXIS));
		pwm_perBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!pwm_perBitCheck.isSelected()) {
					for (Component component : getComponents(pwm_perBitFieldPanel)) {
						component.setEnabled(false);
					}
					pwm_perDataInputCheck.setSelected(true);
					pwm_perDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(pwm_perBitFieldPanel)) {
						component.setEnabled(true);
					}
					pwm_perDataInputCheck.setSelected(false);
					pwm_perDataInput.setEnabled(false);
				}
			}
		});

		pwm_perDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (pwm_perDataInputCheck.isSelected()) {
					for (Component component : getComponents(pwm_perBitFieldPanel)) {
						component.setEnabled(false);
					}
					pwm_perBitCheck.setSelected(false);
					pwm_perDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(pwm_perBitFieldPanel)) {
						component.setEnabled(true);
					}
					pwm_perBitCheck.setSelected(true);
					pwm_perDataInput.setEnabled(false);
				}
			}
		});
		Action pwm_peraction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = pwm_perDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 16)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 16) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] pwm_perBitPanel = new JPanel[16];
		JLabel[] pwm_perBitLabel = new JLabel[16];
		JComboBox<Integer>[] pwm_perComboBoxList = new JComboBox[16];
		name = "pwm_per";
		labelTemp = pwm_perBitLabel;
		comboboxTemp = pwm_perComboBoxList;
		dataWidth = 16;
		for (int i = 0; i < 16; i++) {
			pwm_perBitPanel[i] = new JPanel();
			pwm_perBitPanel[i].setLayout(new BoxLayout(pwm_perBitPanel[i], BoxLayout.Y_AXIS));
			pwm_perBitFieldPanel.add(pwm_perBitPanel[i]);

			pwm_perBitLabel[i] = new JLabel("  ");
			pwm_perComboBoxList[i] = new JComboBox(selection);
			pwm_perComboBoxList[i].setEnabled(false);
			pwm_perComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 16; i++) {
						sendData = sendData * 2 + (int) pwm_perComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			pwm_perBitPanel[i].add(pwm_perBitLabel[i]);
			pwm_perBitPanel[i].add(pwm_perComboBoxList[i]);
			pwm_perBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 16; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("pwm_per" + "[" + i + "]");
		}

		pwm_perBitField.add(pwm_perDataInputCheck);
		pwm_perBitField.add(pwm_perDataInput);
		pwm_perDataInput.addActionListener(pwm_peraction);

		//final total panel
		panelTotal.add(pwm_perPanel);
		panelTotal.add(new JSeparator());

		JPanel heat_smplsPanel = new JPanel();
		JPanel heat_smplsGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel heat_smplsRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel heat_smplsBitField = new JPanel();
		JTextField heat_smplsDataInput = new JTextField();
		heat_smplsDataInput.setText("0x");
		heat_smplsDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "heat_smpls", TitledBorder.LEFT,
				TitledBorder.TOP);
		heat_smplsPanel.setBorder(border1);
		heat_smplsPanel.setLayout(new BoxLayout(heat_smplsPanel, BoxLayout.Y_AXIS));

		//General info part
		heat_smplsGeneralInfo.setBorder(border2);
		//heat_smplsGeneralInfo.setLayout(new BoxLayout(heat_smplsGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel heat_smplsLabel = new JLabel("Name: " + "heat_smpls");
		//heat_smplsLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, heat_smplsLabel.getMinimumSize().height));
		heat_smplsGeneralInfo.add(heat_smplsLabel);
		JLabel heat_smplsShortNameLabel = new JLabel("shortName: " + "");
		heat_smplsGeneralInfo.add(heat_smplsShortNameLabel);
		JLabel heat_smplsHiddenLabel = new JLabel("hidden: " + "false");
		heat_smplsGeneralInfo.add(heat_smplsHiddenLabel);
		heat_smplsPanel.add(heat_smplsGeneralInfo);
		//Register attribute part
		heat_smplsRegAttributes.setBorder(border3);
		//heat_smplsRegAttributes.setLayout(new BoxLayout(heat_smplsRegAttributes, BoxLayout.Y_AXIS));
		heat_smplsPanel.add(heat_smplsRegAttributes);
		JLabel heat_smplsOffsetLabel = new JLabel("Offset: " + "0x2");
		heat_smplsRegAttributes.add(heat_smplsOffsetLabel);
		JLabel heat_smplsRelOffsetLabel = new JLabel("Rel Offset: " + "0x2");
		heat_smplsRegAttributes.add(heat_smplsRelOffsetLabel);
		JLabel heat_smplsDataWidth = new JLabel("Rel Offset: " + "8");
		heat_smplsRegAttributes.add(heat_smplsDataWidth);
		JLabel heat_smplsNoShadowLabel = new JLabel("No Shadow: ");
		heat_smplsRegAttributes.add(heat_smplsNoShadowLabel);
		JCheckBox heat_smplsNoShadowCheckBox = new JCheckBox();
		heat_smplsNoShadowCheckBox.setSelected(true);

		heat_smplsRegAttributes.add(heat_smplsNoShadowCheckBox);
		JLabel heat_smplsMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		heat_smplsRegAttributes.add(heat_smplsMirrorSizeLabel);
		//BitField Overview

		heat_smplsBitField.setBorder(border4);
		heat_smplsBitField.setLayout(new BoxLayout(heat_smplsBitField, BoxLayout.Y_AXIS));
		heat_smplsPanel.add(heat_smplsBitField);

		JCheckBox heat_smplsBitCheck = new JCheckBox("BitField Configuration");
		heat_smplsBitCheck.setSelected(true);
		heat_smplsBitField.add(heat_smplsBitCheck);
		JCheckBox heat_smplsDataInputCheck = new JCheckBox("Data Input Configuration");
		heat_smplsDataInputCheck.setSelected(false);

		JPanel heat_smplsBitFieldPanel = new JPanel();
		heat_smplsBitField.add(heat_smplsBitFieldPanel);
		heat_smplsBitFieldPanel.setLayout(new BoxLayout(heat_smplsBitFieldPanel, BoxLayout.X_AXIS));

		JPanel heat_smplsBitInputPanel = new JPanel();
		heat_smplsBitField.add(heat_smplsBitInputPanel);
		heat_smplsBitInputPanel.setLayout(new BoxLayout(heat_smplsBitInputPanel, BoxLayout.X_AXIS));
		heat_smplsBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!heat_smplsBitCheck.isSelected()) {
					for (Component component : getComponents(heat_smplsBitFieldPanel)) {
						component.setEnabled(false);
					}
					heat_smplsDataInputCheck.setSelected(true);
					heat_smplsDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(heat_smplsBitFieldPanel)) {
						component.setEnabled(true);
					}
					heat_smplsDataInputCheck.setSelected(false);
					heat_smplsDataInput.setEnabled(false);
				}
			}
		});

		heat_smplsDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (heat_smplsDataInputCheck.isSelected()) {
					for (Component component : getComponents(heat_smplsBitFieldPanel)) {
						component.setEnabled(false);
					}
					heat_smplsBitCheck.setSelected(false);
					heat_smplsDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(heat_smplsBitFieldPanel)) {
						component.setEnabled(true);
					}
					heat_smplsBitCheck.setSelected(true);
					heat_smplsDataInput.setEnabled(false);
				}
			}
		});
		Action heat_smplsaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = heat_smplsDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] heat_smplsBitPanel = new JPanel[8];
		JLabel[] heat_smplsBitLabel = new JLabel[8];
		JComboBox<Integer>[] heat_smplsComboBoxList = new JComboBox[8];
		name = "heat_smpls";
		labelTemp = heat_smplsBitLabel;
		comboboxTemp = heat_smplsComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			heat_smplsBitPanel[i] = new JPanel();
			heat_smplsBitPanel[i].setLayout(new BoxLayout(heat_smplsBitPanel[i], BoxLayout.Y_AXIS));
			heat_smplsBitFieldPanel.add(heat_smplsBitPanel[i]);

			heat_smplsBitLabel[i] = new JLabel("  ");
			heat_smplsComboBoxList[i] = new JComboBox(selection);
			heat_smplsComboBoxList[i].setEnabled(false);
			heat_smplsComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) heat_smplsComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			heat_smplsBitPanel[i].add(heat_smplsBitLabel[i]);
			heat_smplsBitPanel[i].add(heat_smplsComboBoxList[i]);
			heat_smplsBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 6; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("heat_smpls" + "[" + i + "]");
		}

		heat_smplsBitField.add(heat_smplsDataInputCheck);
		heat_smplsBitField.add(heat_smplsDataInput);
		heat_smplsDataInput.addActionListener(heat_smplsaction);

		//final total panel
		panelTotal.add(heat_smplsPanel);
		panelTotal.add(new JSeparator());

		JPanel meas_smplsPanel = new JPanel();
		JPanel meas_smplsGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel meas_smplsRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel meas_smplsBitField = new JPanel();
		JTextField meas_smplsDataInput = new JTextField();
		meas_smplsDataInput.setText("0x");
		meas_smplsDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "meas_smpls", TitledBorder.LEFT,
				TitledBorder.TOP);
		meas_smplsPanel.setBorder(border1);
		meas_smplsPanel.setLayout(new BoxLayout(meas_smplsPanel, BoxLayout.Y_AXIS));

		//General info part
		meas_smplsGeneralInfo.setBorder(border2);
		//meas_smplsGeneralInfo.setLayout(new BoxLayout(meas_smplsGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel meas_smplsLabel = new JLabel("Name: " + "meas_smpls");
		//meas_smplsLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, meas_smplsLabel.getMinimumSize().height));
		meas_smplsGeneralInfo.add(meas_smplsLabel);
		JLabel meas_smplsShortNameLabel = new JLabel("shortName: " + "");
		meas_smplsGeneralInfo.add(meas_smplsShortNameLabel);
		JLabel meas_smplsHiddenLabel = new JLabel("hidden: " + "false");
		meas_smplsGeneralInfo.add(meas_smplsHiddenLabel);
		meas_smplsPanel.add(meas_smplsGeneralInfo);
		//Register attribute part
		meas_smplsRegAttributes.setBorder(border3);
		//meas_smplsRegAttributes.setLayout(new BoxLayout(meas_smplsRegAttributes, BoxLayout.Y_AXIS));
		meas_smplsPanel.add(meas_smplsRegAttributes);
		JLabel meas_smplsOffsetLabel = new JLabel("Offset: " + "0x3");
		meas_smplsRegAttributes.add(meas_smplsOffsetLabel);
		JLabel meas_smplsRelOffsetLabel = new JLabel("Rel Offset: " + "0x3");
		meas_smplsRegAttributes.add(meas_smplsRelOffsetLabel);
		JLabel meas_smplsDataWidth = new JLabel("Rel Offset: " + "8");
		meas_smplsRegAttributes.add(meas_smplsDataWidth);
		JLabel meas_smplsNoShadowLabel = new JLabel("No Shadow: ");
		meas_smplsRegAttributes.add(meas_smplsNoShadowLabel);
		JCheckBox meas_smplsNoShadowCheckBox = new JCheckBox();
		meas_smplsNoShadowCheckBox.setSelected(true);

		meas_smplsRegAttributes.add(meas_smplsNoShadowCheckBox);
		JLabel meas_smplsMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		meas_smplsRegAttributes.add(meas_smplsMirrorSizeLabel);
		//BitField Overview

		meas_smplsBitField.setBorder(border4);
		meas_smplsBitField.setLayout(new BoxLayout(meas_smplsBitField, BoxLayout.Y_AXIS));
		meas_smplsPanel.add(meas_smplsBitField);

		JCheckBox meas_smplsBitCheck = new JCheckBox("BitField Configuration");
		meas_smplsBitCheck.setSelected(true);
		meas_smplsBitField.add(meas_smplsBitCheck);
		JCheckBox meas_smplsDataInputCheck = new JCheckBox("Data Input Configuration");
		meas_smplsDataInputCheck.setSelected(false);

		JPanel meas_smplsBitFieldPanel = new JPanel();
		meas_smplsBitField.add(meas_smplsBitFieldPanel);
		meas_smplsBitFieldPanel.setLayout(new BoxLayout(meas_smplsBitFieldPanel, BoxLayout.X_AXIS));

		JPanel meas_smplsBitInputPanel = new JPanel();
		meas_smplsBitField.add(meas_smplsBitInputPanel);
		meas_smplsBitInputPanel.setLayout(new BoxLayout(meas_smplsBitInputPanel, BoxLayout.X_AXIS));
		meas_smplsBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!meas_smplsBitCheck.isSelected()) {
					for (Component component : getComponents(meas_smplsBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_smplsDataInputCheck.setSelected(true);
					meas_smplsDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_smplsBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_smplsDataInputCheck.setSelected(false);
					meas_smplsDataInput.setEnabled(false);
				}
			}
		});

		meas_smplsDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (meas_smplsDataInputCheck.isSelected()) {
					for (Component component : getComponents(meas_smplsBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_smplsBitCheck.setSelected(false);
					meas_smplsDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_smplsBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_smplsBitCheck.setSelected(true);
					meas_smplsDataInput.setEnabled(false);
				}
			}
		});
		Action meas_smplsaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = meas_smplsDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] meas_smplsBitPanel = new JPanel[8];
		JLabel[] meas_smplsBitLabel = new JLabel[8];
		JComboBox<Integer>[] meas_smplsComboBoxList = new JComboBox[8];
		name = "meas_smpls";
		labelTemp = meas_smplsBitLabel;
		comboboxTemp = meas_smplsComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			meas_smplsBitPanel[i] = new JPanel();
			meas_smplsBitPanel[i].setLayout(new BoxLayout(meas_smplsBitPanel[i], BoxLayout.Y_AXIS));
			meas_smplsBitFieldPanel.add(meas_smplsBitPanel[i]);

			meas_smplsBitLabel[i] = new JLabel("  ");
			meas_smplsComboBoxList[i] = new JComboBox(selection);
			meas_smplsComboBoxList[i].setEnabled(false);
			meas_smplsComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) meas_smplsComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			meas_smplsBitPanel[i].add(meas_smplsBitLabel[i]);
			meas_smplsBitPanel[i].add(meas_smplsComboBoxList[i]);
			meas_smplsBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 6; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("meas_smpls" + "[" + i + "]");
		}

		meas_smplsBitField.add(meas_smplsDataInputCheck);
		meas_smplsBitField.add(meas_smplsDataInput);
		meas_smplsDataInput.addActionListener(meas_smplsaction);

		//final total panel
		panelTotal.add(meas_smplsPanel);
		panelTotal.add(new JSeparator());

		JPanel meas_accuPanel = new JPanel();
		JPanel meas_accuGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel meas_accuRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel meas_accuBitField = new JPanel();
		JTextField meas_accuDataInput = new JTextField();
		meas_accuDataInput.setText("0x");
		meas_accuDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "meas_accu", TitledBorder.LEFT,
				TitledBorder.TOP);
		meas_accuPanel.setBorder(border1);
		meas_accuPanel.setLayout(new BoxLayout(meas_accuPanel, BoxLayout.Y_AXIS));

		//General info part
		meas_accuGeneralInfo.setBorder(border2);
		//meas_accuGeneralInfo.setLayout(new BoxLayout(meas_accuGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel meas_accuLabel = new JLabel("Name: " + "meas_accu");
		//meas_accuLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, meas_accuLabel.getMinimumSize().height));
		meas_accuGeneralInfo.add(meas_accuLabel);
		JLabel meas_accuShortNameLabel = new JLabel("shortName: " + "");
		meas_accuGeneralInfo.add(meas_accuShortNameLabel);
		JLabel meas_accuHiddenLabel = new JLabel("hidden: " + "false");
		meas_accuGeneralInfo.add(meas_accuHiddenLabel);
		meas_accuPanel.add(meas_accuGeneralInfo);
		//Register attribute part
		meas_accuRegAttributes.setBorder(border3);
		//meas_accuRegAttributes.setLayout(new BoxLayout(meas_accuRegAttributes, BoxLayout.Y_AXIS));
		meas_accuPanel.add(meas_accuRegAttributes);
		JLabel meas_accuOffsetLabel = new JLabel("Offset: " + "0x4");
		meas_accuRegAttributes.add(meas_accuOffsetLabel);
		JLabel meas_accuRelOffsetLabel = new JLabel("Rel Offset: " + "0x4");
		meas_accuRegAttributes.add(meas_accuRelOffsetLabel);
		JLabel meas_accuDataWidth = new JLabel("Rel Offset: " + "8");
		meas_accuRegAttributes.add(meas_accuDataWidth);
		JLabel meas_accuNoShadowLabel = new JLabel("No Shadow: ");
		meas_accuRegAttributes.add(meas_accuNoShadowLabel);
		JCheckBox meas_accuNoShadowCheckBox = new JCheckBox();
		meas_accuNoShadowCheckBox.setSelected(true);

		meas_accuRegAttributes.add(meas_accuNoShadowCheckBox);
		JLabel meas_accuMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		meas_accuRegAttributes.add(meas_accuMirrorSizeLabel);
		//BitField Overview

		meas_accuBitField.setBorder(border4);
		meas_accuBitField.setLayout(new BoxLayout(meas_accuBitField, BoxLayout.Y_AXIS));
		meas_accuPanel.add(meas_accuBitField);

		JCheckBox meas_accuBitCheck = new JCheckBox("BitField Configuration");
		meas_accuBitCheck.setSelected(true);
		meas_accuBitField.add(meas_accuBitCheck);
		JCheckBox meas_accuDataInputCheck = new JCheckBox("Data Input Configuration");
		meas_accuDataInputCheck.setSelected(false);

		JPanel meas_accuBitFieldPanel = new JPanel();
		meas_accuBitField.add(meas_accuBitFieldPanel);
		meas_accuBitFieldPanel.setLayout(new BoxLayout(meas_accuBitFieldPanel, BoxLayout.X_AXIS));

		JPanel meas_accuBitInputPanel = new JPanel();
		meas_accuBitField.add(meas_accuBitInputPanel);
		meas_accuBitInputPanel.setLayout(new BoxLayout(meas_accuBitInputPanel, BoxLayout.X_AXIS));
		meas_accuBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!meas_accuBitCheck.isSelected()) {
					for (Component component : getComponents(meas_accuBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_accuDataInputCheck.setSelected(true);
					meas_accuDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_accuBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_accuDataInputCheck.setSelected(false);
					meas_accuDataInput.setEnabled(false);
				}
			}
		});

		meas_accuDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (meas_accuDataInputCheck.isSelected()) {
					for (Component component : getComponents(meas_accuBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_accuBitCheck.setSelected(false);
					meas_accuDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_accuBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_accuBitCheck.setSelected(true);
					meas_accuDataInput.setEnabled(false);
				}
			}
		});
		Action meas_accuaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = meas_accuDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] meas_accuBitPanel = new JPanel[8];
		JLabel[] meas_accuBitLabel = new JLabel[8];
		JComboBox<Integer>[] meas_accuComboBoxList = new JComboBox[8];
		name = "meas_accu";
		labelTemp = meas_accuBitLabel;
		comboboxTemp = meas_accuComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			meas_accuBitPanel[i] = new JPanel();
			meas_accuBitPanel[i].setLayout(new BoxLayout(meas_accuBitPanel[i], BoxLayout.Y_AXIS));
			meas_accuBitFieldPanel.add(meas_accuBitPanel[i]);

			meas_accuBitLabel[i] = new JLabel("  ");
			meas_accuComboBoxList[i] = new JComboBox(selection);
			meas_accuComboBoxList[i].setEnabled(false);
			meas_accuComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) meas_accuComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			meas_accuBitPanel[i].add(meas_accuBitLabel[i]);
			meas_accuBitPanel[i].add(meas_accuComboBoxList[i]);
			meas_accuBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 3; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("meas_accu" + "[" + i + "]");
		}

		meas_accuBitField.add(meas_accuDataInputCheck);
		meas_accuBitField.add(meas_accuDataInput);
		meas_accuDataInput.addActionListener(meas_accuaction);

		//final total panel
		panelTotal.add(meas_accuPanel);
		panelTotal.add(new JSeparator());

		JPanel gas_valPanel = new JPanel();
		JPanel gas_valGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel gas_valRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel gas_valBitField = new JPanel();
		JTextField gas_valDataInput = new JTextField();
		gas_valDataInput.setText("0x");
		gas_valDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "gas_val", TitledBorder.LEFT,
				TitledBorder.TOP);
		gas_valPanel.setBorder(border1);
		gas_valPanel.setLayout(new BoxLayout(gas_valPanel, BoxLayout.Y_AXIS));

		//General info part
		gas_valGeneralInfo.setBorder(border2);
		//gas_valGeneralInfo.setLayout(new BoxLayout(gas_valGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel gas_valLabel = new JLabel("Name: " + "gas_val");
		//gas_valLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, gas_valLabel.getMinimumSize().height));
		gas_valGeneralInfo.add(gas_valLabel);
		JLabel gas_valShortNameLabel = new JLabel("shortName: " + "");
		gas_valGeneralInfo.add(gas_valShortNameLabel);
		JLabel gas_valHiddenLabel = new JLabel("hidden: " + "false");
		gas_valGeneralInfo.add(gas_valHiddenLabel);
		gas_valPanel.add(gas_valGeneralInfo);
		//Register attribute part
		gas_valRegAttributes.setBorder(border3);
		//gas_valRegAttributes.setLayout(new BoxLayout(gas_valRegAttributes, BoxLayout.Y_AXIS));
		gas_valPanel.add(gas_valRegAttributes);
		JLabel gas_valOffsetLabel = new JLabel("Offset: " + "0x5");
		gas_valRegAttributes.add(gas_valOffsetLabel);
		JLabel gas_valRelOffsetLabel = new JLabel("Rel Offset: " + "0x5");
		gas_valRegAttributes.add(gas_valRelOffsetLabel);
		JLabel gas_valDataWidth = new JLabel("Rel Offset: " + "16");
		gas_valRegAttributes.add(gas_valDataWidth);
		JLabel gas_valNoShadowLabel = new JLabel("No Shadow: ");
		gas_valRegAttributes.add(gas_valNoShadowLabel);
		JCheckBox gas_valNoShadowCheckBox = new JCheckBox();
		gas_valNoShadowCheckBox.setSelected(true);

		gas_valRegAttributes.add(gas_valNoShadowCheckBox);
		JLabel gas_valMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		gas_valRegAttributes.add(gas_valMirrorSizeLabel);
		//BitField Overview

		gas_valBitField.setBorder(border4);
		gas_valBitField.setLayout(new BoxLayout(gas_valBitField, BoxLayout.Y_AXIS));
		gas_valPanel.add(gas_valBitField);

		JCheckBox gas_valBitCheck = new JCheckBox("BitField Configuration");
		gas_valBitCheck.setSelected(true);
		gas_valBitField.add(gas_valBitCheck);
		JCheckBox gas_valDataInputCheck = new JCheckBox("Data Input Configuration");
		gas_valDataInputCheck.setSelected(false);

		JPanel gas_valBitFieldPanel = new JPanel();
		gas_valBitField.add(gas_valBitFieldPanel);
		gas_valBitFieldPanel.setLayout(new BoxLayout(gas_valBitFieldPanel, BoxLayout.X_AXIS));

		JPanel gas_valBitInputPanel = new JPanel();
		gas_valBitField.add(gas_valBitInputPanel);
		gas_valBitInputPanel.setLayout(new BoxLayout(gas_valBitInputPanel, BoxLayout.X_AXIS));
		gas_valBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!gas_valBitCheck.isSelected()) {
					for (Component component : getComponents(gas_valBitFieldPanel)) {
						component.setEnabled(false);
					}
					gas_valDataInputCheck.setSelected(true);
					gas_valDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(gas_valBitFieldPanel)) {
						component.setEnabled(true);
					}
					gas_valDataInputCheck.setSelected(false);
					gas_valDataInput.setEnabled(false);
				}
			}
		});

		gas_valDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (gas_valDataInputCheck.isSelected()) {
					for (Component component : getComponents(gas_valBitFieldPanel)) {
						component.setEnabled(false);
					}
					gas_valBitCheck.setSelected(false);
					gas_valDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(gas_valBitFieldPanel)) {
						component.setEnabled(true);
					}
					gas_valBitCheck.setSelected(true);
					gas_valDataInput.setEnabled(false);
				}
			}
		});
		Action gas_valaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = gas_valDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 16)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 16) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] gas_valBitPanel = new JPanel[16];
		JLabel[] gas_valBitLabel = new JLabel[16];
		JComboBox<Integer>[] gas_valComboBoxList = new JComboBox[16];
		name = "gas_val";
		labelTemp = gas_valBitLabel;
		comboboxTemp = gas_valComboBoxList;
		dataWidth = 16;
		for (int i = 0; i < 16; i++) {
			gas_valBitPanel[i] = new JPanel();
			gas_valBitPanel[i].setLayout(new BoxLayout(gas_valBitPanel[i], BoxLayout.Y_AXIS));
			gas_valBitFieldPanel.add(gas_valBitPanel[i]);

			gas_valBitLabel[i] = new JLabel("  ");
			gas_valComboBoxList[i] = new JComboBox(selection);
			gas_valComboBoxList[i].setEnabled(false);
			gas_valComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 16; i++) {
						sendData = sendData * 2 + (int) gas_valComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			gas_valBitPanel[i].add(gas_valBitLabel[i]);
			gas_valBitPanel[i].add(gas_valComboBoxList[i]);
			gas_valBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 12; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("gas_val" + "[" + i + "]");
		}

		gas_valBitField.add(gas_valDataInputCheck);
		gas_valBitField.add(gas_valDataInput);
		gas_valDataInput.addActionListener(gas_valaction);

		//final total panel
		panelTotal.add(gas_valPanel);
		panelTotal.add(new JSeparator());

		JPanel meas_ctrlPanel = new JPanel();
		JPanel meas_ctrlGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel meas_ctrlRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel meas_ctrlBitField = new JPanel();
		JTextField meas_ctrlDataInput = new JTextField();
		meas_ctrlDataInput.setText("0x");
		meas_ctrlDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "meas_ctrl", TitledBorder.LEFT,
				TitledBorder.TOP);
		meas_ctrlPanel.setBorder(border1);
		meas_ctrlPanel.setLayout(new BoxLayout(meas_ctrlPanel, BoxLayout.Y_AXIS));

		//General info part
		meas_ctrlGeneralInfo.setBorder(border2);
		//meas_ctrlGeneralInfo.setLayout(new BoxLayout(meas_ctrlGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel meas_ctrlLabel = new JLabel("Name: " + "meas_ctrl");
		//meas_ctrlLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, meas_ctrlLabel.getMinimumSize().height));
		meas_ctrlGeneralInfo.add(meas_ctrlLabel);
		JLabel meas_ctrlShortNameLabel = new JLabel("shortName: " + "");
		meas_ctrlGeneralInfo.add(meas_ctrlShortNameLabel);
		JLabel meas_ctrlHiddenLabel = new JLabel("hidden: " + "false");
		meas_ctrlGeneralInfo.add(meas_ctrlHiddenLabel);
		meas_ctrlPanel.add(meas_ctrlGeneralInfo);
		//Register attribute part
		meas_ctrlRegAttributes.setBorder(border3);
		//meas_ctrlRegAttributes.setLayout(new BoxLayout(meas_ctrlRegAttributes, BoxLayout.Y_AXIS));
		meas_ctrlPanel.add(meas_ctrlRegAttributes);
		JLabel meas_ctrlOffsetLabel = new JLabel("Offset: " + "0x7");
		meas_ctrlRegAttributes.add(meas_ctrlOffsetLabel);
		JLabel meas_ctrlRelOffsetLabel = new JLabel("Rel Offset: " + "0x7");
		meas_ctrlRegAttributes.add(meas_ctrlRelOffsetLabel);
		JLabel meas_ctrlDataWidth = new JLabel("Rel Offset: " + "8");
		meas_ctrlRegAttributes.add(meas_ctrlDataWidth);
		JLabel meas_ctrlNoShadowLabel = new JLabel("No Shadow: ");
		meas_ctrlRegAttributes.add(meas_ctrlNoShadowLabel);
		JCheckBox meas_ctrlNoShadowCheckBox = new JCheckBox();
		meas_ctrlNoShadowCheckBox.setSelected(true);

		meas_ctrlRegAttributes.add(meas_ctrlNoShadowCheckBox);
		JLabel meas_ctrlMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		meas_ctrlRegAttributes.add(meas_ctrlMirrorSizeLabel);
		//BitField Overview

		meas_ctrlBitField.setBorder(border4);
		meas_ctrlBitField.setLayout(new BoxLayout(meas_ctrlBitField, BoxLayout.Y_AXIS));
		meas_ctrlPanel.add(meas_ctrlBitField);

		JCheckBox meas_ctrlBitCheck = new JCheckBox("BitField Configuration");
		meas_ctrlBitCheck.setSelected(true);
		meas_ctrlBitField.add(meas_ctrlBitCheck);
		JCheckBox meas_ctrlDataInputCheck = new JCheckBox("Data Input Configuration");
		meas_ctrlDataInputCheck.setSelected(false);

		JPanel meas_ctrlBitFieldPanel = new JPanel();
		meas_ctrlBitField.add(meas_ctrlBitFieldPanel);
		meas_ctrlBitFieldPanel.setLayout(new BoxLayout(meas_ctrlBitFieldPanel, BoxLayout.X_AXIS));

		JPanel meas_ctrlBitInputPanel = new JPanel();
		meas_ctrlBitField.add(meas_ctrlBitInputPanel);
		meas_ctrlBitInputPanel.setLayout(new BoxLayout(meas_ctrlBitInputPanel, BoxLayout.X_AXIS));
		meas_ctrlBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!meas_ctrlBitCheck.isSelected()) {
					for (Component component : getComponents(meas_ctrlBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_ctrlDataInputCheck.setSelected(true);
					meas_ctrlDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_ctrlBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_ctrlDataInputCheck.setSelected(false);
					meas_ctrlDataInput.setEnabled(false);
				}
			}
		});

		meas_ctrlDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (meas_ctrlDataInputCheck.isSelected()) {
					for (Component component : getComponents(meas_ctrlBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_ctrlBitCheck.setSelected(false);
					meas_ctrlDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_ctrlBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_ctrlBitCheck.setSelected(true);
					meas_ctrlDataInput.setEnabled(false);
				}
			}
		});
		Action meas_ctrlaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = meas_ctrlDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] meas_ctrlBitPanel = new JPanel[8];
		JLabel[] meas_ctrlBitLabel = new JLabel[8];
		JComboBox<Integer>[] meas_ctrlComboBoxList = new JComboBox[8];
		name = "meas_ctrl";
		labelTemp = meas_ctrlBitLabel;
		comboboxTemp = meas_ctrlComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			meas_ctrlBitPanel[i] = new JPanel();
			meas_ctrlBitPanel[i].setLayout(new BoxLayout(meas_ctrlBitPanel[i], BoxLayout.Y_AXIS));
			meas_ctrlBitFieldPanel.add(meas_ctrlBitPanel[i]);

			meas_ctrlBitLabel[i] = new JLabel("  ");
			meas_ctrlComboBoxList[i] = new JComboBox(selection);
			meas_ctrlComboBoxList[i].setEnabled(false);
			meas_ctrlComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) meas_ctrlComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			meas_ctrlBitPanel[i].add(meas_ctrlBitLabel[i]);
			meas_ctrlBitPanel[i].add(meas_ctrlComboBoxList[i]);
			meas_ctrlBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 1; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("meas_run" + "[" + i + "]");
		}

		for (int index = dataWidth - 1 - 1, i = 0; i < 1; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("meas_cont" + "[" + i + "]");
		}

		meas_ctrlBitField.add(meas_ctrlDataInputCheck);
		meas_ctrlBitField.add(meas_ctrlDataInput);
		meas_ctrlDataInput.addActionListener(meas_ctrlaction);

		//final total panel
		panelTotal.add(meas_ctrlPanel);
		panelTotal.add(new JSeparator());

		JPanel meas_perPanel = new JPanel();
		JPanel meas_perGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel meas_perRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel meas_perBitField = new JPanel();
		JTextField meas_perDataInput = new JTextField();
		meas_perDataInput.setText("0x");
		meas_perDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "meas_per", TitledBorder.LEFT,
				TitledBorder.TOP);
		meas_perPanel.setBorder(border1);
		meas_perPanel.setLayout(new BoxLayout(meas_perPanel, BoxLayout.Y_AXIS));

		//General info part
		meas_perGeneralInfo.setBorder(border2);
		//meas_perGeneralInfo.setLayout(new BoxLayout(meas_perGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel meas_perLabel = new JLabel("Name: " + "meas_per");
		//meas_perLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, meas_perLabel.getMinimumSize().height));
		meas_perGeneralInfo.add(meas_perLabel);
		JLabel meas_perShortNameLabel = new JLabel("shortName: " + "");
		meas_perGeneralInfo.add(meas_perShortNameLabel);
		JLabel meas_perHiddenLabel = new JLabel("hidden: " + "false");
		meas_perGeneralInfo.add(meas_perHiddenLabel);
		meas_perPanel.add(meas_perGeneralInfo);
		//Register attribute part
		meas_perRegAttributes.setBorder(border3);
		//meas_perRegAttributes.setLayout(new BoxLayout(meas_perRegAttributes, BoxLayout.Y_AXIS));
		meas_perPanel.add(meas_perRegAttributes);
		JLabel meas_perOffsetLabel = new JLabel("Offset: " + "0x8");
		meas_perRegAttributes.add(meas_perOffsetLabel);
		JLabel meas_perRelOffsetLabel = new JLabel("Rel Offset: " + "0x8");
		meas_perRegAttributes.add(meas_perRelOffsetLabel);
		JLabel meas_perDataWidth = new JLabel("Rel Offset: " + "8");
		meas_perRegAttributes.add(meas_perDataWidth);
		JLabel meas_perNoShadowLabel = new JLabel("No Shadow: ");
		meas_perRegAttributes.add(meas_perNoShadowLabel);
		JCheckBox meas_perNoShadowCheckBox = new JCheckBox();
		meas_perNoShadowCheckBox.setSelected(true);

		meas_perRegAttributes.add(meas_perNoShadowCheckBox);
		JLabel meas_perMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		meas_perRegAttributes.add(meas_perMirrorSizeLabel);
		//BitField Overview

		meas_perBitField.setBorder(border4);
		meas_perBitField.setLayout(new BoxLayout(meas_perBitField, BoxLayout.Y_AXIS));
		meas_perPanel.add(meas_perBitField);

		JCheckBox meas_perBitCheck = new JCheckBox("BitField Configuration");
		meas_perBitCheck.setSelected(true);
		meas_perBitField.add(meas_perBitCheck);
		JCheckBox meas_perDataInputCheck = new JCheckBox("Data Input Configuration");
		meas_perDataInputCheck.setSelected(false);

		JPanel meas_perBitFieldPanel = new JPanel();
		meas_perBitField.add(meas_perBitFieldPanel);
		meas_perBitFieldPanel.setLayout(new BoxLayout(meas_perBitFieldPanel, BoxLayout.X_AXIS));

		JPanel meas_perBitInputPanel = new JPanel();
		meas_perBitField.add(meas_perBitInputPanel);
		meas_perBitInputPanel.setLayout(new BoxLayout(meas_perBitInputPanel, BoxLayout.X_AXIS));
		meas_perBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!meas_perBitCheck.isSelected()) {
					for (Component component : getComponents(meas_perBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_perDataInputCheck.setSelected(true);
					meas_perDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_perBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_perDataInputCheck.setSelected(false);
					meas_perDataInput.setEnabled(false);
				}
			}
		});

		meas_perDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (meas_perDataInputCheck.isSelected()) {
					for (Component component : getComponents(meas_perBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_perBitCheck.setSelected(false);
					meas_perDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_perBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_perBitCheck.setSelected(true);
					meas_perDataInput.setEnabled(false);
				}
			}
		});
		Action meas_peraction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = meas_perDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] meas_perBitPanel = new JPanel[8];
		JLabel[] meas_perBitLabel = new JLabel[8];
		JComboBox<Integer>[] meas_perComboBoxList = new JComboBox[8];
		name = "meas_per";
		labelTemp = meas_perBitLabel;
		comboboxTemp = meas_perComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			meas_perBitPanel[i] = new JPanel();
			meas_perBitPanel[i].setLayout(new BoxLayout(meas_perBitPanel[i], BoxLayout.Y_AXIS));
			meas_perBitFieldPanel.add(meas_perBitPanel[i]);

			meas_perBitLabel[i] = new JLabel("  ");
			meas_perComboBoxList[i] = new JComboBox(selection);
			meas_perComboBoxList[i].setEnabled(false);
			meas_perComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) meas_perComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			meas_perBitPanel[i].add(meas_perBitLabel[i]);
			meas_perBitPanel[i].add(meas_perComboBoxList[i]);
			meas_perBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 8; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("meas_per" + "[" + i + "]");
		}

		meas_perBitField.add(meas_perDataInputCheck);
		meas_perBitField.add(meas_perDataInput);
		meas_perDataInput.addActionListener(meas_peraction);

		//final total panel
		panelTotal.add(meas_perPanel);
		panelTotal.add(new JSeparator());

		JPanel meas_modePanel = new JPanel();
		JPanel meas_modeGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel meas_modeRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel meas_modeBitField = new JPanel();
		JTextField meas_modeDataInput = new JTextField();
		meas_modeDataInput.setText("0x");
		meas_modeDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "meas_mode", TitledBorder.LEFT,
				TitledBorder.TOP);
		meas_modePanel.setBorder(border1);
		meas_modePanel.setLayout(new BoxLayout(meas_modePanel, BoxLayout.Y_AXIS));

		//General info part
		meas_modeGeneralInfo.setBorder(border2);
		//meas_modeGeneralInfo.setLayout(new BoxLayout(meas_modeGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel meas_modeLabel = new JLabel("Name: " + "meas_mode");
		//meas_modeLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, meas_modeLabel.getMinimumSize().height));
		meas_modeGeneralInfo.add(meas_modeLabel);
		JLabel meas_modeShortNameLabel = new JLabel("shortName: " + "");
		meas_modeGeneralInfo.add(meas_modeShortNameLabel);
		JLabel meas_modeHiddenLabel = new JLabel("hidden: " + "false");
		meas_modeGeneralInfo.add(meas_modeHiddenLabel);
		meas_modePanel.add(meas_modeGeneralInfo);
		//Register attribute part
		meas_modeRegAttributes.setBorder(border3);
		//meas_modeRegAttributes.setLayout(new BoxLayout(meas_modeRegAttributes, BoxLayout.Y_AXIS));
		meas_modePanel.add(meas_modeRegAttributes);
		JLabel meas_modeOffsetLabel = new JLabel("Offset: " + "0x9");
		meas_modeRegAttributes.add(meas_modeOffsetLabel);
		JLabel meas_modeRelOffsetLabel = new JLabel("Rel Offset: " + "0x9");
		meas_modeRegAttributes.add(meas_modeRelOffsetLabel);
		JLabel meas_modeDataWidth = new JLabel("Rel Offset: " + "8");
		meas_modeRegAttributes.add(meas_modeDataWidth);
		JLabel meas_modeNoShadowLabel = new JLabel("No Shadow: ");
		meas_modeRegAttributes.add(meas_modeNoShadowLabel);
		JCheckBox meas_modeNoShadowCheckBox = new JCheckBox();
		meas_modeNoShadowCheckBox.setSelected(true);

		meas_modeRegAttributes.add(meas_modeNoShadowCheckBox);
		JLabel meas_modeMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		meas_modeRegAttributes.add(meas_modeMirrorSizeLabel);
		//BitField Overview

		meas_modeBitField.setBorder(border4);
		meas_modeBitField.setLayout(new BoxLayout(meas_modeBitField, BoxLayout.Y_AXIS));
		meas_modePanel.add(meas_modeBitField);

		JCheckBox meas_modeBitCheck = new JCheckBox("BitField Configuration");
		meas_modeBitCheck.setSelected(true);
		meas_modeBitField.add(meas_modeBitCheck);
		JCheckBox meas_modeDataInputCheck = new JCheckBox("Data Input Configuration");
		meas_modeDataInputCheck.setSelected(false);

		JPanel meas_modeBitFieldPanel = new JPanel();
		meas_modeBitField.add(meas_modeBitFieldPanel);
		meas_modeBitFieldPanel.setLayout(new BoxLayout(meas_modeBitFieldPanel, BoxLayout.X_AXIS));

		JPanel meas_modeBitInputPanel = new JPanel();
		meas_modeBitField.add(meas_modeBitInputPanel);
		meas_modeBitInputPanel.setLayout(new BoxLayout(meas_modeBitInputPanel, BoxLayout.X_AXIS));
		meas_modeBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!meas_modeBitCheck.isSelected()) {
					for (Component component : getComponents(meas_modeBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_modeDataInputCheck.setSelected(true);
					meas_modeDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_modeBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_modeDataInputCheck.setSelected(false);
					meas_modeDataInput.setEnabled(false);
				}
			}
		});

		meas_modeDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (meas_modeDataInputCheck.isSelected()) {
					for (Component component : getComponents(meas_modeBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_modeBitCheck.setSelected(false);
					meas_modeDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_modeBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_modeBitCheck.setSelected(true);
					meas_modeDataInput.setEnabled(false);
				}
			}
		});
		Action meas_modeaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = meas_modeDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] meas_modeBitPanel = new JPanel[8];
		JLabel[] meas_modeBitLabel = new JLabel[8];
		JComboBox<Integer>[] meas_modeComboBoxList = new JComboBox[8];
		name = "meas_mode";
		labelTemp = meas_modeBitLabel;
		comboboxTemp = meas_modeComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			meas_modeBitPanel[i] = new JPanel();
			meas_modeBitPanel[i].setLayout(new BoxLayout(meas_modeBitPanel[i], BoxLayout.Y_AXIS));
			meas_modeBitFieldPanel.add(meas_modeBitPanel[i]);

			meas_modeBitLabel[i] = new JLabel("  ");
			meas_modeComboBoxList[i] = new JComboBox(selection);
			meas_modeComboBoxList[i].setEnabled(false);
			meas_modeComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) meas_modeComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			meas_modeBitPanel[i].add(meas_modeBitLabel[i]);
			meas_modeBitPanel[i].add(meas_modeComboBoxList[i]);
			meas_modeBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 2; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("meas_mode" + "[" + i + "]");
		}

		meas_modeBitField.add(meas_modeDataInputCheck);
		meas_modeBitField.add(meas_modeDataInput);
		meas_modeDataInput.addActionListener(meas_modeaction);

		//final total panel
		panelTotal.add(meas_modePanel);
		panelTotal.add(new JSeparator());

		JPanel meas_smpl_stsPanel = new JPanel();
		JPanel meas_smpl_stsGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel meas_smpl_stsRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel meas_smpl_stsBitField = new JPanel();
		JTextField meas_smpl_stsDataInput = new JTextField();
		meas_smpl_stsDataInput.setText("0x");
		meas_smpl_stsDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "meas_smpl_sts", TitledBorder.LEFT,
				TitledBorder.TOP);
		meas_smpl_stsPanel.setBorder(border1);
		meas_smpl_stsPanel.setLayout(new BoxLayout(meas_smpl_stsPanel, BoxLayout.Y_AXIS));

		//General info part
		meas_smpl_stsGeneralInfo.setBorder(border2);
		//meas_smpl_stsGeneralInfo.setLayout(new BoxLayout(meas_smpl_stsGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel meas_smpl_stsLabel = new JLabel("Name: " + "meas_smpl_sts");
		//meas_smpl_stsLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, meas_smpl_stsLabel.getMinimumSize().height));
		meas_smpl_stsGeneralInfo.add(meas_smpl_stsLabel);
		JLabel meas_smpl_stsShortNameLabel = new JLabel("shortName: " + "");
		meas_smpl_stsGeneralInfo.add(meas_smpl_stsShortNameLabel);
		JLabel meas_smpl_stsHiddenLabel = new JLabel("hidden: " + "false");
		meas_smpl_stsGeneralInfo.add(meas_smpl_stsHiddenLabel);
		meas_smpl_stsPanel.add(meas_smpl_stsGeneralInfo);
		//Register attribute part
		meas_smpl_stsRegAttributes.setBorder(border3);
		//meas_smpl_stsRegAttributes.setLayout(new BoxLayout(meas_smpl_stsRegAttributes, BoxLayout.Y_AXIS));
		meas_smpl_stsPanel.add(meas_smpl_stsRegAttributes);
		JLabel meas_smpl_stsOffsetLabel = new JLabel("Offset: " + "0xa");
		meas_smpl_stsRegAttributes.add(meas_smpl_stsOffsetLabel);
		JLabel meas_smpl_stsRelOffsetLabel = new JLabel("Rel Offset: " + "0xa");
		meas_smpl_stsRegAttributes.add(meas_smpl_stsRelOffsetLabel);
		JLabel meas_smpl_stsDataWidth = new JLabel("Rel Offset: " + "8");
		meas_smpl_stsRegAttributes.add(meas_smpl_stsDataWidth);
		JLabel meas_smpl_stsNoShadowLabel = new JLabel("No Shadow: ");
		meas_smpl_stsRegAttributes.add(meas_smpl_stsNoShadowLabel);
		JCheckBox meas_smpl_stsNoShadowCheckBox = new JCheckBox();
		meas_smpl_stsNoShadowCheckBox.setSelected(true);

		meas_smpl_stsRegAttributes.add(meas_smpl_stsNoShadowCheckBox);
		JLabel meas_smpl_stsMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		meas_smpl_stsRegAttributes.add(meas_smpl_stsMirrorSizeLabel);
		//BitField Overview

		meas_smpl_stsBitField.setBorder(border4);
		meas_smpl_stsBitField.setLayout(new BoxLayout(meas_smpl_stsBitField, BoxLayout.Y_AXIS));
		meas_smpl_stsPanel.add(meas_smpl_stsBitField);

		JCheckBox meas_smpl_stsBitCheck = new JCheckBox("BitField Configuration");
		meas_smpl_stsBitCheck.setSelected(true);
		meas_smpl_stsBitField.add(meas_smpl_stsBitCheck);
		JCheckBox meas_smpl_stsDataInputCheck = new JCheckBox("Data Input Configuration");
		meas_smpl_stsDataInputCheck.setSelected(false);

		JPanel meas_smpl_stsBitFieldPanel = new JPanel();
		meas_smpl_stsBitField.add(meas_smpl_stsBitFieldPanel);
		meas_smpl_stsBitFieldPanel.setLayout(new BoxLayout(meas_smpl_stsBitFieldPanel, BoxLayout.X_AXIS));

		JPanel meas_smpl_stsBitInputPanel = new JPanel();
		meas_smpl_stsBitField.add(meas_smpl_stsBitInputPanel);
		meas_smpl_stsBitInputPanel.setLayout(new BoxLayout(meas_smpl_stsBitInputPanel, BoxLayout.X_AXIS));
		meas_smpl_stsBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!meas_smpl_stsBitCheck.isSelected()) {
					for (Component component : getComponents(meas_smpl_stsBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_smpl_stsDataInputCheck.setSelected(true);
					meas_smpl_stsDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_smpl_stsBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_smpl_stsDataInputCheck.setSelected(false);
					meas_smpl_stsDataInput.setEnabled(false);
				}
			}
		});

		meas_smpl_stsDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (meas_smpl_stsDataInputCheck.isSelected()) {
					for (Component component : getComponents(meas_smpl_stsBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_smpl_stsBitCheck.setSelected(false);
					meas_smpl_stsDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_smpl_stsBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_smpl_stsBitCheck.setSelected(true);
					meas_smpl_stsDataInput.setEnabled(false);
				}
			}
		});
		Action meas_smpl_stsaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = meas_smpl_stsDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] meas_smpl_stsBitPanel = new JPanel[8];
		JLabel[] meas_smpl_stsBitLabel = new JLabel[8];
		JComboBox<Integer>[] meas_smpl_stsComboBoxList = new JComboBox[8];
		name = "meas_smpl_sts";
		labelTemp = meas_smpl_stsBitLabel;
		comboboxTemp = meas_smpl_stsComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			meas_smpl_stsBitPanel[i] = new JPanel();
			meas_smpl_stsBitPanel[i].setLayout(new BoxLayout(meas_smpl_stsBitPanel[i], BoxLayout.Y_AXIS));
			meas_smpl_stsBitFieldPanel.add(meas_smpl_stsBitPanel[i]);

			meas_smpl_stsBitLabel[i] = new JLabel("  ");
			meas_smpl_stsComboBoxList[i] = new JComboBox(selection);
			meas_smpl_stsComboBoxList[i].setEnabled(false);
			meas_smpl_stsComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) meas_smpl_stsComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			meas_smpl_stsBitPanel[i].add(meas_smpl_stsBitLabel[i]);
			meas_smpl_stsBitPanel[i].add(meas_smpl_stsComboBoxList[i]);
			meas_smpl_stsBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 6; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("meas_smpl_sts" + "[" + i + "]");
		}

		meas_smpl_stsBitField.add(meas_smpl_stsDataInputCheck);
		meas_smpl_stsBitField.add(meas_smpl_stsDataInput);
		meas_smpl_stsDataInput.addActionListener(meas_smpl_stsaction);

		//final total panel
		panelTotal.add(meas_smpl_stsPanel);
		panelTotal.add(new JSeparator());

		JPanel meas_accu_stsPanel = new JPanel();
		JPanel meas_accu_stsGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel meas_accu_stsRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel meas_accu_stsBitField = new JPanel();
		JTextField meas_accu_stsDataInput = new JTextField();
		meas_accu_stsDataInput.setText("0x");
		meas_accu_stsDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "meas_accu_sts", TitledBorder.LEFT,
				TitledBorder.TOP);
		meas_accu_stsPanel.setBorder(border1);
		meas_accu_stsPanel.setLayout(new BoxLayout(meas_accu_stsPanel, BoxLayout.Y_AXIS));

		//General info part
		meas_accu_stsGeneralInfo.setBorder(border2);
		//meas_accu_stsGeneralInfo.setLayout(new BoxLayout(meas_accu_stsGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel meas_accu_stsLabel = new JLabel("Name: " + "meas_accu_sts");
		//meas_accu_stsLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, meas_accu_stsLabel.getMinimumSize().height));
		meas_accu_stsGeneralInfo.add(meas_accu_stsLabel);
		JLabel meas_accu_stsShortNameLabel = new JLabel("shortName: " + "");
		meas_accu_stsGeneralInfo.add(meas_accu_stsShortNameLabel);
		JLabel meas_accu_stsHiddenLabel = new JLabel("hidden: " + "false");
		meas_accu_stsGeneralInfo.add(meas_accu_stsHiddenLabel);
		meas_accu_stsPanel.add(meas_accu_stsGeneralInfo);
		//Register attribute part
		meas_accu_stsRegAttributes.setBorder(border3);
		//meas_accu_stsRegAttributes.setLayout(new BoxLayout(meas_accu_stsRegAttributes, BoxLayout.Y_AXIS));
		meas_accu_stsPanel.add(meas_accu_stsRegAttributes);
		JLabel meas_accu_stsOffsetLabel = new JLabel("Offset: " + "0xb");
		meas_accu_stsRegAttributes.add(meas_accu_stsOffsetLabel);
		JLabel meas_accu_stsRelOffsetLabel = new JLabel("Rel Offset: " + "0xb");
		meas_accu_stsRegAttributes.add(meas_accu_stsRelOffsetLabel);
		JLabel meas_accu_stsDataWidth = new JLabel("Rel Offset: " + "8");
		meas_accu_stsRegAttributes.add(meas_accu_stsDataWidth);
		JLabel meas_accu_stsNoShadowLabel = new JLabel("No Shadow: ");
		meas_accu_stsRegAttributes.add(meas_accu_stsNoShadowLabel);
		JCheckBox meas_accu_stsNoShadowCheckBox = new JCheckBox();
		meas_accu_stsNoShadowCheckBox.setSelected(true);

		meas_accu_stsRegAttributes.add(meas_accu_stsNoShadowCheckBox);
		JLabel meas_accu_stsMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		meas_accu_stsRegAttributes.add(meas_accu_stsMirrorSizeLabel);
		//BitField Overview

		meas_accu_stsBitField.setBorder(border4);
		meas_accu_stsBitField.setLayout(new BoxLayout(meas_accu_stsBitField, BoxLayout.Y_AXIS));
		meas_accu_stsPanel.add(meas_accu_stsBitField);

		JCheckBox meas_accu_stsBitCheck = new JCheckBox("BitField Configuration");
		meas_accu_stsBitCheck.setSelected(true);
		meas_accu_stsBitField.add(meas_accu_stsBitCheck);
		JCheckBox meas_accu_stsDataInputCheck = new JCheckBox("Data Input Configuration");
		meas_accu_stsDataInputCheck.setSelected(false);

		JPanel meas_accu_stsBitFieldPanel = new JPanel();
		meas_accu_stsBitField.add(meas_accu_stsBitFieldPanel);
		meas_accu_stsBitFieldPanel.setLayout(new BoxLayout(meas_accu_stsBitFieldPanel, BoxLayout.X_AXIS));

		JPanel meas_accu_stsBitInputPanel = new JPanel();
		meas_accu_stsBitField.add(meas_accu_stsBitInputPanel);
		meas_accu_stsBitInputPanel.setLayout(new BoxLayout(meas_accu_stsBitInputPanel, BoxLayout.X_AXIS));
		meas_accu_stsBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!meas_accu_stsBitCheck.isSelected()) {
					for (Component component : getComponents(meas_accu_stsBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_accu_stsDataInputCheck.setSelected(true);
					meas_accu_stsDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_accu_stsBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_accu_stsDataInputCheck.setSelected(false);
					meas_accu_stsDataInput.setEnabled(false);
				}
			}
		});

		meas_accu_stsDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (meas_accu_stsDataInputCheck.isSelected()) {
					for (Component component : getComponents(meas_accu_stsBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_accu_stsBitCheck.setSelected(false);
					meas_accu_stsDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_accu_stsBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_accu_stsBitCheck.setSelected(true);
					meas_accu_stsDataInput.setEnabled(false);
				}
			}
		});
		Action meas_accu_stsaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = meas_accu_stsDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] meas_accu_stsBitPanel = new JPanel[8];
		JLabel[] meas_accu_stsBitLabel = new JLabel[8];
		JComboBox<Integer>[] meas_accu_stsComboBoxList = new JComboBox[8];
		name = "meas_accu_sts";
		labelTemp = meas_accu_stsBitLabel;
		comboboxTemp = meas_accu_stsComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			meas_accu_stsBitPanel[i] = new JPanel();
			meas_accu_stsBitPanel[i].setLayout(new BoxLayout(meas_accu_stsBitPanel[i], BoxLayout.Y_AXIS));
			meas_accu_stsBitFieldPanel.add(meas_accu_stsBitPanel[i]);

			meas_accu_stsBitLabel[i] = new JLabel("  ");
			meas_accu_stsComboBoxList[i] = new JComboBox(selection);
			meas_accu_stsComboBoxList[i].setEnabled(false);
			meas_accu_stsComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) meas_accu_stsComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			meas_accu_stsBitPanel[i].add(meas_accu_stsBitLabel[i]);
			meas_accu_stsBitPanel[i].add(meas_accu_stsComboBoxList[i]);
			meas_accu_stsBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 6; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("meas_accu_sts" + "[" + i + "]");
		}

		meas_accu_stsBitField.add(meas_accu_stsDataInputCheck);
		meas_accu_stsBitField.add(meas_accu_stsDataInput);
		meas_accu_stsDataInput.addActionListener(meas_accu_stsaction);

		//final total panel
		panelTotal.add(meas_accu_stsPanel);
		panelTotal.add(new JSeparator());

		JPanel meas_ofsPanel = new JPanel();
		JPanel meas_ofsGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel meas_ofsRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel meas_ofsBitField = new JPanel();
		JTextField meas_ofsDataInput = new JTextField();
		meas_ofsDataInput.setText("0x");
		meas_ofsDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "meas_ofs", TitledBorder.LEFT,
				TitledBorder.TOP);
		meas_ofsPanel.setBorder(border1);
		meas_ofsPanel.setLayout(new BoxLayout(meas_ofsPanel, BoxLayout.Y_AXIS));

		//General info part
		meas_ofsGeneralInfo.setBorder(border2);
		//meas_ofsGeneralInfo.setLayout(new BoxLayout(meas_ofsGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel meas_ofsLabel = new JLabel("Name: " + "meas_ofs");
		//meas_ofsLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, meas_ofsLabel.getMinimumSize().height));
		meas_ofsGeneralInfo.add(meas_ofsLabel);
		JLabel meas_ofsShortNameLabel = new JLabel("shortName: " + "");
		meas_ofsGeneralInfo.add(meas_ofsShortNameLabel);
		JLabel meas_ofsHiddenLabel = new JLabel("hidden: " + "false");
		meas_ofsGeneralInfo.add(meas_ofsHiddenLabel);
		meas_ofsPanel.add(meas_ofsGeneralInfo);
		//Register attribute part
		meas_ofsRegAttributes.setBorder(border3);
		//meas_ofsRegAttributes.setLayout(new BoxLayout(meas_ofsRegAttributes, BoxLayout.Y_AXIS));
		meas_ofsPanel.add(meas_ofsRegAttributes);
		JLabel meas_ofsOffsetLabel = new JLabel("Offset: " + "0xc");
		meas_ofsRegAttributes.add(meas_ofsOffsetLabel);
		JLabel meas_ofsRelOffsetLabel = new JLabel("Rel Offset: " + "0xc");
		meas_ofsRegAttributes.add(meas_ofsRelOffsetLabel);
		JLabel meas_ofsDataWidth = new JLabel("Rel Offset: " + "8");
		meas_ofsRegAttributes.add(meas_ofsDataWidth);
		JLabel meas_ofsNoShadowLabel = new JLabel("No Shadow: ");
		meas_ofsRegAttributes.add(meas_ofsNoShadowLabel);
		JCheckBox meas_ofsNoShadowCheckBox = new JCheckBox();
		meas_ofsNoShadowCheckBox.setSelected(true);

		meas_ofsRegAttributes.add(meas_ofsNoShadowCheckBox);
		JLabel meas_ofsMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		meas_ofsRegAttributes.add(meas_ofsMirrorSizeLabel);
		//BitField Overview

		meas_ofsBitField.setBorder(border4);
		meas_ofsBitField.setLayout(new BoxLayout(meas_ofsBitField, BoxLayout.Y_AXIS));
		meas_ofsPanel.add(meas_ofsBitField);

		JCheckBox meas_ofsBitCheck = new JCheckBox("BitField Configuration");
		meas_ofsBitCheck.setSelected(true);
		meas_ofsBitField.add(meas_ofsBitCheck);
		JCheckBox meas_ofsDataInputCheck = new JCheckBox("Data Input Configuration");
		meas_ofsDataInputCheck.setSelected(false);

		JPanel meas_ofsBitFieldPanel = new JPanel();
		meas_ofsBitField.add(meas_ofsBitFieldPanel);
		meas_ofsBitFieldPanel.setLayout(new BoxLayout(meas_ofsBitFieldPanel, BoxLayout.X_AXIS));

		JPanel meas_ofsBitInputPanel = new JPanel();
		meas_ofsBitField.add(meas_ofsBitInputPanel);
		meas_ofsBitInputPanel.setLayout(new BoxLayout(meas_ofsBitInputPanel, BoxLayout.X_AXIS));
		meas_ofsBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!meas_ofsBitCheck.isSelected()) {
					for (Component component : getComponents(meas_ofsBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_ofsDataInputCheck.setSelected(true);
					meas_ofsDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_ofsBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_ofsDataInputCheck.setSelected(false);
					meas_ofsDataInput.setEnabled(false);
				}
			}
		});

		meas_ofsDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (meas_ofsDataInputCheck.isSelected()) {
					for (Component component : getComponents(meas_ofsBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_ofsBitCheck.setSelected(false);
					meas_ofsDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_ofsBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_ofsBitCheck.setSelected(true);
					meas_ofsDataInput.setEnabled(false);
				}
			}
		});
		Action meas_ofsaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = meas_ofsDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] meas_ofsBitPanel = new JPanel[8];
		JLabel[] meas_ofsBitLabel = new JLabel[8];
		JComboBox<Integer>[] meas_ofsComboBoxList = new JComboBox[8];
		name = "meas_ofs";
		labelTemp = meas_ofsBitLabel;
		comboboxTemp = meas_ofsComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			meas_ofsBitPanel[i] = new JPanel();
			meas_ofsBitPanel[i].setLayout(new BoxLayout(meas_ofsBitPanel[i], BoxLayout.Y_AXIS));
			meas_ofsBitFieldPanel.add(meas_ofsBitPanel[i]);

			meas_ofsBitLabel[i] = new JLabel("  ");
			meas_ofsComboBoxList[i] = new JComboBox(selection);
			meas_ofsComboBoxList[i].setEnabled(false);
			meas_ofsComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) meas_ofsComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			meas_ofsBitPanel[i].add(meas_ofsBitLabel[i]);
			meas_ofsBitPanel[i].add(meas_ofsComboBoxList[i]);
			meas_ofsBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 8; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("meas_ofs" + "[" + i + "]");
		}

		meas_ofsBitField.add(meas_ofsDataInputCheck);
		meas_ofsBitField.add(meas_ofsDataInput);
		meas_ofsDataInput.addActionListener(meas_ofsaction);

		//final total panel
		panelTotal.add(meas_ofsPanel);
		panelTotal.add(new JSeparator());

		JPanel meas_gainPanel = new JPanel();
		JPanel meas_gainGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel meas_gainRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel meas_gainBitField = new JPanel();
		JTextField meas_gainDataInput = new JTextField();
		meas_gainDataInput.setText("0x");
		meas_gainDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "meas_gain", TitledBorder.LEFT,
				TitledBorder.TOP);
		meas_gainPanel.setBorder(border1);
		meas_gainPanel.setLayout(new BoxLayout(meas_gainPanel, BoxLayout.Y_AXIS));

		//General info part
		meas_gainGeneralInfo.setBorder(border2);
		//meas_gainGeneralInfo.setLayout(new BoxLayout(meas_gainGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel meas_gainLabel = new JLabel("Name: " + "meas_gain");
		//meas_gainLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, meas_gainLabel.getMinimumSize().height));
		meas_gainGeneralInfo.add(meas_gainLabel);
		JLabel meas_gainShortNameLabel = new JLabel("shortName: " + "");
		meas_gainGeneralInfo.add(meas_gainShortNameLabel);
		JLabel meas_gainHiddenLabel = new JLabel("hidden: " + "false");
		meas_gainGeneralInfo.add(meas_gainHiddenLabel);
		meas_gainPanel.add(meas_gainGeneralInfo);
		//Register attribute part
		meas_gainRegAttributes.setBorder(border3);
		//meas_gainRegAttributes.setLayout(new BoxLayout(meas_gainRegAttributes, BoxLayout.Y_AXIS));
		meas_gainPanel.add(meas_gainRegAttributes);
		JLabel meas_gainOffsetLabel = new JLabel("Offset: " + "0xd");
		meas_gainRegAttributes.add(meas_gainOffsetLabel);
		JLabel meas_gainRelOffsetLabel = new JLabel("Rel Offset: " + "0xd");
		meas_gainRegAttributes.add(meas_gainRelOffsetLabel);
		JLabel meas_gainDataWidth = new JLabel("Rel Offset: " + "8");
		meas_gainRegAttributes.add(meas_gainDataWidth);
		JLabel meas_gainNoShadowLabel = new JLabel("No Shadow: ");
		meas_gainRegAttributes.add(meas_gainNoShadowLabel);
		JCheckBox meas_gainNoShadowCheckBox = new JCheckBox();
		meas_gainNoShadowCheckBox.setSelected(true);

		meas_gainRegAttributes.add(meas_gainNoShadowCheckBox);
		JLabel meas_gainMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		meas_gainRegAttributes.add(meas_gainMirrorSizeLabel);
		//BitField Overview

		meas_gainBitField.setBorder(border4);
		meas_gainBitField.setLayout(new BoxLayout(meas_gainBitField, BoxLayout.Y_AXIS));
		meas_gainPanel.add(meas_gainBitField);

		JCheckBox meas_gainBitCheck = new JCheckBox("BitField Configuration");
		meas_gainBitCheck.setSelected(true);
		meas_gainBitField.add(meas_gainBitCheck);
		JCheckBox meas_gainDataInputCheck = new JCheckBox("Data Input Configuration");
		meas_gainDataInputCheck.setSelected(false);

		JPanel meas_gainBitFieldPanel = new JPanel();
		meas_gainBitField.add(meas_gainBitFieldPanel);
		meas_gainBitFieldPanel.setLayout(new BoxLayout(meas_gainBitFieldPanel, BoxLayout.X_AXIS));

		JPanel meas_gainBitInputPanel = new JPanel();
		meas_gainBitField.add(meas_gainBitInputPanel);
		meas_gainBitInputPanel.setLayout(new BoxLayout(meas_gainBitInputPanel, BoxLayout.X_AXIS));
		meas_gainBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!meas_gainBitCheck.isSelected()) {
					for (Component component : getComponents(meas_gainBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_gainDataInputCheck.setSelected(true);
					meas_gainDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_gainBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_gainDataInputCheck.setSelected(false);
					meas_gainDataInput.setEnabled(false);
				}
			}
		});

		meas_gainDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (meas_gainDataInputCheck.isSelected()) {
					for (Component component : getComponents(meas_gainBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_gainBitCheck.setSelected(false);
					meas_gainDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_gainBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_gainBitCheck.setSelected(true);
					meas_gainDataInput.setEnabled(false);
				}
			}
		});
		Action meas_gainaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = meas_gainDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] meas_gainBitPanel = new JPanel[8];
		JLabel[] meas_gainBitLabel = new JLabel[8];
		JComboBox<Integer>[] meas_gainComboBoxList = new JComboBox[8];
		name = "meas_gain";
		labelTemp = meas_gainBitLabel;
		comboboxTemp = meas_gainComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			meas_gainBitPanel[i] = new JPanel();
			meas_gainBitPanel[i].setLayout(new BoxLayout(meas_gainBitPanel[i], BoxLayout.Y_AXIS));
			meas_gainBitFieldPanel.add(meas_gainBitPanel[i]);

			meas_gainBitLabel[i] = new JLabel("  ");
			meas_gainComboBoxList[i] = new JComboBox(selection);
			meas_gainComboBoxList[i].setEnabled(false);
			meas_gainComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) meas_gainComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			meas_gainBitPanel[i].add(meas_gainBitLabel[i]);
			meas_gainBitPanel[i].add(meas_gainComboBoxList[i]);
			meas_gainBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 3; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("meas_gain" + "[" + i + "]");
		}

		meas_gainBitField.add(meas_gainDataInputCheck);
		meas_gainBitField.add(meas_gainDataInput);
		meas_gainDataInput.addActionListener(meas_gainaction);

		//final total panel
		panelTotal.add(meas_gainPanel);
		panelTotal.add(new JSeparator());

		JPanel pwm_duty_heatPanel = new JPanel();
		JPanel pwm_duty_heatGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel pwm_duty_heatRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel pwm_duty_heatBitField = new JPanel();
		JTextField pwm_duty_heatDataInput = new JTextField();
		pwm_duty_heatDataInput.setText("0x");
		pwm_duty_heatDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "pwm_duty_heat", TitledBorder.LEFT,
				TitledBorder.TOP);
		pwm_duty_heatPanel.setBorder(border1);
		pwm_duty_heatPanel.setLayout(new BoxLayout(pwm_duty_heatPanel, BoxLayout.Y_AXIS));

		//General info part
		pwm_duty_heatGeneralInfo.setBorder(border2);
		//pwm_duty_heatGeneralInfo.setLayout(new BoxLayout(pwm_duty_heatGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel pwm_duty_heatLabel = new JLabel("Name: " + "pwm_duty_heat");
		//pwm_duty_heatLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, pwm_duty_heatLabel.getMinimumSize().height));
		pwm_duty_heatGeneralInfo.add(pwm_duty_heatLabel);
		JLabel pwm_duty_heatShortNameLabel = new JLabel("shortName: " + "");
		pwm_duty_heatGeneralInfo.add(pwm_duty_heatShortNameLabel);
		JLabel pwm_duty_heatHiddenLabel = new JLabel("hidden: " + "false");
		pwm_duty_heatGeneralInfo.add(pwm_duty_heatHiddenLabel);
		pwm_duty_heatPanel.add(pwm_duty_heatGeneralInfo);
		//Register attribute part
		pwm_duty_heatRegAttributes.setBorder(border3);
		//pwm_duty_heatRegAttributes.setLayout(new BoxLayout(pwm_duty_heatRegAttributes, BoxLayout.Y_AXIS));
		pwm_duty_heatPanel.add(pwm_duty_heatRegAttributes);
		JLabel pwm_duty_heatOffsetLabel = new JLabel("Offset: " + "0xe");
		pwm_duty_heatRegAttributes.add(pwm_duty_heatOffsetLabel);
		JLabel pwm_duty_heatRelOffsetLabel = new JLabel("Rel Offset: " + "0xe");
		pwm_duty_heatRegAttributes.add(pwm_duty_heatRelOffsetLabel);
		JLabel pwm_duty_heatDataWidth = new JLabel("Rel Offset: " + "16");
		pwm_duty_heatRegAttributes.add(pwm_duty_heatDataWidth);
		JLabel pwm_duty_heatNoShadowLabel = new JLabel("No Shadow: ");
		pwm_duty_heatRegAttributes.add(pwm_duty_heatNoShadowLabel);
		JCheckBox pwm_duty_heatNoShadowCheckBox = new JCheckBox();
		pwm_duty_heatNoShadowCheckBox.setSelected(true);

		pwm_duty_heatRegAttributes.add(pwm_duty_heatNoShadowCheckBox);
		JLabel pwm_duty_heatMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		pwm_duty_heatRegAttributes.add(pwm_duty_heatMirrorSizeLabel);
		//BitField Overview

		pwm_duty_heatBitField.setBorder(border4);
		pwm_duty_heatBitField.setLayout(new BoxLayout(pwm_duty_heatBitField, BoxLayout.Y_AXIS));
		pwm_duty_heatPanel.add(pwm_duty_heatBitField);

		JCheckBox pwm_duty_heatBitCheck = new JCheckBox("BitField Configuration");
		pwm_duty_heatBitCheck.setSelected(true);
		pwm_duty_heatBitField.add(pwm_duty_heatBitCheck);
		JCheckBox pwm_duty_heatDataInputCheck = new JCheckBox("Data Input Configuration");
		pwm_duty_heatDataInputCheck.setSelected(false);

		JPanel pwm_duty_heatBitFieldPanel = new JPanel();
		pwm_duty_heatBitField.add(pwm_duty_heatBitFieldPanel);
		pwm_duty_heatBitFieldPanel.setLayout(new BoxLayout(pwm_duty_heatBitFieldPanel, BoxLayout.X_AXIS));

		JPanel pwm_duty_heatBitInputPanel = new JPanel();
		pwm_duty_heatBitField.add(pwm_duty_heatBitInputPanel);
		pwm_duty_heatBitInputPanel.setLayout(new BoxLayout(pwm_duty_heatBitInputPanel, BoxLayout.X_AXIS));
		pwm_duty_heatBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!pwm_duty_heatBitCheck.isSelected()) {
					for (Component component : getComponents(pwm_duty_heatBitFieldPanel)) {
						component.setEnabled(false);
					}
					pwm_duty_heatDataInputCheck.setSelected(true);
					pwm_duty_heatDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(pwm_duty_heatBitFieldPanel)) {
						component.setEnabled(true);
					}
					pwm_duty_heatDataInputCheck.setSelected(false);
					pwm_duty_heatDataInput.setEnabled(false);
				}
			}
		});

		pwm_duty_heatDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (pwm_duty_heatDataInputCheck.isSelected()) {
					for (Component component : getComponents(pwm_duty_heatBitFieldPanel)) {
						component.setEnabled(false);
					}
					pwm_duty_heatBitCheck.setSelected(false);
					pwm_duty_heatDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(pwm_duty_heatBitFieldPanel)) {
						component.setEnabled(true);
					}
					pwm_duty_heatBitCheck.setSelected(true);
					pwm_duty_heatDataInput.setEnabled(false);
				}
			}
		});
		Action pwm_duty_heataction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = pwm_duty_heatDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 16)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 16) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] pwm_duty_heatBitPanel = new JPanel[16];
		JLabel[] pwm_duty_heatBitLabel = new JLabel[16];
		JComboBox<Integer>[] pwm_duty_heatComboBoxList = new JComboBox[16];
		name = "pwm_duty_heat";
		labelTemp = pwm_duty_heatBitLabel;
		comboboxTemp = pwm_duty_heatComboBoxList;
		dataWidth = 16;
		for (int i = 0; i < 16; i++) {
			pwm_duty_heatBitPanel[i] = new JPanel();
			pwm_duty_heatBitPanel[i].setLayout(new BoxLayout(pwm_duty_heatBitPanel[i], BoxLayout.Y_AXIS));
			pwm_duty_heatBitFieldPanel.add(pwm_duty_heatBitPanel[i]);

			pwm_duty_heatBitLabel[i] = new JLabel("  ");
			pwm_duty_heatComboBoxList[i] = new JComboBox(selection);
			pwm_duty_heatComboBoxList[i].setEnabled(false);
			pwm_duty_heatComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 16; i++) {
						sendData = sendData * 2 + (int) pwm_duty_heatComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			pwm_duty_heatBitPanel[i].add(pwm_duty_heatBitLabel[i]);
			pwm_duty_heatBitPanel[i].add(pwm_duty_heatComboBoxList[i]);
			pwm_duty_heatBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 16; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("pwm_duty_heat" + "[" + i + "]");
		}

		pwm_duty_heatBitField.add(pwm_duty_heatDataInputCheck);
		pwm_duty_heatBitField.add(pwm_duty_heatDataInput);
		pwm_duty_heatDataInput.addActionListener(pwm_duty_heataction);

		//final total panel
		panelTotal.add(pwm_duty_heatPanel);
		panelTotal.add(new JSeparator());

		JPanel pwm_duty_coolPanel = new JPanel();
		JPanel pwm_duty_coolGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel pwm_duty_coolRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel pwm_duty_coolBitField = new JPanel();
		JTextField pwm_duty_coolDataInput = new JTextField();
		pwm_duty_coolDataInput.setText("0x");
		pwm_duty_coolDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "pwm_duty_cool", TitledBorder.LEFT,
				TitledBorder.TOP);
		pwm_duty_coolPanel.setBorder(border1);
		pwm_duty_coolPanel.setLayout(new BoxLayout(pwm_duty_coolPanel, BoxLayout.Y_AXIS));

		//General info part
		pwm_duty_coolGeneralInfo.setBorder(border2);
		//pwm_duty_coolGeneralInfo.setLayout(new BoxLayout(pwm_duty_coolGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel pwm_duty_coolLabel = new JLabel("Name: " + "pwm_duty_cool");
		//pwm_duty_coolLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, pwm_duty_coolLabel.getMinimumSize().height));
		pwm_duty_coolGeneralInfo.add(pwm_duty_coolLabel);
		JLabel pwm_duty_coolShortNameLabel = new JLabel("shortName: " + "");
		pwm_duty_coolGeneralInfo.add(pwm_duty_coolShortNameLabel);
		JLabel pwm_duty_coolHiddenLabel = new JLabel("hidden: " + "false");
		pwm_duty_coolGeneralInfo.add(pwm_duty_coolHiddenLabel);
		pwm_duty_coolPanel.add(pwm_duty_coolGeneralInfo);
		//Register attribute part
		pwm_duty_coolRegAttributes.setBorder(border3);
		//pwm_duty_coolRegAttributes.setLayout(new BoxLayout(pwm_duty_coolRegAttributes, BoxLayout.Y_AXIS));
		pwm_duty_coolPanel.add(pwm_duty_coolRegAttributes);
		JLabel pwm_duty_coolOffsetLabel = new JLabel("Offset: " + "0x10");
		pwm_duty_coolRegAttributes.add(pwm_duty_coolOffsetLabel);
		JLabel pwm_duty_coolRelOffsetLabel = new JLabel("Rel Offset: " + "0x10");
		pwm_duty_coolRegAttributes.add(pwm_duty_coolRelOffsetLabel);
		JLabel pwm_duty_coolDataWidth = new JLabel("Rel Offset: " + "16");
		pwm_duty_coolRegAttributes.add(pwm_duty_coolDataWidth);
		JLabel pwm_duty_coolNoShadowLabel = new JLabel("No Shadow: ");
		pwm_duty_coolRegAttributes.add(pwm_duty_coolNoShadowLabel);
		JCheckBox pwm_duty_coolNoShadowCheckBox = new JCheckBox();
		pwm_duty_coolNoShadowCheckBox.setSelected(true);

		pwm_duty_coolRegAttributes.add(pwm_duty_coolNoShadowCheckBox);
		JLabel pwm_duty_coolMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		pwm_duty_coolRegAttributes.add(pwm_duty_coolMirrorSizeLabel);
		//BitField Overview

		pwm_duty_coolBitField.setBorder(border4);
		pwm_duty_coolBitField.setLayout(new BoxLayout(pwm_duty_coolBitField, BoxLayout.Y_AXIS));
		pwm_duty_coolPanel.add(pwm_duty_coolBitField);

		JCheckBox pwm_duty_coolBitCheck = new JCheckBox("BitField Configuration");
		pwm_duty_coolBitCheck.setSelected(true);
		pwm_duty_coolBitField.add(pwm_duty_coolBitCheck);
		JCheckBox pwm_duty_coolDataInputCheck = new JCheckBox("Data Input Configuration");
		pwm_duty_coolDataInputCheck.setSelected(false);

		JPanel pwm_duty_coolBitFieldPanel = new JPanel();
		pwm_duty_coolBitField.add(pwm_duty_coolBitFieldPanel);
		pwm_duty_coolBitFieldPanel.setLayout(new BoxLayout(pwm_duty_coolBitFieldPanel, BoxLayout.X_AXIS));

		JPanel pwm_duty_coolBitInputPanel = new JPanel();
		pwm_duty_coolBitField.add(pwm_duty_coolBitInputPanel);
		pwm_duty_coolBitInputPanel.setLayout(new BoxLayout(pwm_duty_coolBitInputPanel, BoxLayout.X_AXIS));
		pwm_duty_coolBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!pwm_duty_coolBitCheck.isSelected()) {
					for (Component component : getComponents(pwm_duty_coolBitFieldPanel)) {
						component.setEnabled(false);
					}
					pwm_duty_coolDataInputCheck.setSelected(true);
					pwm_duty_coolDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(pwm_duty_coolBitFieldPanel)) {
						component.setEnabled(true);
					}
					pwm_duty_coolDataInputCheck.setSelected(false);
					pwm_duty_coolDataInput.setEnabled(false);
				}
			}
		});

		pwm_duty_coolDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (pwm_duty_coolDataInputCheck.isSelected()) {
					for (Component component : getComponents(pwm_duty_coolBitFieldPanel)) {
						component.setEnabled(false);
					}
					pwm_duty_coolBitCheck.setSelected(false);
					pwm_duty_coolDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(pwm_duty_coolBitFieldPanel)) {
						component.setEnabled(true);
					}
					pwm_duty_coolBitCheck.setSelected(true);
					pwm_duty_coolDataInput.setEnabled(false);
				}
			}
		});
		Action pwm_duty_coolaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = pwm_duty_coolDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 16)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 16) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] pwm_duty_coolBitPanel = new JPanel[16];
		JLabel[] pwm_duty_coolBitLabel = new JLabel[16];
		JComboBox<Integer>[] pwm_duty_coolComboBoxList = new JComboBox[16];
		name = "pwm_duty_cool";
		labelTemp = pwm_duty_coolBitLabel;
		comboboxTemp = pwm_duty_coolComboBoxList;
		dataWidth = 16;
		for (int i = 0; i < 16; i++) {
			pwm_duty_coolBitPanel[i] = new JPanel();
			pwm_duty_coolBitPanel[i].setLayout(new BoxLayout(pwm_duty_coolBitPanel[i], BoxLayout.Y_AXIS));
			pwm_duty_coolBitFieldPanel.add(pwm_duty_coolBitPanel[i]);

			pwm_duty_coolBitLabel[i] = new JLabel("  ");
			pwm_duty_coolComboBoxList[i] = new JComboBox(selection);
			pwm_duty_coolComboBoxList[i].setEnabled(false);
			pwm_duty_coolComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 16; i++) {
						sendData = sendData * 2 + (int) pwm_duty_coolComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			pwm_duty_coolBitPanel[i].add(pwm_duty_coolBitLabel[i]);
			pwm_duty_coolBitPanel[i].add(pwm_duty_coolComboBoxList[i]);
			pwm_duty_coolBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 16; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("pwm_duty_cool" + "[" + i + "]");
		}

		pwm_duty_coolBitField.add(pwm_duty_coolDataInputCheck);
		pwm_duty_coolBitField.add(pwm_duty_coolDataInput);
		pwm_duty_coolDataInput.addActionListener(pwm_duty_coolaction);

		//final total panel
		panelTotal.add(pwm_duty_coolPanel);
		panelTotal.add(new JSeparator());

		JPanel temp_set_heatPanel = new JPanel();
		JPanel temp_set_heatGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel temp_set_heatRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel temp_set_heatBitField = new JPanel();
		JTextField temp_set_heatDataInput = new JTextField();
		temp_set_heatDataInput.setText("0x");
		temp_set_heatDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "temp_set_heat", TitledBorder.LEFT,
				TitledBorder.TOP);
		temp_set_heatPanel.setBorder(border1);
		temp_set_heatPanel.setLayout(new BoxLayout(temp_set_heatPanel, BoxLayout.Y_AXIS));

		//General info part
		temp_set_heatGeneralInfo.setBorder(border2);
		//temp_set_heatGeneralInfo.setLayout(new BoxLayout(temp_set_heatGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel temp_set_heatLabel = new JLabel("Name: " + "temp_set_heat");
		//temp_set_heatLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, temp_set_heatLabel.getMinimumSize().height));
		temp_set_heatGeneralInfo.add(temp_set_heatLabel);
		JLabel temp_set_heatShortNameLabel = new JLabel("shortName: " + "");
		temp_set_heatGeneralInfo.add(temp_set_heatShortNameLabel);
		JLabel temp_set_heatHiddenLabel = new JLabel("hidden: " + "false");
		temp_set_heatGeneralInfo.add(temp_set_heatHiddenLabel);
		temp_set_heatPanel.add(temp_set_heatGeneralInfo);
		//Register attribute part
		temp_set_heatRegAttributes.setBorder(border3);
		//temp_set_heatRegAttributes.setLayout(new BoxLayout(temp_set_heatRegAttributes, BoxLayout.Y_AXIS));
		temp_set_heatPanel.add(temp_set_heatRegAttributes);
		JLabel temp_set_heatOffsetLabel = new JLabel("Offset: " + "0x12");
		temp_set_heatRegAttributes.add(temp_set_heatOffsetLabel);
		JLabel temp_set_heatRelOffsetLabel = new JLabel("Rel Offset: " + "0x12");
		temp_set_heatRegAttributes.add(temp_set_heatRelOffsetLabel);
		JLabel temp_set_heatDataWidth = new JLabel("Rel Offset: " + "16");
		temp_set_heatRegAttributes.add(temp_set_heatDataWidth);
		JLabel temp_set_heatNoShadowLabel = new JLabel("No Shadow: ");
		temp_set_heatRegAttributes.add(temp_set_heatNoShadowLabel);
		JCheckBox temp_set_heatNoShadowCheckBox = new JCheckBox();
		temp_set_heatNoShadowCheckBox.setSelected(true);

		temp_set_heatRegAttributes.add(temp_set_heatNoShadowCheckBox);
		JLabel temp_set_heatMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		temp_set_heatRegAttributes.add(temp_set_heatMirrorSizeLabel);
		//BitField Overview

		temp_set_heatBitField.setBorder(border4);
		temp_set_heatBitField.setLayout(new BoxLayout(temp_set_heatBitField, BoxLayout.Y_AXIS));
		temp_set_heatPanel.add(temp_set_heatBitField);

		JCheckBox temp_set_heatBitCheck = new JCheckBox("BitField Configuration");
		temp_set_heatBitCheck.setSelected(true);
		temp_set_heatBitField.add(temp_set_heatBitCheck);
		JCheckBox temp_set_heatDataInputCheck = new JCheckBox("Data Input Configuration");
		temp_set_heatDataInputCheck.setSelected(false);

		JPanel temp_set_heatBitFieldPanel = new JPanel();
		temp_set_heatBitField.add(temp_set_heatBitFieldPanel);
		temp_set_heatBitFieldPanel.setLayout(new BoxLayout(temp_set_heatBitFieldPanel, BoxLayout.X_AXIS));

		JPanel temp_set_heatBitInputPanel = new JPanel();
		temp_set_heatBitField.add(temp_set_heatBitInputPanel);
		temp_set_heatBitInputPanel.setLayout(new BoxLayout(temp_set_heatBitInputPanel, BoxLayout.X_AXIS));
		temp_set_heatBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!temp_set_heatBitCheck.isSelected()) {
					for (Component component : getComponents(temp_set_heatBitFieldPanel)) {
						component.setEnabled(false);
					}
					temp_set_heatDataInputCheck.setSelected(true);
					temp_set_heatDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(temp_set_heatBitFieldPanel)) {
						component.setEnabled(true);
					}
					temp_set_heatDataInputCheck.setSelected(false);
					temp_set_heatDataInput.setEnabled(false);
				}
			}
		});

		temp_set_heatDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (temp_set_heatDataInputCheck.isSelected()) {
					for (Component component : getComponents(temp_set_heatBitFieldPanel)) {
						component.setEnabled(false);
					}
					temp_set_heatBitCheck.setSelected(false);
					temp_set_heatDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(temp_set_heatBitFieldPanel)) {
						component.setEnabled(true);
					}
					temp_set_heatBitCheck.setSelected(true);
					temp_set_heatDataInput.setEnabled(false);
				}
			}
		});
		Action temp_set_heataction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = temp_set_heatDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 16)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 16) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] temp_set_heatBitPanel = new JPanel[16];
		JLabel[] temp_set_heatBitLabel = new JLabel[16];
		JComboBox<Integer>[] temp_set_heatComboBoxList = new JComboBox[16];
		name = "temp_set_heat";
		labelTemp = temp_set_heatBitLabel;
		comboboxTemp = temp_set_heatComboBoxList;
		dataWidth = 16;
		for (int i = 0; i < 16; i++) {
			temp_set_heatBitPanel[i] = new JPanel();
			temp_set_heatBitPanel[i].setLayout(new BoxLayout(temp_set_heatBitPanel[i], BoxLayout.Y_AXIS));
			temp_set_heatBitFieldPanel.add(temp_set_heatBitPanel[i]);

			temp_set_heatBitLabel[i] = new JLabel("  ");
			temp_set_heatComboBoxList[i] = new JComboBox(selection);
			temp_set_heatComboBoxList[i].setEnabled(false);
			temp_set_heatComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 16; i++) {
						sendData = sendData * 2 + (int) temp_set_heatComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			temp_set_heatBitPanel[i].add(temp_set_heatBitLabel[i]);
			temp_set_heatBitPanel[i].add(temp_set_heatComboBoxList[i]);
			temp_set_heatBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 16; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("temp_set_heat" + "[" + i + "]");
		}

		temp_set_heatBitField.add(temp_set_heatDataInputCheck);
		temp_set_heatBitField.add(temp_set_heatDataInput);
		temp_set_heatDataInput.addActionListener(temp_set_heataction);

		//final total panel
		panelTotal.add(temp_set_heatPanel);
		panelTotal.add(new JSeparator());

		JPanel temp_set_coolPanel = new JPanel();
		JPanel temp_set_coolGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel temp_set_coolRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel temp_set_coolBitField = new JPanel();
		JTextField temp_set_coolDataInput = new JTextField();
		temp_set_coolDataInput.setText("0x");
		temp_set_coolDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "temp_set_cool", TitledBorder.LEFT,
				TitledBorder.TOP);
		temp_set_coolPanel.setBorder(border1);
		temp_set_coolPanel.setLayout(new BoxLayout(temp_set_coolPanel, BoxLayout.Y_AXIS));

		//General info part
		temp_set_coolGeneralInfo.setBorder(border2);
		//temp_set_coolGeneralInfo.setLayout(new BoxLayout(temp_set_coolGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel temp_set_coolLabel = new JLabel("Name: " + "temp_set_cool");
		//temp_set_coolLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, temp_set_coolLabel.getMinimumSize().height));
		temp_set_coolGeneralInfo.add(temp_set_coolLabel);
		JLabel temp_set_coolShortNameLabel = new JLabel("shortName: " + "");
		temp_set_coolGeneralInfo.add(temp_set_coolShortNameLabel);
		JLabel temp_set_coolHiddenLabel = new JLabel("hidden: " + "false");
		temp_set_coolGeneralInfo.add(temp_set_coolHiddenLabel);
		temp_set_coolPanel.add(temp_set_coolGeneralInfo);
		//Register attribute part
		temp_set_coolRegAttributes.setBorder(border3);
		//temp_set_coolRegAttributes.setLayout(new BoxLayout(temp_set_coolRegAttributes, BoxLayout.Y_AXIS));
		temp_set_coolPanel.add(temp_set_coolRegAttributes);
		JLabel temp_set_coolOffsetLabel = new JLabel("Offset: " + "0x14");
		temp_set_coolRegAttributes.add(temp_set_coolOffsetLabel);
		JLabel temp_set_coolRelOffsetLabel = new JLabel("Rel Offset: " + "0x14");
		temp_set_coolRegAttributes.add(temp_set_coolRelOffsetLabel);
		JLabel temp_set_coolDataWidth = new JLabel("Rel Offset: " + "16");
		temp_set_coolRegAttributes.add(temp_set_coolDataWidth);
		JLabel temp_set_coolNoShadowLabel = new JLabel("No Shadow: ");
		temp_set_coolRegAttributes.add(temp_set_coolNoShadowLabel);
		JCheckBox temp_set_coolNoShadowCheckBox = new JCheckBox();
		temp_set_coolNoShadowCheckBox.setSelected(true);

		temp_set_coolRegAttributes.add(temp_set_coolNoShadowCheckBox);
		JLabel temp_set_coolMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		temp_set_coolRegAttributes.add(temp_set_coolMirrorSizeLabel);
		//BitField Overview

		temp_set_coolBitField.setBorder(border4);
		temp_set_coolBitField.setLayout(new BoxLayout(temp_set_coolBitField, BoxLayout.Y_AXIS));
		temp_set_coolPanel.add(temp_set_coolBitField);

		JCheckBox temp_set_coolBitCheck = new JCheckBox("BitField Configuration");
		temp_set_coolBitCheck.setSelected(true);
		temp_set_coolBitField.add(temp_set_coolBitCheck);
		JCheckBox temp_set_coolDataInputCheck = new JCheckBox("Data Input Configuration");
		temp_set_coolDataInputCheck.setSelected(false);

		JPanel temp_set_coolBitFieldPanel = new JPanel();
		temp_set_coolBitField.add(temp_set_coolBitFieldPanel);
		temp_set_coolBitFieldPanel.setLayout(new BoxLayout(temp_set_coolBitFieldPanel, BoxLayout.X_AXIS));

		JPanel temp_set_coolBitInputPanel = new JPanel();
		temp_set_coolBitField.add(temp_set_coolBitInputPanel);
		temp_set_coolBitInputPanel.setLayout(new BoxLayout(temp_set_coolBitInputPanel, BoxLayout.X_AXIS));
		temp_set_coolBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!temp_set_coolBitCheck.isSelected()) {
					for (Component component : getComponents(temp_set_coolBitFieldPanel)) {
						component.setEnabled(false);
					}
					temp_set_coolDataInputCheck.setSelected(true);
					temp_set_coolDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(temp_set_coolBitFieldPanel)) {
						component.setEnabled(true);
					}
					temp_set_coolDataInputCheck.setSelected(false);
					temp_set_coolDataInput.setEnabled(false);
				}
			}
		});

		temp_set_coolDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (temp_set_coolDataInputCheck.isSelected()) {
					for (Component component : getComponents(temp_set_coolBitFieldPanel)) {
						component.setEnabled(false);
					}
					temp_set_coolBitCheck.setSelected(false);
					temp_set_coolDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(temp_set_coolBitFieldPanel)) {
						component.setEnabled(true);
					}
					temp_set_coolBitCheck.setSelected(true);
					temp_set_coolDataInput.setEnabled(false);
				}
			}
		});
		Action temp_set_coolaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = temp_set_coolDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 16)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 16) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] temp_set_coolBitPanel = new JPanel[16];
		JLabel[] temp_set_coolBitLabel = new JLabel[16];
		JComboBox<Integer>[] temp_set_coolComboBoxList = new JComboBox[16];
		name = "temp_set_cool";
		labelTemp = temp_set_coolBitLabel;
		comboboxTemp = temp_set_coolComboBoxList;
		dataWidth = 16;
		for (int i = 0; i < 16; i++) {
			temp_set_coolBitPanel[i] = new JPanel();
			temp_set_coolBitPanel[i].setLayout(new BoxLayout(temp_set_coolBitPanel[i], BoxLayout.Y_AXIS));
			temp_set_coolBitFieldPanel.add(temp_set_coolBitPanel[i]);

			temp_set_coolBitLabel[i] = new JLabel("  ");
			temp_set_coolComboBoxList[i] = new JComboBox(selection);
			temp_set_coolComboBoxList[i].setEnabled(false);
			temp_set_coolComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 16; i++) {
						sendData = sendData * 2 + (int) temp_set_coolComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			temp_set_coolBitPanel[i].add(temp_set_coolBitLabel[i]);
			temp_set_coolBitPanel[i].add(temp_set_coolComboBoxList[i]);
			temp_set_coolBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 16; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("temp_set_cool" + "[" + i + "]");
		}

		temp_set_coolBitField.add(temp_set_coolDataInputCheck);
		temp_set_coolBitField.add(temp_set_coolDataInput);
		temp_set_coolDataInput.addActionListener(temp_set_coolaction);

		//final total panel
		panelTotal.add(temp_set_coolPanel);
		panelTotal.add(new JSeparator());

		JPanel temp_set_modePanel = new JPanel();
		JPanel temp_set_modeGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel temp_set_modeRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel temp_set_modeBitField = new JPanel();
		JTextField temp_set_modeDataInput = new JTextField();
		temp_set_modeDataInput.setText("0x");
		temp_set_modeDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "temp_set_mode", TitledBorder.LEFT,
				TitledBorder.TOP);
		temp_set_modePanel.setBorder(border1);
		temp_set_modePanel.setLayout(new BoxLayout(temp_set_modePanel, BoxLayout.Y_AXIS));

		//General info part
		temp_set_modeGeneralInfo.setBorder(border2);
		//temp_set_modeGeneralInfo.setLayout(new BoxLayout(temp_set_modeGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel temp_set_modeLabel = new JLabel("Name: " + "temp_set_mode");
		//temp_set_modeLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, temp_set_modeLabel.getMinimumSize().height));
		temp_set_modeGeneralInfo.add(temp_set_modeLabel);
		JLabel temp_set_modeShortNameLabel = new JLabel("shortName: " + "");
		temp_set_modeGeneralInfo.add(temp_set_modeShortNameLabel);
		JLabel temp_set_modeHiddenLabel = new JLabel("hidden: " + "false");
		temp_set_modeGeneralInfo.add(temp_set_modeHiddenLabel);
		temp_set_modePanel.add(temp_set_modeGeneralInfo);
		//Register attribute part
		temp_set_modeRegAttributes.setBorder(border3);
		//temp_set_modeRegAttributes.setLayout(new BoxLayout(temp_set_modeRegAttributes, BoxLayout.Y_AXIS));
		temp_set_modePanel.add(temp_set_modeRegAttributes);
		JLabel temp_set_modeOffsetLabel = new JLabel("Offset: " + "0x16");
		temp_set_modeRegAttributes.add(temp_set_modeOffsetLabel);
		JLabel temp_set_modeRelOffsetLabel = new JLabel("Rel Offset: " + "0x16");
		temp_set_modeRegAttributes.add(temp_set_modeRelOffsetLabel);
		JLabel temp_set_modeDataWidth = new JLabel("Rel Offset: " + "8");
		temp_set_modeRegAttributes.add(temp_set_modeDataWidth);
		JLabel temp_set_modeNoShadowLabel = new JLabel("No Shadow: ");
		temp_set_modeRegAttributes.add(temp_set_modeNoShadowLabel);
		JCheckBox temp_set_modeNoShadowCheckBox = new JCheckBox();
		temp_set_modeNoShadowCheckBox.setSelected(true);

		temp_set_modeRegAttributes.add(temp_set_modeNoShadowCheckBox);
		JLabel temp_set_modeMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		temp_set_modeRegAttributes.add(temp_set_modeMirrorSizeLabel);
		//BitField Overview

		temp_set_modeBitField.setBorder(border4);
		temp_set_modeBitField.setLayout(new BoxLayout(temp_set_modeBitField, BoxLayout.Y_AXIS));
		temp_set_modePanel.add(temp_set_modeBitField);

		JCheckBox temp_set_modeBitCheck = new JCheckBox("BitField Configuration");
		temp_set_modeBitCheck.setSelected(true);
		temp_set_modeBitField.add(temp_set_modeBitCheck);
		JCheckBox temp_set_modeDataInputCheck = new JCheckBox("Data Input Configuration");
		temp_set_modeDataInputCheck.setSelected(false);

		JPanel temp_set_modeBitFieldPanel = new JPanel();
		temp_set_modeBitField.add(temp_set_modeBitFieldPanel);
		temp_set_modeBitFieldPanel.setLayout(new BoxLayout(temp_set_modeBitFieldPanel, BoxLayout.X_AXIS));

		JPanel temp_set_modeBitInputPanel = new JPanel();
		temp_set_modeBitField.add(temp_set_modeBitInputPanel);
		temp_set_modeBitInputPanel.setLayout(new BoxLayout(temp_set_modeBitInputPanel, BoxLayout.X_AXIS));
		temp_set_modeBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!temp_set_modeBitCheck.isSelected()) {
					for (Component component : getComponents(temp_set_modeBitFieldPanel)) {
						component.setEnabled(false);
					}
					temp_set_modeDataInputCheck.setSelected(true);
					temp_set_modeDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(temp_set_modeBitFieldPanel)) {
						component.setEnabled(true);
					}
					temp_set_modeDataInputCheck.setSelected(false);
					temp_set_modeDataInput.setEnabled(false);
				}
			}
		});

		temp_set_modeDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (temp_set_modeDataInputCheck.isSelected()) {
					for (Component component : getComponents(temp_set_modeBitFieldPanel)) {
						component.setEnabled(false);
					}
					temp_set_modeBitCheck.setSelected(false);
					temp_set_modeDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(temp_set_modeBitFieldPanel)) {
						component.setEnabled(true);
					}
					temp_set_modeBitCheck.setSelected(true);
					temp_set_modeDataInput.setEnabled(false);
				}
			}
		});
		Action temp_set_modeaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = temp_set_modeDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] temp_set_modeBitPanel = new JPanel[8];
		JLabel[] temp_set_modeBitLabel = new JLabel[8];
		JComboBox<Integer>[] temp_set_modeComboBoxList = new JComboBox[8];
		name = "temp_set_mode";
		labelTemp = temp_set_modeBitLabel;
		comboboxTemp = temp_set_modeComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			temp_set_modeBitPanel[i] = new JPanel();
			temp_set_modeBitPanel[i].setLayout(new BoxLayout(temp_set_modeBitPanel[i], BoxLayout.Y_AXIS));
			temp_set_modeBitFieldPanel.add(temp_set_modeBitPanel[i]);

			temp_set_modeBitLabel[i] = new JLabel("  ");
			temp_set_modeComboBoxList[i] = new JComboBox(selection);
			temp_set_modeComboBoxList[i].setEnabled(false);
			temp_set_modeComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) temp_set_modeComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			temp_set_modeBitPanel[i].add(temp_set_modeBitLabel[i]);
			temp_set_modeBitPanel[i].add(temp_set_modeComboBoxList[i]);
			temp_set_modeBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 1; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("temp_set_mode" + "[" + i + "]");
		}

		temp_set_modeBitField.add(temp_set_modeDataInputCheck);
		temp_set_modeBitField.add(temp_set_modeDataInput);
		temp_set_modeDataInput.addActionListener(temp_set_modeaction);

		//final total panel
		panelTotal.add(temp_set_modePanel);
		panelTotal.add(new JSeparator());

		JPanel heat_reg_enPanel = new JPanel();
		JPanel heat_reg_enGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel heat_reg_enRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel heat_reg_enBitField = new JPanel();
		JTextField heat_reg_enDataInput = new JTextField();
		heat_reg_enDataInput.setText("0x");
		heat_reg_enDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "heat_reg_en", TitledBorder.LEFT,
				TitledBorder.TOP);
		heat_reg_enPanel.setBorder(border1);
		heat_reg_enPanel.setLayout(new BoxLayout(heat_reg_enPanel, BoxLayout.Y_AXIS));

		//General info part
		heat_reg_enGeneralInfo.setBorder(border2);
		//heat_reg_enGeneralInfo.setLayout(new BoxLayout(heat_reg_enGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel heat_reg_enLabel = new JLabel("Name: " + "heat_reg_en");
		//heat_reg_enLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, heat_reg_enLabel.getMinimumSize().height));
		heat_reg_enGeneralInfo.add(heat_reg_enLabel);
		JLabel heat_reg_enShortNameLabel = new JLabel("shortName: " + "");
		heat_reg_enGeneralInfo.add(heat_reg_enShortNameLabel);
		JLabel heat_reg_enHiddenLabel = new JLabel("hidden: " + "false");
		heat_reg_enGeneralInfo.add(heat_reg_enHiddenLabel);
		heat_reg_enPanel.add(heat_reg_enGeneralInfo);
		//Register attribute part
		heat_reg_enRegAttributes.setBorder(border3);
		//heat_reg_enRegAttributes.setLayout(new BoxLayout(heat_reg_enRegAttributes, BoxLayout.Y_AXIS));
		heat_reg_enPanel.add(heat_reg_enRegAttributes);
		JLabel heat_reg_enOffsetLabel = new JLabel("Offset: " + "0x17");
		heat_reg_enRegAttributes.add(heat_reg_enOffsetLabel);
		JLabel heat_reg_enRelOffsetLabel = new JLabel("Rel Offset: " + "0x17");
		heat_reg_enRegAttributes.add(heat_reg_enRelOffsetLabel);
		JLabel heat_reg_enDataWidth = new JLabel("Rel Offset: " + "8");
		heat_reg_enRegAttributes.add(heat_reg_enDataWidth);
		JLabel heat_reg_enNoShadowLabel = new JLabel("No Shadow: ");
		heat_reg_enRegAttributes.add(heat_reg_enNoShadowLabel);
		JCheckBox heat_reg_enNoShadowCheckBox = new JCheckBox();
		heat_reg_enNoShadowCheckBox.setSelected(true);

		heat_reg_enRegAttributes.add(heat_reg_enNoShadowCheckBox);
		JLabel heat_reg_enMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		heat_reg_enRegAttributes.add(heat_reg_enMirrorSizeLabel);
		//BitField Overview

		heat_reg_enBitField.setBorder(border4);
		heat_reg_enBitField.setLayout(new BoxLayout(heat_reg_enBitField, BoxLayout.Y_AXIS));
		heat_reg_enPanel.add(heat_reg_enBitField);

		JCheckBox heat_reg_enBitCheck = new JCheckBox("BitField Configuration");
		heat_reg_enBitCheck.setSelected(true);
		heat_reg_enBitField.add(heat_reg_enBitCheck);
		JCheckBox heat_reg_enDataInputCheck = new JCheckBox("Data Input Configuration");
		heat_reg_enDataInputCheck.setSelected(false);

		JPanel heat_reg_enBitFieldPanel = new JPanel();
		heat_reg_enBitField.add(heat_reg_enBitFieldPanel);
		heat_reg_enBitFieldPanel.setLayout(new BoxLayout(heat_reg_enBitFieldPanel, BoxLayout.X_AXIS));

		JPanel heat_reg_enBitInputPanel = new JPanel();
		heat_reg_enBitField.add(heat_reg_enBitInputPanel);
		heat_reg_enBitInputPanel.setLayout(new BoxLayout(heat_reg_enBitInputPanel, BoxLayout.X_AXIS));
		heat_reg_enBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!heat_reg_enBitCheck.isSelected()) {
					for (Component component : getComponents(heat_reg_enBitFieldPanel)) {
						component.setEnabled(false);
					}
					heat_reg_enDataInputCheck.setSelected(true);
					heat_reg_enDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(heat_reg_enBitFieldPanel)) {
						component.setEnabled(true);
					}
					heat_reg_enDataInputCheck.setSelected(false);
					heat_reg_enDataInput.setEnabled(false);
				}
			}
		});

		heat_reg_enDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (heat_reg_enDataInputCheck.isSelected()) {
					for (Component component : getComponents(heat_reg_enBitFieldPanel)) {
						component.setEnabled(false);
					}
					heat_reg_enBitCheck.setSelected(false);
					heat_reg_enDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(heat_reg_enBitFieldPanel)) {
						component.setEnabled(true);
					}
					heat_reg_enBitCheck.setSelected(true);
					heat_reg_enDataInput.setEnabled(false);
				}
			}
		});
		Action heat_reg_enaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = heat_reg_enDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] heat_reg_enBitPanel = new JPanel[8];
		JLabel[] heat_reg_enBitLabel = new JLabel[8];
		JComboBox<Integer>[] heat_reg_enComboBoxList = new JComboBox[8];
		name = "heat_reg_en";
		labelTemp = heat_reg_enBitLabel;
		comboboxTemp = heat_reg_enComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			heat_reg_enBitPanel[i] = new JPanel();
			heat_reg_enBitPanel[i].setLayout(new BoxLayout(heat_reg_enBitPanel[i], BoxLayout.Y_AXIS));
			heat_reg_enBitFieldPanel.add(heat_reg_enBitPanel[i]);

			heat_reg_enBitLabel[i] = new JLabel("  ");
			heat_reg_enComboBoxList[i] = new JComboBox(selection);
			heat_reg_enComboBoxList[i].setEnabled(false);
			heat_reg_enComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) heat_reg_enComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			heat_reg_enBitPanel[i].add(heat_reg_enBitLabel[i]);
			heat_reg_enBitPanel[i].add(heat_reg_enComboBoxList[i]);
			heat_reg_enBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 1; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("heat_reg_en" + "[" + i + "]");
		}

		heat_reg_enBitField.add(heat_reg_enDataInputCheck);
		heat_reg_enBitField.add(heat_reg_enDataInput);
		heat_reg_enDataInput.addActionListener(heat_reg_enaction);

		//final total panel
		panelTotal.add(heat_reg_enPanel);
		panelTotal.add(new JSeparator());

		JPanel temp_reg_pPanel = new JPanel();
		JPanel temp_reg_pGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel temp_reg_pRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel temp_reg_pBitField = new JPanel();
		JTextField temp_reg_pDataInput = new JTextField();
		temp_reg_pDataInput.setText("0x");
		temp_reg_pDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "temp_reg_p", TitledBorder.LEFT,
				TitledBorder.TOP);
		temp_reg_pPanel.setBorder(border1);
		temp_reg_pPanel.setLayout(new BoxLayout(temp_reg_pPanel, BoxLayout.Y_AXIS));

		//General info part
		temp_reg_pGeneralInfo.setBorder(border2);
		//temp_reg_pGeneralInfo.setLayout(new BoxLayout(temp_reg_pGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel temp_reg_pLabel = new JLabel("Name: " + "temp_reg_p");
		//temp_reg_pLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, temp_reg_pLabel.getMinimumSize().height));
		temp_reg_pGeneralInfo.add(temp_reg_pLabel);
		JLabel temp_reg_pShortNameLabel = new JLabel("shortName: " + "");
		temp_reg_pGeneralInfo.add(temp_reg_pShortNameLabel);
		JLabel temp_reg_pHiddenLabel = new JLabel("hidden: " + "false");
		temp_reg_pGeneralInfo.add(temp_reg_pHiddenLabel);
		temp_reg_pPanel.add(temp_reg_pGeneralInfo);
		//Register attribute part
		temp_reg_pRegAttributes.setBorder(border3);
		//temp_reg_pRegAttributes.setLayout(new BoxLayout(temp_reg_pRegAttributes, BoxLayout.Y_AXIS));
		temp_reg_pPanel.add(temp_reg_pRegAttributes);
		JLabel temp_reg_pOffsetLabel = new JLabel("Offset: " + "0x18");
		temp_reg_pRegAttributes.add(temp_reg_pOffsetLabel);
		JLabel temp_reg_pRelOffsetLabel = new JLabel("Rel Offset: " + "0x18");
		temp_reg_pRegAttributes.add(temp_reg_pRelOffsetLabel);
		JLabel temp_reg_pDataWidth = new JLabel("Rel Offset: " + "8");
		temp_reg_pRegAttributes.add(temp_reg_pDataWidth);
		JLabel temp_reg_pNoShadowLabel = new JLabel("No Shadow: ");
		temp_reg_pRegAttributes.add(temp_reg_pNoShadowLabel);
		JCheckBox temp_reg_pNoShadowCheckBox = new JCheckBox();
		temp_reg_pNoShadowCheckBox.setSelected(true);

		temp_reg_pRegAttributes.add(temp_reg_pNoShadowCheckBox);
		JLabel temp_reg_pMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		temp_reg_pRegAttributes.add(temp_reg_pMirrorSizeLabel);
		//BitField Overview

		temp_reg_pBitField.setBorder(border4);
		temp_reg_pBitField.setLayout(new BoxLayout(temp_reg_pBitField, BoxLayout.Y_AXIS));
		temp_reg_pPanel.add(temp_reg_pBitField);

		JCheckBox temp_reg_pBitCheck = new JCheckBox("BitField Configuration");
		temp_reg_pBitCheck.setSelected(true);
		temp_reg_pBitField.add(temp_reg_pBitCheck);
		JCheckBox temp_reg_pDataInputCheck = new JCheckBox("Data Input Configuration");
		temp_reg_pDataInputCheck.setSelected(false);

		JPanel temp_reg_pBitFieldPanel = new JPanel();
		temp_reg_pBitField.add(temp_reg_pBitFieldPanel);
		temp_reg_pBitFieldPanel.setLayout(new BoxLayout(temp_reg_pBitFieldPanel, BoxLayout.X_AXIS));

		JPanel temp_reg_pBitInputPanel = new JPanel();
		temp_reg_pBitField.add(temp_reg_pBitInputPanel);
		temp_reg_pBitInputPanel.setLayout(new BoxLayout(temp_reg_pBitInputPanel, BoxLayout.X_AXIS));
		temp_reg_pBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!temp_reg_pBitCheck.isSelected()) {
					for (Component component : getComponents(temp_reg_pBitFieldPanel)) {
						component.setEnabled(false);
					}
					temp_reg_pDataInputCheck.setSelected(true);
					temp_reg_pDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(temp_reg_pBitFieldPanel)) {
						component.setEnabled(true);
					}
					temp_reg_pDataInputCheck.setSelected(false);
					temp_reg_pDataInput.setEnabled(false);
				}
			}
		});

		temp_reg_pDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (temp_reg_pDataInputCheck.isSelected()) {
					for (Component component : getComponents(temp_reg_pBitFieldPanel)) {
						component.setEnabled(false);
					}
					temp_reg_pBitCheck.setSelected(false);
					temp_reg_pDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(temp_reg_pBitFieldPanel)) {
						component.setEnabled(true);
					}
					temp_reg_pBitCheck.setSelected(true);
					temp_reg_pDataInput.setEnabled(false);
				}
			}
		});
		Action temp_reg_paction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = temp_reg_pDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] temp_reg_pBitPanel = new JPanel[8];
		JLabel[] temp_reg_pBitLabel = new JLabel[8];
		JComboBox<Integer>[] temp_reg_pComboBoxList = new JComboBox[8];
		name = "temp_reg_p";
		labelTemp = temp_reg_pBitLabel;
		comboboxTemp = temp_reg_pComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			temp_reg_pBitPanel[i] = new JPanel();
			temp_reg_pBitPanel[i].setLayout(new BoxLayout(temp_reg_pBitPanel[i], BoxLayout.Y_AXIS));
			temp_reg_pBitFieldPanel.add(temp_reg_pBitPanel[i]);

			temp_reg_pBitLabel[i] = new JLabel("  ");
			temp_reg_pComboBoxList[i] = new JComboBox(selection);
			temp_reg_pComboBoxList[i].setEnabled(false);
			temp_reg_pComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) temp_reg_pComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			temp_reg_pBitPanel[i].add(temp_reg_pBitLabel[i]);
			temp_reg_pBitPanel[i].add(temp_reg_pComboBoxList[i]);
			temp_reg_pBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 8; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("temp_reg_p" + "[" + i + "]");
		}

		temp_reg_pBitField.add(temp_reg_pDataInputCheck);
		temp_reg_pBitField.add(temp_reg_pDataInput);
		temp_reg_pDataInput.addActionListener(temp_reg_paction);

		//final total panel
		panelTotal.add(temp_reg_pPanel);
		panelTotal.add(new JSeparator());

		JPanel temp_reg_iPanel = new JPanel();
		JPanel temp_reg_iGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel temp_reg_iRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel temp_reg_iBitField = new JPanel();
		JTextField temp_reg_iDataInput = new JTextField();
		temp_reg_iDataInput.setText("0x");
		temp_reg_iDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "temp_reg_i", TitledBorder.LEFT,
				TitledBorder.TOP);
		temp_reg_iPanel.setBorder(border1);
		temp_reg_iPanel.setLayout(new BoxLayout(temp_reg_iPanel, BoxLayout.Y_AXIS));

		//General info part
		temp_reg_iGeneralInfo.setBorder(border2);
		//temp_reg_iGeneralInfo.setLayout(new BoxLayout(temp_reg_iGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel temp_reg_iLabel = new JLabel("Name: " + "temp_reg_i");
		//temp_reg_iLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, temp_reg_iLabel.getMinimumSize().height));
		temp_reg_iGeneralInfo.add(temp_reg_iLabel);
		JLabel temp_reg_iShortNameLabel = new JLabel("shortName: " + "");
		temp_reg_iGeneralInfo.add(temp_reg_iShortNameLabel);
		JLabel temp_reg_iHiddenLabel = new JLabel("hidden: " + "false");
		temp_reg_iGeneralInfo.add(temp_reg_iHiddenLabel);
		temp_reg_iPanel.add(temp_reg_iGeneralInfo);
		//Register attribute part
		temp_reg_iRegAttributes.setBorder(border3);
		//temp_reg_iRegAttributes.setLayout(new BoxLayout(temp_reg_iRegAttributes, BoxLayout.Y_AXIS));
		temp_reg_iPanel.add(temp_reg_iRegAttributes);
		JLabel temp_reg_iOffsetLabel = new JLabel("Offset: " + "0x19");
		temp_reg_iRegAttributes.add(temp_reg_iOffsetLabel);
		JLabel temp_reg_iRelOffsetLabel = new JLabel("Rel Offset: " + "0x19");
		temp_reg_iRegAttributes.add(temp_reg_iRelOffsetLabel);
		JLabel temp_reg_iDataWidth = new JLabel("Rel Offset: " + "8");
		temp_reg_iRegAttributes.add(temp_reg_iDataWidth);
		JLabel temp_reg_iNoShadowLabel = new JLabel("No Shadow: ");
		temp_reg_iRegAttributes.add(temp_reg_iNoShadowLabel);
		JCheckBox temp_reg_iNoShadowCheckBox = new JCheckBox();
		temp_reg_iNoShadowCheckBox.setSelected(true);

		temp_reg_iRegAttributes.add(temp_reg_iNoShadowCheckBox);
		JLabel temp_reg_iMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		temp_reg_iRegAttributes.add(temp_reg_iMirrorSizeLabel);
		//BitField Overview

		temp_reg_iBitField.setBorder(border4);
		temp_reg_iBitField.setLayout(new BoxLayout(temp_reg_iBitField, BoxLayout.Y_AXIS));
		temp_reg_iPanel.add(temp_reg_iBitField);

		JCheckBox temp_reg_iBitCheck = new JCheckBox("BitField Configuration");
		temp_reg_iBitCheck.setSelected(true);
		temp_reg_iBitField.add(temp_reg_iBitCheck);
		JCheckBox temp_reg_iDataInputCheck = new JCheckBox("Data Input Configuration");
		temp_reg_iDataInputCheck.setSelected(false);

		JPanel temp_reg_iBitFieldPanel = new JPanel();
		temp_reg_iBitField.add(temp_reg_iBitFieldPanel);
		temp_reg_iBitFieldPanel.setLayout(new BoxLayout(temp_reg_iBitFieldPanel, BoxLayout.X_AXIS));

		JPanel temp_reg_iBitInputPanel = new JPanel();
		temp_reg_iBitField.add(temp_reg_iBitInputPanel);
		temp_reg_iBitInputPanel.setLayout(new BoxLayout(temp_reg_iBitInputPanel, BoxLayout.X_AXIS));
		temp_reg_iBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!temp_reg_iBitCheck.isSelected()) {
					for (Component component : getComponents(temp_reg_iBitFieldPanel)) {
						component.setEnabled(false);
					}
					temp_reg_iDataInputCheck.setSelected(true);
					temp_reg_iDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(temp_reg_iBitFieldPanel)) {
						component.setEnabled(true);
					}
					temp_reg_iDataInputCheck.setSelected(false);
					temp_reg_iDataInput.setEnabled(false);
				}
			}
		});

		temp_reg_iDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (temp_reg_iDataInputCheck.isSelected()) {
					for (Component component : getComponents(temp_reg_iBitFieldPanel)) {
						component.setEnabled(false);
					}
					temp_reg_iBitCheck.setSelected(false);
					temp_reg_iDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(temp_reg_iBitFieldPanel)) {
						component.setEnabled(true);
					}
					temp_reg_iBitCheck.setSelected(true);
					temp_reg_iDataInput.setEnabled(false);
				}
			}
		});
		Action temp_reg_iaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = temp_reg_iDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] temp_reg_iBitPanel = new JPanel[8];
		JLabel[] temp_reg_iBitLabel = new JLabel[8];
		JComboBox<Integer>[] temp_reg_iComboBoxList = new JComboBox[8];
		name = "temp_reg_i";
		labelTemp = temp_reg_iBitLabel;
		comboboxTemp = temp_reg_iComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			temp_reg_iBitPanel[i] = new JPanel();
			temp_reg_iBitPanel[i].setLayout(new BoxLayout(temp_reg_iBitPanel[i], BoxLayout.Y_AXIS));
			temp_reg_iBitFieldPanel.add(temp_reg_iBitPanel[i]);

			temp_reg_iBitLabel[i] = new JLabel("  ");
			temp_reg_iComboBoxList[i] = new JComboBox(selection);
			temp_reg_iComboBoxList[i].setEnabled(false);
			temp_reg_iComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) temp_reg_iComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			temp_reg_iBitPanel[i].add(temp_reg_iBitLabel[i]);
			temp_reg_iBitPanel[i].add(temp_reg_iComboBoxList[i]);
			temp_reg_iBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 8; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("temp_reg_i" + "[" + i + "]");
		}

		temp_reg_iBitField.add(temp_reg_iDataInputCheck);
		temp_reg_iBitField.add(temp_reg_iDataInput);
		temp_reg_iDataInput.addActionListener(temp_reg_iaction);

		//final total panel
		panelTotal.add(temp_reg_iPanel);
		panelTotal.add(new JSeparator());

		JPanel temp_reg_dPanel = new JPanel();
		JPanel temp_reg_dGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel temp_reg_dRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel temp_reg_dBitField = new JPanel();
		JTextField temp_reg_dDataInput = new JTextField();
		temp_reg_dDataInput.setText("0x");
		temp_reg_dDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "temp_reg_d", TitledBorder.LEFT,
				TitledBorder.TOP);
		temp_reg_dPanel.setBorder(border1);
		temp_reg_dPanel.setLayout(new BoxLayout(temp_reg_dPanel, BoxLayout.Y_AXIS));

		//General info part
		temp_reg_dGeneralInfo.setBorder(border2);
		//temp_reg_dGeneralInfo.setLayout(new BoxLayout(temp_reg_dGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel temp_reg_dLabel = new JLabel("Name: " + "temp_reg_d");
		//temp_reg_dLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, temp_reg_dLabel.getMinimumSize().height));
		temp_reg_dGeneralInfo.add(temp_reg_dLabel);
		JLabel temp_reg_dShortNameLabel = new JLabel("shortName: " + "");
		temp_reg_dGeneralInfo.add(temp_reg_dShortNameLabel);
		JLabel temp_reg_dHiddenLabel = new JLabel("hidden: " + "false");
		temp_reg_dGeneralInfo.add(temp_reg_dHiddenLabel);
		temp_reg_dPanel.add(temp_reg_dGeneralInfo);
		//Register attribute part
		temp_reg_dRegAttributes.setBorder(border3);
		//temp_reg_dRegAttributes.setLayout(new BoxLayout(temp_reg_dRegAttributes, BoxLayout.Y_AXIS));
		temp_reg_dPanel.add(temp_reg_dRegAttributes);
		JLabel temp_reg_dOffsetLabel = new JLabel("Offset: " + "0x1a");
		temp_reg_dRegAttributes.add(temp_reg_dOffsetLabel);
		JLabel temp_reg_dRelOffsetLabel = new JLabel("Rel Offset: " + "0x1a");
		temp_reg_dRegAttributes.add(temp_reg_dRelOffsetLabel);
		JLabel temp_reg_dDataWidth = new JLabel("Rel Offset: " + "8");
		temp_reg_dRegAttributes.add(temp_reg_dDataWidth);
		JLabel temp_reg_dNoShadowLabel = new JLabel("No Shadow: ");
		temp_reg_dRegAttributes.add(temp_reg_dNoShadowLabel);
		JCheckBox temp_reg_dNoShadowCheckBox = new JCheckBox();
		temp_reg_dNoShadowCheckBox.setSelected(true);

		temp_reg_dRegAttributes.add(temp_reg_dNoShadowCheckBox);
		JLabel temp_reg_dMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		temp_reg_dRegAttributes.add(temp_reg_dMirrorSizeLabel);
		//BitField Overview

		temp_reg_dBitField.setBorder(border4);
		temp_reg_dBitField.setLayout(new BoxLayout(temp_reg_dBitField, BoxLayout.Y_AXIS));
		temp_reg_dPanel.add(temp_reg_dBitField);

		JCheckBox temp_reg_dBitCheck = new JCheckBox("BitField Configuration");
		temp_reg_dBitCheck.setSelected(true);
		temp_reg_dBitField.add(temp_reg_dBitCheck);
		JCheckBox temp_reg_dDataInputCheck = new JCheckBox("Data Input Configuration");
		temp_reg_dDataInputCheck.setSelected(false);

		JPanel temp_reg_dBitFieldPanel = new JPanel();
		temp_reg_dBitField.add(temp_reg_dBitFieldPanel);
		temp_reg_dBitFieldPanel.setLayout(new BoxLayout(temp_reg_dBitFieldPanel, BoxLayout.X_AXIS));

		JPanel temp_reg_dBitInputPanel = new JPanel();
		temp_reg_dBitField.add(temp_reg_dBitInputPanel);
		temp_reg_dBitInputPanel.setLayout(new BoxLayout(temp_reg_dBitInputPanel, BoxLayout.X_AXIS));
		temp_reg_dBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!temp_reg_dBitCheck.isSelected()) {
					for (Component component : getComponents(temp_reg_dBitFieldPanel)) {
						component.setEnabled(false);
					}
					temp_reg_dDataInputCheck.setSelected(true);
					temp_reg_dDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(temp_reg_dBitFieldPanel)) {
						component.setEnabled(true);
					}
					temp_reg_dDataInputCheck.setSelected(false);
					temp_reg_dDataInput.setEnabled(false);
				}
			}
		});

		temp_reg_dDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (temp_reg_dDataInputCheck.isSelected()) {
					for (Component component : getComponents(temp_reg_dBitFieldPanel)) {
						component.setEnabled(false);
					}
					temp_reg_dBitCheck.setSelected(false);
					temp_reg_dDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(temp_reg_dBitFieldPanel)) {
						component.setEnabled(true);
					}
					temp_reg_dBitCheck.setSelected(true);
					temp_reg_dDataInput.setEnabled(false);
				}
			}
		});
		Action temp_reg_daction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = temp_reg_dDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] temp_reg_dBitPanel = new JPanel[8];
		JLabel[] temp_reg_dBitLabel = new JLabel[8];
		JComboBox<Integer>[] temp_reg_dComboBoxList = new JComboBox[8];
		name = "temp_reg_d";
		labelTemp = temp_reg_dBitLabel;
		comboboxTemp = temp_reg_dComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			temp_reg_dBitPanel[i] = new JPanel();
			temp_reg_dBitPanel[i].setLayout(new BoxLayout(temp_reg_dBitPanel[i], BoxLayout.Y_AXIS));
			temp_reg_dBitFieldPanel.add(temp_reg_dBitPanel[i]);

			temp_reg_dBitLabel[i] = new JLabel("  ");
			temp_reg_dComboBoxList[i] = new JComboBox(selection);
			temp_reg_dComboBoxList[i].setEnabled(false);
			temp_reg_dComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) temp_reg_dComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			temp_reg_dBitPanel[i].add(temp_reg_dBitLabel[i]);
			temp_reg_dBitPanel[i].add(temp_reg_dComboBoxList[i]);
			temp_reg_dBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 8; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("temp_reg_d" + "[" + i + "]");
		}

		temp_reg_dBitField.add(temp_reg_dDataInputCheck);
		temp_reg_dBitField.add(temp_reg_dDataInput);
		temp_reg_dDataInput.addActionListener(temp_reg_daction);

		//final total panel
		panelTotal.add(temp_reg_dPanel);
		panelTotal.add(new JSeparator());

		JPanel util_runPanel = new JPanel();
		JPanel util_runGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel util_runRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel util_runBitField = new JPanel();
		JTextField util_runDataInput = new JTextField();
		util_runDataInput.setText("0x");
		util_runDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "util_run", TitledBorder.LEFT,
				TitledBorder.TOP);
		util_runPanel.setBorder(border1);
		util_runPanel.setLayout(new BoxLayout(util_runPanel, BoxLayout.Y_AXIS));

		//General info part
		util_runGeneralInfo.setBorder(border2);
		//util_runGeneralInfo.setLayout(new BoxLayout(util_runGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel util_runLabel = new JLabel("Name: " + "util_run");
		//util_runLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, util_runLabel.getMinimumSize().height));
		util_runGeneralInfo.add(util_runLabel);
		JLabel util_runShortNameLabel = new JLabel("shortName: " + "");
		util_runGeneralInfo.add(util_runShortNameLabel);
		JLabel util_runHiddenLabel = new JLabel("hidden: " + "false");
		util_runGeneralInfo.add(util_runHiddenLabel);
		util_runPanel.add(util_runGeneralInfo);
		//Register attribute part
		util_runRegAttributes.setBorder(border3);
		//util_runRegAttributes.setLayout(new BoxLayout(util_runRegAttributes, BoxLayout.Y_AXIS));
		util_runPanel.add(util_runRegAttributes);
		JLabel util_runOffsetLabel = new JLabel("Offset: " + "0x1b");
		util_runRegAttributes.add(util_runOffsetLabel);
		JLabel util_runRelOffsetLabel = new JLabel("Rel Offset: " + "0x1b");
		util_runRegAttributes.add(util_runRelOffsetLabel);
		JLabel util_runDataWidth = new JLabel("Rel Offset: " + "8");
		util_runRegAttributes.add(util_runDataWidth);
		JLabel util_runNoShadowLabel = new JLabel("No Shadow: ");
		util_runRegAttributes.add(util_runNoShadowLabel);
		JCheckBox util_runNoShadowCheckBox = new JCheckBox();
		util_runNoShadowCheckBox.setSelected(true);

		util_runRegAttributes.add(util_runNoShadowCheckBox);
		JLabel util_runMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		util_runRegAttributes.add(util_runMirrorSizeLabel);
		//BitField Overview

		util_runBitField.setBorder(border4);
		util_runBitField.setLayout(new BoxLayout(util_runBitField, BoxLayout.Y_AXIS));
		util_runPanel.add(util_runBitField);

		JCheckBox util_runBitCheck = new JCheckBox("BitField Configuration");
		util_runBitCheck.setSelected(true);
		util_runBitField.add(util_runBitCheck);
		JCheckBox util_runDataInputCheck = new JCheckBox("Data Input Configuration");
		util_runDataInputCheck.setSelected(false);

		JPanel util_runBitFieldPanel = new JPanel();
		util_runBitField.add(util_runBitFieldPanel);
		util_runBitFieldPanel.setLayout(new BoxLayout(util_runBitFieldPanel, BoxLayout.X_AXIS));

		JPanel util_runBitInputPanel = new JPanel();
		util_runBitField.add(util_runBitInputPanel);
		util_runBitInputPanel.setLayout(new BoxLayout(util_runBitInputPanel, BoxLayout.X_AXIS));
		util_runBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!util_runBitCheck.isSelected()) {
					for (Component component : getComponents(util_runBitFieldPanel)) {
						component.setEnabled(false);
					}
					util_runDataInputCheck.setSelected(true);
					util_runDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(util_runBitFieldPanel)) {
						component.setEnabled(true);
					}
					util_runDataInputCheck.setSelected(false);
					util_runDataInput.setEnabled(false);
				}
			}
		});

		util_runDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (util_runDataInputCheck.isSelected()) {
					for (Component component : getComponents(util_runBitFieldPanel)) {
						component.setEnabled(false);
					}
					util_runBitCheck.setSelected(false);
					util_runDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(util_runBitFieldPanel)) {
						component.setEnabled(true);
					}
					util_runBitCheck.setSelected(true);
					util_runDataInput.setEnabled(false);
				}
			}
		});
		Action util_runaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = util_runDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] util_runBitPanel = new JPanel[8];
		JLabel[] util_runBitLabel = new JLabel[8];
		JComboBox<Integer>[] util_runComboBoxList = new JComboBox[8];
		name = "util_run";
		labelTemp = util_runBitLabel;
		comboboxTemp = util_runComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			util_runBitPanel[i] = new JPanel();
			util_runBitPanel[i].setLayout(new BoxLayout(util_runBitPanel[i], BoxLayout.Y_AXIS));
			util_runBitFieldPanel.add(util_runBitPanel[i]);

			util_runBitLabel[i] = new JLabel("  ");
			util_runComboBoxList[i] = new JComboBox(selection);
			util_runComboBoxList[i].setEnabled(false);
			util_runComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) util_runComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			util_runBitPanel[i].add(util_runBitLabel[i]);
			util_runBitPanel[i].add(util_runComboBoxList[i]);
			util_runBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 1; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("util_run" + "[" + i + "]");
		}

		util_runBitField.add(util_runDataInputCheck);
		util_runBitField.add(util_runDataInput);
		util_runDataInput.addActionListener(util_runaction);

		//final total panel
		panelTotal.add(util_runPanel);
		panelTotal.add(new JSeparator());

		JPanel util_tdiePanel = new JPanel();
		JPanel util_tdieGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel util_tdieRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel util_tdieBitField = new JPanel();
		JTextField util_tdieDataInput = new JTextField();
		util_tdieDataInput.setText("0x");
		util_tdieDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "util_tdie", TitledBorder.LEFT,
				TitledBorder.TOP);
		util_tdiePanel.setBorder(border1);
		util_tdiePanel.setLayout(new BoxLayout(util_tdiePanel, BoxLayout.Y_AXIS));

		//General info part
		util_tdieGeneralInfo.setBorder(border2);
		//util_tdieGeneralInfo.setLayout(new BoxLayout(util_tdieGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel util_tdieLabel = new JLabel("Name: " + "util_tdie");
		//util_tdieLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, util_tdieLabel.getMinimumSize().height));
		util_tdieGeneralInfo.add(util_tdieLabel);
		JLabel util_tdieShortNameLabel = new JLabel("shortName: " + "");
		util_tdieGeneralInfo.add(util_tdieShortNameLabel);
		JLabel util_tdieHiddenLabel = new JLabel("hidden: " + "false");
		util_tdieGeneralInfo.add(util_tdieHiddenLabel);
		util_tdiePanel.add(util_tdieGeneralInfo);
		//Register attribute part
		util_tdieRegAttributes.setBorder(border3);
		//util_tdieRegAttributes.setLayout(new BoxLayout(util_tdieRegAttributes, BoxLayout.Y_AXIS));
		util_tdiePanel.add(util_tdieRegAttributes);
		JLabel util_tdieOffsetLabel = new JLabel("Offset: " + "0x1c");
		util_tdieRegAttributes.add(util_tdieOffsetLabel);
		JLabel util_tdieRelOffsetLabel = new JLabel("Rel Offset: " + "0x1c");
		util_tdieRegAttributes.add(util_tdieRelOffsetLabel);
		JLabel util_tdieDataWidth = new JLabel("Rel Offset: " + "16");
		util_tdieRegAttributes.add(util_tdieDataWidth);
		JLabel util_tdieNoShadowLabel = new JLabel("No Shadow: ");
		util_tdieRegAttributes.add(util_tdieNoShadowLabel);
		JCheckBox util_tdieNoShadowCheckBox = new JCheckBox();
		util_tdieNoShadowCheckBox.setSelected(true);

		util_tdieRegAttributes.add(util_tdieNoShadowCheckBox);
		JLabel util_tdieMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		util_tdieRegAttributes.add(util_tdieMirrorSizeLabel);
		//BitField Overview

		util_tdieBitField.setBorder(border4);
		util_tdieBitField.setLayout(new BoxLayout(util_tdieBitField, BoxLayout.Y_AXIS));
		util_tdiePanel.add(util_tdieBitField);

		JCheckBox util_tdieBitCheck = new JCheckBox("BitField Configuration");
		util_tdieBitCheck.setSelected(true);
		util_tdieBitField.add(util_tdieBitCheck);
		JCheckBox util_tdieDataInputCheck = new JCheckBox("Data Input Configuration");
		util_tdieDataInputCheck.setSelected(false);

		JPanel util_tdieBitFieldPanel = new JPanel();
		util_tdieBitField.add(util_tdieBitFieldPanel);
		util_tdieBitFieldPanel.setLayout(new BoxLayout(util_tdieBitFieldPanel, BoxLayout.X_AXIS));

		JPanel util_tdieBitInputPanel = new JPanel();
		util_tdieBitField.add(util_tdieBitInputPanel);
		util_tdieBitInputPanel.setLayout(new BoxLayout(util_tdieBitInputPanel, BoxLayout.X_AXIS));
		util_tdieBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!util_tdieBitCheck.isSelected()) {
					for (Component component : getComponents(util_tdieBitFieldPanel)) {
						component.setEnabled(false);
					}
					util_tdieDataInputCheck.setSelected(true);
					util_tdieDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(util_tdieBitFieldPanel)) {
						component.setEnabled(true);
					}
					util_tdieDataInputCheck.setSelected(false);
					util_tdieDataInput.setEnabled(false);
				}
			}
		});

		util_tdieDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (util_tdieDataInputCheck.isSelected()) {
					for (Component component : getComponents(util_tdieBitFieldPanel)) {
						component.setEnabled(false);
					}
					util_tdieBitCheck.setSelected(false);
					util_tdieDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(util_tdieBitFieldPanel)) {
						component.setEnabled(true);
					}
					util_tdieBitCheck.setSelected(true);
					util_tdieDataInput.setEnabled(false);
				}
			}
		});
		Action util_tdieaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = util_tdieDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 16)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 16) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] util_tdieBitPanel = new JPanel[16];
		JLabel[] util_tdieBitLabel = new JLabel[16];
		JComboBox<Integer>[] util_tdieComboBoxList = new JComboBox[16];
		name = "util_tdie";
		labelTemp = util_tdieBitLabel;
		comboboxTemp = util_tdieComboBoxList;
		dataWidth = 16;
		for (int i = 0; i < 16; i++) {
			util_tdieBitPanel[i] = new JPanel();
			util_tdieBitPanel[i].setLayout(new BoxLayout(util_tdieBitPanel[i], BoxLayout.Y_AXIS));
			util_tdieBitFieldPanel.add(util_tdieBitPanel[i]);

			util_tdieBitLabel[i] = new JLabel("  ");
			util_tdieComboBoxList[i] = new JComboBox(selection);
			util_tdieComboBoxList[i].setEnabled(false);
			util_tdieComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 16; i++) {
						sendData = sendData * 2 + (int) util_tdieComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			util_tdieBitPanel[i].add(util_tdieBitLabel[i]);
			util_tdieBitPanel[i].add(util_tdieComboBoxList[i]);
			util_tdieBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 16; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("util_tdie" + "[" + i + "]");
		}

		util_tdieBitField.add(util_tdieDataInputCheck);
		util_tdieBitField.add(util_tdieDataInput);
		util_tdieDataInput.addActionListener(util_tdieaction);

		//final total panel
		panelTotal.add(util_tdiePanel);
		panelTotal.add(new JSeparator());

		JPanel util_vsupPanel = new JPanel();
		JPanel util_vsupGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel util_vsupRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel util_vsupBitField = new JPanel();
		JTextField util_vsupDataInput = new JTextField();
		util_vsupDataInput.setText("0x");
		util_vsupDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "util_vsup", TitledBorder.LEFT,
				TitledBorder.TOP);
		util_vsupPanel.setBorder(border1);
		util_vsupPanel.setLayout(new BoxLayout(util_vsupPanel, BoxLayout.Y_AXIS));

		//General info part
		util_vsupGeneralInfo.setBorder(border2);
		//util_vsupGeneralInfo.setLayout(new BoxLayout(util_vsupGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel util_vsupLabel = new JLabel("Name: " + "util_vsup");
		//util_vsupLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, util_vsupLabel.getMinimumSize().height));
		util_vsupGeneralInfo.add(util_vsupLabel);
		JLabel util_vsupShortNameLabel = new JLabel("shortName: " + "");
		util_vsupGeneralInfo.add(util_vsupShortNameLabel);
		JLabel util_vsupHiddenLabel = new JLabel("hidden: " + "false");
		util_vsupGeneralInfo.add(util_vsupHiddenLabel);
		util_vsupPanel.add(util_vsupGeneralInfo);
		//Register attribute part
		util_vsupRegAttributes.setBorder(border3);
		//util_vsupRegAttributes.setLayout(new BoxLayout(util_vsupRegAttributes, BoxLayout.Y_AXIS));
		util_vsupPanel.add(util_vsupRegAttributes);
		JLabel util_vsupOffsetLabel = new JLabel("Offset: " + "0x1e");
		util_vsupRegAttributes.add(util_vsupOffsetLabel);
		JLabel util_vsupRelOffsetLabel = new JLabel("Rel Offset: " + "0x1e");
		util_vsupRegAttributes.add(util_vsupRelOffsetLabel);
		JLabel util_vsupDataWidth = new JLabel("Rel Offset: " + "16");
		util_vsupRegAttributes.add(util_vsupDataWidth);
		JLabel util_vsupNoShadowLabel = new JLabel("No Shadow: ");
		util_vsupRegAttributes.add(util_vsupNoShadowLabel);
		JCheckBox util_vsupNoShadowCheckBox = new JCheckBox();
		util_vsupNoShadowCheckBox.setSelected(true);

		util_vsupRegAttributes.add(util_vsupNoShadowCheckBox);
		JLabel util_vsupMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		util_vsupRegAttributes.add(util_vsupMirrorSizeLabel);
		//BitField Overview

		util_vsupBitField.setBorder(border4);
		util_vsupBitField.setLayout(new BoxLayout(util_vsupBitField, BoxLayout.Y_AXIS));
		util_vsupPanel.add(util_vsupBitField);

		JCheckBox util_vsupBitCheck = new JCheckBox("BitField Configuration");
		util_vsupBitCheck.setSelected(true);
		util_vsupBitField.add(util_vsupBitCheck);
		JCheckBox util_vsupDataInputCheck = new JCheckBox("Data Input Configuration");
		util_vsupDataInputCheck.setSelected(false);

		JPanel util_vsupBitFieldPanel = new JPanel();
		util_vsupBitField.add(util_vsupBitFieldPanel);
		util_vsupBitFieldPanel.setLayout(new BoxLayout(util_vsupBitFieldPanel, BoxLayout.X_AXIS));

		JPanel util_vsupBitInputPanel = new JPanel();
		util_vsupBitField.add(util_vsupBitInputPanel);
		util_vsupBitInputPanel.setLayout(new BoxLayout(util_vsupBitInputPanel, BoxLayout.X_AXIS));
		util_vsupBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!util_vsupBitCheck.isSelected()) {
					for (Component component : getComponents(util_vsupBitFieldPanel)) {
						component.setEnabled(false);
					}
					util_vsupDataInputCheck.setSelected(true);
					util_vsupDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(util_vsupBitFieldPanel)) {
						component.setEnabled(true);
					}
					util_vsupDataInputCheck.setSelected(false);
					util_vsupDataInput.setEnabled(false);
				}
			}
		});

		util_vsupDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (util_vsupDataInputCheck.isSelected()) {
					for (Component component : getComponents(util_vsupBitFieldPanel)) {
						component.setEnabled(false);
					}
					util_vsupBitCheck.setSelected(false);
					util_vsupDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(util_vsupBitFieldPanel)) {
						component.setEnabled(true);
					}
					util_vsupBitCheck.setSelected(true);
					util_vsupDataInput.setEnabled(false);
				}
			}
		});
		Action util_vsupaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = util_vsupDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 16)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 16) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] util_vsupBitPanel = new JPanel[16];
		JLabel[] util_vsupBitLabel = new JLabel[16];
		JComboBox<Integer>[] util_vsupComboBoxList = new JComboBox[16];
		name = "util_vsup";
		labelTemp = util_vsupBitLabel;
		comboboxTemp = util_vsupComboBoxList;
		dataWidth = 16;
		for (int i = 0; i < 16; i++) {
			util_vsupBitPanel[i] = new JPanel();
			util_vsupBitPanel[i].setLayout(new BoxLayout(util_vsupBitPanel[i], BoxLayout.Y_AXIS));
			util_vsupBitFieldPanel.add(util_vsupBitPanel[i]);

			util_vsupBitLabel[i] = new JLabel("  ");
			util_vsupComboBoxList[i] = new JComboBox(selection);
			util_vsupComboBoxList[i].setEnabled(false);
			util_vsupComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 16; i++) {
						sendData = sendData * 2 + (int) util_vsupComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			util_vsupBitPanel[i].add(util_vsupBitLabel[i]);
			util_vsupBitPanel[i].add(util_vsupComboBoxList[i]);
			util_vsupBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 16; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("util_vsup" + "[" + i + "]");
		}

		util_vsupBitField.add(util_vsupDataInputCheck);
		util_vsupBitField.add(util_vsupDataInput);
		util_vsupDataInput.addActionListener(util_vsupaction);

		//final total panel
		panelTotal.add(util_vsupPanel);
		panelTotal.add(new JSeparator());

		JPanel int_enPanel = new JPanel();
		JPanel int_enGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel int_enRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel int_enBitField = new JPanel();
		JTextField int_enDataInput = new JTextField();
		int_enDataInput.setText("0x");
		int_enDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "int_en", TitledBorder.LEFT, TitledBorder.TOP);
		int_enPanel.setBorder(border1);
		int_enPanel.setLayout(new BoxLayout(int_enPanel, BoxLayout.Y_AXIS));

		//General info part
		int_enGeneralInfo.setBorder(border2);
		//int_enGeneralInfo.setLayout(new BoxLayout(int_enGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel int_enLabel = new JLabel("Name: " + "int_en");
		//int_enLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, int_enLabel.getMinimumSize().height));
		int_enGeneralInfo.add(int_enLabel);
		JLabel int_enShortNameLabel = new JLabel("shortName: " + "");
		int_enGeneralInfo.add(int_enShortNameLabel);
		JLabel int_enHiddenLabel = new JLabel("hidden: " + "false");
		int_enGeneralInfo.add(int_enHiddenLabel);
		int_enPanel.add(int_enGeneralInfo);
		//Register attribute part
		int_enRegAttributes.setBorder(border3);
		//int_enRegAttributes.setLayout(new BoxLayout(int_enRegAttributes, BoxLayout.Y_AXIS));
		int_enPanel.add(int_enRegAttributes);
		JLabel int_enOffsetLabel = new JLabel("Offset: " + "0x20");
		int_enRegAttributes.add(int_enOffsetLabel);
		JLabel int_enRelOffsetLabel = new JLabel("Rel Offset: " + "0x20");
		int_enRegAttributes.add(int_enRelOffsetLabel);
		JLabel int_enDataWidth = new JLabel("Rel Offset: " + "8");
		int_enRegAttributes.add(int_enDataWidth);
		JLabel int_enNoShadowLabel = new JLabel("No Shadow: ");
		int_enRegAttributes.add(int_enNoShadowLabel);
		JCheckBox int_enNoShadowCheckBox = new JCheckBox();
		int_enNoShadowCheckBox.setSelected(true);

		int_enRegAttributes.add(int_enNoShadowCheckBox);
		JLabel int_enMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		int_enRegAttributes.add(int_enMirrorSizeLabel);
		//BitField Overview

		int_enBitField.setBorder(border4);
		int_enBitField.setLayout(new BoxLayout(int_enBitField, BoxLayout.Y_AXIS));
		int_enPanel.add(int_enBitField);

		JCheckBox int_enBitCheck = new JCheckBox("BitField Configuration");
		int_enBitCheck.setSelected(true);
		int_enBitField.add(int_enBitCheck);
		JCheckBox int_enDataInputCheck = new JCheckBox("Data Input Configuration");
		int_enDataInputCheck.setSelected(false);

		JPanel int_enBitFieldPanel = new JPanel();
		int_enBitField.add(int_enBitFieldPanel);
		int_enBitFieldPanel.setLayout(new BoxLayout(int_enBitFieldPanel, BoxLayout.X_AXIS));

		JPanel int_enBitInputPanel = new JPanel();
		int_enBitField.add(int_enBitInputPanel);
		int_enBitInputPanel.setLayout(new BoxLayout(int_enBitInputPanel, BoxLayout.X_AXIS));
		int_enBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!int_enBitCheck.isSelected()) {
					for (Component component : getComponents(int_enBitFieldPanel)) {
						component.setEnabled(false);
					}
					int_enDataInputCheck.setSelected(true);
					int_enDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(int_enBitFieldPanel)) {
						component.setEnabled(true);
					}
					int_enDataInputCheck.setSelected(false);
					int_enDataInput.setEnabled(false);
				}
			}
		});

		int_enDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (int_enDataInputCheck.isSelected()) {
					for (Component component : getComponents(int_enBitFieldPanel)) {
						component.setEnabled(false);
					}
					int_enBitCheck.setSelected(false);
					int_enDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(int_enBitFieldPanel)) {
						component.setEnabled(true);
					}
					int_enBitCheck.setSelected(true);
					int_enDataInput.setEnabled(false);
				}
			}
		});
		Action int_enaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = int_enDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] int_enBitPanel = new JPanel[8];
		JLabel[] int_enBitLabel = new JLabel[8];
		JComboBox<Integer>[] int_enComboBoxList = new JComboBox[8];
		name = "int_en";
		labelTemp = int_enBitLabel;
		comboboxTemp = int_enComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			int_enBitPanel[i] = new JPanel();
			int_enBitPanel[i].setLayout(new BoxLayout(int_enBitPanel[i], BoxLayout.Y_AXIS));
			int_enBitFieldPanel.add(int_enBitPanel[i]);

			int_enBitLabel[i] = new JLabel("  ");
			int_enComboBoxList[i] = new JComboBox(selection);
			int_enComboBoxList[i].setEnabled(false);
			int_enComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) int_enComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			int_enBitPanel[i].add(int_enBitLabel[i]);
			int_enBitPanel[i].add(int_enComboBoxList[i]);
			int_enBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 1; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("meas_int_en" + "[" + i + "]");
		}

		for (int index = dataWidth - 1 - 1, i = 0; i < 1; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("util_int_en" + "[" + i + "]");
		}

		int_enBitField.add(int_enDataInputCheck);
		int_enBitField.add(int_enDataInput);
		int_enDataInput.addActionListener(int_enaction);

		//final total panel
		panelTotal.add(int_enPanel);
		panelTotal.add(new JSeparator());

		JPanel int_stsPanel = new JPanel();
		JPanel int_stsGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel int_stsRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel int_stsBitField = new JPanel();
		JTextField int_stsDataInput = new JTextField();
		int_stsDataInput.setText("0x");
		int_stsDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "int_sts", TitledBorder.LEFT,
				TitledBorder.TOP);
		int_stsPanel.setBorder(border1);
		int_stsPanel.setLayout(new BoxLayout(int_stsPanel, BoxLayout.Y_AXIS));

		//General info part
		int_stsGeneralInfo.setBorder(border2);
		//int_stsGeneralInfo.setLayout(new BoxLayout(int_stsGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel int_stsLabel = new JLabel("Name: " + "int_sts");
		//int_stsLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, int_stsLabel.getMinimumSize().height));
		int_stsGeneralInfo.add(int_stsLabel);
		JLabel int_stsShortNameLabel = new JLabel("shortName: " + "");
		int_stsGeneralInfo.add(int_stsShortNameLabel);
		JLabel int_stsHiddenLabel = new JLabel("hidden: " + "false");
		int_stsGeneralInfo.add(int_stsHiddenLabel);
		int_stsPanel.add(int_stsGeneralInfo);
		//Register attribute part
		int_stsRegAttributes.setBorder(border3);
		//int_stsRegAttributes.setLayout(new BoxLayout(int_stsRegAttributes, BoxLayout.Y_AXIS));
		int_stsPanel.add(int_stsRegAttributes);
		JLabel int_stsOffsetLabel = new JLabel("Offset: " + "0x21");
		int_stsRegAttributes.add(int_stsOffsetLabel);
		JLabel int_stsRelOffsetLabel = new JLabel("Rel Offset: " + "0x21");
		int_stsRegAttributes.add(int_stsRelOffsetLabel);
		JLabel int_stsDataWidth = new JLabel("Rel Offset: " + "8");
		int_stsRegAttributes.add(int_stsDataWidth);
		JLabel int_stsNoShadowLabel = new JLabel("No Shadow: ");
		int_stsRegAttributes.add(int_stsNoShadowLabel);
		JCheckBox int_stsNoShadowCheckBox = new JCheckBox();
		int_stsNoShadowCheckBox.setSelected(true);

		int_stsRegAttributes.add(int_stsNoShadowCheckBox);
		JLabel int_stsMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		int_stsRegAttributes.add(int_stsMirrorSizeLabel);
		//BitField Overview

		int_stsBitField.setBorder(border4);
		int_stsBitField.setLayout(new BoxLayout(int_stsBitField, BoxLayout.Y_AXIS));
		int_stsPanel.add(int_stsBitField);

		JCheckBox int_stsBitCheck = new JCheckBox("BitField Configuration");
		int_stsBitCheck.setSelected(true);
		int_stsBitField.add(int_stsBitCheck);
		JCheckBox int_stsDataInputCheck = new JCheckBox("Data Input Configuration");
		int_stsDataInputCheck.setSelected(false);

		JPanel int_stsBitFieldPanel = new JPanel();
		int_stsBitField.add(int_stsBitFieldPanel);
		int_stsBitFieldPanel.setLayout(new BoxLayout(int_stsBitFieldPanel, BoxLayout.X_AXIS));

		JPanel int_stsBitInputPanel = new JPanel();
		int_stsBitField.add(int_stsBitInputPanel);
		int_stsBitInputPanel.setLayout(new BoxLayout(int_stsBitInputPanel, BoxLayout.X_AXIS));
		int_stsBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!int_stsBitCheck.isSelected()) {
					for (Component component : getComponents(int_stsBitFieldPanel)) {
						component.setEnabled(false);
					}
					int_stsDataInputCheck.setSelected(true);
					int_stsDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(int_stsBitFieldPanel)) {
						component.setEnabled(true);
					}
					int_stsDataInputCheck.setSelected(false);
					int_stsDataInput.setEnabled(false);
				}
			}
		});

		int_stsDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (int_stsDataInputCheck.isSelected()) {
					for (Component component : getComponents(int_stsBitFieldPanel)) {
						component.setEnabled(false);
					}
					int_stsBitCheck.setSelected(false);
					int_stsDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(int_stsBitFieldPanel)) {
						component.setEnabled(true);
					}
					int_stsBitCheck.setSelected(true);
					int_stsDataInput.setEnabled(false);
				}
			}
		});
		Action int_stsaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = int_stsDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] int_stsBitPanel = new JPanel[8];
		JLabel[] int_stsBitLabel = new JLabel[8];
		JComboBox<Integer>[] int_stsComboBoxList = new JComboBox[8];
		name = "int_sts";
		labelTemp = int_stsBitLabel;
		comboboxTemp = int_stsComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			int_stsBitPanel[i] = new JPanel();
			int_stsBitPanel[i].setLayout(new BoxLayout(int_stsBitPanel[i], BoxLayout.Y_AXIS));
			int_stsBitFieldPanel.add(int_stsBitPanel[i]);

			int_stsBitLabel[i] = new JLabel("  ");
			int_stsComboBoxList[i] = new JComboBox(selection);
			int_stsComboBoxList[i].setEnabled(false);
			int_stsComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) int_stsComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			int_stsBitPanel[i].add(int_stsBitLabel[i]);
			int_stsBitPanel[i].add(int_stsComboBoxList[i]);
			int_stsBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 1; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("meas_int_sts" + "[" + i + "]");
		}

		for (int index = dataWidth - 1 - 1, i = 0; i < 1; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("util_int_sts" + "[" + i + "]");
		}

		int_stsBitField.add(int_stsDataInputCheck);
		int_stsBitField.add(int_stsDataInput);
		int_stsDataInput.addActionListener(int_stsaction);

		//final total panel
		panelTotal.add(int_stsPanel);
		panelTotal.add(new JSeparator());

		JPanel nvm_addrPanel = new JPanel();
		JPanel nvm_addrGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel nvm_addrRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel nvm_addrBitField = new JPanel();
		JTextField nvm_addrDataInput = new JTextField();
		nvm_addrDataInput.setText("0x");
		nvm_addrDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "nvm_addr", TitledBorder.LEFT,
				TitledBorder.TOP);
		nvm_addrPanel.setBorder(border1);
		nvm_addrPanel.setLayout(new BoxLayout(nvm_addrPanel, BoxLayout.Y_AXIS));

		//General info part
		nvm_addrGeneralInfo.setBorder(border2);
		//nvm_addrGeneralInfo.setLayout(new BoxLayout(nvm_addrGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel nvm_addrLabel = new JLabel("Name: " + "nvm_addr");
		//nvm_addrLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, nvm_addrLabel.getMinimumSize().height));
		nvm_addrGeneralInfo.add(nvm_addrLabel);
		JLabel nvm_addrShortNameLabel = new JLabel("shortName: " + "");
		nvm_addrGeneralInfo.add(nvm_addrShortNameLabel);
		JLabel nvm_addrHiddenLabel = new JLabel("hidden: " + "false");
		nvm_addrGeneralInfo.add(nvm_addrHiddenLabel);
		nvm_addrPanel.add(nvm_addrGeneralInfo);
		//Register attribute part
		nvm_addrRegAttributes.setBorder(border3);
		//nvm_addrRegAttributes.setLayout(new BoxLayout(nvm_addrRegAttributes, BoxLayout.Y_AXIS));
		nvm_addrPanel.add(nvm_addrRegAttributes);
		JLabel nvm_addrOffsetLabel = new JLabel("Offset: " + "0x22");
		nvm_addrRegAttributes.add(nvm_addrOffsetLabel);
		JLabel nvm_addrRelOffsetLabel = new JLabel("Rel Offset: " + "0x22");
		nvm_addrRegAttributes.add(nvm_addrRelOffsetLabel);
		JLabel nvm_addrDataWidth = new JLabel("Rel Offset: " + "16");
		nvm_addrRegAttributes.add(nvm_addrDataWidth);
		JLabel nvm_addrNoShadowLabel = new JLabel("No Shadow: ");
		nvm_addrRegAttributes.add(nvm_addrNoShadowLabel);
		JCheckBox nvm_addrNoShadowCheckBox = new JCheckBox();
		nvm_addrNoShadowCheckBox.setSelected(true);

		nvm_addrRegAttributes.add(nvm_addrNoShadowCheckBox);
		JLabel nvm_addrMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		nvm_addrRegAttributes.add(nvm_addrMirrorSizeLabel);
		//BitField Overview

		nvm_addrBitField.setBorder(border4);
		nvm_addrBitField.setLayout(new BoxLayout(nvm_addrBitField, BoxLayout.Y_AXIS));
		nvm_addrPanel.add(nvm_addrBitField);

		JCheckBox nvm_addrBitCheck = new JCheckBox("BitField Configuration");
		nvm_addrBitCheck.setSelected(true);
		nvm_addrBitField.add(nvm_addrBitCheck);
		JCheckBox nvm_addrDataInputCheck = new JCheckBox("Data Input Configuration");
		nvm_addrDataInputCheck.setSelected(false);

		JPanel nvm_addrBitFieldPanel = new JPanel();
		nvm_addrBitField.add(nvm_addrBitFieldPanel);
		nvm_addrBitFieldPanel.setLayout(new BoxLayout(nvm_addrBitFieldPanel, BoxLayout.X_AXIS));

		JPanel nvm_addrBitInputPanel = new JPanel();
		nvm_addrBitField.add(nvm_addrBitInputPanel);
		nvm_addrBitInputPanel.setLayout(new BoxLayout(nvm_addrBitInputPanel, BoxLayout.X_AXIS));
		nvm_addrBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!nvm_addrBitCheck.isSelected()) {
					for (Component component : getComponents(nvm_addrBitFieldPanel)) {
						component.setEnabled(false);
					}
					nvm_addrDataInputCheck.setSelected(true);
					nvm_addrDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(nvm_addrBitFieldPanel)) {
						component.setEnabled(true);
					}
					nvm_addrDataInputCheck.setSelected(false);
					nvm_addrDataInput.setEnabled(false);
				}
			}
		});

		nvm_addrDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nvm_addrDataInputCheck.isSelected()) {
					for (Component component : getComponents(nvm_addrBitFieldPanel)) {
						component.setEnabled(false);
					}
					nvm_addrBitCheck.setSelected(false);
					nvm_addrDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(nvm_addrBitFieldPanel)) {
						component.setEnabled(true);
					}
					nvm_addrBitCheck.setSelected(true);
					nvm_addrDataInput.setEnabled(false);
				}
			}
		});
		Action nvm_addraction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = nvm_addrDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 16)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 16) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] nvm_addrBitPanel = new JPanel[16];
		JLabel[] nvm_addrBitLabel = new JLabel[16];
		JComboBox<Integer>[] nvm_addrComboBoxList = new JComboBox[16];
		name = "nvm_addr";
		labelTemp = nvm_addrBitLabel;
		comboboxTemp = nvm_addrComboBoxList;
		dataWidth = 16;
		for (int i = 0; i < 16; i++) {
			nvm_addrBitPanel[i] = new JPanel();
			nvm_addrBitPanel[i].setLayout(new BoxLayout(nvm_addrBitPanel[i], BoxLayout.Y_AXIS));
			nvm_addrBitFieldPanel.add(nvm_addrBitPanel[i]);

			nvm_addrBitLabel[i] = new JLabel("  ");
			nvm_addrComboBoxList[i] = new JComboBox(selection);
			nvm_addrComboBoxList[i].setEnabled(false);
			nvm_addrComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 16; i++) {
						sendData = sendData * 2 + (int) nvm_addrComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			nvm_addrBitPanel[i].add(nvm_addrBitLabel[i]);
			nvm_addrBitPanel[i].add(nvm_addrComboBoxList[i]);
			nvm_addrBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 10; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("nvm_addr" + "[" + i + "]");
		}

		nvm_addrBitField.add(nvm_addrDataInputCheck);
		nvm_addrBitField.add(nvm_addrDataInput);
		nvm_addrDataInput.addActionListener(nvm_addraction);

		//final total panel
		panelTotal.add(nvm_addrPanel);
		panelTotal.add(new JSeparator());

		JPanel nvm_dataPanel = new JPanel();
		JPanel nvm_dataGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel nvm_dataRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel nvm_dataBitField = new JPanel();
		JTextField nvm_dataDataInput = new JTextField();
		nvm_dataDataInput.setText("0x");
		nvm_dataDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "nvm_data", TitledBorder.LEFT,
				TitledBorder.TOP);
		nvm_dataPanel.setBorder(border1);
		nvm_dataPanel.setLayout(new BoxLayout(nvm_dataPanel, BoxLayout.Y_AXIS));

		//General info part
		nvm_dataGeneralInfo.setBorder(border2);
		//nvm_dataGeneralInfo.setLayout(new BoxLayout(nvm_dataGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel nvm_dataLabel = new JLabel("Name: " + "nvm_data");
		//nvm_dataLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, nvm_dataLabel.getMinimumSize().height));
		nvm_dataGeneralInfo.add(nvm_dataLabel);
		JLabel nvm_dataShortNameLabel = new JLabel("shortName: " + "");
		nvm_dataGeneralInfo.add(nvm_dataShortNameLabel);
		JLabel nvm_dataHiddenLabel = new JLabel("hidden: " + "false");
		nvm_dataGeneralInfo.add(nvm_dataHiddenLabel);
		nvm_dataPanel.add(nvm_dataGeneralInfo);
		//Register attribute part
		nvm_dataRegAttributes.setBorder(border3);
		//nvm_dataRegAttributes.setLayout(new BoxLayout(nvm_dataRegAttributes, BoxLayout.Y_AXIS));
		nvm_dataPanel.add(nvm_dataRegAttributes);
		JLabel nvm_dataOffsetLabel = new JLabel("Offset: " + "0x24");
		nvm_dataRegAttributes.add(nvm_dataOffsetLabel);
		JLabel nvm_dataRelOffsetLabel = new JLabel("Rel Offset: " + "0x24");
		nvm_dataRegAttributes.add(nvm_dataRelOffsetLabel);
		JLabel nvm_dataDataWidth = new JLabel("Rel Offset: " + "8");
		nvm_dataRegAttributes.add(nvm_dataDataWidth);
		JLabel nvm_dataNoShadowLabel = new JLabel("No Shadow: ");
		nvm_dataRegAttributes.add(nvm_dataNoShadowLabel);
		JCheckBox nvm_dataNoShadowCheckBox = new JCheckBox();
		nvm_dataNoShadowCheckBox.setSelected(true);

		nvm_dataRegAttributes.add(nvm_dataNoShadowCheckBox);
		JLabel nvm_dataMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		nvm_dataRegAttributes.add(nvm_dataMirrorSizeLabel);
		//BitField Overview

		nvm_dataBitField.setBorder(border4);
		nvm_dataBitField.setLayout(new BoxLayout(nvm_dataBitField, BoxLayout.Y_AXIS));
		nvm_dataPanel.add(nvm_dataBitField);

		JCheckBox nvm_dataBitCheck = new JCheckBox("BitField Configuration");
		nvm_dataBitCheck.setSelected(true);
		nvm_dataBitField.add(nvm_dataBitCheck);
		JCheckBox nvm_dataDataInputCheck = new JCheckBox("Data Input Configuration");
		nvm_dataDataInputCheck.setSelected(false);

		JPanel nvm_dataBitFieldPanel = new JPanel();
		nvm_dataBitField.add(nvm_dataBitFieldPanel);
		nvm_dataBitFieldPanel.setLayout(new BoxLayout(nvm_dataBitFieldPanel, BoxLayout.X_AXIS));

		JPanel nvm_dataBitInputPanel = new JPanel();
		nvm_dataBitField.add(nvm_dataBitInputPanel);
		nvm_dataBitInputPanel.setLayout(new BoxLayout(nvm_dataBitInputPanel, BoxLayout.X_AXIS));
		nvm_dataBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!nvm_dataBitCheck.isSelected()) {
					for (Component component : getComponents(nvm_dataBitFieldPanel)) {
						component.setEnabled(false);
					}
					nvm_dataDataInputCheck.setSelected(true);
					nvm_dataDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(nvm_dataBitFieldPanel)) {
						component.setEnabled(true);
					}
					nvm_dataDataInputCheck.setSelected(false);
					nvm_dataDataInput.setEnabled(false);
				}
			}
		});

		nvm_dataDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nvm_dataDataInputCheck.isSelected()) {
					for (Component component : getComponents(nvm_dataBitFieldPanel)) {
						component.setEnabled(false);
					}
					nvm_dataBitCheck.setSelected(false);
					nvm_dataDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(nvm_dataBitFieldPanel)) {
						component.setEnabled(true);
					}
					nvm_dataBitCheck.setSelected(true);
					nvm_dataDataInput.setEnabled(false);
				}
			}
		});
		Action nvm_dataaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = nvm_dataDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] nvm_dataBitPanel = new JPanel[8];
		JLabel[] nvm_dataBitLabel = new JLabel[8];
		JComboBox<Integer>[] nvm_dataComboBoxList = new JComboBox[8];
		name = "nvm_data";
		labelTemp = nvm_dataBitLabel;
		comboboxTemp = nvm_dataComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			nvm_dataBitPanel[i] = new JPanel();
			nvm_dataBitPanel[i].setLayout(new BoxLayout(nvm_dataBitPanel[i], BoxLayout.Y_AXIS));
			nvm_dataBitFieldPanel.add(nvm_dataBitPanel[i]);

			nvm_dataBitLabel[i] = new JLabel("  ");
			nvm_dataComboBoxList[i] = new JComboBox(selection);
			nvm_dataComboBoxList[i].setEnabled(false);
			nvm_dataComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) nvm_dataComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			nvm_dataBitPanel[i].add(nvm_dataBitLabel[i]);
			nvm_dataBitPanel[i].add(nvm_dataComboBoxList[i]);
			nvm_dataBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 8; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("nvm_data" + "[" + i + "]");
		}

		nvm_dataBitField.add(nvm_dataDataInputCheck);
		nvm_dataBitField.add(nvm_dataDataInput);
		nvm_dataDataInput.addActionListener(nvm_dataaction);

		//final total panel
		panelTotal.add(nvm_dataPanel);
		panelTotal.add(new JSeparator());

		JPanel meas_data_fifo_statusPanel = new JPanel();
		JPanel meas_data_fifo_statusGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel meas_data_fifo_statusRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel meas_data_fifo_statusBitField = new JPanel();
		JTextField meas_data_fifo_statusDataInput = new JTextField();
		meas_data_fifo_statusDataInput.setText("0x");
		meas_data_fifo_statusDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "meas_data_fifo_status", TitledBorder.LEFT,
				TitledBorder.TOP);
		meas_data_fifo_statusPanel.setBorder(border1);
		meas_data_fifo_statusPanel.setLayout(new BoxLayout(meas_data_fifo_statusPanel, BoxLayout.Y_AXIS));

		//General info part
		meas_data_fifo_statusGeneralInfo.setBorder(border2);
		//meas_data_fifo_statusGeneralInfo.setLayout(new BoxLayout(meas_data_fifo_statusGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel meas_data_fifo_statusLabel = new JLabel("Name: " + "meas_data_fifo_status");
		//meas_data_fifo_statusLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, meas_data_fifo_statusLabel.getMinimumSize().height));
		meas_data_fifo_statusGeneralInfo.add(meas_data_fifo_statusLabel);
		JLabel meas_data_fifo_statusShortNameLabel = new JLabel("shortName: " + "");
		meas_data_fifo_statusGeneralInfo.add(meas_data_fifo_statusShortNameLabel);
		JLabel meas_data_fifo_statusHiddenLabel = new JLabel("hidden: " + "false");
		meas_data_fifo_statusGeneralInfo.add(meas_data_fifo_statusHiddenLabel);
		meas_data_fifo_statusPanel.add(meas_data_fifo_statusGeneralInfo);
		//Register attribute part
		meas_data_fifo_statusRegAttributes.setBorder(border3);
		//meas_data_fifo_statusRegAttributes.setLayout(new BoxLayout(meas_data_fifo_statusRegAttributes, BoxLayout.Y_AXIS));
		meas_data_fifo_statusPanel.add(meas_data_fifo_statusRegAttributes);
		JLabel meas_data_fifo_statusOffsetLabel = new JLabel("Offset: " + "0x25");
		meas_data_fifo_statusRegAttributes.add(meas_data_fifo_statusOffsetLabel);
		JLabel meas_data_fifo_statusRelOffsetLabel = new JLabel("Rel Offset: " + "0x25");
		meas_data_fifo_statusRegAttributes.add(meas_data_fifo_statusRelOffsetLabel);
		JLabel meas_data_fifo_statusDataWidth = new JLabel("Rel Offset: " + "8");
		meas_data_fifo_statusRegAttributes.add(meas_data_fifo_statusDataWidth);
		JLabel meas_data_fifo_statusNoShadowLabel = new JLabel("No Shadow: ");
		meas_data_fifo_statusRegAttributes.add(meas_data_fifo_statusNoShadowLabel);
		JCheckBox meas_data_fifo_statusNoShadowCheckBox = new JCheckBox();
		meas_data_fifo_statusNoShadowCheckBox.setSelected(true);

		meas_data_fifo_statusRegAttributes.add(meas_data_fifo_statusNoShadowCheckBox);
		JLabel meas_data_fifo_statusMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		meas_data_fifo_statusRegAttributes.add(meas_data_fifo_statusMirrorSizeLabel);
		//BitField Overview

		meas_data_fifo_statusBitField.setBorder(border4);
		meas_data_fifo_statusBitField.setLayout(new BoxLayout(meas_data_fifo_statusBitField, BoxLayout.Y_AXIS));
		meas_data_fifo_statusPanel.add(meas_data_fifo_statusBitField);

		JCheckBox meas_data_fifo_statusBitCheck = new JCheckBox("BitField Configuration");
		meas_data_fifo_statusBitCheck.setSelected(true);
		meas_data_fifo_statusBitField.add(meas_data_fifo_statusBitCheck);
		JCheckBox meas_data_fifo_statusDataInputCheck = new JCheckBox("Data Input Configuration");
		meas_data_fifo_statusDataInputCheck.setSelected(false);

		JPanel meas_data_fifo_statusBitFieldPanel = new JPanel();
		meas_data_fifo_statusBitField.add(meas_data_fifo_statusBitFieldPanel);
		meas_data_fifo_statusBitFieldPanel
				.setLayout(new BoxLayout(meas_data_fifo_statusBitFieldPanel, BoxLayout.X_AXIS));

		JPanel meas_data_fifo_statusBitInputPanel = new JPanel();
		meas_data_fifo_statusBitField.add(meas_data_fifo_statusBitInputPanel);
		meas_data_fifo_statusBitInputPanel
				.setLayout(new BoxLayout(meas_data_fifo_statusBitInputPanel, BoxLayout.X_AXIS));
		meas_data_fifo_statusBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!meas_data_fifo_statusBitCheck.isSelected()) {
					for (Component component : getComponents(meas_data_fifo_statusBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_data_fifo_statusDataInputCheck.setSelected(true);
					meas_data_fifo_statusDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_data_fifo_statusBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_data_fifo_statusDataInputCheck.setSelected(false);
					meas_data_fifo_statusDataInput.setEnabled(false);
				}
			}
		});

		meas_data_fifo_statusDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (meas_data_fifo_statusDataInputCheck.isSelected()) {
					for (Component component : getComponents(meas_data_fifo_statusBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_data_fifo_statusBitCheck.setSelected(false);
					meas_data_fifo_statusDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_data_fifo_statusBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_data_fifo_statusBitCheck.setSelected(true);
					meas_data_fifo_statusDataInput.setEnabled(false);
				}
			}
		});
		Action meas_data_fifo_statusaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = meas_data_fifo_statusDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 8)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 8) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] meas_data_fifo_statusBitPanel = new JPanel[8];
		JLabel[] meas_data_fifo_statusBitLabel = new JLabel[8];
		JComboBox<Integer>[] meas_data_fifo_statusComboBoxList = new JComboBox[8];
		name = "meas_data_fifo_status";
		labelTemp = meas_data_fifo_statusBitLabel;
		comboboxTemp = meas_data_fifo_statusComboBoxList;
		dataWidth = 8;
		for (int i = 0; i < 8; i++) {
			meas_data_fifo_statusBitPanel[i] = new JPanel();
			meas_data_fifo_statusBitPanel[i]
					.setLayout(new BoxLayout(meas_data_fifo_statusBitPanel[i], BoxLayout.Y_AXIS));
			meas_data_fifo_statusBitFieldPanel.add(meas_data_fifo_statusBitPanel[i]);

			meas_data_fifo_statusBitLabel[i] = new JLabel("  ");
			meas_data_fifo_statusComboBoxList[i] = new JComboBox(selection);
			meas_data_fifo_statusComboBoxList[i].setEnabled(false);
			meas_data_fifo_statusComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 8; i++) {
						sendData = sendData * 2 + (int) meas_data_fifo_statusComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			meas_data_fifo_statusBitPanel[i].add(meas_data_fifo_statusBitLabel[i]);
			meas_data_fifo_statusBitPanel[i].add(meas_data_fifo_statusComboBoxList[i]);
			meas_data_fifo_statusBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 8; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("meas_data_fifo_status" + "[" + i + "]");
		}

		meas_data_fifo_statusBitField.add(meas_data_fifo_statusDataInputCheck);
		meas_data_fifo_statusBitField.add(meas_data_fifo_statusDataInput);
		meas_data_fifo_statusDataInput.addActionListener(meas_data_fifo_statusaction);

		//final total panel
		panelTotal.add(meas_data_fifo_statusPanel);
		panelTotal.add(new JSeparator());

		JPanel meas_data_fifoPanel = new JPanel();
		JPanel meas_data_fifoGeneralInfo = new JPanel(new GridLayout(3, 1, 5, 5));
		JPanel meas_data_fifoRegAttributes = new JPanel(new GridLayout(6, 1, 5, 5));
		JPanel meas_data_fifoBitField = new JPanel();
		JTextField meas_data_fifoDataInput = new JTextField();
		meas_data_fifoDataInput.setText("0x");
		meas_data_fifoDataInput.setEnabled(false);

		border1 = BorderFactory.createTitledBorder(border, "Register " + "meas_data_fifo", TitledBorder.LEFT,
				TitledBorder.TOP);
		meas_data_fifoPanel.setBorder(border1);
		meas_data_fifoPanel.setLayout(new BoxLayout(meas_data_fifoPanel, BoxLayout.Y_AXIS));

		//General info part
		meas_data_fifoGeneralInfo.setBorder(border2);
		//meas_data_fifoGeneralInfo.setLayout(new BoxLayout(meas_data_fifoGeneralInfo, BoxLayout.PAGE_AXIS));
		JLabel meas_data_fifoLabel = new JLabel("Name: " + "meas_data_fifo");
		//meas_data_fifoLabel.setMaximumSize(new Dimension(Integer.MAX_VALUE, meas_data_fifoLabel.getMinimumSize().height));
		meas_data_fifoGeneralInfo.add(meas_data_fifoLabel);
		JLabel meas_data_fifoShortNameLabel = new JLabel("shortName: " + "");
		meas_data_fifoGeneralInfo.add(meas_data_fifoShortNameLabel);
		JLabel meas_data_fifoHiddenLabel = new JLabel("hidden: " + "false");
		meas_data_fifoGeneralInfo.add(meas_data_fifoHiddenLabel);
		meas_data_fifoPanel.add(meas_data_fifoGeneralInfo);
		//Register attribute part
		meas_data_fifoRegAttributes.setBorder(border3);
		//meas_data_fifoRegAttributes.setLayout(new BoxLayout(meas_data_fifoRegAttributes, BoxLayout.Y_AXIS));
		meas_data_fifoPanel.add(meas_data_fifoRegAttributes);
		JLabel meas_data_fifoOffsetLabel = new JLabel("Offset: " + "0x26");
		meas_data_fifoRegAttributes.add(meas_data_fifoOffsetLabel);
		JLabel meas_data_fifoRelOffsetLabel = new JLabel("Rel Offset: " + "0x26");
		meas_data_fifoRegAttributes.add(meas_data_fifoRelOffsetLabel);
		JLabel meas_data_fifoDataWidth = new JLabel("Rel Offset: " + "16");
		meas_data_fifoRegAttributes.add(meas_data_fifoDataWidth);
		JLabel meas_data_fifoNoShadowLabel = new JLabel("No Shadow: ");
		meas_data_fifoRegAttributes.add(meas_data_fifoNoShadowLabel);
		JCheckBox meas_data_fifoNoShadowCheckBox = new JCheckBox();
		meas_data_fifoNoShadowCheckBox.setSelected(true);

		meas_data_fifoRegAttributes.add(meas_data_fifoNoShadowCheckBox);
		JLabel meas_data_fifoMirrorSizeLabel = new JLabel("Mirror Size: " + 1);
		meas_data_fifoRegAttributes.add(meas_data_fifoMirrorSizeLabel);
		//BitField Overview

		meas_data_fifoBitField.setBorder(border4);
		meas_data_fifoBitField.setLayout(new BoxLayout(meas_data_fifoBitField, BoxLayout.Y_AXIS));
		meas_data_fifoPanel.add(meas_data_fifoBitField);

		JCheckBox meas_data_fifoBitCheck = new JCheckBox("BitField Configuration");
		meas_data_fifoBitCheck.setSelected(true);
		meas_data_fifoBitField.add(meas_data_fifoBitCheck);
		JCheckBox meas_data_fifoDataInputCheck = new JCheckBox("Data Input Configuration");
		meas_data_fifoDataInputCheck.setSelected(false);

		JPanel meas_data_fifoBitFieldPanel = new JPanel();
		meas_data_fifoBitField.add(meas_data_fifoBitFieldPanel);
		meas_data_fifoBitFieldPanel.setLayout(new BoxLayout(meas_data_fifoBitFieldPanel, BoxLayout.X_AXIS));

		JPanel meas_data_fifoBitInputPanel = new JPanel();
		meas_data_fifoBitField.add(meas_data_fifoBitInputPanel);
		meas_data_fifoBitInputPanel.setLayout(new BoxLayout(meas_data_fifoBitInputPanel, BoxLayout.X_AXIS));
		meas_data_fifoBitCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!meas_data_fifoBitCheck.isSelected()) {
					for (Component component : getComponents(meas_data_fifoBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_data_fifoDataInputCheck.setSelected(true);
					meas_data_fifoDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_data_fifoBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_data_fifoDataInputCheck.setSelected(false);
					meas_data_fifoDataInput.setEnabled(false);
				}
			}
		});

		meas_data_fifoDataInputCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (meas_data_fifoDataInputCheck.isSelected()) {
					for (Component component : getComponents(meas_data_fifoBitFieldPanel)) {
						component.setEnabled(false);
					}
					meas_data_fifoBitCheck.setSelected(false);
					meas_data_fifoDataInput.setEnabled(true);
				} else {
					for (Component component : getComponents(meas_data_fifoBitFieldPanel)) {
						component.setEnabled(true);
					}
					meas_data_fifoBitCheck.setSelected(true);
					meas_data_fifoDataInput.setEnabled(false);
				}
			}
		});
		Action meas_data_fifoaction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dataInput = meas_data_fifoDataInput.getText().substring(2);
				if (isInteger(dataInput) && Integer.parseInt(dataInput) >= 0
						&& Integer.parseInt(dataInput) < (int) Math.pow(2, 16)) {
					form.send(Integer.parseInt(dataInput));
				} else {
					JOptionPane.showMessageDialog(f,
							"The input value is an integer between 0 ~ " + ((int) Math.pow(2, 16) - 1), "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		};

		JPanel[] meas_data_fifoBitPanel = new JPanel[16];
		JLabel[] meas_data_fifoBitLabel = new JLabel[16];
		JComboBox<Integer>[] meas_data_fifoComboBoxList = new JComboBox[16];
		name = "meas_data_fifo";
		labelTemp = meas_data_fifoBitLabel;
		comboboxTemp = meas_data_fifoComboBoxList;
		dataWidth = 16;
		for (int i = 0; i < 16; i++) {
			meas_data_fifoBitPanel[i] = new JPanel();
			meas_data_fifoBitPanel[i].setLayout(new BoxLayout(meas_data_fifoBitPanel[i], BoxLayout.Y_AXIS));
			meas_data_fifoBitFieldPanel.add(meas_data_fifoBitPanel[i]);

			meas_data_fifoBitLabel[i] = new JLabel("  ");
			meas_data_fifoComboBoxList[i] = new JComboBox(selection);
			meas_data_fifoComboBoxList[i].setEnabled(false);
			meas_data_fifoComboBoxList[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int sendData = 0;
					for (int i = 0; i < 16; i++) {
						sendData = sendData * 2 + (int) meas_data_fifoComboBoxList[i].getSelectedItem();
					}
					form.send(sendData);
				}
			});
			meas_data_fifoBitPanel[i].add(meas_data_fifoBitLabel[i]);
			meas_data_fifoBitPanel[i].add(meas_data_fifoComboBoxList[i]);
			meas_data_fifoBitPanel[i].setPreferredSize(new Dimension(40, 40));
		}

		for (int index = dataWidth - 1 - 0, i = 0; i < 16; i++, index--) {
			comboboxTemp[index].setEnabled(true);
			labelTemp[index].setText("meas_data" + "[" + i + "]");
		}

		meas_data_fifoBitField.add(meas_data_fifoDataInputCheck);
		meas_data_fifoBitField.add(meas_data_fifoDataInput);
		meas_data_fifoDataInput.addActionListener(meas_data_fifoaction);

		//final total panel
		panelTotal.add(meas_data_fifoPanel);
		panelTotal.add(new JSeparator());

		f.setVisible(true);
	}
}
