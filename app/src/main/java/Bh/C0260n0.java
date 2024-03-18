package Bh;

import android.gov.nist.core.Separators;
import java.io.File;
import java.io.FileOutputStream;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import k6.AbstractC4194d;
import yh.l1;

/* renamed from: Bh.n0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0260n0 implements PrivilegedExceptionAction {

    /* renamed from: a  reason: collision with root package name */
    public final String f2365a;

    /* renamed from: b  reason: collision with root package name */
    public final l1 f2366b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2367c;

    /* renamed from: d  reason: collision with root package name */
    public final long f2368d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f2369e;

    public C0260n0(String str, l1 l1Var, boolean z10, long j6, byte[] bArr) {
        this.f2365a = str;
        this.f2366b = l1Var;
        this.f2367c = z10;
        this.f2368d = j6;
        this.f2369e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0260n0.class != obj.getClass()) {
            return false;
        }
        C0260n0 c0260n0 = (C0260n0) obj;
        if (this.f2367c == c0260n0.f2367c && this.f2368d == c0260n0.f2368d && this.f2365a.equals(c0260n0.f2365a) && this.f2366b.equals(c0260n0.f2366b) && Arrays.equals(this.f2369e, c0260n0.f2369e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v10 = E9.f.v(this.f2365a, C0260n0.class.hashCode() * 31, 31);
        long j6 = this.f2368d;
        return Arrays.hashCode(this.f2369e) + ((((AbstractC4194d.t(this.f2366b, v10, 31) + (this.f2367c ? 1 : 0)) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31);
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2366b.getName());
        if (this.f2367c) {
            str = "-original.";
        } else {
            str = Separators.DOT;
        }
        sb2.append(str);
        File file = new File(this.f2365a, android.gov.nist.core.a.m(sb2, this.f2368d, ".class"));
        io.sentry.instrumentation.file.e p10 = r.f.p(new FileOutputStream(file), file);
        try {
            p10.write(this.f2369e);
            p10.close();
            return null;
        } catch (Throwable th2) {
            p10.close();
            throw th2;
        }
    }
}
