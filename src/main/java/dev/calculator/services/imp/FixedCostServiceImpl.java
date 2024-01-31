package dev.calculator.services.imp;

import dev.calculator.repositories.FixedCostRepository;
import dev.calculator.models.FixedCostModel;
import dev.calculator.services.FixedCostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FixedCostServiceImpl implements FixedCostService {

    @Autowired
    FixedCostRepository fixedCostRepository;

    @Override
    public boolean existsByNameCostsAndUser_UserId(String nameCosts, UUID userId) {
        return fixedCostRepository.existsByNameCostsAndUser_UserId(nameCosts, userId);
    }

    @Override
    public List<FixedCostModel> findAllByUserId(UUID userId) {
        return fixedCostRepository.findAllByUser_UserId(userId);
    }

    @Override
    public Optional<FixedCostModel> findById(UUID fixedCostId) {
        return fixedCostRepository.findById(fixedCostId);
    }

    @Override
    public void delete(FixedCostModel fixedCost) {
        fixedCostRepository.delete(fixedCost);
    }

    @Override
    public FixedCostModel save(FixedCostModel fixedCost) {
        fixedCostRepository.save(fixedCost);
        return fixedCost;
    }
}