package com.emailsend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.Model;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import freemarker.template.Configuration;

@RestController
public class EmailTestController {

	public static String EMAIL_SUBJECT_WALMART = "INSIDE: Your sign-up link for Walmart+ trial";
	private static final String EMAIL_SUBJECT_REPORT = "Report Problem";
	@Value("${spring.mail.username}")
	private String from;
//	private static final String SMTP_AUTH_USER = "achauhan@charterglobal.com";
//    private static final String SMTP_AUTH_PWD  = "Sama@0007";
//    private static final String SMTP_AUTH_USER = "jackmalhotra56@gmail.com";
//    private static final String SMTP_AUTH_PWD  = "qtowubbnqnxgcawh";

	@Autowired
	private JavaMailSender emailSender;

	@Autowired
	Configuration fmConfiguration;
	private static Session session;

	
	@SuppressWarnings("resource")
	@GetMapping("tesingXLSV")
	public void tesingXLSV(@RequestParam("email") String email, Model model10)
			throws IOException, InterruptedException {

		try {

			FileInputStream file = new FileInputStream(new File("C:\\Users\\achauhan\\Desktop\\ticket.xlsx"));

			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int count = 1;
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();

				// For each row, iterate through each columns
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {

					Cell cell = cellIterator.next();
					String errorRecord = cell.getStringCellValue();
					model10.addAttribute("webContent", errorRecord);
					sendEmail(session, email, EMAIL_SUBJECT_REPORT, getUrgentEmailContentFromTemplate(model10));
					System.out.println("Email Sent : " + count);
					count++;
				}
				
			}
			file.close();
			System.out.println("*********** All Mail Sent *******************");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String sendEmail(Session session, String toEmail, String subject, String body) {

		try {
			// Authenticator auth = new SMTPAuthenticator();
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp-mail.outlook.com");
			props.put("mail.smtp.port", "25");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			session = Session.getDefaultInstance(props);
			InternetAddress[] address = { new InternetAddress(toEmail) };

			MimeMessage mimeMessage = new MimeMessage(session);
			BodyPart messageBodyPart = new MimeBodyPart();
			Multipart multipart = new MimeMultipart();

			mimeMessage.addHeader("Content-type", "text/HTML; charset=UTF-8");
			mimeMessage.addHeader("format", "flowed");
			mimeMessage.addHeader("Content-Transfer-Encoding", "8bit");
			mimeMessage.setFrom(from);
			mimeMessage.setRecipients(Message.RecipientType.TO, address);
			mimeMessage.setReplyTo(InternetAddress.parse("noreply@allconnect.com", false));
			mimeMessage.setSubject(subject);
			mimeMessage.setSentDate(new Date());
			messageBodyPart.setContent(Utils.escapeSpecialCharacters(body), "text/HTML");
			multipart.addBodyPart(messageBodyPart);
			mimeMessage.setContent(multipart);

			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
			mimeMessageHelper.setText("", body);

			emailSender.send(mimeMessageHelper.getMimeMessage());

		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return "Mail Sent Sucessfull";
	}

	public String getUrgentEmailContentFromTemplate(Model model10) {
		StringBuffer content = new StringBuffer();
		try {
			content.append(FreeMarkerTemplateUtils
					.processTemplateIntoString(fmConfiguration.getTemplate("Urgent_Email.ftl"), model10));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return content.toString();
	}
	
	/*
	 * private class SMTPAuthenticator extends javax.mail.Authenticator {
	 * 
	 * public PasswordAuthentication getPasswordAuthentication() { String username =
	 * SMTP_AUTH_USER; String password = SMTP_AUTH_PWD; return new
	 * PasswordAuthentication(username, password); } }
	 */

}
