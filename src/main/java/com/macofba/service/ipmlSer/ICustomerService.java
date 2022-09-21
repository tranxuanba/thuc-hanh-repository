package com.macofba.service.ipmlSer;

import com.macofba.model.Customer;
import com.macofba.model.Province;
import com.macofba.service.IGeneralService;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
