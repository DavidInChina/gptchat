package H0;

import Ng.AbstractC1073l0;
import android.view.View;
import androidx.lifecycle.AbstractC2086v;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class r1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f7016Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f7017Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f7018h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Z.E0 f7019i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC2086v f7020j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ s1 f7021k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ View f7022l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(kotlin.jvm.internal.B b10, Z.E0 e02, AbstractC2086v abstractC2086v, s1 s1Var, View view, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f7018h0 = b10;
        this.f7019i0 = e02;
        this.f7020j0 = abstractC2086v;
        this.f7021k0 = s1Var;
        this.f7022l0 = view;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        r1 r1Var = new r1(this.f7018h0, this.f7019i0, this.f7020j0, this.f7021k0, this.f7022l0, abstractC4825e);
        r1Var.f7017Z = obj;
        return r1Var;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((r1) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        AbstractC1073l0 abstractC1073l0;
        Ng.D0 d02;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f7016Y;
        s1 s1Var = this.f7021k0;
        AbstractC2086v abstractC2086v = this.f7020j0;
        if (i10 != 0) {
            if (i10 == 1) {
                abstractC1073l0 = (AbstractC1073l0) this.f7017Z;
                try {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } catch (Throwable th3) {
                    th2 = th3;
                    if (abstractC1073l0 != null) {
                        abstractC1073l0.k(null);
                    }
                    abstractC2086v.h().g(s1Var);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Ng.F f6 = (Ng.F) this.f7017Z;
            try {
                G0 g02 = (G0) this.f7018h0.f37622Y;
                if (g02 != null) {
                    Qg.D0 a5 = v1.a(this.f7022l0.getContext().getApplicationContext());
                    g02.f6736Y.i(((Number) a5.getValue()).floatValue());
                    d02 = Ad.l.O0(f6, null, null, new q1(a5, g02, null), 3);
                } else {
                    d02 = null;
                }
            } catch (Throwable th4) {
                th2 = th4;
                abstractC1073l0 = null;
            }
            try {
                Z.E0 e02 = this.f7019i0;
                this.f7017Z = d02;
                this.f7016Y = 1;
                if (e02.I(this) == enumC5000a) {
                    return enumC5000a;
                }
                abstractC1073l0 = d02;
            } catch (Throwable th5) {
                abstractC1073l0 = d02;
                th2 = th5;
                if (abstractC1073l0 != null) {
                }
                abstractC2086v.h().g(s1Var);
                throw th2;
            }
        }
        if (abstractC1073l0 != null) {
            abstractC1073l0.k(null);
        }
        abstractC2086v.h().g(s1Var);
        return jf.y.f36177a;
    }
}
