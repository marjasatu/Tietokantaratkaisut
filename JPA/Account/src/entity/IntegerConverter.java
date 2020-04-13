package entity;

import javax.persistence.*;

public class IntegerConverter implements AttributeConverter<Double,Integer> {

	@Override
	public Integer convertToDatabaseColumn(Double attribute) {
		double convert = attribute*100;
		return (int) convert;
	}

	@Override
	public Double convertToEntityAttribute(Integer dbData) {
		return dbData/100.00;
	}
	
	

}
