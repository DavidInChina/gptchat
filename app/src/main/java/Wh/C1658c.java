package Wh;

import id.AbstractC3557B;
import java.util.concurrent.TimeUnit;

/* renamed from: Wh.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1658c {

    /* renamed from: n  reason: collision with root package name */
    public static final C1658c f21170n = new C1658c(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: o  reason: collision with root package name */
    public static final C1658c f21171o;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21172a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f21173b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21174c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21175d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f21176e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f21177f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f21178g;

    /* renamed from: h  reason: collision with root package name */
    public final int f21179h;

    /* renamed from: i  reason: collision with root package name */
    public final int f21180i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f21181j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f21182k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f21183l;

    /* renamed from: m  reason: collision with root package name */
    public String f21184m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AbstractC3557B.c0("timeUnit", timeUnit);
        int i10 = Integer.MAX_VALUE;
        long seconds = timeUnit.toSeconds(Integer.MAX_VALUE);
        if (seconds <= 2147483647L) {
            i10 = (int) seconds;
        }
        f21171o = new C1658c(false, false, -1, -1, false, false, false, i10, -1, true, false, false, null);
    }

    public C1658c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f21172a = z10;
        this.f21173b = z11;
        this.f21174c = i10;
        this.f21175d = i11;
        this.f21176e = z12;
        this.f21177f = z13;
        this.f21178g = z14;
        this.f21179h = i12;
        this.f21180i = i13;
        this.f21181j = z15;
        this.f21182k = z16;
        this.f21183l = z17;
        this.f21184m = str;
    }

    public final String toString() {
        String str = this.f21184m;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f21172a) {
                sb2.append("no-cache, ");
            }
            if (this.f21173b) {
                sb2.append("no-store, ");
            }
            int i10 = this.f21174c;
            if (i10 != -1) {
                sb2.append("max-age=");
                sb2.append(i10);
                sb2.append(", ");
            }
            int i11 = this.f21175d;
            if (i11 != -1) {
                sb2.append("s-maxage=");
                sb2.append(i11);
                sb2.append(", ");
            }
            if (this.f21176e) {
                sb2.append("private, ");
            }
            if (this.f21177f) {
                sb2.append("public, ");
            }
            if (this.f21178g) {
                sb2.append("must-revalidate, ");
            }
            int i12 = this.f21179h;
            if (i12 != -1) {
                sb2.append("max-stale=");
                sb2.append(i12);
                sb2.append(", ");
            }
            int i13 = this.f21180i;
            if (i13 != -1) {
                sb2.append("min-fresh=");
                sb2.append(i13);
                sb2.append(", ");
            }
            if (this.f21181j) {
                sb2.append("only-if-cached, ");
            }
            if (this.f21182k) {
                sb2.append("no-transform, ");
            }
            if (this.f21183l) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                return "";
            }
            sb2.delete(sb2.length() - 2, sb2.length());
            String sb3 = sb2.toString();
            AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
            this.f21184m = sb3;
            return sb3;
        }
        return str;
    }
}
