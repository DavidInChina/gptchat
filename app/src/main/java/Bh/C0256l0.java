package Bh;

import java.security.AccessController;
import yh.l1;

/* renamed from: Bh.l0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0256l0 implements AbstractC0258m0 {

    /* renamed from: Y  reason: collision with root package name */
    public final String f2361Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f2362Z;

    public C0256l0(long j6, String str) {
        this.f2361Y = str;
        this.f2362Z = j6;
    }

    @Override // Bh.AbstractC0258m0
    public final void a(l1 l1Var, boolean z10, byte[] bArr) {
        try {
            C0260n0 c0260n0 = new C0260n0(this.f2361Y, l1Var, z10, this.f2362Z, bArr);
            if (R0.f2248v) {
                AccessController.doPrivileged(c0260n0);
            } else {
                c0260n0.run();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0256l0.class != obj.getClass()) {
            return false;
        }
        C0256l0 c0256l0 = (C0256l0) obj;
        if (this.f2362Z == c0256l0.f2362Z && this.f2361Y.equals(c0256l0.f2361Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v10 = E9.f.v(this.f2361Y, C0256l0.class.hashCode() * 31, 31);
        long j6 = this.f2362Z;
        return v10 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
