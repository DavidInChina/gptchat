package Mf;

import id.AbstractC3557B;
import lf.C4439d;

/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f12121a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12122b;

    public t0(String str, boolean z10) {
        this.f12121a = str;
        this.f12122b = z10;
    }

    public Integer a(t0 t0Var) {
        AbstractC3557B.c0("visibility", t0Var);
        C4439d c4439d = s0.f12119a;
        if (this == t0Var) {
            return 0;
        }
        C4439d c4439d2 = s0.f12119a;
        Integer num = (Integer) c4439d2.get(this);
        Integer num2 = (Integer) c4439d2.get(t0Var);
        if (num != null && num2 != null && !AbstractC3557B.K(num, num2)) {
            return Integer.valueOf(num.intValue() - num2.intValue());
        }
        return null;
    }

    public String b() {
        return this.f12121a;
    }

    public final String toString() {
        return b();
    }

    public t0 c() {
        return this;
    }
}
