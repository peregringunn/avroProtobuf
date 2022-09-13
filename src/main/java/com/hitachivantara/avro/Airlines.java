/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.hitachivantara.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Airlines extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2002074335843867153L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Airlines\",\"namespace\":\"com.hitachivantara.avro\",\"fields\":[{\"name\":\"Airport\",\"type\":{\"type\":\"record\",\"name\":\"AirportRecord\",\"fields\":[{\"name\":\"code\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"}]}},{\"name\":\"Time\",\"type\":{\"type\":\"record\",\"name\":\"TimeRecord\",\"fields\":[{\"name\":\"Label\",\"type\":\"string\"},{\"name\":\"Month\",\"type\":\"long\"},{\"name\":\"MonthName\",\"type\":\"string\"},{\"name\":\"Year\",\"type\":\"long\"}]}},{\"name\":\"Statistics\",\"type\":{\"type\":\"record\",\"name\":\"StatisticsRecord\",\"fields\":[{\"name\":\"NumberOfDelays\",\"type\":{\"type\":\"record\",\"name\":\"NumberOfDelaysRecord\",\"fields\":[{\"name\":\"Carrier\",\"type\":\"long\"},{\"name\":\"LateAircraft\",\"type\":\"long\"},{\"name\":\"NationalAviationSystem\",\"type\":\"long\"},{\"name\":\"Security\",\"type\":\"long\"},{\"name\":\"Weather\",\"type\":\"long\"}]}},{\"name\":\"Carriers\",\"type\":{\"type\":\"record\",\"name\":\"CarriersRecord\",\"fields\":[{\"name\":\"Names\",\"type\":\"string\"},{\"name\":\"Total\",\"type\":\"long\"}]}},{\"name\":\"Flights\",\"type\":{\"type\":\"record\",\"name\":\"FlightsRecord\",\"fields\":[{\"name\":\"Cancelled\",\"type\":\"long\"},{\"name\":\"Delayed\",\"type\":\"long\"},{\"name\":\"Diverted\",\"type\":\"long\"},{\"name\":\"OnTime\",\"type\":\"long\"},{\"name\":\"Total\",\"type\":\"long\"}]}},{\"name\":\"MinutesDelayed\",\"type\":{\"type\":\"record\",\"name\":\"MinutesDelayedRecord\",\"fields\":[{\"name\":\"Carrier\",\"type\":\"long\"},{\"name\":\"LateAircraft\",\"type\":\"long\"},{\"name\":\"NationalAviationSystem\",\"type\":\"long\"},{\"name\":\"Security\",\"type\":\"long\"},{\"name\":\"Total\",\"type\":\"long\"},{\"name\":\"Weather\",\"type\":\"long\"}]}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Airlines> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Airlines> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Airlines> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Airlines> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Airlines> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Airlines to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Airlines from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Airlines instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Airlines fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private com.hitachivantara.avro.AirportRecord Airport;
  private com.hitachivantara.avro.TimeRecord Time;
  private com.hitachivantara.avro.StatisticsRecord Statistics;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Airlines() {}

  /**
   * All-args constructor.
   * @param Airport The new value for Airport
   * @param Time The new value for Time
   * @param Statistics The new value for Statistics
   */
  public Airlines(com.hitachivantara.avro.AirportRecord Airport, com.hitachivantara.avro.TimeRecord Time, com.hitachivantara.avro.StatisticsRecord Statistics) {
    this.Airport = Airport;
    this.Time = Time;
    this.Statistics = Statistics;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Airport;
    case 1: return Time;
    case 2: return Statistics;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Airport = (com.hitachivantara.avro.AirportRecord)value$; break;
    case 1: Time = (com.hitachivantara.avro.TimeRecord)value$; break;
    case 2: Statistics = (com.hitachivantara.avro.StatisticsRecord)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'Airport' field.
   * @return The value of the 'Airport' field.
   */
  public com.hitachivantara.avro.AirportRecord getAirport() {
    return Airport;
  }


  /**
   * Sets the value of the 'Airport' field.
   * @param value the value to set.
   */
  public void setAirport(com.hitachivantara.avro.AirportRecord value) {
    this.Airport = value;
  }

  /**
   * Gets the value of the 'Time' field.
   * @return The value of the 'Time' field.
   */
  public com.hitachivantara.avro.TimeRecord getTime() {
    return Time;
  }


  /**
   * Sets the value of the 'Time' field.
   * @param value the value to set.
   */
  public void setTime(com.hitachivantara.avro.TimeRecord value) {
    this.Time = value;
  }

  /**
   * Gets the value of the 'Statistics' field.
   * @return The value of the 'Statistics' field.
   */
  public com.hitachivantara.avro.StatisticsRecord getStatistics() {
    return Statistics;
  }


  /**
   * Sets the value of the 'Statistics' field.
   * @param value the value to set.
   */
  public void setStatistics(com.hitachivantara.avro.StatisticsRecord value) {
    this.Statistics = value;
  }

  /**
   * Creates a new Airlines RecordBuilder.
   * @return A new Airlines RecordBuilder
   */
  public static com.hitachivantara.avro.Airlines.Builder newBuilder() {
    return new com.hitachivantara.avro.Airlines.Builder();
  }

  /**
   * Creates a new Airlines RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Airlines RecordBuilder
   */
  public static com.hitachivantara.avro.Airlines.Builder newBuilder(com.hitachivantara.avro.Airlines.Builder other) {
    if (other == null) {
      return new com.hitachivantara.avro.Airlines.Builder();
    } else {
      return new com.hitachivantara.avro.Airlines.Builder(other);
    }
  }

  /**
   * Creates a new Airlines RecordBuilder by copying an existing Airlines instance.
   * @param other The existing instance to copy.
   * @return A new Airlines RecordBuilder
   */
  public static com.hitachivantara.avro.Airlines.Builder newBuilder(com.hitachivantara.avro.Airlines other) {
    if (other == null) {
      return new com.hitachivantara.avro.Airlines.Builder();
    } else {
      return new com.hitachivantara.avro.Airlines.Builder(other);
    }
  }

  /**
   * RecordBuilder for Airlines instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Airlines>
    implements org.apache.avro.data.RecordBuilder<Airlines> {

    private com.hitachivantara.avro.AirportRecord Airport;
    private com.hitachivantara.avro.AirportRecord.Builder AirportBuilder;
    private com.hitachivantara.avro.TimeRecord Time;
    private com.hitachivantara.avro.TimeRecord.Builder TimeBuilder;
    private com.hitachivantara.avro.StatisticsRecord Statistics;
    private com.hitachivantara.avro.StatisticsRecord.Builder StatisticsBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.hitachivantara.avro.Airlines.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Airport)) {
        this.Airport = data().deepCopy(fields()[0].schema(), other.Airport);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasAirportBuilder()) {
        this.AirportBuilder = com.hitachivantara.avro.AirportRecord.newBuilder(other.getAirportBuilder());
      }
      if (isValidValue(fields()[1], other.Time)) {
        this.Time = data().deepCopy(fields()[1].schema(), other.Time);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasTimeBuilder()) {
        this.TimeBuilder = com.hitachivantara.avro.TimeRecord.newBuilder(other.getTimeBuilder());
      }
      if (isValidValue(fields()[2], other.Statistics)) {
        this.Statistics = data().deepCopy(fields()[2].schema(), other.Statistics);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasStatisticsBuilder()) {
        this.StatisticsBuilder = com.hitachivantara.avro.StatisticsRecord.newBuilder(other.getStatisticsBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Airlines instance
     * @param other The existing instance to copy.
     */
    private Builder(com.hitachivantara.avro.Airlines other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.Airport)) {
        this.Airport = data().deepCopy(fields()[0].schema(), other.Airport);
        fieldSetFlags()[0] = true;
      }
      this.AirportBuilder = null;
      if (isValidValue(fields()[1], other.Time)) {
        this.Time = data().deepCopy(fields()[1].schema(), other.Time);
        fieldSetFlags()[1] = true;
      }
      this.TimeBuilder = null;
      if (isValidValue(fields()[2], other.Statistics)) {
        this.Statistics = data().deepCopy(fields()[2].schema(), other.Statistics);
        fieldSetFlags()[2] = true;
      }
      this.StatisticsBuilder = null;
    }

    /**
      * Gets the value of the 'Airport' field.
      * @return The value.
      */
    public com.hitachivantara.avro.AirportRecord getAirport() {
      return Airport;
    }


    /**
      * Sets the value of the 'Airport' field.
      * @param value The value of 'Airport'.
      * @return This builder.
      */
    public com.hitachivantara.avro.Airlines.Builder setAirport(com.hitachivantara.avro.AirportRecord value) {
      validate(fields()[0], value);
      this.AirportBuilder = null;
      this.Airport = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'Airport' field has been set.
      * @return True if the 'Airport' field has been set, false otherwise.
      */
    public boolean hasAirport() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'Airport' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.hitachivantara.avro.AirportRecord.Builder getAirportBuilder() {
      if (AirportBuilder == null) {
        if (hasAirport()) {
          setAirportBuilder(com.hitachivantara.avro.AirportRecord.newBuilder(Airport));
        } else {
          setAirportBuilder(com.hitachivantara.avro.AirportRecord.newBuilder());
        }
      }
      return AirportBuilder;
    }

    /**
     * Sets the Builder instance for the 'Airport' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.hitachivantara.avro.Airlines.Builder setAirportBuilder(com.hitachivantara.avro.AirportRecord.Builder value) {
      clearAirport();
      AirportBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'Airport' field has an active Builder instance
     * @return True if the 'Airport' field has an active Builder instance
     */
    public boolean hasAirportBuilder() {
      return AirportBuilder != null;
    }

    /**
      * Clears the value of the 'Airport' field.
      * @return This builder.
      */
    public com.hitachivantara.avro.Airlines.Builder clearAirport() {
      Airport = null;
      AirportBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'Time' field.
      * @return The value.
      */
    public com.hitachivantara.avro.TimeRecord getTime() {
      return Time;
    }


    /**
      * Sets the value of the 'Time' field.
      * @param value The value of 'Time'.
      * @return This builder.
      */
    public com.hitachivantara.avro.Airlines.Builder setTime(com.hitachivantara.avro.TimeRecord value) {
      validate(fields()[1], value);
      this.TimeBuilder = null;
      this.Time = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'Time' field has been set.
      * @return True if the 'Time' field has been set, false otherwise.
      */
    public boolean hasTime() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'Time' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.hitachivantara.avro.TimeRecord.Builder getTimeBuilder() {
      if (TimeBuilder == null) {
        if (hasTime()) {
          setTimeBuilder(com.hitachivantara.avro.TimeRecord.newBuilder(Time));
        } else {
          setTimeBuilder(com.hitachivantara.avro.TimeRecord.newBuilder());
        }
      }
      return TimeBuilder;
    }

    /**
     * Sets the Builder instance for the 'Time' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.hitachivantara.avro.Airlines.Builder setTimeBuilder(com.hitachivantara.avro.TimeRecord.Builder value) {
      clearTime();
      TimeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'Time' field has an active Builder instance
     * @return True if the 'Time' field has an active Builder instance
     */
    public boolean hasTimeBuilder() {
      return TimeBuilder != null;
    }

    /**
      * Clears the value of the 'Time' field.
      * @return This builder.
      */
    public com.hitachivantara.avro.Airlines.Builder clearTime() {
      Time = null;
      TimeBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'Statistics' field.
      * @return The value.
      */
    public com.hitachivantara.avro.StatisticsRecord getStatistics() {
      return Statistics;
    }


    /**
      * Sets the value of the 'Statistics' field.
      * @param value The value of 'Statistics'.
      * @return This builder.
      */
    public com.hitachivantara.avro.Airlines.Builder setStatistics(com.hitachivantara.avro.StatisticsRecord value) {
      validate(fields()[2], value);
      this.StatisticsBuilder = null;
      this.Statistics = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'Statistics' field has been set.
      * @return True if the 'Statistics' field has been set, false otherwise.
      */
    public boolean hasStatistics() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'Statistics' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.hitachivantara.avro.StatisticsRecord.Builder getStatisticsBuilder() {
      if (StatisticsBuilder == null) {
        if (hasStatistics()) {
          setStatisticsBuilder(com.hitachivantara.avro.StatisticsRecord.newBuilder(Statistics));
        } else {
          setStatisticsBuilder(com.hitachivantara.avro.StatisticsRecord.newBuilder());
        }
      }
      return StatisticsBuilder;
    }

    /**
     * Sets the Builder instance for the 'Statistics' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.hitachivantara.avro.Airlines.Builder setStatisticsBuilder(com.hitachivantara.avro.StatisticsRecord.Builder value) {
      clearStatistics();
      StatisticsBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'Statistics' field has an active Builder instance
     * @return True if the 'Statistics' field has an active Builder instance
     */
    public boolean hasStatisticsBuilder() {
      return StatisticsBuilder != null;
    }

    /**
      * Clears the value of the 'Statistics' field.
      * @return This builder.
      */
    public com.hitachivantara.avro.Airlines.Builder clearStatistics() {
      Statistics = null;
      StatisticsBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Airlines build() {
      try {
        Airlines record = new Airlines();
        if (AirportBuilder != null) {
          try {
            record.Airport = this.AirportBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("Airport"));
            throw e;
          }
        } else {
          record.Airport = fieldSetFlags()[0] ? this.Airport : (com.hitachivantara.avro.AirportRecord) defaultValue(fields()[0]);
        }
        if (TimeBuilder != null) {
          try {
            record.Time = this.TimeBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("Time"));
            throw e;
          }
        } else {
          record.Time = fieldSetFlags()[1] ? this.Time : (com.hitachivantara.avro.TimeRecord) defaultValue(fields()[1]);
        }
        if (StatisticsBuilder != null) {
          try {
            record.Statistics = this.StatisticsBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("Statistics"));
            throw e;
          }
        } else {
          record.Statistics = fieldSetFlags()[2] ? this.Statistics : (com.hitachivantara.avro.StatisticsRecord) defaultValue(fields()[2]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Airlines>
    WRITER$ = (org.apache.avro.io.DatumWriter<Airlines>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Airlines>
    READER$ = (org.apache.avro.io.DatumReader<Airlines>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.Airport.customEncode(out);

    this.Time.customEncode(out);

    this.Statistics.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.Airport == null) {
        this.Airport = new com.hitachivantara.avro.AirportRecord();
      }
      this.Airport.customDecode(in);

      if (this.Time == null) {
        this.Time = new com.hitachivantara.avro.TimeRecord();
      }
      this.Time.customDecode(in);

      if (this.Statistics == null) {
        this.Statistics = new com.hitachivantara.avro.StatisticsRecord();
      }
      this.Statistics.customDecode(in);

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.Airport == null) {
            this.Airport = new com.hitachivantara.avro.AirportRecord();
          }
          this.Airport.customDecode(in);
          break;

        case 1:
          if (this.Time == null) {
            this.Time = new com.hitachivantara.avro.TimeRecord();
          }
          this.Time.customDecode(in);
          break;

        case 2:
          if (this.Statistics == null) {
            this.Statistics = new com.hitachivantara.avro.StatisticsRecord();
          }
          this.Statistics.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









