package africa.semicolon.sendAm.controllers;

import africa.semicolon.sendAm.dtos.responses.AddPackageRequest;
import africa.semicolon.sendAm.dtos.responses.AddPackageResponse;
import africa.semicolon.sendAm.dtos.responses.UpdateTrackingInfoResponse;
import africa.semicolon.sendAm.services.PackageService;
import africa.semicolon.sendAm.services.PackageServicesImpl;
import africa.semicolon.sendAm.services.TrackingPackageResponse;
import dtos.requests.UpdateTrackingInfoRequest;
import org.springframework.web.bind.annotation.*;

public class PackageController {
    @RestController
    @RequestMapping("/package")
    public class PackageControllers {
        private PackageService services = new PackageServicesImpl();
    }
    @PostMapping("/addPackage")
    public AddPackageResponse addNewPackage(@RequestBody AddPackageRequest myPackage, PackageService services){
        return services.addPackage(myPackage);
    }
    
    @GetMapping("/{trackingNumber}")
    public TrackingPackageResponse trackPackage(@PathVariable int trackingNumber){
        PackageController services = null;
        return  services.trackPackage(trackingNumber);
    }
    
    @PatchMapping("/updateStatus")
    public UpdateTrackingInfoResponse updateTrackingInfo(@RequestBody UpdateTrackingInfoRequest request, PackageController services){
        return  services.updateTrackingInfo(request, services);
    }
}
