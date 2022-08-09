package com.hcl.commerce.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class OrderProductId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long addressId;
	
	private Long userId;
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
 
        if (o == null || getClass() != o.getClass())
            return false;
 
        OrderProductId that = (OrderProductId) o;
        return Objects.equals(addressId, that.addressId) &&
               Objects.equals(userId, that.userId);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(addressId, userId);
    }
	
}
