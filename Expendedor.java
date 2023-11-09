class Expendedor{


    private Deposito<Bebida> coca= new Deposito<>();
    private Deposito<Bebida> sprite= new Deposito<>();
    private Deposito<Bebida> fanta= new Deposito<>();
    private Deposito<Dulce> super8= new Deposito<>();
    private Deposito<Dulce> snikers= new Deposito<>();
    private Deposito<Moneda> monVu= new Deposito<>();
    private Deposito<Moneda> monCompra = new Deposito<>();
    private Deposito<Producto> DepProd = new Deposito<>();
    private Producto compraBuena = null;

    public enum product{
        COCA(1,300),
        SPRITE(2,2000),
        FANTA(3,600),
        SUPER8(4,700),
        SNIKERS(5,500);

        private final int presio;
        private final int id;


        product(int i, int precio) {
            this.id=i;
            this.presio=precio;
        }

        public int getPresio() {
            return presio;
        }

        public int getId() {
            return id;
        }
    }

    private int numbeb;

    public Expendedor(int numBebidas){
        numbeb = numBebidas;

        for (int i =0;i<numbeb;i=i+1){
            coca.add(new CocaCola(1*i));
            sprite.add(new Sprite(2*i));
            fanta.add(new Fanta(3*i));
            super8.add(new Super8(4*i));
            snikers.add(new Snikers(5*i));
        }

    }



    public Producto comprarProducto(Moneda m, int prod)
            throws NoHayProductoException,PagoIncorrectoException, PagoInsuficienteException {
        if(m==null){
            throw new PagoIncorrectoException();
        }
        switch (prod) {
            case 1: {

                if (m.getValor() >= product.COCA.getPresio() && coca.chequear() != 0) {
                    monCompra.add(m);
                    for (int i = 1; i <= (m.getValor() - product.COCA.getPresio()) / 100; i = i + 1) {
                        monVu.add(new Moneda100());
                    }
                    return coca.get(), ;

                } else if (coca.chequear()==0) {
                    monVu.add(m);
                    throw new NoHayProductoException("NoHayProductoException, No queda producto, o n invalido");
                }else {
                    monVu.add(m);
                    throw new PagoInsuficienteException("PagoInsuficienteException, El precio del producto es mayor al valor de la moneda");

                }

            }
            case 2: {
                if (m.getValor() >= product.SPRITE.getPresio() && sprite.chequear() != 0) {
                    monCompra.add(m);
                    for (int i = 1; i <= (m.getValor() - product.SPRITE.getPresio()) / 100; i = i + 1) {
                        monVu.add(new Moneda100());
                    }
                    return sprite.get();

                } else if (sprite.chequear()==0) {
                    monVu.add(m);
                    throw new NoHayProductoException("NoHayProductoException, No queda producto, o n invalido");

                } else {
                    monVu.add(m);
                    throw new PagoInsuficienteException("PagoInsuficienteException, El precio del producto es mayor al valor de la moneda");
                }
            }
            case 3: {
                if (m.getValor() >= product.FANTA.getPresio() && fanta.chequear() != 0) {
                    monCompra.add(m);
                    for (int i = 1; i <= (m.getValor() - product.FANTA.getPresio()) / 100; i = i + 1) {
                        monVu.add(new Moneda100());
                    }
                    return fanta.get();
                } else if (fanta.chequear()==0) {

                    monVu.add(m);
                    throw new NoHayProductoException("NoHayProductoException, No queda producto, o n invalido");

                } else {
                    monVu.add(m);
                    throw new PagoInsuficienteException("PagoInsuficienteException, El precio del producto es mayor al valor de la moneda");
                }
            }
            case 4: {
                if (m.getValor() >= product.SUPER8.getPresio() && super8.chequear() != 0) {
                    monCompra.add(m);
                    for (int i = 1; i <= (m.getValor() - product.SUPER8.getPresio()) / 100; i = i + 1) {
                        monVu.add(new Moneda100());
                    }
                    return super8.get();
                } else if (super8.chequear()==0) {
                    monVu.add(m);
                    throw new NoHayProductoException("NoHayProductoException, No queda producto, o n invalido");

                }else {
                    monVu.add(m);
                    throw new PagoInsuficienteException("PagoInsuficienteException, El precio del producto es mayor al valor de la moneda");
                }
            }
            case 5: {
                if (m.getValor() >= product.SNIKERS.getPresio() && snikers.chequear() != 0) {
                    monCompra.add(m);
                    for (int i = 1; i <= (m.getValor() - product.SNIKERS.getPresio()) / 100; i = i + 1) {
                        monVu.add(new Moneda100());
                    }
                    return snikers.get();

                } else if (snikers.chequear()==0) { //caso moneda valida, pero cont vacio
                    monVu.add(m);
                    throw new NoHayProductoException("NoHayProductoException, No queda producto, o n invalido");

                } else { //caso moneda valida, pero mucho precio
                    monVu.add(m);
                    throw new PagoInsuficienteException("PagoInsuficienteException, El precio del producto es mayor al valor de la moneda");
                }
            }
            // caso moneda valida, id mala
            default: {
                monVu.add(m);
                throw new NoHayProductoException("NoHayProductoException, No queda producto, o n invalido");
            }

        }

    }

    public Moneda getVuelto(){
        return monVu.get();
    }


    public int cocaTamaño(){
        return coca.chequear();
    }
    public int spriteTamaño(){
        return sprite.chequear();
    }
    public int fantaTamaño(){
        return fanta.chequear();
    }
    public int super8Tamaño(){
        return super8.chequear();
    }
    public int snickersTamaño(){
        return snikers.chequear();
    }
}
