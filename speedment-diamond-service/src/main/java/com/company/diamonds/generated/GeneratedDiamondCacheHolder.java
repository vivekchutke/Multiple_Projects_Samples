package com.company.diamonds.generated;

import com.company.diamonds.Diamond;
import com.company.diamonds.DiamondEntityStoreSerializerImpl;
import com.company.diamonds.DiamondManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStore;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreHolder;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfDouble;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfLong;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfString;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache;
import com.speedment.enterprise.datastore.runtime.fieldcache.MultiFieldCache;
import com.speedment.enterprise.datastore.runtime.statistic.Statistics;
import com.speedment.enterprise.datastore.runtime.util.DataStoreHolderUtil;
import com.speedment.enterprise.datastore.runtime.util.StatisticsUtil;
import com.speedment.runtime.bulk.PersistOperation;
import com.speedment.runtime.bulk.RemoveOperation;
import com.speedment.runtime.bulk.UpdateOperation;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.ColumnLabel;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.StreamSupplierComponent;
import com.speedment.runtime.field.Field;
import com.speedment.runtime.field.trait.HasIdentifier;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.stream.Stream;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

/**
 * A holder class for the various caches that are used to speed up the {@link
 * DiamondManager}.
 * 
 * Generated by
 * com.speedment.enterprise.datastore.generator.internal.code.GeneratedEntityCacheHolderTranslator
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public final class GeneratedDiamondCacheHolder implements EntityStoreHolder<Diamond> {
    
    private final EntityStore<Diamond> entityStore;
    private final OfLong fieldIdCache;
    private final OfDouble fieldCaratCache;
    private final OfString fieldClarityCache;
    private final OfString fieldColorCache;
    private final OfString fieldCutTypeCache;
    private final OfDouble fieldDepthCache;
    private final OfDouble fieldPriceCache;
    private final OfDouble fieldTableDataCache;
    private final OfDouble fieldXFactorCache;
    private final OfDouble fieldYFactorCache;
    private final OfDouble fieldZFactorCache;
    
    public GeneratedDiamondCacheHolder(
            EntityStore<Diamond> entityStore,
            OfLong fieldIdCache,
            OfDouble fieldCaratCache,
            OfString fieldClarityCache,
            OfString fieldColorCache,
            OfString fieldCutTypeCache,
            OfDouble fieldDepthCache,
            OfDouble fieldPriceCache,
            OfDouble fieldTableDataCache,
            OfDouble fieldXFactorCache,
            OfDouble fieldYFactorCache,
            OfDouble fieldZFactorCache) {
        
        this.entityStore         = requireNonNull(entityStore);
        this.fieldIdCache        = requireNonNull(fieldIdCache);
        this.fieldCaratCache     = requireNonNull(fieldCaratCache);
        this.fieldClarityCache   = requireNonNull(fieldClarityCache);
        this.fieldColorCache     = requireNonNull(fieldColorCache);
        this.fieldCutTypeCache   = requireNonNull(fieldCutTypeCache);
        this.fieldDepthCache     = requireNonNull(fieldDepthCache);
        this.fieldPriceCache     = requireNonNull(fieldPriceCache);
        this.fieldTableDataCache = requireNonNull(fieldTableDataCache);
        this.fieldXFactorCache   = requireNonNull(fieldXFactorCache);
        this.fieldYFactorCache   = requireNonNull(fieldYFactorCache);
        this.fieldZFactorCache   = requireNonNull(fieldZFactorCache);
    }
    
    @Override
    public EntityStore<Diamond> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<Diamond> columnId) {
        if (columnId instanceof Diamond.Identifier) {
            final Diamond.Identifier _id = (Diamond.Identifier) columnId;
            switch (_id) {
                case ID         : return (CACHE) fieldIdCache;
                case CARAT      : return (CACHE) fieldCaratCache;
                case CLARITY    : return (CACHE) fieldClarityCache;
                case COLOR      : return (CACHE) fieldColorCache;
                case CUT_TYPE   : return (CACHE) fieldCutTypeCache;
                case DEPTH      : return (CACHE) fieldDepthCache;
                case PRICE      : return (CACHE) fieldPriceCache;
                case TABLE_DATA : return (CACHE) fieldTableDataCache;
                case X_FACTOR   : return (CACHE) fieldXFactorCache;
                case Y_FACTOR   : return (CACHE) fieldYFactorCache;
                case Z_FACTOR   : return (CACHE) fieldZFactorCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "id"         : return (CACHE) fieldIdCache;
                case "carat"      : return (CACHE) fieldCaratCache;
                case "clarity"    : return (CACHE) fieldClarityCache;
                case "color"      : return (CACHE) fieldColorCache;
                case "cut_type"   : return (CACHE) fieldCutTypeCache;
                case "depth"      : return (CACHE) fieldDepthCache;
                case "price"      : return (CACHE) fieldPriceCache;
                case "table_data" : return (CACHE) fieldTableDataCache;
                case "x_factor"   : return (CACHE) fieldXFactorCache;
                case "y_factor"   : return (CACHE) fieldYFactorCache;
                case "z_factor"   : return (CACHE) fieldZFactorCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<Diamond> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedDiamondCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            DiamondEntityStoreSerializerImpl::new,
            TableIdentifier.of("diamonds", "diamonds", "diamond")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<Diamond> recycleAndPersist(PersistOperation<Diamond> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<Diamond> recycleAndRemove(RemoveOperation<Diamond> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<Diamond> recycleAndUpdate(UpdateOperation<Diamond> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<Diamond> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<Diamond>, FieldCache<?>>>of(
            Tuples.of(Diamond.ID,        fieldIdCache),
            Tuples.of(Diamond.CARAT,     fieldCaratCache),
            Tuples.of(Diamond.CLARITY,   fieldClarityCache),
            Tuples.of(Diamond.COLOR,     fieldColorCache),
            Tuples.of(Diamond.CUT_TYPE,  fieldCutTypeCache),
            Tuples.of(Diamond.DEPTH,     fieldDepthCache),
            Tuples.of(Diamond.PRICE,     fieldPriceCache),
            Tuples.of(Diamond.TABLE_DATA,fieldTableDataCache),
            Tuples.of(Diamond.X_FACTOR,  fieldXFactorCache),
            Tuples.of(Diamond.Y_FACTOR,  fieldYFactorCache),
            Tuples.of(Diamond.Z_FACTOR,  fieldZFactorCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<Diamond>> columnIdentifiers = Stream.<HasIdentifier<Diamond>>of(
            Diamond.ID,
            Diamond.CARAT,
            Diamond.CLARITY,
            Diamond.COLOR,
            Diamond.CUT_TYPE,
            Diamond.DEPTH,
            Diamond.PRICE,
            Diamond.TABLE_DATA,
            Diamond.X_FACTOR,
            Diamond.Y_FACTOR,
            Diamond.Z_FACTOR
        )
            .map(HasIdentifier::identifier)
            .collect(toSet());
        return EntityStoreHolder.of(
            entityStore,
            fieldCaches,
            multiFieldCaches,
            columnIdentifiers
        );
    }
    
    public static CompletableFuture<GeneratedDiamondCacheHolder> reload(CompletableFuture<EntityStore<Diamond>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfLong> fieldIdCacheFuture =
            DataStoreHolderUtil.buildLongCache(entityStoreFuture, executor, Diamond.ID, FieldCache.DISTINCT);
        
        final CompletableFuture<FieldCache.OfDouble> fieldCaratCacheFuture =
            DataStoreHolderUtil.buildDoubleCache(entityStoreFuture, executor, Diamond.CARAT, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldClarityCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Diamond.CLARITY, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldColorCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Diamond.COLOR, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldCutTypeCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Diamond.CUT_TYPE, 0);
        
        final CompletableFuture<FieldCache.OfDouble> fieldDepthCacheFuture =
            DataStoreHolderUtil.buildDoubleCache(entityStoreFuture, executor, Diamond.DEPTH, 0);
        
        final CompletableFuture<FieldCache.OfDouble> fieldPriceCacheFuture =
            DataStoreHolderUtil.buildDoubleCache(entityStoreFuture, executor, Diamond.PRICE, 0);
        
        final CompletableFuture<FieldCache.OfDouble> fieldTableDataCacheFuture =
            DataStoreHolderUtil.buildDoubleCache(entityStoreFuture, executor, Diamond.TABLE_DATA, 0);
        
        final CompletableFuture<FieldCache.OfDouble> fieldXFactorCacheFuture =
            DataStoreHolderUtil.buildDoubleCache(entityStoreFuture, executor, Diamond.X_FACTOR, 0);
        
        final CompletableFuture<FieldCache.OfDouble> fieldYFactorCacheFuture =
            DataStoreHolderUtil.buildDoubleCache(entityStoreFuture, executor, Diamond.Y_FACTOR, 0);
        
        final CompletableFuture<FieldCache.OfDouble> fieldZFactorCacheFuture =
            DataStoreHolderUtil.buildDoubleCache(entityStoreFuture, executor, Diamond.Z_FACTOR, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedDiamondCacheHolder(
                    entityStore,
                    fieldIdCacheFuture.get(),
                    fieldCaratCacheFuture.get(),
                    fieldClarityCacheFuture.get(),
                    fieldColorCacheFuture.get(),
                    fieldCutTypeCacheFuture.get(),
                    fieldDepthCacheFuture.get(),
                    fieldPriceCacheFuture.get(),
                    fieldTableDataCacheFuture.get(),
                    fieldXFactorCacheFuture.get(),
                    fieldYFactorCacheFuture.get(),
                    fieldZFactorCacheFuture.get()
                );
            } catch (final ExecutionException | InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
    
    @Override
    public void close() {
        entityStore.close();
        fieldIdCache.close();
        fieldCaratCache.close();
        fieldClarityCache.close();
        fieldColorCache.close();
        fieldCutTypeCache.close();
        fieldDepthCache.close();
        fieldPriceCache.close();
        fieldTableDataCache.close();
        fieldXFactorCache.close();
        fieldYFactorCache.close();
        fieldZFactorCache.close();
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                Diamond.Identifier.ID,
                Diamond.Identifier.CARAT,
                Diamond.Identifier.CLARITY,
                Diamond.Identifier.COLOR,
                Diamond.Identifier.CUT_TYPE,
                Diamond.Identifier.DEPTH,
                Diamond.Identifier.PRICE,
                Diamond.Identifier.TABLE_DATA,
                Diamond.Identifier.X_FACTOR,
                Diamond.Identifier.Y_FACTOR,
                Diamond.Identifier.Z_FACTOR
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}