/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.libtorrent4j.swig;

public class storage_error {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected storage_error(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(storage_error obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_storage_error(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public storage_error() {
    this(libtorrent_jni.new_storage_error__SWIG_0(), true);
  }

  public storage_error(error_code e) {
    this(libtorrent_jni.new_storage_error__SWIG_1(error_code.getCPtr(e), e), true);
  }

  public storage_error(error_code e, operation_t op) {
    this(libtorrent_jni.new_storage_error__SWIG_2(error_code.getCPtr(e), e, op.swigValue()), true);
  }

  public storage_error(error_code e, int f, operation_t op) {
    this(libtorrent_jni.new_storage_error__SWIG_3(error_code.getCPtr(e), e, f, op.swigValue()), true);
  }

  public boolean to_bool() {
    return libtorrent_jni.storage_error_to_bool(swigCPtr, this);
  }

  public void setEc(error_code value) {
    libtorrent_jni.storage_error_ec_set(swigCPtr, this, error_code.getCPtr(value), value);
  }

  public error_code getEc() {
    long cPtr = libtorrent_jni.storage_error_ec_get(swigCPtr, this);
    return (cPtr == 0) ? null : new error_code(cPtr, false);
  }

  public int file() {
    return libtorrent_jni.storage_error_file__SWIG_0(swigCPtr, this);
  }

  public void file(int f) {
    libtorrent_jni.storage_error_file__SWIG_1(swigCPtr, this, f);
  }

  public void setOperation(operation_t value) {
    libtorrent_jni.storage_error_operation_set(swigCPtr, this, value.swigValue());
  }

  public operation_t getOperation() {
    return operation_t.swigToEnum(libtorrent_jni.storage_error_operation_get(swigCPtr, this));
  }

}
