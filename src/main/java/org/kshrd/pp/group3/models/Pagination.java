package org.kshrd.pp.group3.models;

public class Pagination {
    private int currentPage;
    private int totalPages;
    private int totalItems;
    private int pageSize;

    public Pagination(int currentPage, int totalPages, int totalItems, int pageSize) {
        this.currentPage = currentPage;
        this.totalPages = totalPages;
        this.totalItems = totalItems;
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
