public class ArvoreBinaria_java<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria_java() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);

    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    public void exibirEmOrdem() {
        System.out.println("\n Exibindo em ordem");
        exibirEmOrdem(this.raiz);
    }

    public void exibirEmOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirEmOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo() + " ,");
            exibirEmOrdem(atual.getNoDir());
        }
    }


}
