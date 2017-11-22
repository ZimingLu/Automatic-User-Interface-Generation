
from Tkinter import *
import ttk
from PORT import *
from math import *
# from test import *
import random


class FormMain:
  port = Port()

  def __init__(self):
    root = Tk()
    root.title("container")
    root.geometry('820x650')
    self.basicForm(root)
    self.registerForm(root, self.port)
    root.mainloop()

  def basicForm(self, root):
    connectFrame = Frame(root, bd=1, relief=RIDGE)
    connectFrame.pack(side=TOP, fill=X, padx=5, pady=10)
    label = Label(connectFrame, text="COM port")
    label.pack(padx=5, pady=10, side=LEFT)
    comComboBox = ttk.Combobox(connectFrame, width=8)
    comComboBox.pack(padx=5, pady=10, side=LEFT)
    portList = ["off"] + self.port.getSerialPorts()
    comComboBox['values'] = portList
    comComboBox.current(0)

    def comComboBoxSelected(event):
      if comComboBox.get() == "off":
        hideAll()
        self.registerFrame.pack_forget()
      else:
        self.registerFrame.pack(side=TOP, fill=BOTH, padx=5, pady=10)
        if not self.port.isPortOpen(comComboBox.get()):
          self.port.openPort(comComboBox.get())
        labelProtocol.pack(padx=5, pady=10, side=LEFT)
        self.protocolComboBox.pack(padx=5, pady=10, side=LEFT)
        if self.protocolComboBox.get() == "I2C":
          hideAll()
          labelProtocol.pack(padx=5, pady=10, side=LEFT)
          self.protocolComboBox.pack(padx=5, pady=10, side=LEFT)
          self.labelPort.pack(padx=5, pady=10, side=LEFT)
          self.portSpinbox.pack(padx=5, pady=10, side=LEFT)
          labelChannel.pack(padx=5, pady=10, side=LEFT)
          self.channelSpinbox.pack(padx=5, pady=10, side=LEFT)
          labelAddress.pack(padx=5, pady=10, side=LEFT)
          self.addressSpinbox.pack(padx=5, pady=10, side=LEFT)
          buttonReadAll.pack(padx=5, pady=10, side=LEFT)
        elif self.protocolComboBox.get() == "SPI":
          if not self.port.isPortOpen(comComboBox.get()):
            self.port.openPort(comComboBox.get())
          labelProtocol.pack(padx=5, pady=10, side=LEFT)
          self.protocolComboBox.pack(padx=5, pady=10, side=LEFT)
          labelSlave.pack(padx=5, pady=10, side=LEFT)
          self.slaveSpinbox.pack(padx=5, pady=10, side=LEFT)
          buttonReadAll.pack(padx=5, pady=10, side=LEFT)

    def hideAll():
      labelProtocol.pack_forget()
      self.protocolComboBox.pack_forget()
      self.labelPort.pack_forget()
      self.portSpinbox.pack_forget()
      labelChannel.pack_forget()
      self.channelSpinbox.pack_forget()
      labelAddress.pack_forget()
      self.addressSpinbox.pack_forget()
      labelSlave.pack_forget()
      self.slaveSpinbox.pack_forget()
      buttonReadAll.pack_forget()

    def buttonRefreshClicked(event):
      self.registerFrame.pack_forget()
      hideAll()
      comComboBox.current(0)

    comComboBox.bind("<<ComboboxSelected>>", comComboBoxSelected)

    buttonRefresh = Button(connectFrame, text="Refresh")
    buttonRefresh.pack(padx=5, pady=10, side=LEFT)
    buttonRefresh.bind('<Button-1>', buttonRefreshClicked)
    # protocol part
    labelProtocol = Label(connectFrame, text="Protocol:")
    labelProtocol.pack(padx=5, pady=10, side=LEFT)
    self.protocolComboBox = ttk.Combobox(connectFrame, width=8)
    self.protocolComboBox.pack(padx=5, pady=10, side=LEFT)
    self.protocolComboBox["values"] = ["I2C", "SPI"]
    self.protocolComboBox.current(0)

    def protocolComboBoxClicked(event):
      if self.protocolComboBox.get() == "I2C":
        hideAll()
        labelProtocol.pack(padx=5, pady=10, side=LEFT)
        self.protocolComboBox.pack(padx=5, pady=10, side=LEFT)
        self.labelPort.pack(padx=5, pady=10, side=LEFT)
        self.portSpinbox.pack(padx=5, pady=10, side=LEFT)
        labelChannel.pack(padx=5, pady=10, side=LEFT)
        self.channelSpinbox.pack(padx=5, pady=10, side=LEFT)
        labelAddress.pack(padx=5, pady=10, side=LEFT)
        self.addressSpinbox.pack(padx=5, pady=10, side=LEFT)
        buttonReadAll.pack(padx=5, pady=10, side=LEFT)
        labelSlave.pack_forget()
        self.slaveSpinbox.pack_forget()
      elif self.protocolComboBox.get() == "SPI":
        hideAll()
        labelProtocol.pack(padx=5, pady=10, side=LEFT)
        self.protocolComboBox.pack(padx=5, pady=10, side=LEFT)
        self.labelPort.pack_forget()
        self.portSpinbox.pack_forget()
        labelChannel.pack_forget()
        self.channelSpinbox.pack_forget()
        labelAddress.pack_forget()
        self.addressSpinbox.pack_forget()
        labelSlave.pack(padx=5, pady=10, side=LEFT)
        self.slaveSpinbox.pack(padx=5, pady=10, side=LEFT)
        buttonReadAll.pack(padx=5, pady=10, side=LEFT)

    self.protocolComboBox.bind("<<ComboboxSelected>>", protocolComboBoxClicked)
    # port part
    self.labelPort = Label(connectFrame, text="Port:")
    self.labelPort.pack(padx=5, pady=10, side=LEFT)
    var = StringVar(root)
    var.set("2")
    self.portSpinbox = Spinbox(connectFrame, width=8, from_=1, to=2, textvariable=var)
    self.portSpinbox.pack(padx=5, pady=10, side=LEFT)
    # channel part
    labelChannel = Label(connectFrame, text="Channel:")
    labelChannel.pack(padx=5, pady=10, side=LEFT)
    var = StringVar(root)
    var.set("3")
    self.channelSpinbox = Spinbox(connectFrame, width=8, from_=0, to=3, textvariable=var)
    self.channelSpinbox.pack(padx=5, pady=10, side=LEFT)
    # address part
    labelAddress = Label(connectFrame, text="Address:")
    labelAddress.pack(padx=5, pady=10, side=LEFT)
    var = StringVar(root)
    var.set("32")
    self.addressSpinbox = Spinbox(connectFrame, width=8, from_=0, to=255, textvariable=var)
    self.addressSpinbox.pack(padx=5, pady=10, side=LEFT)
    # slave part
    labelSlave = Label(connectFrame, text="Slave:")
    labelSlave.pack(padx=5, pady=10, side=LEFT)
    var = StringVar(root)
    var.set("32")
    self.slaveSpinbox = Spinbox(connectFrame, width=8, from_=0, to=255, textvariable=var)
    labelSlave.pack_forget()
    self.slaveSpinbox.pack_forget()

    def buttonReadAllClick(event):
      self.ReadAll()

    buttonReadAll = Button(connectFrame, text="ReadAll")
    buttonReadAll.pack(side=LEFT)
    buttonReadAll.bind('<Button-1>', buttonReadAllClick)
    hideAll()

  def send_write_command(self, register, value):
    if self.protocolComboBox.get() == "I2C":
      self.port.write(register, value, HubPort=self.portSpinbox.get(),
                      Channel=self.channelSpinbox.get(), DeviceAddress=self.addressSpinbox.get())
    elif self.protocolComboBox.get() == "SPI":
      self.port.write(register, value, SlaveAddress=self.slaveSpinbox.get())

  def send_read_command(self, register, noBytes, skipRead):
    if self.protocolComboBox.get() == "I2C":
      if skipRead:
        self.port.read(register, noBytes, HubPort=self.portSpinbox.get(), Channel=int(self.channelSpinbox.get()) + 1,
                       DeviceAddress=self.addressSpinbox.get())
        return self.port.read(register, noBytes, HubPort=self.portSpinbox.get(),
                              Channel=int(self.channelSpinbox.get()) + 1,
                              DeviceAddress=self.addressSpinbox.get())
    elif self.protocolComboBox.get() == "SPI":
      if skipRead:
        self.port.read(register, noBytes, self.slaveSpinbox.get())
      return self.port.read(register, noBytes, self.slaveSpinbox.get())

  def registerForm(self, root, port):
	i = 0
	self.registerFrame = Frame(root, bd=1, relief=RIDGE, width = 550)
	self.registerFrame.pack(side=TOP, fill = BOTH, padx=5, pady=10)
	self.registerFrame.pack_forget()
	
	
	
	
	ld0_perFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	ld0_perFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	duty_cycle_ld0_blueFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	duty_cycle_ld0_blueFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	duty_cycle_ld0_greenFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	duty_cycle_ld0_greenFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	ld4_ctrlFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	ld4_ctrlFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	

	

	

	
	sensor_enFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	sensor_enFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	sensor_measFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	sensor_measFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	heater_voltageFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	heater_voltageFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	rheat_refFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	rheat_refFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	rheat_alphaFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	rheat_alphaFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	adc_input_gainFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	adc_input_gainFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	sample_rateFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	sample_rateFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	on_cyclesFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	on_cyclesFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	off_cyclesFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	off_cyclesFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	set_hh_tempFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	set_hh_tempFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	wait_cyclesFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	wait_cyclesFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	meas_cntFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	meas_cntFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	led_ctrlFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	led_ctrlFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	meas_doneFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	meas_doneFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	meas_resultFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	meas_resultFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	smpl_firstFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	smpl_firstFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	smpl_lastFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	smpl_lastFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	k_factorFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	k_factorFrame.grid(row=i/4, column=i%4)
	i = i + 1
	

	
	ppmFrame = Frame(self.registerFrame, bd=1, relief=RIDGE, width = 200)
	ppmFrame.grid(row=i/4, column=i%4)
	i = i + 1
	



    
	
	
	
	parent = ld0_perFrame
	ld0_perRegLabel = Label(parent, text = "ld0_per")
	ld0_perRegLabel.pack(side = TOP)
	
	
	self.ld0_pernobytes = int(ceil(16/8))
	self.ld0_perregAddress = 0x0
	
	

   
	ld0_perBitFieldFrame = Frame(parent)
	ld0_perBitFieldFrame.pack(side = TOP)
	def ld0_perSpinboxEventHandler(event=None):
		nobytes = self.ld0_pernobytes
		valueAsByteArray = []
		value = int(self.ld0_perSpinbox.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.ld0_perregAddress,valueAsByteArray)
	ld0_perLabel = Label(ld0_perBitFieldFrame, text = "ld0_per", width = 15)
	ld0_perLabel.pack(padx=5, pady=10, side=LEFT)
	self.ld0_perSpinbox = Spinbox(ld0_perBitFieldFrame, width = 8, from_=0, to=pow(2, 12)-1, command = ld0_perSpinboxEventHandler)
	self.ld0_perSpinbox.pack(padx=5, pady=10, side=LEFT)
	self.ld0_perSpinbox.bind('<Return>', ld0_perSpinboxEventHandler)
     






	
	parent = duty_cycle_ld0_blueFrame
	duty_cycle_ld0_blueRegLabel = Label(parent, text = "duty_cycle_ld0_blue")
	duty_cycle_ld0_blueRegLabel.pack(side = TOP)
	
	
	self.duty_cycle_ld0_bluenobytes = int(ceil(16/8))
	self.duty_cycle_ld0_blueregAddress = 0x2
	
	

   
	duty_cycle_ld0_blueBitFieldFrame = Frame(parent)
	duty_cycle_ld0_blueBitFieldFrame.pack(side = TOP)
	def duty_cycle_ld0_blueSpinboxEventHandler(event=None):
		nobytes = self.duty_cycle_ld0_bluenobytes
		valueAsByteArray = []
		value = int(self.duty_cycle_ld0_blueSpinbox.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.duty_cycle_ld0_blueregAddress,valueAsByteArray)
	duty_cycle_ld0_blueLabel = Label(duty_cycle_ld0_blueBitFieldFrame, text = "duty_cycle_ld0_blue", width = 15)
	duty_cycle_ld0_blueLabel.pack(padx=5, pady=10, side=LEFT)
	self.duty_cycle_ld0_blueSpinbox = Spinbox(duty_cycle_ld0_blueBitFieldFrame, width = 8, from_=0, to=pow(2, 12)-1, command = duty_cycle_ld0_blueSpinboxEventHandler)
	self.duty_cycle_ld0_blueSpinbox.pack(padx=5, pady=10, side=LEFT)
	self.duty_cycle_ld0_blueSpinbox.bind('<Return>', duty_cycle_ld0_blueSpinboxEventHandler)
     






	
	parent = duty_cycle_ld0_greenFrame
	duty_cycle_ld0_greenRegLabel = Label(parent, text = "duty_cycle_ld0_green")
	duty_cycle_ld0_greenRegLabel.pack(side = TOP)
	
	
	self.duty_cycle_ld0_greennobytes = int(ceil(16/8))
	self.duty_cycle_ld0_greenregAddress = 0x4
	
	

   
	duty_cycle_ld0_greenBitFieldFrame = Frame(parent)
	duty_cycle_ld0_greenBitFieldFrame.pack(side = TOP)
	def duty_cycle_ld0_greenSpinboxEventHandler(event=None):
		nobytes = self.duty_cycle_ld0_greennobytes
		valueAsByteArray = []
		value = int(self.duty_cycle_ld0_greenSpinbox.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.duty_cycle_ld0_greenregAddress,valueAsByteArray)
	duty_cycle_ld0_greenLabel = Label(duty_cycle_ld0_greenBitFieldFrame, text = "duty_cycle_ld0_green", width = 15)
	duty_cycle_ld0_greenLabel.pack(padx=5, pady=10, side=LEFT)
	self.duty_cycle_ld0_greenSpinbox = Spinbox(duty_cycle_ld0_greenBitFieldFrame, width = 8, from_=0, to=pow(2, 12)-1, command = duty_cycle_ld0_greenSpinboxEventHandler)
	self.duty_cycle_ld0_greenSpinbox.pack(padx=5, pady=10, side=LEFT)
	self.duty_cycle_ld0_greenSpinbox.bind('<Return>', duty_cycle_ld0_greenSpinboxEventHandler)
     






	
	parent = ld4_ctrlFrame
	ld4_ctrlRegLabel = Label(parent, text = "ld4_ctrl")
	ld4_ctrlRegLabel.pack(side = TOP)
	
	
	self.ld4_ctrlnobytes = int(ceil(8/8))
	self.ld4_ctrlregAddress = 0x6
	
	

   
	def ld4_ctrlCheckEventHandler():
		nobytes = 1
		valueAsByteArray = []
		value = int(self.ld4_ctrlis_checked.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.ld4_ctrlregAddress, valueAsByteArray)
	self.ld4_ctrlis_checked = IntVar()
	
	self.ld4_ctrlCheckButton = Checkbutton(parent, text = "ld4_ctrl", width = 20, command=ld4_ctrlCheckEventHandler, variable=self.ld4_ctrlis_checked)
	
	self.ld4_ctrlCheckButton.pack(side = TOP)
	






	
	
	self.ld5_ctrlnobytes = int(ceil(8/8))
	self.ld5_ctrlregAddress = 0x7
	
	

   
	def ld5_ctrlCheckEventHandler():
		nobytes = 1
		valueAsByteArray = []
		value = int(self.ld5_ctrlis_checked.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.ld5_ctrlregAddress, valueAsByteArray)
	self.ld5_ctrlis_checked = IntVar()
	
	self.ld5_ctrlCheckButton = Checkbutton(ld4_ctrlFrame, text = "ld5_ctrl", width = 20, command=ld5_ctrlCheckEventHandler, variable=self.ld5_ctrlis_checked)
	
	self.ld5_ctrlCheckButton.pack(side = TOP)
	






	
	
	self.ld6_ctrlnobytes = int(ceil(8/8))
	self.ld6_ctrlregAddress = 0x8
	
	

   
	def ld6_ctrlCheckEventHandler():
		nobytes = 1
		valueAsByteArray = []
		value = int(self.ld6_ctrlis_checked.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.ld6_ctrlregAddress, valueAsByteArray)
	self.ld6_ctrlis_checked = IntVar()
	
	self.ld6_ctrlCheckButton = Checkbutton(ld4_ctrlFrame, text = "ld6_ctrl", width = 20, command=ld6_ctrlCheckEventHandler, variable=self.ld6_ctrlis_checked)
	
	self.ld6_ctrlCheckButton.pack(side = TOP)
	






	
	
	self.ld7_ctrlnobytes = int(ceil(8/8))
	self.ld7_ctrlregAddress = 0x9
	
	

   
	def ld7_ctrlCheckEventHandler():
		nobytes = 1
		valueAsByteArray = []
		value = int(self.ld7_ctrlis_checked.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.ld7_ctrlregAddress, valueAsByteArray)
	self.ld7_ctrlis_checked = IntVar()
	
	self.ld7_ctrlCheckButton = Checkbutton(ld4_ctrlFrame, text = "ld7_ctrl", width = 20, command=ld7_ctrlCheckEventHandler, variable=self.ld7_ctrlis_checked)
	
	self.ld7_ctrlCheckButton.pack(side = TOP)
	






	
	parent = sensor_enFrame
	sensor_enRegLabel = Label(parent, text = "sensor_en")
	sensor_enRegLabel.pack(side = TOP)
	
	
	self.sensor_ennobytes = int(ceil(8/8))
	self.sensor_enregAddress = 0xa
	
	

   
	def sensor_enCheckEventHandler():
		nobytes = 1
		valueAsByteArray = []
		value = int(self.sensor_enis_checked.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.sensor_enregAddress, valueAsByteArray)
	self.sensor_enis_checked = IntVar()
	
	self.sensor_enCheckButton = Checkbutton(parent, text = "sensor_en", width = 20, command=sensor_enCheckEventHandler, variable=self.sensor_enis_checked)
	
	self.sensor_enCheckButton.pack(side = TOP)
	






	
	parent = sensor_measFrame
	sensor_measRegLabel = Label(parent, text = "sensor_meas")
	sensor_measRegLabel.pack(side = TOP)
	
	
	self.sensor_measnobytes = int(ceil(8/8))
	self.sensor_measregAddress = 0xb
	
	

   
	def sensor_measCheckEventHandler():
		nobytes = 1
		valueAsByteArray = []
		value = int(self.sensor_measis_checked.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.sensor_measregAddress, valueAsByteArray)
	self.sensor_measis_checked = IntVar()
	
	self.sensor_measCheckButton = Checkbutton(parent, text = "sensor_meas", width = 20, command=sensor_measCheckEventHandler, variable=self.sensor_measis_checked)
	
	self.sensor_measCheckButton.pack(side = TOP)
	






	
	parent = heater_voltageFrame
	heater_voltageRegLabel = Label(parent, text = "heater_voltage")
	heater_voltageRegLabel.pack(side = TOP)
	
	
	self.heater_voltagenobytes = int(ceil(16/8))
	self.heater_voltageregAddress = 0xc
	
	

   
	heater_voltageBitFieldFrame = Frame(parent)
	heater_voltageBitFieldFrame.pack(side = TOP)
	def heater_voltageSpinboxEventHandler(event=None):
		nobytes = self.heater_voltagenobytes
		valueAsByteArray = []
		value = int(self.heater_voltageSpinbox.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.heater_voltageregAddress,valueAsByteArray)
	heater_voltageLabel = Label(heater_voltageBitFieldFrame, text = "heater_voltage", width = 15)
	heater_voltageLabel.pack(padx=5, pady=10, side=LEFT)
	self.heater_voltageSpinbox = Spinbox(heater_voltageBitFieldFrame, width = 8, from_=0, to=pow(2, 16)-1, command = heater_voltageSpinboxEventHandler)
	self.heater_voltageSpinbox.pack(padx=5, pady=10, side=LEFT)
	self.heater_voltageSpinbox.bind('<Return>', heater_voltageSpinboxEventHandler)
     






	
	parent = rheat_refFrame
	rheat_refRegLabel = Label(parent, text = "rheat_ref")
	rheat_refRegLabel.pack(side = TOP)
	
	
	self.rheat_refnobytes = int(ceil(16/8))
	self.rheat_refregAddress = 0xe
	
	

   
	rheat_refBitFieldFrame = Frame(parent)
	rheat_refBitFieldFrame.pack(side = TOP)
	def rheat_refSpinboxEventHandler(event=None):
		nobytes = self.rheat_refnobytes
		valueAsByteArray = []
		value = int(self.rheat_refSpinbox.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.rheat_refregAddress,valueAsByteArray)
	rheat_refLabel = Label(rheat_refBitFieldFrame, text = "rheat_ref", width = 15)
	rheat_refLabel.pack(padx=5, pady=10, side=LEFT)
	self.rheat_refSpinbox = Spinbox(rheat_refBitFieldFrame, width = 8, from_=0, to=pow(2, 16)-1, command = rheat_refSpinboxEventHandler)
	self.rheat_refSpinbox.pack(padx=5, pady=10, side=LEFT)
	self.rheat_refSpinbox.bind('<Return>', rheat_refSpinboxEventHandler)
     






	
	parent = rheat_alphaFrame
	rheat_alphaRegLabel = Label(parent, text = "rheat_alpha")
	rheat_alphaRegLabel.pack(side = TOP)
	
	
	self.rheat_alphanobytes = int(ceil(16/8))
	self.rheat_alpharegAddress = 0x10
	
	

   
	rheat_alphaBitFieldFrame = Frame(parent)
	rheat_alphaBitFieldFrame.pack(side = TOP)
	def rheat_alphaSpinboxEventHandler(event=None):
		nobytes = self.rheat_alphanobytes
		valueAsByteArray = []
		value = int(self.rheat_alphaSpinbox.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.rheat_alpharegAddress,valueAsByteArray)
	rheat_alphaLabel = Label(rheat_alphaBitFieldFrame, text = "rheat_alpha", width = 15)
	rheat_alphaLabel.pack(padx=5, pady=10, side=LEFT)
	self.rheat_alphaSpinbox = Spinbox(rheat_alphaBitFieldFrame, width = 8, from_=0, to=pow(2, 16)-1, command = rheat_alphaSpinboxEventHandler)
	self.rheat_alphaSpinbox.pack(padx=5, pady=10, side=LEFT)
	self.rheat_alphaSpinbox.bind('<Return>', rheat_alphaSpinboxEventHandler)
     






	
	parent = adc_input_gainFrame
	adc_input_gainRegLabel = Label(parent, text = "adc_input_gain")
	adc_input_gainRegLabel.pack(side = TOP)
	
	
	self.adc_input_gainnobytes = int(ceil(8/8))
	self.adc_input_gainregAddress = 0x12
	
	

   
	adc_input_gainBitFieldFrame = Frame(parent)
	adc_input_gainBitFieldFrame.pack(side = TOP)
	def adc_input_gainSpinboxEventHandler(event=None):
		nobytes = self.adc_input_gainnobytes
		valueAsByteArray = []
		value = int(self.adc_input_gainSpinbox.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.adc_input_gainregAddress,valueAsByteArray)
	adc_input_gainLabel = Label(adc_input_gainBitFieldFrame, text = "adc_input_gain", width = 15)
	adc_input_gainLabel.pack(padx=5, pady=10, side=LEFT)
	self.adc_input_gainSpinbox = Spinbox(adc_input_gainBitFieldFrame, width = 8, from_=0, to=pow(2, 8)-1, command = adc_input_gainSpinboxEventHandler)
	self.adc_input_gainSpinbox.pack(padx=5, pady=10, side=LEFT)
	self.adc_input_gainSpinbox.bind('<Return>', adc_input_gainSpinboxEventHandler)
     






	
	parent = sample_rateFrame
	sample_rateRegLabel = Label(parent, text = "sample_rate")
	sample_rateRegLabel.pack(side = TOP)
	
	
	self.sample_ratenobytes = int(ceil(8/8))
	self.sample_rateregAddress = 0x13
	
	

   
	sample_rateBitFieldFrame = Frame(parent)
	sample_rateBitFieldFrame.pack(side = TOP)
	def sample_rateSpinboxEventHandler(event=None):
		nobytes = self.sample_ratenobytes
		valueAsByteArray = []
		value = int(self.sample_rateSpinbox.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.sample_rateregAddress,valueAsByteArray)
	sample_rateLabel = Label(sample_rateBitFieldFrame, text = "sample_rate", width = 15)
	sample_rateLabel.pack(padx=5, pady=10, side=LEFT)
	self.sample_rateSpinbox = Spinbox(sample_rateBitFieldFrame, width = 8, from_=0, to=pow(2, 8)-1, command = sample_rateSpinboxEventHandler)
	self.sample_rateSpinbox.pack(padx=5, pady=10, side=LEFT)
	self.sample_rateSpinbox.bind('<Return>', sample_rateSpinboxEventHandler)
     






	
	parent = on_cyclesFrame
	on_cyclesRegLabel = Label(parent, text = "on_cycles")
	on_cyclesRegLabel.pack(side = TOP)
	
	
	self.on_cyclesnobytes = int(ceil(8/8))
	self.on_cyclesregAddress = 0x14
	
	

   
	on_cyclesBitFieldFrame = Frame(parent)
	on_cyclesBitFieldFrame.pack(side = TOP)
	def on_cyclesSpinboxEventHandler(event=None):
		nobytes = self.on_cyclesnobytes
		valueAsByteArray = []
		value = int(self.on_cyclesSpinbox.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.on_cyclesregAddress,valueAsByteArray)
	on_cyclesLabel = Label(on_cyclesBitFieldFrame, text = "on_cycles", width = 15)
	on_cyclesLabel.pack(padx=5, pady=10, side=LEFT)
	self.on_cyclesSpinbox = Spinbox(on_cyclesBitFieldFrame, width = 8, from_=0, to=pow(2, 8)-1, command = on_cyclesSpinboxEventHandler)
	self.on_cyclesSpinbox.pack(padx=5, pady=10, side=LEFT)
	self.on_cyclesSpinbox.bind('<Return>', on_cyclesSpinboxEventHandler)
     






	
	parent = off_cyclesFrame
	off_cyclesRegLabel = Label(parent, text = "off_cycles")
	off_cyclesRegLabel.pack(side = TOP)
	
	
	self.off_cyclesnobytes = int(ceil(8/8))
	self.off_cyclesregAddress = 0x15
	
	

   
	off_cyclesBitFieldFrame = Frame(parent)
	off_cyclesBitFieldFrame.pack(side = TOP)
	def off_cyclesSpinboxEventHandler(event=None):
		nobytes = self.off_cyclesnobytes
		valueAsByteArray = []
		value = int(self.off_cyclesSpinbox.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.off_cyclesregAddress,valueAsByteArray)
	off_cyclesLabel = Label(off_cyclesBitFieldFrame, text = "off_cycles", width = 15)
	off_cyclesLabel.pack(padx=5, pady=10, side=LEFT)
	self.off_cyclesSpinbox = Spinbox(off_cyclesBitFieldFrame, width = 8, from_=0, to=pow(2, 8)-1, command = off_cyclesSpinboxEventHandler)
	self.off_cyclesSpinbox.pack(padx=5, pady=10, side=LEFT)
	self.off_cyclesSpinbox.bind('<Return>', off_cyclesSpinboxEventHandler)
     






	
	parent = set_hh_tempFrame
	set_hh_tempRegLabel = Label(parent, text = "set_hh_temp")
	set_hh_tempRegLabel.pack(side = TOP)
	
	
	self.set_hh_tempnobytes = int(ceil(16/8))
	self.set_hh_tempregAddress = 0x16
	
	

   
	set_hh_tempBitFieldFrame = Frame(parent)
	set_hh_tempBitFieldFrame.pack(side = TOP)
	def set_hh_tempSpinboxEventHandler(event=None):
		nobytes = self.set_hh_tempnobytes
		valueAsByteArray = []
		value = int(self.set_hh_tempSpinbox.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.set_hh_tempregAddress,valueAsByteArray)
	set_hh_tempLabel = Label(set_hh_tempBitFieldFrame, text = "set_hh_temp", width = 15)
	set_hh_tempLabel.pack(padx=5, pady=10, side=LEFT)
	self.set_hh_tempSpinbox = Spinbox(set_hh_tempBitFieldFrame, width = 8, from_=0, to=pow(2, 16)-1, command = set_hh_tempSpinboxEventHandler)
	self.set_hh_tempSpinbox.pack(padx=5, pady=10, side=LEFT)
	self.set_hh_tempSpinbox.bind('<Return>', set_hh_tempSpinboxEventHandler)
     






	
	parent = wait_cyclesFrame
	wait_cyclesRegLabel = Label(parent, text = "wait_cycles")
	wait_cyclesRegLabel.pack(side = TOP)
	
	
	self.wait_cyclesnobytes = int(ceil(16/8))
	self.wait_cyclesregAddress = 0x18
	
	

   
	wait_cyclesBitFieldFrame = Frame(parent)
	wait_cyclesBitFieldFrame.pack(side = TOP)
	def wait_cyclesSpinboxEventHandler(event=None):
		nobytes = self.wait_cyclesnobytes
		valueAsByteArray = []
		value = int(self.wait_cyclesSpinbox.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.wait_cyclesregAddress,valueAsByteArray)
	wait_cyclesLabel = Label(wait_cyclesBitFieldFrame, text = "wait_cycles", width = 15)
	wait_cyclesLabel.pack(padx=5, pady=10, side=LEFT)
	self.wait_cyclesSpinbox = Spinbox(wait_cyclesBitFieldFrame, width = 8, from_=0, to=pow(2, 16)-1, command = wait_cyclesSpinboxEventHandler)
	self.wait_cyclesSpinbox.pack(padx=5, pady=10, side=LEFT)
	self.wait_cyclesSpinbox.bind('<Return>', wait_cyclesSpinboxEventHandler)
     






	
	parent = meas_cntFrame
	meas_cntRegLabel = Label(parent, text = "meas_cnt")
	meas_cntRegLabel.pack(side = TOP)
	
	
	self.meas_cntnobytes = int(ceil(16/8))
	self.meas_cntregAddress = 0x1a
	
	

   
	meas_cntBitFieldFrame = Frame(parent)
	meas_cntBitFieldFrame.pack(side = TOP)
	def meas_cntSpinboxEventHandler(event=None):
		nobytes = self.meas_cntnobytes
		valueAsByteArray = []
		value = int(self.meas_cntSpinbox.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.meas_cntregAddress,valueAsByteArray)
	meas_cntLabel = Label(meas_cntBitFieldFrame, text = "meas_cnt", width = 15)
	meas_cntLabel.pack(padx=5, pady=10, side=LEFT)
	self.meas_cntSpinbox = Spinbox(meas_cntBitFieldFrame, width = 8, from_=0, to=pow(2, 16)-1, command = meas_cntSpinboxEventHandler)
	self.meas_cntSpinbox.pack(padx=5, pady=10, side=LEFT)
	self.meas_cntSpinbox.bind('<Return>', meas_cntSpinboxEventHandler)
     






	
	parent = led_ctrlFrame
	led_ctrlRegLabel = Label(parent, text = "led_ctrl")
	led_ctrlRegLabel.pack(side = TOP)
	
	
	self.led_ctrlnobytes = int(ceil(8/8))
	self.led_ctrlregAddress = 0x1c
	
	

   
	led_ctrlBitFieldFrame = Frame(parent)
	led_ctrlBitFieldFrame.pack(side = TOP)
	def led_ctrlSpinboxEventHandler(event=None):
		nobytes = self.led_ctrlnobytes
		valueAsByteArray = []
		value = int(self.led_ctrlSpinbox.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.led_ctrlregAddress,valueAsByteArray)
	led_ctrlLabel = Label(led_ctrlBitFieldFrame, text = "led_ctrl", width = 15)
	led_ctrlLabel.pack(padx=5, pady=10, side=LEFT)
	self.led_ctrlSpinbox = Spinbox(led_ctrlBitFieldFrame, width = 8, from_=0, to=pow(2, 8)-1, command = led_ctrlSpinboxEventHandler)
	self.led_ctrlSpinbox.pack(padx=5, pady=10, side=LEFT)
	self.led_ctrlSpinbox.bind('<Return>', led_ctrlSpinboxEventHandler)
     






	
	parent = meas_doneFrame
	meas_doneRegLabel = Label(parent, text = "meas_done")
	meas_doneRegLabel.pack(side = TOP)
	
	
	self.meas_donenobytes = int(ceil(8/8))
	self.meas_doneregAddress = 0x1d
	
	



	def meas_doneEntryClick(event):
		self.meas_doneRead();
	meas_doneBitFieldFrame = Frame(parent)
	meas_doneBitFieldFrame.pack(side = TOP)
	meas_doneLabel = Label(meas_doneBitFieldFrame, text = "meas_done", width = 15)
	meas_doneLabel.pack(side = LEFT)
	self.meas_doneEntry = Entry(meas_doneBitFieldFrame, width = 10)
	self.meas_doneEntry.insert(END, "---")
	self.meas_doneEntry.pack(side = LEFT)
	self.meas_doneEntry.bind('<Button-1>', meas_doneEntryClick)




	
	parent = meas_resultFrame
	meas_resultRegLabel = Label(parent, text = "meas_result")
	meas_resultRegLabel.pack(side = TOP)
	
	
	self.meas_resultnobytes = int(ceil(16/8))
	self.meas_resultregAddress = 0x1e
	
	



	def meas_resultEntryClick(event):
		self.meas_resultRead();
	meas_resultBitFieldFrame = Frame(parent)
	meas_resultBitFieldFrame.pack(side = TOP)
	meas_resultLabel = Label(meas_resultBitFieldFrame, text = "meas_result", width = 15)
	meas_resultLabel.pack(side = LEFT)
	self.meas_resultEntry = Entry(meas_resultBitFieldFrame, width = 10)
	self.meas_resultEntry.insert(END, "---")
	self.meas_resultEntry.pack(side = LEFT)
	self.meas_resultEntry.bind('<Button-1>', meas_resultEntryClick)




	
	parent = smpl_firstFrame
	smpl_firstRegLabel = Label(parent, text = "smpl_first")
	smpl_firstRegLabel.pack(side = TOP)
	
	
	self.smpl_firstnobytes = int(ceil(8/8))
	self.smpl_firstregAddress = 0x20
	
	

   
	smpl_firstBitFieldFrame = Frame(parent)
	smpl_firstBitFieldFrame.pack(side = TOP)
	def smpl_firstSpinboxEventHandler(event=None):
		nobytes = self.smpl_firstnobytes
		valueAsByteArray = []
		value = int(self.smpl_firstSpinbox.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.smpl_firstregAddress,valueAsByteArray)
	smpl_firstLabel = Label(smpl_firstBitFieldFrame, text = "smpl_first", width = 15)
	smpl_firstLabel.pack(padx=5, pady=10, side=LEFT)
	self.smpl_firstSpinbox = Spinbox(smpl_firstBitFieldFrame, width = 8, from_=0, to=pow(2, 8)-1, command = smpl_firstSpinboxEventHandler)
	self.smpl_firstSpinbox.pack(padx=5, pady=10, side=LEFT)
	self.smpl_firstSpinbox.bind('<Return>', smpl_firstSpinboxEventHandler)
     






	
	parent = smpl_lastFrame
	smpl_lastRegLabel = Label(parent, text = "smpl_last")
	smpl_lastRegLabel.pack(side = TOP)
	
	
	self.smpl_lastnobytes = int(ceil(8/8))
	self.smpl_lastregAddress = 0x21
	
	

   
	smpl_lastBitFieldFrame = Frame(parent)
	smpl_lastBitFieldFrame.pack(side = TOP)
	def smpl_lastSpinboxEventHandler(event=None):
		nobytes = self.smpl_lastnobytes
		valueAsByteArray = []
		value = int(self.smpl_lastSpinbox.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.smpl_lastregAddress,valueAsByteArray)
	smpl_lastLabel = Label(smpl_lastBitFieldFrame, text = "smpl_last", width = 15)
	smpl_lastLabel.pack(padx=5, pady=10, side=LEFT)
	self.smpl_lastSpinbox = Spinbox(smpl_lastBitFieldFrame, width = 8, from_=0, to=pow(2, 8)-1, command = smpl_lastSpinboxEventHandler)
	self.smpl_lastSpinbox.pack(padx=5, pady=10, side=LEFT)
	self.smpl_lastSpinbox.bind('<Return>', smpl_lastSpinboxEventHandler)
     






	
	parent = k_factorFrame
	k_factorRegLabel = Label(parent, text = "k_factor")
	k_factorRegLabel.pack(side = TOP)
	
	
	self.k_factornobytes = int(ceil(16/8))
	self.k_factorregAddress = 0x22
	
	

   
	k_factorBitFieldFrame = Frame(parent)
	k_factorBitFieldFrame.pack(side = TOP)
	def k_factorSpinboxEventHandler(event=None):
		nobytes = self.k_factornobytes
		valueAsByteArray = []
		value = int(self.k_factorSpinbox.get())
		for i in range(nobytes):
			valueAsByteArray.append(value % 256)
			value = int(value / 256)
		self.send_write_command(self.k_factorregAddress,valueAsByteArray)
	k_factorLabel = Label(k_factorBitFieldFrame, text = "k_factor", width = 15)
	k_factorLabel.pack(padx=5, pady=10, side=LEFT)
	self.k_factorSpinbox = Spinbox(k_factorBitFieldFrame, width = 8, from_=0, to=pow(2, 16)-1, command = k_factorSpinboxEventHandler)
	self.k_factorSpinbox.pack(padx=5, pady=10, side=LEFT)
	self.k_factorSpinbox.bind('<Return>', k_factorSpinboxEventHandler)
     






	
	parent = ppmFrame
	ppmRegLabel = Label(parent, text = "ppm")
	ppmRegLabel.pack(side = TOP)
	
	
	self.ppmnobytes = int(ceil(16/8))
	self.ppmregAddress = 0x24
	
	



	def ppmEntryClick(event):
		self.ppmRead();
	ppmBitFieldFrame = Frame(parent)
	ppmBitFieldFrame.pack(side = TOP)
	ppmLabel = Label(ppmBitFieldFrame, text = "ppm", width = 15)
	ppmLabel.pack(side = LEFT)
	self.ppmEntry = Entry(ppmBitFieldFrame, width = 10)
	self.ppmEntry.insert(END, "---")
	self.ppmEntry.pack(side = LEFT)
	self.ppmEntry.bind('<Button-1>', ppmEntryClick)






    
	
	
	

   
