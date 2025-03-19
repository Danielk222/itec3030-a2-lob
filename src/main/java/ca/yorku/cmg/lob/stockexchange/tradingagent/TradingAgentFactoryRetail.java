package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;
import ca.yorku.cmg.lob.trader.Trader;

public class TradingAgentFactoryRetail implements TradingAgentFactory {

    public TradingAgent createConservativeAgent() {
        return new RetailTradingAgent(new ConservativeTradingStrategy());
    }

    public TradingAgent createAggressiveAgent() {
        return new RetailTradingAgent(new AggressiveTradingStrategy());
    }
}
