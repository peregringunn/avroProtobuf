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
public class extraRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5146399649856482254L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"extraRecord\",\"namespace\":\"com.hitachivantara.avro\",\"fields\":[{\"name\":\"address\",\"type\":\"string\"},{\"name\":\"office\",\"type\":\"string\"},{\"name\":\"rss_url\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<extraRecord> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<extraRecord> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<extraRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<extraRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<extraRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this extraRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a extraRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a extraRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static extraRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence address;
  private java.lang.CharSequence office;
  private java.lang.CharSequence rss_url;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public extraRecord() {}

  /**
   * All-args constructor.
   * @param address The new value for address
   * @param office The new value for office
   * @param rss_url The new value for rss_url
   */
  public extraRecord(java.lang.CharSequence address, java.lang.CharSequence office, java.lang.CharSequence rss_url) {
    this.address = address;
    this.office = office;
    this.rss_url = rss_url;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return address;
    case 1: return office;
    case 2: return rss_url;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: address = (java.lang.CharSequence)value$; break;
    case 1: office = (java.lang.CharSequence)value$; break;
    case 2: rss_url = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'address' field.
   * @return The value of the 'address' field.
   */
  public java.lang.CharSequence getAddress() {
    return address;
  }


  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(java.lang.CharSequence value) {
    this.address = value;
  }

  /**
   * Gets the value of the 'office' field.
   * @return The value of the 'office' field.
   */
  public java.lang.CharSequence getOffice() {
    return office;
  }


  /**
   * Sets the value of the 'office' field.
   * @param value the value to set.
   */
  public void setOffice(java.lang.CharSequence value) {
    this.office = value;
  }

  /**
   * Gets the value of the 'rss_url' field.
   * @return The value of the 'rss_url' field.
   */
  public java.lang.CharSequence getRssUrl() {
    return rss_url;
  }


  /**
   * Sets the value of the 'rss_url' field.
   * @param value the value to set.
   */
  public void setRssUrl(java.lang.CharSequence value) {
    this.rss_url = value;
  }

  /**
   * Creates a new extraRecord RecordBuilder.
   * @return A new extraRecord RecordBuilder
   */
  public static com.hitachivantara.models.avro.extraRecord.Builder newBuilder() {
    return new com.hitachivantara.models.avro.extraRecord.Builder();
  }

  /**
   * Creates a new extraRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new extraRecord RecordBuilder
   */
  public static com.hitachivantara.models.avro.extraRecord.Builder newBuilder(com.hitachivantara.models.avro.extraRecord.Builder other) {
    if (other == null) {
      return new com.hitachivantara.models.avro.extraRecord.Builder();
    } else {
      return new com.hitachivantara.models.avro.extraRecord.Builder(other);
    }
  }

  /**
   * Creates a new extraRecord RecordBuilder by copying an existing extraRecord instance.
   * @param other The existing instance to copy.
   * @return A new extraRecord RecordBuilder
   */
  public static com.hitachivantara.models.avro.extraRecord.Builder newBuilder(com.hitachivantara.models.avro.extraRecord other) {
    if (other == null) {
      return new com.hitachivantara.models.avro.extraRecord.Builder();
    } else {
      return new com.hitachivantara.models.avro.extraRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for extraRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<extraRecord>
    implements org.apache.avro.data.RecordBuilder<extraRecord> {

    private java.lang.CharSequence address;
    private java.lang.CharSequence office;
    private java.lang.CharSequence rss_url;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.hitachivantara.models.avro.extraRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.address)) {
        this.address = data().deepCopy(fields()[0].schema(), other.address);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.office)) {
        this.office = data().deepCopy(fields()[1].schema(), other.office);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.rss_url)) {
        this.rss_url = data().deepCopy(fields()[2].schema(), other.rss_url);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing extraRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(com.hitachivantara.models.avro.extraRecord other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.address)) {
        this.address = data().deepCopy(fields()[0].schema(), other.address);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.office)) {
        this.office = data().deepCopy(fields()[1].schema(), other.office);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.rss_url)) {
        this.rss_url = data().deepCopy(fields()[2].schema(), other.rss_url);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'address' field.
      * @return The value.
      */
    public java.lang.CharSequence getAddress() {
      return address;
    }


    /**
      * Sets the value of the 'address' field.
      * @param value The value of 'address'.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.extraRecord.Builder setAddress(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.address = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'address' field.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.extraRecord.Builder clearAddress() {
      address = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'office' field.
      * @return The value.
      */
    public java.lang.CharSequence getOffice() {
      return office;
    }


    /**
      * Sets the value of the 'office' field.
      * @param value The value of 'office'.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.extraRecord.Builder setOffice(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.office = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'office' field has been set.
      * @return True if the 'office' field has been set, false otherwise.
      */
    public boolean hasOffice() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'office' field.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.extraRecord.Builder clearOffice() {
      office = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'rss_url' field.
      * @return The value.
      */
    public java.lang.CharSequence getRssUrl() {
      return rss_url;
    }


    /**
      * Sets the value of the 'rss_url' field.
      * @param value The value of 'rss_url'.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.extraRecord.Builder setRssUrl(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.rss_url = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'rss_url' field has been set.
      * @return True if the 'rss_url' field has been set, false otherwise.
      */
    public boolean hasRssUrl() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'rss_url' field.
      * @return This builder.
      */
    public com.hitachivantara.models.avro.extraRecord.Builder clearRssUrl() {
      rss_url = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public extraRecord build() {
      try {
        extraRecord record = new extraRecord();
        record.address = fieldSetFlags()[0] ? this.address : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.office = fieldSetFlags()[1] ? this.office : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.rss_url = fieldSetFlags()[2] ? this.rss_url : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<extraRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<extraRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<extraRecord>
    READER$ = (org.apache.avro.io.DatumReader<extraRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.address);

    out.writeString(this.office);

    out.writeString(this.rss_url);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.address = in.readString(this.address instanceof Utf8 ? (Utf8)this.address : null);

      this.office = in.readString(this.office instanceof Utf8 ? (Utf8)this.office : null);

      this.rss_url = in.readString(this.rss_url instanceof Utf8 ? (Utf8)this.rss_url : null);

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.address = in.readString(this.address instanceof Utf8 ? (Utf8)this.address : null);
          break;

        case 1:
          this.office = in.readString(this.office instanceof Utf8 ? (Utf8)this.office : null);
          break;

        case 2:
          this.rss_url = in.readString(this.rss_url instanceof Utf8 ? (Utf8)this.rss_url : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










