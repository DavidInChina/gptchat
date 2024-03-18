package Yf;

import bg.AbstractC2199g;
import id.AbstractC3557B;
import kg.C4294f;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final C4294f f22384a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC2199g f22385b;

    public r(C4294f c4294f, AbstractC2199g abstractC2199g) {
        AbstractC3557B.c0("name", c4294f);
        this.f22384a = c4294f;
        this.f22385b = abstractC2199g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            if (AbstractC3557B.K(this.f22384a, ((r) obj).f22384a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22384a.hashCode();
    }
}
