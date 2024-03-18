package ub;

import Ng.F;
import Qg.l0;
import Z.AbstractC1708e0;
import Z.AbstractC1710f0;
import Z.U0;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class w extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f46604Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5876E f46605Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f46606h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f46607i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1708e0 f46608j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ l0 f46609k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C5876E c5876e, AbstractC1710f0 abstractC1710f0, boolean z10, AbstractC1708e0 abstractC1708e0, l0 l0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f46605Z = c5876e;
        this.f46606h0 = abstractC1710f0;
        this.f46607i0 = z10;
        this.f46608j0 = abstractC1708e0;
        this.f46609k0 = l0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new w(this.f46605Z, this.f46606h0, this.f46607i0, this.f46608j0, this.f46609k0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (((float) Mg.b.e(new Yg.p(y.AbstractC6463a.n("instant(...)")).b(r1))) < 1200.0f) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f46604Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5876E c5876e = this.f46605Z;
            if (c5876e.f46529c.a()) {
                Yg.p pVar = (Yg.p) this.f46606h0.getValue();
                float f6 = AbstractC5875D.f46525a;
                if (pVar != null) {
                    Yg.p.Companion.getClass();
                }
                this.f46604Y = 1;
                if (this.f46609k0.c(c5876e, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
            if (!this.f46607i0) {
                U0 u02 = (U0) this.f46608j0;
                u02.i(u02.h() + 1);
            }
            this.f46604Y = 1;
            if (this.f46609k0.c(c5876e, this) == enumC5000a) {
            }
        }
        return jf.y.f36177a;
    }
}
