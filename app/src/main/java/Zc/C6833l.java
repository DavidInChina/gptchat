package zc;

import Cd.C0327l;
import Qg.F0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: zc.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6833l extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Q f51914Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f51915Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Q f51916h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6833l(Q q10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51916h0 = q10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C6833l(this.f51916h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6833l) create((jf.y) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Q q10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f51915Z;
        if (i10 != 0) {
            if (i10 == 1) {
                q10 = this.f51914Y;
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Q q11 = this.f51916h0;
            F0 f02 = q11.f51860l.f9676G;
            this.f51914Y = q11;
            this.f51915Z = 1;
            Object m02 = L4.a.m0(f02, this);
            if (m02 == enumC5000a) {
                return enumC5000a;
            }
            q10 = q11;
            obj = m02;
        }
        q10.f(new C0327l((Ed.m) obj));
        return jf.y.f36177a;
    }
}
