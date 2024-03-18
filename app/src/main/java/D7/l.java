package d7;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a  reason: collision with root package name */
    public final long f28099a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f28100b;

    /* renamed from: c  reason: collision with root package name */
    public final long f28101c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f28102d;

    /* renamed from: e  reason: collision with root package name */
    public final String f28103e;

    /* renamed from: f  reason: collision with root package name */
    public final long f28104f;

    /* renamed from: g  reason: collision with root package name */
    public final w f28105g;

    public l(long j6, Integer num, long j10, byte[] bArr, String str, long j11, w wVar) {
        this.f28099a = j6;
        this.f28100b = num;
        this.f28101c = j10;
        this.f28102d = bArr;
        this.f28103e = str;
        this.f28104f = j11;
        this.f28105g = wVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f28099a == ((l) sVar).f28099a && ((num = this.f28100b) != null ? num.equals(((l) sVar).f28100b) : ((l) sVar).f28100b == null)) {
            l lVar = (l) sVar;
            if (this.f28101c == lVar.f28101c) {
                if (sVar instanceof l) {
                    bArr = ((l) sVar).f28102d;
                } else {
                    bArr = lVar.f28102d;
                }
                if (Arrays.equals(this.f28102d, bArr)) {
                    String str = lVar.f28103e;
                    String str2 = this.f28103e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f28104f == lVar.f28104f) {
                            w wVar = lVar.f28105g;
                            w wVar2 = this.f28105g;
                            if (wVar2 == null) {
                                if (wVar == null) {
                                    return true;
                                }
                            } else if (wVar2.equals(wVar)) {
                                return true;
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
        long j6 = this.f28099a;
        int i12 = (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
        int i13 = 0;
        Integer num = this.f28100b;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        long j10 = this.f28101c;
        int hashCode = (((((i12 ^ i10) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f28102d)) * 1000003;
        String str = this.f28103e;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        long j11 = this.f28104f;
        int i14 = (((hashCode ^ i11) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        w wVar = this.f28105g;
        if (wVar != null) {
            i13 = wVar.hashCode();
        }
        return i14 ^ i13;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f28099a + ", eventCode=" + this.f28100b + ", eventUptimeMs=" + this.f28101c + ", sourceExtension=" + Arrays.toString(this.f28102d) + ", sourceExtensionJsonProto3=" + this.f28103e + ", timezoneOffsetSeconds=" + this.f28104f + ", networkConnectionInfo=" + this.f28105g + "}";
    }
}
