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
public class Event extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5467251736746352627L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Event\",\"namespace\":\"com.hitachivantara.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"actor\",\"type\":{\"type\":\"record\",\"name\":\"actorRecord\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"login\",\"type\":\"string\"},{\"name\":\"display_login\",\"type\":\"string\"},{\"name\":\"gravatar_id\",\"type\":\"string\"},{\"name\":\"url\",\"type\":\"string\"},{\"name\":\"avatar_url\",\"type\":\"string\"}]}},{\"name\":\"payload\",\"type\":{\"type\":\"record\",\"name\":\"payloadRecord\",\"fields\":[{\"name\":\"push_id\",\"type\":\"long\"},{\"name\":\"size\",\"type\":\"long\"},{\"name\":\"distinct_size\",\"type\":\"long\"},{\"name\":\"ref\",\"type\":\"string\"},{\"name\":\"head\",\"type\":\"string\"},{\"name\":\"before\",\"type\":\"string\"},{\"name\":\"message\",\"type\":\"string\"},{\"name\":\"distinct\",\"type\":\"boolean\"},{\"name\":\"url\",\"type\":\"string\"}]}},{\"name\":\"public\",\"type\":\"boolean\"},{\"name\":\"created_at\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Event> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Event> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Event> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Event> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Event> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Event to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Event from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Event instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Event fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private long id;
  private java.lang.CharSequence type;
  private com.hitachivantara.avro.actorRecord actor;
  private com.hitachivantara.avro.payloadRecord payload;
  private boolean public$;
  private java.lang.CharSequence created_at;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Event() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param type The new value for type
   * @param actor The new value for actor
   * @param payload The new value for payload
   * @param public$ The new value for public
   * @param created_at The new value for created_at
   */
  public Event(java.lang.Long id, java.lang.CharSequence type, com.hitachivantara.avro.actorRecord actor, com.hitachivantara.avro.payloadRecord payload, java.lang.Boolean public$, java.lang.CharSequence created_at) {
    this.id = id;
    this.type = type;
    this.actor = actor;
    this.payload = payload;
    this.public$ = public$;
    this.created_at = created_at;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return type;
    case 2: return actor;
    case 3: return payload;
    case 4: return public$;
    case 5: return created_at;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: type = (java.lang.CharSequence)value$; break;
    case 2: actor = (com.hitachivantara.avro.actorRecord)value$; break;
    case 3: payload = (com.hitachivantara.avro.payloadRecord)value$; break;
    case 4: public$ = (java.lang.Boolean)value$; break;
    case 5: created_at = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public java.lang.CharSequence getType() {
    return type;
  }


  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'actor' field.
   * @return The value of the 'actor' field.
   */
  public com.hitachivantara.avro.actorRecord getActor() {
    return actor;
  }


  /**
   * Sets the value of the 'actor' field.
   * @param value the value to set.
   */
  public void setActor(com.hitachivantara.avro.actorRecord value) {
    this.actor = value;
  }

  /**
   * Gets the value of the 'payload' field.
   * @return The value of the 'payload' field.
   */
  public com.hitachivantara.avro.payloadRecord getPayload() {
    return payload;
  }


  /**
   * Sets the value of the 'payload' field.
   * @param value the value to set.
   */
  public void setPayload(com.hitachivantara.avro.payloadRecord value) {
    this.payload = value;
  }

  /**
   * Gets the value of the 'public$' field.
   * @return The value of the 'public$' field.
   */
  public boolean getPublic$() {
    return public$;
  }


  /**
   * Sets the value of the 'public$' field.
   * @param value the value to set.
   */
  public void setPublic$(boolean value) {
    this.public$ = value;
  }

  /**
   * Gets the value of the 'created_at' field.
   * @return The value of the 'created_at' field.
   */
  public java.lang.CharSequence getCreatedAt() {
    return created_at;
  }


  /**
   * Sets the value of the 'created_at' field.
   * @param value the value to set.
   */
  public void setCreatedAt(java.lang.CharSequence value) {
    this.created_at = value;
  }

  /**
   * Creates a new Event RecordBuilder.
   * @return A new Event RecordBuilder
   */
  public static com.hitachivantara.avro.Event.Builder newBuilder() {
    return new com.hitachivantara.avro.Event.Builder();
  }

  /**
   * Creates a new Event RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Event RecordBuilder
   */
  public static com.hitachivantara.avro.Event.Builder newBuilder(com.hitachivantara.avro.Event.Builder other) {
    if (other == null) {
      return new com.hitachivantara.avro.Event.Builder();
    } else {
      return new com.hitachivantara.avro.Event.Builder(other);
    }
  }

  /**
   * Creates a new Event RecordBuilder by copying an existing Event instance.
   * @param other The existing instance to copy.
   * @return A new Event RecordBuilder
   */
  public static com.hitachivantara.avro.Event.Builder newBuilder(com.hitachivantara.avro.Event other) {
    if (other == null) {
      return new com.hitachivantara.avro.Event.Builder();
    } else {
      return new com.hitachivantara.avro.Event.Builder(other);
    }
  }

  /**
   * RecordBuilder for Event instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Event>
    implements org.apache.avro.data.RecordBuilder<Event> {

    private long id;
    private java.lang.CharSequence type;
    private com.hitachivantara.avro.actorRecord actor;
    private com.hitachivantara.avro.actorRecord.Builder actorBuilder;
    private com.hitachivantara.avro.payloadRecord payload;
    private com.hitachivantara.avro.payloadRecord.Builder payloadBuilder;
    private boolean public$;
    private java.lang.CharSequence created_at;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.hitachivantara.avro.Event.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.actor)) {
        this.actor = data().deepCopy(fields()[2].schema(), other.actor);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasActorBuilder()) {
        this.actorBuilder = com.hitachivantara.avro.actorRecord.newBuilder(other.getActorBuilder());
      }
      if (isValidValue(fields()[3], other.payload)) {
        this.payload = data().deepCopy(fields()[3].schema(), other.payload);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (other.hasPayloadBuilder()) {
        this.payloadBuilder = com.hitachivantara.avro.payloadRecord.newBuilder(other.getPayloadBuilder());
      }
      if (isValidValue(fields()[4], other.public$)) {
        this.public$ = data().deepCopy(fields()[4].schema(), other.public$);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.created_at)) {
        this.created_at = data().deepCopy(fields()[5].schema(), other.created_at);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing Event instance
     * @param other The existing instance to copy.
     */
    private Builder(com.hitachivantara.avro.Event other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.actor)) {
        this.actor = data().deepCopy(fields()[2].schema(), other.actor);
        fieldSetFlags()[2] = true;
      }
      this.actorBuilder = null;
      if (isValidValue(fields()[3], other.payload)) {
        this.payload = data().deepCopy(fields()[3].schema(), other.payload);
        fieldSetFlags()[3] = true;
      }
      this.payloadBuilder = null;
      if (isValidValue(fields()[4], other.public$)) {
        this.public$ = data().deepCopy(fields()[4].schema(), other.public$);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.created_at)) {
        this.created_at = data().deepCopy(fields()[5].schema(), other.created_at);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.hitachivantara.avro.Event.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.hitachivantara.avro.Event.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public java.lang.CharSequence getType() {
      return type;
    }


    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.hitachivantara.avro.Event.Builder setType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.type = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.hitachivantara.avro.Event.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'actor' field.
      * @return The value.
      */
    public com.hitachivantara.avro.actorRecord getActor() {
      return actor;
    }


    /**
      * Sets the value of the 'actor' field.
      * @param value The value of 'actor'.
      * @return This builder.
      */
    public com.hitachivantara.avro.Event.Builder setActor(com.hitachivantara.avro.actorRecord value) {
      validate(fields()[2], value);
      this.actorBuilder = null;
      this.actor = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'actor' field has been set.
      * @return True if the 'actor' field has been set, false otherwise.
      */
    public boolean hasActor() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'actor' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.hitachivantara.avro.actorRecord.Builder getActorBuilder() {
      if (actorBuilder == null) {
        if (hasActor()) {
          setActorBuilder(com.hitachivantara.avro.actorRecord.newBuilder(actor));
        } else {
          setActorBuilder(com.hitachivantara.avro.actorRecord.newBuilder());
        }
      }
      return actorBuilder;
    }

    /**
     * Sets the Builder instance for the 'actor' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.hitachivantara.avro.Event.Builder setActorBuilder(com.hitachivantara.avro.actorRecord.Builder value) {
      clearActor();
      actorBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'actor' field has an active Builder instance
     * @return True if the 'actor' field has an active Builder instance
     */
    public boolean hasActorBuilder() {
      return actorBuilder != null;
    }

    /**
      * Clears the value of the 'actor' field.
      * @return This builder.
      */
    public com.hitachivantara.avro.Event.Builder clearActor() {
      actor = null;
      actorBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'payload' field.
      * @return The value.
      */
    public com.hitachivantara.avro.payloadRecord getPayload() {
      return payload;
    }


    /**
      * Sets the value of the 'payload' field.
      * @param value The value of 'payload'.
      * @return This builder.
      */
    public com.hitachivantara.avro.Event.Builder setPayload(com.hitachivantara.avro.payloadRecord value) {
      validate(fields()[3], value);
      this.payloadBuilder = null;
      this.payload = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'payload' field has been set.
      * @return True if the 'payload' field has been set, false otherwise.
      */
    public boolean hasPayload() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'payload' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.hitachivantara.avro.payloadRecord.Builder getPayloadBuilder() {
      if (payloadBuilder == null) {
        if (hasPayload()) {
          setPayloadBuilder(com.hitachivantara.avro.payloadRecord.newBuilder(payload));
        } else {
          setPayloadBuilder(com.hitachivantara.avro.payloadRecord.newBuilder());
        }
      }
      return payloadBuilder;
    }

    /**
     * Sets the Builder instance for the 'payload' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.hitachivantara.avro.Event.Builder setPayloadBuilder(com.hitachivantara.avro.payloadRecord.Builder value) {
      clearPayload();
      payloadBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'payload' field has an active Builder instance
     * @return True if the 'payload' field has an active Builder instance
     */
    public boolean hasPayloadBuilder() {
      return payloadBuilder != null;
    }

    /**
      * Clears the value of the 'payload' field.
      * @return This builder.
      */
    public com.hitachivantara.avro.Event.Builder clearPayload() {
      payload = null;
      payloadBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'public$' field.
      * @return The value.
      */
    public boolean getPublic$() {
      return public$;
    }


    /**
      * Sets the value of the 'public$' field.
      * @param value The value of 'public$'.
      * @return This builder.
      */
    public com.hitachivantara.avro.Event.Builder setPublic$(boolean value) {
      validate(fields()[4], value);
      this.public$ = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'public$' field has been set.
      * @return True if the 'public$' field has been set, false otherwise.
      */
    public boolean hasPublic$() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'public$' field.
      * @return This builder.
      */
    public com.hitachivantara.avro.Event.Builder clearPublic$() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'created_at' field.
      * @return The value.
      */
    public java.lang.CharSequence getCreatedAt() {
      return created_at;
    }


    /**
      * Sets the value of the 'created_at' field.
      * @param value The value of 'created_at'.
      * @return This builder.
      */
    public com.hitachivantara.avro.Event.Builder setCreatedAt(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.created_at = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'created_at' field has been set.
      * @return True if the 'created_at' field has been set, false otherwise.
      */
    public boolean hasCreatedAt() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'created_at' field.
      * @return This builder.
      */
    public com.hitachivantara.avro.Event.Builder clearCreatedAt() {
      created_at = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Event build() {
      try {
        Event record = new Event();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (java.lang.CharSequence) defaultValue(fields()[1]);
        if (actorBuilder != null) {
          try {
            record.actor = this.actorBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("actor"));
            throw e;
          }
        } else {
          record.actor = fieldSetFlags()[2] ? this.actor : (com.hitachivantara.avro.actorRecord) defaultValue(fields()[2]);
        }
        if (payloadBuilder != null) {
          try {
            record.payload = this.payloadBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("payload"));
            throw e;
          }
        } else {
          record.payload = fieldSetFlags()[3] ? this.payload : (com.hitachivantara.avro.payloadRecord) defaultValue(fields()[3]);
        }
        record.public$ = fieldSetFlags()[4] ? this.public$ : (java.lang.Boolean) defaultValue(fields()[4]);
        record.created_at = fieldSetFlags()[5] ? this.created_at : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Event>
    WRITER$ = (org.apache.avro.io.DatumWriter<Event>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Event>
    READER$ = (org.apache.avro.io.DatumReader<Event>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.id);

    out.writeString(this.type);

    this.actor.customEncode(out);

    this.payload.customEncode(out);

    out.writeBoolean(this.public$);

    out.writeString(this.created_at);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readLong();

      this.type = in.readString(this.type instanceof Utf8 ? (Utf8)this.type : null);

      if (this.actor == null) {
        this.actor = new com.hitachivantara.avro.actorRecord();
      }
      this.actor.customDecode(in);

      if (this.payload == null) {
        this.payload = new com.hitachivantara.avro.payloadRecord();
      }
      this.payload.customDecode(in);

      this.public$ = in.readBoolean();

      this.created_at = in.readString(this.created_at instanceof Utf8 ? (Utf8)this.created_at : null);

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readLong();
          break;

        case 1:
          this.type = in.readString(this.type instanceof Utf8 ? (Utf8)this.type : null);
          break;

        case 2:
          if (this.actor == null) {
            this.actor = new com.hitachivantara.avro.actorRecord();
          }
          this.actor.customDecode(in);
          break;

        case 3:
          if (this.payload == null) {
            this.payload = new com.hitachivantara.avro.payloadRecord();
          }
          this.payload.customDecode(in);
          break;

        case 4:
          this.public$ = in.readBoolean();
          break;

        case 5:
          this.created_at = in.readString(this.created_at instanceof Utf8 ? (Utf8)this.created_at : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









