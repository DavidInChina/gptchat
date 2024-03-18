package Uc;

import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class P extends Ad.l {

    /* renamed from: i  reason: collision with root package name */
    public final String f17624i;

    /* renamed from: j  reason: collision with root package name */
    public final kf.v f17625j = kf.v.f37483Y;

    public P(String str) {
        this.f17624i = str;
    }

    @Override // Ad.l
    public final List n0() {
        return this.f17625j;
    }

    public final String o1() {
        String str = this.f17624i;
        AbstractC3557B.c0("internalRoute", str);
        return str;
    }

    @Override // Ad.l
    public final String x0() {
        return this.f17624i;
    }
}
