package F5;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.List;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final d f5034a;

    /* renamed from: b  reason: collision with root package name */
    public final List f5035b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f5036c;

    public c(d dVar, List list, byte[] bArr) {
        AbstractC3557B.c0("data", list);
        this.f5034a = dVar;
        this.f5035b = list;
        this.f5036c = bArr;
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
        if (!AbstractC3557B.K(c.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type com.datadog.android.core.internal.persistence.BatchData", obj);
        c cVar = (c) obj;
        if (!AbstractC3557B.K(this.f5034a, cVar.f5034a) || !AbstractC3557B.K(this.f5035b, cVar.f5035b)) {
            return false;
        }
        byte[] bArr = cVar.f5036c;
        byte[] bArr2 = this.f5036c;
        if (bArr2 != null) {
            if (bArr == null || !Arrays.equals(bArr2, bArr)) {
                return false;
            }
        } else if (bArr != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int s10 = AbstractC4194d.s(this.f5035b, this.f5034a.f5037a.hashCode() * 31, 31);
        byte[] bArr = this.f5036c;
        if (bArr != null) {
            i10 = Arrays.hashCode(bArr);
        } else {
            i10 = 0;
        }
        return s10 + i10;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f5036c);
        return "BatchData(id=" + this.f5034a + ", data=" + this.f5035b + ", metadata=" + arrays + Separators.RPAREN;
    }
}
