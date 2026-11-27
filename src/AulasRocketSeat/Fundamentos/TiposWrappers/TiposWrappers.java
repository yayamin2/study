package AulasRocketSeat.Fundamentos.TiposWrappers;

public class TiposWrappers {
    static void main(String[] args) {
        double numeroDouble = 123.56;
        int numeroInt = (int) numeroDouble; // É para converter de double para int
        Double d = 100.0; /* Double é um tipo wrapper(pode ser null e tem métodos uteis)
         já double é um tipo primitivo (não pode ser null e nem tem metodos uteis)*/
        Integer i = d.intValue();
        System.out.println(d);
        System.out.println(i);

    }
}