package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public class D extends IOException {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, androidx.datastore.preferences.protobuf.D] */
    public static D a() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, androidx.datastore.preferences.protobuf.C] */
    public static C b() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, androidx.datastore.preferences.protobuf.D] */
    public static D c() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, androidx.datastore.preferences.protobuf.D] */
    public static D d() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, androidx.datastore.preferences.protobuf.D] */
    public static D e() {
        return new IOException("Failed to parse the message.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, androidx.datastore.preferences.protobuf.D] */
    public static D f() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
