package poo.pkg01;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String nome, cpf = null;
        char sexo;
        int idade, opc = 0;
        Object[] arraySexo = {"Feminino", "Masculino"};

        Pessoa pessoa = null;//declarando variavel tipo pessoa

        while (opc != 3) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1-Criar pessoa\n 2-Mostrar pessoa\n 3-Sair"));
            switch (opc) {
                case 1:
                    cpf = JOptionPane.showInputDialog("Informe seu CPF: ");
                    nome = JOptionPane.showInputDialog("Informe sua nome : ");
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
                    sexo = JOptionPane.showInputDialog(null, "Selecione o sexo: ", "Selecione",
                            JOptionPane.INFORMATION_MESSAGE, null, arraySexo, arraySexo[0]).toString().charAt(0);
                    pessoa = new Pessoa();
                    pessoa.setCpf(cpf);
                    pessoa.setNome(nome);
                    pessoa.setIdade(idade);
                    pessoa.setSexo(sexo);
                    break;
                case 2:
                    if (pessoa == null) {
                        JOptionPane.showMessageDialog(null, "Nenhuma pessoa Cadastrada", "Atenção", JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, pessoa.imprimir());
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Até breve! ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "Atenção", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }

    }

}
