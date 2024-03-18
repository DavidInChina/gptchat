package Cf;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class c extends a {
    static {
        new a((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f3097Y == cVar.f3097Y) {
                    if (this.f3098Z == cVar.f3098Z) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f3097Y * 31) + this.f3098Z;
    }

    public final boolean isEmpty() {
        if (AbstractC3557B.e0(this.f3097Y, this.f3098Z) > 0) {
            return true;
        }
        return false;
    }

    public final boolean r(char c10) {
        if (AbstractC3557B.e0(this.f3097Y, c10) <= 0 && AbstractC3557B.e0(c10, this.f3098Z) <= 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f3097Y + ".." + this.f3098Z;
    }
}
