package com.esme.spring.faircorp.model;

import java.util.List;

public interface BuildingDaoCustom {
    List<Light> findAllLights (Long buildingId);
}
