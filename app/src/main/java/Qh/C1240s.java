package Qh;

import wh.AbstractC6236a;
import wh.AbstractC6250o;
import wh.C6246k;

/* renamed from: Qh.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1240s extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final C6246k f15002a;

    public C1240s(C6246k c6246k) {
        this.f15002a = c6246k;
    }

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        return ((AbstractC6236a) ((AbstractC6250o) obj)).j1().equals(this.f15002a);
    }

    @Override // Qh.AbstractC1233k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C1240s.class != obj.getClass()) {
            return false;
        }
        if (!this.f15002a.equals(((C1240s) obj).f15002a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f15002a.hashCode() + (super.hashCode() * 31);
    }
}
