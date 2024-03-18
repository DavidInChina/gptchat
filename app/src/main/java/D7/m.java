package d7;

import java.util.List;

/* loaded from: classes.dex */
public final class m extends t {

    /* renamed from: a  reason: collision with root package name */
    public final long f28106a;

    /* renamed from: b  reason: collision with root package name */
    public final long f28107b;

    /* renamed from: c  reason: collision with root package name */
    public final r f28108c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f28109d;

    /* renamed from: e  reason: collision with root package name */
    public final String f28110e;

    /* renamed from: f  reason: collision with root package name */
    public final List f28111f;

    /* renamed from: g  reason: collision with root package name */
    public final x f28112g;

    public m(long j6, long j10, r rVar, Integer num, String str, List list, x xVar) {
        this.f28106a = j6;
        this.f28107b = j10;
        this.f28108c = rVar;
        this.f28109d = num;
        this.f28110e = str;
        this.f28111f = list;
        this.f28112g = xVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f28106a == ((m) tVar).f28106a) {
            m mVar = (m) tVar;
            if (this.f28107b == mVar.f28107b) {
                r rVar = mVar.f28108c;
                r rVar2 = this.f28108c;
                if (rVar2 != null ? rVar2.equals(rVar) : rVar == null) {
                    Integer num = mVar.f28109d;
                    Integer num2 = this.f28109d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = mVar.f28110e;
                        String str2 = this.f28110e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            List list = mVar.f28111f;
                            List list2 = this.f28111f;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                x xVar = mVar.f28112g;
                                x xVar2 = this.f28112g;
                                if (xVar2 == null) {
                                    if (xVar == null) {
                                        return true;
                                    }
                                } else if (xVar2.equals(xVar)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        long j6 = this.f28106a;
        long j10 = this.f28107b;
        int i14 = (((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        int i15 = 0;
        r rVar = this.f28108c;
        if (rVar == null) {
            i10 = 0;
        } else {
            i10 = rVar.hashCode();
        }
        int i16 = (i14 ^ i10) * 1000003;
        Integer num = this.f28109d;
        if (num == null) {
            i11 = 0;
        } else {
            i11 = num.hashCode();
        }
        int i17 = (i16 ^ i11) * 1000003;
        String str = this.f28110e;
        if (str == null) {
            i12 = 0;
        } else {
            i12 = str.hashCode();
        }
        int i18 = (i17 ^ i12) * 1000003;
        List list = this.f28111f;
        if (list == null) {
            i13 = 0;
        } else {
            i13 = list.hashCode();
        }
        int i19 = (i18 ^ i13) * 1000003;
        x xVar = this.f28112g;
        if (xVar != null) {
            i15 = xVar.hashCode();
        }
        return i19 ^ i15;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f28106a + ", requestUptimeMs=" + this.f28107b + ", clientInfo=" + this.f28108c + ", logSource=" + this.f28109d + ", logSourceName=" + this.f28110e + ", logEvents=" + this.f28111f + ", qosTier=" + this.f28112g + "}";
    }
}
