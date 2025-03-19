public abstract class Subject {
  
  public void registerObserver(INewsobserver o) {
		observers.add(o)
	}
	 public void removeObserver(INewsObserver o) {
        observers.remove(o);
	}
		 
	public void notifyObservers(Event event) {
		for (INewsObserver o: observers) {
			observer.update(event)
		}
	} 
}