def ld0_perRead(self):
	nobytes = self.ld0_pernobytes
	self.ld0_perSpinbox.delete(0, END)
	self.ld0_perSpinbox.insert(END, self.send_read_command(self.ld0_perregAddress, nobytes, True))
	





	

   
def duty_cycle_ld0_blueRead(self):
	nobytes = self.duty_cycle_ld0_bluenobytes
	self.duty_cycle_ld0_blueSpinbox.delete(0, END)
	self.duty_cycle_ld0_blueSpinbox.insert(END, self.send_read_command(self.duty_cycle_ld0_blueregAddress, nobytes, True))
	





	

   
def duty_cycle_ld0_greenRead(self):
	nobytes = self.duty_cycle_ld0_greennobytes
	self.duty_cycle_ld0_greenSpinbox.delete(0, END)
	self.duty_cycle_ld0_greenSpinbox.insert(END, self.send_read_command(self.duty_cycle_ld0_greenregAddress, nobytes, True))
	





	

   
def ld4_ctrlRead(self):
	nobytes = self.ld4_ctrlnobytes
	if self.send_read_command(self.ld4_ctrlregAddress, nobytes, True)==0:
    	self.ld4_ctrlCheckButton.deselect()
	else:
    	self.ld4_ctrlCheckButton.select()
	





	

   
