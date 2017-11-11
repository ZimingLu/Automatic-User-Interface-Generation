
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace WindowsFormsApp1
{
    public class Form1 : Form
    {
        private Boolean flag = true;
        private Dictionary<String, Register> registerData = new data().dataGenerate();
        private LinkedList<BitField> bitField;
        private int registerValue;
        public Form1()
        {
            InitializeComponent();
        }
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

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
        
                public void writeToFile1(Dictionary<String, Register> registerData, Label name, Label offset, Label dataWidth,
        Label bitField1Name, Label bitField2Name, ComboBox registerName, ComboBox bitField1Value,
        ComboBox bitField2Value)
        {
            registerValue = (registerValue
                    & ((int)Math.Pow(2, registerData[(string)registerName.SelectedItem].getBitField().Last.Value.getWidth())
                            - 1) << registerData[(string)registerName.SelectedItem].getBitField().Last.Value.getOffset())
                    ^ registerValue
                    | ((int)bitField1Value.SelectedItem << registerData[(string)registerName.SelectedItem].getBitField()
                            .Last.Value.getOffset());
            File.AppendAllText(@"C: \Users\LuYongch\source\repos\WindowsFormsApp2\WindowsFormsApp1\file1.txt",
       (string)registerName.SelectedItem + " " + registerValue.ToString());
        }

        public void writeToFile2(Dictionary<String, Register> registerData, Label name, Label offset, Label dataWidth,
        Label bitField1Name, Label bitField2Name, ComboBox registerName, ComboBox bitField1Value,
        ComboBox bitField2Value)
        {
            registerValue = (registerValue
                    & ((int)Math.Pow(2, registerData[(string)registerName.SelectedItem].getBitField().First.Value.getWidth())
                            - 1) << registerData[(string)registerName.SelectedItem].getBitField().First.Value.getOffset())
                    ^ registerValue
                    | ((int)bitField2Value.SelectedItem << registerData[(string)registerName.SelectedItem].getBitField()
                            .First.Value.getOffset());
            File.AppendAllText(@"C: \Users\LuYongch\source\repos\WindowsFormsApp2\WindowsFormsApp1\file1.txt",
                   (string)registerName.SelectedItem + " " + registerValue.ToString());
        }
        
        public void update(Dictionary<String, Register> registerData, Label name, Label offset, Label dataWidth,
        Label bitField1Name, Label bitField2Name, ComboBox registerName, ComboBox bitField1Value,
        ComboBox bitField2Value)
        {
            //read data from the file
            String[] parts;
            String strLine;
            // Read the file and display it line by line.  
            System.IO.StreamReader file =
                new System.IO.StreamReader(@"C:\Users\LuYongch\source\repos\WindowsFormsApp2\WindowsFormsApp1\file1.txt");
            while ((strLine = file.ReadLine()) != null)
            {
                parts = strLine.Split(' ');
                if (parts[0].Equals(registerName.SelectedItem))
                {
                    registerValue = Int32.Parse(parts[1]);
                    break;
                }
            }
            file.Close();
            name.Text = "Name: " + registerData[(string)registerName.SelectedItem].getName();
            offset.Text = "offset: " + registerData[(string)registerName.SelectedItem].getOffset();
            dataWidth.Text = "data width: " + registerData[(string)registerName.SelectedItem].getDataWidth();
            if (registerData[(string)registerName.SelectedItem].getBitField().Count() == 1)
                bitField1Name.Text = "Not used";
            else
            {
                bitField1Name.Text = registerData[(string)registerName.SelectedItem].getBitField().First.Value.getName();
            }
            bitField2Name.Text = registerData[(string)registerName.SelectedItem].getBitField().First.Value.getName();
            flag = false;
            if (registerData[(string)registerName.SelectedItem].getBitField().Count() == 1)
                bitField1Value.Enabled = false;
            else
            {
                bitField1Value.Enabled = true;
                bitField1Value.Items.Clear();
                for (int i = 0; i < Math.Pow(2,
                        registerData[(string)registerName.SelectedItem].getBitField().Last.Value.getWidth()); i++)
                    bitField1Value.Items.Add(i);
                bitField1Value.SelectedIndex = (registerValue & ((int)Math.Pow(2,
                        registerData[(string)registerName.SelectedItem].getBitField().Last.Value.getWidth())
                        - 1) << registerData[(string)registerName.SelectedItem].getBitField().Last.Value
                                .getOffset()) >> registerData[(string)registerName.SelectedItem].getBitField().Last.Value
                                        .getOffset();
            }
            bitField2Value.Items.Clear();
            for (int i = 0; i < Math.Pow(2,
                    registerData[(string)registerName.SelectedItem].getBitField().First.Value.getWidth()); i++)
                bitField2Value.Items.Add(i);
            bitField2Value.SelectedIndex = (registerValue
                    & ((int)Math.Pow(2, registerData[(string)registerName.SelectedItem].getBitField().First.Value.getWidth())
                            - 1) << registerData[(string)registerName.SelectedItem].getBitField().First.Value
                                    .getOffset()) >> registerData[(string)registerName.SelectedItem].getBitField().First.Value
                                            .getOffset();
            flag = true;
        }
                /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
        	
    	this.components = new System.ComponentModel.Container();
        FlowLayoutPanel parentPanel = new FlowLayoutPanel();
        parentPanel.BorderStyle = BorderStyle.FixedSingle;
        parentPanel.FlowDirection = FlowDirection.TopDown;
        parentPanel.Size = new System.Drawing.Size(888, 3110);
        parentPanel.WrapContents = false;
        // 
        // Form1
        // 
        //this.AllowDrop = true;
        //this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
        //this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
        //this.AutoScroll = true;
        //this.ClientSize = new System.Drawing.Size(912, 458);
        this.Controls.Add(parentPanel);
        this.Name = "container";
        this.Text = "container";
        
		
    FlowLayoutPanel Configuration = new FlowLayoutPanel();
    Configuration.BorderStyle = BorderStyle.FixedSingle;
    Configuration.FlowDirection = FlowDirection.TopDown;
    Configuration.AutoSize = true;
    Configuration.AutoSizeMode = AutoSizeMode.GrowAndShrink;

	parentPanel.Controls.Add(Configuration);
	FlowLayoutPanel ConfigurationParentPanel = parentPanel;
	parentPanel = Configuration;
    
    FlowLayoutPanel register = new FlowLayoutPanel();
    register.BorderStyle = BorderStyle.FixedSingle;
    register.FlowDirection = FlowDirection.TopDown;
    register.AutoSize = true;
    register.AutoSizeMode = AutoSizeMode.GrowAndShrink;

	parentPanel.Controls.Add(register);
	FlowLayoutPanel registerParentPanel = parentPanel;
	parentPanel = register;
    
	
	
	
	ComboBox registerName = new ComboBox(); 
	registerName.Enabled = true;
	registerName.DropDownStyle = ComboBoxStyle.DropDownList;
	
		foreach(string item in registerData.Keys){
			registerName.Items.Add(item);
		}
		registerName.SelectedIndex=0;
		
	
	parentPanel.Controls.Add(registerName);

    parentPanel = registerParentPanel;

    FlowLayoutPanel infos = new FlowLayoutPanel();
    infos.BorderStyle = BorderStyle.FixedSingle;
    infos.FlowDirection = FlowDirection.TopDown;
    infos.AutoSize = true;
    infos.AutoSizeMode = AutoSizeMode.GrowAndShrink;

	parentPanel.Controls.Add(infos);
	FlowLayoutPanel infosParentPanel = parentPanel;
	parentPanel = infos;
    
	
	
	Label name = new Label(); 
	
		name.Text = "Name: " + registerData[(string)registerName.SelectedItem].getName();
	
	parentPanel.Controls.Add(name);

	Label offset = new Label(); 
	
		offset.Text = "offset: " + registerData[(string)registerName.SelectedItem].getOffset();
	
	parentPanel.Controls.Add(offset);

	Label dataWidth = new Label(); 
	
		dataWidth.Text = "data width: " + registerData[(string)registerName.SelectedItem].getDataWidth();
	
	parentPanel.Controls.Add(dataWidth);

	
    parentPanel = infosParentPanel;

	
    FlowLayoutPanel values = new FlowLayoutPanel();
    values.BorderStyle = BorderStyle.FixedSingle;
    values.FlowDirection = FlowDirection.LeftToRight;
    values.AutoSize = true;
    values.AutoSizeMode = AutoSizeMode.GrowAndShrink;
	
	parentPanel.Controls.Add(values);
	FlowLayoutPanel valuesParentPanel = parentPanel;
	parentPanel = values;
    
    FlowLayoutPanel bitField1 = new FlowLayoutPanel();
    bitField1.BorderStyle = BorderStyle.FixedSingle;
    bitField1.FlowDirection = FlowDirection.TopDown;
    bitField1.AutoSize = true;
    bitField1.AutoSizeMode = AutoSizeMode.GrowAndShrink;

	parentPanel.Controls.Add(bitField1);
	FlowLayoutPanel bitField1ParentPanel = parentPanel;
	parentPanel = bitField1;
    
	
	
	Label bitField1Name = new Label(); 
	
		if(registerData[(string)registerName.SelectedItem].getBitField().Count()==1)
			bitField1Name.Text = "Not used";
		else{
			bitField1Name.Text = registerData[(string)registerName.SelectedItem].getBitField().Last.Value.getName();
		}
	
	parentPanel.Controls.Add(bitField1Name);

	
	ComboBox bitField1Value = new ComboBox(); 
	bitField1Value.Enabled = true;
	bitField1Value.DropDownStyle = ComboBoxStyle.DropDownList;
	
		if(registerData[(string)registerName.SelectedItem].getBitField().Count()==1)
			bitField1Value.Enabled = false;
		else{
		for(int i=0; i<Math.Pow(2, registerData[(string)registerName.SelectedItem].getBitField().Last.Value.getWidth()); i++)
			bitField1Value.Items.Add(i);
			bitField1Value.SelectedIndex=0;
		}
	
	parentPanel.Controls.Add(bitField1Value);

    parentPanel = bitField1ParentPanel;

    FlowLayoutPanel bitField2 = new FlowLayoutPanel();
    bitField2.BorderStyle = BorderStyle.FixedSingle;
    bitField2.FlowDirection = FlowDirection.TopDown;
    bitField2.AutoSize = true;
    bitField2.AutoSizeMode = AutoSizeMode.GrowAndShrink;

	parentPanel.Controls.Add(bitField2);
	FlowLayoutPanel bitField2ParentPanel = parentPanel;
	parentPanel = bitField2;
    
	
	
	Label bitField2Name = new Label(); 
	
		bitField2Name.Text = registerData[(string)registerName.SelectedItem].getBitField().First.Value.getName();
	
	parentPanel.Controls.Add(bitField2Name);

	
	ComboBox bitField2Value = new ComboBox(); 
	bitField2Value.Enabled = true;
	bitField2Value.DropDownStyle = ComboBoxStyle.DropDownList;
	
		for(int i=0; i<Math.Pow(2, registerData[(string)registerName.SelectedItem].getBitField().First.Value.getWidth()); i++)
			bitField2Value.Items.Add(i);
		bitField2Value.SelectedIndex=0;
	
	parentPanel.Controls.Add(bitField2Value);

    parentPanel = bitField2ParentPanel;

    
	
	
    parentPanel = valuesParentPanel;

	
	
    parentPanel = ConfigurationParentPanel;

    	
    	registerName.SelectedIndexChanged +=
        new EventHandler(delegate (Object o, EventArgs a)
        {
            update(registerData, name, offset, dataWidth,
     bitField1Name, bitField2Name, registerName, bitField1Value,
     bitField2Value);
        });
             bitField1Value.SelectedIndexChanged +=
	new EventHandler(delegate (Object o, EventArgs a)
	{
	    writeToFile1(registerData, name, offset, dataWidth,
	bitField1Name, bitField2Name, registerName, bitField1Value,
	bitField2Value);
	});
	
	            bitField2Value.SelectedIndexChanged +=
	new EventHandler(delegate (Object o, EventArgs a)
	{
	writeToFile2(registerData, name, offset, dataWidth,
	bitField1Name, bitField2Name, registerName, bitField1Value,
	bitField2Value);
	});
    	}
    }



	public class data {
		private Dictionary<String, Register> registerData = new Dictionary<String, Register>();
		private Register regTmp;
		private BitField bitTmp;
	    public Dictionary<String, Register> dataGenerate(){
	        
	
	
	regTmp = new Register("pwm_per", 0x0, 16);
	
	bitTmp = new BitField("pwm_per", 0, 16);
	regTmp.addBitField(bitTmp);

	registerData.Add("pwm_per", regTmp);

	regTmp = new Register("heat_smpls", 0x2, 8);
	
	bitTmp = new BitField("heat_smpls", 0, 6);
	regTmp.addBitField(bitTmp);

	registerData.Add("heat_smpls", regTmp);

	regTmp = new Register("meas_smpls", 0x3, 8);
	
	bitTmp = new BitField("meas_smpls", 0, 6);
	regTmp.addBitField(bitTmp);

	registerData.Add("meas_smpls", regTmp);

	regTmp = new Register("meas_accu", 0x4, 8);
	
	bitTmp = new BitField("meas_accu", 0, 3);
	regTmp.addBitField(bitTmp);

	registerData.Add("meas_accu", regTmp);

	regTmp = new Register("gas_val", 0x5, 16);
	
	bitTmp = new BitField("gas_val", 0, 12);
	regTmp.addBitField(bitTmp);

	registerData.Add("gas_val", regTmp);

	regTmp = new Register("meas_ctrl", 0x7, 8);
	
	bitTmp = new BitField("meas_run", 0, 1);
	regTmp.addBitField(bitTmp);

	bitTmp = new BitField("meas_cont", 1, 1);
	regTmp.addBitField(bitTmp);

	registerData.Add("meas_ctrl", regTmp);

	regTmp = new Register("meas_per", 0x8, 8);
	
	bitTmp = new BitField("meas_per", 0, 8);
	regTmp.addBitField(bitTmp);

	registerData.Add("meas_per", regTmp);

	regTmp = new Register("meas_mode", 0x9, 8);
	
	bitTmp = new BitField("meas_mode", 0, 2);
	regTmp.addBitField(bitTmp);

	registerData.Add("meas_mode", regTmp);

	regTmp = new Register("meas_smpl_sts", 0xa, 8);
	
	bitTmp = new BitField("meas_smpl_sts", 0, 6);
	regTmp.addBitField(bitTmp);

	registerData.Add("meas_smpl_sts", regTmp);

	regTmp = new Register("meas_accu_sts", 0xb, 8);
	
	bitTmp = new BitField("meas_accu_sts", 0, 6);
	regTmp.addBitField(bitTmp);

	registerData.Add("meas_accu_sts", regTmp);

	regTmp = new Register("meas_ofs", 0xc, 8);
	
	bitTmp = new BitField("meas_ofs", 0, 8);
	regTmp.addBitField(bitTmp);

	registerData.Add("meas_ofs", regTmp);

	regTmp = new Register("meas_gain", 0xd, 8);
	
	bitTmp = new BitField("meas_gain", 0, 3);
	regTmp.addBitField(bitTmp);

	registerData.Add("meas_gain", regTmp);

	regTmp = new Register("pwm_duty_heat", 0xe, 16);
	
	bitTmp = new BitField("pwm_duty_heat", 0, 16);
	regTmp.addBitField(bitTmp);

	registerData.Add("pwm_duty_heat", regTmp);

	regTmp = new Register("pwm_duty_cool", 0x10, 16);
	
	bitTmp = new BitField("pwm_duty_cool", 0, 16);
	regTmp.addBitField(bitTmp);

	registerData.Add("pwm_duty_cool", regTmp);

	regTmp = new Register("temp_set_heat", 0x12, 16);
	
	bitTmp = new BitField("temp_set_heat", 0, 16);
	regTmp.addBitField(bitTmp);

	registerData.Add("temp_set_heat", regTmp);

	regTmp = new Register("temp_set_cool", 0x14, 16);
	
	bitTmp = new BitField("temp_set_cool", 0, 16);
	regTmp.addBitField(bitTmp);

	registerData.Add("temp_set_cool", regTmp);

	regTmp = new Register("temp_set_mode", 0x16, 8);
	
	bitTmp = new BitField("temp_set_mode", 0, 1);
	regTmp.addBitField(bitTmp);

	registerData.Add("temp_set_mode", regTmp);

	regTmp = new Register("heat_reg_en", 0x17, 8);
	
	bitTmp = new BitField("heat_reg_en", 0, 1);
	regTmp.addBitField(bitTmp);

	registerData.Add("heat_reg_en", regTmp);

	regTmp = new Register("temp_reg_p", 0x18, 8);
	
	bitTmp = new BitField("temp_reg_p", 0, 8);
	regTmp.addBitField(bitTmp);

	registerData.Add("temp_reg_p", regTmp);

	regTmp = new Register("temp_reg_i", 0x19, 8);
	
	bitTmp = new BitField("temp_reg_i", 0, 8);
	regTmp.addBitField(bitTmp);

	registerData.Add("temp_reg_i", regTmp);

	regTmp = new Register("temp_reg_d", 0x1a, 8);
	
	bitTmp = new BitField("temp_reg_d", 0, 8);
	regTmp.addBitField(bitTmp);

	registerData.Add("temp_reg_d", regTmp);

	regTmp = new Register("util_run", 0x1b, 8);
	
	bitTmp = new BitField("util_run", 0, 1);
	regTmp.addBitField(bitTmp);

	registerData.Add("util_run", regTmp);

	regTmp = new Register("util_tdie", 0x1c, 16);
	
	bitTmp = new BitField("util_tdie", 0, 16);
	regTmp.addBitField(bitTmp);

	registerData.Add("util_tdie", regTmp);

	regTmp = new Register("util_vsup", 0x1e, 16);
	
	bitTmp = new BitField("util_vsup", 0, 16);
	regTmp.addBitField(bitTmp);

	registerData.Add("util_vsup", regTmp);

	regTmp = new Register("int_en", 0x20, 8);
	
	bitTmp = new BitField("meas_int_en", 0, 1);
	regTmp.addBitField(bitTmp);

	bitTmp = new BitField("util_int_en", 1, 1);
	regTmp.addBitField(bitTmp);

	registerData.Add("int_en", regTmp);

	regTmp = new Register("int_sts", 0x21, 8);
	
	bitTmp = new BitField("meas_int_sts", 0, 1);
	regTmp.addBitField(bitTmp);

	bitTmp = new BitField("util_int_sts", 1, 1);
	regTmp.addBitField(bitTmp);

	registerData.Add("int_sts", regTmp);

	regTmp = new Register("nvm_addr", 0x22, 16);
	
	bitTmp = new BitField("nvm_addr", 0, 10);
	regTmp.addBitField(bitTmp);

	registerData.Add("nvm_addr", regTmp);

	regTmp = new Register("nvm_data", 0x24, 8);
	
	bitTmp = new BitField("nvm_data", 0, 8);
	regTmp.addBitField(bitTmp);

	registerData.Add("nvm_data", regTmp);

	regTmp = new Register("meas_data_fifo_status", 0x25, 8);
	
	bitTmp = new BitField("meas_data_fifo_status", 0, 8);
	regTmp.addBitField(bitTmp);

	registerData.Add("meas_data_fifo_status", regTmp);

	regTmp = new Register("meas_data_fifo", 0x26, 16);
	
	bitTmp = new BitField("meas_data", 0, 16);
	regTmp.addBitField(bitTmp);

	registerData.Add("meas_data_fifo", regTmp);



	        return registerData;
	    }
	}


	public class BitField{
		private String name;
		
		private int offset;
		private int width;
		
		public BitField(String name, int offset, int width){
			this.name = name;
			this.offset = offset;
			this.width = width;
		} 
		
		public void setName(String name){
			this.name = name;
		}
		
		public String getName(){
			return name;
		}
		
		public void setOffset(int offset){
			this.offset = offset;
		}
		
		public int getOffset(){
			return offset;
		}
		
		public void setWidth(int width){
			this.width = width;
		}
		
		public int getWidth(){
			return width;
		}
	}
	
	public class Register{
		private String name;
		
		private int offset;
		private int dataWidth;
		private LinkedList<BitField> bitField = new LinkedList<BitField>();
		
		public Register(String name, int offset, int dataWidth){
			this.name = name;
			this.offset = offset;
			this.dataWidth = dataWidth;
		}
		
		public void setName(String name){
			this.name = name;
		}
		
		public String getName(){
			return name;
		}
		
		
		public int getOffset(){
			return offset;
		}
		
		public void setDataWidth(int dataWidth){
			this.dataWidth = dataWidth;
		}
		
		public int getDataWidth(){
			return dataWidth;
		}
		
		public void addBitField(BitField bit){
			bitField.AddLast(bit);
		}
		
		public LinkedList<BitField> getBitField(){
			return bitField;
		}
	}
}
