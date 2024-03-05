package org.kshrd.pp.group3.services;

public class PaginationService {
    public int calculateTotalPages(int totalItems, int pageSize) {
        return (int) Math.ceil((double) totalItems / pageSize);
    }

}
