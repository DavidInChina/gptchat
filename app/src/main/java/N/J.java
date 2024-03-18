package N;

import B0.C0194k;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;

/* loaded from: classes.dex */
public final class J extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public int f12213Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f12214h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1028l f12215i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C1025i f12216j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ L.x0 f12217k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(AbstractC1028l abstractC1028l, C1025i c1025i, L.x0 x0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f12215i0 = abstractC1028l;
        this.f12216j0 = c1025i;
        this.f12217k0 = x0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        J j6 = new J(this.f12215i0, this.f12216j0, this.f12217k0, abstractC4825e);
        j6.f12214h0 = obj;
        return j6;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((B0.N) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        B0.N n10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f12213Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                return jf.y.f36177a;
            }
            n10 = (B0.N) this.f12214h0;
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            n10 = (B0.N) this.f12214h0;
            this.f12214h0 = n10;
            this.f12213Z = 1;
            obj = r9.y.Q(n10, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        C0194k c0194k = (C0194k) obj;
        if (r9.y.F0(c0194k) && (c0194k.f1654c & 33) != 0) {
            List list = c0194k.f1652a;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (!((B0.u) list.get(i11)).b()) {
                }
            }
            this.f12214h0 = null;
            this.f12213Z = 2;
            if (r9.y.R(n10, this.f12215i0, this.f12216j0, c0194k, this) == enumC5000a) {
                return enumC5000a;
            }
            return jf.y.f36177a;
        }
        if (!r9.y.F0(c0194k)) {
            this.f12214h0 = null;
            this.f12213Z = 3;
            if (r9.y.T(n10, this.f12217k0, c0194k, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
