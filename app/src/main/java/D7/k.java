package d7;

/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a  reason: collision with root package name */
    public final q f28097a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC2601a f28098b;

    public k(q qVar, AbstractC2601a abstractC2601a) {
        this.f28097a = qVar;
        this.f28098b = abstractC2601a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        q qVar = this.f28097a;
        if (qVar != null ? qVar.equals(((k) rVar).f28097a) : ((k) rVar).f28097a == null) {
            AbstractC2601a abstractC2601a = this.f28098b;
            if (abstractC2601a == null) {
                if (((k) rVar).f28098b == null) {
                    return true;
                }
            } else if (abstractC2601a.equals(((k) rVar).f28098b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        q qVar = this.f28097a;
        if (qVar == null) {
            i10 = 0;
        } else {
            i10 = qVar.hashCode();
        }
        int i12 = (i10 ^ 1000003) * 1000003;
        AbstractC2601a abstractC2601a = this.f28098b;
        if (abstractC2601a != null) {
            i11 = abstractC2601a.hashCode();
        }
        return i11 ^ i12;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f28097a + ", androidClientInfo=" + this.f28098b + "}";
    }
}
