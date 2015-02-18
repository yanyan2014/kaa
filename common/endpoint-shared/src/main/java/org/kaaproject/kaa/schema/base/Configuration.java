/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.schema.base;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Configuration extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Configuration\",\"namespace\":\"org.kaaproject.kaa.schema.base\",\"fields\":[]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /** Creates a new Configuration RecordBuilder */
  public static org.kaaproject.kaa.schema.base.Configuration.Builder newBuilder() {
    return new org.kaaproject.kaa.schema.base.Configuration.Builder();
  }
  
  /** Creates a new Configuration RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.schema.base.Configuration.Builder newBuilder(org.kaaproject.kaa.schema.base.Configuration.Builder other) {
    return new org.kaaproject.kaa.schema.base.Configuration.Builder(other);
  }
  
  /** Creates a new Configuration RecordBuilder by copying an existing Configuration instance */
  public static org.kaaproject.kaa.schema.base.Configuration.Builder newBuilder(org.kaaproject.kaa.schema.base.Configuration other) {
    return new org.kaaproject.kaa.schema.base.Configuration.Builder(other);
  }
  
  /**
   * RecordBuilder for Configuration instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Configuration>
    implements org.apache.avro.data.RecordBuilder<Configuration> {


    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.schema.base.Configuration.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.schema.base.Configuration.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Configuration instance */
    private Builder(org.kaaproject.kaa.schema.base.Configuration other) {
            super(org.kaaproject.kaa.schema.base.Configuration.SCHEMA$);
    }

    @Override
    public Configuration build() {
      try {
        Configuration record = new Configuration();
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
