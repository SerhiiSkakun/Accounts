package com.epam.accounts.dao;

import com.epam.accounts.entity.Client;
import com.epam.accounts.entityFilter.ClientFilter;
import com.epam.accounts.enums.ClientType;

import java.sql.SQLException;
import java.util.Map;
import java.util.Set;


public interface ClientDAO {
    ClientType findClientTypeById(Long userId) throws SQLException;
    Client findClientById(Long userId) throws SQLException;
    Map<Long, Client> findClientMapByIdsAreIn(Set<Long> userIdSet) throws SQLException;
    Client findClientByAccountNumber(String accountNumber) throws SQLException;
    Map<String, Client> findClientMapByAccountNumbersAreIn(Set<String> accountNumberSet) throws SQLException;
    Map<Long, Client> findClientMapByFilter(ClientFilter clientFilter) throws SQLException;
    boolean insertClient(Client client) throws SQLException;
    boolean updateClientParameters(Long userId, ClientType clientType) throws SQLException;
}
