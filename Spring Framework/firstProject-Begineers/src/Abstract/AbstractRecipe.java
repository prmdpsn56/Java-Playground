package Abstract;

public abstract class AbstractRecipe {
    int test;
    public void execute(){
        getReady();
        doTheDish();
        cleanUp();
    }

    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanUp();

}
