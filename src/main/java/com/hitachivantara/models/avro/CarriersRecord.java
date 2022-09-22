/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.hitachivantara.models.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CarriersRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3281639995420565369L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CarriersRecord\",\"namespace\":\"com.hitachivantara.avro\",\"fields\":[{\"name\":\"Names\",\"type\":\"string\"},{\"name\":\"Total\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CarriersRecord> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CarriersRecord> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CarriersRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CarriersRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CarriersRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CarriersRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CarriersRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CarriersRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CarriersRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence Names;
  private long Total;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CarriersRecord() {}

  /**
   * All-args constructor.
   * @param Names The new value for Names
   * @param Total The new value for Total
   */
  public CarriersRecord(java.lang.CharSequence Names, java.lang.Long Total) {
    this.Names = Names;
    this.Total = Total;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Names;
    case 1: return Total;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Names = (java.lang.CharSequence)value$; break;
    case 1: Total = (java.lang.Long)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'Names' field.
   * @return The value of the 'Names' field.
   */
  public java.lang.CharSequence getNames() {
    return Names;
  }


  /**
   * Sets the value of the 'Names' field.
   * @param value the value to set.
   */
  public void setNames(java.lang.CharSequence value) {
    this.Names = value;
  }

  /**
   * Gets the value of the 'Total' field.
   * @return The value of the 'Total' field.
   */
  public long getTotal() {
    return Total;
  }


  /**
   * Sets the value of the 'Total' field.
   * @param value the value to set.
   */
  public void setTotal(long value) {
    this.Total = value;
  }

  /**
   * Creates a new CarriersRecord RecordBuilder.
   * @return A new CarriersRecord RecordBuilder
   */
  public static com.hitachivantara.models.avro.CarriersRecord.Builder newBuilder() {
    return new com.hitachivantara.models.avro.CarriersRecord.Builder();
  }

  /**
   * Creates a new CarriersRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CarriersRecord RecordBuilder
   */
  public static com.hitachivantara.models.avro.CarriersRecord.Builder newBuilder(com.hitachivantara.models.avro.CarriersRecord.Builder other) {
    if (other == null) {
      return new com.hitachivantara.models.avro.CarriersRecord.Builder();
    } else {
      return new com.hitachivantara.models.avro.CarriersRecord.Builder(other);
    }
  }

  /**
   * Creates a new CarriersRecord RecordBuilder by copying an existing CarriersRecord instance.
   * @param other The existing instance to copy.
   * @return A new CarriersRecord RecordBuilder
   */
  public static com.hitachivantara.models.avro.CarriersRecord.Builder newBuilder(com.hitachivantara.models.avro.CarriersRecord other) {
    if (other == null) {
      return new com.hitachivantara.models.avro.CarriersRecord.Builder();
    } else {
      return new com.hitachivantara.models.avro.CarriersRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for CarriersRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CarriersRecord>
    implements org.apache.avro.data.RecordBuilder<CarriersRecord> {

    private java.lang.CharSequence Names;
    private long Total;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.hitachivantara.models.avro.CarriersRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Names)) {
        this.Names = data().deepCopy(fields()[0].schema(), other.Names);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.Total)) {
        this.Total = data().deepCopy(fields()[1].schema(), other.Total);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing CarriersRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(com.hitachivantara.models.avro.CarriersRecord other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.Names)) {
        this.Names = data().deepCopy(fields()[0].schema(), other.Names);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Total)) {
        this.Total = data().deepCopy(fields()[1].schema(), other.Total);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'Names' field.
      * @return The value.
      */
    public java.lang.CharSequence getNames() {
      return Names;
    }


    /**
      * Sets the value of the 'Names' field.
      * @param value The value of 'Names'.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.CarriersRecord.Builder setNames(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.Names = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'Names' field has been set.
      * @return True if the 'Names' field has been set, false otherwise.
      */
    public boolean hasNames() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'Names' field.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.CarriersRecord.Builder clearNames() {
      Names = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'Total' field.
      * @return The value.
      */
    public long getTotal() {
      return Total;
    }


    /**
      * Sets the value of the 'Total' field.
      * @param value The value of 'Total'.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.CarriersRecord.Builder setTotal(long value) {
      validate(fields()[1], value);
      this.Total = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'Total' field has been set.
      * @return True if the 'Total' field has been set, false otherwise.
      */
    public boolean hasTotal() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'Total' field.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.CarriersRecord.Builder clearTotal() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CarriersRecord build() {
      try {
        CarriersRecord record = new CarriersRecord();
        record.Names = fieldSetFlags()[0] ? this.Names : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.Total = fieldSetFlags()[1] ? this.Total : (java.lang.Long) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CarriersRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<CarriersRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CarriersRecord>
    READER$ = (org.apache.avro.io.DatumReader<CarriersRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.Names);

    out.writeLong(this.Total);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.Names = in.readString(this.Names instanceof Utf8 ? (Utf8)this.Names : null);

      this.Total = in.readLong();

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.Names = in.readString(this.Names instanceof Utf8 ? (Utf8)this.Names : null);
          break;

        case 1:
          this.Total = in.readLong();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










