package com.iviberberi.spring5mvcrest.api.v1.mapper;

import com.iviberberi.spring5mvcrest.api.v1.model.VendorDTO;
import com.iviberberi.spring5mvcrest.domain.Vendor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VendorMapper {

    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    VendorDTO vendorToVendorDTO(Vendor vendor);

    Vendor vendorDTOtoVendor(VendorDTO vendorDTO);
}
