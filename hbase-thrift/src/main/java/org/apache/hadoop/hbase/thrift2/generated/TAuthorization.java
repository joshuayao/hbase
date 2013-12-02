/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift2.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TAuthorization implements org.apache.thrift.TBase<TAuthorization, TAuthorization._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAuthorization");

  private static final org.apache.thrift.protocol.TField LABELS_FIELD_DESC = new org.apache.thrift.protocol.TField("labels", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TAuthorizationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TAuthorizationTupleSchemeFactory());
  }

  public List<String> labels; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LABELS((short)1, "labels");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LABELS
          return LABELS;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.LABELS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LABELS, new org.apache.thrift.meta_data.FieldMetaData("labels", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAuthorization.class, metaDataMap);
  }

  public TAuthorization() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAuthorization(TAuthorization other) {
    if (other.isSetLabels()) {
      List<String> __this__labels = new ArrayList<String>();
      for (String other_element : other.labels) {
        __this__labels.add(other_element);
      }
      this.labels = __this__labels;
    }
  }

  public TAuthorization deepCopy() {
    return new TAuthorization(this);
  }

  @Override
  public void clear() {
    this.labels = null;
  }

  public int getLabelsSize() {
    return (this.labels == null) ? 0 : this.labels.size();
  }

  public java.util.Iterator<String> getLabelsIterator() {
    return (this.labels == null) ? null : this.labels.iterator();
  }

  public void addToLabels(String elem) {
    if (this.labels == null) {
      this.labels = new ArrayList<String>();
    }
    this.labels.add(elem);
  }

  public List<String> getLabels() {
    return this.labels;
  }

  public TAuthorization setLabels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public void unsetLabels() {
    this.labels = null;
  }

  /** Returns true if field labels is set (has been assigned a value) and false otherwise */
  public boolean isSetLabels() {
    return this.labels != null;
  }

  public void setLabelsIsSet(boolean value) {
    if (!value) {
      this.labels = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LABELS:
      if (value == null) {
        unsetLabels();
      } else {
        setLabels((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LABELS:
      return getLabels();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LABELS:
      return isSetLabels();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TAuthorization)
      return this.equals((TAuthorization)that);
    return false;
  }

  public boolean equals(TAuthorization that) {
    if (that == null)
      return false;

    boolean this_present_labels = true && this.isSetLabels();
    boolean that_present_labels = true && that.isSetLabels();
    if (this_present_labels || that_present_labels) {
      if (!(this_present_labels && that_present_labels))
        return false;
      if (!this.labels.equals(that.labels))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TAuthorization other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TAuthorization typedOther = (TAuthorization)other;

    lastComparison = Boolean.valueOf(isSetLabels()).compareTo(typedOther.isSetLabels());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLabels()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.labels, typedOther.labels);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TAuthorization(");
    boolean first = true;

    if (isSetLabels()) {
      sb.append("labels:");
      if (this.labels == null) {
        sb.append("null");
      } else {
        sb.append(this.labels);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TAuthorizationStandardSchemeFactory implements SchemeFactory {
    public TAuthorizationStandardScheme getScheme() {
      return new TAuthorizationStandardScheme();
    }
  }

  private static class TAuthorizationStandardScheme extends StandardScheme<TAuthorization> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAuthorization struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LABELS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.labels = new ArrayList<String>(_list8.size);
                for (int _i9 = 0; _i9 < _list8.size; ++_i9)
                {
                  String _elem10; // required
                  _elem10 = iprot.readString();
                  struct.labels.add(_elem10);
                }
                iprot.readListEnd();
              }
              struct.setLabelsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAuthorization struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.labels != null) {
        if (struct.isSetLabels()) {
          oprot.writeFieldBegin(LABELS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.labels.size()));
            for (String _iter11 : struct.labels)
            {
              oprot.writeString(_iter11);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAuthorizationTupleSchemeFactory implements SchemeFactory {
    public TAuthorizationTupleScheme getScheme() {
      return new TAuthorizationTupleScheme();
    }
  }

  private static class TAuthorizationTupleScheme extends TupleScheme<TAuthorization> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAuthorization struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLabels()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLabels()) {
        {
          oprot.writeI32(struct.labels.size());
          for (String _iter12 : struct.labels)
          {
            oprot.writeString(_iter12);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAuthorization struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.labels = new ArrayList<String>(_list13.size);
          for (int _i14 = 0; _i14 < _list13.size; ++_i14)
          {
            String _elem15; // required
            _elem15 = iprot.readString();
            struct.labels.add(_elem15);
          }
        }
        struct.setLabelsIsSet(true);
      }
    }
  }

}

