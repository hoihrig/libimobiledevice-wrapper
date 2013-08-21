/*
 * Copyright 2012-2013 eBay Software Foundation and ios-driver committers
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.libimobiledevice.ios.driver.binding;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;
import com.sun.jna.ptr.DoubleByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.LongByReference;
import com.sun.jna.ptr.PointerByReference;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
/**
 * JNA Wrapper for library <b>plist</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class PlistLibrary implements Library {
	public static final String JNA_LIBRARY_NAME = "plist";
	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(PlistLibrary.JNA_LIBRARY_NAME);
	static {
		Native.register(PlistLibrary.class, PlistLibrary.JNA_NATIVE_LIB);
	}
	public static interface plist_type {
		public static final int PLIST_BOOLEAN = 0;
		public static final int PLIST_UINT = 1;
		public static final int PLIST_REAL = 2;
		public static final int PLIST_STRING = 3;
		public static final int PLIST_ARRAY = 4;
		public static final int PLIST_DICT = 5;
		public static final int PLIST_DATE = 6;
		public static final int PLIST_DATA = 7;
		public static final int PLIST_KEY = 8;
		public static final int PLIST_UID = 9;
		public static final int PLIST_NONE = 10;
	};
	public static native Pointer plist_new_dict();
	public static native Pointer plist_new_array();
	@Deprecated 
	public static native Pointer plist_new_string(Pointer val);
	public static native Pointer plist_new_string(String val);
	public static native Pointer plist_new_bool(byte val);
	public static native Pointer plist_new_uint(long val);
	public static native Pointer plist_new_real(double val);
	@Deprecated 
	public static native Pointer plist_new_data(Pointer val, long length);
	public static native Pointer plist_new_data(String val, long length);
	public static native Pointer plist_new_date(int sec, int usec);
	public static native Pointer plist_new_uid(long val);
	public static native void plist_free(Pointer plist);
	public static native Pointer plist_copy(Pointer node);
	public static native int plist_array_get_size(Pointer node);
	public static native Pointer plist_array_get_item(Pointer node, int n);
	public static native int plist_array_get_item_index(Pointer node);
	public static native void plist_array_set_item(Pointer node, Pointer item, int n);
	public static native void plist_array_append_item(Pointer node, Pointer item);
	public static native void plist_array_insert_item(Pointer node, Pointer item, int n);
	public static native void plist_array_remove_item(Pointer node, int n);
	public static native int plist_dict_get_size(Pointer node);
	public static native void plist_dict_new_iter(Pointer node, PointerByReference iter);
	public static native void plist_dict_next_item(Pointer node, Pointer iter, PointerByReference key, PointerByReference val);
	public static native void plist_dict_get_item_key(Pointer node, PointerByReference key);
	@Deprecated 
	public static native Pointer plist_dict_get_item(Pointer node, Pointer key);
	public static native Pointer plist_dict_get_item(Pointer node, String key);
	@Deprecated 
	public static native void plist_dict_set_item(Pointer node, Pointer key, Pointer item);
	public static native void plist_dict_set_item(Pointer node, String key, Pointer item);
	@Deprecated 
	public static native void plist_dict_insert_item(Pointer node, Pointer key, Pointer item);
	public static native void plist_dict_insert_item(Pointer node, String key, Pointer item);
	@Deprecated 
	public static native void plist_dict_remove_item(Pointer node, Pointer key);
	public static native void plist_dict_remove_item(Pointer node, String key);
	public static native Pointer plist_get_parent(Pointer node);
	public static native int plist_get_node_type(Pointer node);
	public static native void plist_get_key_val(Pointer node, PointerByReference val);
	public static native void plist_get_string_val(Pointer node, PointerByReference val);
	@Deprecated 
	public static native void plist_get_bool_val(Pointer node, Pointer val);
	public static native void plist_get_bool_val(Pointer node, ByteBuffer val);
	@Deprecated 
	public static native void plist_get_uint_val(Pointer node, LongByReference val);
	public static native void plist_get_uint_val(Pointer node, LongBuffer val);
	@Deprecated 
	public static native void plist_get_real_val(Pointer node, DoubleByReference val);
	public static native void plist_get_real_val(Pointer node, DoubleBuffer val);
	@Deprecated 
	public static native void plist_get_data_val(Pointer node, PointerByReference val, LongByReference length);
	public static native void plist_get_data_val(Pointer node, PointerByReference val, LongBuffer length);
	@Deprecated 
	public static native void plist_get_date_val(Pointer node, IntByReference sec, IntByReference usec);
	public static native void plist_get_date_val(Pointer node, IntBuffer sec, IntBuffer usec);
	@Deprecated 
	public static native void plist_get_uid_val(Pointer node, LongByReference val);
	public static native void plist_get_uid_val(Pointer node, LongBuffer val);
	public static native void plist_set_type(Pointer node, int type);
	@Deprecated 
	public static native void plist_set_key_val(Pointer node, Pointer val);
	public static native void plist_set_key_val(Pointer node, String val);
	@Deprecated 
	public static native void plist_set_string_val(Pointer node, Pointer val);
	public static native void plist_set_string_val(Pointer node, String val);
	public static native void plist_set_bool_val(Pointer node, byte val);
	public static native void plist_set_uint_val(Pointer node, long val);
	public static native void plist_set_real_val(Pointer node, double val);
	@Deprecated 
	public static native void plist_set_data_val(Pointer node, Pointer val, long length);
	public static native void plist_set_data_val(Pointer node, String val, long length);
	public static native void plist_set_date_val(Pointer node, int sec, int usec);
	public static native void plist_set_uid_val(Pointer node, long val);
	@Deprecated 
	public static native void plist_to_xml(Pointer plist, PointerByReference plist_xml, IntByReference length);
	public static native void plist_to_xml(Pointer plist, PointerByReference plist_xml, IntBuffer length);
	@Deprecated 
	public static native void plist_to_bin(Pointer plist, PointerByReference plist_bin, IntByReference length);
	public static native void plist_to_bin(Pointer plist, PointerByReference plist_bin, IntBuffer length);
	@Deprecated 
	public static native void plist_from_xml(Pointer plist_xml, int length, PointerByReference plist);
	public static native void plist_from_xml(String plist_xml, int length, PointerByReference plist);
	@Deprecated 
	public static native void plist_from_bin(Pointer plist_bin, int length, PointerByReference plist);
	public static native void plist_from_bin(String plist_bin, int length, PointerByReference plist);
	public static native byte plist_compare_node_value(Pointer node_l, Pointer node_r);
	/** Pointer to unknown (opaque) type */
	public static class va_list extends PointerType {
		public va_list(Pointer address) {
			super(address);
		}
		public va_list() {
			super();
		}
	};
}