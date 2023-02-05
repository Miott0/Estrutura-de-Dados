public class Arvore {
    No raiz;

    //retorna a raiz da arvore
    public No getRaiz(){
        return raiz;
    }

    //inserir no na arvore
    public No inserir(No no, int valor){

        //Caso nao exista nenhum no. O primeiro a ser colocado sera a razi da arvore.
        // A raiz da arvore sempre sera preta
        if(no == null){
            No novoNo = new No();
            novoNo.setValor(valor);
            novoNo.setCor("Red");

            if(raiz == null){
                novoNo.setCor("Black");
                raiz = novoNo;
            }
            return novoNo;

        //Caso ja possua raiz.
        }else{
            //Se o valor for maior que o no pai ele vai ser colocado a direita.
            if(valor >= no.getValor()){
               No filho = inserir(no.getFilhoDireita(), valor); 
                if(filho!=null){
                    filho.setPai(no);
                    no.setFilhoDireita(filho);
                    corrigirCor(filho);
                }
            //Se o valor for maior que o no pai ele vai ser colocado a esquerda.
            }else{
                No filho = inserir(no.getFilhoEsquerda(), valor); 
                if(filho!=null){
                    filho.setPai(no);
                    no.setFilhoEsquerda(filho);
                    corrigirCor(filho);
                }
            }
        }
        return null;
    }



    public No rotacaoEsquerda(No no){
        No novoNo = no.getFilhoDireita();
        no.setFilhoDireita(novoNo.getFilhoEsquerda());
        if(novoNo.getFilhoEsquerda()!=null){
            novo.getFilhoEsquerda().getPai(no);
        }
        novNo.setPai(no.getPai());
        if(no.getPai()!=null){
            if(no == no.getPai().getFilhoEsquerda()){
                no.getPai().setFilhoEsquerda(novoNo);
            }else{
                no.getPai().setFilhoDireita(novoNo);
            }
        }else{ 
            raiz = novoNo;
        }
        novoNo.setFilhoEsquerda(no);
        no.setPai(novoNo);
        return novoNo;
    }
}
