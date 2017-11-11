
from Tkinter import *
import ttk
from Register import Register
from BitField import BitField

class MyGui:
    def __init__(self):
    	Data = data()
        registerData = Data.dataGenerate()

	root = Tk()
	root.title("container")
	        root.geometry('300x300')
	        parent = root
	        parentLayout = TOP
	
	    	
	Configuration = Frame(parent)
	Configuration.pack(side=parentLayout)
	
	ConfigurationParent = parent
	ConfigurationParentLayout = parentLayout
	parent = Configuration
	parentLayout = TOP
	    
	register = Frame(parent)
	register.pack(side=parentLayout)
	
	registerParent = parent
	registerParentLayout = parentLayout
	parent = register
	parentLayout = TOP
	    
		
		
		
		

	registerName = ttk.Combobox(parent)
	registerName['values'] = registerData.keys()
	def registerNameClick(eventObject):
		update()
	def update():
	with open("file") as file:
		my_list = file.readlines()
		dataDict = {}
		for x in my_list:
			rowList = x.split(' ')
			dataDict[rowList[0]] = rowList[1]
		global registerValue
		registerValue = int(dataDict[registerName.get()])
		name['text'] = "Name:" + registerData[registerName.get()].getName()
		offset['text'] = "offset: " + str(registerData[registerName.get()].getOffset())
		dataWidth['text'] = "data Width: " + str(registerData[registerName.get()].getDataWidth())
		if len(registerData[registerName.get()].getBitField()) == 1:
			bitField1Name['text'] = "Not used";
		else:
			bitField1Name['text'] = registerData[registerName.get()].getBitField()[1].getName()
		bitField2Name['text'] = registerData[registerName.get()].getBitField()[0].getName()
		if len(registerData[registerName.get()].getBitField()) == 1:
			bitField1Value.configure(state = 'disabled')
		else:
			bitField1Value.configure(state='normal')
			bitField1Value['values'] = range(pow(2, registerData[registerName.get()].getBitField()[1].getWidth()))
			bitField1Value.current((registerValue & (pow(2,registerData[registerName.get()].getBitField()[1].getWidth())- 1) << registerData[registerName.get()].getBitField()[1].getOffset()) >> registerData[registerName.get()].getBitField()[1].getOffset())
		bitField2Value['values'] = range(pow(2, registerData[registerName.get()].getBitField()[0].getWidth()))
		bitField2Value.current((registerValue & (
		pow(2, registerData[registerName.get()].getBitField()[0].getWidth()) - 1) <<
															registerData[registerName.get()].getBitField()[0].getOffset()) >>
														 registerData[registerName.get()].getBitField()[0].getOffset())
		registerName.bind("<<ComboboxSelected>>", update)

registerName.pack(side = parentLayout)

		
		
	parent = registerParent
	parentLayout = registerParentLayout

	infos = Frame(parent)
	infos.pack(side=parentLayout)
	
	infosParent = parent
	infosParentLayout = parentLayout
	parent = infos
	parentLayout = TOP
	    
		
		
name = Label(parent, text='name', font=('Arial', 10))
name.pack(side=parentLayout)

	name['text'] = "Name: " + str(registerData[registerName.get()].getName())


offset = Label(parent, text='offset', font=('Arial', 10))
offset.pack(side=parentLayout)

	offset['text'] = "offset: " + str(registerData[registerName.get()].getOffset())


dataWidth = Label(parent, text='dataWidth', font=('Arial', 10))
dataWidth.pack(side=parentLayout)

	dataWidth.['text'] = "data width: " + str(registerData[registerName.get()].getDataWidth())


		
		
		
		
	parent = infosParent
	parentLayout = infosParentLayout

		
	values = Frame(parent)
	values.pack(side=parentLayout)
    
	valuesParent = parent
	valuesParentLayout = parentLayout
	parent = values
	parentLayout = LEFT
	    
	bitField1 = Frame(parent)
	bitField1.pack(side=parentLayout)
	
	bitField1Parent = parent
	bitField1ParentLayout = parentLayout
	parent = bitField1
	parentLayout = TOP
	    
		
		
bitField1Name = Label(parent, text='bitField1Name', font=('Arial', 10))
bitField1Name.pack(side=parentLayout)

	if(len(registerData[registerName.current(0)].getBitField()==1)):
		bitField1Name['text'] = ("Not used")
	else:
		bitField1Name['text'] = (registerData[registerName.current(0)].getBitField()[1].getName())
		


		
		

	bitField1Value = ttk.Combobox(parent)
	if(len(registerData[registerName.get()].getBitField())==1):
		bitField1Value.configure(state='disabled')
	else:
		bitField1Value['values'] = range(pow(2, registerData[registerName.get()].getBitField()[0].getWidth()))
	def bitField1ValueClick(eventObject):
		global registerValue
		registerValue = (registerValue & (pow(2, registerData[registerName.get()].getBitField()[0].getWidth()) - 1) << registerData[registerName.get()].getBitField()[1].getOffset())^ registerValue | (int(bitField1Value.get()) << registerData[registerName.get()].getBitField()[1].getOffset())
		with open("file", "a") as myfile:
			myfile.write('\n' + registerName.get() + str(registerValue))
	bitField1Value.bind("<<ComboboxSelected>>", bitField1ValueClick)
	bitField1Value.pack(side = parentLayout)

