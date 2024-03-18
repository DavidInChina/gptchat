package r2;

import Gi.e;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;
import p2.AbstractC5057j;
import p2.Y;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class b implements AbstractC5057j {

    /* renamed from: Y  reason: collision with root package name */
    public final CharSequence f44355Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Layout.Alignment f44356Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Layout.Alignment f44357h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Bitmap f44358i0;

    /* renamed from: j0  reason: collision with root package name */
    public final float f44359j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f44360k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f44361l0;

    /* renamed from: m0  reason: collision with root package name */
    public final float f44362m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f44363n0;

    /* renamed from: o0  reason: collision with root package name */
    public final float f44364o0;

    /* renamed from: p0  reason: collision with root package name */
    public final float f44365p0;

    /* renamed from: q0  reason: collision with root package name */
    public final boolean f44366q0;

    /* renamed from: r0  reason: collision with root package name */
    public final int f44367r0;

    /* renamed from: s0  reason: collision with root package name */
    public final int f44368s0;

    /* renamed from: t0  reason: collision with root package name */
    public final float f44369t0;

    /* renamed from: u0  reason: collision with root package name */
    public final int f44370u0;

    /* renamed from: v0  reason: collision with root package name */
    public final float f44371v0;

    /* renamed from: w0  reason: collision with root package name */
    public static final String f44351w0 = Integer.toString(0, 36);

    /* renamed from: x0  reason: collision with root package name */
    public static final String f44352x0 = Integer.toString(1, 36);

    /* renamed from: y0  reason: collision with root package name */
    public static final String f44353y0 = Integer.toString(2, 36);

    /* renamed from: z0  reason: collision with root package name */
    public static final String f44354z0 = Integer.toString(3, 36);

    /* renamed from: A0  reason: collision with root package name */
    public static final String f44337A0 = Integer.toString(4, 36);

    /* renamed from: B0  reason: collision with root package name */
    public static final String f44338B0 = Integer.toString(5, 36);

    /* renamed from: C0  reason: collision with root package name */
    public static final String f44339C0 = Integer.toString(6, 36);

    /* renamed from: D0  reason: collision with root package name */
    public static final String f44340D0 = Integer.toString(7, 36);

    /* renamed from: E0  reason: collision with root package name */
    public static final String f44341E0 = Integer.toString(8, 36);

    /* renamed from: F0  reason: collision with root package name */
    public static final String f44342F0 = Integer.toString(9, 36);

    /* renamed from: G0  reason: collision with root package name */
    public static final String f44343G0 = Integer.toString(10, 36);

    /* renamed from: H0  reason: collision with root package name */
    public static final String f44344H0 = Integer.toString(11, 36);

    /* renamed from: I0  reason: collision with root package name */
    public static final String f44345I0 = Integer.toString(12, 36);

    /* renamed from: J0  reason: collision with root package name */
    public static final String f44346J0 = Integer.toString(13, 36);

    /* renamed from: K0  reason: collision with root package name */
    public static final String f44347K0 = Integer.toString(14, 36);

    /* renamed from: L0  reason: collision with root package name */
    public static final String f44348L0 = Integer.toString(15, 36);

    /* renamed from: M0  reason: collision with root package name */
    public static final String f44349M0 = Integer.toString(16, 36);

    /* renamed from: N0  reason: collision with root package name */
    public static final Y f44350N0 = new Y(12);

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        int i10 = AbstractC5530A.f45131a;
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f6, int i10, int i11, float f10, int i12, int i13, float f11, float f12, float f13, boolean z10, int i14, int i15, float f14) {
        boolean z11;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            if (bitmap == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            e.l(z11);
        }
        if (charSequence instanceof Spanned) {
            this.f44355Y = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f44355Y = charSequence.toString();
        } else {
            this.f44355Y = null;
        }
        this.f44356Z = alignment;
        this.f44357h0 = alignment2;
        this.f44358i0 = bitmap;
        this.f44359j0 = f6;
        this.f44360k0 = i10;
        this.f44361l0 = i11;
        this.f44362m0 = f10;
        this.f44363n0 = i12;
        this.f44364o0 = f12;
        this.f44365p0 = f13;
        this.f44366q0 = z10;
        this.f44367r0 = i14;
        this.f44368s0 = i13;
        this.f44369t0 = f11;
        this.f44370u0 = i15;
        this.f44371v0 = f14;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f44355Y;
        if (charSequence != null) {
            bundle.putCharSequence(f44351w0, charSequence);
        }
        bundle.putSerializable(f44352x0, this.f44356Z);
        bundle.putSerializable(f44353y0, this.f44357h0);
        Bitmap bitmap = this.f44358i0;
        if (bitmap != null) {
            bundle.putParcelable(f44354z0, bitmap);
        }
        bundle.putFloat(f44337A0, this.f44359j0);
        bundle.putInt(f44338B0, this.f44360k0);
        bundle.putInt(f44339C0, this.f44361l0);
        bundle.putFloat(f44340D0, this.f44362m0);
        bundle.putInt(f44341E0, this.f44363n0);
        bundle.putInt(f44342F0, this.f44368s0);
        bundle.putFloat(f44343G0, this.f44369t0);
        bundle.putFloat(f44344H0, this.f44364o0);
        bundle.putFloat(f44345I0, this.f44365p0);
        bundle.putBoolean(f44347K0, this.f44366q0);
        bundle.putInt(f44346J0, this.f44367r0);
        bundle.putInt(f44348L0, this.f44370u0);
        bundle.putFloat(f44349M0, this.f44371v0);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (TextUtils.equals(this.f44355Y, bVar.f44355Y) && this.f44356Z == bVar.f44356Z && this.f44357h0 == bVar.f44357h0) {
            Bitmap bitmap = bVar.f44358i0;
            Bitmap bitmap2 = this.f44358i0;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f44359j0 == bVar.f44359j0 && this.f44360k0 == bVar.f44360k0 && this.f44361l0 == bVar.f44361l0 && this.f44362m0 == bVar.f44362m0 && this.f44363n0 == bVar.f44363n0 && this.f44364o0 == bVar.f44364o0 && this.f44365p0 == bVar.f44365p0 && this.f44366q0 == bVar.f44366q0 && this.f44367r0 == bVar.f44367r0 && this.f44368s0 == bVar.f44368s0 && this.f44369t0 == bVar.f44369t0 && this.f44370u0 == bVar.f44370u0 && this.f44371v0 == bVar.f44371v0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44355Y, this.f44356Z, this.f44357h0, this.f44358i0, Float.valueOf(this.f44359j0), Integer.valueOf(this.f44360k0), Integer.valueOf(this.f44361l0), Float.valueOf(this.f44362m0), Integer.valueOf(this.f44363n0), Float.valueOf(this.f44364o0), Float.valueOf(this.f44365p0), Boolean.valueOf(this.f44366q0), Integer.valueOf(this.f44367r0), Integer.valueOf(this.f44368s0), Float.valueOf(this.f44369t0), Integer.valueOf(this.f44370u0), Float.valueOf(this.f44371v0)});
    }
}
