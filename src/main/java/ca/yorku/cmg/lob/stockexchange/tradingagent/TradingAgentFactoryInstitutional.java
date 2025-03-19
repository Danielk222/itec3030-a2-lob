package

import

public class TradingAgentFactoryInstitutional extends AbstractTradingAgentFactory {
  public TradingAgent createConservativeAgent() {
        return new InstitutionalTradingAgent(new ConservativeTradingStrategy());
    }

    @Override
    public TradingAgent createAggressiveAgent() {
        return new InstitutionalTradingAgent(new AggressiveTradingStrategy());
    }

} 
