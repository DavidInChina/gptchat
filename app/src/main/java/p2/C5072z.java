package p2;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import s2.AbstractC5530A;

/* renamed from: p2.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5072z implements AbstractC5057j {

    /* renamed from: n0  reason: collision with root package name */
    public static final String f42364n0 = Integer.toString(0, 36);

    /* renamed from: o0  reason: collision with root package name */
    public static final String f42365o0 = Integer.toString(1, 36);

    /* renamed from: p0  reason: collision with root package name */
    public static final String f42366p0 = Integer.toString(2, 36);

    /* renamed from: q0  reason: collision with root package name */
    public static final String f42367q0 = Integer.toString(3, 36);

    /* renamed from: r0  reason: collision with root package name */
    public static final String f42368r0 = Integer.toString(4, 36);

    /* renamed from: s0  reason: collision with root package name */
    public static final String f42369s0 = Integer.toString(5, 36);

    /* renamed from: t0  reason: collision with root package name */
    public static final String f42370t0 = Integer.toString(6, 36);

    /* renamed from: u0  reason: collision with root package name */
    public static final String f42371u0 = Integer.toString(7, 36);

    /* renamed from: v0  reason: collision with root package name */
    public static final A9.a f42372v0 = new A9.a(18);

    /* renamed from: Y  reason: collision with root package name */
    public final UUID f42373Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Uri f42374Z;

    /* renamed from: h0  reason: collision with root package name */
    public final x8.P f42375h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f42376i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f42377j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f42378k0;

    /* renamed from: l0  reason: collision with root package name */
    public final x8.N f42379l0;

    /* renamed from: m0  reason: collision with root package name */
    public final byte[] f42380m0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public C5072z(C5071y c5071y) {
        boolean z10;
        byte[] bArr;
        if (c5071y.f42358c && ((Uri) c5071y.f42360e) == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        Gi.e.n(z10);
        UUID uuid = (UUID) c5071y.f42359d;
        uuid.getClass();
        this.f42373Y = uuid;
        this.f42374Z = (Uri) c5071y.f42360e;
        this.f42375h0 = (x8.P) c5071y.f42361f;
        this.f42376i0 = c5071y.f42356a;
        this.f42378k0 = c5071y.f42358c;
        this.f42377j0 = c5071y.f42357b;
        this.f42379l0 = (x8.N) c5071y.f42362g;
        byte[] bArr2 = (byte[]) c5071y.f42363h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        this.f42380m0 = bArr;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f42364n0, this.f42373Y.toString());
        Uri uri = this.f42374Z;
        if (uri != null) {
            bundle.putParcelable(f42365o0, uri);
        }
        x8.P p10 = this.f42375h0;
        if (!p10.isEmpty()) {
            Bundle bundle2 = new Bundle();
            for (Map.Entry entry : p10.entrySet()) {
                bundle2.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle.putBundle(f42366p0, bundle2);
        }
        boolean z10 = this.f42376i0;
        if (z10) {
            bundle.putBoolean(f42367q0, z10);
        }
        boolean z11 = this.f42377j0;
        if (z11) {
            bundle.putBoolean(f42368r0, z11);
        }
        boolean z12 = this.f42378k0;
        if (z12) {
            bundle.putBoolean(f42369s0, z12);
        }
        x8.N n10 = this.f42379l0;
        if (!n10.isEmpty()) {
            bundle.putIntegerArrayList(f42370t0, new ArrayList<>(n10));
        }
        byte[] bArr = this.f42380m0;
        if (bArr != null) {
            bundle.putByteArray(f42371u0, bArr);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5072z)) {
            return false;
        }
        C5072z c5072z = (C5072z) obj;
        if (this.f42373Y.equals(c5072z.f42373Y) && AbstractC5530A.a(this.f42374Z, c5072z.f42374Z) && AbstractC5530A.a(this.f42375h0, c5072z.f42375h0) && this.f42376i0 == c5072z.f42376i0 && this.f42378k0 == c5072z.f42378k0 && this.f42377j0 == c5072z.f42377j0 && this.f42379l0.equals(c5072z.f42379l0) && Arrays.equals(this.f42380m0, c5072z.f42380m0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f42373Y.hashCode() * 31;
        Uri uri = this.f42374Z;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = this.f42375h0.hashCode();
        int hashCode3 = this.f42379l0.hashCode();
        return Arrays.hashCode(this.f42380m0) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i10) * 31)) * 31) + (this.f42376i0 ? 1 : 0)) * 31) + (this.f42378k0 ? 1 : 0)) * 31) + (this.f42377j0 ? 1 : 0)) * 31)) * 31);
    }
}
