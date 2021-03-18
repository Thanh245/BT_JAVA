package ThietKeGiaoDien;

public class TextAreaDemo extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TextAreaDemo(){
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTextArea jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        //jTextArea1.setColumns(20); set số cột mặc định, nếu lớn hơn chiều rộng thì thanh cuộn ngang sẽ xuất hiện mặc dù không có text
        jTextArea1.setLineWrap(true); //thiết lập tự động xuống dòng => Thanh cuộn ngang sẽ không bao giờ xuất hiện nhưng từ bị ngắt.
        //jTextArea1.setRows(5); set số dòng mặc định, nếu hơn chiều cao thì thanh cuộn dọc sẽ xuất hiện mặc dù không có text
        jTextArea1.setWrapStyleWord(true);//thiết lập khi hết dòng sẽ ngắt từ, không phải ngắt ký tự như chỉ dùng setLineWrap(true);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 100, 100);
        setSize(500, 400);
    }

    public static void main(String a[]){
        new TextAreaDemo().setVisible(true);
    }
}