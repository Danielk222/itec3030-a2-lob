package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;
import ca.yorku.cmg.lob.trader.Trader; 

public class TradingAgentFactoryInstitutional extends AbstractTradingAgentFactory {
  public TradingAgent createConservativeAgent() {
        return new TradingAgentInstitutional(new ConservativeTradingStrategy());
    }

    public TradingAgent createAggressiveAgent() {
        return new TradingAgentInstitutional(new AggressiveTradingStrategy());
    }

} 
