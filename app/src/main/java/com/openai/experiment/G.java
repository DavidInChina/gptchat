package com.openai.experiment;

import Df.H;
import Qg.F0;
import Qg.s0;
import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.ExperimentKey;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import io.sentry.L0;
import java.util.ArrayList;
import java.util.Iterator;
import ld.AbstractC4433f;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x8.W;

/* loaded from: classes2.dex */
public abstract class G implements t, r {

    /* renamed from: f  reason: collision with root package name */
    public static final long f27671f = H.x0(10, Mg.d.f12134i0);

    /* renamed from: a  reason: collision with root package name */
    public final C f27672a;

    /* renamed from: b  reason: collision with root package name */
    public final Pc.g f27673b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f27674c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final F0 f27675d;

    /* renamed from: e  reason: collision with root package name */
    public final F0 f27676e;

    static {
        Mg.a aVar = Mg.b.f12127Z;
    }

    public G(AbstractC4433f abstractC4433f, C c10) {
        this.f27672a = c10;
        Pc.g i12 = Bi.c.i1(Pc.b.f13937o0);
        this.f27673b = i12;
        F0 c11 = s0.c(s.f27696Y);
        this.f27675d = c11;
        this.f27676e = c11;
        W.F(i12, "StatsigManager init", null, 6);
        Ad.l.O0(c10.f27659a, null, null, new B(c10, new d9.h(1, this), null), 3);
        Ad.l.O0(abstractC4433f, null, null, new E(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Type inference failed for: r2v1, types: [pf.j, wf.n] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.openai.experiment.G] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.openai.experiment.G] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.openai.experiment.G] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.openai.experiment.ExperimentKey$BooleanKey, com.openai.experiment.ExperimentKey] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.openai.experiment.ExperimentKey] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.openai.experiment.ExperimentKey] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object d(G g10, ExperimentKey.BooleanKey booleanKey, AbstractC4825e abstractC4825e) {
        F f6;
        int i10;
        if (abstractC4825e instanceof F) {
            f6 = (F) abstractC4825e;
            int i11 = f6.f27670j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f6.f27670j0 = i11 - Integer.MIN_VALUE;
                Object obj = f6.f27668h0;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = f6.f27670j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        booleanKey = f6.f27667Z;
                        g10 = f6.f27666Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    f6.f27666Y = g10;
                    f6.f27667Z = booleanKey;
                    f6.f27670j0 = 1;
                    Object n02 = L4.a.n0(g10.f27676e, new AbstractC5163j(2, null), f6);
                    if (n02 != obj2) {
                        n02 = jf.y.f36177a;
                    }
                    if (n02 == obj2) {
                        return obj2;
                    }
                }
                return Boolean.valueOf(g10.c(booleanKey));
            }
        }
        f6 = new F(g10, abstractC4825e);
        Object obj3 = f6.f27668h0;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = f6.f27670j0;
        if (i10 == 0) {
        }
        return Boolean.valueOf(g10.c(booleanKey));
    }

    public final int a(n nVar) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, nVar);
        int i10 = nVar.f27692b;
        String str = nVar.f27695a;
        try {
            i10 = this.f27672a.f27663e.getConfig("android_chatgpt_client_config").getInt(str, i10);
        } catch (IllegalStateException e10) {
            W.W(this.f27673b, "Statsig not initialized", e10, null, 4);
        }
        i6.b.b().m(str, Integer.valueOf(i10));
        return i10;
    }

    public final String b(p pVar) {
        String str;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, pVar);
        String str2 = pVar.f27695a;
        String str3 = pVar.f27694b;
        try {
            str = this.f27672a.f27663e.getConfig("android_chatgpt_client_config").getString(str2, str3);
        } catch (IllegalStateException e10) {
            W.W(this.f27673b, "Statsig not initialized", e10, null, 4);
            str = str3;
        }
        if (str != null) {
            str3 = str;
        }
        i6.b.b().m(str2, str3);
        return str3;
    }

    public final boolean c(ExperimentKey experimentKey) {
        boolean z10;
        Pc.g gVar = this.f27673b;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, experimentKey);
        try {
            z10 = this.f27672a.f27663e.checkGate(experimentKey.getKey());
        } catch (IllegalStateException e10) {
            W.W(gVar, "Statsig not initialized", e10, null, 4);
            z10 = false;
        }
        String key = experimentKey.getKey();
        W.F(gVar, "Statsig get " + key + Separators.SP + z10, null, 6);
        i6.b.b().m(experimentKey.getKey(), Boolean.valueOf(z10));
        Iterator it = this.f27674c.iterator();
        while (it.hasNext()) {
            try {
                ((B2.A) it.next()).getClass();
                String key2 = experimentKey.getKey();
                L0.h("feature-flag." + key2, String.valueOf(z10));
            } catch (NullPointerException e11) {
                W.G(Pc.e.a(), "Unable to call Statsig evaluation listener", e11, 4);
                L0.c().x(e11);
            }
        }
        return z10;
    }
}
