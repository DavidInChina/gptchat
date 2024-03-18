package Kd;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import s2.AbstractC5530A;
import y2.C6504G;

/* renamed from: Kd.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0829e extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C0830f f9731Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f9732Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0829e(C0830f c0830f, float f6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9731Y = c0830f;
        this.f9732Z = f6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0829e(this.f9731Y, this.f9732Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C0829e) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C6504G c6504g = this.f9731Y.f9734b;
        c6504g.E();
        final float h10 = AbstractC5530A.h(this.f9732Z, 0.0f, 1.0f);
        if (c6504g.f50357R != h10) {
            c6504g.f50357R = h10;
            c6504g.w(1, Float.valueOf(c6504g.f50386y.f50561g * h10), 2);
            c6504g.f50373l.l(22, new s2.m() { // from class: y2.t
                @Override // s2.m
                public final void invoke(Object obj2) {
                    ((p2.V) obj2).k(h10);
                }
            });
        }
        return jf.y.f36177a;
    }
}
