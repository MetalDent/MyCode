import smtplib
import json
import getpass

from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart
from email.mime.base import MIMEBase
from email import encoders
import os.path

s = smtplib.SMTP('Smtp.gmail.com')	#smtp of gmail
s.starttls()

password = getpass.getpass(prompt='Password: ', stream=None)	#password
sender = 'priyapandya274@gmail.com'	#sender email
s.login(sender, password)	#login 

recipients = []	#recipients from database
with open('recipients.txt', 'r') as filehandle:	#get recipients from the text file
    recipients = json.load(filehandle)

msg = MIMEMultipart()
msg = MIMEText("""Hello""")
msg['Subject'] = "Test"	#subject
msg['From'] = sender	#from
msg['To'] = ", ".join(recipients)	#to

file_location = '/path/to/file'	#path of the attached file

#Setup the attachment
filename = os.path.basename(file_location)
attachment = open(file_location, "rb")
part = MIMEBase('application', 'octet-stream')
part.set_payload(attachment.read())
encoders.encode_base64(part)
part.add_header('Content-Disposition', "attachment; filename= %s" % filename)

msg.attach(part)	#Attach the attachment to the MIMEMultipart object

s.sendmail(sender, recipients, msg.as_string())
s.quit()
