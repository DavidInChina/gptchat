package d7;

/* loaded from: classes.dex */
public final class o extends w {

    /* renamed from: a  reason: collision with root package name */
    public final v f28114a;

    /* renamed from: b  reason: collision with root package name */
    public final u f28115b;

    public o(v vVar, u uVar) {
        this.f28114a = vVar;
        this.f28115b = uVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        v vVar = this.f28114a;
        if (vVar != null ? vVar.equals(((o) wVar).f28114a) : ((o) wVar).f28114a == null) {
            u uVar = this.f28115b;
            if (uVar == null) {
                if (((o) wVar).f28115b == null) {
                    return true;
                }
            } else if (uVar.equals(((o) wVar).f28115b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        v vVar = this.f28114a;
        if (vVar == null) {
            i10 = 0;
        } else {
            i10 = vVar.hashCode();
        }
        int i12 = (i10 ^ 1000003) * 1000003;
        u uVar = this.f28115b;
        if (uVar != null) {
            i11 = uVar.hashCode();
        }
        return i11 ^ i12;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f28114a + ", mobileSubtype=" + this.f28115b + "}";
    }
}
