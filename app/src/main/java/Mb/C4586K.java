package mb;

import Dd.W;
import Ng.Q;
import Qg.s0;
import Z8.AbstractC1802j;
import Z8.AbstractC1809m0;
import Z8.S;
import Z8.X;
import android.app.Application;
import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import com.openai.experiment.ExperimentKey;
import f9.C2958j;
import fa.C2969F;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import jf.C3963m;
import nf.AbstractC4828h;
import oa.C4972C;

/* renamed from: mb.K  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4586K extends hb.u {

    /* renamed from: j  reason: collision with root package name */
    public final Application f39039j;

    /* renamed from: k  reason: collision with root package name */
    public final p9.s f39040k;

    /* renamed from: l  reason: collision with root package name */
    public final p000if.a f39041l;

    /* renamed from: m  reason: collision with root package name */
    public final W f39042m;

    /* renamed from: n  reason: collision with root package name */
    public final C3963m f39043n = R4.b.D1(new d9.h(14, this));

    /* renamed from: o  reason: collision with root package name */
    public final Pc.g f39044o = Bi.c.i1(Pc.b.f13932j0);

    public C4586K(Application application, p9.s sVar, p000if.a aVar, W w10, T9.a aVar2, com.openai.experiment.t tVar) {
        super(new hb.t(false, false, null, false, false, ((com.openai.experiment.G) tVar).c(ExperimentKey.AudioMessageAutoReadEnabled.INSTANCE), 382));
        this.f39039j = application;
        this.f39040k = sVar;
        this.f39041l = aVar;
        this.f39042m = w10;
        if (((hb.t) e()).f32136h) {
            L4.a.E0(L4.a.I0(new C4613z(this, null), s0.e(new M1.w(L4.a.i0(new M1.w(L4.a.l0(new M1.w(((C4972C) aVar2).f41060o, 27)), 28)), 26), C4612y.f39114Z)), AbstractC4828h.Q(this));
        }
    }

    public static final String m(C4586K c4586k, long j6) {
        c4586k.getClass();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(N.k(j6, 0L));
        long j10 = 60;
        return String.format(((C2958j) c4586k.f39040k).a(R.string.message_audio_counter), Arrays.copyOf(new Object[]{Long.valueOf(seconds / j10), Long.valueOf(seconds % j10)}, 2));
    }

    @Override // androidx.lifecycle.Y
    public final void c() {
        if (this.f39043n.isInitialized()) {
            n().a();
        }
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        String str;
        hb.l lVar = (hb.l) iVar;
        AbstractC3557B.c0("intent", lVar);
        if (lVar instanceof hb.h) {
            l(new C4580E(lVar, 0));
            if (((hb.h) lVar).f32107a) {
                n().a();
                return;
            }
            C4603p n10 = n();
            n10.getClass();
            Tg.e eVar = Q.f12904a;
            Ad.l.O0(n10.f39079a, Sg.u.f16684a, null, new C4597j(n10, null), 2);
        } else if (lVar instanceof hb.f) {
            Application application = this.f39039j;
            boolean z10 = ((hb.f) lVar).f32105a;
            if (z10) {
                str = application.getString(R.string.message_auto_read_enable);
            } else {
                str = application.getString(R.string.message_auto_read_disable);
            }
            AbstractC3557B.Z(str);
            o(S.f23271c, String.valueOf(z10));
            l(new C4580E(lVar, 1));
            f(new hb.d(str));
        } else if (lVar instanceof hb.k) {
            C4603p n11 = n();
            n11.getClass();
            Tg.e eVar2 = Q.f12904a;
            Ad.l.O0(n11.f39079a, Sg.u.f16684a, null, new C4599l(n11, 10000L, null), 2);
        } else if (lVar instanceof hb.j) {
            C4603p n12 = n();
            n12.getClass();
            Tg.e eVar3 = Q.f12904a;
            Ad.l.O0(n12.f39079a, Sg.u.f16684a, null, new C4598k(n12, 10000L, null), 2);
        } else if (lVar instanceof hb.g) {
            o(Z8.W.f23279c, null);
            h(new C4581F(this, null));
        } else if (lVar instanceof hb.i) {
            X x10 = X.f23281c;
            C2969F c2969f = ((hb.i) lVar).f32108a;
            o(x10, c2969f.f30008a);
            n().a();
            h(new C4582G(this, c2969f, null));
        }
    }

    public final C4603p n() {
        return (C4603p) this.f39043n.getValue();
    }

    public final void o(AbstractC1802j abstractC1802j, String str) {
        if (str == null) {
            AbstractC1809m0.a().b(abstractC1802j, kf.w.f37484Y);
        } else {
            AbstractC1809m0.a().c(abstractC1802j, str);
        }
        if (kf.t.X1(AbstractC4576A.f39015a, abstractC1802j)) {
            x8.W.W(this.f39044o, abstractC1802j.toString(), null, null, 6);
        }
    }
}