def ld5_ctrlRead(self):
	nobytes = self.ld5_ctrlnobytes
	if self.send_read_command(self.ld5_ctrlregAddress, nobytes, True)==0:
    	self.ld5_ctrlCheckButton.deselect()
	else:
    	self.ld5_ctrlCheckButton.select()
	





	

   
def ld6_ctrlRead(self):
	nobytes = self.ld6_ctrlnobytes
	if self.send_read_command(self.ld6_ctrlregAddress, nobytes, True)==0:
    	self.ld6_ctrlCheckButton.deselect()
	else:
    	self.ld6_ctrlCheckButton.select()
	





	

   
def ld7_ctrlRead(self):
	nobytes = self.ld7_ctrlnobytes
	if self.send_read_command(self.ld7_ctrlregAddress, nobytes, True)==0:
    	self.ld7_ctrlCheckButton.deselect()
	else:
    	self.ld7_ctrlCheckButton.select()
	





	

   
def sensor_enRead(self):
	nobytes = self.sensor_ennobytes
	if self.send_read_command(self.sensor_enregAddress, nobytes, True)==0:
    	self.sensor_enCheckButton.deselect()
	else:
    	self.sensor_enCheckButton.select()
	





	

   
def sensor_measRead(self):
	nobytes = self.sensor_measnobytes
	if self.send_read_command(self.sensor_measregAddress, nobytes, True)==0:
    	self.sensor_measCheckButton.deselect()
	else:
    	self.sensor_measCheckButton.select()
	





	

   
