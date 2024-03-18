package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f24959a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f24960b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f24960b = bArr;
        ByteBuffer.wrap(bArr);
        if ((0 - 0) + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw D.f();
        } catch (D e10) {
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

    public static AbstractC2040z c(Object obj, Object obj2) {
        AbstractC2040z abstractC2040z = (AbstractC2040z) ((AbstractC2011b) obj);
        AbstractC2038x abstractC2038x = (AbstractC2038x) abstractC2040z.d(5);
        abstractC2038x.d(abstractC2040z);
        AbstractC2011b abstractC2011b = (AbstractC2011b) obj2;
        if (abstractC2038x.f25126Y.getClass().isInstance(abstractC2011b)) {
            abstractC2038x.d((AbstractC2040z) abstractC2011b);
            return abstractC2038x.b();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
