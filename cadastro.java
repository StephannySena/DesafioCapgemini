import java.text.DateFormat;
import java.util.*;
import java.text.*;
public class cadastro {

    public static void main (String[] args) throws ParseException {
        String nome, cliente, data1, data2;
        float invest_dia;
        float anuncio_original, qnt_clique, qnt_comp, total_visualizacao;
        System.out.println("Nome do anúncio: ");
        Scanner sc;
        sc = new Scanner (System.in);
        nome = sc.nextLine();
        System.out.println("Cliente: ");
        cliente = sc.nextLine();
        System.out.println("Data de início: ");
        data1 = sc.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data_inicio = formato.parse(data1);
        System.out.println(formato.format(data_inicio));
        System.out.println("Data de fim: ");
        data2 = sc.nextLine();
        Date data_fim = formato.parse(data2);
        System.out.println(formato.format(data_fim));
        //qnt_dias = data_fim - data_inicio;
        System.out.println("Investimento por dia" );
        invest_dia = sc.nextFloat();

        anuncio_original = invest_dia * 30;
        total_visualizacao = anuncio_original +  ((((((anuncio_original / 100) * 12) / 20) * 3)* 40) * 3);
        qnt_clique = ((anuncio_original / 100) * 12);
        qnt_comp = ((((anuncio_original / 100) * 12) / 20) * 3);

        System.out.println("--- Relatório --- \nValor Investido: "+invest_dia+"\nVisualizações: "+total_visualizacao+"\nQuantidade Cliques: "+qnt_clique+"\nQuantidade de compartilhamentos: "+qnt_comp);





    }
}
