package services;

import DAO.EngineDAO;
import model.Engine;

public class EngineService {

    private EngineDAO engineDAO = new EngineDAO();

    public EngineService () {}

    public Engine findEngine(String id) {
        return engineDAO.findById(id);
    }

    public void saveEngine(Engine engine) {
        engineDAO.save(engine);
    }

    public void deleteEngine (Engine engine) {
        engineDAO.delete(engine);
    }

    public void updateEngine (Engine engine) {
        engineDAO.update(engine);
    }

}
