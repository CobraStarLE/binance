package com.binance.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Status of a submitted order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum LoanStatus {
  PENDING, CONFIRMED, FAILED
}
