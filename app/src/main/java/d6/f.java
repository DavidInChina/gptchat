package d6;

import F5.h;
import I8.v;
import K4.J;
import id.AbstractC3557B;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import u5.C5843c;

/* loaded from: classes2.dex */
public final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5091c f28034a;

    public f(AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f28034a = abstractC5091c;
    }

    @Override // F5.h
    public final Object a(Object obj) {
        String str = (String) obj;
        EnumC5090b enumC5090b = EnumC5090b.f42740h0;
        EnumC5090b enumC5090b2 = EnumC5090b.f42739Z;
        AbstractC3557B.c0("model", str);
        try {
            return J.x(str);
        } catch (v e10) {
            P4.a.l0(this.f28034a, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), new C5843c(str, 24), e10, 48);
            return null;
        } catch (IllegalStateException e11) {
            P4.a.l0(this.f28034a, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), new C5843c(str, 25), e11, 48);
            return null;
        }
    }
}
