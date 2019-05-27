import smtplib
from email.mime.text import MIMEText

msg = MIMEText("""Hello""")
s = smtplib.SMTP('Smtp.gmail.com')
s.starttls()
s.login('username','password')
sender = 'priyapandya274@gmail.com'
recipients = ['email1', 'email2']
msg['Subject'] = "Test"
msg['From'] = sender
msg['To'] = ", ".join(recipients)
s.sendmail(sender, recipients, msg.as_string())
s.quit()