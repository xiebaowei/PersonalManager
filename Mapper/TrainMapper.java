package com.pm.mapper;

import java.util.List;


import com.pm.model.Train;


public interface TrainMapper {
	public int findById(int id);
	public void insert(Train tra);
	public List<Train> tralist();
	public List<Train> tralistbyeid(int id);
	public Train tralistbyid(int id);
	public void deleteById(int id);
	public void update(Train tra);
}
