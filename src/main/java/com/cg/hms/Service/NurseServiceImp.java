package com.cg.hms.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.hms.Entity.Nurse;
import com.cg.hms.repository.NurseRepository;
@Service
public class NurseServiceImp implements NurseService {

    public NurseRepository nurseRepository;

    @Autowired
    public void setNurseRepository(NurseRepository nurseRepository) {
        this.nurseRepository = nurseRepository;
    }

 

    @Override
    public Nurse saveNurse(Nurse nurse) {
         return nurseRepository.save(nurse);
    }

 

    @Override
    public List<Nurse> getallNurses() {
         return nurseRepository.findAll();

    }

 

    @Override
    public Nurse getDetailOfNurseByemployeeId(Integer employeeid) {
        return nurseRepository.findById(employeeid).get();
    }

 

    @Override
    public String getPositionOfNurseByemployeeId(Integer employeeid) {
        Nurse nurse = nurseRepository.findById(employeeid).get();
        if (nurse != null) {
            return nurse.getPosition();
        } else {
            return null;
        }
    }


 

    @Override
    public Boolean NurseIsRegisteredOrNot(Integer employeeid) {
         Nurse nurse = nurseRepository.findById(employeeid).get();
            return nurse.isRegistered();
    }

 

    @Override
    public Nurse updateValueOfregistred(Integer employeeid, Nurse nur) {
         Nurse nurse = nurseRepository.findById(employeeid).get();
            nurse.setRegistered(nur.isRegistered());
            return nurseRepository.save(nurse);
        }


 

    @Override
    public Nurse updateValueOfSSN(Integer employeeid, Nurse nur) {
         Nurse nurse = nurseRepository.findById(employeeid).get();
         nurse.setSsn(nur.getSsn());
         return nurseRepository.save(nurse);
            
        }
    }
