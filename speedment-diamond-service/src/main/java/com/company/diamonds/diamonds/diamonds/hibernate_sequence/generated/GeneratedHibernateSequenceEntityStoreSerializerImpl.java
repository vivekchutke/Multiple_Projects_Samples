package com.company.diamonds.diamonds.diamonds.hibernate_sequence.generated;

import com.company.diamonds.diamonds.diamonds.hibernate_sequence.HibernateSequence;
import com.company.diamonds.diamonds.diamonds.hibernate_sequence.HibernateSequenceImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.function.BiLongToIntFunction;
import com.speedment.common.function.LongToBooleanFunction;
import com.speedment.common.function.LongToByteFunction;
import com.speedment.common.function.LongToCharFunction;
import com.speedment.common.function.LongToFloatFunction;
import com.speedment.common.function.LongToShortFunction;
import com.speedment.enterprise.datastore.runtime.DataStoreHolder;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer;
import com.speedment.enterprise.datastore.runtime.entitystore.function.EntityStoreComparator;
import com.speedment.enterprise.datastore.runtime.entitystore.function.EntityStoreCompareTo;
import com.speedment.enterprise.datastore.runtime.entitystore.function.EntityStorePredicate;
import com.speedment.enterprise.datastore.runtime.util.SerializerUtil;
import com.speedment.runtime.config.identifier.ColumnIdentifier;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

import static java.util.Collections.singletonList;
import static java.util.Objects.requireNonNull;

