import smtplib
import sqlite3

from email.mime.text import MIMEText

conn = sqlite3.connect('recipients.db')
cursor = conn.cursor()


msg = MIMEText("""Hello""")
s = smtplib.SMTP('Smtp.gmail.com')	#smtp of gmail
s.starttls()
s.login('username','password')	#login credentials
sender = 'priyapandya274@gmail.com'	#sender email
recipients = cursor.execute("select * from sheet1;")	#recepients from database
msg['Subject'] = "Test"	#subject
msg['From'] = sender	#from
msg['To'] = ", ".join(recipients)	#to
s.sendmail(sender, recipients, msg.as_string())
s.quit()