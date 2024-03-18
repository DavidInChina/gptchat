package ab;

import android.gov.nist.core.Separators;
import cb.C2334C;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC4194d;

/* renamed from: ab.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1965s implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f24124a;

    /* renamed from: b  reason: collision with root package name */
    public final List f24125b;

    /* renamed from: c  reason: collision with root package name */
    public final C2334C f24126c;

    /* renamed from: d  reason: collision with root package name */
    public final Wa.j f24127d;

    public C1965s(boolean z10, List list, C2334C c2334c, Wa.j jVar) {
        AbstractC3557B.c0("loadingLoginActionIds", list);
        this.f24124a = z10;
        this.f24125b = list;
        this.f24126c = c2334c;
        this.f24127d = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static C1965s e(C1965s c1965s, ArrayList arrayList, C2334C c2334c, Wa.j jVar, int i10) {
        boolean z10;
        if ((i10 & 1) != 0) {
            z10 = c1965s.f24124a;
        } else {
            z10 = false;
        }
        ArrayList arrayList2 = arrayList;
        if ((i10 & 2) != 0) {
            arrayList2 = c1965s.f24125b;
        }
        if ((i10 & 4) != 0) {
            c2334c = c1965s.f24126c;
        }
        if ((i10 & 8) != 0) {
            jVar = c1965s.f24127d;
        }
        c1965s.getClass();
        AbstractC3557B.c0("loadingLoginActionIds", arrayList2);
        return new C1965s(z10, arrayList2, c2334c, jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1965s)) {
            return false;
        }
        C1965s c1965s = (C1965s) obj;
        if (this.f24124a == c1965s.f24124a && AbstractC3557B.K(this.f24125b, c1965s.f24125b) && AbstractC3557B.K(this.f24126c, c1965s.f24126c) && AbstractC3557B.K(this.f24127d, c1965s.f24127d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        if (this.f24124a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int s10 = AbstractC4194d.s(this.f24125b, i10 * 31, 31);
        int i12 = 0;
        C2334C c2334c = this.f24126c;
        if (c2334c == null) {
            i11 = 0;
        } else {
            i11 = c2334c.hashCode();
        }
        int i13 = (s10 + i11) * 31;
        Wa.j jVar = this.f24127d;
        if (jVar != null) {
            i12 = jVar.f20853a.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        return "GizmoSettingsState(loading=" + this.f24124a + ", loadingLoginActionIds=" + this.f24125b + ", gizmo=" + this.f24126c + ", settings=" + this.f24127d + Separators.RPAREN;
    }
}
