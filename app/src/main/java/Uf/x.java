package Uf;

import Df.AbstractC0407f;
import id.AbstractC3557B;
import jf.C3956f;
import kg.C4291c;

/* loaded from: classes.dex */
public final /* synthetic */ class x extends kotlin.jvm.internal.j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final x f17846Y = new kotlin.jvm.internal.j(1);

    @Override // kotlin.jvm.internal.AbstractC4305d, Df.AbstractC0404c
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final AbstractC0407f getOwner() {
        return kotlin.jvm.internal.C.f37623a.c(v.class, "compiler.common.jvm");
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final String getSignature() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        I i10;
        C4291c c4291c = (C4291c) obj;
        AbstractC3557B.c0("p0", c4291c);
        C4291c c4291c2 = v.f17838a;
        G.f17762a.getClass();
        H h10 = F.f17761b;
        C3956f c3956f = new C3956f(1, 7, 20);
        AbstractC3557B.c0("configuredReportLevels", h10);
        I i11 = (I) h10.f17764c.invoke(c4291c);
        if (i11 == null) {
            H h11 = v.f17840c;
            h11.getClass();
            w wVar = (w) h11.f17764c.invoke(c4291c);
            if (wVar == null) {
                return I.f17765Z;
            }
            C3956f c3956f2 = wVar.f17844b;
            if (c3956f2 != null && c3956f2.f36151i0 - c3956f.f36151i0 <= 0) {
                i10 = wVar.f17845c;
            } else {
                i10 = wVar.f17843a;
            }
            return i10;
        }
        return i11;
    }
}
