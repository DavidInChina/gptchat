package Kd;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import y2.C6504G;

/* renamed from: Kd.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0826b extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C0830f f9727Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0826b(C0830f c0830f, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9727Y = c0830f;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0826b(this.f9727Y, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C0826b) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C6504G c6504g = this.f9727Y.f9734b;
        c6504g.getClass();
        c6504g.x(false);
        return jf.y.f36177a;
    }
}
