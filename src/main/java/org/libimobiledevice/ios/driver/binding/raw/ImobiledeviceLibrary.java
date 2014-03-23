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

package org.libimobiledevice.ios.driver.binding.raw;
import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.List;

/**
 * JNA Wrapper for library <b>imobiledevice</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ImobiledeviceLibrary implements Library {

        private static final boolean initialized = JNAInit.init();
	public static final String JNA_LIBRARY_NAME = "imobiledevice";

	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(ImobiledeviceLibrary.JNA_LIBRARY_NAME);

	static {
		Native.register(ImobiledeviceLibrary.class, ImobiledeviceLibrary.JNA_NATIVE_LIB);
	}
	public static interface idevice_event_type {
		public static final int IDEVICE_DEVICE_ADD = 1;
		public static final int IDEVICE_DEVICE_REMOVE = 2;
	};
	public static final int LOCKDOWN_E_DICT_ERROR = (int)-6;
	public static final int WEBINSPECTOR_E_UNKNOWN_ERROR = (int)-256;
	public static final int WEBINSPECTOR_E_SSL_ERROR = (int)-4;
	public static final int LOCKDOWN_E_SUCCESS = (int)0;
	public static final int IDEVICE_E_UNKNOWN_ERROR = (int)-2;
	public static final int LOCKDOWN_E_INVALID_ARG = (int)-1;
	public static final int LOCKDOWN_E_UNKNOWN_ERROR = (int)-256;
	public static final int LOCKDOWN_E_START_SERVICE_FAILED = (int)-7;
	public static final int LOCKDOWN_E_INVALID_HOST_ID = (int)-16;
	public static final int LOCKDOWN_E_GET_VALUE_PROHIBITED = (int)-10;
	public static final int LOCKDOWN_E_NOT_ENOUGH_DATA = (int)-8;
	public static final int LOCKDOWN_E_INVALID_ACTIVATION_RECORD = (int)-18;
	public static final int WEBINSPECTOR_E_SUCCESS = (int)0;
	public static final int IDEVICE_E_NO_DEVICE = (int)-3;
	public static final String WEBINSPECTOR_SERVICE_NAME = (String)"com.apple.webinspector";
	public static final int LOCKDOWN_E_PAIRING_FAILED = (int)-4;
	public static final int LOCKDOWN_E_NO_RUNNING_SESSION = (int)-15;
	public static final int WEBINSPECTOR_E_PLIST_ERROR = (int)-2;
	public static final int IDEVICE_E_NOT_ENOUGH_DATA = (int)-4;
	public static final int WEBINSPECTOR_E_MUX_ERROR = (int)-3;
	public static final int WEBINSPECTOR_E_INVALID_ARG = (int)-1;
	public static final int LOCKDOWN_E_REMOVE_VALUE_PROHIBITED = (int)-11;
	public static final int LOCKDOWN_E_ACTIVATION_FAILED = (int)-13;
	public static final int LOCKDOWN_E_SSL_ERROR = (int)-5;
	public static final int LOCKDOWN_E_INVALID_SERVICE = (int)-17;
	public static final int LOCKDOWN_E_SET_VALUE_PROHIBITED = (int)-9;
	public static final int IDEVICE_E_SUCCESS = (int)0;
	public static final int LOCKDOWN_E_INVALID_CONF = (int)-2;
	public static final int LOCKDOWN_E_PASSWORD_PROTECTED = (int)-14;
	public static final int LOCKDOWN_E_MUX_ERROR = (int)-12;
	public static final int IDEVICE_E_SSL_ERROR = (int)-6;
	public static final int LOCKDOWN_E_PLIST_ERROR = (int)-3;
	public static final int IDEVICE_E_INVALID_ARG = (int)-1;
	public static final int IDEVICE_E_BAD_HEADER = (int)-5;
	public static class idevice_event_t extends Structure {
		/**
		 * @see idevice_event_type<br>
		 * < The event type.
		 */
		public int event;
		/** < The device unique id. */
		public String udid;
		/** < The connection type. Currently only 1 for usbmuxd. */
		public int conn_type;
		public idevice_event_t() {
			super();
		}
		protected List<? > getFieldOrder() {
			return Arrays.asList("event", "udid", "conn_type");
		}
		public idevice_event_t(int event, String udid, int conn_type) {
			super();
			this.event = event;
			this.udid = udid;
			this.conn_type = conn_type;
		}
		public static class ByReference extends idevice_event_t implements Structure.ByReference {

		};
		public static class ByValue extends idevice_event_t implements Structure.ByValue {

		};
	};
	public static class lockdownd_pair_record extends Structure {
		/** < The device certificate */
		public String device_certificate;
		/** < The host certificate */
		public String host_certificate;
		/** < A unique HostID for the host computer */
		public String host_id;
		/** < The root certificate */
		public String root_certificate;
		public lockdownd_pair_record() {
			super();
		}
		protected List<? > getFieldOrder() {
			return Arrays.asList("device_certificate", "host_certificate", "host_id", "root_certificate");
		}
		public lockdownd_pair_record(String device_certificate, String host_certificate, String host_id, String root_certificate) {
			super();
			this.device_certificate = device_certificate;
			this.host_certificate = host_certificate;
			this.host_id = host_id;
			this.root_certificate = root_certificate;
		}
		public static class ByReference extends lockdownd_pair_record implements Structure.ByReference {

		};
		public static class ByValue extends lockdownd_pair_record implements Structure.ByValue {

		};
	};
	public static class lockdownd_service_descriptor extends Structure {
		public short port;
		public byte ssl_enabled;
		public lockdownd_service_descriptor() {
			super();
		}
		protected List<? > getFieldOrder() {
			return Arrays.asList("port", "ssl_enabled");
		}
		public lockdownd_service_descriptor(short port, byte ssl_enabled) {
			super();
			this.port = port;
			this.ssl_enabled = ssl_enabled;
		}
		public static class ByReference extends lockdownd_service_descriptor implements Structure.ByReference {

		};
		public static class ByValue extends lockdownd_service_descriptor implements Structure.ByValue {

		};
	};
	public interface idevice_event_cb_t extends Callback {
		void apply(ImobiledeviceLibrary.idevice_event_t event, Pointer user_data);
	};
	public static native void idevice_set_debug_level(int level);
	public static native short idevice_event_subscribe(ImobiledeviceLibrary.idevice_event_cb_t callback, Pointer user_data);
	public static native short idevice_event_unsubscribe();
	@Deprecated
	public static native short idevice_get_device_list(PointerByReference devices, IntByReference count);
	public static native short idevice_get_device_list(PointerByReference devices, IntBuffer count);
	public static native short idevice_device_list_free(PointerByReference devices);
	@Deprecated
	public static native short idevice_new(Pointer device, Pointer udid);
	public static native short idevice_new(PointerByReference device, String udid);
	public static native short idevice_new(PointerByReference device, Pointer udid);
	@Deprecated
	public static native short idevice_free(Pointer device);
	public static native short idevice_free(idevice_t device);
	@Deprecated
	public static native short idevice_connect(Pointer device, short port, Pointer connection);
	public static native short idevice_connect(idevice_t device, short port, PointerByReference connection);
	public static native short idevice_connect(Pointer device, short port, PointerByReference connection);
	@Deprecated
	public static native short idevice_disconnect(Pointer connection);
	public static native short idevice_disconnect(ImobiledeviceLibrary.idevice_connection_t connection);
	@Deprecated
	public static native short idevice_connection_send(Pointer connection, Pointer data, int len, IntByReference sent_bytes);
	public static native short idevice_connection_send(ImobiledeviceLibrary.idevice_connection_t connection, String data, int len, IntBuffer sent_bytes);
	@Deprecated
	public static native short idevice_connection_receive_timeout(Pointer connection, Pointer data, int len, IntByReference recv_bytes, int timeout);
	public static native short idevice_connection_receive_timeout(ImobiledeviceLibrary.idevice_connection_t connection, ByteBuffer data, int len, IntBuffer recv_bytes, int timeout);
	@Deprecated
	public static native short idevice_connection_receive(Pointer connection, Pointer data, int len, IntByReference recv_bytes);
	public static native short idevice_connection_receive(ImobiledeviceLibrary.idevice_connection_t connection, ByteBuffer data, int len, IntBuffer recv_bytes);
	@Deprecated
	public static native short idevice_connection_enable_ssl(Pointer connection);
	public static native short idevice_connection_enable_ssl(ImobiledeviceLibrary.idevice_connection_t connection);
	@Deprecated
	public static native short idevice_connection_disable_ssl(Pointer connection);
	public static native short idevice_connection_disable_ssl(ImobiledeviceLibrary.idevice_connection_t connection);
	@Deprecated
	public static native short idevice_get_handle(Pointer device, IntByReference handle);
	public static native short idevice_get_handle(idevice_t device, IntBuffer handle);
	@Deprecated
	public static native short idevice_get_udid(Pointer device, PointerByReference udid);
	public static native short idevice_get_udid(idevice_t device, PointerByReference udid);
	@Deprecated
	public static native short lockdownd_client_new(Pointer device, Pointer client, Pointer label);
	public static native short lockdownd_client_new(idevice_t device, PointerByReference client, String label);
	public static native short lockdownd_client_new(Pointer device, PointerByReference client, Pointer label);
	@Deprecated
	public static native short lockdownd_client_new_with_handshake(Pointer device, Pointer client, Pointer label);
	public static native short lockdownd_client_new_with_handshake(idevice_t device, PointerByReference client, String label);
	public static native short lockdownd_client_new_with_handshake(Pointer device, PointerByReference client, Pointer label);
	@Deprecated
	public static native short lockdownd_client_free(Pointer client);
	public static native short lockdownd_client_free(ImobiledeviceLibrary.lockdownd_client_t client);
	@Deprecated
	public static native short lockdownd_query_type(Pointer client, PointerByReference type);
	public static native short lockdownd_query_type(ImobiledeviceLibrary.lockdownd_client_t client, PointerByReference type);
	@Deprecated
	public static native short lockdownd_get_value(Pointer client, Pointer domain, Pointer key, PointerByReference value);
	public static native short lockdownd_get_value(ImobiledeviceLibrary.lockdownd_client_t client, String domain, String key, PointerByReference value);
	@Deprecated
	public static native short lockdownd_set_value(Pointer client, Pointer domain, Pointer key, Pointer value);
	public static native short lockdownd_set_value(ImobiledeviceLibrary.lockdownd_client_t client, String domain, String key, Pointer value);
	@Deprecated
	public static native short lockdownd_remove_value(Pointer client, Pointer domain, Pointer key);
	public static native short lockdownd_remove_value(ImobiledeviceLibrary.lockdownd_client_t client, String domain, String key);
	@Deprecated
