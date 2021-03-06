package com.company.diamonds.generated;

import com.company.allergens.Allergens;
import com.company.allergens.generated.GeneratedAllergensCacheHolder;
import com.company.diamonds.Diamond;
import com.company.diamonds.diamonds.diamonds.hibernate_sequence.HibernateSequence;
import com.company.diamonds.diamonds.diamonds.hibernate_sequence.generated.GeneratedHibernateSequenceCacheHolder;
import com.company.mealse.Mealse;
import com.company.mealse.generated.GeneratedMealseCacheHolder;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.DataStoreHolder;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStore;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreHolder;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache;
import com.speedment.enterprise.datastore.runtime.fieldcache.MultiFieldCache;
import com.speedment.enterprise.datastore.runtime.statistic.Statistics;
import com.speedment.enterprise.datastore.runtime.util.StatisticsUtil;
import com.speedment.runtime.config.identifier.ColumnIdentifier;

import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Objects.requireNonNull;

/**
 * A holder class for the various caches that are used to speed up the project.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public final class GeneratedDiamondsDataStoreHolder implements DataStoreHolder {
    
    private final GeneratedAllergensCacheHolder allergensHolder;
    private final GeneratedDiamondCacheHolder diamondHolder;
    private final GeneratedHibernateSequenceCacheHolder hibernateSequenceHolder;
    private final GeneratedMealseCacheHolder mealseHolder;
    
    public GeneratedDiamondsDataStoreHolder(
            GeneratedAllergensCacheHolder allergensHolder,
            GeneratedDiamondCacheHolder diamondHolder,
            GeneratedHibernateSequenceCacheHolder hibernateSequenceHolder,
            GeneratedMealseCacheHolder mealseHolder) {
        this.allergensHolder         = requireNonNull(allergensHolder);
        this.diamondHolder           = requireNonNull(diamondHolder);
        this.hibernateSequenceHolder = requireNonNull(hibernateSequenceHolder);
        this.mealseHolder            = requireNonNull(mealseHolder);
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <ENTITY> EntityStore<ENTITY> getEntityStore(
            String dbmsName,
            String schemaName,
            String tableName) {
        switch (tableName) {
            case "allergens"          : return (EntityStore<ENTITY>) allergensHolder.getEntityStore();
            case "diamond"            : return (EntityStore<ENTITY>) diamondHolder.getEntityStore();
            case "hibernate_sequence" : return (EntityStore<ENTITY>) hibernateSequenceHolder.getEntityStore();
            case "mealse"             : return (EntityStore<ENTITY>) mealseHolder.getEntityStore();
            default : throw new UnsupportedOperationException(
                String.format("Could not find '%s' in database model.", tableName)
            );
        }
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <ENTITY, CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<ENTITY> columnId) {
        switch (columnId.getTableId()) {
            case "allergens"          : return (CACHE) allergensHolder.getFieldCache((ColumnIdentifier<Allergens>) columnId);
            case "diamond"            : return (CACHE) diamondHolder.getFieldCache((ColumnIdentifier<Diamond>) columnId);
            case "hibernate_sequence" : return (CACHE) hibernateSequenceHolder.getFieldCache((ColumnIdentifier<HibernateSequence>) columnId);
            case "mealse"             : return (CACHE) mealseHolder.getFieldCache((ColumnIdentifier<Mealse>) columnId);
            default : throw new UnsupportedOperationException(
                String.format("Could not find '%s' in database model.", columnId.getTableId())
            );
        }
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <ENTITY, T0, T1, CACHE extends MultiFieldCache<T0, T1, CACHE>> Optional<CACHE> getMultiFieldCache(ColumnIdentifier<ENTITY> firstColumnId, ColumnIdentifier<ENTITY> secondColumnId) {
        return Optional.empty(); // No multi-indexes are used in the project
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <ENTITY> boolean isHavingMultiFieldCache(ColumnIdentifier<ENTITY> columnId) {
        return false; // No multi-indexes are used in the project
    }
    
    @Override
    public void close() {
        holders().forEach(EntityStoreHolder::close);
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.create(
            holders()
                .toArray(EntityStoreHolder[]::new)
        );
    }
    
    @Override
    public Stream<EntityStoreHolder<?>> holders() {
        return Stream.of(
            allergensHolder,
            diamondHolder,
            hibernateSequenceHolder,
            mealseHolder
        );
    }
}