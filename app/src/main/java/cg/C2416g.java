package cg;

import id.AbstractC3557B;
import y.AbstractC6463a;

/* renamed from: cg.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2416g {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC2415f f26632a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f26633b;

    public C2416g(EnumC2415f enumC2415f, boolean z10) {
        this.f26632a = enumC2415f;
        this.f26633b = z10;
    }

    public static C2416g a(C2416g c2416g, EnumC2415f enumC2415f, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            enumC2415f = c2416g.f26632a;
        }
        if ((i10 & 2) != 0) {
            z10 = c2416g.f26633b;
        }
        c2416g.getClass();
        AbstractC3557B.c0("qualifier", enumC2415f);
        return new C2416g(enumC2415f, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2416g)) {
            return false;
        }
        C2416g c2416g = (C2416g) obj;
        if (this.f26632a == c2416g.f26632a && this.f26633b == c2416g.f26633b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f26632a.hashCode() * 31;
        if (this.f26633b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb2.append(this.f26632a);
        sb2.append(", isForWarningOnly=");
        return AbstractC6463a.l(sb2, this.f26633b, ')');
    }
}
