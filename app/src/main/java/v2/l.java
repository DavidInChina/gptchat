package v2;

import android.gov.nist.core.Separators;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p2.I;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f47094k = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Uri f47095a;

    /* renamed from: b  reason: collision with root package name */
    public final long f47096b;

    /* renamed from: c  reason: collision with root package name */
    public final int f47097c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f47098d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f47099e;

    /* renamed from: f  reason: collision with root package name */
    public final long f47100f;

    /* renamed from: g  reason: collision with root package name */
    public final long f47101g;

    /* renamed from: h  reason: collision with root package name */
    public final String f47102h;

    /* renamed from: i  reason: collision with root package name */
    public final int f47103i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f47104j;

    static {
        I.a("media3.datasource");
    }

    public l(Uri uri, long j6, int i10, byte[] bArr, Map map, long j10, long j11, String str, int i11, Object obj) {
        boolean z10;
        boolean z11;
        byte[] bArr2 = bArr;
        boolean z12 = true;
        if (j6 + j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        if (j10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Gi.e.l(z11);
        if (j11 <= 0 && j11 != -1) {
            z12 = false;
        }
        Gi.e.l(z12);
        this.f47095a = uri;
        this.f47096b = j6;
        this.f47097c = i10;
        this.f47098d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f47099e = Collections.unmodifiableMap(new HashMap(map));
        this.f47100f = j10;
        this.f47101g = j11;
        this.f47102h = str;
        this.f47103i = i11;
        this.f47104j = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, v2.k] */
    public final k a() {
        ?? obj = new Object();
        obj.f47084a = this.f47095a;
        obj.f47085b = this.f47096b;
        obj.f47086c = this.f47097c;
        obj.f47087d = this.f47098d;
        obj.f47088e = this.f47099e;
        obj.f47089f = this.f47100f;
        obj.f47090g = this.f47101g;
        obj.f47091h = this.f47102h;
        obj.f47092i = this.f47103i;
        obj.f47093j = this.f47104j;
        return obj;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f47097c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    str = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str = "POST";
            }
        } else {
            str = "GET";
        }
        sb2.append(str);
        sb2.append(Separators.SP);
        sb2.append(this.f47095a);
        sb2.append(", ");
        sb2.append(this.f47100f);
        sb2.append(", ");
        sb2.append(this.f47101g);
        sb2.append(", ");
        sb2.append(this.f47102h);
        sb2.append(", ");
        return android.gov.nist.core.a.l(sb2, this.f47103i, "]");
    }
}
