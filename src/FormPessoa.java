import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class FormPessoa extends Frame{
    //LABELS
    private Label nmSearchLabel = new Label("Nome:");
    private Label nmLabel = new Label("Nome:");
    private Label salLabel = new Label("Salário:");
    private Label officeLabel = new Label("Cargo:");

    //TEXTFIELDS
    private TextField nmSearchTextField = new TextField(30);
    private TextField nmTextField = new TextField();
    private TextField salTextField = new TextField();
    private TextField officeTextField = new TextField();

    //BUTTONS
    private Button searchButton = new Button("Pesquisar");
    private Button prevButton = new Button("Anterior");
    private Button nextButton = new Button("Próximo");

    //CONTAINERS
    private Container searchContainer = new Container();
    private Container up1Container = new Container();
    private Container up2Container = new Container();
    private Container midContainer = new Container();
    private Container lowerContainer = new Container();

    //DATABASE
    private String urlString = "jdbc:sqlserver://127.0.0.1\\LENOVO-IDEAPAD3-RONALD;databaseName=Company;integratedSecurity=true";
    private Connection con; 


    public FormPessoa(String nome, int altura, int largura){
        super(nome);
        setSize(largura, altura);
        setLayout(new BorderLayout());

        //SETTING UPPER CONTAINER
        searchContainer.setLayout(new GridLayout(2, 1));
        searchContainer.add(up1Container);
        searchContainer.add(up2Container);
        up1Container.add(nmSearchLabel);
        up1Container.add(nmSearchTextField);
        up1Container.setLayout(new FlowLayout());
        up2Container.add(searchButton);
        up2Container.setLayout(new FlowLayout());
        add(searchContainer, BorderLayout.NORTH);
        
        //SETTING MID CONTAINER
        midContainer.setLayout(new GridLayout(4, 2, 2, 2));
        midContainer.add(nmLabel);
        midContainer.add(nmTextField);
        midContainer.add(salLabel);
        midContainer.add(salTextField);
        midContainer.add(officeLabel);
        midContainer.add(officeTextField);
        add(midContainer, BorderLayout.CENTER);
        
        //SETTING LOWER CONTAINER
        lowerContainer.setLayout(new GridLayout(1, 2));
        lowerContainer.add(prevButton);
        lowerContainer.add(nextButton);
        add(lowerContainer, BorderLayout.SOUTH);
        setVisible(true);

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(urlString);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Parou de funcionar no primeiro try");
        }
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == searchButton){

        }else if(e.getSource() == prevButton){

        }else if(e.getSource() == nextButton){
            
        }
    }
}