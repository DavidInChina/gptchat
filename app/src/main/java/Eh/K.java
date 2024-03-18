package Eh;

import wh.AbstractC6250o;
import wh.C6238c;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6250o f4754a;

    public K(C6238c c6238c) {
        this.f4754a = c6238c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        if (this.f4754a.equals(((K) obj).f4754a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4754a.hashCode() + (K.class.hashCode() * 31);
    }
}
