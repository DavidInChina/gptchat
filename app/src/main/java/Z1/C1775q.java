package Z1;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Z1.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1775q extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f23051Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f23052Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ N f23053h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Context f23054i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C1754c f23055j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775q(N n10, Context context, C1754c c1754c, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f23053h0 = n10;
        this.f23054i0 = context;
        this.f23055j0 = c1754c;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1775q c1775q = new C1775q(this.f23053h0, this.f23054i0, this.f23055j0, abstractC4825e);
        c1775q.f23052Z = obj;
        return c1775q;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1775q) create((Pg.A) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f23051Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C1774p c1774p = new C1774p(new AtomicReference(null), (Pg.A) this.f23052Z);
            C1772n c1772n = new C1772n(this.f23053h0, this.f23054i0, this.f23055j0, null);
            this.f23051Y = 1;
            if (Ad.l.n1(this, c1774p, c1772n) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
