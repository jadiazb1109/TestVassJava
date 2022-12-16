package com.vass.test.jorgediaz.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.vass.test.jorgediaz.constant.Currency;
import java.util.Date;

/**
 * DTO for price entity.
 * @author @author <a href="mailto:ing.jorgediaz@outlook.com">Jorge Andres Diaz Bele&ntilde;o</a>
 */
public class PriceDTO {
    
    private Integer priceId;
    
    private Integer brandId;
    
    private Integer priceList;
    
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private Date applicationStartDate;
    
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private Date applicationEndDate;
    
    private Double price;
    
    private Currency currency;

    public PriceDTO() {
    }

    public PriceDTO(Integer priceId, Integer brandId, Integer priceList, Date applicationStartDate, Date applicationEndDate, Double price, Currency currency) {
        this.priceId = priceId;
        this.brandId = brandId;
        this.priceList = priceList;
        this.applicationStartDate = applicationStartDate;
        this.applicationEndDate = applicationEndDate;
        this.price = price;
        this.currency = currency;
    }

    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getPriceList() {
        return priceList;
    }

    public void setPriceList(Integer priceList) {
        this.priceList = priceList;
    }

    public Date getApplicationStartDate() {
        return applicationStartDate;
    }

    public void setApplicationStartDate(Date applicationStartDate) {
        this.applicationStartDate = applicationStartDate;
    }

    public Date getApplicationEndDate() {
        return applicationEndDate;
    }

    public void setApplicationEndDate(Date applicationEndDate) {
        this.applicationEndDate = applicationEndDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    
}
