package Rc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class f {
    public static final e Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f15389e;

    /* renamed from: a  reason: collision with root package name */
    public final String f15390a;

    /* renamed from: b  reason: collision with root package name */
    public final List f15391b;

    /* renamed from: c  reason: collision with root package name */
    public final List f15392c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f15393d;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, Rc.e] */
    static {
        u0 u0Var = u0.f28491a;
        f15389e = new KSerializer[]{null, new C2695d(u0Var, 0), new C2695d(u0Var, 0), null};
    }

    public f(int i10, String str, List list, List list2, boolean z10) {
        if (1 == (i10 & 1)) {
            this.f15390a = str;
            if ((i10 & 2) == 0) {
                this.f15391b = null;
            } else {
                this.f15391b = list;
            }
            if ((i10 & 4) == 0) {
                this.f15392c = null;
            } else {
                this.f15392c = list2;
            }
            if ((i10 & 8) == 0) {
                this.f15393d = false;
                return;
            } else {
                this.f15393d = z10;
                return;
            }
        }
        R4.b.e2(i10, 1, d.f15388b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3557B.K(this.f15390a, fVar.f15390a) && AbstractC3557B.K(this.f15391b, fVar.f15391b) && AbstractC3557B.K(this.f15392c, fVar.f15392c) && this.f15393d == fVar.f15393d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f15390a.hashCode() * 31;
        int i12 = 0;
        List list = this.f15391b;
        if (list == null) {
            i10 = 0;
        } else {
            i10 = list.hashCode();
        }
        int i13 = (hashCode + i10) * 31;
        List list2 = this.f15392c;
        if (list2 != null) {
            i12 = list2.hashCode();
        }
        int i14 = (i13 + i12) * 31;
        if (this.f15393d) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return i14 + i11;
    }

    public final String toString() {
        return "ModelsResponseAttachments(type=" + this.f15390a + ", acceptedMimeTypes=" + this.f15391b + ", imageMimeTypes=" + this.f15392c + ", canAcceptAllMimeTypes=" + this.f15393d + Separators.RPAREN;
    }
}
