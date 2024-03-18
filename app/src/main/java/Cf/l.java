package Cf;

/* loaded from: classes.dex */
public final class l extends i {
    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (!isEmpty() || !((l) obj).isEmpty()) {
                l lVar = (l) obj;
                if (this.f3115Y == lVar.f3115Y) {
                    if (this.f3116Z == lVar.f3116Z) {
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
        long j6 = this.f3115Y;
        long j10 = 31 * (j6 ^ (j6 >>> 32));
        long j11 = this.f3116Z;
        return (int) (j10 + (j11 ^ (j11 >>> 32)));
    }

    public final boolean isEmpty() {
        if (this.f3115Y > this.f3116Z) {
            return true;
        }
        return false;
    }

    public final boolean r(long j6) {
        if (this.f3115Y <= j6 && j6 <= this.f3116Z) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f3115Y + ".." + this.f3116Z;
    }
}