bitField1Value.pack(side = parentLayout)

		
		
	parent = bitField1Parent
	parentLayout = bitField1ParentLayout

	bitField2 = Frame(parent)
	bitField2.pack(side=parentLayout)
	
	bitField2Parent = parent
	bitField2ParentLayout = parentLayout
	parent = bitField2
	parentLayout = TOP
	    
		
		
bitField2Name = Label(parent, text='bitField2Name', font=('Arial', 10))
bitField2Name.pack(side=parentLayout)

	bitField2Name['text'] = (registerData[registerName.current(0)].getBitField()[0].getName());


		
		

	bitField2Value = ttk.Combobox(parent)
	bitField2Value['values'] = range(pow(2, registerData[registerName.get()].getBitField()[0].getWidth()))
	def bitField2ValueClick(eventObject):
		global registerValue
		registerValue = (registerValue & (pow(2, registerData[registerName.get()].getBitField()[0].getWidth()) - 1) << registerData[registerName.get()].getBitField()[0].getOffset()) ^ registerValue | (int(bitField2Value.get()) << registerData[registerName.get()].getBitField()[0].getOffset())
		with open("file", "a") as myfile:
			myfile.write('\n' + registerName.get() + str(registerValue))
	bitField2Value.bind("<<ComboboxSelected>>", bitField2ValueClick)
	bitField2Value.pack(side = parentLayout)

bitField2Value.pack(side = parentLayout)

		
		
	parent = bitField2Parent
	parentLayout = bitField2ParentLayout

    	
    	
    	
    	
    	
    	
    parent = valuesParent
    parentLayout = valuesParentLayout

		
		
		
		
		
	parent = ConfigurationParent
	parentLayout = ConfigurationParentLayout

	
	update()
	root.mainloop()

