package y2;

import E2.C0492y;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import p2.C5065s;
import s2.AbstractC5530A;

/* renamed from: y2.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6527n extends p2.Q {

    /* renamed from: t0  reason: collision with root package name */
    public static final String f50661t0 = Integer.toString(1001, 36);

    /* renamed from: u0  reason: collision with root package name */
    public static final String f50662u0 = Integer.toString(1002, 36);

    /* renamed from: v0  reason: collision with root package name */
    public static final String f50663v0 = Integer.toString(1003, 36);

    /* renamed from: w0  reason: collision with root package name */
    public static final String f50664w0 = Integer.toString(1004, 36);

    /* renamed from: x0  reason: collision with root package name */
    public static final String f50665x0 = Integer.toString(1005, 36);

    /* renamed from: y0  reason: collision with root package name */
    public static final String f50666y0 = Integer.toString(1006, 36);

    /* renamed from: m0  reason: collision with root package name */
    public final int f50667m0;

    /* renamed from: n0  reason: collision with root package name */
    public final String f50668n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f50669o0;

    /* renamed from: p0  reason: collision with root package name */
    public final C5065s f50670p0;

    /* renamed from: q0  reason: collision with root package name */
    public final int f50671q0;

    /* renamed from: r0  reason: collision with root package name */
    public final C0492y f50672r0;

    /* renamed from: s0  reason: collision with root package name */
    public final boolean f50673s0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public C6527n(int i10, Throwable th2, int i11) {
        this(i10, th2, i11, null, -1, null, 4, false);
    }

    @Override // p2.Q, p2.AbstractC5057j
    public final Bundle a() {
        Bundle a5 = super.a();
        a5.putInt(f50661t0, this.f50667m0);
        a5.putString(f50662u0, this.f50668n0);
        a5.putInt(f50663v0, this.f50669o0);
        C5065s c5065s = this.f50670p0;
        if (c5065s != null) {
            a5.putBundle(f50664w0, c5065s.e(false));
        }
        a5.putInt(f50665x0, this.f50671q0);
        a5.putBoolean(f50666y0, this.f50673s0);
        return a5;
    }

    public final C6527n b(C0492y c0492y) {
        String message = getMessage();
        int i10 = AbstractC5530A.f45131a;
        return new C6527n(message, getCause(), this.f41929Y, this.f50667m0, this.f50668n0, this.f50669o0, this.f50670p0, this.f50671q0, c0492y, this.f41930Z, this.f50673s0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6527n(int i10, Throwable th2, int i11, String str, int i12, C5065s c5065s, int i13, boolean z10) {
        this(!TextUtils.isEmpty(null) ? android.gov.nist.core.a.g(r0, ": null") : r0, th2, i11, i10, str, i12, c5065s, i13, null, SystemClock.elapsedRealtime(), z10);
        String str2;
        String str3;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    str2 = "Unexpected runtime error";
                } else {
                    str2 = "Remote error";
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" error, index=");
                sb2.append(i12);
                sb2.append(", format=");
                sb2.append(c5065s);
                sb2.append(", format_supported=");
                int i14 = AbstractC5530A.f45131a;
                if (i13 == 0) {
                    str3 = "NO";
                } else if (i13 == 1) {
                    str3 = "NO_UNSUPPORTED_TYPE";
                } else if (i13 == 2) {
                    str3 = "NO_UNSUPPORTED_DRM";
                } else if (i13 == 3) {
                    str3 = "NO_EXCEEDS_CAPABILITIES";
                } else if (i13 == 4) {
                    str3 = "YES";
                } else {
                    throw new IllegalStateException();
                }
                sb2.append(str3);
                str2 = sb2.toString();
            }
        } else {
            str2 = "Source error";
        }
    }

    public C6527n(String str, Throwable th2, int i10, int i11, String str2, int i12, C5065s c5065s, int i13, C0492y c0492y, long j6, boolean z10) {
        super(str, th2, i10, j6);
        boolean z11 = false;
        Gi.e.l(!z10 || i11 == 1);
        Gi.e.l((th2 != null || i11 == 3) ? true : z11);
        this.f50667m0 = i11;
        this.f50668n0 = str2;
        this.f50669o0 = i12;
        this.f50670p0 = c5065s;
        this.f50671q0 = i13;
        this.f50672r0 = c0492y;
        this.f50673s0 = z10;
    }
}
