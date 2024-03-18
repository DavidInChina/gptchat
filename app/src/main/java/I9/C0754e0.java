package I9;

import java.util.ArrayList;
import java.util.Iterator;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: I9.e0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0754e0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public C0758g0 f8332Y;

    /* renamed from: Z  reason: collision with root package name */
    public Iterator f8333Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f8334h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C0758g0 f8335i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0754e0(C0758g0 c0758g0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f8335i0 = c0758g0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0754e0(this.f8335i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0754e0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Type inference failed for: r1v6, types: [pf.j, wf.n] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008e -> B:27:0x0091). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f8334h0;
        C0758g0 c0758g0 = this.f8335i0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = this.f8333Z;
                    c0758g0 = this.f8332Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    wd.v0 v0Var = (wd.v0) obj;
                    if (v0Var instanceof wd.q0) {
                        x8.W.W(Pc.e.a(), "Failed to generate title", ((wd.q0) v0Var).f48450a, null, 4);
                    }
                    while (it.hasNext()) {
                        J0 j02 = (J0) it.next();
                        String str = j02.f8187a.f26375b;
                        if (str != null) {
                            Ea.a aVar = c0758g0.f8347k;
                            this.f8332Y = c0758g0;
                            this.f8333Z = it;
                            this.f8334h0 = 2;
                            obj = ((xa.f) aVar).c(str, j02.f8189c, this);
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                            wd.v0 v0Var2 = (wd.v0) obj;
                            if (v0Var2 instanceof wd.q0) {
                            }
                            while (it.hasNext()) {
                            }
                        }
                    }
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Qg.F0 f02 = c0758g0.f808e;
            ?? abstractC5163j = new AbstractC5163j(2, null);
            this.f8334h0 = 1;
            obj = L4.a.n0(f02, abstractC5163j, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        ArrayList c22 = kf.t.c2(((j1) obj).f8404v, J0.class);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = c22.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!((J0) next).f8187a.f26388o) {
                arrayList.add(next);
            }
        }
        it = kf.t.G2(arrayList, 5).iterator();
        while (it.hasNext()) {
        }
        return jf.y.f36177a;
    }
}
