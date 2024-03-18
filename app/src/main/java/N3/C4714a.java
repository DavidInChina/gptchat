package n3;

import A.AbstractC0044t0;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import g3.AbstractC3162e;
import g3.AbstractC3170m;
import g3.C3158a;
import g3.C3169l;
import java.nio.charset.Charset;
import java.util.List;
import r2.b;
import s2.AbstractC5530A;
import s2.AbstractC5535e;
import s2.p;
import s2.u;
import w8.e;
import x8.L;
import x8.N;
import x8.k0;

/* renamed from: n3.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4714a implements AbstractC3170m {

    /* renamed from: Y  reason: collision with root package name */
    public final u f39609Y = new u();

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f39610Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f39611h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f39612i0;

    /* renamed from: j0  reason: collision with root package name */
    public final String f39613j0;

    /* renamed from: k0  reason: collision with root package name */
    public final float f39614k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f39615l0;

    public C4714a(List list) {
        String str = "sans-serif";
        boolean z10 = false;
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f39611h0 = bArr[24];
            this.f39612i0 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f39613j0 = "Serif".equals(new String(bArr, 43, bArr.length - 43, e.f48221c)) ? "serif" : str;
            int i10 = bArr[25] * 20;
            this.f39615l0 = i10;
            z10 = (bArr[0] & 32) != 0 ? true : z10;
            this.f39610Z = z10;
            if (z10) {
                this.f39614k0 = AbstractC5530A.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
                return;
            } else {
                this.f39614k0 = 0.85f;
                return;
            }
        }
        this.f39611h0 = 0;
        this.f39612i0 = -1;
        this.f39613j0 = str;
        this.f39610Z = false;
        this.f39614k0 = 0.85f;
        this.f39615l0 = -1;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        boolean z10;
        boolean z11;
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z12 = true;
            if ((i10 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            if ((i10 & 4) == 0) {
                z12 = false;
            }
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (!z12 && !z10 && !z11) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    @Override // g3.AbstractC3170m
    public final /* synthetic */ AbstractC3162e e(byte[] bArr, int i10, int i11) {
        return AbstractC2469q0.b(this, bArr, i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g3.AbstractC3170m
    public final void f(byte[] bArr, int i10, int i11, C3169l c3169l, AbstractC5535e abstractC5535e) {
        boolean z10;
        String str;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        u uVar = this.f39609Y;
        uVar.D(i10 + i11, bArr);
        uVar.F(i10);
        int i13 = 1;
        int i14 = 2;
        int i15 = 0;
        if (uVar.a() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        int z14 = uVar.z();
        if (z14 == 0) {
            str = "";
        } else {
            int i16 = uVar.f45194b;
            Charset B10 = uVar.B();
            int i17 = z14 - (uVar.f45194b - i16);
            if (B10 == null) {
                B10 = e.f48221c;
            }
            str = uVar.s(i17, B10);
        }
        if (str.isEmpty()) {
            L l10 = N.f49523Z;
            abstractC5535e.accept(new C3158a(-9223372036854775807L, -9223372036854775807L, k0.f49573j0));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        c(spannableStringBuilder, this.f39611h0, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f39612i0, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str2 = this.f39613j0;
        if (str2 != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length, 16711713);
        }
        float f6 = this.f39614k0;
        while (uVar.a() >= 8) {
            int i18 = uVar.f45194b;
            int g10 = uVar.g();
            int g11 = uVar.g();
            if (g11 == 1937013100) {
                if (uVar.a() >= i14) {
                    z12 = i13;
                } else {
                    z12 = i15;
                }
                Gi.e.l(z12);
                int z15 = uVar.z();
                int i19 = i15;
                while (i19 < z15) {
                    if (uVar.a() >= 12) {
                        z13 = i13;
                    } else {
                        z13 = i15;
                    }
                    Gi.e.l(z13);
                    int z16 = uVar.z();
                    int z17 = uVar.z();
                    uVar.G(i14);
                    int u10 = uVar.u();
                    uVar.G(i13);
                    int g12 = uVar.g();
                    if (z17 > spannableStringBuilder.length()) {
                        StringBuilder q10 = android.gov.nist.core.a.q("Truncating styl end (", z17, ") to cueText.length() (");
                        q10.append(spannableStringBuilder.length());
                        q10.append(").");
                        p.g("Tx3gParser", q10.toString());
                        z17 = spannableStringBuilder.length();
                    }
                    if (z16 >= z17) {
                        p.g("Tx3gParser", AbstractC0044t0.y("Ignoring styl with start (", z16, ") >= end (", z17, ")."));
                    } else {
                        int i20 = z17;
                        c(spannableStringBuilder, u10, this.f39611h0, z16, i20, 0);
                        a(spannableStringBuilder, g12, this.f39612i0, z16, i20, 0);
                    }
                    i19++;
                    i13 = 1;
                    i14 = 2;
                    i15 = 0;
                }
                i12 = i14;
            } else if (g11 == 1952608120 && this.f39610Z) {
                i12 = 2;
                if (uVar.a() >= 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Gi.e.l(z11);
                f6 = AbstractC5530A.h(uVar.z() / this.f39615l0, 0.0f, 0.95f);
            } else {
                i12 = 2;
            }
            uVar.F(i18 + g10);
            i14 = i12;
            i13 = 1;
            i15 = 0;
        }
        abstractC5535e.accept(new C3158a(-9223372036854775807L, -9223372036854775807L, N.u0(new b(spannableStringBuilder, null, null, null, f6, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f))));
    }

    @Override // g3.AbstractC3170m
    public final /* synthetic */ void b() {
    }
}
