package sistema;

public class Main {
	public static void main(String[] args) {
		// 1. Configuração dos Produtos
		Produto cafe = new Produto("Café Expresso", 5.00);
		Produto bolo = new Produto("Fatia de Bolo", 12.50);
		Venda venda = new Venda();
		// 2. Criação da Venda (Objeto principal)
		System.out.println("--- Iniciando Nova Venda ---");
		// 3. Adicionando Itens de Venda usando o padrão Creator
		// A Venda.criarItemVenda() usa o 'new ItemVenda(...)'
		venda.criarItemVenda(cafe, 2); // 2 x R$ 5.00
		venda.criarItemVenda(bolo, 1); // 1 x R$ 12.50
		System.out.println("Itens adicionados à venda (usando Creator).");
		// 4. Calculando o Total usando o padrão Information Expert
		// A Venda calcula o total porque tem todos os Itens (é o Expert do Total).
		double totalVenda = venda.calcularTotal();
		System.out.println("\n--- Resumo da Venda (usando Expert) ---");
		System.out.println("Total calculado: R$ " + totalVenda);
		// Verificação: 2 * 5.00 + 1 * 12.50 = 10.00 + 12.50 = 22.50
		// 5. Criação da venda 2
		Venda venda2 = new Venda();
		System.out.println("--- inicinado nova venda ---");
		// 5. Adicionando itens a venda
		venda2.criarItemVenda(cafe, 3);
		venda2.criarItemVenda(bolo, 2);
		System.out.println("Itens adicionados á venda 2");
		//calculo total da venda 2
		double totalvenda2 = venda2.calcularTotal();
		System.out.println("\n--- Resumo da Venda 2 (usando Expert) ---");
		System.out.println("Total calculado: R$" + totalvenda2);
		}
		}