class data:
	def dataGenerate(self):
		registerData = {}
		
	
	
	regTmp = Register("pwm_per", 0x0, 16)
	
	bitTmp = BitField("pwm_per", 0, 16)
	regTmp.addBitField(bitTmp)

	registerData["pwm_per"] =  regTmp

	regTmp = Register("heat_smpls", 0x2, 8)
	
	bitTmp = BitField("heat_smpls", 0, 6)
	regTmp.addBitField(bitTmp)

	registerData["heat_smpls"] =  regTmp

	regTmp = Register("meas_smpls", 0x3, 8)
	
	bitTmp = BitField("meas_smpls", 0, 6)
	regTmp.addBitField(bitTmp)

	registerData["meas_smpls"] =  regTmp

	regTmp = Register("meas_accu", 0x4, 8)
	
	bitTmp = BitField("meas_accu", 0, 3)
	regTmp.addBitField(bitTmp)

	registerData["meas_accu"] =  regTmp

	regTmp = Register("gas_val", 0x5, 16)
	
	bitTmp = BitField("gas_val", 0, 12)
	regTmp.addBitField(bitTmp)

	registerData["gas_val"] =  regTmp

	regTmp = Register("meas_ctrl", 0x7, 8)
	
	bitTmp = BitField("meas_run", 0, 1)
	regTmp.addBitField(bitTmp)

	bitTmp = BitField("meas_cont", 1, 1)
	regTmp.addBitField(bitTmp)

	registerData["meas_ctrl"] =  regTmp

	regTmp = Register("meas_per", 0x8, 8)
	
	bitTmp = BitField("meas_per", 0, 8)
	regTmp.addBitField(bitTmp)

	registerData["meas_per"] =  regTmp

	regTmp = Register("meas_mode", 0x9, 8)
	
	bitTmp = BitField("meas_mode", 0, 2)
	regTmp.addBitField(bitTmp)

	registerData["meas_mode"] =  regTmp

	regTmp = Register("meas_smpl_sts", 0xa, 8)
	
	bitTmp = BitField("meas_smpl_sts", 0, 6)
	regTmp.addBitField(bitTmp)

	registerData["meas_smpl_sts"] =  regTmp

	regTmp = Register("meas_accu_sts", 0xb, 8)
	
	bitTmp = BitField("meas_accu_sts", 0, 6)
	regTmp.addBitField(bitTmp)

	registerData["meas_accu_sts"] =  regTmp

	regTmp = Register("meas_ofs", 0xc, 8)
	
	bitTmp = BitField("meas_ofs", 0, 8)
	regTmp.addBitField(bitTmp)

	registerData["meas_ofs"] =  regTmp

	regTmp = Register("meas_gain", 0xd, 8)
	
	bitTmp = BitField("meas_gain", 0, 3)
	regTmp.addBitField(bitTmp)

	registerData["meas_gain"] =  regTmp

	regTmp = Register("pwm_duty_heat", 0xe, 16)
	
	bitTmp = BitField("pwm_duty_heat", 0, 16)
	regTmp.addBitField(bitTmp)

	registerData["pwm_duty_heat"] =  regTmp

	regTmp = Register("pwm_duty_cool", 0x10, 16)
	
	bitTmp = BitField("pwm_duty_cool", 0, 16)
	regTmp.addBitField(bitTmp)

	registerData["pwm_duty_cool"] =  regTmp

	regTmp = Register("temp_set_heat", 0x12, 16)
	
	bitTmp = BitField("temp_set_heat", 0, 16)
	regTmp.addBitField(bitTmp)

	registerData["temp_set_heat"] =  regTmp

	regTmp = Register("temp_set_cool", 0x14, 16)
	
	bitTmp = BitField("temp_set_cool", 0, 16)
	regTmp.addBitField(bitTmp)

	registerData["temp_set_cool"] =  regTmp

	regTmp = Register("temp_set_mode", 0x16, 8)
	
	bitTmp = BitField("temp_set_mode", 0, 1)
	regTmp.addBitField(bitTmp)

	registerData["temp_set_mode"] =  regTmp

	regTmp = Register("heat_reg_en", 0x17, 8)
	
	bitTmp = BitField("heat_reg_en", 0, 1)
	regTmp.addBitField(bitTmp)

	registerData["heat_reg_en"] =  regTmp

	regTmp = Register("temp_reg_p", 0x18, 8)
	
	bitTmp = BitField("temp_reg_p", 0, 8)
	regTmp.addBitField(bitTmp)

	registerData["temp_reg_p"] =  regTmp

	regTmp = Register("temp_reg_i", 0x19, 8)
	
	bitTmp = BitField("temp_reg_i", 0, 8)
	regTmp.addBitField(bitTmp)

	registerData["temp_reg_i"] =  regTmp

	regTmp = Register("temp_reg_d", 0x1a, 8)
	
	bitTmp = BitField("temp_reg_d", 0, 8)
	regTmp.addBitField(bitTmp)

	registerData["temp_reg_d"] =  regTmp

	regTmp = Register("util_run", 0x1b, 8)
	
	bitTmp = BitField("util_run", 0, 1)
	regTmp.addBitField(bitTmp)

	registerData["util_run"] =  regTmp

	regTmp = Register("util_tdie", 0x1c, 16)
	
	bitTmp = BitField("util_tdie", 0, 16)
	regTmp.addBitField(bitTmp)

	registerData["util_tdie"] =  regTmp

	regTmp = Register("util_vsup", 0x1e, 16)
	
	bitTmp = BitField("util_vsup", 0, 16)
	regTmp.addBitField(bitTmp)

	registerData["util_vsup"] =  regTmp

	regTmp = Register("int_en", 0x20, 8)
	
	bitTmp = BitField("meas_int_en", 0, 1)
	regTmp.addBitField(bitTmp)

	bitTmp = BitField("util_int_en", 1, 1)
	regTmp.addBitField(bitTmp)

	registerData["int_en"] =  regTmp

	regTmp = Register("int_sts", 0x21, 8)
	
	bitTmp = BitField("meas_int_sts", 0, 1)
	regTmp.addBitField(bitTmp)

	bitTmp = BitField("util_int_sts", 1, 1)
	regTmp.addBitField(bitTmp)

	registerData["int_sts"] =  regTmp

	regTmp = Register("nvm_addr", 0x22, 16)
	
	bitTmp = BitField("nvm_addr", 0, 10)
	regTmp.addBitField(bitTmp)

	registerData["nvm_addr"] =  regTmp

	regTmp = Register("nvm_data", 0x24, 8)
	
	bitTmp = BitField("nvm_data", 0, 8)
	regTmp.addBitField(bitTmp)

	registerData["nvm_data"] =  regTmp

	regTmp = Register("meas_data_fifo_status", 0x25, 8)
	
	bitTmp = BitField("meas_data_fifo_status", 0, 8)
	regTmp.addBitField(bitTmp)

	registerData["meas_data_fifo_status"] =  regTmp

	regTmp = Register("meas_data_fifo", 0x26, 16)
	
	bitTmp = BitField("meas_data", 0, 16)
	regTmp.addBitField(bitTmp)

	registerData["meas_data_fifo"] =  regTmp



		return registerData
myGui = MyGui()
