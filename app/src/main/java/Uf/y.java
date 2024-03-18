package Uf;

import id.AbstractC3557B;
import jf.C3956f;
import kg.C4291c;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: d  reason: collision with root package name */
    public static final y f17847d;

    /* renamed from: a  reason: collision with root package name */
    public final B f17848a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.k f17849b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f17850c;

    static {
        I i10;
        I i11;
        C4291c c4291c = v.f17838a;
        C3956f c3956f = C3956f.f36147j0;
        AbstractC3557B.c0("configuredKotlinVersion", c3956f);
        w wVar = v.f17841d;
        C3956f c3956f2 = wVar.f17844b;
        if (c3956f2 != null && c3956f2.f36151i0 - c3956f.f36151i0 <= 0) {
            i10 = wVar.f17845c;
        } else {
            i10 = wVar.f17843a;
        }
        AbstractC3557B.c0("globalReportLevel", i10);
        if (i10 == I.f17766h0) {
            i11 = null;
        } else {
            i11 = i10;
        }
        B b10 = new B(i10, i11);
        x xVar = x.f17846Y;
        f17847d = new y(b10);
    }

    public y(B b10) {
        boolean z10;
        x xVar = x.f17846Y;
        this.f17848a = b10;
        this.f17849b = xVar;
        if (!b10.f17723d && xVar.invoke(v.f17838a) != I.f17765Z) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f17850c = z10;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f17848a + ", getReportLevelForAnnotation=" + this.f17849b + ')';
    }
}
