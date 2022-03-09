
INSERT INTO `ex_email_category` (`id`, `ex_create_date`, `ex_is_active`, `ex_is_delete`, `ex_update_date`, `types`) VALUES
	(1, NULL, 1, 0, NULL, 'Transaction Acknowledgement'),
	(2, NULL, 1, 0, NULL, 'Resetting / Forgot a user’s password'),
	(3, NULL, 1, 0, NULL, 'Course Evaluation'),
	(4, NULL, 1, 0, NULL, 'QP setter');


INSERT INTO `ex_email_templates` (`id`, `email_body`, `ex_create_date`, `ex_is_active`, `ex_is_delete`, `ex_update_date`, `subject`, `email_category_id`) VALUES
	(1, 'Dear Student_Name,<br>\r\nThank you for registering<br>\r\nWe have received your   Payment_status payment that you submitted on (date). <br>\r\nThe payment has been authorized and approved.<br>\r\nPlease find below acknowledgement for the transaction. (Attachment of Transaction Report.)<br>\r\nIf you have any comments or questions. Please don’t hesitate to reach us at (support@winfoware.com)<br>\r\n\r\n\r\nThanks,\r\nExam360', NULL, 1, 0, NULL, 'Transaction Acknowledgement', 1),
	(2, 'Dear Student_Name ,\r\n<br>\r\nForgot your Password? . Your Password is RandomPassword.\r\n<br>\r\nThanks<br>\r\nExam 360.', NULL, 1, 0, NULL, 'Resetting / Forgot a user’s password', 2),
	(3, 'Dear Name,<br>', NULL, 1, 0, NULL, 'Course Evaluation', 3),
	(4, 'Dear Name,<br>\r\n\r\nI have the honor by direction to inform you that you are appointed as Question Paper Setter for the <b> Course </b>.<br>\r\nIn anticipation to your acceptance, I am enclosing herewith the following materials for necessary action at your end. <br>\r\nI request you to kindly send us the question paper as per the instructions given below by registered post so as to reach me on or before ___(date).\r\n<br>\r\nYours faithfully,<br>\r\nExam360\r\n', NULL, 1, 0, NULL, 'QP setter ', 4);

INSERT INTO `ex_letter_grade_settings` (`id`, `ex_description`, `ex_letter_grade`, `ex_max_range_marks`, `ex_min_range_marks`, `ex_point_grade`) VALUES
	(1, 'Outstanding', 'O', 100, 90, 10),
	(2, 'VeryGood', 'A', 89, 80, 9),
	(3, 'Good', 'B', 79, 70, 8),
	(4, 'Fair', 'C', 69, 60, 7),
	(5, 'Average', 'D', 59, 50, 6),
	(6, 'Pass', 'P', 49, 40, 5),
	(7, 'Fail', 'F', 39, 0, 0);

INSERT INTO `ex_marks_settings` (`id`, `ex_max_marks`, `ex_name`, `ex_weightage`) VALUES
	(1, 5, 'Attendance', 5),
	(2, 10, 'Quiz', 10),
	(3, 5, 'Assignment', 5),
	(4, 50, 'MidTerm', 20),
	(5, 100, 'EndTerm', 60);
/
INSERT INTO `ex_month_name` (`id`, `ex_name`, `month_id`) VALUES
	(1, 'January', 1),
	(2, 'February', 2),
	(3, 'March', 3),
	(4, 'April', 4),
	(5, 'May', 5),
	(6, 'June', 6),
	(7, 'July', 7),
	(8, 'August', 8),
	(9, 'September', 9),
	(10, 'October', 10),
	(11, 'November', 11),
	(12, 'December', 12);

INSERT INTO `ex_settings` (`id`, `ex_key_name`, `ex_key_value`, `ex_visible`) VALUES
	(1, 'SERVER_IP', 'http://14.139.249.83/niftem', '1'),
	(2, 'DOCUMENT_PATH', 'E:\\\\home\\\\exam360\\\\', '1'),
	(3, 'IMAGE_PATH', 'images/logo.png', '1'),
	(4, 'RESPONSE_URL', 'http://localhost:8080/Niftem/api/payment/paymentResponse', '1'),
	(5, 'WEB_REDIRECT_URL', 'http://14.139.249.83/students/payredirect', '1'),
	(6, 'SEND_EMAIL', '1', '1');

INSERT INTO `ex_week_days` (`id`, `ex_name`) VALUES
	(1, 'Monday'),
	(2, 'Tuesday'),
	(3, 'Wednesday'),
	(4, 'Thursday'),
	(5, 'Friday');
	
	INSERT INTO `ex_approve_type` (`id`, `ex_name`) VALUES
	(1, 'MESS (VENDOR) '),
	(2, 'LIBRARY'),
	(3, 'MENTOR'),
	(4, 'WARDEN(RELATED TO FINE ETC.) '),
	(5, 'SPORT SECTION(IN CHARGE WARDEN-BH)'),
	(6, 'MEDICAL CENTRE'),
	(7, 'COMPUTER LAB'),
	(8, 'IT DEPARTMENT(AR-IT)'),
	(9, 'DEAN(STUDENT WELFARE) '),
	(10, 'CORPORATE RESOURCE DIVISION'),
	(11, 'ACCOUNTS(AO / DCF)'),
	(12, 'EXAMINATION DEPARTMENT(CONTROLLER OF EXAMINATION)'),
	(13, 'DEPARTMENTAL CLEARANCE ');


INSERT INTO `ex_document_type` (`id`, `exdocument_type`) VALUES
              (1, 'Provissional seat allotment letter for the particular  round which the provisional admission is going on'),
              (2, 'JoSAA website duly Signed by the Candidate'),
              (3, 'JEE(Main) Admit Card and Score sheet'),
              (4, 'Class(xii) Mark Sheet And Certificate *'),
              (5, 'Class(x) Mark Sheet and Certificate( As a Proof of DoB)*'),
              (6, 'Adhar Card/ Pan Card*'),
              (7, 'Valid PassPort(In Case of Candidate Qualifying from Different Country)'),
              (8, 'OCI/PIO Card'),
              (9, 'Proof of Examination Center(In case of candidates having National Open School Certificates)'),
              (10, 'Proof of Category*'),
              (11, 'Certificate for KM(if applicable)'),
              (12, 'Medical Certificate of handicap for physically handicapped candidates(PWD)'),
              (13, 'Migration Certificate/Transfer Certificate *'),
              (14, 'Other Documents');

