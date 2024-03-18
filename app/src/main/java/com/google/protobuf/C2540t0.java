package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.t0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2540t0 extends IOException {

    /* renamed from: Y  reason: collision with root package name */
    public boolean f27601Y;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.t0, java.io.IOException] */
    public static C2540t0 a() {
        return new IOException("Protocol message contained an invalid tag (zero).");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.t0, java.io.IOException] */
    public static C2540t0 b() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.protobuf.s0] */
    public static C2538s0 c() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.t0, java.io.IOException] */
    public static C2540t0 d() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.t0, java.io.IOException] */
    public static C2540t0 e() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.t0, java.io.IOException] */
    public static C2540t0 f() {
        return new IOException("Failed to parse the message.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.t0, java.io.IOException] */
    public static C2540t0 g() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
