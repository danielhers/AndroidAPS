package info.nightscout.androidaps.plugins.pump.omnipod.api.rest;

import java.math.BigDecimal;

public class OmniCoreTempBasalRequest extends OmniCoreRequest {

    public OmniCoreTempBasalRequest(BigDecimal temporaryRate, BigDecimal durationInHours)
    {

    }

    @Override
    protected String getRequestJson() {
        return null;
    }
}
