package com.InventoryManagementApplication.company.service;

import com.InventoryManagementApplication.common.exception.CompanyNotFoundException;
import com.InventoryManagementApplication.company.dto.CompanyRequest;
import com.InventoryManagementApplication.company.dto.CompanyResponse;
import com.InventoryManagementApplication.company.entity.Company;
import com.InventoryManagementApplication.company.repository.CompanyRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }



    @Transactional
    public CompanyResponse createCompany(CompanyRequest request) {

        Company company = new Company();

        company.setCode(request.getCode());
        company.setLegalName(request.getLegalName());
        company.setDisplayName(request.getDisplayName());
        company.setEmail(request.getEmail());
        company.setPhone(request.getPhone());
        company.setGstNumber(request.getGstNumber());
        company.setPanNumber(request.getPanNumber());

        company.setAddressLine1(request.getAddressLine1());
        company.setAddressLine2(request.getAddressLine2());
        company.setCity(request.getCity());
        company.setState(request.getState());
        company.setPostalCode(request.getPostalCode());
        company.setCountry(request.getCountry());

        company.setCurrency(request.getCurrency());
        company.setTimezone(request.getTimezone());
        company.setLogoUrl(request.getLogoUrl());

        company.setActive(true);

        Company savedCompany = companyRepository.save(company);

        return mapToResponse(savedCompany);
    }

    private CompanyResponse mapToResponse(Company company) {

        CompanyResponse response = new CompanyResponse();

        response.setId(company.getId());
        response.setCode(company.getCode());
        response.setLegalName(company.getLegalName());
        response.setDisplayName(company.getDisplayName());
        response.setEmail(company.getEmail());
        response.setPhone(company.getPhone());
        response.setGstNumber(company.getGstNumber());
        response.setPanNumber(company.getPanNumber());

        response.setAddressLine1(company.getAddressLine1());
        response.setAddressLine2(company.getAddressLine2());
        response.setCity(company.getCity());
        response.setState(company.getState());
        response.setPostalCode(company.getPostalCode());
        response.setCountry(company.getCountry());

        response.setCurrency(company.getCurrency());
        response.setTimezone(company.getTimezone());
        response.setLogoUrl(company.getLogoUrl());
        response.setActive(company.getActive());

        response.setCreatedAt(company.getCreatedAt());
        response.setUpdatedAt(company.getUpdatedAt());

        return response;
    }


    @Transactional(readOnly = true)
    public CompanyResponse getCompanyById(Long id) {

        Company company = companyRepository.findById(id)
                .orElseThrow(() ->
                        new CompanyNotFoundException("Company not found"));

        return mapToResponse(company);
    }


    @Transactional(readOnly = true)
    public List<CompanyResponse> getAllCompanies() {

        List<Company> companies = companyRepository.findAll();

        return companies.stream()
                .map(this::mapToResponse)
                .toList();
    }


    @Transactional
    public CompanyResponse updateCompany(Long id, CompanyRequest request) {

        Company company = companyRepository.findById(id)
                .orElseThrow(() ->
                        new CompanyNotFoundException("Company not found"));

        company.setCode(request.getCode());
        company.setLegalName(request.getLegalName());
        company.setDisplayName(request.getDisplayName());
        company.setEmail(request.getEmail());
        company.setPhone(request.getPhone());
        company.setGstNumber(request.getGstNumber());
        company.setPanNumber(request.getPanNumber());

        company.setAddressLine1(request.getAddressLine1());
        company.setAddressLine2(request.getAddressLine2());
        company.setCity(request.getCity());
        company.setState(request.getState());
        company.setPostalCode(request.getPostalCode());
        company.setCountry(request.getCountry());

        company.setCurrency(request.getCurrency());
        company.setTimezone(request.getTimezone());
        company.setLogoUrl(request.getLogoUrl());

        Company updatedCompany = companyRepository.save(company);

        return mapToResponse(updatedCompany);
    }

    @Transactional
    public CompanyResponse deactivateCompany(Long id) {

        Company company = companyRepository.findById(id)
                .orElseThrow(() ->
                        new CompanyNotFoundException("Company not found"));

        company.setActive(false);

        Company updatedCompany = companyRepository.save(company);

        return mapToResponse(updatedCompany);
    }

    @Transactional
    public CompanyResponse activateCompany(Long id) {

        Company company = companyRepository.findById(id)
                .orElseThrow(() ->
                        new CompanyNotFoundException("Company not found"));

        company.setActive(true);

        Company updatedCompany = companyRepository.save(company);

        return mapToResponse(updatedCompany);
    }
}
