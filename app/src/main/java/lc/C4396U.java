package lc;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: lc.U  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4396U extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f38127Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4401Z f38128Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4396U(C4401Z c4401z, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f38128Z = c4401z;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4396U(this.f38128Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C4396U) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f38127Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f38127Y = 1;
            Object a5 = ((rc.Q) this.f38128Z.f38143l).a(C4382F.f38081h0, this);
            if (a5 != enumC5000a) {
                a5 = yVar;
            }
            if (a5 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