def heater_voltageRead(self):
	nobytes = self.heater_voltagenobytes
	self.heater_voltageSpinbox.delete(0, END)
	self.heater_voltageSpinbox.insert(END, self.send_read_command(self.heater_voltageregAddress, nobytes, True))
	





	

   
def rheat_refRead(self):
	nobytes = self.rheat_refnobytes
	self.rheat_refSpinbox.delete(0, END)
	self.rheat_refSpinbox.insert(END, self.send_read_command(self.rheat_refregAddress, nobytes, True))
	





	

   
def rheat_alphaRead(self):
	nobytes = self.rheat_alphanobytes
	self.rheat_alphaSpinbox.delete(0, END)
	self.rheat_alphaSpinbox.insert(END, self.send_read_command(self.rheat_alpharegAddress, nobytes, True))
	





	

   
def adc_input_gainRead(self):
	nobytes = self.adc_input_gainnobytes
	self.adc_input_gainSpinbox.delete(0, END)
	self.adc_input_gainSpinbox.insert(END, self.send_read_command(self.adc_input_gainregAddress, nobytes, True))
	





	

   
def sample_rateRead(self):
	nobytes = self.sample_ratenobytes
	self.sample_rateSpinbox.delete(0, END)
	self.sample_rateSpinbox.insert(END, self.send_read_command(self.sample_rateregAddress, nobytes, True))
	





	

   
