// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

public interface FeedFollowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.FeedFollow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional .google.protobuf.Timestamp createdAt = 2;</code>
   */
  boolean hasCreatedAt();
  /**
   * <code>optional .google.protobuf.Timestamp createdAt = 2;</code>
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>optional .google.protobuf.Timestamp createdAt = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>optional .proto.FeedCategoryEnum feed = 3;</code>
   */
  int getFeedValue();
  /**
   * <code>optional .proto.FeedCategoryEnum feed = 3;</code>
   */
  proto.FeedCategoryEnum getFeed();

  /**
   * <code>optional .google.protobuf.Timestamp publishedAt = 4;</code>
   */
  boolean hasPublishedAt();
  /**
   * <code>optional .google.protobuf.Timestamp publishedAt = 4;</code>
   */
  com.google.protobuf.Timestamp getPublishedAt();
  /**
   * <code>optional .google.protobuf.Timestamp publishedAt = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getPublishedAtOrBuilder();

  /**
   * <code>optional .google.protobuf.Timestamp updatedAt = 5;</code>
   */
  boolean hasUpdatedAt();
  /**
   * <code>optional .google.protobuf.Timestamp updatedAt = 5;</code>
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>optional .google.protobuf.Timestamp updatedAt = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <code>optional .proto.User user = 6;</code>
   */
  boolean hasUser();
  /**
   * <code>optional .proto.User user = 6;</code>
   */
  proto.User getUser();
  /**
   * <code>optional .proto.User user = 6;</code>
   */
  proto.UserOrBuilder getUserOrBuilder();
}
