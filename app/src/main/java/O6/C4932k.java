package o6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import k6.AbstractC4194d;
import m6.C4564c;
import y.AbstractC6463a;
import z.AbstractC6708l;

/* renamed from: o6.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4932k extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final String f40873j;

    /* renamed from: k  reason: collision with root package name */
    public final int f40874k;

    /* renamed from: l  reason: collision with root package name */
    public final Throwable f40875l;

    /* renamed from: m  reason: collision with root package name */
    public final String f40876m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f40877n;

    /* renamed from: o  reason: collision with root package name */
    public final Map f40878o;

    /* renamed from: p  reason: collision with root package name */
    public final C4564c f40879p;

    /* renamed from: q  reason: collision with root package name */
    public final String f40880q;

    /* renamed from: r  reason: collision with root package name */
    public final int f40881r;

    /* renamed from: s  reason: collision with root package name */
    public final List f40882s;

    public C4932k(String str, int i10, Throwable th2, String str2, boolean z10, Map map, C4564c c4564c, String str3, int i11, List list) {
        AbstractC2469q0.q("source", i10);
        AbstractC3557B.c0("eventTime", c4564c);
        AbstractC2469q0.q("sourceType", i11);
        this.f40873j = str;
        this.f40874k = i10;
        this.f40875l = th2;
        this.f40876m = str2;
        this.f40877n = z10;
        this.f40878o = map;
        this.f40879p = c4564c;
        this.f40880q = str3;
        this.f40881r = i11;
        this.f40882s = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4932k)) {
            return false;
        }
        C4932k c4932k = (C4932k) obj;
        if (AbstractC3557B.K(this.f40873j, c4932k.f40873j) && this.f40874k == c4932k.f40874k && AbstractC3557B.K(this.f40875l, c4932k.f40875l) && AbstractC3557B.K(this.f40876m, c4932k.f40876m) && this.f40877n == c4932k.f40877n && AbstractC3557B.K(this.f40878o, c4932k.f40878o) && AbstractC3557B.K(this.f40879p, c4932k.f40879p) && AbstractC3557B.K(this.f40880q, c4932k.f40880q) && this.f40881r == c4932k.f40881r && AbstractC3557B.K(this.f40882s, c4932k.f40882s)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int d10 = AbstractC6708l.d(this.f40874k, this.f40873j.hashCode() * 31, 31);
        int i12 = 0;
        Throwable th2 = this.f40875l;
        if (th2 == null) {
            i10 = 0;
        } else {
            i10 = th2.hashCode();
        }
        int i13 = (d10 + i10) * 31;
        String str = this.f40876m;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        boolean z10 = this.f40877n;
        if (z10) {
            z10 = true;
        }
        int i15 = z10 ? 1 : 0;
        int i16 = z10 ? 1 : 0;
        int hashCode = (this.f40879p.hashCode() + AbstractC6463a.f(this.f40878o, (i14 + i15) * 31, 31)) * 31;
        String str2 = this.f40880q;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return this.f40882s.hashCode() + AbstractC6708l.d(this.f40881r, (hashCode + i12) * 31, 31);
    }

    public final String toString() {
        return "AddError(message=" + this.f40873j + ", source=" + AbstractC2469q0.x(this.f40874k) + ", throwable=" + this.f40875l + ", stacktrace=" + this.f40876m + ", isFatal=" + this.f40877n + ", attributes=" + this.f40878o + ", eventTime=" + this.f40879p + ", type=" + this.f40880q + ", sourceType=" + AbstractC4194d.F(this.f40881r) + ", threads=" + this.f40882s + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40879p;
    }

    public /* synthetic */ C4932k(String str, int i10, Throwable th2, boolean z10, Map map, C4564c c4564c, String str2, List list, int i11) {
        this(str, i10, th2, null, z10, map, (i11 & 64) != 0 ? new C4564c() : c4564c, (i11 & 128) != 0 ? null : str2, 1, list);
    }
}