def on_cyclesRead(self):
	nobytes = self.on_cyclesnobytes
	self.on_cyclesSpinbox.delete(0, END)
	self.on_cyclesSpinbox.insert(END, self.send_read_command(self.on_cyclesregAddress, nobytes, True))
	





	

   
def off_cyclesRead(self):
	nobytes = self.off_cyclesnobytes
	self.off_cyclesSpinbox.delete(0, END)
	self.off_cyclesSpinbox.insert(END, self.send_read_command(self.off_cyclesregAddress, nobytes, True))
	





	

   
def set_hh_tempRead(self):
	nobytes = self.set_hh_tempnobytes
	self.set_hh_tempSpinbox.delete(0, END)
	self.set_hh_tempSpinbox.insert(END, self.send_read_command(self.set_hh_tempregAddress, nobytes, True))
	





	

   
def wait_cyclesRead(self):
	nobytes = self.wait_cyclesnobytes
	self.wait_cyclesSpinbox.delete(0, END)
	self.wait_cyclesSpinbox.insert(END, self.send_read_command(self.wait_cyclesregAddress, nobytes, True))
	





	

   
def meas_cntRead(self):
	nobytes = self.meas_cntnobytes
	self.meas_cntSpinbox.delete(0, END)
	self.meas_cntSpinbox.insert(END, self.send_read_command(self.meas_cntregAddress, nobytes, True))
	





	

   
