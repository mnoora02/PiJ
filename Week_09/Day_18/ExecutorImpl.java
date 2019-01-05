import java.util.concurrent.Executor;

public ExecutorImpl implements Executor {

	public void execute() {
		Executor e = new ThreadPoolExecutor();
		Runnable r = new TextLoop();
		e.execute(r);
	}
}