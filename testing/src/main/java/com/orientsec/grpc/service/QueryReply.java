// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: query.proto

package com.orientsec.grpc.service;

/**
 * Protobuf type {@code com.orientsec.grpc.service.QueryReply}
 */
public  final class QueryReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.orientsec.grpc.service.QueryReply)
    QueryReplyOrBuilder {
  // Use QueryReply.newBuilder() to construct.
  private QueryReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryReply() {
    no_ = 0;
    name_ = "";
    alias_ = "";
    sex_ = false;
    salary_ = 0D;
    total_ = 0L;
    desc_ = "";
    misc_ = "";
    message_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private QueryReply(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            no_ = input.readInt32();
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            alias_ = s;
            break;
          }
          case 32: {

            sex_ = input.readBool();
            break;
          }
          case 41: {

            salary_ = input.readDouble();
            break;
          }
          case 48: {

            total_ = input.readUInt64();
            break;
          }
          case 58: {
            String s = input.readStringRequireUtf8();

            desc_ = s;
            break;
          }
          case 66: {
            String s = input.readStringRequireUtf8();

            misc_ = s;
            break;
          }
          case 74: {
            String s = input.readStringRequireUtf8();

            message_ = s;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return QueryProto.internal_static_com_orientsec_grpc_service_QueryReply_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return QueryProto.internal_static_com_orientsec_grpc_service_QueryReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            QueryReply.class, Builder.class);
  }

  public static final int NO_FIELD_NUMBER = 1;
  private int no_;
  /**
   * <code>optional int32 no = 1;</code>
   */
  public int getNo() {
    return no_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile Object name_;
  /**
   * <code>optional string name = 2;</code>
   */
  public String getName() {
    Object ref = name_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>optional string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    Object ref = name_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALIAS_FIELD_NUMBER = 3;
  private volatile Object alias_;
  /**
   * <code>optional string alias = 3;</code>
   */
  public String getAlias() {
    Object ref = alias_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      alias_ = s;
      return s;
    }
  }
  /**
   * <code>optional string alias = 3;</code>
   */
  public com.google.protobuf.ByteString
      getAliasBytes() {
    Object ref = alias_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      alias_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEX_FIELD_NUMBER = 4;
  private boolean sex_;
  /**
   * <code>optional bool sex = 4;</code>
   */
  public boolean getSex() {
    return sex_;
  }

  public static final int SALARY_FIELD_NUMBER = 5;
  private double salary_;
  /**
   * <code>optional double salary = 5;</code>
   */
  public double getSalary() {
    return salary_;
  }

  public static final int TOTAL_FIELD_NUMBER = 6;
  private long total_;
  /**
   * <code>optional uint64 total = 6;</code>
   */
  public long getTotal() {
    return total_;
  }

  public static final int DESC_FIELD_NUMBER = 7;
  private volatile Object desc_;
  /**
   * <code>optional string desc = 7;</code>
   */
  public String getDesc() {
    Object ref = desc_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      desc_ = s;
      return s;
    }
  }
  /**
   * <code>optional string desc = 7;</code>
   */
  public com.google.protobuf.ByteString
      getDescBytes() {
    Object ref = desc_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      desc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MISC_FIELD_NUMBER = 8;
  private volatile Object misc_;
  /**
   * <code>optional string misc = 8;</code>
   */
  public String getMisc() {
    Object ref = misc_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      misc_ = s;
      return s;
    }
  }
  /**
   * <code>optional string misc = 8;</code>
   */
  public com.google.protobuf.ByteString
      getMiscBytes() {
    Object ref = misc_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      misc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_FIELD_NUMBER = 9;
  private volatile Object message_;
  /**
   * <code>optional string message = 9;</code>
   */
  public String getMessage() {
    Object ref = message_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>optional string message = 9;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    Object ref = message_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (no_ != 0) {
      output.writeInt32(1, no_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!getAliasBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, alias_);
    }
    if (sex_ != false) {
      output.writeBool(4, sex_);
    }
    if (salary_ != 0D) {
      output.writeDouble(5, salary_);
    }
    if (total_ != 0L) {
      output.writeUInt64(6, total_);
    }
    if (!getDescBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, desc_);
    }
    if (!getMiscBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, misc_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 9, message_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (no_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, no_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!getAliasBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, alias_);
    }
    if (sex_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, sex_);
    }
    if (salary_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, salary_);
    }
    if (total_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(6, total_);
    }
    if (!getDescBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, desc_);
    }
    if (!getMiscBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, misc_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, message_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof QueryReply)) {
      return super.equals(obj);
    }
    QueryReply other = (QueryReply) obj;

    boolean result = true;
    result = result && (getNo()
        == other.getNo());
    result = result && getName()
        .equals(other.getName());
    result = result && getAlias()
        .equals(other.getAlias());
    result = result && (getSex()
        == other.getSex());
    result = result && (
        Double.doubleToLongBits(getSalary())
        == Double.doubleToLongBits(
            other.getSalary()));
    result = result && (getTotal()
        == other.getTotal());
    result = result && getDesc()
        .equals(other.getDesc());
    result = result && getMisc()
        .equals(other.getMisc());
    result = result && getMessage()
        .equals(other.getMessage());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + NO_FIELD_NUMBER;
    hash = (53 * hash) + getNo();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ALIAS_FIELD_NUMBER;
    hash = (53 * hash) + getAlias().hashCode();
    hash = (37 * hash) + SEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSex());
    hash = (37 * hash) + SALARY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        Double.doubleToLongBits(getSalary()));
    hash = (37 * hash) + TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotal());
    hash = (37 * hash) + DESC_FIELD_NUMBER;
    hash = (53 * hash) + getDesc().hashCode();
    hash = (37 * hash) + MISC_FIELD_NUMBER;
    hash = (53 * hash) + getMisc().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static QueryReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static QueryReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static QueryReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static QueryReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static QueryReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static QueryReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(QueryReply prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.orientsec.grpc.service.QueryReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.orientsec.grpc.service.QueryReply)
      com.orientsec.grpc.service.QueryReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return QueryProto.internal_static_com_orientsec_grpc_service_QueryReply_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return QueryProto.internal_static_com_orientsec_grpc_service_QueryReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              QueryReply.class, Builder.class);
    }

    // Construct using com.orientsec.grpc.service.QueryReply.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      no_ = 0;

      name_ = "";

      alias_ = "";

      sex_ = false;

      salary_ = 0D;

      total_ = 0L;

      desc_ = "";

      misc_ = "";

      message_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return QueryProto.internal_static_com_orientsec_grpc_service_QueryReply_descriptor;
    }

    public QueryReply getDefaultInstanceForType() {
      return QueryReply.getDefaultInstance();
    }

    public QueryReply build() {
      QueryReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public QueryReply buildPartial() {
      QueryReply result = new QueryReply(this);
      result.no_ = no_;
      result.name_ = name_;
      result.alias_ = alias_;
      result.sex_ = sex_;
      result.salary_ = salary_;
      result.total_ = total_;
      result.desc_ = desc_;
      result.misc_ = misc_;
      result.message_ = message_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof QueryReply) {
        return mergeFrom((QueryReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(QueryReply other) {
      if (other == QueryReply.getDefaultInstance()) return this;
      if (other.getNo() != 0) {
        setNo(other.getNo());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getAlias().isEmpty()) {
        alias_ = other.alias_;
        onChanged();
      }
      if (other.getSex() != false) {
        setSex(other.getSex());
      }
      if (other.getSalary() != 0D) {
        setSalary(other.getSalary());
      }
      if (other.getTotal() != 0L) {
        setTotal(other.getTotal());
      }
      if (!other.getDesc().isEmpty()) {
        desc_ = other.desc_;
        onChanged();
      }
      if (!other.getMisc().isEmpty()) {
        misc_ = other.misc_;
        onChanged();
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      QueryReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (QueryReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int no_ ;
    /**
     * <code>optional int32 no = 1;</code>
     */
    public int getNo() {
      return no_;
    }
    /**
     * <code>optional int32 no = 1;</code>
     */
    public Builder setNo(int value) {
      
      no_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 no = 1;</code>
     */
    public Builder clearNo() {
      
      no_ = 0;
      onChanged();
      return this;
    }

    private Object name_ = "";
    /**
     * <code>optional string name = 2;</code>
     */
    public String getName() {
      Object ref = name_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder setName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private Object alias_ = "";
    /**
     * <code>optional string alias = 3;</code>
     */
    public String getAlias() {
      Object ref = alias_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        alias_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string alias = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAliasBytes() {
      Object ref = alias_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        alias_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string alias = 3;</code>
     */
    public Builder setAlias(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      alias_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string alias = 3;</code>
     */
    public Builder clearAlias() {
      
      alias_ = getDefaultInstance().getAlias();
      onChanged();
      return this;
    }
    /**
     * <code>optional string alias = 3;</code>
     */
    public Builder setAliasBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      alias_ = value;
      onChanged();
      return this;
    }

    private boolean sex_ ;
    /**
     * <code>optional bool sex = 4;</code>
     */
    public boolean getSex() {
      return sex_;
    }
    /**
     * <code>optional bool sex = 4;</code>
     */
    public Builder setSex(boolean value) {
      
      sex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool sex = 4;</code>
     */
    public Builder clearSex() {
      
      sex_ = false;
      onChanged();
      return this;
    }

    private double salary_ ;
    /**
     * <code>optional double salary = 5;</code>
     */
    public double getSalary() {
      return salary_;
    }
    /**
     * <code>optional double salary = 5;</code>
     */
    public Builder setSalary(double value) {
      
      salary_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double salary = 5;</code>
     */
    public Builder clearSalary() {
      
      salary_ = 0D;
      onChanged();
      return this;
    }

    private long total_ ;
    /**
     * <code>optional uint64 total = 6;</code>
     */
    public long getTotal() {
      return total_;
    }
    /**
     * <code>optional uint64 total = 6;</code>
     */
    public Builder setTotal(long value) {
      
      total_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 total = 6;</code>
     */
    public Builder clearTotal() {
      
      total_ = 0L;
      onChanged();
      return this;
    }

    private Object desc_ = "";
    /**
     * <code>optional string desc = 7;</code>
     */
    public String getDesc() {
      Object ref = desc_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        desc_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string desc = 7;</code>
     */
    public com.google.protobuf.ByteString
        getDescBytes() {
      Object ref = desc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        desc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string desc = 7;</code>
     */
    public Builder setDesc(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      desc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string desc = 7;</code>
     */
    public Builder clearDesc() {
      
      desc_ = getDefaultInstance().getDesc();
      onChanged();
      return this;
    }
    /**
     * <code>optional string desc = 7;</code>
     */
    public Builder setDescBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      desc_ = value;
      onChanged();
      return this;
    }

    private Object misc_ = "";
    /**
     * <code>optional string misc = 8;</code>
     */
    public String getMisc() {
      Object ref = misc_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        misc_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string misc = 8;</code>
     */
    public com.google.protobuf.ByteString
        getMiscBytes() {
      Object ref = misc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        misc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string misc = 8;</code>
     */
    public Builder setMisc(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      misc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string misc = 8;</code>
     */
    public Builder clearMisc() {
      
      misc_ = getDefaultInstance().getMisc();
      onChanged();
      return this;
    }
    /**
     * <code>optional string misc = 8;</code>
     */
    public Builder setMiscBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      misc_ = value;
      onChanged();
      return this;
    }

    private Object message_ = "";
    /**
     * <code>optional string message = 9;</code>
     */
    public String getMessage() {
      Object ref = message_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string message = 9;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string message = 9;</code>
     */
    public Builder setMessage(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string message = 9;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>optional string message = 9;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.orientsec.grpc.service.QueryReply)
  }

  // @@protoc_insertion_point(class_scope:com.orientsec.grpc.service.QueryReply)
  private static final QueryReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new QueryReply();
  }

  public static QueryReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryReply>
      PARSER = new com.google.protobuf.AbstractParser<QueryReply>() {
    public QueryReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new QueryReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryReply> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<QueryReply> getParserForType() {
    return PARSER;
  }

  public QueryReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

