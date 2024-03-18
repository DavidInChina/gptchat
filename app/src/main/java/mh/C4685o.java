package mh;

import E0.j0;
import id.AbstractC3557B;
import q0.C5251c;
import q0.C5252d;

/* renamed from: mh.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4685o extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39478Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ w f39479Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4685o(w wVar, int i10) {
        super(1);
        this.f39478Y = i10;
        this.f39479Z = wVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f39478Y;
        w wVar = this.f39479Z;
        switch (i10) {
            case 0:
                C5252d c5252d = (C5252d) obj;
                AbstractC3557B.c0("$this$withOrigin", c5252d);
                oh.l lVar = (oh.l) wVar;
                long j6 = lVar.f41426b;
                return A7.b.K(P4.a.L0(c5252d.e(), j6), androidx.compose.ui.layout.a.m(c5252d.d(), j6)).i(lVar.f41428d);
            default:
                r0.x xVar = (r0.x) obj;
                AbstractC3557B.c0("$this$graphicsLayer", xVar);
                oh.l lVar2 = (oh.l) wVar;
                r0.I i11 = (r0.I) xVar;
                i11.e(j0.a(lVar2.f41426b));
                i11.f(j0.b(lVar2.f41426b));
                i11.d(lVar2.f41431g);
                long j10 = lVar2.f41428d;
                i11.m(C5251c.d(j10));
                i11.o(C5251c.e(j10));
                int i12 = r0.P.f44226c;
                i11.l(androidx.compose.ui.graphics.a.h(0.0f, 0.0f));
                return jf.y.f36177a;
        }
    }
}
