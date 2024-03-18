package e9;

import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import f9.AbstractC2949a;
import f9.C2962n;
import f9.w;
import f9.y;
import g9.AbstractC3215f;
import nd.C4812a;
import pd.o;
import pd.p;
import pd.q;
import pd.s;
import wd.EnumC6206t;

/* renamed from: e9.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2811d {
    public static s a(EnumC6206t enumC6206t, AbstractC3215f abstractC3215f, AbstractC2949a abstractC2949a, com.openai.experiment.s sVar) {
        boolean z10 = abstractC3215f instanceof w;
        pd.m mVar = pd.m.f43064a;
        if (z10) {
            if (abstractC2949a != null) {
                C2962n c2962n = (C2962n) abstractC2949a;
                C4812a c4812a = c2962n.f29823a;
                if (c4812a.f40274a.f40289b || sVar == com.openai.experiment.s.f27697Z) {
                    if (c4812a.f40279f) {
                        boolean c10 = ((G) c2962n.c()).c(ExperimentKey.EmployeeInternalRequiredDisabled.INSTANCE);
                        if (enumC6206t == EnumC6206t.f48461h0 && !c10) {
                            return pd.j.f43061a;
                        }
                    }
                    if (c4812a.f40281h) {
                        return pd.i.f43060a;
                    }
                    return new o(c4812a.f40276c);
                }
                return mVar;
            }
            return mVar;
        } else if (abstractC3215f instanceof y) {
            if (((y) abstractC3215f).f29988a instanceof nd.i) {
                return q.f43068a;
            }
            return p.f43067a;
        } else {
            return mVar;
        }
    }
}
