package org.onebusaway.transit_data_federation.services.realtime;

import java.util.List;

import org.onebusaway.gtfs.model.AgencyAndId;
import org.onebusaway.transit_data_federation.impl.realtime.BlockLocationRecord;
import org.onebusaway.transit_data_federation.impl.realtime.BlockLocationRecordCollection;
import org.onebusaway.transit_data_federation.model.ServiceDateAndId;

public interface BlockLocationRecordCache {

  public List<BlockLocationRecordCollection> getRecordsForVehicleId(
      AgencyAndId vehicleId);

  public List<BlockLocationRecordCollection> getRecordsForBlockInstance(
      ServiceDateAndId blockInstance);

  public void addRecord(BlockLocationRecord record);

  public void clearRecordsForVehicleId(AgencyAndId vehicleId);
}