def led_ctrlRead(self):
	nobytes = self.led_ctrlnobytes
	self.led_ctrlSpinbox.delete(0, END)
	self.led_ctrlSpinbox.insert(END, self.send_read_command(self.led_ctrlregAddress, nobytes, True))
	





	



def meas_doneRead(self):
	nobytes = self.meas_donenobytes
    self.meas_doneEntry.delete(0, END)
    self.meas_doneEntry.insert(END, self.send_read_command(self.meas_doneregAddress, nobytes, True))



	



def meas_resultRead(self):
	nobytes = self.meas_resultnobytes
    self.meas_resultEntry.delete(0, END)
    self.meas_resultEntry.insert(END, self.send_read_command(self.meas_resultregAddress, nobytes, True))



	

   
def smpl_firstRead(self):
	nobytes = self.smpl_firstnobytes
	self.smpl_firstSpinbox.delete(0, END)
	self.smpl_firstSpinbox.insert(END, self.send_read_command(self.smpl_firstregAddress, nobytes, True))
	





	

   
def smpl_lastRead(self):
	nobytes = self.smpl_lastnobytes
	self.smpl_lastSpinbox.delete(0, END)
	self.smpl_lastSpinbox.insert(END, self.send_read_command(self.smpl_lastregAddress, nobytes, True))
	





	

   
