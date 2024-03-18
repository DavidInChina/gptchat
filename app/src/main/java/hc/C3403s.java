package hc;

import Uc.EnumC1427l;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;

/* renamed from: hc.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3403s implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC1427l f32216a;

    /* renamed from: b  reason: collision with root package name */
    public final Ba.c f32217b;

    /* renamed from: c  reason: collision with root package name */
    public final T0.z f32218c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f32219d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f32220e;

    public C3403s(EnumC1427l enumC1427l, Ba.c cVar, T0.z zVar, boolean z10, boolean z11) {
        AbstractC3557B.c0("value", zVar);
        this.f32216a = enumC1427l;
        this.f32217b = cVar;
        this.f32218c = zVar;
        this.f32219d = z10;
        this.f32220e = z11;
    }

    public static C3403s e(C3403s c3403s, Ba.c cVar, T0.z zVar, boolean z10, boolean z11, int i10) {
        EnumC1427l enumC1427l = c3403s.f32216a;
        if ((i10 & 2) != 0) {
            cVar = c3403s.f32217b;
        }
        Ba.c cVar2 = cVar;
        if ((i10 & 4) != 0) {
            zVar = c3403s.f32218c;
        }
        T0.z zVar2 = zVar;
        if ((i10 & 8) != 0) {
            z10 = c3403s.f32219d;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = c3403s.f32220e;
        }
        c3403s.getClass();
        AbstractC3557B.c0("instruction", enumC1427l);
        AbstractC3557B.c0("value", zVar2);
        return new C3403s(enumC1427l, cVar2, zVar2, z12, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3403s)) {
            return false;
        }
        C3403s c3403s = (C3403s) obj;
        if (this.f32216a == c3403s.f32216a && AbstractC3557B.K(this.f32217b, c3403s.f32217b) && AbstractC3557B.K(this.f32218c, c3403s.f32218c) && this.f32219d == c3403s.f32219d && this.f32220e == c3403s.f32220e) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r4 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        return !id.AbstractC3557B.K(r3, r5.f32218c.f16830a.f12512Y);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r4 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        r3 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f() {
        int ordinal = this.f32216a.ordinal();
        Ba.c cVar = this.f32217b;
        String str = "";
        String str2 = null;
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (cVar != null) {
                    str2 = cVar.f2010c;
                }
            } else {
                throw new RuntimeException();
            }
        } else if (cVar != null) {
            str2 = cVar.f2009b;
        }
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f32216a.hashCode() * 31;
        Ba.c cVar = this.f32217b;
        if (cVar == null) {
            i10 = 0;
        } else {
            i10 = cVar.hashCode();
        }
        int hashCode2 = (this.f32218c.hashCode() + ((hashCode + i10) * 31)) * 31;
        int i12 = 1237;
        if (this.f32219d) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i13 = (hashCode2 + i11) * 31;
        if (this.f32220e) {
            i12 = 1231;
        }
        return i13 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomInstructionsEditState(instruction=");
        sb2.append(this.f32216a);
        sb2.append(", customInstructions=");
        sb2.append(this.f32217b);
        sb2.append(", value=");
        sb2.append(this.f32218c);
        sb2.append(", isSaving=");
        sb2.append(this.f32219d);
        sb2.append(", showDiscardConfirmation=");
        return AbstractC4194d.w(sb2, this.f32220e, Separators.RPAREN);
    }
}
