package zc;

import Cd.X;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import y.C6461B;

/* renamed from: zc.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6825d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f51894Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Q f51895Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6825d(Q q10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51895Z = q10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C6825d c6825d = new C6825d(this.f51895Z, abstractC4825e);
        c6825d.f51894Y = obj;
        return c6825d;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C6825d) create((List) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        C6461B c6461b = new C6461B(16, (List) this.f51894Y);
        Q q10 = this.f51895Z;
        q10.l(c6461b);
        if (Ii.q.l(((X) q10.e()).f3027b)) {
            q10.l(C6823b.f51890i0);
        }
        return jf.y.f36177a;
    }
}
