package Ag;

import ud.C5902a;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Object f854a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC6216a f855b;

    public i(Object obj, C5902a c5902a) {
        this.f854a = obj;
        this.f855b = c5902a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass() && this.f854a.equals(((i) obj).f854a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f854a.hashCode();
    }
}
