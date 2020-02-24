package com.company.diamonds.diamonds.diamonds.hibernate_sequence;

import com.company.diamonds.diamonds.diamonds.hibernate_sequence.generated.GeneratedHibernateSequenceEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named
 * hibernate_sequence.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author company
 */
public final class HibernateSequenceEntityStoreSerializerImpl extends GeneratedHibernateSequenceEntityStoreSerializerImpl {
    
    public HibernateSequenceEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}