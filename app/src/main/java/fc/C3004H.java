package fc;

import android.app.Application;
import android.os.Build;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import jf.C3959i;
import kf.AbstractC4268D;
import mc.AbstractC4617d;
import qd.AbstractC5304a;
import qd.C5305b;
import qd.C5306c;
import x8.W;

/* renamed from: fc.H  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3004H extends AbstractC2998B {

    /* renamed from: j  reason: collision with root package name */
    public final AbstractC4617d f30121j;

    /* renamed from: k  reason: collision with root package name */
    public final pd.t f30122k;

    /* renamed from: l  reason: collision with root package name */
    public final AbstractC5304a f30123l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3004H(Application application, AbstractC4617d abstractC4617d, pd.t tVar, AbstractC5304a abstractC5304a) {
        super(new y(null, r6, r2));
        Map map;
        boolean hasAmplitudeControl;
        int[] areEffectsSupported;
        boolean z10;
        boolean areAllPrimitivesSupported;
        boolean w02 = L4.a.w0(application);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            map = kf.w.f37484Y;
        } else {
            LinkedHashMap c12 = AbstractC4268D.c1(new C3959i(1, "PRIMITIVE_CLICK"), new C3959i(7, "PRIMITIVE_TICK"));
            if (i10 >= 31) {
                c12.put(8, "PRIMITIVE_LOW_TICK");
                c12.put(2, "PRIMITIVE_THUD");
            }
            ArrayList arrayList = new ArrayList(c12.size());
            for (Map.Entry entry : c12.entrySet()) {
                Object value = entry.getValue();
                areAllPrimitivesSupported = L4.a.z0(application).areAllPrimitivesSupported(((Number) entry.getKey()).intValue());
                arrayList.add(new C3959i(value, Boolean.valueOf(areAllPrimitivesSupported)));
            }
            LinkedHashMap c13 = AbstractC4268D.c1(new C3959i(5, "EFFECT_HEAVY_CLICK"), new C3959i(1, "EFFECT_DOUBLE_CLICK"), new C3959i(0, "EFFECT_CLICK (Not used)"), new C3959i(2, "EFFECT_TICK (Not used)"));
            ArrayList arrayList2 = new ArrayList(c13.size());
            for (Map.Entry entry2 : c13.entrySet()) {
                areEffectsSupported = L4.a.z0(application).areEffectsSupported(((Number) entry2.getKey()).intValue());
                AbstractC3557B.b0("areEffectsSupported(...)", areEffectsSupported);
                if (areEffectsSupported.length != 0) {
                    if (areEffectsSupported[0] == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList2.add(new C3959i(entry2.getValue(), Boolean.valueOf(z10)));
                } else {
                    throw new NoSuchElementException("Array is empty.");
                }
            }
            hasAmplitudeControl = L4.a.z0(application).hasAmplitudeControl();
            map = AbstractC4268D.f1(arrayList2, AbstractC4268D.f1(arrayList, P4.a.o0(new C3959i("Has Amplitude Control", Boolean.valueOf(hasAmplitudeControl)))));
        }
        this.f30121j = abstractC4617d;
        this.f30122k = tVar;
        this.f30123l = abstractC5304a;
        k(C3008c.f30168m0, abstractC4617d.f44961e);
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        AbstractC3022q abstractC3022q = (AbstractC3022q) iVar;
        AbstractC3557B.c0("intent", abstractC3022q);
        if (abstractC3022q instanceof C3010e) {
            h(new C3000D(this, abstractC3022q, null));
        } else if (abstractC3022q instanceof C3020o) {
            h(new C3001E(this, abstractC3022q, null));
        } else if (abstractC3022q instanceof C3021p) {
            h(new C3002F(this, abstractC3022q, null));
        } else if (abstractC3022q instanceof C3016k) {
            h(new C3003G(this, abstractC3022q, null));
        } else {
            boolean z10 = abstractC3022q instanceof C3012g;
            pd.t tVar = this.f30122k;
            if (z10) {
                ((Ub.e) tVar).f17603b.setValue(new pd.u("This is a simulated outage", "https://status.openai.com", null));
            } else if (abstractC3022q instanceof C3013h) {
                ((Ub.e) tVar).f17603b.setValue(new pd.w("This is a simulated outage", null, null));
            } else if (abstractC3022q instanceof C3014i) {
                ((Ub.e) tVar).f17603b.setValue(pd.z.f43080a);
            } else {
                boolean z11 = abstractC3022q instanceof C3011f;
                AbstractC5304a abstractC5304a = this.f30123l;
                if (z11) {
                    ((Yb.f) abstractC5304a).f22215a.setValue(new C5305b("This is a simulated sunset", "Learn more", "https://status.openai.com"));
                } else if (abstractC3022q instanceof C3015j) {
                    ((Yb.f) abstractC5304a).f22215a.setValue(new C5306c("This is a simulated sunset"));
                } else if (!(abstractC3022q instanceof C3017l)) {
                    if (abstractC3022q instanceof C3018m) {
                        W.G(Pc.e.a(), "Simulated error", null, 6);
                    } else if (abstractC3022q instanceof C3019n) {
                        W.W(Pc.e.a(), "Simulated warning", null, null, 6);
                    }
                } else {
                    throw new RuntimeException("Simulated crash");
                }
            }
        }
    }
}
