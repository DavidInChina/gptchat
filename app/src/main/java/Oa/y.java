package oa;

import ca.C2311c;
import com.google.android.gms.internal.play_billing.N;
import fa.C2969F;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.C6182c0;
import wd.s0;
import x8.W;

/* loaded from: classes2.dex */
public final class y extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f41196Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f41197Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2969F f41198h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C4972C f41199i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C2969F c2969f, C4972C c4972c, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41198h0 = c2969f;
        this.f41199i0 = c4972c;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        y yVar = new y(this.f41198h0, this.f41199i0, abstractC4825e);
        yVar.f41197Z = obj;
        return yVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((C2311c) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41196Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        N.B0(obj);
        C2311c c2311c = (C2311c) this.f41197Z;
        Qa.e eVar = c2311c.f26387n;
        C2969F c2969f = this.f41198h0;
        Qa.h f6 = eVar.f(new C6182c0(c2969f.f30008a));
        C4972C c4972c = this.f41199i0;
        if (f6 == null) {
            s0 s0Var = new s0(0, new IllegalArgumentException("Message not found"));
            W.W(c4972c.f41056k, "withConversation exception", s0Var.f48450a, null, 4);
            return s0Var;
        }
        C2311c a5 = C2311c.a(c2311c, null, null, null, null, null, null, null, null, c2311c.f26387n.h(new C6182c0(c2969f.f30008a), c2969f), 8191);
        this.f41196Y = 1;
        Object o10 = c4972c.o(a5, true, this);
        if (o10 == enumC5000a) {
            return enumC5000a;
        }
        return o10;
    }
}
