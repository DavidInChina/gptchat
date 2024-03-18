package Ja;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import n9.C4726e;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f8910Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ p f8911Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f8911Z = pVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new d(this.f8911Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((b4.g) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f8910Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C4726e c4726e = this.f8911Z.f8950c;
            this.f8910Y = 1;
            if (c4726e.e(this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
