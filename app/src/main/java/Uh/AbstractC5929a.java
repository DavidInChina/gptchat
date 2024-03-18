package uh;

import sh.AbstractC5637i;
import yh.l1;

/* renamed from: uh.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5929a implements AbstractC5637i {

    /* renamed from: Y  reason: collision with root package name */
    public transient /* synthetic */ int f46814Y;

    public abstract l1 b();

    public abstract String d();

    public abstract Enum e(Class cls);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC5929a)) {
            return false;
        }
        AbstractC5929a abstractC5929a = (AbstractC5929a) obj;
        if (b().equals(abstractC5929a.b()) && d().equals(abstractC5929a.d())) {
            return true;
        }
        return false;
    }

    @Override // sh.AbstractC5637i
    public final String f1() {
        return d();
    }

    public final int hashCode() {
        int i10;
        if (this.f46814Y != 0) {
            i10 = 0;
        } else {
            i10 = d().hashCode() + (b().hashCode() * 31);
        }
        if (i10 == 0) {
            return this.f46814Y;
        }
        this.f46814Y = i10;
        return i10;
    }

    public final String toString() {
        return d();
    }
}
