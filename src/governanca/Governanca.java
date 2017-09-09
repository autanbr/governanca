/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package governanca;

import java.awt.Container;
import java.awt.Frame;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ROBERTA VERAS
 */
public class Governanca extends JDialog {

    private static final long serialVersionUID = 5563736898020576581L;

    public Governanca(Frame owner, String title, boolean modal) throws IOException {
        super(owner, title, modal);
        Container janela = getContentPane();
        setSize(800, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel gov = new JLabel("Governança de TI");
        gov.setBounds(100, 10, 300, 35);
        janela.add(gov);

        JLabel lblMsg1 = new JLabel("1 - Avaliar, Dirigir e Monitorar.");
        lblMsg1.setBounds(100, 30, 300, 35);
        janela.add(lblMsg1);

        JLabel ges = new JLabel("Gestão");
        ges.setBounds(100, 60, 300, 35);
        janela.add(ges);

        JLabel lblMsg2 = new JLabel("2 - Alinhar, Planejar, Organizar;");
        lblMsg2.setBounds(100, 80, 300, 35);
        janela.add(lblMsg2);

        JLabel lblMsg3 = new JLabel("3 - Construir, Adquirir, Implementar;");
        lblMsg3.setBounds(100, 100, 300, 35);
        janela.add(lblMsg3);

        JLabel lblMsg4 = new JLabel("4 - Entregar, Serviços e Suporte;");
        lblMsg4.setBounds(100, 120, 300, 35);
        janela.add(lblMsg4);

        JLabel lblMsg5 = new JLabel("5 - Monitorar, Avaliar e Analisar.");
        lblMsg5.setBounds(100, 140, 300, 35);
        janela.add(lblMsg5);
        
        
        JLabel processos1 = new JLabel("0 - Processo Incompleto - O processo não foi implementado ou não atingiu seu objetivo.");
        processos1.setBounds(100, 170, 600, 35);
        janela.add(processos1);
        
        JLabel processos2 = new JLabel("1 - Processo Executado (um atributo) - O processo implementado atinge seu objetivo.");
        processos2.setBounds(100, 190, 700, 35);
        janela.add(processos2);
        
        JLabel processos3 = new JLabel("2 - Processo Gerenciado (dois atributos) - O processo realizado é adequadamente estabelecidos, controlados e mantidos.");
        processos3.setBounds(100, 210, 700, 35);
        janela.add(processos3);
        
        JLabel processos4 = new JLabel("3 - Processo Estabelecido (dois atributos) - O processo controlado, definido capaz de atingir seus resultados ");
        processos4.setBounds(100, 230, 700, 35);
        janela.add(processos4);
        
        JLabel processos5 = new JLabel("4 - Processo Previsível (dois atributos) - O processo criado, produzir seus resultados.");
        processos5.setBounds(100, 250, 700, 35);
        janela.add(processos5);
        
        JLabel processos6 = new JLabel("5 - Processo Otimizado (dois atributos) - O processo previsível é continuamente melhorado.");
        processos6.setBounds(100, 270, 700, 35);
        janela.add(processos6);
         
    }

    public static void main(String[] args) throws IOException {
        Governanca janela = new Governanca(null, "PRINCIPIOS DO COBIT 5", false);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        String v[] = new String[99];
        String nomeJanela = "";
        int resposta = 0;
        try {

            do {

                String adm[] = {"Definição e Manutenção do Modelo de Governo", "Realização de Beneficios", "Otimização de Risco"};
                String apo[] = {"Estrutura de Gestão de TI", "Estratégia", "Arquitetura da Organização", "Inovação", "Portfólio", "Orçamento e Custos", "Recursos Humanos", "Relacionamentos", "Contratos de Prestação de Serviços", "Fornecedores", "Qualidade", "Riscos", "Segurança"};
                String cai[] = {"Programas e Projetos", "Definição de Requisitos", "Identificação e Desenvolvimento de Soluções", "Disponibilidade e Capacidade", "Capacidade de Mudança Organizacional", "Mudanças", "Aceitação e Transição da Mudança", "Conhecimento", "Ativos", "Configuração"};
                String ess[] = {"Operações", "Solicitações e Incidentes de Serviços", "Problemas", "Continuidade", "Serviços de Segurança", "Controles do Processo de Negócios"};
                String maa[] = {"Desempenho e Conformidade", "Sistema de Controle Interno", "Conformidade com Requisitos Externos"};

                String numero = JOptionPane.showInputDialog("Digite um numero dos principios de 1 à 5?");

                if (numero.matches("^[0-9]*$")) {
                    int n = Integer.parseInt(numero);

                    if (n == 1) {
                        v = adm;
                        nomeJanela = "1 - Garantia a";
                    } else if (n == 2) {
                        v = apo;
                        nomeJanela = "2 - Gerenciar";
                    } else if (n == 3) {
                        v = cai;
                        nomeJanela = "3 - Gerenciar";
                    } else if (n == 4) {
                        v = ess;
                        nomeJanela = "4 - Gerenciar";
                    } else if (n == 5) {
                        v = maa;
                        nomeJanela = "5 - Monitorar Avaliar e Analisar";
                    } else {
                        resposta = JOptionPane.showConfirmDialog(janela, "Não existe deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION);
                        if (resposta == JOptionPane.YES_OPTION) {
                            continue;
                        } else {
                            System.exit(0);
                        }

                    }

                    for (int i = 0; i < v.length; i++) {

                        //JOptionPane.showMessageDialog(janela,
                        // "'" + v[i] + "'.",
                        //nomeJanela,
                        //JOptionPane.INFORMATION_MESSAGE);
                        final JOptionPane pane = new JOptionPane("'" + v[i] + "'.", JOptionPane.INFORMATION_MESSAGE);
                        final JDialog d = pane.createDialog(janela, nomeJanela);
                        d.setLocation(525, 400);
                        d.setVisible(true);
                    }
                } else {
                    continue;
                }
                resposta = JOptionPane.showConfirmDialog(janela, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION);

            } while (resposta == JOptionPane.YES_OPTION);
            System.exit(0);

        } catch (Exception ex) {
            ex.getMessage();

        }

    }
}
