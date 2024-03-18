package E5;

import F5.h;
import I8.v;
import M3.H;
import id.AbstractC3557B;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import u5.C5843c;

/* loaded from: classes2.dex */
public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5091c f4536a;

    public d(AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f4536a = abstractC5091c;
    }

    @Override // F5.h
    public final Object a(Object obj) {
        String str = (String) obj;
        AbstractC3557B.c0("model", str);
        try {
            try {
                return AbstractC3557B.F0(H.h0(str).y());
            } catch (IllegalStateException e10) {
                throw new RuntimeException("Unable to parse json into type NetworkInfo", e10);
            }
        } catch (v e11) {
            P4.a.l0(this.f4536a, 5, AbstractC4344b.G0(EnumC5090b.f42739Z, EnumC5090b.f42740h0), new C5843c(str, 14), e11, 48);
            return null;
        }
    }
}
