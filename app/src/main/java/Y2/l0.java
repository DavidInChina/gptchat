package y2;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: c  reason: collision with root package name */
    public static final l0 f50651c;

    /* renamed from: a  reason: collision with root package name */
    public final long f50652a;

    /* renamed from: b  reason: collision with root package name */
    public final long f50653b;

    static {
        l0 l0Var = new l0(0L, 0L);
        new l0(Long.MAX_VALUE, Long.MAX_VALUE);
        new l0(Long.MAX_VALUE, 0L);
        new l0(0L, Long.MAX_VALUE);
        f50651c = l0Var;
    }

    public l0(long j6, long j10) {
        boolean z10;
        boolean z11 = true;
        if (j6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        Gi.e.l(j10 < 0 ? false : z11);
        this.f50652a = j6;
        this.f50653b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f50652a == l0Var.f50652a && this.f50653b == l0Var.f50653b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f50652a) * 31) + ((int) this.f50653b);
    }
}
