package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;
import ca.yorku.cmg.lob.trader.Trader;

public class TradingAgentFactoryRetail extends AbstractTradingAgentFactory {
    public TradingAgent createConservativeAgent() {
        return new TradingAgentRetail(new TradingStrategyConservative());
    }

    public TradingAgent createAggressiveAgent() {
        return new TradingAgentRetail(new TradingStrategyAggresive());
    }
}
