package n6;

import I8.v;
import K4.J;
import id.AbstractC3557B;
import p5.AbstractC5091c;
import p5.EnumC5090b;

/* loaded from: classes.dex */
public final class g implements F5.h {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5091c f39643a;

    public g(AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f39643a = abstractC5091c;
    }

    @Override // F5.h
    public final Object a(Object obj) {
        byte[] bArr = (byte[]) obj;
        AbstractC3557B.c0("model", bArr);
        if (bArr.length == 0) {
            return null;
        }
        try {
            return J.w(new String(bArr, Lg.a.f11131a), this.f39643a);
        } catch (v e10) {
            P4.a.m0(this.f39643a, 5, EnumC5090b.f42738Y, f.f39642Y, e10, false, 48);
            return null;
        }
    }
}
