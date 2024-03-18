package lc;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5472v;

/* renamed from: lc.Y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4400Y extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f38138Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4380D f38139Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4401Z f38140h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4400Y(AbstractC4380D abstractC4380D, C4401Z c4401z, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f38139Z = abstractC4380D;
        this.f38140h0 = c4401z;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4400Y(this.f38139Z, this.f38140h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C4400Y) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f38138Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            String a5 = ((C4427z) this.f38139Z).f38279a.a();
            if (a5 != null) {
                xd.b bVar = this.f38140h0.f38141j;
                this.f38138Y = 1;
                if (((C5472v) bVar).b(a5, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return jf.y.f36177a;
    }
}
