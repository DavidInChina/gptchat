package oa;

import Qg.AbstractC1207j;
import Qg.H;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import ta.C5711j;
import ta.C5715n;
import wf.AbstractC6216a;

/* renamed from: oa.E  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4974E extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f41074Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f41075Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4975F f41076h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f41077i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ String f41078j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ L9.B f41079k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f41080l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4974E(C4975F c4975f, String str, String str2, L9.B b10, AbstractC6216a abstractC6216a, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41076h0 = c4975f;
        this.f41077i0 = str;
        this.f41078j0 = str2;
        this.f41079k0 = b10;
        this.f41080l0 = abstractC6216a;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4974E c4974e = new C4974E(this.f41076h0, this.f41077i0, this.f41078j0, this.f41079k0, this.f41080l0, abstractC4825e);
        c4974e.f41075Z = obj;
        return c4974e;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4974E) create((AbstractC1207j) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        AbstractC1207j abstractC1207j;
        String str;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41074Y;
        C4975F c4975f = this.f41076h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3 && i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                return jf.y.f36177a;
            }
            abstractC1207j = (AbstractC1207j) this.f41075Z;
            N.B0(obj);
        } else {
            N.B0(obj);
            abstractC1207j = (AbstractC1207j) this.f41075Z;
            C5715n c5715n = c4975f.f41082b;
            this.f41075Z = abstractC1207j;
            this.f41074Y = 1;
            obj = c5715n.b(this.f41077i0, this.f41078j0, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        Vc.x xVar = (Vc.x) obj;
        boolean z10 = xVar instanceof Vc.w;
        L9.B b10 = this.f41079k0;
        AbstractC6216a abstractC6216a = this.f41080l0;
        if (z10) {
            C5711j c5711j = (C5711j) ((Vc.w) xVar).f18565a;
            Ga.E e10 = c4975f.f41081a;
            if (c5711j != null) {
                str = c5711j.f45956d;
            } else {
                str = null;
            }
            H b11 = e10.b(b10, str, abstractC6216a);
            M1.v vVar = new M1.v(abstractC1207j, 15);
            this.f41075Z = null;
            this.f41074Y = 2;
            if (b11.b(vVar, this) == enumC5000a) {
                return enumC5000a;
            }
        } else if (xVar instanceof Vc.r) {
            L9.F f6 = new L9.F(((Vc.r) xVar).f18561a);
            this.f41075Z = null;
            this.f41074Y = 3;
            if (abstractC1207j.c(f6, this) == enumC5000a) {
                return enumC5000a;
            }
        } else if (xVar instanceof Vc.q) {
            H b12 = c4975f.f41081a.b(b10, null, abstractC6216a);
            M1.v vVar2 = new M1.v(abstractC1207j, 15);
            this.f41075Z = null;
            this.f41074Y = 4;
            if (b12.b(vVar2, this) == enumC5000a) {
                return enumC5000a;
            }
        } else {
            throw new RuntimeException();
        }
        return jf.y.f36177a;
    }
}
