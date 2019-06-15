import smtplib
import json

from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart
from email.mime.base import MIMEBase
from email import encoders
import os.path

msg = MIMEText("""Hello""")
s = smtplib.SMTP('Smtp.gmail.com')	#smtp of gmail
s.starttls()
s.login('username','password')	#login credentials
sender = 'priyapandya274@gmail.com'	#sender email
recipients = []	#recepients from database

file_location = '/media/metaldent/Study_Coding/Programming/MyCode/Python/websraping/image.jpg'


with open('recipients.txt', 'r') as filehandle:	#get recipients from the text file
    recipients = json.load(filehandle)

msg['Subject'] = "Test"	#subject
msg['From'] = sender	#from
msg['To'] = ", ".join(recipients)	#to

msg.attach(MIMEText(msg, 'plain'))

# Setup the attachment
filename = os.path.basename(file_location)
attachment = open(file_location, "rb")
part = MIMEBase('application', 'octet-stream')
part.set_payload(attachment.read())
encoders.encode_base64(part)
part.add_header('Content-Disposition', "attachment; filename= %s" % filename)

# Attach the attachment to the MIMEMultipart object
msg.attach(part)

s.sendmail(sender, recipients, msg.as_string())
s.quit()