package africa.semicolon.sendAm.services;

import africa.semicolon.sendAm.data.repositories.PackageRepository;
import africa.semicolon.sendAm.dtos.responses.AddPackageRequest;
import africa.semicolon.sendAm.dtos.responses.AddPackageResponse;
import africa.semicolon.sendAm.dtos.responses.UpdateTrackingInfoResponse;
import dtos.requests.UpdateTrackingInfoRequest;

public interface PackageService {
    AddPackageResponse add(AddPackageRequest addForm);

    PackageRepository getRepository();

    UpdateTrackingInfoResponse updateTrackingInfo(UpdateTrackingInfoRequest trackingRequest);

    AddPackageResponse addPackage(AddPackageRequest packageToAdd);

    TrackingPackageResponse trackPackage(int i);
}
