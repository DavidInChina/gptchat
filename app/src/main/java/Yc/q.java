package Yc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import xe.C6410O;
import xe.C6419h;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22266Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6419h f22267Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C6410O f22268h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(C6419h c6419h, C6410O c6410o, int i10) {
        super(1);
        this.f22266Y = i10;
        this.f22267Z = c6419h;
        this.f22268h0 = c6410o;
    }

    public final Boolean a(C6419h c6419h) {
        int i10 = this.f22266Y;
        boolean z10 = false;
        C6410O c6410o = this.f22268h0;
        C6419h c6419h2 = this.f22267Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("it", c6419h);
                if (AbstractC3557B.K(c6419h.f49888a, c6419h2.f49888a) && Ad.l.S0(c6419h, c6410o)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                AbstractC3557B.c0("it", c6419h);
                if (AbstractC3557B.K(c6419h.f49888a, c6419h2.f49888a) && R4.b.G1(c6419h, c6410o)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f22266Y) {
            case 0:
                return a((C6419h) obj);
            case 1:
                Vc.p pVar = (Vc.p) obj;
                AbstractC3557B.c0("current", pVar);
                ArrayList M22 = kf.t.M2(Ad.l.r0(pVar));
                C6419h c6419h = this.f22267Z;
                C6410O c6410o = this.f22268h0;
                kf.s.R1(new q(c6419h, c6410o, 0), M22);
                AbstractC3557B.c0("<this>", c6419h);
                AbstractC3557B.c0("requestUrl", c6410o);
                String str = c6419h.f49894g;
                if (str == null || !Lg.n.I2(str, Separators.SLASH, false)) {
                    c6419h = C6419h.a(c6419h, null, (String) c6410o.f49866i.getValue(), 959);
                }
                String str2 = c6419h.f49893f;
                if (str2 == null || Lg.n.n2(str2)) {
                    c6419h = C6419h.a(c6419h, c6410o.f49859b, null, 991);
                }
                M22.add(c6419h);
                return Ad.l.K(M22);
            default:
                return a((C6419h) obj);
        }
    }
}
