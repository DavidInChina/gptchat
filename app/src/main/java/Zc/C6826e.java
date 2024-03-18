package zc;

import Cd.C0326k;
import Cd.C0328m;
import Z8.AbstractC1809m0;
import Z8.Y0;
import android.content.Intent;
import fa.C2969F;
import id.AbstractC3557B;

/* renamed from: zc.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6826e extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51896Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Q f51897Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6826e(Q q10, int i10) {
        super(1);
        this.f51896Y = i10;
        this.f51897Z = q10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f51896Y;
        Q q10 = this.f51897Z;
        switch (i10) {
            case 0:
                Intent intent = (Intent) obj;
                AbstractC3557B.c0("it", intent);
                q10.f(new C0326k(intent));
                return yVar;
            case 1:
                C2969F c2969f = (C2969F) obj;
                AbstractC3557B.c0("it", c2969f);
                q10.h(new C6816C(c2969f, q10, null));
                return yVar;
            case 2:
                Wa.t tVar = (Wa.t) obj;
                AbstractC3557B.c0("it", tVar);
                AbstractC1809m0.a().b(Y0.f23292e, kf.w.f37484Y);
                Intent intent2 = new Intent();
                A7.b.G0(intent2, tVar.f20872a);
                q10.f(new C0326k(intent2));
                return yVar;
            default:
                Vc.r rVar = (Vc.r) obj;
                AbstractC3557B.c0("it", rVar);
                AbstractC1809m0.a().b(Y0.f23291d, kf.w.f37484Y);
                q10.f(new C0328m(Vc.x.a(rVar)));
                return yVar;
        }
    }
}
