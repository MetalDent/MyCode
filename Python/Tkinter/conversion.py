from tkinter import *
from tkinter import ttk

def calculate_meters(*args):
    try:
        value = float(feet.get())
        meters.set((0.3048 * value * 10000.0 + 0.5)/10000.0)
    except ValueError:
        pass

def calculate_feet(*args):
    try:
        value = float(meters.get())
        feet.set(3.28084 * value)
    except ValueError:
        pass

root = Tk()

mainframe = ttk.Frame(root, padding="3 3 12 12")
mainframe.grid(column=0, row=0, sticky=(N, W, E, S))
root.columnconfigure(0, weight=1)
root.rowconfigure(0, weight=1)

feet = StringVar()
meters = StringVar()

n = input("Choose option: \n1. Feet to Meter \n2. Meter to Feet \n")

if n == 1:
	root.title("Feet to Meters")

	feet_entry = ttk.Entry(mainframe, width=7, textvariable=feet)
	feet_entry.grid(column=2, row=1, sticky=(W, E))

	ttk.Label(mainframe, textvariable=meters).grid(column=2, row=2, sticky=(W, E))
	ttk.Button(mainframe, text="Calculate", command=calculate_meters).grid(column=3, row=3, sticky=W)

	ttk.Label(mainframe, text="feet").grid(column=3, row=1, sticky=W)
	ttk.Label(mainframe, text="is equivalent to").grid(column=1, row=2, sticky=E)
	ttk.Label(mainframe, text="meters").grid(column=3, row=2, sticky=W)

	for child in mainframe.winfo_children(): child.grid_configure(padx=5, pady=5)

	feet_entry.focus()
	root.bind('<Return>', calculate_meters)

	root.mainloop()

if n == 2:
	root.title("Meters to Feet")
	
	meters_entry = ttk.Entry(mainframe, width=7, textvariable=meters)
	meters_entry.grid(column=2, row=1, sticky=(W, E))

	ttk.Label(mainframe, textvariable=feet).grid(column=2, row=2, sticky=(W, E))
	ttk.Button(mainframe, text="Calculate", command=calculate_feet).grid(column=3, row=3, sticky=W)

	ttk.Label(mainframe, text="meters").grid(column=3, row=1, sticky=W)
	ttk.Label(mainframe, text="is equivalent to").grid(column=1, row=2, sticky=E)
	ttk.Label(mainframe, text="feet").grid(column=3, row=2, sticky=W)

	for child in mainframe.winfo_children(): child.grid_configure(padx=5, pady=5)

	meters_entry.focus()
	root.bind('<Return>', calculate_feet)

	root.mainloop()
