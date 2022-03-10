package africa.semicolon.sendAm.services;

import africa.semicolon.sendAm.data.models.Package;
import africa.semicolon.sendAm.data.models.PackageDescription;
import africa.semicolon.sendAm.data.models.Status;
import africa.semicolon.sendAm.data.repositories.PackageRepository;
import africa.semicolon.sendAm.data.repositories.PackageRepositoryImpl;
import africa.semicolon.sendAm.dtos.responses.AddPackageRequest;
import africa.semicolon.sendAm.dtos.responses.AddPackageResponse;
import africa.semicolon.sendAm.dtos.responses.UpdateTrackingInfoResponse;
import dtos.requests.UpdateTrackingInfoRequest;

public class PackageServicesImpl implements PackageService {
    private PackageRepository packageRepository = new PackageRepositoryImpl();
    private int availableId;

    @Override
    public AddPackageResponse addPackage(AddPackageRequest myPackage) {
        Package packageToBeAdded = new Package();
        PackageDescription description = new PackageDescription();
        description.setName(myPackage.getName());
        description.setWeightInGrammes(myPackage.getWeightInGrammes());

        packageToBeAdded.setDescription(description);

        Status status = new Status();
        status.setStatus("Packed");
        packageToBeAdded.getStatusList().add(status);

        Package savedPackage = packageRepository.save(packageToBeAdded);

        AddPackageResponse packageResponse = new AddPackageResponse();
        packageResponse.setId(savedPackage.getId());
        packageResponse.setName(savedPackage.getDescription().getName());
        packageResponse.setWeightInGrammes(savedPackage.getDescription().getWeightInGrammes());
//        packageResponse.setStatus(savedPackage.getDescription());
        return packageResponse;
    }

    @Override
    public TrackingPackageResponse trackPackage(int i) {
        return null;
    }


    @Override
    public AddPackageResponse add(AddPackageRequest addForm) {
        return null;
    }

    @Override
    public PackageRepository getRepository() {
        return packageRepository;
    }

    @Override
    public UpdateTrackingInfoResponse updateTrackingInfo(UpdateTrackingInfoRequest trackingRequest) {
        return null;
    }
}


