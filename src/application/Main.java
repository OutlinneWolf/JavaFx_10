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


/*	VALIDAÇÃO DE DADOS
 * 		Nesta atividade vamos usar a scene criada no exercício 8 para, na região central,
 * 		criar textFields a ser preenchidos por texto, numeros e email e onde a ação de um botão
 * 		irá validar os dados aí inseridos, através de métodos da classe global Utils.
 * 
 * 		Passo1: Copiar a classe main do exercício anterior 8 
 * 		Passo2: Criar os Gráficos:
 * 			- criar um set de layouts que permita dispor as seguintes labels e respetivos textfields
 * 			- Número Fiscal, Nome, Morada, Cidade, CPostal, Data de nascimento
 * 		Passo3: Criar 2 botões: Validar e Cancelar (fecha programa)
 * 		Passo4: Em Share Repository, construir as validações: 
 * 				Partilhar este projeto e o Utils. Formar grupos e 2.
 * 				Todos os erros de validação devem ser comunicados via alertBox da Utils.
 */

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	
	@Override
	public void start(Stage primaryStage) {
		try {
			// topLayout
			HBox layoutTop = new HBox(20);									// Preparação da HBox para a região topo do BorderPane									
			layoutTop.setBackground(null);
			layoutTop.setPadding(new Insets(15, 12, 15, 12));				// Espaços para a região topo
			layoutTop.setSpacing(10);										// Espaços entre os elementos
			layoutTop.setStyle("-fx-background-color: #336699;");			// estilo com cor de fundo

			Button btnTopMenu1 = new Button("File");						// 3 botões para simular um menu
			Button btnTopMenu2 = new Button("Edit");
			Button btnTopMenu3 = new Button("View");
			layoutTop.getChildren().addAll(btnTopMenu1,btnTopMenu2,btnTopMenu3);

			
			//leftLayout- Menu
			VBox layoutLeft = new VBox(20);									// Preparação da VBox para a região esq do BorderPane
			layoutLeft.setBackground(null);
			layoutLeft.setPadding(new Insets(15, 12, 15, 12));				// Espaços para os limites
			layoutLeft.setSpacing(10);										// espaços entre as células
			layoutLeft.setStyle("-fx-background-color: #336699;");			// Cor de fundo

			Button btnLeftMenu1 = new Button("opção1");						// 3 botões para simular uma lista
			Button btnLeftMenu2 = new Button("opção2");
			Button btnLeftMenu3 = new Button("opção3");
			layoutLeft.getChildren().addAll(btnLeftMenu1,btnLeftMenu2,btnLeftMenu3);
			
			
			
			//centerLayout- Formulário para validação de dados ---------------------------------------------
			GridPane layoutCenter = new GridPane();					// layout para a região central
			layoutCenter.setPadding(new Insets(10, 10, 10, 10)); 	// espaços para a janela
			layoutCenter.setVgap(8);								// espaço entre colunas (pixeis)
			layoutCenter.setHgap(10);								// espaço entre linhas	
			
			// Número fiscal
			Label labelNFiscal = new Label("nº fiscal:");			// Nova Label
			layoutCenter.add(labelNFiscal, 0, 0);					// célula col 0,linha 0
			TextField txtNFiscal = new TextField();					// Campo de texto vazio
			layoutCenter.add(txtNFiscal, 1, 0);						// célula: col 1, linha 0
			
			// Nome
			Label labelName = new Label("Nome:");					// Nova Label
			layoutCenter.add(labelName, 0, 1);						// célula col 0,linha 0
			TextField txtNome = new TextField();					// Campo de texto vazio
			layoutCenter.add(txtNome, 1, 1);						// célula: col 1, linha 0
			
			// Morada
			Label labelMorada = new Label("Morada:");				// Nova Label
			layoutCenter.add(labelMorada, 0, 2);					// célula col 0, linha 1
			TextField txtMorada = new TextField();					// Campo de texto vazio
			layoutCenter.add(txtMorada, 1, 2);						// célula coluna 1, linha 1

			// Cidade
			Label labelCidade = new Label("Cidade:");				// Nova Label
			layoutCenter.add(labelCidade, 0, 3);					// célula col 0, linha 2
			TextField txtCidade = new TextField();					// Campo de texto vazio
			layoutCenter.add(txtCidade, 1, 3);						// célula coluna 1, linha 2

			// Código postal numérico
			Label labelCpostal = new Label("Cpostal:");				// Nova Label
			layoutCenter.add(labelCpostal, 0, 4);					// célula col 0, linha 3
			TextField txtCpostal = new TextField();					// Campo de texto vazio
			layoutCenter.add(txtCpostal, 1, 4);						// célula coluna 1, linha 3

			// Mail
			Label labelMail = new Label("Mail:");					// Nova Label
			layoutCenter.add(labelMail, 0, 5);						// célula col 0, linha 4
			TextField txtMail = new TextField();					// Campo de texto vazio
			layoutCenter.add(txtMail, 1, 5);						// célula coluna 1, linha 4
			
			// Data Nascimento
			Label labelDataNascimento = new Label("DataNascimento:");	// Nova Label
			layoutCenter.add(labelDataNascimento, 0, 6);				// célula col 0, linha 5
			TextField txtDataNascimento = new TextField();				// Campo de texto vazio
			layoutCenter.add(txtDataNascimento, 1, 6);					// célula coluna 1, linha 5

			// Botão Login
			Button btnLogin = new Button("Valida");
			btnLogin.setOnAction(e -> {								// Acções do botão:
				
				// se o texto do campo XPTO não for string
				// => Utils.alertBox("ERRO","Campo XPTO só aceita.....")
					
				Utils.alertBox("A Fazer", "Validação de campos...");

			});
			layoutCenter.add(btnLogin,  1, 7);					// Botão Adicionado à coluna 1, linha 6	 

			
			
			
			
			
			//--------------------------------------------------------
			BorderPane layoutRoot = new BorderPane();						// Preparação do rootLayout BorderPane	
			layoutRoot.setTop(layoutTop);									// Associar os subLayouts às regiões do BorderPane
			layoutRoot.setLeft(layoutLeft);
			layoutRoot.setCenter(layoutCenter);
			
			Scene scene = new Scene(layoutRoot,600,400);					// Associar o rootLayout à Scene
			primaryStage.setScene(scene);									// Associar a Scene à Stage
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
