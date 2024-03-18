package Ja;

import b4.AbstractC2125f;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f8921Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f8922Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ p f8923h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f8924i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, AbstractC4825e abstractC4825e, boolean z10) {
        super(2, abstractC4825e);
        this.f8923h0 = pVar;
        this.f8924i0 = z10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        i iVar = new i(this.f8923h0, abstractC4825e, this.f8924i0);
        iVar.f8922Z = obj;
        return iVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((AbstractC2125f) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f8921Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            h hVar = new h(this.f8923h0, null, this.f8924i0);
            this.f8921Y = 1;
            obj = ((AbstractC2125f) this.f8922Z).c(false, hVar, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
