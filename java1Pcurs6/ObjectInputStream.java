public class ObjectInputStream {
    private InputStream inputStream;
    
    public ObjectInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }
    
    public int readInt() {
        inputStream.readByte();
        inputStream.readByte();
        inputStream.readByte();
        inputStream.readByte();
        
        System.out.println("Am citit un int");
        
        return 0;
    }
}