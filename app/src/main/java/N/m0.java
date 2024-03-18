package N;

import E0.AbstractC0461u;
import Z.C1724m0;
import Z.o1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import nf.AbstractC4828h;
import q0.C5251c;
import wf.AbstractC6216a;
import y.C6473k;

/* loaded from: classes2.dex */
public final class m0 implements j0 {

    /* renamed from: k  reason: collision with root package name */
    public static final i0.r f12372k;

    /* renamed from: a  reason: collision with root package name */
    public boolean f12373a;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicLong f12376d;

    /* renamed from: e  reason: collision with root package name */
    public wf.k f12377e;

    /* renamed from: f  reason: collision with root package name */
    public wf.p f12378f;

    /* renamed from: g  reason: collision with root package name */
    public wf.r f12379g;

    /* renamed from: h  reason: collision with root package name */
    public AbstractC6216a f12380h;

    /* renamed from: i  reason: collision with root package name */
    public wf.k f12381i;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f12374b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f12375c = new LinkedHashMap();

    /* renamed from: j  reason: collision with root package name */
    public final C1724m0 f12382j = AbstractC4828h.Z(kf.w.f37484Y, o1.f22665a);

    static {
        l0 l0Var = l0.f12365Y;
        U u10 = U.f12256j0;
        i0.r rVar = i0.s.f32436a;
        f12372k = new i0.r(l0Var, u10);
    }

    public m0(long j6) {
        this.f12376d = new AtomicLong(j6);
    }

    public final Map a() {
        return (Map) this.f12382j.getValue();
    }

    public final boolean b(long j6, long j10, AbstractC1038w abstractC1038w, AbstractC0461u abstractC0461u, boolean z10) {
        wf.r rVar = this.f12379g;
        if (rVar != null) {
            return ((Boolean) rVar.k(Boolean.valueOf(z10), abstractC0461u, new C5251c(j6), new C5251c(j10), Boolean.FALSE, abstractC1038w)).booleanValue();
        }
        return true;
    }

    public final ArrayList c(AbstractC0461u abstractC0461u) {
        boolean z10 = this.f12373a;
        ArrayList arrayList = this.f12374b;
        if (!z10) {
            kf.r.K1(arrayList, new k0(new C6473k(7, abstractC0461u), 0));
            this.f12373a = true;
        }
        return arrayList;
    }

    public final void d(AbstractC1032p abstractC1032p) {
        LinkedHashMap linkedHashMap = this.f12375c;
        long j6 = ((C1030n) abstractC1032p).f12383a;
        if (!linkedHashMap.containsKey(Long.valueOf(j6))) {
            return;
        }
        this.f12374b.remove(abstractC1032p);
        linkedHashMap.remove(Long.valueOf(j6));
        wf.k kVar = this.f12381i;
        if (kVar != null) {
            kVar.invoke(Long.valueOf(j6));
        }
    }
}
