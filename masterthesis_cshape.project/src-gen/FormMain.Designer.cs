
using System;

namespace MasterThesis
{
    partial class FormMain
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;
        private int rowIndex = 0;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }
        
        #region Windows Form Designer generated code
        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.statusStrip1 = new System.Windows.Forms.StatusStrip();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.fileToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.openToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator = new System.Windows.Forms.ToolStripSeparator();
            this.saveToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.saveAsToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.exitToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.helpToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.contentsToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.indexToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.searchToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator5 = new System.Windows.Forms.ToolStripSeparator();
            this.aboutToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
			this.groupBoxConnect = new System.Windows.Forms.GroupBox();
            this.numericUpDownSensorHubPort = new System.Windows.Forms.NumericUpDown();
            this.numericUpDownSensorHubChannel = new System.Windows.Forms.NumericUpDown();
            this.numericUpDownSensorHubDeviceAddress = new System.Windows.Forms.NumericUpDown();
            this.labelSensorHubDeviceAddress = new System.Windows.Forms.Label();
            this.labelSensorHubChannel = new System.Windows.Forms.Label();
            this.labelSensorHubPort = new System.Windows.Forms.Label();
            this.labelConnectSensorHub = new System.Windows.Forms.Label();
            this.buttonCOMPortRefresh = new System.Windows.Forms.Button();
            this.comboBoxCOMPorts = new System.Windows.Forms.ComboBox();
            this.labelConnectCOMPort = new System.Windows.Forms.Label();
			this.labelProtocol = new System.Windows.Forms.Label();
            this.comboBoxProtocol = new System.Windows.Forms.ComboBox();
            this.tabControlMain = new System.Windows.Forms.TabControl();
            this.tabPageFunctions = new System.Windows.Forms.TabPage();
            this.buttonReadSensor = new System.Windows.Forms.Button();
            this.buttonExecuteMeasurement = new System.Windows.Forms.Button();
            this.buttonCancel = new System.Windows.Forms.Button();
            this.chartResults = new System.Windows.Forms.DataVisualization.Charting.Chart();
            this.tabPageRegisters = new System.Windows.Forms.TabPage();
            this.flowLayoutPanel1 = new System.Windows.Forms.FlowLayoutPanel();
            this.toolTip1 = new System.Windows.Forms.ToolTip();
            this.backgroundWorkerCom = new System.ComponentModel.BackgroundWorker();
			
	
	
	this.groupbox_ld0_per = new System.Windows.Forms.GroupBox();
	

   
	   this.label_ld0_per = new System.Windows.Forms.Label();
       this.numericUpDown_ld0_per = new System.Windows.Forms.NumericUpDown();
     




	this.groupbox_duty_cycle_ld0_blue = new System.Windows.Forms.GroupBox();
	

   
	   this.label_duty_cycle_ld0_blue = new System.Windows.Forms.Label();
       this.numericUpDown_duty_cycle_ld0_blue = new System.Windows.Forms.NumericUpDown();
     




	this.groupbox_duty_cycle_ld0_green = new System.Windows.Forms.GroupBox();
	

   
	   this.label_duty_cycle_ld0_green = new System.Windows.Forms.Label();
       this.numericUpDown_duty_cycle_ld0_green = new System.Windows.Forms.NumericUpDown();
     




	this.groupbox_ld4_ctrl = new System.Windows.Forms.GroupBox();
	

   
   	   this.checkBox_ld4_ctrl = new System.Windows.Forms.CheckBox();
	




	this.groupbox_ld5_ctrl = new System.Windows.Forms.GroupBox();
	

   
   	   this.checkBox_ld5_ctrl = new System.Windows.Forms.CheckBox();
	




	this.groupbox_ld6_ctrl = new System.Windows.Forms.GroupBox();
	

   
   	   this.checkBox_ld6_ctrl = new System.Windows.Forms.CheckBox();
	




	this.groupbox_ld7_ctrl = new System.Windows.Forms.GroupBox();
	

   
   	   this.checkBox_ld7_ctrl = new System.Windows.Forms.CheckBox();
	




	this.groupbox_sensor_en = new System.Windows.Forms.GroupBox();
	

   
   	   this.checkBox_sensor_en = new System.Windows.Forms.CheckBox();
	




	this.groupbox_sensor_meas = new System.Windows.Forms.GroupBox();
	

   
   	   this.checkBox_sensor_meas = new System.Windows.Forms.CheckBox();
	




	this.groupbox_heater_voltage = new System.Windows.Forms.GroupBox();
	

   
	   this.label_heater_voltage = new System.Windows.Forms.Label();
       this.numericUpDown_heater_voltage = new System.Windows.Forms.NumericUpDown();
     




	this.groupbox_rheat_ref = new System.Windows.Forms.GroupBox();
	

   
	   this.label_rheat_ref = new System.Windows.Forms.Label();
       this.numericUpDown_rheat_ref = new System.Windows.Forms.NumericUpDown();
     




	this.groupbox_rheat_alpha = new System.Windows.Forms.GroupBox();
	

   
	   this.label_rheat_alpha = new System.Windows.Forms.Label();
       this.numericUpDown_rheat_alpha = new System.Windows.Forms.NumericUpDown();
     




	this.groupbox_adc_input_gain = new System.Windows.Forms.GroupBox();
	

   
	   this.label_adc_input_gain = new System.Windows.Forms.Label();
       this.numericUpDown_adc_input_gain = new System.Windows.Forms.NumericUpDown();
     




	this.groupbox_sample_rate = new System.Windows.Forms.GroupBox();
	

   
	   this.label_sample_rate = new System.Windows.Forms.Label();
       this.numericUpDown_sample_rate = new System.Windows.Forms.NumericUpDown();
     




	this.groupbox_on_cycles = new System.Windows.Forms.GroupBox();
	

   
	   this.label_on_cycles = new System.Windows.Forms.Label();
       this.numericUpDown_on_cycles = new System.Windows.Forms.NumericUpDown();
     




	this.groupbox_off_cycles = new System.Windows.Forms.GroupBox();
	

   
	   this.label_off_cycles = new System.Windows.Forms.Label();
       this.numericUpDown_off_cycles = new System.Windows.Forms.NumericUpDown();
     




	this.groupbox_set_hh_temp = new System.Windows.Forms.GroupBox();
	

   
	   this.label_set_hh_temp = new System.Windows.Forms.Label();
       this.numericUpDown_set_hh_temp = new System.Windows.Forms.NumericUpDown();
     




	this.groupbox_wait_cycles = new System.Windows.Forms.GroupBox();
	

   
	   this.label_wait_cycles = new System.Windows.Forms.Label();
       this.numericUpDown_wait_cycles = new System.Windows.Forms.NumericUpDown();
     




	this.groupbox_meas_cnt = new System.Windows.Forms.GroupBox();
	

   
	   this.label_meas_cnt = new System.Windows.Forms.Label();
       this.numericUpDown_meas_cnt = new System.Windows.Forms.NumericUpDown();
     




	this.groupbox_led_ctrl = new System.Windows.Forms.GroupBox();
	

   
	   this.label_led_ctrl = new System.Windows.Forms.Label();
       this.numericUpDown_led_ctrl = new System.Windows.Forms.NumericUpDown();
     




	this.groupbox_meas_done = new System.Windows.Forms.GroupBox();
	


       this.label_meas_done = new System.Windows.Forms.Label();
       this.textBox_meas_done = new System.Windows.Forms.TextBox();



	this.groupbox_meas_result = new System.Windows.Forms.GroupBox();
	


       this.label_meas_result = new System.Windows.Forms.Label();
       this.textBox_meas_result = new System.Windows.Forms.TextBox();



	this.groupbox_smpl_first = new System.Windows.Forms.GroupBox();
	

   
	   this.label_smpl_first = new System.Windows.Forms.Label();
       this.numericUpDown_smpl_first = new System.Windows.Forms.NumericUpDown();
     




	this.groupbox_smpl_last = new System.Windows.Forms.GroupBox();
	

   
	   this.label_smpl_last = new System.Windows.Forms.Label();
       this.numericUpDown_smpl_last = new System.Windows.Forms.NumericUpDown();
     




	this.groupbox_k_factor = new System.Windows.Forms.GroupBox();
	

   
	   this.label_k_factor = new System.Windows.Forms.Label();
       this.numericUpDown_k_factor = new System.Windows.Forms.NumericUpDown();
     




	this.groupbox_ppm = new System.Windows.Forms.GroupBox();
	


       this.label_ppm = new System.Windows.Forms.Label();
       this.textBox_ppm = new System.Windows.Forms.TextBox();





            // statusbar
            this.toolStripStatusLabel = new System.Windows.Forms.ToolStripStatusLabel();
            this.toolStripProgressBar = new System.Windows.Forms.ToolStripProgressBar();
            //
            // statusStrip1
            //
            this.statusStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.toolStripStatusLabel,
            this.toolStripProgressBar});
            this.statusStrip1.Location = new System.Drawing.Point(0, 540);
            this.statusStrip1.Name = "statusStrip1";
            this.statusStrip1.Size = new System.Drawing.Size(784, 22);
            this.statusStrip1.TabIndex = 0;
            this.statusStrip1.Text = "statusStrip1";
            //
            // menuStrip1
            //
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.fileToolStripMenuItem,
            this.helpToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(784, 24);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";
            //
            // fileToolStripMenuItem
            //
            this.fileToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.openToolStripMenuItem,
            this.toolStripSeparator,
            this.saveToolStripMenuItem,
            this.saveAsToolStripMenuItem,
            this.toolStripSeparator1,
            this.exitToolStripMenuItem});
            this.fileToolStripMenuItem.Name = "fileToolStripMenuItem";
            this.fileToolStripMenuItem.Size = new System.Drawing.Size(37, 20);
            this.fileToolStripMenuItem.Text = "&File";
            //
            // openToolStripMenuItem
            //
            this.openToolStripMenuItem.Name = "openToolStripMenuItem";
            this.openToolStripMenuItem.Size = new System.Drawing.Size(114, 22);
            this.openToolStripMenuItem.Text = "&Open";
            //
            // toolStripSeparator
            //
            this.toolStripSeparator.Name = "toolStripSeparator";
            this.toolStripSeparator.Size = new System.Drawing.Size(111, 6);
            //
            // saveToolStripMenuItem
            //
            this.saveToolStripMenuItem.Name = "saveToolStripMenuItem";
            this.saveToolStripMenuItem.Size = new System.Drawing.Size(114, 22);
            this.saveToolStripMenuItem.Text = "&Save";
            //
            // saveAsToolStripMenuItem
            //
            this.saveAsToolStripMenuItem.Name = "saveAsToolStripMenuItem";
            this.saveAsToolStripMenuItem.Size = new System.Drawing.Size(114, 22);
            this.saveAsToolStripMenuItem.Text = "Save &As";
            //
            // toolStripSeparator1
            //
            this.toolStripSeparator1.Name = "toolStripSeparator1";
            this.toolStripSeparator1.Size = new System.Drawing.Size(111, 6);
            //
            // exitToolStripMenuItem
            //
            this.exitToolStripMenuItem.Name = "exitToolStripMenuItem";
            this.exitToolStripMenuItem.Size = new System.Drawing.Size(114, 22);
            this.exitToolStripMenuItem.Text = "E&xit";
            //
            // helpToolStripMenuItem
            //
            this.helpToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.contentsToolStripMenuItem,
            this.indexToolStripMenuItem,
            this.searchToolStripMenuItem,
            this.toolStripSeparator5,
            this.aboutToolStripMenuItem});
            this.helpToolStripMenuItem.Name = "helpToolStripMenuItem";
            this.helpToolStripMenuItem.Size = new System.Drawing.Size(44, 20);
            this.helpToolStripMenuItem.Text = "&Help";
            //
            // contentsToolStripMenuItem
            //
            this.contentsToolStripMenuItem.Name = "contentsToolStripMenuItem";
            this.contentsToolStripMenuItem.Size = new System.Drawing.Size(122, 22);
            this.contentsToolStripMenuItem.Text = "&Contents";
            //
            // indexToolStripMenuItem
            //
            this.indexToolStripMenuItem.Name = "indexToolStripMenuItem";
            this.indexToolStripMenuItem.Size = new System.Drawing.Size(122, 22);
            this.indexToolStripMenuItem.Text = "&Index";
            //
            // searchToolStripMenuItem
            //
            this.searchToolStripMenuItem.Name = "searchToolStripMenuItem";
            this.searchToolStripMenuItem.Size = new System.Drawing.Size(122, 22);
            this.searchToolStripMenuItem.Text = "&Search";
            //
            // toolStripSeparator5
            //
            this.toolStripSeparator5.Name = "toolStripSeparator5";
            this.toolStripSeparator5.Size = new System.Drawing.Size(119, 6);
            //
            // aboutToolStripMenuItem
            //
            this.aboutToolStripMenuItem.Name = "aboutToolStripMenuItem";
            this.aboutToolStripMenuItem.Size = new System.Drawing.Size(122, 22);
            this.aboutToolStripMenuItem.Text = "&About...";
			  //
            // groupBoxConnect
            //
            this.groupBoxConnect.Anchor = ((System.Windows.Forms.AnchorStyles)(((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Left)
            | System.Windows.Forms.AnchorStyles.Right)));
            this.groupBoxConnect.Controls.Add(this.labelProtocol);
            this.groupBoxConnect.Controls.Add(this.comboBoxProtocol);
            this.groupBoxConnect.Controls.Add(this.numericUpDownSensorHubPort);
            this.groupBoxConnect.Controls.Add(this.numericUpDownSensorHubChannel);
            this.groupBoxConnect.Controls.Add(this.numericUpDownSensorHubDeviceAddress);
            this.groupBoxConnect.Controls.Add(this.labelSensorHubDeviceAddress);
            this.groupBoxConnect.Controls.Add(this.labelSensorHubChannel);
            this.groupBoxConnect.Controls.Add(this.labelSensorHubPort);
            this.groupBoxConnect.Controls.Add(this.buttonCOMPortRefresh);
            this.groupBoxConnect.Controls.Add(this.comboBoxCOMPorts);
            this.groupBoxConnect.Controls.Add(this.labelConnectCOMPort);
            this.groupBoxConnect.Location = new System.Drawing.Point(10, 30);
            this.groupBoxConnect.Name = "groupBoxConnect";
            this.groupBoxConnect.Size = new System.Drawing.Size(765, 45);
            this.groupBoxConnect.TabIndex = 4;
            this.groupBoxConnect.TabStop = false;
            this.groupBoxConnect.Text = "Connect";
            //
            // labelProtocol
            //
            this.labelProtocol.AutoSize = true;
            this.labelProtocol.Location = new System.Drawing.Point(230, 19);
            this.labelProtocol.Name = "labelProtocol";
            this.labelProtocol.Size = new System.Drawing.Size(46, 13);
            this.labelProtocol.TabIndex = 3;
            this.labelProtocol.Text = "Protocol";
            //
            // comboBoxProtocol
            //
            this.comboBoxProtocol.FormattingEnabled = true;
            this.comboBoxProtocol.Items.AddRange(new object[] {
            "I2C",
            "SPI"});
            this.comboBoxProtocol.Location = new System.Drawing.Point(280, 15);
            this.comboBoxProtocol.Name = "comboBoxProtocol";
            this.comboBoxProtocol.Size = new System.Drawing.Size(55, 21);
            this.comboBoxProtocol.TabIndex = 4;
            this.comboBoxProtocol.Text = "I2C";
			this.comboBoxProtocol.SelectedIndexChanged += new System.EventHandler(this.comboBoxProtocol_SelectedIndexChanged);
            //
            // numericUpDownSensorHubPort
            //
            this.numericUpDownSensorHubPort.Location = new System.Drawing.Point(395, 15);
            this.numericUpDownSensorHubPort.Maximum = new decimal(new int[] {
            2,
            0,
            0,
            0});
            this.numericUpDownSensorHubPort.Minimum = new decimal(new int[] {
            1,
            0,
            0,
            0});
            this.numericUpDownSensorHubPort.Name = "numericUpDownSensorHubPort";
            this.numericUpDownSensorHubPort.Size = new System.Drawing.Size(55, 20);
            this.numericUpDownSensorHubPort.TabIndex = 6;
            this.numericUpDownSensorHubPort.Value = new decimal(new int[] {
            2,
            0,
            0,
            0});
            //
            // numericUpDownSensorHubChannel
            //
            this.numericUpDownSensorHubChannel.Location = new System.Drawing.Point(520, 15);
            this.numericUpDownSensorHubChannel.Maximum = new decimal(new int[] {
            3,
            0,
            0,
            0});
            this.numericUpDownSensorHubChannel.Name = "numericUpDownSensorHubChannel";
            this.numericUpDownSensorHubChannel.Size = new System.Drawing.Size(55, 20);
            this.numericUpDownSensorHubChannel.TabIndex = 8;
            this.numericUpDownSensorHubChannel.Value = new decimal(new int[] {
            3,
            0,
            0,
            0});
            //
            // numericUpDownSensorHubDeviceAddress
            //
            this.numericUpDownSensorHubDeviceAddress.Location = new System.Drawing.Point(645, 15);
            this.numericUpDownSensorHubDeviceAddress.Maximum = new decimal(new int[] {
            255,
            0,
            0,
            0});
            this.numericUpDownSensorHubDeviceAddress.Name = "numericUpDownSensorHubDeviceAddress";
            this.numericUpDownSensorHubDeviceAddress.Size = new System.Drawing.Size(60, 20);
            this.numericUpDownSensorHubDeviceAddress.TabIndex = 10;
            this.numericUpDownSensorHubDeviceAddress.Value = new decimal(new int[] {
            32,
            0,
            0,
            0});
            //
            // labelSensorHubDeviceAddress
            //
            this.labelSensorHubDeviceAddress.AutoSize = true;
            this.labelSensorHubDeviceAddress.Location = new System.Drawing.Point(595, 19);
            this.labelSensorHubDeviceAddress.Name = "labelSensorHubDeviceAddress";
            this.labelSensorHubDeviceAddress.Size = new System.Drawing.Size(45, 13);
            this.labelSensorHubDeviceAddress.TabIndex = 9;
            this.labelSensorHubDeviceAddress.Text = "Address";
            //
            // labelSensorHubChannel
            //
            this.labelSensorHubChannel.AutoSize = true;
            this.labelSensorHubChannel.Location = new System.Drawing.Point(470, 19);
            this.labelSensorHubChannel.Name = "labelSensorHubChannel";
            this.labelSensorHubChannel.Size = new System.Drawing.Size(46, 13);
            this.labelSensorHubChannel.TabIndex = 7;
            this.labelSensorHubChannel.Text = "Channel";
            //
            // labelSensorHubPort
            //
            this.labelSensorHubPort.AutoSize = true;
            this.labelSensorHubPort.Location = new System.Drawing.Point(365, 19);
            this.labelSensorHubPort.Name = "labelSensorHubPort";
            this.labelSensorHubPort.Size = new System.Drawing.Size(26, 13);
            this.labelSensorHubPort.TabIndex = 5;
            this.labelSensorHubPort.Text = "Port";
            //
            // buttonCOMPortRefresh
            //
            this.buttonCOMPortRefresh.Location = new System.Drawing.Point(140, 14);
            this.buttonCOMPortRefresh.Name = "buttonCOMPortRefresh";
            this.buttonCOMPortRefresh.Size = new System.Drawing.Size(60, 23);
            this.buttonCOMPortRefresh.TabIndex = 2;
            this.buttonCOMPortRefresh.Text = "Refresh";
            this.buttonCOMPortRefresh.UseVisualStyleBackColor = true;
			this.buttonCOMPortRefresh.Click += new System.EventHandler(this.buttonCOMPortRefresh_Click);
            //
            // comboBoxCOMPorts
            //
            this.comboBoxCOMPorts.FormattingEnabled = true;
            this.comboBoxCOMPorts.Location = new System.Drawing.Point(70, 15);
            this.comboBoxCOMPorts.Name = "comboBoxCOMPorts";
            this.comboBoxCOMPorts.Size = new System.Drawing.Size(65, 21);
            this.comboBoxCOMPorts.TabIndex = 1;
            this.comboBoxCOMPorts.Text = "n/a";
			this.comboBoxCOMPorts.SelectedIndexChanged += new System.EventHandler(this.comboBoxCOMPorts_SelectedIndexChanged);
            //
            // labelConnectCOMPort
            //
            this.labelConnectCOMPort.AutoSize = true;
            this.labelConnectCOMPort.Location = new System.Drawing.Point(10, 19);
            this.labelConnectCOMPort.Name = "labelConnectCOMPort";
            this.labelConnectCOMPort.Size = new System.Drawing.Size(53, 13);
            this.labelConnectCOMPort.TabIndex = 0;
            this.labelConnectCOMPort.Text = "COM Port";
            //
            // tabControlMain
            //
            this.tabControlMain.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom)
            | System.Windows.Forms.AnchorStyles.Left)
            | System.Windows.Forms.AnchorStyles.Right)));
            this.tabControlMain.Controls.Add(this.tabPageFunctions);
            this.tabControlMain.Controls.Add(this.tabPageRegisters);
            this.tabControlMain.Location = new System.Drawing.Point(10, 80);
            this.tabControlMain.Name = "tabControlMain";
            this.tabControlMain.SelectedIndex = 0;
            this.tabControlMain.Size = new System.Drawing.Size(765, 455);
            this.tabControlMain.TabIndex = 11;
            //
            // tabPageFunctions
            //
            this.tabPageFunctions.Controls.Add(this.buttonReadSensor);
            this.tabPageFunctions.Controls.Add(this.buttonExecuteMeasurement);
            this.tabPageFunctions.Controls.Add(this.buttonCancel);
            this.tabPageFunctions.Controls.Add(this.chartResults);
            this.tabPageFunctions.Location = new System.Drawing.Point(4, 22);
            this.tabPageFunctions.Name = "tabPageFunctions";
            this.tabPageFunctions.Padding = new System.Windows.Forms.Padding(3);
            this.tabPageFunctions.Size = new System.Drawing.Size(757, 429);
            this.tabPageFunctions.TabIndex = 0;
            this.tabPageFunctions.Text = "Function View";
            this.tabPageFunctions.UseVisualStyleBackColor = true;
            //
            // buttonReadSensor
            //
            this.buttonReadSensor.Location = new System.Drawing.Point(10, 10);
            this.buttonReadSensor.Name = "buttonReadSensor";
            this.buttonReadSensor.Size = new System.Drawing.Size(140, 23);
            this.buttonReadSensor.TabIndex = 1;
            this.buttonReadSensor.Text = "Read Sensor";
            this.buttonReadSensor.UseVisualStyleBackColor = true;
            this.buttonReadSensor.Click += new System.EventHandler(this.buttonReadSensor_Click);
            //
            // buttonExecuteMeasurement
            //
            this.buttonExecuteMeasurement.Location = new System.Drawing.Point(160, 10);
            this.buttonExecuteMeasurement.Name = "buttonExecuteMeasurement";
            this.buttonExecuteMeasurement.Size = new System.Drawing.Size(140, 23);
            this.buttonExecuteMeasurement.TabIndex = 2;
            this.buttonExecuteMeasurement.Text = "Execute Measurement";
            this.buttonExecuteMeasurement.UseVisualStyleBackColor = true;
            this.buttonExecuteMeasurement.Click += new System.EventHandler(this.buttonExecuteMeasurement_Click);
            //
            // buttonCancel
            //
            this.buttonCancel.Location = new System.Drawing.Point(607, 10);
            this.buttonCancel.Name = "buttonCancel";
            this.buttonCancel.Size = new System.Drawing.Size(140, 23);
            this.buttonCancel.TabIndex = 3;
            this.buttonCancel.Text = "Cancel";
            this.buttonCancel.UseVisualStyleBackColor = true;
            //
            // chartResults
            //
            this.chartResults.Location = new System.Drawing.Point(10, 40);
            this.chartResults.Size = new System.Drawing.Size(737, 383);
            this.chartResults.TabIndex = 4;
            this.chartResults.Text = "Result Charts";
            //
            // tabPageRegisters
            //
            this.tabPageRegisters.Controls.Add(this.flowLayoutPanel1);
            this.tabPageRegisters.Location = new System.Drawing.Point(4, 22);
            this.tabPageRegisters.Name = "tabPageRegisters";
            this.tabPageRegisters.Padding = new System.Windows.Forms.Padding(3);
            this.tabPageRegisters.Size = new System.Drawing.Size(757, 429);
            this.tabPageRegisters.TabIndex = 1;
            this.tabPageRegisters.Text = "Direct Register Access";
            this.tabPageRegisters.UseVisualStyleBackColor = true;
            //
            // flowLayoutPanel1
            //
            this.flowLayoutPanel1.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom)
            | System.Windows.Forms.AnchorStyles.Left)
            | System.Windows.Forms.AnchorStyles.Right)));
			this.flowLayoutPanel1.AutoScroll = true;
			
	
	
	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_ld0_per);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_duty_cycle_ld0_blue);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_duty_cycle_ld0_green);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_ld4_ctrl);
	

	

	

	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_sensor_en);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_sensor_meas);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_heater_voltage);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_rheat_ref);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_rheat_alpha);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_adc_input_gain);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_sample_rate);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_on_cycles);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_off_cycles);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_set_hh_temp);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_wait_cycles);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_meas_cnt);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_led_ctrl);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_meas_done);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_meas_result);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_smpl_first);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_smpl_last);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_k_factor);
	

	
	this.flowLayoutPanel1.Controls.Add(this.groupbox_ppm);
	



            this.flowLayoutPanel1.Location = new System.Drawing.Point(5, 5);
            this.flowLayoutPanel1.Name = "flowLayoutPanel1";
            this.flowLayoutPanel1.Size = new System.Drawing.Size(740, 415);
            this.flowLayoutPanel1.TabIndex = 1;
            
	
	
    this.groupbox_ld0_per.Location = new System.Drawing.Point(3, 3);
    this.groupbox_ld0_per.Name = "groupbox_ld0_per";
    this.groupbox_ld0_per.Size = new System.Drawing.Size(235, 50);
    this.groupbox_ld0_per.AutoSize = true;
    //this.groupbox_ld0_per.TabIndex = ld0_per${RegisterIndex};
    //this.groupbox_ld0_per.TabStop = false;
    this.groupbox_ld0_per.Text = "ld0_per";
    this.groupbox_temp = this.groupbox_ld0_per;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
       this.groupbox_temp.Controls.Add(label_ld0_per);
       this.groupbox_temp.Controls.Add(numericUpDown_ld0_per);
       //
        // label_ld0_per
        //
        this.label_ld0_per.AutoSize = true;
        this.label_ld0_per.Location = new System.Drawing.Point(10, 23 + this.rowIndex);
        this.rowIndex++;
        this.label_ld0_per.Name = "label_ld0_per";
        this.label_ld0_per.Size = new System.Drawing.Size(150, 13);
        this.label_ld0_per.Text = "ld0_per";
        this.label_ld0_per.Click += new System.EventHandler(this.numericUpDown_ld0_per_Read);
        //
        // numericUpDown_ld0_per
        //
        this.numericUpDown_ld0_per.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
        this.numericUpDown_ld0_per.Maximum = new decimal(new int[] {(int)Math.Pow(2, 12)-1, 0, 0, 0});
        this.rowIndex++;
        this.numericUpDown_ld0_per.Name = "numericUpDown_ld0_per";
        this.numericUpDown_ld0_per.Size = new System.Drawing.Size(55, 20);
        this.numericUpDown_ld0_per.Value = new decimal(new int[] {0, 0, 0, 0});
        this.numericUpDown_ld0_per.ValueChanged += new System.EventHandler(this.numericUpDown_ld0_per_Write);
        this.numericUpDown_ld0_per.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.numericUpDown_ld0_per_KeyPress);
     




    this.groupbox_duty_cycle_ld0_blue.Location = new System.Drawing.Point(3, 3);
    this.groupbox_duty_cycle_ld0_blue.Name = "groupbox_duty_cycle_ld0_blue";
    this.groupbox_duty_cycle_ld0_blue.Size = new System.Drawing.Size(235, 50);
    this.groupbox_duty_cycle_ld0_blue.AutoSize = true;
    //this.groupbox_duty_cycle_ld0_blue.TabIndex = duty_cycle_ld0_blue${RegisterIndex};
    //this.groupbox_duty_cycle_ld0_blue.TabStop = false;
    this.groupbox_duty_cycle_ld0_blue.Text = "duty_cycle_ld0_blue";
    this.groupbox_temp = this.groupbox_duty_cycle_ld0_blue;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
       this.groupbox_temp.Controls.Add(label_duty_cycle_ld0_blue);
       this.groupbox_temp.Controls.Add(numericUpDown_duty_cycle_ld0_blue);
       //
        // label_duty_cycle_ld0_blue
        //
        this.label_duty_cycle_ld0_blue.AutoSize = true;
        this.label_duty_cycle_ld0_blue.Location = new System.Drawing.Point(10, 23 + this.rowIndex);
        this.rowIndex++;
        this.label_duty_cycle_ld0_blue.Name = "label_duty_cycle_ld0_blue";
        this.label_duty_cycle_ld0_blue.Size = new System.Drawing.Size(150, 13);
        this.label_duty_cycle_ld0_blue.Text = "duty_cycle_ld0_blue";
        this.label_duty_cycle_ld0_blue.Click += new System.EventHandler(this.numericUpDown_duty_cycle_ld0_blue_Read);
        //
        // numericUpDown_duty_cycle_ld0_blue
        //
        this.numericUpDown_duty_cycle_ld0_blue.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
        this.numericUpDown_duty_cycle_ld0_blue.Maximum = new decimal(new int[] {(int)Math.Pow(2, 12)-1, 0, 0, 0});
        this.rowIndex++;
        this.numericUpDown_duty_cycle_ld0_blue.Name = "numericUpDown_duty_cycle_ld0_blue";
        this.numericUpDown_duty_cycle_ld0_blue.Size = new System.Drawing.Size(55, 20);
        this.numericUpDown_duty_cycle_ld0_blue.Value = new decimal(new int[] {0, 0, 0, 0});
        this.numericUpDown_duty_cycle_ld0_blue.ValueChanged += new System.EventHandler(this.numericUpDown_duty_cycle_ld0_blue_Write);
        this.numericUpDown_duty_cycle_ld0_blue.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.numericUpDown_duty_cycle_ld0_blue_KeyPress);
     




    this.groupbox_duty_cycle_ld0_green.Location = new System.Drawing.Point(3, 3);
    this.groupbox_duty_cycle_ld0_green.Name = "groupbox_duty_cycle_ld0_green";
    this.groupbox_duty_cycle_ld0_green.Size = new System.Drawing.Size(235, 50);
    this.groupbox_duty_cycle_ld0_green.AutoSize = true;
    //this.groupbox_duty_cycle_ld0_green.TabIndex = duty_cycle_ld0_green${RegisterIndex};
    //this.groupbox_duty_cycle_ld0_green.TabStop = false;
    this.groupbox_duty_cycle_ld0_green.Text = "duty_cycle_ld0_green";
    this.groupbox_temp = this.groupbox_duty_cycle_ld0_green;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
       this.groupbox_temp.Controls.Add(label_duty_cycle_ld0_green);
       this.groupbox_temp.Controls.Add(numericUpDown_duty_cycle_ld0_green);
       //
        // label_duty_cycle_ld0_green
        //
        this.label_duty_cycle_ld0_green.AutoSize = true;
        this.label_duty_cycle_ld0_green.Location = new System.Drawing.Point(10, 23 + this.rowIndex);
        this.rowIndex++;
        this.label_duty_cycle_ld0_green.Name = "label_duty_cycle_ld0_green";
        this.label_duty_cycle_ld0_green.Size = new System.Drawing.Size(150, 13);
        this.label_duty_cycle_ld0_green.Text = "duty_cycle_ld0_green";
        this.label_duty_cycle_ld0_green.Click += new System.EventHandler(this.numericUpDown_duty_cycle_ld0_green_Read);
        //
        // numericUpDown_duty_cycle_ld0_green
        //
        this.numericUpDown_duty_cycle_ld0_green.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
        this.numericUpDown_duty_cycle_ld0_green.Maximum = new decimal(new int[] {(int)Math.Pow(2, 12)-1, 0, 0, 0});
        this.rowIndex++;
        this.numericUpDown_duty_cycle_ld0_green.Name = "numericUpDown_duty_cycle_ld0_green";
        this.numericUpDown_duty_cycle_ld0_green.Size = new System.Drawing.Size(55, 20);
        this.numericUpDown_duty_cycle_ld0_green.Value = new decimal(new int[] {0, 0, 0, 0});
        this.numericUpDown_duty_cycle_ld0_green.ValueChanged += new System.EventHandler(this.numericUpDown_duty_cycle_ld0_green_Write);
        this.numericUpDown_duty_cycle_ld0_green.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.numericUpDown_duty_cycle_ld0_green_KeyPress);
     




    this.groupbox_ld4_ctrl.Location = new System.Drawing.Point(3, 3);
    this.groupbox_ld4_ctrl.Name = "groupbox_ld4_ctrl";
    this.groupbox_ld4_ctrl.Size = new System.Drawing.Size(235, 50);
    this.groupbox_ld4_ctrl.AutoSize = true;
    //this.groupbox_ld4_ctrl.TabIndex = ld4_ctrl${RegisterIndex};
    //this.groupbox_ld4_ctrl.TabStop = false;
    this.groupbox_ld4_ctrl.Text = "ld4_ctrl";
    this.groupbox_temp = this.groupbox_ld4_ctrl;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
   		
        this.groupbox_temp.Controls.Add(checkBox_ld4_ctrl);
        
        this.checkBox_ld4_ctrl.Location = new System.Drawing.Point(10, 20 + this.rowIndex);
        this.rowIndex++;
	    this.checkBox_ld4_ctrl.Name = "checkBox_ld4_ctrl";
	    this.checkBox_ld4_ctrl.Size = new System.Drawing.Size(215, 20);
	    //this.checkBox_ld4_ctrl.TabIndex = ${tabIndex};
	    this.checkBox_ld4_ctrl.Text = "ld4_ctrl";
	    this.checkBox_ld4_ctrl.UseVisualStyleBackColor = true;
	    this.checkBox_ld4_ctrl.CheckedChanged += new System.EventHandler(this.checkBox_ld4_ctrl_Write);
	    this.checkBox_ld4_ctrl.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.checkBox_ld4_ctrl_KeyPress);
	




    this.groupbox_ld5_ctrl.Location = new System.Drawing.Point(3, 3);
    this.groupbox_ld5_ctrl.Name = "groupbox_ld5_ctrl";
    this.groupbox_ld5_ctrl.Size = new System.Drawing.Size(235, 50);
    this.groupbox_ld5_ctrl.AutoSize = true;
    //this.groupbox_ld5_ctrl.TabIndex = ld5_ctrl${RegisterIndex};
    //this.groupbox_ld5_ctrl.TabStop = false;
    this.groupbox_ld5_ctrl.Text = "ld5_ctrl";
    this.groupbox_temp = this.groupbox_ld5_ctrl;
	
    this.rowIndex = 1;
    
	
   		this.rowIndex *= 25;

   
   		
   		this.groupbox_ld4_ctrl.Controls.Add(checkBox_ld5_ctrl);
   		
        this.checkBox_ld5_ctrl.Location = new System.Drawing.Point(10, 20 + this.rowIndex);
        this.rowIndex++;
	    this.checkBox_ld5_ctrl.Name = "checkBox_ld5_ctrl";
	    this.checkBox_ld5_ctrl.Size = new System.Drawing.Size(215, 20);
	    //this.checkBox_ld5_ctrl.TabIndex = ${tabIndex};
	    this.checkBox_ld5_ctrl.Text = "ld5_ctrl";
	    this.checkBox_ld5_ctrl.UseVisualStyleBackColor = true;
	    this.checkBox_ld5_ctrl.CheckedChanged += new System.EventHandler(this.checkBox_ld5_ctrl_Write);
	    this.checkBox_ld5_ctrl.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.checkBox_ld5_ctrl_KeyPress);
	




    this.groupbox_ld6_ctrl.Location = new System.Drawing.Point(3, 3);
    this.groupbox_ld6_ctrl.Name = "groupbox_ld6_ctrl";
    this.groupbox_ld6_ctrl.Size = new System.Drawing.Size(235, 50);
    this.groupbox_ld6_ctrl.AutoSize = true;
    //this.groupbox_ld6_ctrl.TabIndex = ld6_ctrl${RegisterIndex};
    //this.groupbox_ld6_ctrl.TabStop = false;
    this.groupbox_ld6_ctrl.Text = "ld6_ctrl";
    this.groupbox_temp = this.groupbox_ld6_ctrl;
	
    this.rowIndex = 2;
    
	
   		this.rowIndex *= 25;

   
   		
   		this.groupbox_ld4_ctrl.Controls.Add(checkBox_ld6_ctrl);
   		
        this.checkBox_ld6_ctrl.Location = new System.Drawing.Point(10, 20 + this.rowIndex);
        this.rowIndex++;
	    this.checkBox_ld6_ctrl.Name = "checkBox_ld6_ctrl";
	    this.checkBox_ld6_ctrl.Size = new System.Drawing.Size(215, 20);
	    //this.checkBox_ld6_ctrl.TabIndex = ${tabIndex};
	    this.checkBox_ld6_ctrl.Text = "ld6_ctrl";
	    this.checkBox_ld6_ctrl.UseVisualStyleBackColor = true;
	    this.checkBox_ld6_ctrl.CheckedChanged += new System.EventHandler(this.checkBox_ld6_ctrl_Write);
	    this.checkBox_ld6_ctrl.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.checkBox_ld6_ctrl_KeyPress);
	




    this.groupbox_ld7_ctrl.Location = new System.Drawing.Point(3, 3);
    this.groupbox_ld7_ctrl.Name = "groupbox_ld7_ctrl";
    this.groupbox_ld7_ctrl.Size = new System.Drawing.Size(235, 50);
    this.groupbox_ld7_ctrl.AutoSize = true;
    //this.groupbox_ld7_ctrl.TabIndex = ld7_ctrl${RegisterIndex};
    //this.groupbox_ld7_ctrl.TabStop = false;
    this.groupbox_ld7_ctrl.Text = "ld7_ctrl";
    this.groupbox_temp = this.groupbox_ld7_ctrl;
	
    this.rowIndex = 3;
    
	
   		this.rowIndex *= 25;

   
   		
   		this.groupbox_ld4_ctrl.Controls.Add(checkBox_ld7_ctrl);
   		
        this.checkBox_ld7_ctrl.Location = new System.Drawing.Point(10, 20 + this.rowIndex);
        this.rowIndex++;
	    this.checkBox_ld7_ctrl.Name = "checkBox_ld7_ctrl";
	    this.checkBox_ld7_ctrl.Size = new System.Drawing.Size(215, 20);
	    //this.checkBox_ld7_ctrl.TabIndex = ${tabIndex};
	    this.checkBox_ld7_ctrl.Text = "ld7_ctrl";
	    this.checkBox_ld7_ctrl.UseVisualStyleBackColor = true;
	    this.checkBox_ld7_ctrl.CheckedChanged += new System.EventHandler(this.checkBox_ld7_ctrl_Write);
	    this.checkBox_ld7_ctrl.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.checkBox_ld7_ctrl_KeyPress);
	




    this.groupbox_sensor_en.Location = new System.Drawing.Point(3, 3);
    this.groupbox_sensor_en.Name = "groupbox_sensor_en";
    this.groupbox_sensor_en.Size = new System.Drawing.Size(235, 50);
    this.groupbox_sensor_en.AutoSize = true;
    //this.groupbox_sensor_en.TabIndex = sensor_en${RegisterIndex};
    //this.groupbox_sensor_en.TabStop = false;
    this.groupbox_sensor_en.Text = "sensor_en";
    this.groupbox_temp = this.groupbox_sensor_en;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
   		
        this.groupbox_temp.Controls.Add(checkBox_sensor_en);
        
        this.checkBox_sensor_en.Location = new System.Drawing.Point(10, 20 + this.rowIndex);
        this.rowIndex++;
	    this.checkBox_sensor_en.Name = "checkBox_sensor_en";
	    this.checkBox_sensor_en.Size = new System.Drawing.Size(215, 20);
	    //this.checkBox_sensor_en.TabIndex = ${tabIndex};
	    this.checkBox_sensor_en.Text = "sensor_en";
	    this.checkBox_sensor_en.UseVisualStyleBackColor = true;
	    this.checkBox_sensor_en.CheckedChanged += new System.EventHandler(this.checkBox_sensor_en_Write);
	    this.checkBox_sensor_en.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.checkBox_sensor_en_KeyPress);
	




    this.groupbox_sensor_meas.Location = new System.Drawing.Point(3, 3);
    this.groupbox_sensor_meas.Name = "groupbox_sensor_meas";
    this.groupbox_sensor_meas.Size = new System.Drawing.Size(235, 50);
    this.groupbox_sensor_meas.AutoSize = true;
    //this.groupbox_sensor_meas.TabIndex = sensor_meas${RegisterIndex};
    //this.groupbox_sensor_meas.TabStop = false;
    this.groupbox_sensor_meas.Text = "sensor_meas";
    this.groupbox_temp = this.groupbox_sensor_meas;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
   		
        this.groupbox_temp.Controls.Add(checkBox_sensor_meas);
        
        this.checkBox_sensor_meas.Location = new System.Drawing.Point(10, 20 + this.rowIndex);
        this.rowIndex++;
	    this.checkBox_sensor_meas.Name = "checkBox_sensor_meas";
	    this.checkBox_sensor_meas.Size = new System.Drawing.Size(215, 20);
	    //this.checkBox_sensor_meas.TabIndex = ${tabIndex};
	    this.checkBox_sensor_meas.Text = "sensor_meas";
	    this.checkBox_sensor_meas.UseVisualStyleBackColor = true;
	    this.checkBox_sensor_meas.CheckedChanged += new System.EventHandler(this.checkBox_sensor_meas_Write);
	    this.checkBox_sensor_meas.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.checkBox_sensor_meas_KeyPress);
	




    this.groupbox_heater_voltage.Location = new System.Drawing.Point(3, 3);
    this.groupbox_heater_voltage.Name = "groupbox_heater_voltage";
    this.groupbox_heater_voltage.Size = new System.Drawing.Size(235, 50);
    this.groupbox_heater_voltage.AutoSize = true;
    //this.groupbox_heater_voltage.TabIndex = heater_voltage${RegisterIndex};
    //this.groupbox_heater_voltage.TabStop = false;
    this.groupbox_heater_voltage.Text = "heater_voltage";
    this.groupbox_temp = this.groupbox_heater_voltage;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
       this.groupbox_temp.Controls.Add(label_heater_voltage);
       this.groupbox_temp.Controls.Add(numericUpDown_heater_voltage);
       //
        // label_heater_voltage
        //
        this.label_heater_voltage.AutoSize = true;
        this.label_heater_voltage.Location = new System.Drawing.Point(10, 23 + this.rowIndex);
        this.rowIndex++;
        this.label_heater_voltage.Name = "label_heater_voltage";
        this.label_heater_voltage.Size = new System.Drawing.Size(150, 13);
        this.label_heater_voltage.Text = "heater_voltage";
        this.label_heater_voltage.Click += new System.EventHandler(this.numericUpDown_heater_voltage_Read);
        //
        // numericUpDown_heater_voltage
        //
        this.numericUpDown_heater_voltage.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
        this.numericUpDown_heater_voltage.Maximum = new decimal(new int[] {(int)Math.Pow(2, 16)-1, 0, 0, 0});
        this.rowIndex++;
        this.numericUpDown_heater_voltage.Name = "numericUpDown_heater_voltage";
        this.numericUpDown_heater_voltage.Size = new System.Drawing.Size(55, 20);
        this.numericUpDown_heater_voltage.Value = new decimal(new int[] {0, 0, 0, 0});
        this.numericUpDown_heater_voltage.ValueChanged += new System.EventHandler(this.numericUpDown_heater_voltage_Write);
        this.numericUpDown_heater_voltage.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.numericUpDown_heater_voltage_KeyPress);
     




    this.groupbox_rheat_ref.Location = new System.Drawing.Point(3, 3);
    this.groupbox_rheat_ref.Name = "groupbox_rheat_ref";
    this.groupbox_rheat_ref.Size = new System.Drawing.Size(235, 50);
    this.groupbox_rheat_ref.AutoSize = true;
    //this.groupbox_rheat_ref.TabIndex = rheat_ref${RegisterIndex};
    //this.groupbox_rheat_ref.TabStop = false;
    this.groupbox_rheat_ref.Text = "rheat_ref";
    this.groupbox_temp = this.groupbox_rheat_ref;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
       this.groupbox_temp.Controls.Add(label_rheat_ref);
       this.groupbox_temp.Controls.Add(numericUpDown_rheat_ref);
       //
        // label_rheat_ref
        //
        this.label_rheat_ref.AutoSize = true;
        this.label_rheat_ref.Location = new System.Drawing.Point(10, 23 + this.rowIndex);
        this.rowIndex++;
        this.label_rheat_ref.Name = "label_rheat_ref";
        this.label_rheat_ref.Size = new System.Drawing.Size(150, 13);
        this.label_rheat_ref.Text = "rheat_ref";
        this.label_rheat_ref.Click += new System.EventHandler(this.numericUpDown_rheat_ref_Read);
        //
        // numericUpDown_rheat_ref
        //
        this.numericUpDown_rheat_ref.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
        this.numericUpDown_rheat_ref.Maximum = new decimal(new int[] {(int)Math.Pow(2, 16)-1, 0, 0, 0});
        this.rowIndex++;
        this.numericUpDown_rheat_ref.Name = "numericUpDown_rheat_ref";
        this.numericUpDown_rheat_ref.Size = new System.Drawing.Size(55, 20);
        this.numericUpDown_rheat_ref.Value = new decimal(new int[] {0, 0, 0, 0});
        this.numericUpDown_rheat_ref.ValueChanged += new System.EventHandler(this.numericUpDown_rheat_ref_Write);
        this.numericUpDown_rheat_ref.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.numericUpDown_rheat_ref_KeyPress);
     




    this.groupbox_rheat_alpha.Location = new System.Drawing.Point(3, 3);
    this.groupbox_rheat_alpha.Name = "groupbox_rheat_alpha";
    this.groupbox_rheat_alpha.Size = new System.Drawing.Size(235, 50);
    this.groupbox_rheat_alpha.AutoSize = true;
    //this.groupbox_rheat_alpha.TabIndex = rheat_alpha${RegisterIndex};
    //this.groupbox_rheat_alpha.TabStop = false;
    this.groupbox_rheat_alpha.Text = "rheat_alpha";
    this.groupbox_temp = this.groupbox_rheat_alpha;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
       this.groupbox_temp.Controls.Add(label_rheat_alpha);
       this.groupbox_temp.Controls.Add(numericUpDown_rheat_alpha);
       //
        // label_rheat_alpha
        //
        this.label_rheat_alpha.AutoSize = true;
        this.label_rheat_alpha.Location = new System.Drawing.Point(10, 23 + this.rowIndex);
        this.rowIndex++;
        this.label_rheat_alpha.Name = "label_rheat_alpha";
        this.label_rheat_alpha.Size = new System.Drawing.Size(150, 13);
        this.label_rheat_alpha.Text = "rheat_alpha";
        this.label_rheat_alpha.Click += new System.EventHandler(this.numericUpDown_rheat_alpha_Read);
        //
        // numericUpDown_rheat_alpha
        //
        this.numericUpDown_rheat_alpha.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
        this.numericUpDown_rheat_alpha.Maximum = new decimal(new int[] {(int)Math.Pow(2, 16)-1, 0, 0, 0});
        this.rowIndex++;
        this.numericUpDown_rheat_alpha.Name = "numericUpDown_rheat_alpha";
        this.numericUpDown_rheat_alpha.Size = new System.Drawing.Size(55, 20);
        this.numericUpDown_rheat_alpha.Value = new decimal(new int[] {0, 0, 0, 0});
        this.numericUpDown_rheat_alpha.ValueChanged += new System.EventHandler(this.numericUpDown_rheat_alpha_Write);
        this.numericUpDown_rheat_alpha.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.numericUpDown_rheat_alpha_KeyPress);
     




    this.groupbox_adc_input_gain.Location = new System.Drawing.Point(3, 3);
    this.groupbox_adc_input_gain.Name = "groupbox_adc_input_gain";
    this.groupbox_adc_input_gain.Size = new System.Drawing.Size(235, 50);
    this.groupbox_adc_input_gain.AutoSize = true;
    //this.groupbox_adc_input_gain.TabIndex = adc_input_gain${RegisterIndex};
    //this.groupbox_adc_input_gain.TabStop = false;
    this.groupbox_adc_input_gain.Text = "adc_input_gain";
    this.groupbox_temp = this.groupbox_adc_input_gain;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
       this.groupbox_temp.Controls.Add(label_adc_input_gain);
       this.groupbox_temp.Controls.Add(numericUpDown_adc_input_gain);
       //
        // label_adc_input_gain
        //
        this.label_adc_input_gain.AutoSize = true;
        this.label_adc_input_gain.Location = new System.Drawing.Point(10, 23 + this.rowIndex);
        this.rowIndex++;
        this.label_adc_input_gain.Name = "label_adc_input_gain";
        this.label_adc_input_gain.Size = new System.Drawing.Size(150, 13);
        this.label_adc_input_gain.Text = "adc_input_gain";
        this.label_adc_input_gain.Click += new System.EventHandler(this.numericUpDown_adc_input_gain_Read);
        //
        // numericUpDown_adc_input_gain
        //
        this.numericUpDown_adc_input_gain.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
        this.numericUpDown_adc_input_gain.Maximum = new decimal(new int[] {(int)Math.Pow(2, 8)-1, 0, 0, 0});
        this.rowIndex++;
        this.numericUpDown_adc_input_gain.Name = "numericUpDown_adc_input_gain";
        this.numericUpDown_adc_input_gain.Size = new System.Drawing.Size(55, 20);
        this.numericUpDown_adc_input_gain.Value = new decimal(new int[] {0, 0, 0, 0});
        this.numericUpDown_adc_input_gain.ValueChanged += new System.EventHandler(this.numericUpDown_adc_input_gain_Write);
        this.numericUpDown_adc_input_gain.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.numericUpDown_adc_input_gain_KeyPress);
     




    this.groupbox_sample_rate.Location = new System.Drawing.Point(3, 3);
    this.groupbox_sample_rate.Name = "groupbox_sample_rate";
    this.groupbox_sample_rate.Size = new System.Drawing.Size(235, 50);
    this.groupbox_sample_rate.AutoSize = true;
    //this.groupbox_sample_rate.TabIndex = sample_rate${RegisterIndex};
    //this.groupbox_sample_rate.TabStop = false;
    this.groupbox_sample_rate.Text = "sample_rate";
    this.groupbox_temp = this.groupbox_sample_rate;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
       this.groupbox_temp.Controls.Add(label_sample_rate);
       this.groupbox_temp.Controls.Add(numericUpDown_sample_rate);
       //
        // label_sample_rate
        //
        this.label_sample_rate.AutoSize = true;
        this.label_sample_rate.Location = new System.Drawing.Point(10, 23 + this.rowIndex);
        this.rowIndex++;
        this.label_sample_rate.Name = "label_sample_rate";
        this.label_sample_rate.Size = new System.Drawing.Size(150, 13);
        this.label_sample_rate.Text = "sample_rate";
        this.label_sample_rate.Click += new System.EventHandler(this.numericUpDown_sample_rate_Read);
        //
        // numericUpDown_sample_rate
        //
        this.numericUpDown_sample_rate.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
        this.numericUpDown_sample_rate.Maximum = new decimal(new int[] {(int)Math.Pow(2, 8)-1, 0, 0, 0});
        this.rowIndex++;
        this.numericUpDown_sample_rate.Name = "numericUpDown_sample_rate";
        this.numericUpDown_sample_rate.Size = new System.Drawing.Size(55, 20);
        this.numericUpDown_sample_rate.Value = new decimal(new int[] {0, 0, 0, 0});
        this.numericUpDown_sample_rate.ValueChanged += new System.EventHandler(this.numericUpDown_sample_rate_Write);
        this.numericUpDown_sample_rate.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.numericUpDown_sample_rate_KeyPress);
     




    this.groupbox_on_cycles.Location = new System.Drawing.Point(3, 3);
    this.groupbox_on_cycles.Name = "groupbox_on_cycles";
    this.groupbox_on_cycles.Size = new System.Drawing.Size(235, 50);
    this.groupbox_on_cycles.AutoSize = true;
    //this.groupbox_on_cycles.TabIndex = on_cycles${RegisterIndex};
    //this.groupbox_on_cycles.TabStop = false;
    this.groupbox_on_cycles.Text = "on_cycles";
    this.groupbox_temp = this.groupbox_on_cycles;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
       this.groupbox_temp.Controls.Add(label_on_cycles);
       this.groupbox_temp.Controls.Add(numericUpDown_on_cycles);
       //
        // label_on_cycles
        //
        this.label_on_cycles.AutoSize = true;
        this.label_on_cycles.Location = new System.Drawing.Point(10, 23 + this.rowIndex);
        this.rowIndex++;
        this.label_on_cycles.Name = "label_on_cycles";
        this.label_on_cycles.Size = new System.Drawing.Size(150, 13);
        this.label_on_cycles.Text = "on_cycles";
        this.label_on_cycles.Click += new System.EventHandler(this.numericUpDown_on_cycles_Read);
        //
        // numericUpDown_on_cycles
        //
        this.numericUpDown_on_cycles.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
        this.numericUpDown_on_cycles.Maximum = new decimal(new int[] {(int)Math.Pow(2, 8)-1, 0, 0, 0});
        this.rowIndex++;
        this.numericUpDown_on_cycles.Name = "numericUpDown_on_cycles";
        this.numericUpDown_on_cycles.Size = new System.Drawing.Size(55, 20);
        this.numericUpDown_on_cycles.Value = new decimal(new int[] {0, 0, 0, 0});
        this.numericUpDown_on_cycles.ValueChanged += new System.EventHandler(this.numericUpDown_on_cycles_Write);
        this.numericUpDown_on_cycles.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.numericUpDown_on_cycles_KeyPress);
     




    this.groupbox_off_cycles.Location = new System.Drawing.Point(3, 3);
    this.groupbox_off_cycles.Name = "groupbox_off_cycles";
    this.groupbox_off_cycles.Size = new System.Drawing.Size(235, 50);
    this.groupbox_off_cycles.AutoSize = true;
    //this.groupbox_off_cycles.TabIndex = off_cycles${RegisterIndex};
    //this.groupbox_off_cycles.TabStop = false;
    this.groupbox_off_cycles.Text = "off_cycles";
    this.groupbox_temp = this.groupbox_off_cycles;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
       this.groupbox_temp.Controls.Add(label_off_cycles);
       this.groupbox_temp.Controls.Add(numericUpDown_off_cycles);
       //
        // label_off_cycles
        //
        this.label_off_cycles.AutoSize = true;
        this.label_off_cycles.Location = new System.Drawing.Point(10, 23 + this.rowIndex);
        this.rowIndex++;
        this.label_off_cycles.Name = "label_off_cycles";
        this.label_off_cycles.Size = new System.Drawing.Size(150, 13);
        this.label_off_cycles.Text = "off_cycles";
        this.label_off_cycles.Click += new System.EventHandler(this.numericUpDown_off_cycles_Read);
        //
        // numericUpDown_off_cycles
        //
        this.numericUpDown_off_cycles.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
        this.numericUpDown_off_cycles.Maximum = new decimal(new int[] {(int)Math.Pow(2, 8)-1, 0, 0, 0});
        this.rowIndex++;
        this.numericUpDown_off_cycles.Name = "numericUpDown_off_cycles";
        this.numericUpDown_off_cycles.Size = new System.Drawing.Size(55, 20);
        this.numericUpDown_off_cycles.Value = new decimal(new int[] {0, 0, 0, 0});
        this.numericUpDown_off_cycles.ValueChanged += new System.EventHandler(this.numericUpDown_off_cycles_Write);
        this.numericUpDown_off_cycles.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.numericUpDown_off_cycles_KeyPress);
     




    this.groupbox_set_hh_temp.Location = new System.Drawing.Point(3, 3);
    this.groupbox_set_hh_temp.Name = "groupbox_set_hh_temp";
    this.groupbox_set_hh_temp.Size = new System.Drawing.Size(235, 50);
    this.groupbox_set_hh_temp.AutoSize = true;
    //this.groupbox_set_hh_temp.TabIndex = set_hh_temp${RegisterIndex};
    //this.groupbox_set_hh_temp.TabStop = false;
    this.groupbox_set_hh_temp.Text = "set_hh_temp";
    this.groupbox_temp = this.groupbox_set_hh_temp;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
       this.groupbox_temp.Controls.Add(label_set_hh_temp);
       this.groupbox_temp.Controls.Add(numericUpDown_set_hh_temp);
       //
        // label_set_hh_temp
        //
        this.label_set_hh_temp.AutoSize = true;
        this.label_set_hh_temp.Location = new System.Drawing.Point(10, 23 + this.rowIndex);
        this.rowIndex++;
        this.label_set_hh_temp.Name = "label_set_hh_temp";
        this.label_set_hh_temp.Size = new System.Drawing.Size(150, 13);
        this.label_set_hh_temp.Text = "set_hh_temp";
        this.label_set_hh_temp.Click += new System.EventHandler(this.numericUpDown_set_hh_temp_Read);
        //
        // numericUpDown_set_hh_temp
        //
        this.numericUpDown_set_hh_temp.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
        this.numericUpDown_set_hh_temp.Maximum = new decimal(new int[] {(int)Math.Pow(2, 16)-1, 0, 0, 0});
        this.rowIndex++;
        this.numericUpDown_set_hh_temp.Name = "numericUpDown_set_hh_temp";
        this.numericUpDown_set_hh_temp.Size = new System.Drawing.Size(55, 20);
        this.numericUpDown_set_hh_temp.Value = new decimal(new int[] {0, 0, 0, 0});
        this.numericUpDown_set_hh_temp.ValueChanged += new System.EventHandler(this.numericUpDown_set_hh_temp_Write);
        this.numericUpDown_set_hh_temp.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.numericUpDown_set_hh_temp_KeyPress);
     




    this.groupbox_wait_cycles.Location = new System.Drawing.Point(3, 3);
    this.groupbox_wait_cycles.Name = "groupbox_wait_cycles";
    this.groupbox_wait_cycles.Size = new System.Drawing.Size(235, 50);
    this.groupbox_wait_cycles.AutoSize = true;
    //this.groupbox_wait_cycles.TabIndex = wait_cycles${RegisterIndex};
    //this.groupbox_wait_cycles.TabStop = false;
    this.groupbox_wait_cycles.Text = "wait_cycles";
    this.groupbox_temp = this.groupbox_wait_cycles;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
       this.groupbox_temp.Controls.Add(label_wait_cycles);
       this.groupbox_temp.Controls.Add(numericUpDown_wait_cycles);
       //
        // label_wait_cycles
        //
        this.label_wait_cycles.AutoSize = true;
        this.label_wait_cycles.Location = new System.Drawing.Point(10, 23 + this.rowIndex);
        this.rowIndex++;
        this.label_wait_cycles.Name = "label_wait_cycles";
        this.label_wait_cycles.Size = new System.Drawing.Size(150, 13);
        this.label_wait_cycles.Text = "wait_cycles";
        this.label_wait_cycles.Click += new System.EventHandler(this.numericUpDown_wait_cycles_Read);
        //
        // numericUpDown_wait_cycles
        //
        this.numericUpDown_wait_cycles.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
        this.numericUpDown_wait_cycles.Maximum = new decimal(new int[] {(int)Math.Pow(2, 16)-1, 0, 0, 0});
        this.rowIndex++;
        this.numericUpDown_wait_cycles.Name = "numericUpDown_wait_cycles";
        this.numericUpDown_wait_cycles.Size = new System.Drawing.Size(55, 20);
        this.numericUpDown_wait_cycles.Value = new decimal(new int[] {0, 0, 0, 0});
        this.numericUpDown_wait_cycles.ValueChanged += new System.EventHandler(this.numericUpDown_wait_cycles_Write);
        this.numericUpDown_wait_cycles.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.numericUpDown_wait_cycles_KeyPress);
     




    this.groupbox_meas_cnt.Location = new System.Drawing.Point(3, 3);
    this.groupbox_meas_cnt.Name = "groupbox_meas_cnt";
    this.groupbox_meas_cnt.Size = new System.Drawing.Size(235, 50);
    this.groupbox_meas_cnt.AutoSize = true;
    //this.groupbox_meas_cnt.TabIndex = meas_cnt${RegisterIndex};
    //this.groupbox_meas_cnt.TabStop = false;
    this.groupbox_meas_cnt.Text = "meas_cnt";
    this.groupbox_temp = this.groupbox_meas_cnt;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
       this.groupbox_temp.Controls.Add(label_meas_cnt);
       this.groupbox_temp.Controls.Add(numericUpDown_meas_cnt);
       //
        // label_meas_cnt
        //
        this.label_meas_cnt.AutoSize = true;
        this.label_meas_cnt.Location = new System.Drawing.Point(10, 23 + this.rowIndex);
        this.rowIndex++;
        this.label_meas_cnt.Name = "label_meas_cnt";
        this.label_meas_cnt.Size = new System.Drawing.Size(150, 13);
        this.label_meas_cnt.Text = "meas_cnt";
        this.label_meas_cnt.Click += new System.EventHandler(this.numericUpDown_meas_cnt_Read);
        //
        // numericUpDown_meas_cnt
        //
        this.numericUpDown_meas_cnt.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
        this.numericUpDown_meas_cnt.Maximum = new decimal(new int[] {(int)Math.Pow(2, 16)-1, 0, 0, 0});
        this.rowIndex++;
        this.numericUpDown_meas_cnt.Name = "numericUpDown_meas_cnt";
        this.numericUpDown_meas_cnt.Size = new System.Drawing.Size(55, 20);
        this.numericUpDown_meas_cnt.Value = new decimal(new int[] {0, 0, 0, 0});
        this.numericUpDown_meas_cnt.ValueChanged += new System.EventHandler(this.numericUpDown_meas_cnt_Write);
        this.numericUpDown_meas_cnt.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.numericUpDown_meas_cnt_KeyPress);
     




    this.groupbox_led_ctrl.Location = new System.Drawing.Point(3, 3);
    this.groupbox_led_ctrl.Name = "groupbox_led_ctrl";
    this.groupbox_led_ctrl.Size = new System.Drawing.Size(235, 50);
    this.groupbox_led_ctrl.AutoSize = true;
    //this.groupbox_led_ctrl.TabIndex = led_ctrl${RegisterIndex};
    //this.groupbox_led_ctrl.TabStop = false;
    this.groupbox_led_ctrl.Text = "led_ctrl";
    this.groupbox_temp = this.groupbox_led_ctrl;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
       this.groupbox_temp.Controls.Add(label_led_ctrl);
       this.groupbox_temp.Controls.Add(numericUpDown_led_ctrl);
       //
        // label_led_ctrl
        //
        this.label_led_ctrl.AutoSize = true;
        this.label_led_ctrl.Location = new System.Drawing.Point(10, 23 + this.rowIndex);
        this.rowIndex++;
        this.label_led_ctrl.Name = "label_led_ctrl";
        this.label_led_ctrl.Size = new System.Drawing.Size(150, 13);
        this.label_led_ctrl.Text = "led_ctrl";
        this.label_led_ctrl.Click += new System.EventHandler(this.numericUpDown_led_ctrl_Read);
        //
        // numericUpDown_led_ctrl
        //
        this.numericUpDown_led_ctrl.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
        this.numericUpDown_led_ctrl.Maximum = new decimal(new int[] {(int)Math.Pow(2, 8)-1, 0, 0, 0});
        this.rowIndex++;
        this.numericUpDown_led_ctrl.Name = "numericUpDown_led_ctrl";
        this.numericUpDown_led_ctrl.Size = new System.Drawing.Size(55, 20);
        this.numericUpDown_led_ctrl.Value = new decimal(new int[] {0, 0, 0, 0});
        this.numericUpDown_led_ctrl.ValueChanged += new System.EventHandler(this.numericUpDown_led_ctrl_Write);
        this.numericUpDown_led_ctrl.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.numericUpDown_led_ctrl_KeyPress);
     




    this.groupbox_meas_done.Location = new System.Drawing.Point(3, 3);
    this.groupbox_meas_done.Name = "groupbox_meas_done";
    this.groupbox_meas_done.Size = new System.Drawing.Size(235, 50);
    this.groupbox_meas_done.AutoSize = true;
    //this.groupbox_meas_done.TabIndex = meas_done${RegisterIndex};
    //this.groupbox_meas_done.TabStop = false;
    this.groupbox_meas_done.Text = "meas_done";
    this.groupbox_temp = this.groupbox_meas_done;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;


      this.groupbox_temp.Controls.Add(label_meas_done);
      this.groupbox_temp.Controls.Add(textBox_meas_done);
      //
            // label_meas_done
            //
            this.label_meas_done.Location = new System.Drawing.Point(10, 23 + this.rowIndex++);
            this.rowIndex++;
            this.label_meas_done.Location = new System.Drawing.Point(10, 23);          
            this.label_meas_done.Name = "label_meas_done";
            this.label_meas_done.Size = new System.Drawing.Size(150, 13);
            this.label_meas_done.Text = "meas_done";
            //
            // textBox_meas_done
            //
            this.textBox_meas_done.Enabled = true;
            this.textBox_meas_done.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
            this.rowIndex++;
            this.textBox_meas_done.Name = "textBox_meas_done";
            this.textBox_meas_done.ReadOnly = true;
            this.textBox_meas_done.Size = new System.Drawing.Size(55, 20);
            this.textBox_meas_done.Text = "---";
            this.textBox_meas_done.Click += new System.EventHandler(this.textBox_meas_done_Read);
            this.textBox_meas_done.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.textBox_meas_done_KeyPress);



    this.groupbox_meas_result.Location = new System.Drawing.Point(3, 3);
    this.groupbox_meas_result.Name = "groupbox_meas_result";
    this.groupbox_meas_result.Size = new System.Drawing.Size(235, 50);
    this.groupbox_meas_result.AutoSize = true;
    //this.groupbox_meas_result.TabIndex = meas_result${RegisterIndex};
    //this.groupbox_meas_result.TabStop = false;
    this.groupbox_meas_result.Text = "meas_result";
    this.groupbox_temp = this.groupbox_meas_result;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;


      this.groupbox_temp.Controls.Add(label_meas_result);
      this.groupbox_temp.Controls.Add(textBox_meas_result);
      //
            // label_meas_result
            //
            this.label_meas_result.Location = new System.Drawing.Point(10, 23 + this.rowIndex++);
            this.rowIndex++;
            this.label_meas_result.Location = new System.Drawing.Point(10, 23);          
            this.label_meas_result.Name = "label_meas_result";
            this.label_meas_result.Size = new System.Drawing.Size(150, 13);
            this.label_meas_result.Text = "meas_result";
            //
            // textBox_meas_result
            //
            this.textBox_meas_result.Enabled = true;
            this.textBox_meas_result.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
            this.rowIndex++;
            this.textBox_meas_result.Name = "textBox_meas_result";
            this.textBox_meas_result.ReadOnly = true;
            this.textBox_meas_result.Size = new System.Drawing.Size(55, 20);
            this.textBox_meas_result.Text = "---";
            this.textBox_meas_result.Click += new System.EventHandler(this.textBox_meas_result_Read);
            this.textBox_meas_result.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.textBox_meas_result_KeyPress);



    this.groupbox_smpl_first.Location = new System.Drawing.Point(3, 3);
    this.groupbox_smpl_first.Name = "groupbox_smpl_first";
    this.groupbox_smpl_first.Size = new System.Drawing.Size(235, 50);
    this.groupbox_smpl_first.AutoSize = true;
    //this.groupbox_smpl_first.TabIndex = smpl_first${RegisterIndex};
    //this.groupbox_smpl_first.TabStop = false;
    this.groupbox_smpl_first.Text = "smpl_first";
    this.groupbox_temp = this.groupbox_smpl_first;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
       this.groupbox_temp.Controls.Add(label_smpl_first);
       this.groupbox_temp.Controls.Add(numericUpDown_smpl_first);
       //
        // label_smpl_first
        //
        this.label_smpl_first.AutoSize = true;
        this.label_smpl_first.Location = new System.Drawing.Point(10, 23 + this.rowIndex);
        this.rowIndex++;
        this.label_smpl_first.Name = "label_smpl_first";
        this.label_smpl_first.Size = new System.Drawing.Size(150, 13);
        this.label_smpl_first.Text = "smpl_first";
        this.label_smpl_first.Click += new System.EventHandler(this.numericUpDown_smpl_first_Read);
        //
        // numericUpDown_smpl_first
        //
        this.numericUpDown_smpl_first.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
        this.numericUpDown_smpl_first.Maximum = new decimal(new int[] {(int)Math.Pow(2, 8)-1, 0, 0, 0});
        this.rowIndex++;
        this.numericUpDown_smpl_first.Name = "numericUpDown_smpl_first";
        this.numericUpDown_smpl_first.Size = new System.Drawing.Size(55, 20);
        this.numericUpDown_smpl_first.Value = new decimal(new int[] {0, 0, 0, 0});
        this.numericUpDown_smpl_first.ValueChanged += new System.EventHandler(this.numericUpDown_smpl_first_Write);
        this.numericUpDown_smpl_first.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.numericUpDown_smpl_first_KeyPress);
     




    this.groupbox_smpl_last.Location = new System.Drawing.Point(3, 3);
    this.groupbox_smpl_last.Name = "groupbox_smpl_last";
    this.groupbox_smpl_last.Size = new System.Drawing.Size(235, 50);
    this.groupbox_smpl_last.AutoSize = true;
    //this.groupbox_smpl_last.TabIndex = smpl_last${RegisterIndex};
    //this.groupbox_smpl_last.TabStop = false;
    this.groupbox_smpl_last.Text = "smpl_last";
    this.groupbox_temp = this.groupbox_smpl_last;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
       this.groupbox_temp.Controls.Add(label_smpl_last);
       this.groupbox_temp.Controls.Add(numericUpDown_smpl_last);
       //
        // label_smpl_last
        //
        this.label_smpl_last.AutoSize = true;
        this.label_smpl_last.Location = new System.Drawing.Point(10, 23 + this.rowIndex);
        this.rowIndex++;
        this.label_smpl_last.Name = "label_smpl_last";
        this.label_smpl_last.Size = new System.Drawing.Size(150, 13);
        this.label_smpl_last.Text = "smpl_last";
        this.label_smpl_last.Click += new System.EventHandler(this.numericUpDown_smpl_last_Read);
        //
        // numericUpDown_smpl_last
        //
        this.numericUpDown_smpl_last.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
        this.numericUpDown_smpl_last.Maximum = new decimal(new int[] {(int)Math.Pow(2, 8)-1, 0, 0, 0});
        this.rowIndex++;
        this.numericUpDown_smpl_last.Name = "numericUpDown_smpl_last";
        this.numericUpDown_smpl_last.Size = new System.Drawing.Size(55, 20);
        this.numericUpDown_smpl_last.Value = new decimal(new int[] {0, 0, 0, 0});
        this.numericUpDown_smpl_last.ValueChanged += new System.EventHandler(this.numericUpDown_smpl_last_Write);
        this.numericUpDown_smpl_last.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.numericUpDown_smpl_last_KeyPress);
     




    this.groupbox_k_factor.Location = new System.Drawing.Point(3, 3);
    this.groupbox_k_factor.Name = "groupbox_k_factor";
    this.groupbox_k_factor.Size = new System.Drawing.Size(235, 50);
    this.groupbox_k_factor.AutoSize = true;
    //this.groupbox_k_factor.TabIndex = k_factor${RegisterIndex};
    //this.groupbox_k_factor.TabStop = false;
    this.groupbox_k_factor.Text = "k_factor";
    this.groupbox_temp = this.groupbox_k_factor;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;

   
       this.groupbox_temp.Controls.Add(label_k_factor);
       this.groupbox_temp.Controls.Add(numericUpDown_k_factor);
       //
        // label_k_factor
        //
        this.label_k_factor.AutoSize = true;
        this.label_k_factor.Location = new System.Drawing.Point(10, 23 + this.rowIndex);
        this.rowIndex++;
        this.label_k_factor.Name = "label_k_factor";
        this.label_k_factor.Size = new System.Drawing.Size(150, 13);
        this.label_k_factor.Text = "k_factor";
        this.label_k_factor.Click += new System.EventHandler(this.numericUpDown_k_factor_Read);
        //
        // numericUpDown_k_factor
        //
        this.numericUpDown_k_factor.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
        this.numericUpDown_k_factor.Maximum = new decimal(new int[] {(int)Math.Pow(2, 16)-1, 0, 0, 0});
        this.rowIndex++;
        this.numericUpDown_k_factor.Name = "numericUpDown_k_factor";
        this.numericUpDown_k_factor.Size = new System.Drawing.Size(55, 20);
        this.numericUpDown_k_factor.Value = new decimal(new int[] {0, 0, 0, 0});
        this.numericUpDown_k_factor.ValueChanged += new System.EventHandler(this.numericUpDown_k_factor_Write);
        this.numericUpDown_k_factor.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.numericUpDown_k_factor_KeyPress);
     




    this.groupbox_ppm.Location = new System.Drawing.Point(3, 3);
    this.groupbox_ppm.Name = "groupbox_ppm";
    this.groupbox_ppm.Size = new System.Drawing.Size(235, 50);
    this.groupbox_ppm.AutoSize = true;
    //this.groupbox_ppm.TabIndex = ppm${RegisterIndex};
    //this.groupbox_ppm.TabStop = false;
    this.groupbox_ppm.Text = "ppm";
    this.groupbox_temp = this.groupbox_ppm;
	
    this.rowIndex = 0;
    
	
   		this.rowIndex *= 25;


      this.groupbox_temp.Controls.Add(label_ppm);
      this.groupbox_temp.Controls.Add(textBox_ppm);
      //
            // label_ppm
            //
            this.label_ppm.Location = new System.Drawing.Point(10, 23 + this.rowIndex++);
            this.rowIndex++;
            this.label_ppm.Location = new System.Drawing.Point(10, 23);          
            this.label_ppm.Name = "label_ppm";
            this.label_ppm.Size = new System.Drawing.Size(150, 13);
            this.label_ppm.Text = "ppm";
            //
            // textBox_ppm
            //
            this.textBox_ppm.Enabled = true;
            this.textBox_ppm.Location = new System.Drawing.Point(170, 20 + this.rowIndex);
            this.rowIndex++;
            this.textBox_ppm.Name = "textBox_ppm";
            this.textBox_ppm.ReadOnly = true;
            this.textBox_ppm.Size = new System.Drawing.Size(55, 20);
            this.textBox_ppm.Text = "---";
            this.textBox_ppm.Click += new System.EventHandler(this.textBox_ppm_Read);
            this.textBox_ppm.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.textBox_ppm_KeyPress);





            //
            // toolTip1
            //
            this.toolTip1.ShowAlways = true;
            //
            // toolStripStatusLabel
            //
            this.toolStripStatusLabel.AutoSize = false;
            this.toolStripStatusLabel.Name = "toolStripStatusLabel";
            this.toolStripStatusLabel.Size = new System.Drawing.Size(300, 17);
            this.toolStripStatusLabel.Text = "---";
            this.toolStripStatusLabel.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            //
            // toolStripProgressBar
            //
            this.toolStripProgressBar.Name = "toolStripProgressBar";
            this.toolStripProgressBar.Size = new System.Drawing.Size(300, 16);
            //
            // backgroundWorkerCom
            //
            this.backgroundWorkerCom.WorkerReportsProgress = true;
            this.backgroundWorkerCom.WorkerSupportsCancellation = true;
            //
            // FormMain
            //
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(784, 562);
			this.Controls.Add(this.groupBoxConnect);
            this.Controls.Add(this.tabControlMain);
            this.Controls.Add(this.statusStrip1);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "FormMain";
            this.Text = "FormMain";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.MainForm_FormClosing);
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.flowLayoutPanel1.ResumeLayout(false);
            this.ResumeLayout(false);
            this.PerformLayout();
        }
        #endregion
        
        #region widget decleration
        private System.Windows.Forms.GroupBox groupbox_temp;
        private System.Windows.Forms.StatusStrip statusStrip1;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem fileToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem openToolStripMenuItem;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator;
        private System.Windows.Forms.ToolStripMenuItem saveToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem saveAsToolStripMenuItem;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
        private System.Windows.Forms.ToolStripMenuItem exitToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem helpToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem contentsToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem indexToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem searchToolStripMenuItem;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator5;
        private System.Windows.Forms.ToolStripMenuItem aboutToolStripMenuItem;
		private System.Windows.Forms.GroupBox groupBoxConnect;
        private System.Windows.Forms.NumericUpDown numericUpDownSensorHubPort;
        private System.Windows.Forms.NumericUpDown numericUpDownSensorHubChannel;
        private System.Windows.Forms.NumericUpDown numericUpDownSensorHubDeviceAddress;
        private System.Windows.Forms.Label labelSensorHubDeviceAddress;
        private System.Windows.Forms.Label labelSensorHubChannel;
        private System.Windows.Forms.Label labelSensorHubPort;
        private System.Windows.Forms.Label labelConnectSensorHub;
        private System.Windows.Forms.Button buttonCOMPortRefresh;
        private System.Windows.Forms.ComboBox comboBoxCOMPorts;
        private System.Windows.Forms.Label labelConnectCOMPort;
		private System.Windows.Forms.ComboBox comboBoxProtocol;
        private System.Windows.Forms.Label labelProtocol;
        private System.Windows.Forms.TabControl tabControlMain;
        private System.Windows.Forms.TabPage tabPageFunctions;
        private System.Windows.Forms.TabPage tabPageRegisters;
        private System.Windows.Forms.FlowLayoutPanel flowLayoutPanel1;
		private System.Windows.Forms.ToolTip toolTip1;
        private System.Windows.Forms.Button buttonReadSensor;
        private System.Windows.Forms.Button buttonExecuteMeasurement;
        private System.Windows.Forms.Button buttonCancel;
        private System.ComponentModel.BackgroundWorker backgroundWorkerCom;
        private System.Windows.Forms.DataVisualization.Charting.Chart chartResults;
		
	
	
	private System.Windows.Forms.GroupBox groupbox_ld0_per;
	

   
       private System.Windows.Forms.Label label_ld0_per;
       private System.Windows.Forms.NumericUpDown numericUpDown_ld0_per;
     




	private System.Windows.Forms.GroupBox groupbox_duty_cycle_ld0_blue;
	

   
       private System.Windows.Forms.Label label_duty_cycle_ld0_blue;
       private System.Windows.Forms.NumericUpDown numericUpDown_duty_cycle_ld0_blue;
     




	private System.Windows.Forms.GroupBox groupbox_duty_cycle_ld0_green;
	

   
       private System.Windows.Forms.Label label_duty_cycle_ld0_green;
       private System.Windows.Forms.NumericUpDown numericUpDown_duty_cycle_ld0_green;
     




	private System.Windows.Forms.GroupBox groupbox_ld4_ctrl;
	

   
       private System.Windows.Forms.CheckBox checkBox_ld4_ctrl;
	




	private System.Windows.Forms.GroupBox groupbox_ld5_ctrl;
	

   
       private System.Windows.Forms.CheckBox checkBox_ld5_ctrl;
	




	private System.Windows.Forms.GroupBox groupbox_ld6_ctrl;
	

   
       private System.Windows.Forms.CheckBox checkBox_ld6_ctrl;
	




	private System.Windows.Forms.GroupBox groupbox_ld7_ctrl;
	

   
       private System.Windows.Forms.CheckBox checkBox_ld7_ctrl;
	




	private System.Windows.Forms.GroupBox groupbox_sensor_en;
	

   
       private System.Windows.Forms.CheckBox checkBox_sensor_en;
	




	private System.Windows.Forms.GroupBox groupbox_sensor_meas;
	

   
       private System.Windows.Forms.CheckBox checkBox_sensor_meas;
	




	private System.Windows.Forms.GroupBox groupbox_heater_voltage;
	

   
       private System.Windows.Forms.Label label_heater_voltage;
       private System.Windows.Forms.NumericUpDown numericUpDown_heater_voltage;
     




	private System.Windows.Forms.GroupBox groupbox_rheat_ref;
	

   
       private System.Windows.Forms.Label label_rheat_ref;
       private System.Windows.Forms.NumericUpDown numericUpDown_rheat_ref;
     




	private System.Windows.Forms.GroupBox groupbox_rheat_alpha;
	

   
       private System.Windows.Forms.Label label_rheat_alpha;
       private System.Windows.Forms.NumericUpDown numericUpDown_rheat_alpha;
     




	private System.Windows.Forms.GroupBox groupbox_adc_input_gain;
	

   
       private System.Windows.Forms.Label label_adc_input_gain;
       private System.Windows.Forms.NumericUpDown numericUpDown_adc_input_gain;
     




	private System.Windows.Forms.GroupBox groupbox_sample_rate;
	

   
       private System.Windows.Forms.Label label_sample_rate;
       private System.Windows.Forms.NumericUpDown numericUpDown_sample_rate;
     




	private System.Windows.Forms.GroupBox groupbox_on_cycles;
	

   
       private System.Windows.Forms.Label label_on_cycles;
       private System.Windows.Forms.NumericUpDown numericUpDown_on_cycles;
     




	private System.Windows.Forms.GroupBox groupbox_off_cycles;
	

   
       private System.Windows.Forms.Label label_off_cycles;
       private System.Windows.Forms.NumericUpDown numericUpDown_off_cycles;
     




	private System.Windows.Forms.GroupBox groupbox_set_hh_temp;
	

   
       private System.Windows.Forms.Label label_set_hh_temp;
       private System.Windows.Forms.NumericUpDown numericUpDown_set_hh_temp;
     




	private System.Windows.Forms.GroupBox groupbox_wait_cycles;
	

   
       private System.Windows.Forms.Label label_wait_cycles;
       private System.Windows.Forms.NumericUpDown numericUpDown_wait_cycles;
     




	private System.Windows.Forms.GroupBox groupbox_meas_cnt;
	

   
       private System.Windows.Forms.Label label_meas_cnt;
       private System.Windows.Forms.NumericUpDown numericUpDown_meas_cnt;
     




	private System.Windows.Forms.GroupBox groupbox_led_ctrl;
	

   
       private System.Windows.Forms.Label label_led_ctrl;
       private System.Windows.Forms.NumericUpDown numericUpDown_led_ctrl;
     




	private System.Windows.Forms.GroupBox groupbox_meas_done;
	


   	   private System.Windows.Forms.Label label_meas_done;
       private System.Windows.Forms.TextBox textBox_meas_done;



	private System.Windows.Forms.GroupBox groupbox_meas_result;
	


   	   private System.Windows.Forms.Label label_meas_result;
       private System.Windows.Forms.TextBox textBox_meas_result;



	private System.Windows.Forms.GroupBox groupbox_smpl_first;
	

   
       private System.Windows.Forms.Label label_smpl_first;
       private System.Windows.Forms.NumericUpDown numericUpDown_smpl_first;
     




	private System.Windows.Forms.GroupBox groupbox_smpl_last;
	

   
       private System.Windows.Forms.Label label_smpl_last;
       private System.Windows.Forms.NumericUpDown numericUpDown_smpl_last;
     




	private System.Windows.Forms.GroupBox groupbox_k_factor;
	

   
       private System.Windows.Forms.Label label_k_factor;
       private System.Windows.Forms.NumericUpDown numericUpDown_k_factor;
     




	private System.Windows.Forms.GroupBox groupbox_ppm;
	


   	   private System.Windows.Forms.Label label_ppm;
       private System.Windows.Forms.TextBox textBox_ppm;





        // statusbar
        private System.Windows.Forms.ToolStripStatusLabel toolStripStatusLabel;
        private System.Windows.Forms.ToolStripProgressBar toolStripProgressBar;
        #endregion
    }
}