def k_factorRead(self):
	nobytes = self.k_factornobytes
	self.k_factorSpinbox.delete(0, END)
	self.k_factorSpinbox.insert(END, self.send_read_command(self.k_factorregAddress, nobytes, True))
	





	



def ppmRead(self):
	nobytes = self.ppmnobytes
    self.ppmEntry.delete(0, END)
    self.ppmEntry.insert(END, self.send_read_command(self.ppmregAddress, nobytes, True))





  def ReadAll(self):
    
	
	
	
	self.ld0_perRead()


	
	self.duty_cycle_ld0_blueRead()


	
	self.duty_cycle_ld0_greenRead()


	
	self.ld4_ctrlRead()


	
	self.ld5_ctrlRead()


	
	self.ld6_ctrlRead()


	
	self.ld7_ctrlRead()


	
	self.sensor_enRead()


	
	self.sensor_measRead()


	
	self.heater_voltageRead()


	
	self.rheat_refRead()


	
	self.rheat_alphaRead()


	
	self.adc_input_gainRead()


	
	self.sample_rateRead()


	
	self.on_cyclesRead()


	
	self.off_cyclesRead()


	
	self.set_hh_tempRead()


	
	self.wait_cyclesRead()


	
	self.meas_cntRead()


	
	self.led_ctrlRead()


	
	self.meas_doneRead()


	
	self.meas_resultRead()


	
	self.smpl_firstRead()


	
	self.smpl_lastRead()


	
	self.k_factorRead()


	
	self.ppmRead()




    
if __name__=="__main__":
	FormMain()
