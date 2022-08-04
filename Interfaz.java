package Final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField txtMensaje;
	private JTextField txtInd2;
	private JTextField txtInf1;
	private JTextField txtInd1;
	private JTextField txtNUM1;
	private JTextField txtACK1;
	private JTextField txtLPT1;
	private JTextField txtPPT1;
	private JTextField txtDAT1;
	private JTextField txtCTR1;
	private JTextField txtENQ1;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 786, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("Transmisor");
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl1.setBounds(10, 11, 76, 14);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Mensaje a transmitir: ");
		lbl2.setBounds(10, 30, 161, 14);
		contentPane.add(lbl2);
		
		txtMensaje = new JTextField();
		txtMensaje.setBounds(139, 27, 169, 20);
		contentPane.add(txtMensaje);
		txtMensaje.setColumns(10);
		
		JLabel lbl3 = new JLabel("N\u00FAmero de frames: ");
		lbl3.setBounds(437, 30, 137, 14);
		contentPane.add(lbl3);
		
		JSpinner numFrames = new JSpinner();
		numFrames.setBounds(569, 27, 43, 20);
		contentPane.add(numFrames);
		
		JLabel lbl4 = new JLabel("Secuencia de trama:");
		lbl4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl4.setBounds(622, 30, 122, 14);
		contentPane.add(lbl4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(624, 58, 120, 270);
		contentPane.add(scrollPane);
		
		JTextPane textProceso = new JTextPane();
		scrollPane.setViewportView(textProceso);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(20, 71, 518, 27);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new BoxLayout(layeredPane, BoxLayout.X_AXIS));
		
		txtInd1 = new JTextField();
		layeredPane.add(txtInd1);
		txtInd1.setColumns(10);
		
		txtACK1 = new JTextField();
		layeredPane.add(txtACK1);
		txtACK1.setColumns(4);
		
		txtENQ1 = new JTextField();
		layeredPane.add(txtENQ1);
		txtENQ1.setColumns(4);
		
		txtCTR1 = new JTextField();
		layeredPane.add(txtCTR1);
		txtCTR1.setColumns(4);
		
		txtDAT1 = new JTextField();
		layeredPane.add(txtDAT1);
		txtDAT1.setColumns(4);
		
		txtPPT1 = new JTextField();
		layeredPane.add(txtPPT1);
		txtPPT1.setColumns(4);
		
		txtLPT1 = new JTextField();
		layeredPane.add(txtLPT1);
		txtLPT1.setColumns(4);
		
		txtNUM1 = new JTextField();
		layeredPane.add(txtNUM1);
		txtNUM1.setColumns(4);
		
		txtInf1 = new JTextField();
		layeredPane.add(txtInf1);
		txtInf1.setColumns(10);
		
		txtInd2 = new JTextField();
		layeredPane.add(txtInd2);
		txtInd2.setColumns(10);
		
		JCheckBox chbxACK = new JCheckBox("");
		chbxACK.setBounds(113, 104, 21, 23);
		contentPane.add(chbxACK);
		
		JCheckBox chbxENQ = new JCheckBox("");
		chbxENQ.setBounds(150, 104, 21, 23);
		contentPane.add(chbxENQ);
		
		JCheckBox chbxCTR = new JCheckBox("");
		chbxCTR.setBounds(187, 104, 21, 23);
		contentPane.add(chbxCTR);
		
		JCheckBox chbxDAT = new JCheckBox("");
		chbxDAT.setBounds(223, 104, 21, 23);
		contentPane.add(chbxDAT);
		
		JCheckBox chbxPPT = new JCheckBox("");
		chbxPPT.setBounds(260, 104, 21, 23);
		contentPane.add(chbxPPT);
		
		JCheckBox chbxLPT = new JCheckBox("");
		chbxLPT.setBounds(297, 104, 21, 23);
		contentPane.add(chbxLPT);
		
		JLabel lbl5 = new JLabel("Indicador");
		lbl5.setBounds(40, 55, 74, 14);
		contentPane.add(lbl5);
		
		JLabel lbl6 = new JLabel("ACK");
		lbl6.setBounds(113, 55, 46, 14);
		contentPane.add(lbl6);
		
		JLabel lbl7 = new JLabel("ENQ");
		lbl7.setBounds(150, 55, 46, 14);
		contentPane.add(lbl7);
		
		JLabel lbl8 = new JLabel("CTR");
		lbl8.setBounds(187, 55, 46, 14);
		contentPane.add(lbl8);
		
		JLabel lbl9 = new JLabel("DAT");
		lbl9.setBounds(224, 55, 46, 14);
		contentPane.add(lbl9);
		
		JLabel lbl10 = new JLabel("PPT");
		lbl10.setBounds(262, 55, 46, 14);
		contentPane.add(lbl10);
		
		JLabel lbl11 = new JLabel("LPT");
		lbl11.setBounds(297, 55, 46, 14);
		contentPane.add(lbl11);
		
		JLabel lbl12 = new JLabel("NUM");
		lbl12.setBounds(329, 55, 46, 14);
		contentPane.add(lbl12);
		
		JLabel lbl13 = new JLabel("Informaci\u00F3n");
		lbl13.setBounds(371, 55, 76, 14);
		contentPane.add(lbl13);
		
		JLabel lbl14 = new JLabel("Indicador");
		lbl14.setBounds(468, 55, 70, 14);
		contentPane.add(lbl14);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(450, 104, 89, 23);
		contentPane.add(btnEnviar);
		
		JLabel lbl15 = new JLabel("Sem\u00E1ntica: trama de datos");
		lbl15.setBounds(123, 134, 188, 14);
		contentPane.add(lbl15);
		
		JLabel lbl16 = new JLabel("Receptor");
		lbl16.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl16.setBounds(10, 158, 76, 14);
		contentPane.add(lbl16);
		
		JLabel lbl17 = new JLabel("Trama recibida:");
		lbl17.setBounds(10, 178, 188, 14);
		contentPane.add(lbl17);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(20, 203, 317, 27);
		contentPane.add(layeredPane_1);
		layeredPane_1.setLayout(new BoxLayout(layeredPane_1, BoxLayout.X_AXIS));
		
		textField_13 = new JTextField();
		layeredPane_1.add(textField_13);
		textField_13.setColumns(10);
		
		textField_12 = new JTextField();
		layeredPane_1.add(textField_12);
		textField_12.setColumns(10);
		
		textField_11 = new JTextField();
		layeredPane_1.add(textField_11);
		textField_11.setColumns(10);
		
		textField_10 = new JTextField();
		layeredPane_1.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblHeader = new JLabel("Header");
		lblHeader.setBounds(60, 234, 74, 14);
		contentPane.add(lblHeader);
		
		JLabel lblInformacin = new JLabel("Informaci\u00F3n");
		lblInformacin.setBounds(187, 234, 74, 14);
		contentPane.add(lblInformacin);
		
		JLabel lblTrailer = new JLabel("Trailer");
		lblTrailer.setBounds(269, 234, 74, 14);
		contentPane.add(lblTrailer);
		
		JLabel lblNewLabel_7 = new JLabel("Indicador");
		lblNewLabel_7.setBounds(40, 284, 74, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_1_1 = new JLabel("ACK");
		lblNewLabel_1_1.setBounds(113, 284, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("ENQ");
		lblNewLabel_2_1.setBounds(150, 284, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("CTR");
		lblNewLabel_3_1.setBounds(187, 284, 46, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("DAT");
		lblNewLabel_4_1.setBounds(224, 284, 46, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_4 = new JLabel("PPT");
		lblNewLabel_5_4.setBounds(262, 284, 46, 14);
		contentPane.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("LPT");
		lblNewLabel_5_1_1.setBounds(297, 284, 46, 14);
		contentPane.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("NUM");
		lblNewLabel_5_2_1.setBounds(329, 284, 46, 14);
		contentPane.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_5_3_1 = new JLabel("Informaci\u00F3n");
		lblNewLabel_5_3_1.setBounds(371, 284, 76, 14);
		contentPane.add(lblNewLabel_5_3_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Indicador");
		lblNewLabel_6_1.setBounds(468, 284, 70, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(20, 299, 518, 27);
		contentPane.add(layeredPane_2);
		layeredPane_2.setLayout(new BoxLayout(layeredPane_2, BoxLayout.X_AXIS));
		
		textField_17 = new JTextField();
		layeredPane_2.add(textField_17);
		textField_17.setColumns(10);
		
		textField_22 = new JTextField();
		layeredPane_2.add(textField_22);
		textField_22.setColumns(4);
		
		textField_23 = new JTextField();
		layeredPane_2.add(textField_23);
		textField_23.setColumns(4);
		
		textField_21 = new JTextField();
		layeredPane_2.add(textField_21);
		textField_21.setColumns(4);
		
		textField_20 = new JTextField();
		layeredPane_2.add(textField_20);
		textField_20.setColumns(4);
		
		textField_19 = new JTextField();
		layeredPane_2.add(textField_19);
		textField_19.setColumns(4);
		
		textField_18 = new JTextField();
		layeredPane_2.add(textField_18);
		textField_18.setColumns(4);
		
		textField_16 = new JTextField();
		layeredPane_2.add(textField_16);
		textField_16.setColumns(4);
		
		textField_15 = new JTextField();
		layeredPane_2.add(textField_15);
		textField_15.setColumns(10);
		
		textField_14 = new JTextField();
		layeredPane_2.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblSemnticaTramaDe_2 = new JLabel("Sem\u00E1ntica: trama de control, trama recibida con \u00E9xito");
		lblSemnticaTramaDe_2.setBounds(123, 333, 309, 14);
		contentPane.add(lblSemnticaTramaDe_2);
		
		JLabel lblMensajeARecibido = new JLabel("Mensaje a recibido: ");
		lblMensajeARecibido.setBounds(10, 365, 124, 14);
		contentPane.add(lblMensajeARecibido);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(139, 362, 169, 20);
		contentPane.add(textField_24);
		
		JLabel lblRespuesta = new JLabel("Respuesta:");
		lblRespuesta.setBounds(10, 259, 188, 14);
		contentPane.add(lblRespuesta);
		
		JButton btnResponder = new JButton("Responder");
		btnResponder.setBounds(449, 340, 89, 23);
		contentPane.add(btnResponder);
	}
}
