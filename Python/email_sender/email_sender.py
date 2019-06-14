import smtplib
import json

from email.mime.text import MIMEText

msg = MIMEText("""Hello""")
s = smtplib.SMTP('Smtp.gmail.com')	#smtp of gmail
s.starttls()
s.login('username','password')	#login credentials
sender = 'priyapandya274@gmail.com'	#sender email
recipients = []	#recepients from database

with open('recipients.txt', 'r') as filehandle:	#get recipients from the text file
    recipients = json.load(filehandle)

msg['Subject'] = "Test"	#subject
msg['From'] = sender	#from
msg['To'] = ", ".join(recipients)	#to
s.sendmail(sender, recipients, msg.as_string())
s.quit()