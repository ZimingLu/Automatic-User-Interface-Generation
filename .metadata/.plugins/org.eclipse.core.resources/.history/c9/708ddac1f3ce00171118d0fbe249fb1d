
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace MasterThesis
{
    public partial class FormMain : Form
    {
        private DevicePort devicePort;
        private BackgroundWorker backgroundWorkerCommunicate;
        private string loggerFileName = "log.txt";

        public FormMain()
        {
            InitializeComponent();
            // Initialize members
            devicePort = new DevicePort();

            // Initialize COM ports
            this.buttonCOMPortRefresh_Click(this, null);


            // Initialize Backgroundworker
            this.backgroundWorkerCommunicate = new BackgroundWorker();
            this.backgroundWorkerCommunicate.WorkerSupportsCancellation = false;
            this.backgroundWorkerCommunicate.WorkerReportsProgress = false;
        }

        private void MainForm_FormClosing(object sender, FormClosingEventArgs e)
        {
            if (devicePort != null && devicePort.IsPortOpen)
                devicePort.ClosePort();
        }
        
         private void comboBoxCOMPorts_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (comboBoxCOMPorts.SelectedIndex > 0)
            {   // connect to selected COM port
                devicePort.OpenPort((String)(comboBoxCOMPorts.SelectedItem));
            }
            else
            {   // disconnect from COM Port (if one is open)
                devicePort.ClosePort();

            }

            EnableConnectionSettings(comboBoxCOMPorts.SelectedIndex > 0);
        }

        private void buttonCOMPortRefresh_Click(object sender, EventArgs e)
        {
            comboBoxCOMPorts.Items.Clear();
            comboBoxCOMPorts.Items.Add("Off");
            comboBoxCOMPorts.Items.AddRange(devicePort.GetPortNames());
            comboBoxCOMPorts.SelectedIndex = 0;
        }

        private void comboBoxProtocol_SelectedIndexChanged(object sender, EventArgs e)
        {
            labelSensorHubPort.Visible = comboBoxProtocol.Enabled && comboBoxProtocol.SelectedIndex == 0;
            numericUpDownSensorHubPort.Visible = comboBoxProtocol.Enabled && comboBoxProtocol.SelectedIndex == 0;
            labelSensorHubChannel.Visible = comboBoxProtocol.Enabled && comboBoxProtocol.SelectedIndex == 0;
            numericUpDownSensorHubChannel.Visible = comboBoxProtocol.Enabled && comboBoxProtocol.SelectedIndex == 0;

            if (comboBoxProtocol.Enabled && comboBoxProtocol.SelectedIndex == 0)
            {   // Selected protocol is I2C
                labelSensorHubDeviceAddress.Visible = true;
                labelSensorHubDeviceAddress.Text = "Address";
                labelSensorHubDeviceAddress.Location = new Point(595, 19);
                numericUpDownSensorHubDeviceAddress.Visible = true;
                numericUpDownSensorHubDeviceAddress.Location = new Point(645, 15);
            }
            else if (comboBoxProtocol.Enabled && comboBoxProtocol.SelectedIndex == 1)
            {   // Selected protocol is SPI
                labelSensorHubDeviceAddress.Visible = true;
                labelSensorHubDeviceAddress.Text = "Slave";
                labelSensorHubDeviceAddress.Location = new Point(365, 19);
                numericUpDownSensorHubDeviceAddress.Visible = true;
                numericUpDownSensorHubDeviceAddress.Location = new Point(415, 15);
            }
            else
            {   // No valid protocol is selected
                labelSensorHubDeviceAddress.Visible = false;
                numericUpDownSensorHubDeviceAddress.Visible = false;
            }
        }
        
        private void buttonReadSensor_Click(object sender, EventArgs e)
        {
        	
	
	
	

	       
	this.numericUpDown_ld0_per_Read(sender, null);






	

	       
	this.numericUpDown_duty_cycle_ld0_blue_Read(sender, null);






	

	       
	this.numericUpDown_duty_cycle_ld0_green_Read(sender, null);






	

	
	this.checkBox_ld4_ctrl_Read(sender, null);
	





	

	
	this.checkBox_ld5_ctrl_Read(sender, null);
	





	

	
	this.checkBox_ld6_ctrl_Read(sender, null);
	





	

	
	this.checkBox_ld7_ctrl_Read(sender, null);
	





	

	
	this.checkBox_sensor_en_Read(sender, null);
	





	

	
	this.checkBox_sensor_meas_Read(sender, null);
	





	

	       
	this.numericUpDown_heater_voltage_Read(sender, null);






	

	       
	this.numericUpDown_rheat_ref_Read(sender, null);






	

	       
	this.numericUpDown_rheat_alpha_Read(sender, null);






	

	       
	this.numericUpDown_adc_input_gain_Read(sender, null);






	

	       
	this.numericUpDown_sample_rate_Read(sender, null);






	

	       
	this.numericUpDown_on_cycles_Read(sender, null);






	

	       
	this.numericUpDown_off_cycles_Read(sender, null);






	

	       
	this.numericUpDown_set_hh_temp_Read(sender, null);






	

	       
	this.numericUpDown_wait_cycles_Read(sender, null);






	

	       
	this.numericUpDown_meas_cnt_Read(sender, null);






	

	       
	this.numericUpDown_led_ctrl_Read(sender, null);






	



	this.textBox_meas_done_Read(sender, null);



	



	this.textBox_meas_result_Read(sender, null);



	

	       
	this.numericUpDown_smpl_first_Read(sender, null);






	

	       
	this.numericUpDown_smpl_last_Read(sender, null);






	

	       
	this.numericUpDown_k_factor_Read(sender, null);






	



	this.textBox_ppm_Read(sender, null);





        }
        
        private void buttonExecuteMeasurement_Click(object sender, EventArgs e)
        {}
        
        
	
	
	
		int ld0_perRegOffset = 0x0;
		int ld0_perRegDataWidth = 16;
	
	



	
     private void numericUpDown_ld0_per_Write(object sender, EventArgs e)
     {
        byte nobytes = (byte)Math.Ceiling((decimal)(ld0_perRegDataWidth / 8));
        byte[] valueAsByteArray = new byte[nobytes];
        decimal value = this.numericUpDown_ld0_per.Value;
        for (int index = 0; index< nobytes; index++)
        {
            valueAsByteArray[index] = (byte)(value % 256);
            value = (value-valueAsByteArray[index]) / 256;
        }
        send_write_command((byte)ld0_perRegOffset, valueAsByteArray);
      }
        
        private void numericUpDown_ld0_per_Read(object sender, EventArgs e)
        {
             // Read current value of register
            byte nobytes = (byte)Math.Ceiling((decimal)(ld0_perRegDataWidth / 8));
            byte[] result = send_read_command((byte)ld0_perRegOffset, nobytes, true);
            if (result == null)
                return;
            decimal value = 0;
            if(nobytes == 1){
            	value = result[0];
            }
            else{
	            for (int index = 0; index < nobytes; index++)
	            {
	                value = 256 * value + result[nobytes - index - 1];
	            }
            }

            this.numericUpDown_ld0_per.Value = value;
        }
        private void numericUpDown_ld0_per_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.numericUpDown_ld0_per_Read(sender, null);
        }
	  





	
		int duty_cycle_ld0_blueRegOffset = 0x2;
		int duty_cycle_ld0_blueRegDataWidth = 16;
	
	



	
     private void numericUpDown_duty_cycle_ld0_blue_Write(object sender, EventArgs e)
     {
        byte nobytes = (byte)Math.Ceiling((decimal)(duty_cycle_ld0_blueRegDataWidth / 8));
        byte[] valueAsByteArray = new byte[nobytes];
        decimal value = this.numericUpDown_duty_cycle_ld0_blue.Value;
        for (int index = 0; index< nobytes; index++)
        {
            valueAsByteArray[index] = (byte)(value % 256);
            value = (value-valueAsByteArray[index]) / 256;
        }
        send_write_command((byte)duty_cycle_ld0_blueRegOffset, valueAsByteArray);
      }
        
        private void numericUpDown_duty_cycle_ld0_blue_Read(object sender, EventArgs e)
        {
             // Read current value of register
            byte nobytes = (byte)Math.Ceiling((decimal)(duty_cycle_ld0_blueRegDataWidth / 8));
            byte[] result = send_read_command((byte)duty_cycle_ld0_blueRegOffset, nobytes, true);
            if (result == null)
                return;
            decimal value = 0;
            if(nobytes == 1){
            	value = result[0];
            }
            else{
	            for (int index = 0; index < nobytes; index++)
	            {
	                value = 256 * value + result[nobytes - index - 1];
	            }
            }

            this.numericUpDown_duty_cycle_ld0_blue.Value = value;
        }
        private void numericUpDown_duty_cycle_ld0_blue_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.numericUpDown_duty_cycle_ld0_blue_Read(sender, null);
        }
	  





	
		int duty_cycle_ld0_greenRegOffset = 0x4;
		int duty_cycle_ld0_greenRegDataWidth = 16;
	
	



	
     private void numericUpDown_duty_cycle_ld0_green_Write(object sender, EventArgs e)
     {
        byte nobytes = (byte)Math.Ceiling((decimal)(duty_cycle_ld0_greenRegDataWidth / 8));
        byte[] valueAsByteArray = new byte[nobytes];
        decimal value = this.numericUpDown_duty_cycle_ld0_green.Value;
        for (int index = 0; index< nobytes; index++)
        {
            valueAsByteArray[index] = (byte)(value % 256);
            value = (value-valueAsByteArray[index]) / 256;
        }
        send_write_command((byte)duty_cycle_ld0_greenRegOffset, valueAsByteArray);
      }
        
        private void numericUpDown_duty_cycle_ld0_green_Read(object sender, EventArgs e)
        {
             // Read current value of register
            byte nobytes = (byte)Math.Ceiling((decimal)(duty_cycle_ld0_greenRegDataWidth / 8));
            byte[] result = send_read_command((byte)duty_cycle_ld0_greenRegOffset, nobytes, true);
            if (result == null)
                return;
            decimal value = 0;
            if(nobytes == 1){
            	value = result[0];
            }
            else{
	            for (int index = 0; index < nobytes; index++)
	            {
	                value = 256 * value + result[nobytes - index - 1];
	            }
            }

            this.numericUpDown_duty_cycle_ld0_green.Value = value;
        }
        private void numericUpDown_duty_cycle_ld0_green_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.numericUpDown_duty_cycle_ld0_green_Read(sender, null);
        }
	  





	
		int ld4_ctrlRegOffset = 0x6;
		int ld4_ctrlRegDataWidth = 8;
	
	



	
       private void checkBox_ld4_ctrl_Write(object sender, EventArgs e)
        {
           send_write_command((byte)ld4_ctrlRegOffset, new byte[1] { (byte)(checkBox_ld4_ctrl.Checked ? 1 : 0)  });
        }
       private void checkBox_ld4_ctrl_Read(object sender, EventArgs e)
        {
           byte[] result = send_read_command((byte)ld4_ctrlRegOffset, 1, true);
           if (result == null)
               return;
           checkBox_ld4_ctrl.Checked = (result[0] != 0);
        }
        private void checkBox_ld4_ctrl_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.checkBox_ld4_ctrl_Read(sender, null);
        }
     





	
		int ld5_ctrlRegOffset = 0x7;
		int ld5_ctrlRegDataWidth = 8;
	
	



	
       private void checkBox_ld5_ctrl_Write(object sender, EventArgs e)
        {
           send_write_command((byte)ld5_ctrlRegOffset, new byte[1] { (byte)(checkBox_ld5_ctrl.Checked ? 1 : 0)  });
        }
       private void checkBox_ld5_ctrl_Read(object sender, EventArgs e)
        {
           byte[] result = send_read_command((byte)ld5_ctrlRegOffset, 1, true);
           if (result == null)
               return;
           checkBox_ld5_ctrl.Checked = (result[0] != 0);
        }
        private void checkBox_ld5_ctrl_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.checkBox_ld5_ctrl_Read(sender, null);
        }
     





	
		int ld6_ctrlRegOffset = 0x8;
		int ld6_ctrlRegDataWidth = 8;
	
	



	
       private void checkBox_ld6_ctrl_Write(object sender, EventArgs e)
        {
           send_write_command((byte)ld6_ctrlRegOffset, new byte[1] { (byte)(checkBox_ld6_ctrl.Checked ? 1 : 0)  });
        }
       private void checkBox_ld6_ctrl_Read(object sender, EventArgs e)
        {
           byte[] result = send_read_command((byte)ld6_ctrlRegOffset, 1, true);
           if (result == null)
               return;
           checkBox_ld6_ctrl.Checked = (result[0] != 0);
        }
        private void checkBox_ld6_ctrl_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.checkBox_ld6_ctrl_Read(sender, null);
        }
     





	
		int ld7_ctrlRegOffset = 0x9;
		int ld7_ctrlRegDataWidth = 8;
	
	



	
       private void checkBox_ld7_ctrl_Write(object sender, EventArgs e)
        {
           send_write_command((byte)ld7_ctrlRegOffset, new byte[1] { (byte)(checkBox_ld7_ctrl.Checked ? 1 : 0)  });
        }
       private void checkBox_ld7_ctrl_Read(object sender, EventArgs e)
        {
           byte[] result = send_read_command((byte)ld7_ctrlRegOffset, 1, true);
           if (result == null)
               return;
           checkBox_ld7_ctrl.Checked = (result[0] != 0);
        }
        private void checkBox_ld7_ctrl_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.checkBox_ld7_ctrl_Read(sender, null);
        }
     





	
		int sensor_enRegOffset = 0xa;
		int sensor_enRegDataWidth = 8;
	
	



	
       private void checkBox_sensor_en_Write(object sender, EventArgs e)
        {
           send_write_command((byte)sensor_enRegOffset, new byte[1] { (byte)(checkBox_sensor_en.Checked ? 1 : 0)  });
        }
       private void checkBox_sensor_en_Read(object sender, EventArgs e)
        {
           byte[] result = send_read_command((byte)sensor_enRegOffset, 1, true);
           if (result == null)
               return;
           checkBox_sensor_en.Checked = (result[0] != 0);
        }
        private void checkBox_sensor_en_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.checkBox_sensor_en_Read(sender, null);
        }
     





	
		int sensor_measRegOffset = 0xb;
		int sensor_measRegDataWidth = 8;
	
	



	
       private void checkBox_sensor_meas_Write(object sender, EventArgs e)
        {
           send_write_command((byte)sensor_measRegOffset, new byte[1] { (byte)(checkBox_sensor_meas.Checked ? 1 : 0)  });
        }
       private void checkBox_sensor_meas_Read(object sender, EventArgs e)
        {
           byte[] result = send_read_command((byte)sensor_measRegOffset, 1, true);
           if (result == null)
               return;
           checkBox_sensor_meas.Checked = (result[0] != 0);
        }
        private void checkBox_sensor_meas_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.checkBox_sensor_meas_Read(sender, null);
        }
     





	
		int heater_voltageRegOffset = 0xc;
		int heater_voltageRegDataWidth = 16;
	
	



	
     private void numericUpDown_heater_voltage_Write(object sender, EventArgs e)
     {
        byte nobytes = (byte)Math.Ceiling((decimal)(heater_voltageRegDataWidth / 8));
        byte[] valueAsByteArray = new byte[nobytes];
        decimal value = this.numericUpDown_heater_voltage.Value;
        for (int index = 0; index< nobytes; index++)
        {
            valueAsByteArray[index] = (byte)(value % 256);
            value = (value-valueAsByteArray[index]) / 256;
        }
        send_write_command((byte)heater_voltageRegOffset, valueAsByteArray);
      }
        
        private void numericUpDown_heater_voltage_Read(object sender, EventArgs e)
        {
             // Read current value of register
            byte nobytes = (byte)Math.Ceiling((decimal)(heater_voltageRegDataWidth / 8));
            byte[] result = send_read_command((byte)heater_voltageRegOffset, nobytes, true);
            if (result == null)
                return;
            decimal value = 0;
            if(nobytes == 1){
            	value = result[0];
            }
            else{
	            for (int index = 0; index < nobytes; index++)
	            {
	                value = 256 * value + result[nobytes - index - 1];
	            }
            }

            this.numericUpDown_heater_voltage.Value = value;
        }
        private void numericUpDown_heater_voltage_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.numericUpDown_heater_voltage_Read(sender, null);
        }
	  





	
		int rheat_refRegOffset = 0xe;
		int rheat_refRegDataWidth = 16;
	
	



	
     private void numericUpDown_rheat_ref_Write(object sender, EventArgs e)
     {
        byte nobytes = (byte)Math.Ceiling((decimal)(rheat_refRegDataWidth / 8));
        byte[] valueAsByteArray = new byte[nobytes];
        decimal value = this.numericUpDown_rheat_ref.Value;
        for (int index = 0; index< nobytes; index++)
        {
            valueAsByteArray[index] = (byte)(value % 256);
            value = (value-valueAsByteArray[index]) / 256;
        }
        send_write_command((byte)rheat_refRegOffset, valueAsByteArray);
      }
        
        private void numericUpDown_rheat_ref_Read(object sender, EventArgs e)
        {
             // Read current value of register
            byte nobytes = (byte)Math.Ceiling((decimal)(rheat_refRegDataWidth / 8));
            byte[] result = send_read_command((byte)rheat_refRegOffset, nobytes, true);
            if (result == null)
                return;
            decimal value = 0;
            if(nobytes == 1){
            	value = result[0];
            }
            else{
	            for (int index = 0; index < nobytes; index++)
	            {
	                value = 256 * value + result[nobytes - index - 1];
	            }
            }

            this.numericUpDown_rheat_ref.Value = value;
        }
        private void numericUpDown_rheat_ref_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.numericUpDown_rheat_ref_Read(sender, null);
        }
	  





	
		int rheat_alphaRegOffset = 0x10;
		int rheat_alphaRegDataWidth = 16;
	
	



	
     private void numericUpDown_rheat_alpha_Write(object sender, EventArgs e)
     {
        byte nobytes = (byte)Math.Ceiling((decimal)(rheat_alphaRegDataWidth / 8));
        byte[] valueAsByteArray = new byte[nobytes];
        decimal value = this.numericUpDown_rheat_alpha.Value;
        for (int index = 0; index< nobytes; index++)
        {
            valueAsByteArray[index] = (byte)(value % 256);
            value = (value-valueAsByteArray[index]) / 256;
        }
        send_write_command((byte)rheat_alphaRegOffset, valueAsByteArray);
      }
        
        private void numericUpDown_rheat_alpha_Read(object sender, EventArgs e)
        {
             // Read current value of register
            byte nobytes = (byte)Math.Ceiling((decimal)(rheat_alphaRegDataWidth / 8));
            byte[] result = send_read_command((byte)rheat_alphaRegOffset, nobytes, true);
            if (result == null)
                return;
            decimal value = 0;
            if(nobytes == 1){
            	value = result[0];
            }
            else{
	            for (int index = 0; index < nobytes; index++)
	            {
	                value = 256 * value + result[nobytes - index - 1];
	            }
            }

            this.numericUpDown_rheat_alpha.Value = value;
        }
        private void numericUpDown_rheat_alpha_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.numericUpDown_rheat_alpha_Read(sender, null);
        }
	  





	
		int adc_input_gainRegOffset = 0x12;
		int adc_input_gainRegDataWidth = 8;
	
	



	
     private void numericUpDown_adc_input_gain_Write(object sender, EventArgs e)
     {
        byte nobytes = (byte)Math.Ceiling((decimal)(adc_input_gainRegDataWidth / 8));
        byte[] valueAsByteArray = new byte[nobytes];
        decimal value = this.numericUpDown_adc_input_gain.Value;
        for (int index = 0; index< nobytes; index++)
        {
            valueAsByteArray[index] = (byte)(value % 256);
            value = (value-valueAsByteArray[index]) / 256;
        }
        send_write_command((byte)adc_input_gainRegOffset, valueAsByteArray);
      }
        
        private void numericUpDown_adc_input_gain_Read(object sender, EventArgs e)
        {
             // Read current value of register
            byte nobytes = (byte)Math.Ceiling((decimal)(adc_input_gainRegDataWidth / 8));
            byte[] result = send_read_command((byte)adc_input_gainRegOffset, nobytes, true);
            if (result == null)
                return;
            decimal value = 0;
            if(nobytes == 1){
            	value = result[0];
            }
            else{
	            for (int index = 0; index < nobytes; index++)
	            {
	                value = 256 * value + result[nobytes - index - 1];
	            }
            }

            this.numericUpDown_adc_input_gain.Value = value;
        }
        private void numericUpDown_adc_input_gain_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.numericUpDown_adc_input_gain_Read(sender, null);
        }
	  





	
		int sample_rateRegOffset = 0x13;
		int sample_rateRegDataWidth = 8;
	
	



	
     private void numericUpDown_sample_rate_Write(object sender, EventArgs e)
     {
        byte nobytes = (byte)Math.Ceiling((decimal)(sample_rateRegDataWidth / 8));
        byte[] valueAsByteArray = new byte[nobytes];
        decimal value = this.numericUpDown_sample_rate.Value;
        for (int index = 0; index< nobytes; index++)
        {
            valueAsByteArray[index] = (byte)(value % 256);
            value = (value-valueAsByteArray[index]) / 256;
        }
        send_write_command((byte)sample_rateRegOffset, valueAsByteArray);
      }
        
        private void numericUpDown_sample_rate_Read(object sender, EventArgs e)
        {
             // Read current value of register
            byte nobytes = (byte)Math.Ceiling((decimal)(sample_rateRegDataWidth / 8));
            byte[] result = send_read_command((byte)sample_rateRegOffset, nobytes, true);
            if (result == null)
                return;
            decimal value = 0;
            if(nobytes == 1){
            	value = result[0];
            }
            else{
	            for (int index = 0; index < nobytes; index++)
	            {
	                value = 256 * value + result[nobytes - index - 1];
	            }
            }

            this.numericUpDown_sample_rate.Value = value;
        }
        private void numericUpDown_sample_rate_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.numericUpDown_sample_rate_Read(sender, null);
        }
	  





	
		int on_cyclesRegOffset = 0x14;
		int on_cyclesRegDataWidth = 8;
	
	



	
     private void numericUpDown_on_cycles_Write(object sender, EventArgs e)
     {
        byte nobytes = (byte)Math.Ceiling((decimal)(on_cyclesRegDataWidth / 8));
        byte[] valueAsByteArray = new byte[nobytes];
        decimal value = this.numericUpDown_on_cycles.Value;
        for (int index = 0; index< nobytes; index++)
        {
            valueAsByteArray[index] = (byte)(value % 256);
            value = (value-valueAsByteArray[index]) / 256;
        }
        send_write_command((byte)on_cyclesRegOffset, valueAsByteArray);
      }
        
        private void numericUpDown_on_cycles_Read(object sender, EventArgs e)
        {
             // Read current value of register
            byte nobytes = (byte)Math.Ceiling((decimal)(on_cyclesRegDataWidth / 8));
            byte[] result = send_read_command((byte)on_cyclesRegOffset, nobytes, true);
            if (result == null)
                return;
            decimal value = 0;
            if(nobytes == 1){
            	value = result[0];
            }
            else{
	            for (int index = 0; index < nobytes; index++)
	            {
	                value = 256 * value + result[nobytes - index - 1];
	            }
            }

            this.numericUpDown_on_cycles.Value = value;
        }
        private void numericUpDown_on_cycles_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.numericUpDown_on_cycles_Read(sender, null);
        }
	  





	
		int off_cyclesRegOffset = 0x15;
		int off_cyclesRegDataWidth = 8;
	
	



	
     private void numericUpDown_off_cycles_Write(object sender, EventArgs e)
     {
        byte nobytes = (byte)Math.Ceiling((decimal)(off_cyclesRegDataWidth / 8));
        byte[] valueAsByteArray = new byte[nobytes];
        decimal value = this.numericUpDown_off_cycles.Value;
        for (int index = 0; index< nobytes; index++)
        {
            valueAsByteArray[index] = (byte)(value % 256);
            value = (value-valueAsByteArray[index]) / 256;
        }
        send_write_command((byte)off_cyclesRegOffset, valueAsByteArray);
      }
        
        private void numericUpDown_off_cycles_Read(object sender, EventArgs e)
        {
             // Read current value of register
            byte nobytes = (byte)Math.Ceiling((decimal)(off_cyclesRegDataWidth / 8));
            byte[] result = send_read_command((byte)off_cyclesRegOffset, nobytes, true);
            if (result == null)
                return;
            decimal value = 0;
            if(nobytes == 1){
            	value = result[0];
            }
            else{
	            for (int index = 0; index < nobytes; index++)
	            {
	                value = 256 * value + result[nobytes - index - 1];
	            }
            }

            this.numericUpDown_off_cycles.Value = value;
        }
        private void numericUpDown_off_cycles_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.numericUpDown_off_cycles_Read(sender, null);
        }
	  





	
		int set_hh_tempRegOffset = 0x16;
		int set_hh_tempRegDataWidth = 16;
	
	



	
     private void numericUpDown_set_hh_temp_Write(object sender, EventArgs e)
     {
        byte nobytes = (byte)Math.Ceiling((decimal)(set_hh_tempRegDataWidth / 8));
        byte[] valueAsByteArray = new byte[nobytes];
        decimal value = this.numericUpDown_set_hh_temp.Value;
        for (int index = 0; index< nobytes; index++)
        {
            valueAsByteArray[index] = (byte)(value % 256);
            value = (value-valueAsByteArray[index]) / 256;
        }
        send_write_command((byte)set_hh_tempRegOffset, valueAsByteArray);
      }
        
        private void numericUpDown_set_hh_temp_Read(object sender, EventArgs e)
        {
             // Read current value of register
            byte nobytes = (byte)Math.Ceiling((decimal)(set_hh_tempRegDataWidth / 8));
            byte[] result = send_read_command((byte)set_hh_tempRegOffset, nobytes, true);
            if (result == null)
                return;
            decimal value = 0;
            if(nobytes == 1){
            	value = result[0];
            }
            else{
	            for (int index = 0; index < nobytes; index++)
	            {
	                value = 256 * value + result[nobytes - index - 1];
	            }
            }

            this.numericUpDown_set_hh_temp.Value = value;
        }
        private void numericUpDown_set_hh_temp_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.numericUpDown_set_hh_temp_Read(sender, null);
        }
	  





	
		int wait_cyclesRegOffset = 0x18;
		int wait_cyclesRegDataWidth = 16;
	
	



	
     private void numericUpDown_wait_cycles_Write(object sender, EventArgs e)
     {
        byte nobytes = (byte)Math.Ceiling((decimal)(wait_cyclesRegDataWidth / 8));
        byte[] valueAsByteArray = new byte[nobytes];
        decimal value = this.numericUpDown_wait_cycles.Value;
        for (int index = 0; index< nobytes; index++)
        {
            valueAsByteArray[index] = (byte)(value % 256);
            value = (value-valueAsByteArray[index]) / 256;
        }
        send_write_command((byte)wait_cyclesRegOffset, valueAsByteArray);
      }
        
        private void numericUpDown_wait_cycles_Read(object sender, EventArgs e)
        {
             // Read current value of register
            byte nobytes = (byte)Math.Ceiling((decimal)(wait_cyclesRegDataWidth / 8));
            byte[] result = send_read_command((byte)wait_cyclesRegOffset, nobytes, true);
            if (result == null)
                return;
            decimal value = 0;
            if(nobytes == 1){
            	value = result[0];
            }
            else{
	            for (int index = 0; index < nobytes; index++)
	            {
	                value = 256 * value + result[nobytes - index - 1];
	            }
            }

            this.numericUpDown_wait_cycles.Value = value;
        }
        private void numericUpDown_wait_cycles_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.numericUpDown_wait_cycles_Read(sender, null);
        }
	  





	
		int meas_cntRegOffset = 0x1a;
		int meas_cntRegDataWidth = 16;
	
	



	
     private void numericUpDown_meas_cnt_Write(object sender, EventArgs e)
     {
        byte nobytes = (byte)Math.Ceiling((decimal)(meas_cntRegDataWidth / 8));
        byte[] valueAsByteArray = new byte[nobytes];
        decimal value = this.numericUpDown_meas_cnt.Value;
        for (int index = 0; index< nobytes; index++)
        {
            valueAsByteArray[index] = (byte)(value % 256);
            value = (value-valueAsByteArray[index]) / 256;
        }
        send_write_command((byte)meas_cntRegOffset, valueAsByteArray);
      }
        
        private void numericUpDown_meas_cnt_Read(object sender, EventArgs e)
        {
             // Read current value of register
            byte nobytes = (byte)Math.Ceiling((decimal)(meas_cntRegDataWidth / 8));
            byte[] result = send_read_command((byte)meas_cntRegOffset, nobytes, true);
            if (result == null)
                return;
            decimal value = 0;
            if(nobytes == 1){
            	value = result[0];
            }
            else{
	            for (int index = 0; index < nobytes; index++)
	            {
	                value = 256 * value + result[nobytes - index - 1];
	            }
            }

            this.numericUpDown_meas_cnt.Value = value;
        }
        private void numericUpDown_meas_cnt_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.numericUpDown_meas_cnt_Read(sender, null);
        }
	  





	
		int led_ctrlRegOffset = 0x1c;
		int led_ctrlRegDataWidth = 8;
	
	



	
     private void numericUpDown_led_ctrl_Write(object sender, EventArgs e)
     {
        byte nobytes = (byte)Math.Ceiling((decimal)(led_ctrlRegDataWidth / 8));
        byte[] valueAsByteArray = new byte[nobytes];
        decimal value = this.numericUpDown_led_ctrl.Value;
        for (int index = 0; index< nobytes; index++)
        {
            valueAsByteArray[index] = (byte)(value % 256);
            value = (value-valueAsByteArray[index]) / 256;
        }
        send_write_command((byte)led_ctrlRegOffset, valueAsByteArray);
      }
        
        private void numericUpDown_led_ctrl_Read(object sender, EventArgs e)
        {
             // Read current value of register
            byte nobytes = (byte)Math.Ceiling((decimal)(led_ctrlRegDataWidth / 8));
            byte[] result = send_read_command((byte)led_ctrlRegOffset, nobytes, true);
            if (result == null)
                return;
            decimal value = 0;
            if(nobytes == 1){
            	value = result[0];
            }
            else{
	            for (int index = 0; index < nobytes; index++)
	            {
	                value = 256 * value + result[nobytes - index - 1];
	            }
            }

            this.numericUpDown_led_ctrl.Value = value;
        }
        private void numericUpDown_led_ctrl_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.numericUpDown_led_ctrl_Read(sender, null);
        }
	  





	
		int meas_doneRegOffset = 0x1d;
		int meas_doneRegDataWidth = 8;
	
	





		private void textBox_meas_done_Read(object sender, EventArgs e)
        {
            byte nobytes = (byte)Math.Ceiling((decimal)(meas_doneRegDataWidth / 8));
            byte[] result = send_read_command((byte)meas_doneRegOffset, nobytes, true);
            if (result == null)
                return;
            if(nobytes == 1)
            	this.textBox_meas_done.Text = result[0].ToString();
			else{
	            int value = result[0];
	            for (int byteindex = 1; byteindex < result.Length; byteindex++)
	            {
	                value = 256 * value + result[byteindex];
	            }
	            this.textBox_meas_done.Text = value.ToString();
            }
        }
        
        private void textBox_meas_done_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.textBox_meas_done_Read(sender, null);
        }



	
		int meas_resultRegOffset = 0x1e;
		int meas_resultRegDataWidth = 16;
	
	





		private void textBox_meas_result_Read(object sender, EventArgs e)
        {
            byte nobytes = (byte)Math.Ceiling((decimal)(meas_resultRegDataWidth / 8));
            byte[] result = send_read_command((byte)meas_resultRegOffset, nobytes, true);
            if (result == null)
                return;
            if(nobytes == 1)
            	this.textBox_meas_result.Text = result[0].ToString();
			else{
	            int value = result[0];
	            for (int byteindex = 1; byteindex < result.Length; byteindex++)
	            {
	                value = 256 * value + result[byteindex];
	            }
	            this.textBox_meas_result.Text = value.ToString();
            }
        }
        
        private void textBox_meas_result_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.textBox_meas_result_Read(sender, null);
        }



	
		int smpl_firstRegOffset = 0x20;
		int smpl_firstRegDataWidth = 8;
	
	



	
     private void numericUpDown_smpl_first_Write(object sender, EventArgs e)
     {
        byte nobytes = (byte)Math.Ceiling((decimal)(smpl_firstRegDataWidth / 8));
        byte[] valueAsByteArray = new byte[nobytes];
        decimal value = this.numericUpDown_smpl_first.Value;
        for (int index = 0; index< nobytes; index++)
        {
            valueAsByteArray[index] = (byte)(value % 256);
            value = (value-valueAsByteArray[index]) / 256;
        }
        send_write_command((byte)smpl_firstRegOffset, valueAsByteArray);
      }
        
        private void numericUpDown_smpl_first_Read(object sender, EventArgs e)
        {
             // Read current value of register
            byte nobytes = (byte)Math.Ceiling((decimal)(smpl_firstRegDataWidth / 8));
            byte[] result = send_read_command((byte)smpl_firstRegOffset, nobytes, true);
            if (result == null)
                return;
            decimal value = 0;
            if(nobytes == 1){
            	value = result[0];
            }
            else{
	            for (int index = 0; index < nobytes; index++)
	            {
	                value = 256 * value + result[nobytes - index - 1];
	            }
            }

            this.numericUpDown_smpl_first.Value = value;
        }
        private void numericUpDown_smpl_first_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.numericUpDown_smpl_first_Read(sender, null);
        }
	  





	
		int smpl_lastRegOffset = 0x21;
		int smpl_lastRegDataWidth = 8;
	
	



	
     private void numericUpDown_smpl_last_Write(object sender, EventArgs e)
     {
        byte nobytes = (byte)Math.Ceiling((decimal)(smpl_lastRegDataWidth / 8));
        byte[] valueAsByteArray = new byte[nobytes];
        decimal value = this.numericUpDown_smpl_last.Value;
        for (int index = 0; index< nobytes; index++)
        {
            valueAsByteArray[index] = (byte)(value % 256);
            value = (value-valueAsByteArray[index]) / 256;
        }
        send_write_command((byte)smpl_lastRegOffset, valueAsByteArray);
      }
        
        private void numericUpDown_smpl_last_Read(object sender, EventArgs e)
        {
             // Read current value of register
            byte nobytes = (byte)Math.Ceiling((decimal)(smpl_lastRegDataWidth / 8));
            byte[] result = send_read_command((byte)smpl_lastRegOffset, nobytes, true);
            if (result == null)
                return;
            decimal value = 0;
            if(nobytes == 1){
            	value = result[0];
            }
            else{
	            for (int index = 0; index < nobytes; index++)
	            {
	                value = 256 * value + result[nobytes - index - 1];
	            }
            }

            this.numericUpDown_smpl_last.Value = value;
        }
        private void numericUpDown_smpl_last_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.numericUpDown_smpl_last_Read(sender, null);
        }
	  





	
		int k_factorRegOffset = 0x22;
		int k_factorRegDataWidth = 16;
	
	



	
     private void numericUpDown_k_factor_Write(object sender, EventArgs e)
     {
        byte nobytes = (byte)Math.Ceiling((decimal)(k_factorRegDataWidth / 8));
        byte[] valueAsByteArray = new byte[nobytes];
        decimal value = this.numericUpDown_k_factor.Value;
        for (int index = 0; index< nobytes; index++)
        {
            valueAsByteArray[index] = (byte)(value % 256);
            value = (value-valueAsByteArray[index]) / 256;
        }
        send_write_command((byte)k_factorRegOffset, valueAsByteArray);
      }
        
        private void numericUpDown_k_factor_Read(object sender, EventArgs e)
        {
             // Read current value of register
            byte nobytes = (byte)Math.Ceiling((decimal)(k_factorRegDataWidth / 8));
            byte[] result = send_read_command((byte)k_factorRegOffset, nobytes, true);
            if (result == null)
                return;
            decimal value = 0;
            if(nobytes == 1){
            	value = result[0];
            }
            else{
	            for (int index = 0; index < nobytes; index++)
	            {
	                value = 256 * value + result[nobytes - index - 1];
	            }
            }

            this.numericUpDown_k_factor.Value = value;
        }
        private void numericUpDown_k_factor_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.numericUpDown_k_factor_Read(sender, null);
        }
	  





	
		int ppmRegOffset = 0x24;
		int ppmRegDataWidth = 16;
	
	





		private void textBox_ppm_Read(object sender, EventArgs e)
        {
            byte nobytes = (byte)Math.Ceiling((decimal)(ppmRegDataWidth / 8));
            byte[] result = send_read_command((byte)ppmRegOffset, nobytes, true);
            if (result == null)
                return;
            if(nobytes == 1)
            	this.textBox_ppm.Text = result[0].ToString();
			else{
	            int value = result[0];
	            for (int byteindex = 1; byteindex < result.Length; byteindex++)
	            {
	                value = 256 * value + result[byteindex];
	            }
	            this.textBox_ppm.Text = value.ToString();
            }
        }
        
        private void textBox_ppm_KeyPress(object sender, KeyPressEventArgs e)
        {
             // Read current value of register if r was pressed
             if (e.KeyChar == 'r')
                this.textBox_ppm_Read(sender, null);
        }





        
        #region Communication Functions
        private void send_write_command(byte register, byte[] value)
        {
            switch (comboBoxProtocol.SelectedIndex)
            {
                case 0: // I2C Protocol selected
                    this.devicePort.Write((byte)(this.numericUpDownSensorHubPort.Value),
                        (byte)(1+this.numericUpDownSensorHubChannel.Value),
                        (byte)this.numericUpDownSensorHubDeviceAddress.Value,
                        register, value);
                    break;
                case 1: // SPI Protocol selected
                    this.devicePort.Write((byte)this.numericUpDownSensorHubDeviceAddress.Value,
                        register, value);
                    break;
                default: // not a valid selection
                    throw new ApplicationException("Unknown protocol selected.");
            }
        }

        private byte[] send_read_command(byte register, uint noBytes, bool skipRead)
        {
            // if skipRead variable is set to true, the first read only triggers the reading and the second
            // read returns the value. This needs to be set to false for fifo readings after the first read.
            try
            {
                switch (comboBoxProtocol.SelectedIndex)
                {
                    case 0: // I2C Protocol selected
                        if (skipRead)
                            this.devicePort.Read((byte)(this.numericUpDownSensorHubPort.Value),
                                (byte)(1 + this.numericUpDownSensorHubChannel.Value),
                                (byte)this.numericUpDownSensorHubDeviceAddress.Value, register, noBytes);
                        return this.devicePort.Read((byte)(this.numericUpDownSensorHubPort.Value),
                            (byte)(1 + this.numericUpDownSensorHubChannel.Value),
                            (byte)this.numericUpDownSensorHubDeviceAddress.Value, register, noBytes);
                    case 1: // SPI Protocol selected
                        if (skipRead)
                            this.devicePort.Read((byte)this.numericUpDownSensorHubDeviceAddress.Value,
                                register, noBytes);
                        return this.devicePort.Read((byte)this.numericUpDownSensorHubDeviceAddress.Value,
                            register, noBytes);
                    default: // not a valid selection
                        throw new ApplicationException("Unknown protocol selected.");
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("During runtime, some error occurred. For details see below:\n\n" + ex.Message, "An Error Occurred:", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                return null;
            }
        }
        #endregion
        
        #region Convenience Functions
        void EnableConnectionSettings(bool status)
        {
            labelProtocol.Visible = status;
            comboBoxProtocol.Visible = status;
            tabControlMain.Visible = status;
            if (!status)
                comboBoxProtocol.SelectedIndex = -1;
            else
                comboBoxProtocol.SelectedIndex = 0;
        }

        private int ByteArray2Int(byte[] values)
        {
            int value = values[values.Length -1];
            bool isnegative = value>127;
            if (isnegative)
                value = value-128;
            for (int index = values.Length -2; index >=0; index--)
            {
                value = 256*value + values[index];
            }
            if (isnegative)
                value = value- (byte)(Math.Pow(256,values.Length)/2);
            return value;
        }

        private string ByteArray2String(byte[] values)
        {
            string result ="";
            foreach (byte value in values)
            {
                result += value.ToString() + "; ";
            }
            return result;
        }
        #endregion

        #region Chart Functions
        private void chart_initialize()
        {

        }
        private void chart_update(double[] yvals)
        {
            
        }
        #endregion
        
        
    }
}
