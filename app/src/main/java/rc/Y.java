package rc;

import java.util.Iterator;
import java.util.Map;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import vc.C6022l;
import vc.C6024n;
import wd.q0;
import wd.v0;

/* loaded from: classes.dex */
public final class Y extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Iterator f44830Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f44831Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f44832h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ c0 f44833i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(c0 c0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f44833i0 = c0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        Y y10 = new Y(this.f44833i0, abstractC4825e);
        y10.f44832h0 = obj;
        return y10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((Map) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0096 -> B:11:0x003c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0098 -> B:11:0x003c). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c0 c0Var;
        Iterator it;
        v0 b10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f44831Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = this.f44830Y;
                    c0Var = (c0) this.f44832h0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                it = this.f44830Y;
                c0Var = (c0) this.f44832h0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                b10 = ((Vc.x) obj).b();
                if (b10 instanceof q0) {
                    x8.W.W(Pc.e.a(), "Failed to update announcement", ((q0) b10).f48450a, null, 4);
                }
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Iterator it2 = ((Map) this.f44832h0).entrySet().iterator();
            c0Var = this.f44833i0;
            it = it2;
        }
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zd.k kVar = (zd.k) entry.getKey();
            Z z10 = (Z) entry.getValue();
            boolean z11 = z10.f44836c;
            boolean z12 = z10.f44835b;
            if (z11 && !z12) {
                C6024n c6024n = c0Var.f44849a;
                String str = kVar.f51976a;
                this.f44832h0 = c0Var;
                this.f44830Y = it;
                this.f44831Z = 1;
                c6024n.getClass();
                C6022l c6022l = new C6022l(str, null);
                Df.w a5 = kotlin.jvm.internal.C.a(jf.y.class);
                Je.a n22 = R4.b.n2(Df.H.O(a5), kotlin.jvm.internal.C.f37623a.b(jf.y.class), a5);
                Yc.a aVar = c6024n.f47468a;
                aVar.getClass();
                obj = x8.W.S(aVar, n22, c6022l, this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                b10 = ((Vc.x) obj).b();
                if (b10 instanceof q0) {
                }
                while (it.hasNext()) {
                }
            } else if (z12 && !z11) {
                xd.h hVar = c0Var.f44850b;
                X x10 = new X(kVar, 0);
                this.f44832h0 = c0Var;
                this.f44830Y = it;
                this.f44831Z = 2;
                if (((Q) hVar).a(x10, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return jf.y.f36177a;
    }
}
