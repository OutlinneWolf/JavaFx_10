package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import application.Utils;


/*	VALIDA��O DE DADOS
 * 		Nesta atividade vamos usar a scene criada no exerc�cio 8 para, na regi�o central,
 * 		criar textFields a ser preenchidos por texto, numeros e email e onde a a��o de um bot�o
 * 		ir� validar os dados a� inseridos, atrav�s de m�todos da classe global Utils.
 * 
 * 		Passo1: Copiar a classe main do exerc�cio anterior 8 
 * 		Passo2: Criar os Gr�ficos:
 * 			- criar um set de layouts que permita dispor as seguintes labels e respetivos textfields
 * 			- N�mero Fiscal, Nome, Morada, Cidade, CPostal, Data de nascimento
 * 		Passo3: Criar 2 bot�es: Validar e Cancelar (fecha programa)
 * 		Passo4: Em Share Repository, construir as valida��es: 
 * 				Partilhar este projeto e o Utils. Formar grupos e 2.
 * 				Todos os erros de valida��o devem ser comunicados via alertBox da Utils.
 */

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	
	@Override
	public void start(Stage primaryStage) {
		try {
			// topLayout
			HBox layoutTop = new HBox(20);									// Prepara��o da HBox para a regi�o topo do BorderPane									
			layoutTop.setBackground(null);
			layoutTop.setPadding(new Insets(15, 12, 15, 12));				// Espa�os para a regi�o topo
			layoutTop.setSpacing(10);										// Espa�os entre os elementos
			layoutTop.setStyle("-fx-background-color: #336699;");			// estilo com cor de fundo

			Button btnTopMenu1 = new Button("File");						// 3 bot�es para simular um menu
			Button btnTopMenu2 = new Button("Edit");
			Button btnTopMenu3 = new Button("View");
			layoutTop.getChildren().addAll(btnTopMenu1,btnTopMenu2,btnTopMenu3);

			
			//leftLayout- Menu
			VBox layoutLeft = new VBox(20);									// Prepara��o da VBox para a regi�o esq do BorderPane
			layoutLeft.setBackground(null);
			layoutLeft.setPadding(new Insets(15, 12, 15, 12));				// Espa�os para os limites
			layoutLeft.setSpacing(10);										// espa�os entre as c�lulas
			layoutLeft.setStyle("-fx-background-color: #336699;");			// Cor de fundo

			Button btnLeftMenu1 = new Button("op��o1");						// 3 bot�es para simular uma lista
			Button btnLeftMenu2 = new Button("op��o2");
			Button btnLeftMenu3 = new Button("op��o3");
			layoutLeft.getChildren().addAll(btnLeftMenu1,btnLeftMenu2,btnLeftMenu3);
			
			
			
			//centerLayout- Formul�rio para valida��o de dados ---------------------------------------------
			GridPane layoutCenter = new GridPane();					// layout para a regi�o central
			layoutCenter.setPadding(new Insets(10, 10, 10, 10)); 	// espa�os para a janela
			layoutCenter.setVgap(8);								// espa�o entre colunas (pixeis)
			layoutCenter.setHgap(10);								// espa�o entre linhas	
			
			// N�mero fiscal
			Label labelNFiscal = new Label("n� fiscal:");			// Nova Label
			layoutCenter.add(labelNFiscal, 0, 0);					// c�lula col 0,linha 0
			TextField txtNFiscal = new TextField();					// Campo de texto vazio
			layoutCenter.add(txtNFiscal, 1, 0);						// c�lula: col 1, linha 0
			
			// Nome
			Label labelName = new Label("Nome:");					// Nova Label
			layoutCenter.add(labelName, 0, 1);						// c�lula col 0,linha 0
			TextField txtNome = new TextField();					// Campo de texto vazio
			layoutCenter.add(txtNome, 1, 1);						// c�lula: col 1, linha 0
			
			// Morada
			Label labelMorada = new Label("Morada:");				// Nova Label
			layoutCenter.add(labelMorada, 0, 2);					// c�lula col 0, linha 1
			TextField txtMorada = new TextField();					// Campo de texto vazio
			layoutCenter.add(txtMorada, 1, 2);						// c�lula coluna 1, linha 1

			// Cidade
			Label labelCidade = new Label("Cidade:");				// Nova Label
			layoutCenter.add(labelCidade, 0, 3);					// c�lula col 0, linha 2
			TextField txtCidade = new TextField();					// Campo de texto vazio
			layoutCenter.add(txtCidade, 1, 3);						// c�lula coluna 1, linha 2

			// C�digo postal num�rico
			Label labelCpostal = new Label("Cpostal:");				// Nova Label
			layoutCenter.add(labelCpostal, 0, 4);					// c�lula col 0, linha 3
			TextField txtCpostal = new TextField();					// Campo de texto vazio
			layoutCenter.add(txtCpostal, 1, 4);						// c�lula coluna 1, linha 3

			// Mail
			Label labelMail = new Label("Mail:");					// Nova Label
			layoutCenter.add(labelMail, 0, 5);						// c�lula col 0, linha 4
			TextField txtMail = new TextField();					// Campo de texto vazio
			layoutCenter.add(txtMail, 1, 5);						// c�lula coluna 1, linha 4
			
			// Data Nascimento
			Label labelDataNascimento = new Label("DataNascimento:");	// Nova Label
			layoutCenter.add(labelDataNascimento, 0, 6);				// c�lula col 0, linha 5
			TextField txtDataNascimento = new TextField();				// Campo de texto vazio
			layoutCenter.add(txtDataNascimento, 1, 6);					// c�lula coluna 1, linha 5

			// Bot�o Login
			Button btnLogin = new Button("Valida");
			btnLogin.setOnAction(e -> {								// Ac��es do bot�o:
				
				// se o texto do campo XPTO n�o for string
				// => Utils.alertBox("ERRO","Campo XPTO s� aceita.....")
					
				Utils.alertBox("A Fazer", "Valida��o de campos...");

			});
			layoutCenter.add(btnLogin,  1, 7);					// Bot�o Adicionado � coluna 1, linha 6	 

			
			
			
			
			
			//--------------------------------------------------------
			BorderPane layoutRoot = new BorderPane();						// Prepara��o do rootLayout BorderPane	
			layoutRoot.setTop(layoutTop);									// Associar os subLayouts �s regi�es do BorderPane
			layoutRoot.setLeft(layoutLeft);
			layoutRoot.setCenter(layoutCenter);
			
			Scene scene = new Scene(layoutRoot,600,400);					// Associar o rootLayout � Scene
			primaryStage.setScene(scene);									// Associar a Scene � Stage
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
