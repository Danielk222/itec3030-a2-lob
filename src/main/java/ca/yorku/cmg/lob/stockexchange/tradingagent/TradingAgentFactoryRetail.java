package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;
import ca.yorku.cmg.lob.trader.Trader;

public class TradingAgentFactoryRetail implements TradingAgentFactory {

    public TradingAgent createConservativeAgent() {
        return new TradingAgentRetail(new ConservativeTradingStrategy());
    }

    public TradingAgent createAggressiveAgent() {
        return new TradingAgentRetail(new AggressiveTradingStrategy());
    }
}