/**
 * Serializes and deserializes instances of HibernateSequence.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedHibernateSequenceEntityStoreSerializerImpl implements EntityStoreSerializer<HibernateSequence> {
    
    private final LongFunction<ByteBuffer> bufferFinder;
    private final LongToIntFunction offsetFinder;
    private static final int ENDPOS_NEXT_VAL = 0;
    private static final int VARSIZE_BEGINS = 1;
    
    protected GeneratedHibernateSequenceEntityStoreSerializerImpl(final LongFunction<ByteBuffer> bufferFinder, final LongToIntFunction offsetFinder) {
        this.bufferFinder = requireNonNull(bufferFinder);
        this.offsetFinder = requireNonNull(offsetFinder);
    }
    
    @Override
    public BiConsumer<ByteBuffer, HibernateSequence> serializer() {
        return (buffer, entity) -> {
            int varSizePos = 0;
            if (entity.getNextVal().isPresent()) {
                buffer.putLong(VARSIZE_BEGINS + varSizePos, entity.getNextVal().getAsLong());
                varSizePos += Long.BYTES;
                buffer.put(ENDPOS_NEXT_VAL, (byte) varSizePos);
            } else {
                buffer.put(ENDPOS_NEXT_VAL, (byte) (0x80 | varSizePos));
            }
            buffer.position(0);
            buffer.limit(VARSIZE_BEGINS + varSizePos);
        };
    }
    
    @Override
    public LongConsumer decorator(DataStoreHolder holder) {
        return DO_NOTHING;
    }
    
    @Override
    public LongFunction<HibernateSequence> deserializer() {
        return ref -> {
            final ByteBuffer buffer = bufferFinder.apply(ref);
            final int offset = offsetFinder.applyAsInt(ref);
            final HibernateSequence entity = new HibernateSequenceImpl();
            if (buffer.get(offset + ENDPOS_NEXT_VAL) >= 0) {
                entity.setNextVal(buffer.getLong(offset + VARSIZE_BEGINS + buffer.get(offset + ENDPOS_NEXT_VAL) - Long.BYTES));
            }
            return entity;
        };
    }
    
    @Override
    public Class<?> deserializedType(final ColumnIdentifier<HibernateSequence> colId) {
        if ("next_val".equals(colId.getColumnId())) {
            return long.class;
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public <FK_ENTITY> LongUnaryOperator finder(final ColumnIdentifier<HibernateSequence> colId, final ColumnIdentifier<FK_ENTITY> fkColId) {
        return finder(singletonList(colId), singletonList(fkColId));
    }
    
    @Override
    public <FK_ENTITY> LongUnaryOperator finder(final List<ColumnIdentifier<HibernateSequence>> cols, final List<ColumnIdentifier<FK_ENTITY>> fkCols) {
        throw new UnsupportedOperationException("HibernateSequence has no foreign references.");
    }
    
    @Override
    public LongUnaryOperator finder(final String fkName) {
        throw new UnsupportedOperationException("HibernateSequence has no foreign references.");
    }
    
    @Override
    public LongPredicate isNull(final ColumnIdentifier<HibernateSequence> colId) {
        if ("next_val".equals(colId.getColumnId())) {
            return ref -> bufferFinder.apply(ref).get(offsetFinder.applyAsInt(ref) + ENDPOS_NEXT_VAL) < 0;
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public LongPredicate isPresent(final ColumnIdentifier<HibernateSequence> colId) {
        if ("next_val".equals(colId.getColumnId())) {
            return ref -> bufferFinder.apply(ref).get(offsetFinder.applyAsInt(ref) + ENDPOS_NEXT_VAL) >= 0;
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToByteFunction byteDeserializer(final ColumnIdentifier<HibernateSequence> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type byte.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToShortFunction shortDeserializer(final ColumnIdentifier<HibernateSequence> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type short.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction intDeserializer(final ColumnIdentifier<HibernateSequence> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type int.", colId.getColumnId())
        );
    }
    
    @Override
    public LongUnaryOperator longDeserializer(final ColumnIdentifier<HibernateSequence> colId) {
        if ("next_val".equals(colId.getColumnId())) {
            return ref -> {
                final ByteBuffer buffer = bufferFinder.apply(ref);
                final int offset = offsetFinder.applyAsInt(ref);
                return buffer.getLong(offset + VARSIZE_BEGINS + buffer.get(offset + ENDPOS_NEXT_VAL) - Long.BYTES);
            };
        }
        
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type long.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToFloatFunction floatDeserializer(final ColumnIdentifier<HibernateSequence> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type float.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToDoubleFunction doubleDeserializer(final ColumnIdentifier<HibernateSequence> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type double.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToCharFunction charDeserializer(final ColumnIdentifier<HibernateSequence> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type char.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToBooleanFunction booleanDeserializer(final ColumnIdentifier<HibernateSequence> colId) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type boolean.", colId.getColumnId())
        );
    }
    
    @Override
    public LongFunction<?> objectDeserializer(final ColumnIdentifier<HibernateSequence> colId) {
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public BiLongToIntFunction comparator(final ColumnIdentifier<HibernateSequence> colId) {
        if ("next_val".equals(colId.getColumnId())) {
            return (aRef, bRef) -> {
                final ByteBuffer aBuf = bufferFinder.apply(aRef);
                final ByteBuffer bBuf = bufferFinder.apply(bRef);
                final int aOffset = offsetFinder.applyAsInt(aRef);
                final int bOffset = offsetFinder.applyAsInt(bRef);
                return Long.compare(
                    aBuf.getLong(aOffset + VARSIZE_BEGINS + aBuf.get(aOffset + ENDPOS_NEXT_VAL) - Long.BYTES),
                    bBuf.getLong(bOffset + VARSIZE_BEGINS + bBuf.get(bOffset + ENDPOS_NEXT_VAL) - Long.BYTES)
                );
            };
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public BiLongToIntFunction comparatorNullsLast(final ColumnIdentifier<HibernateSequence> colId) {
        if ("next_val".equals(colId.getColumnId())) {
            return (aRef, bRef) -> {
                final ByteBuffer aBuf = bufferFinder.apply(aRef);
                final ByteBuffer bBuf = bufferFinder.apply(bRef);
                final int aOffset = offsetFinder.applyAsInt(aRef);
                final int bOffset = offsetFinder.applyAsInt(bRef);
                final int aEndPos = aBuf.get(aOffset + ENDPOS_NEXT_VAL);
                final int bEndPos = bBuf.get(bOffset + ENDPOS_NEXT_VAL);
                if (aEndPos < 0 && bEndPos < 0) return 0;
                else if (aEndPos < 0) return 1;
                else if (bEndPos < 0) return -1;
                else return Long.compare(
                    aBuf.getLong(aOffset + VARSIZE_BEGINS + aEndPos - Long.BYTES),
                    bBuf.getLong(bOffset + VARSIZE_BEGINS + bEndPos - Long.BYTES)
                );
            };
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToByte(final ColumnIdentifier<HibernateSequence> colId, final byte value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type byte.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToShort(final ColumnIdentifier<HibernateSequence> colId, final short value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type short.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToInt(final ColumnIdentifier<HibernateSequence> colId, final int value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type int.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToLong(final ColumnIdentifier<HibernateSequence> colId, final long value) {
        if ("next_val".equals(colId.getColumnId())) {
            {
                final long operand = value;
                return ref -> {
                    final ByteBuffer buffer = bufferFinder.apply(ref);
                    final int offset = offsetFinder.applyAsInt(ref);
                    final int endPos = buffer.get(offset + ENDPOS_NEXT_VAL);
                    if (endPos < 0) return 1;
                    else return Long.compare(
                        buffer.getLong(offset + VARSIZE_BEGINS + endPos - Long.BYTES),
                        operand
                    );
                };
            }
        }
        
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type long.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToFloat(final ColumnIdentifier<HibernateSequence> colId, final float value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type float.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToDouble(final ColumnIdentifier<HibernateSequence> colId, final double value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type double.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToBoolean(final ColumnIdentifier<HibernateSequence> colId, final boolean value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type boolean.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToChar(final ColumnIdentifier<HibernateSequence> colId, final char value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type char.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToObject(final ColumnIdentifier<HibernateSequence> colId, final Object value) {
        throw new UnsupportedOperationException(
            String.format("The column '%s' is either unknown or not of type object.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction compareToNull(final ColumnIdentifier<HibernateSequence> colId) {
        if ("next_val".equals(colId.getColumnId())) {
            return ref -> {
                final ByteBuffer buffer = bufferFinder.apply(ref);
                final int offset = offsetFinder.applyAsInt(ref);
                return buffer.get(offset + ENDPOS_NEXT_VAL) < 0 ? 0 : -1;
            };
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public LongPredicate newPredicate(final ColumnIdentifier<HibernateSequence> colId, final EntityStorePredicate predicate) {
        if ("next_val".equals(colId.getColumnId())) {
            return ref -> {
                final ByteBuffer buffer = bufferFinder.apply(ref);
                final int rowOffset = offsetFinder.applyAsInt(ref);
                return predicate.test(buffer,
                    rowOffset + VARSIZE_BEGINS,
                    rowOffset + VARSIZE_BEGINS + buffer.get(rowOffset + ENDPOS_NEXT_VAL)
                );
            };
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction newCompareTo(final ColumnIdentifier<HibernateSequence> colId, final EntityStoreCompareTo compareTo) {
        if ("next_val".equals(colId.getColumnId())) {
            return ref -> {
                final ByteBuffer buffer = bufferFinder.apply(ref);
                final int rowOffset = offsetFinder.applyAsInt(ref);
                return compareTo.compare(buffer,
                    rowOffset + VARSIZE_BEGINS,
                    rowOffset + VARSIZE_BEGINS + buffer.get(rowOffset + ENDPOS_NEXT_VAL)
                );
            };
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public BiLongToIntFunction newComparator(final ColumnIdentifier<HibernateSequence> colId, final EntityStoreComparator comparator) {
        if ("next_val".equals(colId.getColumnId())) {
            return (aRef, bRef) -> {
                final ByteBuffer aBuffer = bufferFinder.apply(aRef);
                final ByteBuffer bBuffer = bufferFinder.apply(bRef);
                final int aRowOffset = offsetFinder.applyAsInt(aRef);
                final int bRowOffset = offsetFinder.applyAsInt(bRef);
                return comparator.compare(
                    aBuffer, aRowOffset + VARSIZE_BEGINS, aRowOffset + VARSIZE_BEGINS + aBuffer.get(aRowOffset + ENDPOS_NEXT_VAL), 
                    bBuffer, bRowOffset + VARSIZE_BEGINS, bRowOffset + VARSIZE_BEGINS + bBuffer.get(bRowOffset + ENDPOS_NEXT_VAL)
                );
            };
        }
        
        throw new UnsupportedOperationException(
            String.format("Unknown column name '%s'.", colId.getColumnId())
        );
    }
    
    @Override
    public LongToIntFunction sizeOf() {
        return ref -> VARSIZE_BEGINS + Math.abs(bufferFinder.apply(ref).get(offsetFinder.applyAsInt(ref) + ENDPOS_NEXT_VAL));
    }
}