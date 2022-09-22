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
public class NumberOfDelaysRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2116973233347977985L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NumberOfDelaysRecord\",\"namespace\":\"com.hitachivantara.avro\",\"fields\":[{\"name\":\"Carrier\",\"type\":\"long\"},{\"name\":\"LateAircraft\",\"type\":\"long\"},{\"name\":\"NationalAviationSystem\",\"type\":\"long\"},{\"name\":\"Security\",\"type\":\"long\"},{\"name\":\"Weather\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<NumberOfDelaysRecord> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<NumberOfDelaysRecord> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<NumberOfDelaysRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<NumberOfDelaysRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<NumberOfDelaysRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this NumberOfDelaysRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a NumberOfDelaysRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a NumberOfDelaysRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static NumberOfDelaysRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private long Carrier;
  private long LateAircraft;
  private long NationalAviationSystem;
  private long Security;
  private long Weather;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public NumberOfDelaysRecord() {}

  /**
   * All-args constructor.
   * @param Carrier The new value for Carrier
   * @param LateAircraft The new value for LateAircraft
   * @param NationalAviationSystem The new value for NationalAviationSystem
   * @param Security The new value for Security
   * @param Weather The new value for Weather
   */
  public NumberOfDelaysRecord(java.lang.Long Carrier, java.lang.Long LateAircraft, java.lang.Long NationalAviationSystem, java.lang.Long Security, java.lang.Long Weather) {
    this.Carrier = Carrier;
    this.LateAircraft = LateAircraft;
    this.NationalAviationSystem = NationalAviationSystem;
    this.Security = Security;
    this.Weather = Weather;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Carrier;
    case 1: return LateAircraft;
    case 2: return NationalAviationSystem;
    case 3: return Security;
    case 4: return Weather;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Carrier = (java.lang.Long)value$; break;
    case 1: LateAircraft = (java.lang.Long)value$; break;
    case 2: NationalAviationSystem = (java.lang.Long)value$; break;
    case 3: Security = (java.lang.Long)value$; break;
    case 4: Weather = (java.lang.Long)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'Carrier' field.
   * @return The value of the 'Carrier' field.
   */
  public long getCarrier() {
    return Carrier;
  }


  /**
   * Sets the value of the 'Carrier' field.
   * @param value the value to set.
   */
  public void setCarrier(long value) {
    this.Carrier = value;
  }

  /**
   * Gets the value of the 'LateAircraft' field.
   * @return The value of the 'LateAircraft' field.
   */
  public long getLateAircraft() {
    return LateAircraft;
  }


  /**
   * Sets the value of the 'LateAircraft' field.
   * @param value the value to set.
   */
  public void setLateAircraft(long value) {
    this.LateAircraft = value;
  }

  /**
   * Gets the value of the 'NationalAviationSystem' field.
   * @return The value of the 'NationalAviationSystem' field.
   */
  public long getNationalAviationSystem() {
    return NationalAviationSystem;
  }


  /**
   * Sets the value of the 'NationalAviationSystem' field.
   * @param value the value to set.
   */
  public void setNationalAviationSystem(long value) {
    this.NationalAviationSystem = value;
  }

  /**
   * Gets the value of the 'Security' field.
   * @return The value of the 'Security' field.
   */
  public long getSecurity() {
    return Security;
  }


  /**
   * Sets the value of the 'Security' field.
   * @param value the value to set.
   */
  public void setSecurity(long value) {
    this.Security = value;
  }

  /**
   * Gets the value of the 'Weather' field.
   * @return The value of the 'Weather' field.
   */
  public long getWeather() {
    return Weather;
  }


  /**
   * Sets the value of the 'Weather' field.
   * @param value the value to set.
   */
  public void setWeather(long value) {
    this.Weather = value;
  }

  /**
   * Creates a new NumberOfDelaysRecord RecordBuilder.
   * @return A new NumberOfDelaysRecord RecordBuilder
   */
  public static com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder newBuilder() {
    return new com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder();
  }

  /**
   * Creates a new NumberOfDelaysRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new NumberOfDelaysRecord RecordBuilder
   */
  public static com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder newBuilder(com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder other) {
    if (other == null) {
      return new com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder();
    } else {
      return new com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder(other);
    }
  }

  /**
   * Creates a new NumberOfDelaysRecord RecordBuilder by copying an existing NumberOfDelaysRecord instance.
   * @param other The existing instance to copy.
   * @return A new NumberOfDelaysRecord RecordBuilder
   */
  public static com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder newBuilder(com.hitachivantara.models.avro.NumberOfDelaysRecord other) {
    if (other == null) {
      return new com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder();
    } else {
      return new com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for NumberOfDelaysRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NumberOfDelaysRecord>
    implements org.apache.avro.data.RecordBuilder<NumberOfDelaysRecord> {

    private long Carrier;
    private long LateAircraft;
    private long NationalAviationSystem;
    private long Security;
    private long Weather;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Carrier)) {
        this.Carrier = data().deepCopy(fields()[0].schema(), other.Carrier);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.LateAircraft)) {
        this.LateAircraft = data().deepCopy(fields()[1].schema(), other.LateAircraft);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.NationalAviationSystem)) {
        this.NationalAviationSystem = data().deepCopy(fields()[2].schema(), other.NationalAviationSystem);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.Security)) {
        this.Security = data().deepCopy(fields()[3].schema(), other.Security);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.Weather)) {
        this.Weather = data().deepCopy(fields()[4].schema(), other.Weather);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing NumberOfDelaysRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(com.hitachivantara.models.avro.NumberOfDelaysRecord other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.Carrier)) {
        this.Carrier = data().deepCopy(fields()[0].schema(), other.Carrier);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.LateAircraft)) {
        this.LateAircraft = data().deepCopy(fields()[1].schema(), other.LateAircraft);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.NationalAviationSystem)) {
        this.NationalAviationSystem = data().deepCopy(fields()[2].schema(), other.NationalAviationSystem);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Security)) {
        this.Security = data().deepCopy(fields()[3].schema(), other.Security);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.Weather)) {
        this.Weather = data().deepCopy(fields()[4].schema(), other.Weather);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'Carrier' field.
      * @return The value.
      */
    public long getCarrier() {
      return Carrier;
    }


    /**
      * Sets the value of the 'Carrier' field.
      * @param value The value of 'Carrier'.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder setCarrier(long value) {
      validate(fields()[0], value);
      this.Carrier = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'Carrier' field has been set.
      * @return True if the 'Carrier' field has been set, false otherwise.
      */
    public boolean hasCarrier() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'Carrier' field.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder clearCarrier() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'LateAircraft' field.
      * @return The value.
      */
    public long getLateAircraft() {
      return LateAircraft;
    }


    /**
      * Sets the value of the 'LateAircraft' field.
      * @param value The value of 'LateAircraft'.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder setLateAircraft(long value) {
      validate(fields()[1], value);
      this.LateAircraft = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'LateAircraft' field has been set.
      * @return True if the 'LateAircraft' field has been set, false otherwise.
      */
    public boolean hasLateAircraft() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'LateAircraft' field.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder clearLateAircraft() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'NationalAviationSystem' field.
      * @return The value.
      */
    public long getNationalAviationSystem() {
      return NationalAviationSystem;
    }


    /**
      * Sets the value of the 'NationalAviationSystem' field.
      * @param value The value of 'NationalAviationSystem'.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder setNationalAviationSystem(long value) {
      validate(fields()[2], value);
      this.NationalAviationSystem = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'NationalAviationSystem' field has been set.
      * @return True if the 'NationalAviationSystem' field has been set, false otherwise.
      */
    public boolean hasNationalAviationSystem() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'NationalAviationSystem' field.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder clearNationalAviationSystem() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'Security' field.
      * @return The value.
      */
    public long getSecurity() {
      return Security;
    }


    /**
      * Sets the value of the 'Security' field.
      * @param value The value of 'Security'.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder setSecurity(long value) {
      validate(fields()[3], value);
      this.Security = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'Security' field has been set.
      * @return True if the 'Security' field has been set, false otherwise.
      */
    public boolean hasSecurity() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'Security' field.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder clearSecurity() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'Weather' field.
      * @return The value.
      */
    public long getWeather() {
      return Weather;
    }


    /**
      * Sets the value of the 'Weather' field.
      * @param value The value of 'Weather'.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder setWeather(long value) {
      validate(fields()[4], value);
      this.Weather = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'Weather' field has been set.
      * @return True if the 'Weather' field has been set, false otherwise.
      */
    public boolean hasWeather() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'Weather' field.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.NumberOfDelaysRecord.Builder clearWeather() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public NumberOfDelaysRecord build() {
      try {
        NumberOfDelaysRecord record = new NumberOfDelaysRecord();
        record.Carrier = fieldSetFlags()[0] ? this.Carrier : (java.lang.Long) defaultValue(fields()[0]);
        record.LateAircraft = fieldSetFlags()[1] ? this.LateAircraft : (java.lang.Long) defaultValue(fields()[1]);
        record.NationalAviationSystem = fieldSetFlags()[2] ? this.NationalAviationSystem : (java.lang.Long) defaultValue(fields()[2]);
        record.Security = fieldSetFlags()[3] ? this.Security : (java.lang.Long) defaultValue(fields()[3]);
        record.Weather = fieldSetFlags()[4] ? this.Weather : (java.lang.Long) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<NumberOfDelaysRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<NumberOfDelaysRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<NumberOfDelaysRecord>
    READER$ = (org.apache.avro.io.DatumReader<NumberOfDelaysRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.Carrier);

    out.writeLong(this.LateAircraft);

    out.writeLong(this.NationalAviationSystem);

    out.writeLong(this.Security);

    out.writeLong(this.Weather);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.Carrier = in.readLong();

      this.LateAircraft = in.readLong();

      this.NationalAviationSystem = in.readLong();

      this.Security = in.readLong();

      this.Weather = in.readLong();

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.Carrier = in.readLong();
          break;

        case 1:
          this.LateAircraft = in.readLong();
          break;

        case 2:
          this.NationalAviationSystem = in.readLong();
          break;

        case 3:
          this.Security = in.readLong();
          break;

        case 4:
          this.Weather = in.readLong();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










