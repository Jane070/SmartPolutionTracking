// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: airqualityservice.proto

package ds.airqualityservice;

public interface AirQualityReadingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:airquality.AirQualityReading)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sensor_id = 1;</code>
   */
  java.lang.String getSensorId();
  /**
   * <code>string sensor_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getSensorIdBytes();

  /**
   * <code>float pm2_5 = 2;</code>
   */
  float getPm25();

  /**
   * <code>float pm10 = 3;</code>
   */
  float getPm10();

  /**
   * <code>float ozone = 4;</code>
   */
  float getOzone();

  /**
   * <code>float nitrogen_dioxide = 5;</code>
   */
  float getNitrogenDioxide();

  /**
   * <code>float sulfur_dioxide = 6;</code>
   */
  float getSulfurDioxide();

  /**
   * <code>int64 timestamp = 7;</code>
   */
  long getTimestamp();
}
