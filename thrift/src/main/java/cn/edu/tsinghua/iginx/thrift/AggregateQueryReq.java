/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.edu.tsinghua.iginx.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2021-03-18")
public class AggregateQueryReq implements org.apache.thrift.TBase<AggregateQueryReq, AggregateQueryReq._Fields>, java.io.Serializable, Cloneable, Comparable<AggregateQueryReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AggregateQueryReq");

  private static final org.apache.thrift.protocol.TField SESSION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField PATHS_FIELD_DESC = new org.apache.thrift.protocol.TField("paths", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField START_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("startTime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField END_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("endTime", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField AGGREGATE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("aggregateType", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AggregateQueryReqStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AggregateQueryReqTupleSchemeFactory();

  public long sessionId; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> paths; // required
  public long startTime; // required
  public long endTime; // required
  /**
   * 
   * @see AggregateType
   */
  public @org.apache.thrift.annotation.Nullable AggregateType aggregateType; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SESSION_ID((short)1, "sessionId"),
    PATHS((short)2, "paths"),
    START_TIME((short)3, "startTime"),
    END_TIME((short)4, "endTime"),
    /**
     * 
     * @see AggregateType
     */
    AGGREGATE_TYPE((short)5, "aggregateType");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SESSION_ID
          return SESSION_ID;
        case 2: // PATHS
          return PATHS;
        case 3: // START_TIME
          return START_TIME;
        case 4: // END_TIME
          return END_TIME;
        case 5: // AGGREGATE_TYPE
          return AGGREGATE_TYPE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SESSIONID_ISSET_ID = 0;
  private static final int __STARTTIME_ISSET_ID = 1;
  private static final int __ENDTIME_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SESSION_ID, new org.apache.thrift.meta_data.FieldMetaData("sessionId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PATHS, new org.apache.thrift.meta_data.FieldMetaData("paths", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.START_TIME, new org.apache.thrift.meta_data.FieldMetaData("startTime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.END_TIME, new org.apache.thrift.meta_data.FieldMetaData("endTime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.AGGREGATE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("aggregateType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, AggregateType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AggregateQueryReq.class, metaDataMap);
  }

  public AggregateQueryReq() {
  }

  public AggregateQueryReq(
    long sessionId,
    java.util.List<java.lang.String> paths,
    long startTime,
    long endTime,
    AggregateType aggregateType)
  {
    this();
    this.sessionId = sessionId;
    setSessionIdIsSet(true);
    this.paths = paths;
    this.startTime = startTime;
    setStartTimeIsSet(true);
    this.endTime = endTime;
    setEndTimeIsSet(true);
    this.aggregateType = aggregateType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AggregateQueryReq(AggregateQueryReq other) {
    __isset_bitfield = other.__isset_bitfield;
    this.sessionId = other.sessionId;
    if (other.isSetPaths()) {
      java.util.List<java.lang.String> __this__paths = new java.util.ArrayList<java.lang.String>(other.paths);
      this.paths = __this__paths;
    }
    this.startTime = other.startTime;
    this.endTime = other.endTime;
    if (other.isSetAggregateType()) {
      this.aggregateType = other.aggregateType;
    }
  }

  public AggregateQueryReq deepCopy() {
    return new AggregateQueryReq(this);
  }

  @Override
  public void clear() {
    setSessionIdIsSet(false);
    this.sessionId = 0;
    this.paths = null;
    setStartTimeIsSet(false);
    this.startTime = 0;
    setEndTimeIsSet(false);
    this.endTime = 0;
    this.aggregateType = null;
  }

  public long getSessionId() {
    return this.sessionId;
  }

  public AggregateQueryReq setSessionId(long sessionId) {
    this.sessionId = sessionId;
    setSessionIdIsSet(true);
    return this;
  }

  public void unsetSessionId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SESSIONID_ISSET_ID);
  }

  /** Returns true if field sessionId is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SESSIONID_ISSET_ID);
  }

  public void setSessionIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SESSIONID_ISSET_ID, value);
  }

  public int getPathsSize() {
    return (this.paths == null) ? 0 : this.paths.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getPathsIterator() {
    return (this.paths == null) ? null : this.paths.iterator();
  }

  public void addToPaths(java.lang.String elem) {
    if (this.paths == null) {
      this.paths = new java.util.ArrayList<java.lang.String>();
    }
    this.paths.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getPaths() {
    return this.paths;
  }

  public AggregateQueryReq setPaths(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> paths) {
    this.paths = paths;
    return this;
  }

  public void unsetPaths() {
    this.paths = null;
  }

  /** Returns true if field paths is set (has been assigned a value) and false otherwise */
  public boolean isSetPaths() {
    return this.paths != null;
  }

  public void setPathsIsSet(boolean value) {
    if (!value) {
      this.paths = null;
    }
  }

  public long getStartTime() {
    return this.startTime;
  }

  public AggregateQueryReq setStartTime(long startTime) {
    this.startTime = startTime;
    setStartTimeIsSet(true);
    return this;
  }

  public void unsetStartTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  /** Returns true if field startTime is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  public void setStartTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STARTTIME_ISSET_ID, value);
  }

  public long getEndTime() {
    return this.endTime;
  }

  public AggregateQueryReq setEndTime(long endTime) {
    this.endTime = endTime;
    setEndTimeIsSet(true);
    return this;
  }

  public void unsetEndTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ENDTIME_ISSET_ID);
  }

  /** Returns true if field endTime is set (has been assigned a value) and false otherwise */
  public boolean isSetEndTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ENDTIME_ISSET_ID);
  }

  public void setEndTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ENDTIME_ISSET_ID, value);
  }

  /**
   * 
   * @see AggregateType
   */
  @org.apache.thrift.annotation.Nullable
  public AggregateType getAggregateType() {
    return this.aggregateType;
  }

  /**
   * 
   * @see AggregateType
   */
  public AggregateQueryReq setAggregateType(@org.apache.thrift.annotation.Nullable AggregateType aggregateType) {
    this.aggregateType = aggregateType;
    return this;
  }

  public void unsetAggregateType() {
    this.aggregateType = null;
  }

  /** Returns true if field aggregateType is set (has been assigned a value) and false otherwise */
  public boolean isSetAggregateType() {
    return this.aggregateType != null;
  }

  public void setAggregateTypeIsSet(boolean value) {
    if (!value) {
      this.aggregateType = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SESSION_ID:
      if (value == null) {
        unsetSessionId();
      } else {
        setSessionId((java.lang.Long)value);
      }
      break;

    case PATHS:
      if (value == null) {
        unsetPaths();
      } else {
        setPaths((java.util.List<java.lang.String>)value);
      }
      break;

    case START_TIME:
      if (value == null) {
        unsetStartTime();
      } else {
        setStartTime((java.lang.Long)value);
      }
      break;

    case END_TIME:
      if (value == null) {
        unsetEndTime();
      } else {
        setEndTime((java.lang.Long)value);
      }
      break;

    case AGGREGATE_TYPE:
      if (value == null) {
        unsetAggregateType();
      } else {
        setAggregateType((AggregateType)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SESSION_ID:
      return getSessionId();

    case PATHS:
      return getPaths();

    case START_TIME:
      return getStartTime();

    case END_TIME:
      return getEndTime();

    case AGGREGATE_TYPE:
      return getAggregateType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SESSION_ID:
      return isSetSessionId();
    case PATHS:
      return isSetPaths();
    case START_TIME:
      return isSetStartTime();
    case END_TIME:
      return isSetEndTime();
    case AGGREGATE_TYPE:
      return isSetAggregateType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof AggregateQueryReq)
      return this.equals((AggregateQueryReq)that);
    return false;
  }

  public boolean equals(AggregateQueryReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sessionId = true;
    boolean that_present_sessionId = true;
    if (this_present_sessionId || that_present_sessionId) {
      if (!(this_present_sessionId && that_present_sessionId))
        return false;
      if (this.sessionId != that.sessionId)
        return false;
    }

    boolean this_present_paths = true && this.isSetPaths();
    boolean that_present_paths = true && that.isSetPaths();
    if (this_present_paths || that_present_paths) {
      if (!(this_present_paths && that_present_paths))
        return false;
      if (!this.paths.equals(that.paths))
        return false;
    }

    boolean this_present_startTime = true;
    boolean that_present_startTime = true;
    if (this_present_startTime || that_present_startTime) {
      if (!(this_present_startTime && that_present_startTime))
        return false;
      if (this.startTime != that.startTime)
        return false;
    }

    boolean this_present_endTime = true;
    boolean that_present_endTime = true;
    if (this_present_endTime || that_present_endTime) {
      if (!(this_present_endTime && that_present_endTime))
        return false;
      if (this.endTime != that.endTime)
        return false;
    }

    boolean this_present_aggregateType = true && this.isSetAggregateType();
    boolean that_present_aggregateType = true && that.isSetAggregateType();
    if (this_present_aggregateType || that_present_aggregateType) {
      if (!(this_present_aggregateType && that_present_aggregateType))
        return false;
      if (!this.aggregateType.equals(that.aggregateType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(sessionId);

    hashCode = hashCode * 8191 + ((isSetPaths()) ? 131071 : 524287);
    if (isSetPaths())
      hashCode = hashCode * 8191 + paths.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(startTime);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(endTime);

    hashCode = hashCode * 8191 + ((isSetAggregateType()) ? 131071 : 524287);
    if (isSetAggregateType())
      hashCode = hashCode * 8191 + aggregateType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(AggregateQueryReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSessionId()).compareTo(other.isSetSessionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionId, other.sessionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPaths()).compareTo(other.isSetPaths());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPaths()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.paths, other.paths);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStartTime()).compareTo(other.isSetStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startTime, other.startTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEndTime()).compareTo(other.isSetEndTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endTime, other.endTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAggregateType()).compareTo(other.isSetAggregateType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAggregateType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.aggregateType, other.aggregateType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AggregateQueryReq(");
    boolean first = true;

    sb.append("sessionId:");
    sb.append(this.sessionId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("paths:");
    if (this.paths == null) {
      sb.append("null");
    } else {
      sb.append(this.paths);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("startTime:");
    sb.append(this.startTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("endTime:");
    sb.append(this.endTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("aggregateType:");
    if (this.aggregateType == null) {
      sb.append("null");
    } else {
      sb.append(this.aggregateType);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'sessionId' because it's a primitive and you chose the non-beans generator.
    if (paths == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'paths' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'startTime' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'endTime' because it's a primitive and you chose the non-beans generator.
    if (aggregateType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'aggregateType' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AggregateQueryReqStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AggregateQueryReqStandardScheme getScheme() {
      return new AggregateQueryReqStandardScheme();
    }
  }

  private static class AggregateQueryReqStandardScheme extends org.apache.thrift.scheme.StandardScheme<AggregateQueryReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AggregateQueryReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SESSION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.sessionId = iprot.readI64();
              struct.setSessionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PATHS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list142 = iprot.readListBegin();
                struct.paths = new java.util.ArrayList<java.lang.String>(_list142.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem143;
                for (int _i144 = 0; _i144 < _list142.size; ++_i144)
                {
                  _elem143 = iprot.readString();
                  struct.paths.add(_elem143);
                }
                iprot.readListEnd();
              }
              struct.setPathsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // START_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.startTime = iprot.readI64();
              struct.setStartTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // END_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.endTime = iprot.readI64();
              struct.setEndTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // AGGREGATE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.aggregateType = cn.edu.tsinghua.iginx.thrift.AggregateType.findByValue(iprot.readI32());
              struct.setAggregateTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetSessionId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'sessionId' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetStartTime()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'startTime' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetEndTime()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'endTime' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AggregateQueryReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SESSION_ID_FIELD_DESC);
      oprot.writeI64(struct.sessionId);
      oprot.writeFieldEnd();
      if (struct.paths != null) {
        oprot.writeFieldBegin(PATHS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.paths.size()));
          for (java.lang.String _iter145 : struct.paths)
          {
            oprot.writeString(_iter145);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(START_TIME_FIELD_DESC);
      oprot.writeI64(struct.startTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(END_TIME_FIELD_DESC);
      oprot.writeI64(struct.endTime);
      oprot.writeFieldEnd();
      if (struct.aggregateType != null) {
        oprot.writeFieldBegin(AGGREGATE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.aggregateType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AggregateQueryReqTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AggregateQueryReqTupleScheme getScheme() {
      return new AggregateQueryReqTupleScheme();
    }
  }

  private static class AggregateQueryReqTupleScheme extends org.apache.thrift.scheme.TupleScheme<AggregateQueryReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AggregateQueryReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.sessionId);
      {
        oprot.writeI32(struct.paths.size());
        for (java.lang.String _iter146 : struct.paths)
        {
          oprot.writeString(_iter146);
        }
      }
      oprot.writeI64(struct.startTime);
      oprot.writeI64(struct.endTime);
      oprot.writeI32(struct.aggregateType.getValue());
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AggregateQueryReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.sessionId = iprot.readI64();
      struct.setSessionIdIsSet(true);
      {
        org.apache.thrift.protocol.TList _list147 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.paths = new java.util.ArrayList<java.lang.String>(_list147.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _elem148;
        for (int _i149 = 0; _i149 < _list147.size; ++_i149)
        {
          _elem148 = iprot.readString();
          struct.paths.add(_elem148);
        }
      }
      struct.setPathsIsSet(true);
      struct.startTime = iprot.readI64();
      struct.setStartTimeIsSet(true);
      struct.endTime = iprot.readI64();
      struct.setEndTimeIsSet(true);
      struct.aggregateType = cn.edu.tsinghua.iginx.thrift.AggregateType.findByValue(iprot.readI32());
      struct.setAggregateTypeIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
