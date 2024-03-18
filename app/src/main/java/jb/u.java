package Jb;

import Mb.AbstractC0976r0;
import Mb.C0971o0;
import Mb.C0973p0;
import Mb.C0975q0;
import android.content.Context;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f9017Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f9018Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Context f9019h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Tc.f fVar, Context context, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9018Z = fVar;
        this.f9019h0 = context;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        u uVar = new u(this.f9018Z, this.f9019h0, abstractC4825e);
        uVar.f9017Y = obj;
        return uVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((u) create((AbstractC0976r0) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        AbstractC0976r0 abstractC0976r0 = (AbstractC0976r0) this.f9017Y;
        boolean z10 = abstractC0976r0 instanceof C0973p0;
        Tc.f fVar = this.f9018Z;
        if (z10) {
            Bi.c.r1(fVar.f17057b, ((C0973p0) abstractC0976r0).f11971a);
        } else if (abstractC0976r0 instanceof C0971o0) {
            K8.d.O0(this.f9019h0, fVar, ((C0971o0) abstractC0976r0).f11969a);
        } else if (abstractC0976r0 instanceof C0975q0) {
            Tc.f.c(fVar, ((C0975q0) abstractC0976r0).f11972a, 0, 14);
        }
        return jf.y.f36177a;
    }
}
