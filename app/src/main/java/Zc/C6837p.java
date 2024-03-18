package zc;

import Dd.C0385f;
import O9.C1122p;
import fa.C2969F;
import nf.AbstractC4825e;
import oa.C4972C;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: zc.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6837p extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f51923Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f51924Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Q f51925h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6837p(Q q10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51925h0 = q10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C6837p c6837p = new C6837p(this.f51925h0, abstractC4825e);
        c6837p.f51924Z = obj;
        return c6837p;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6837p) create((C0385f) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f51923Y;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C0385f c0385f = (C0385f) this.f51924Z;
            nb.d dVar = new nb.d(27, c0385f);
            Q q10 = this.f51925h0;
            q10.l(dVar);
            C1122p c1122p = c0385f.f3558c.f3508b;
            C2969F c2969f = null;
            String str = c0385f.f3556a;
            if (c1122p != null) {
                c2969f = A7.b.R1(c1122p, str, null, false);
            }
            if (c2969f == null) {
                this.f51923Y = 1;
                if (Q.m(q10, str, this) == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                this.f51923Y = 2;
                if (((C4972C) q10.f51858j).e(c2969f, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return jf.y.f36177a;
    }
}
