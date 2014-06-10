package com.encircle360.keyworddesk.client.pojos;

import java.io.Serializable;
import java.util.Date;

/**
 * CreditBalance POJO. This class represents credit balance information.
 *
 * @author <a href="mailto:p.huetter@encircle360.com">Patrick Huetter</a>
 */
public class CreditBalance implements Serializable {

    private Integer creditsLeft;
    private Date nextBalancePeriodStart;
    private Integer creditPlan;

    public Integer getCreditsLeft() {
        return creditsLeft;
    }

    public void setCreditsLeft(Integer creditsLeft) {
        this.creditsLeft = creditsLeft;
    }

    public Date getNextBalancePeriodStart() {
        return nextBalancePeriodStart;
    }

    public void setNextBalancePeriodStart(Date nextBalancePeriodStart) {
        this.nextBalancePeriodStart = nextBalancePeriodStart;
    }

    public Integer getCreditPlan() {
        return creditPlan;
    }

    public void setCreditPlan(Integer creditPlan) {
        this.creditPlan = creditPlan;
    }
}
