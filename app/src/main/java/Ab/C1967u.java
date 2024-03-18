package ab;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: ab.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1967u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f24128Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f24129Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1945C f24130h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1967u(List list, C1945C c1945c, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f24129Z = list;
        this.f24130h0 = c1945c;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1967u(this.f24129Z, this.f24130h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1967u) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f24128Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f24128Y = 1;
            if (L4.a.D0(this.f24129Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        this.f24130h0.l(C1952f.f24090i0);
        return jf.y.f36177a;
    }
}