//	public static native short lockdownd_start_service(Pointer client, Pointer identifier, PointerByReference service);
	public static native short lockdownd_start_service(ImobiledeviceLibrary.lockdownd_client_t client, String identifier, PointerByReference service);
	public static native short lockdownd_start_service(Pointer client, Pointer identifier, PointerByReference service);
	@Deprecated
	public static native short lockdownd_start_session(Pointer client, Pointer host_id, PointerByReference session_id, IntByReference ssl_enabled);
	public static native short lockdownd_start_session(ImobiledeviceLibrary.lockdownd_client_t client, String host_id, PointerByReference session_id, IntBuffer ssl_enabled);
	@Deprecated
	public static native short lockdownd_stop_session(Pointer client, Pointer session_id);
	public static native short lockdownd_stop_session(ImobiledeviceLibrary.lockdownd_client_t client, String session_id);
	@Deprecated
	public static native short lockdownd_send(Pointer client, Pointer plist);
	public static native short lockdownd_send(ImobiledeviceLibrary.lockdownd_client_t client, Pointer plist);
	@Deprecated
	public static native short lockdownd_receive(Pointer client, PointerByReference plist);
	public static native short lockdownd_receive(ImobiledeviceLibrary.lockdownd_client_t client, PointerByReference plist);
	@Deprecated
	public static native short lockdownd_pair(Pointer client, ImobiledeviceLibrary.lockdownd_pair_record pair_record);
	public static native short lockdownd_pair(ImobiledeviceLibrary.lockdownd_client_t client, ImobiledeviceLibrary.lockdownd_pair_record pair_record);
	@Deprecated
	public static native short lockdownd_validate_pair(Pointer client, ImobiledeviceLibrary.lockdownd_pair_record pair_record);
	public static native short lockdownd_validate_pair(ImobiledeviceLibrary.lockdownd_client_t client, ImobiledeviceLibrary.lockdownd_pair_record pair_record);
	@Deprecated
	public static native short lockdownd_unpair(Pointer client, ImobiledeviceLibrary.lockdownd_pair_record pair_record);
	public static native short lockdownd_unpair(ImobiledeviceLibrary.lockdownd_client_t client, ImobiledeviceLibrary.lockdownd_pair_record pair_record);
	@Deprecated
	public static native short lockdownd_activate(Pointer client, Pointer activation_record);
	public static native short lockdownd_activate(ImobiledeviceLibrary.lockdownd_client_t client, Pointer activation_record);
	@Deprecated
	public static native short lockdownd_deactivate(Pointer client);
	public static native short lockdownd_deactivate(ImobiledeviceLibrary.lockdownd_client_t client);
	@Deprecated
	public static native short lockdownd_enter_recovery(Pointer client);
	public static native short lockdownd_enter_recovery(ImobiledeviceLibrary.lockdownd_client_t client);
	@Deprecated
	public static native short lockdownd_goodbye(Pointer client);
	public static native short lockdownd_goodbye(ImobiledeviceLibrary.lockdownd_client_t client);
	@Deprecated
	public static native void lockdownd_client_set_label(Pointer client, Pointer label);
	public static native void lockdownd_client_set_label(ImobiledeviceLibrary.lockdownd_client_t client, String label);
	@Deprecated
	public static native short lockdownd_get_device_udid(Pointer control, PointerByReference udid);
	public static native short lockdownd_get_device_udid(ImobiledeviceLibrary.lockdownd_client_t control, PointerByReference udid);
	@Deprecated
	public static native short lockdownd_get_device_name(Pointer client, PointerByReference device_name);
	public static native short lockdownd_get_device_name(ImobiledeviceLibrary.lockdownd_client_t client, PointerByReference device_name);
	@Deprecated
	public static native short lockdownd_get_sync_data_classes(Pointer client, PointerByReference classes, IntByReference count);
	public static native short lockdownd_get_sync_data_classes(ImobiledeviceLibrary.lockdownd_client_t client, PointerByReference classes, IntBuffer count);
	public static native short lockdownd_data_classes_free(PointerByReference classes);
	public static native short lockdownd_service_descriptor_free(ImobiledeviceLibrary.lockdownd_service_descriptor service);
	@Deprecated
	public static native short webinspector_client_new(Pointer device, ImobiledeviceLibrary.lockdownd_service_descriptor service, Pointer client);
	public static native short webinspector_client_new(idevice_t device, ImobiledeviceLibrary.lockdownd_service_descriptor service, PointerByReference client);
	public static native short webinspector_client_new(Pointer device, ImobiledeviceLibrary.lockdownd_service_descriptor service, PointerByReference client);
	@Deprecated
	public static native short webinspector_client_start_service(Pointer device, Pointer client, Pointer label);
	public static native short webinspector_client_start_service(idevice_t device, PointerByReference client, String label);
	public static native short webinspector_client_start_service(Pointer device, PointerByReference client, Pointer label);
	@Deprecated
	public static native short webinspector_client_free(Pointer client);
	public static native short webinspector_client_free(ImobiledeviceLibrary.webinspector_client_t client);
	@Deprecated
	public static native short webinspector_send(Pointer client, Pointer plist);
	public static native short webinspector_send(ImobiledeviceLibrary.webinspector_client_t client, Pointer plist);
	@Deprecated
	public static native short webinspector_receive(Pointer client, PointerByReference plist);
	public static native short webinspector_receive(ImobiledeviceLibrary.webinspector_client_t client, PointerByReference plist);
	@Deprecated
	public static native short webinspector_receive_with_timeout(Pointer client, PointerByReference plist, int timeout_ms);
	public static native short webinspector_receive_with_timeout(ImobiledeviceLibrary.webinspector_client_t client, PointerByReference plist, int timeout_ms);
	/** Pointer to unknown (opaque) type */
	public static class lockdownd_client_t extends PointerType {
		public lockdownd_client_t(Pointer address) {
			super(address);
		}
		public lockdownd_client_t() {
			super();
		}
	};
	/** Pointer to unknown (opaque) type */
	public static class webinspector_client_t extends PointerType {
		public webinspector_client_t(Pointer address) {
			super(address);
		}
		public webinspector_client_t() {
			super();
		}
	};
	/** Pointer to unknown (opaque) type */
	public static class idevice_connection_t extends PointerType {
		public idevice_connection_t(Pointer address) {
			super(address);
		}
		public idevice_connection_t() {
			super();
		}
	};
        /** Pointer to unknown (opaque) type */
        public static class idevice_t extends PointerType {
          public idevice_t(Pointer address) {
            super(address);
          }
          public idevice_t() {
            super();
          }
        };
}
