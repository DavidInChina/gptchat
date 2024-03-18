package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.protobuf.r0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2536r0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f27584a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f27585b;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f27585b = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC2543v.h(bArr, 0, 0, false);
    }

    public static void a(String str, Object obj) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static int b(long j6) {
        return (int) (j6 ^ (j6 >>> 32));
    }
}
