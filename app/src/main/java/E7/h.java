package e7;

import java.util.HashMap;
import java.util.Map;
import q.C5241w;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f29000a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f29001b;

    /* renamed from: c  reason: collision with root package name */
    public final l f29002c;

    /* renamed from: d  reason: collision with root package name */
    public final long f29003d;

    /* renamed from: e  reason: collision with root package name */
    public final long f29004e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f29005f;

    public h(String str, Integer num, l lVar, long j6, long j10, Map map) {
        this.f29000a = str;
        this.f29001b = num;
        this.f29002c = lVar;
        this.f29003d = j6;
        this.f29004e = j10;
        this.f29005f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f29005f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f29005f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final C5241w c() {
        C5241w c5241w = new C5241w(4);
        String str = this.f29000a;
        if (str != null) {
            c5241w.f43573a = str;
            c5241w.f43574b = this.f29001b;
            c5241w.n(this.f29002c);
            c5241w.f43576d = Long.valueOf(this.f29003d);
            c5241w.f43577e = Long.valueOf(this.f29004e);
            c5241w.f43578f = new HashMap(this.f29005f);
            return c5241w;
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f29000a.equals(hVar.f29000a)) {
            Integer num = hVar.f29001b;
            Integer num2 = this.f29001b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f29002c.equals(hVar.f29002c) && this.f29003d == hVar.f29003d && this.f29004e == hVar.f29004e && this.f29005f.equals(hVar.f29005f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f29000a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f29001b;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        long j6 = this.f29003d;
        long j10 = this.f29004e;
        return ((((((((hashCode ^ i10) * 1000003) ^ this.f29002c.hashCode()) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f29005f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f29000a + ", code=" + this.f29001b + ", encodedPayload=" + this.f29002c + ", eventMillis=" + this.f29003d + ", uptimeMillis=" + this.f29004e + ", autoMetadata=" + this.f29005f + "}";
    }
}
