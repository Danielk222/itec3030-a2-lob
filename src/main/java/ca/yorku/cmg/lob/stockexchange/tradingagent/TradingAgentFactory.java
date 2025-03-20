package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.event.NewsBoard;
import ca.yorku.cmg.lob.stockexchange.event.NewsObserver;
import ca.yorku.cmg.lob.stockexchange.event.Event;

public class TradingAgentFactory extends AbstractTradingAgentFactory {
  private final Newsboard n;

  public TradingAgentFactory (Newsboard n) {
    this.n = n;
  }
}
