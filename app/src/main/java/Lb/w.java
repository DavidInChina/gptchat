package lb;

import android.content.Intent;
import fa.C2969F;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38066Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ K f38067Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(K k10, int i10) {
        super(1);
        this.f38066Y = i10;
        this.f38067Z = k10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f38066Y;
        K k10 = this.f38067Z;
        switch (i10) {
            case 0:
                C2969F c2969f = (C2969F) obj;
                AbstractC3557B.c0("it", c2969f);
                k10.h(new v(k10, c2969f, null));
                return yVar;
            case 1:
                Wa.t tVar = (Wa.t) obj;
                AbstractC3557B.c0("it", tVar);
                Intent intent = new Intent();
                A7.b.G0(intent, tVar.f20872a);
                k10.f(new gb.H(intent));
                return yVar;
            case 2:
                Vc.r rVar = (Vc.r) obj;
                AbstractC3557B.c0("it", rVar);
                k10.f(new gb.I(Vc.x.a(rVar)));
                return yVar;
            default:
                Intent intent2 = (Intent) obj;
                AbstractC3557B.c0("intent", intent2);
                k10.f(new gb.H(intent2));
                return yVar;
        }
    }
}
