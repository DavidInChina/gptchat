package Mb;

import android.content.Intent;
import c9.AbstractC2307a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Mb.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0944b extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f11900Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0954g f11901Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0944b(C0954g c0954g, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11901Z = c0954g;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0944b(this.f11901Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0944b) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11900Y;
        C0954g c0954g = this.f11901Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC2307a abstractC2307a = c0954g.f11935k;
            this.f11900Y = 1;
            obj = abstractC2307a.a(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            C0942a c0942a = C0942a.f11878Z;
            Intent intent = C0954g.f11933q;
            c0954g.l(c0942a);
        }
        return jf.y.f36177a;
    }
}
