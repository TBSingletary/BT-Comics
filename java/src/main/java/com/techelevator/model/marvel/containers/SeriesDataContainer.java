package com.techelevator.model.marvel.containers;

import com.techelevator.model.marvel.fields.Series;

public class SeriesDataContainer {
	private int offset;
	private int limit;
	private int total;
	private int count;
	private Series[] results;
	public SeriesDataContainer() {
	}
	public SeriesDataContainer(int offset, int limit, int total, int count,
	        Series[] results) {
		super();
		this.offset = offset;
		this.limit = limit;
		this.total = total;
		this.count = count;
		this.results = results;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Series[] getResults() {
		return results;
	}
	public void setResults(Series[] results) {
		this.results = results;
	}
}
