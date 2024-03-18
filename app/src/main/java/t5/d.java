package t5;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f45750c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f45751a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f45752b;

    public d(byte[] bArr, byte[] bArr2) {
        AbstractC3557B.c0("data", bArr);
        AbstractC3557B.c0("metadata", bArr2);
        this.f45751a = bArr;
        this.f45752b = bArr2;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(d.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type com.datadog.android.api.storage.RawBatchEvent", obj);
        d dVar = (d) obj;
        if (Arrays.equals(this.f45751a, dVar.f45751a) && Arrays.equals(this.f45752b, dVar.f45752b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45752b) + (Arrays.hashCode(this.f45751a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f45751a);
        String arrays2 = Arrays.toString(this.f45752b);
        return "RawBatchEvent(data=" + arrays + ", metadata=" + arrays2 + Separators.RPAREN;
    }

    public /* synthetic */ d(byte[] bArr) {
        this(bArr, f45750c);
    }
}
