package xg;

import id.AbstractC3557B;
import kg.C4290b;

/* renamed from: xg.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6454i {

    /* renamed from: a  reason: collision with root package name */
    public final C4290b f50004a;

    /* renamed from: b  reason: collision with root package name */
    public final C6452g f50005b;

    public C6454i(C4290b c4290b, C6452g c6452g) {
        AbstractC3557B.c0("classId", c4290b);
        this.f50004a = c4290b;
        this.f50005b = c6452g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6454i) {
            if (AbstractC3557B.K(this.f50004a, ((C6454i) obj).f50004a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f50004a.hashCode();
    }
}
