// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: airqualityservice.proto

package ds.airqualityservice;

/**
 * Protobuf type {@code airquality.GetHistoricalDataRequest}
 */
public  final class GetHistoricalDataRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:airquality.GetHistoricalDataRequest)
    GetHistoricalDataRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetHistoricalDataRequest.newBuilder() to construct.
  private GetHistoricalDataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetHistoricalDataRequest() {
    latestreading_ = "";
    numDays_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetHistoricalDataRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            latestreading_ = s;
            break;
          }
          case 16: {

            numDays_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ds.airqualityservice.AirQualityServiceImpl.internal_static_airquality_GetHistoricalDataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.airqualityservice.AirQualityServiceImpl.internal_static_airquality_GetHistoricalDataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.airqualityservice.GetHistoricalDataRequest.class, ds.airqualityservice.GetHistoricalDataRequest.Builder.class);
  }

  public static final int LATESTREADING_FIELD_NUMBER = 1;
  private volatile java.lang.Object latestreading_;
  /**
   * <code>string latestreading = 1;</code>
   */
  public java.lang.String getLatestreading() {
    java.lang.Object ref = latestreading_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      latestreading_ = s;
      return s;
    }
  }
  /**
   * <code>string latestreading = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLatestreadingBytes() {
    java.lang.Object ref = latestreading_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      latestreading_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUM_DAYS_FIELD_NUMBER = 2;
  private int numDays_;
  /**
   * <code>int32 num_days = 2;</code>
   */
  public int getNumDays() {
    return numDays_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getLatestreadingBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, latestreading_);
    }
    if (numDays_ != 0) {
      output.writeInt32(2, numDays_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLatestreadingBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, latestreading_);
    }
    if (numDays_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, numDays_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ds.airqualityservice.GetHistoricalDataRequest)) {
      return super.equals(obj);
    }
    ds.airqualityservice.GetHistoricalDataRequest other = (ds.airqualityservice.GetHistoricalDataRequest) obj;

    boolean result = true;
    result = result && getLatestreading()
        .equals(other.getLatestreading());
    result = result && (getNumDays()
        == other.getNumDays());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LATESTREADING_FIELD_NUMBER;
    hash = (53 * hash) + getLatestreading().hashCode();
    hash = (37 * hash) + NUM_DAYS_FIELD_NUMBER;
    hash = (53 * hash) + getNumDays();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.airqualityservice.GetHistoricalDataRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.airqualityservice.GetHistoricalDataRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.airqualityservice.GetHistoricalDataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.airqualityservice.GetHistoricalDataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.airqualityservice.GetHistoricalDataRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.airqualityservice.GetHistoricalDataRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.airqualityservice.GetHistoricalDataRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.airqualityservice.GetHistoricalDataRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.airqualityservice.GetHistoricalDataRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.airqualityservice.GetHistoricalDataRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.airqualityservice.GetHistoricalDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.airqualityservice.GetHistoricalDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ds.airqualityservice.GetHistoricalDataRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code airquality.GetHistoricalDataRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:airquality.GetHistoricalDataRequest)
      ds.airqualityservice.GetHistoricalDataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.airqualityservice.AirQualityServiceImpl.internal_static_airquality_GetHistoricalDataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.airqualityservice.AirQualityServiceImpl.internal_static_airquality_GetHistoricalDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.airqualityservice.GetHistoricalDataRequest.class, ds.airqualityservice.GetHistoricalDataRequest.Builder.class);
    }

    // Construct using ds.airqualityservice.GetHistoricalDataRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      latestreading_ = "";

      numDays_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.airqualityservice.AirQualityServiceImpl.internal_static_airquality_GetHistoricalDataRequest_descriptor;
    }

    @java.lang.Override
    public ds.airqualityservice.GetHistoricalDataRequest getDefaultInstanceForType() {
      return ds.airqualityservice.GetHistoricalDataRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ds.airqualityservice.GetHistoricalDataRequest build() {
      ds.airqualityservice.GetHistoricalDataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.airqualityservice.GetHistoricalDataRequest buildPartial() {
      ds.airqualityservice.GetHistoricalDataRequest result = new ds.airqualityservice.GetHistoricalDataRequest(this);
      result.latestreading_ = latestreading_;
      result.numDays_ = numDays_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ds.airqualityservice.GetHistoricalDataRequest) {
        return mergeFrom((ds.airqualityservice.GetHistoricalDataRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.airqualityservice.GetHistoricalDataRequest other) {
      if (other == ds.airqualityservice.GetHistoricalDataRequest.getDefaultInstance()) return this;
      if (!other.getLatestreading().isEmpty()) {
        latestreading_ = other.latestreading_;
        onChanged();
      }
      if (other.getNumDays() != 0) {
        setNumDays(other.getNumDays());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ds.airqualityservice.GetHistoricalDataRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.airqualityservice.GetHistoricalDataRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object latestreading_ = "";
    /**
     * <code>string latestreading = 1;</code>
     */
    public java.lang.String getLatestreading() {
      java.lang.Object ref = latestreading_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        latestreading_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string latestreading = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLatestreadingBytes() {
      java.lang.Object ref = latestreading_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        latestreading_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string latestreading = 1;</code>
     */
    public Builder setLatestreading(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      latestreading_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string latestreading = 1;</code>
     */
    public Builder clearLatestreading() {
      
      latestreading_ = getDefaultInstance().getLatestreading();
      onChanged();
      return this;
    }
    /**
     * <code>string latestreading = 1;</code>
     */
    public Builder setLatestreadingBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      latestreading_ = value;
      onChanged();
      return this;
    }

    private int numDays_ ;
    /**
     * <code>int32 num_days = 2;</code>
     */
    public int getNumDays() {
      return numDays_;
    }
    /**
     * <code>int32 num_days = 2;</code>
     */
    public Builder setNumDays(int value) {
      
      numDays_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 num_days = 2;</code>
     */
    public Builder clearNumDays() {
      
      numDays_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:airquality.GetHistoricalDataRequest)
  }

  // @@protoc_insertion_point(class_scope:airquality.GetHistoricalDataRequest)
  private static final ds.airqualityservice.GetHistoricalDataRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.airqualityservice.GetHistoricalDataRequest();
  }

  public static ds.airqualityservice.GetHistoricalDataRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetHistoricalDataRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetHistoricalDataRequest>() {
    @java.lang.Override
    public GetHistoricalDataRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetHistoricalDataRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetHistoricalDataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetHistoricalDataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.airqualityservice.GetHistoricalDataRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

