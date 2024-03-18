package androidx.glance.appwidget.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class A {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f25144a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f25145b;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f25145b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C2051k(bArr, 0, 0, false).e(0);
        } catch (C e10) {
            throw new IllegalArgumentException(e10);
        }
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
