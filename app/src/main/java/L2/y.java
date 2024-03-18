package L2;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import g3.AbstractC3162e;
import g3.AbstractC3170m;
import g3.C3158a;
import g3.C3169l;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import o3.AbstractC4912h;
import o3.C4911g;
import p2.M;
import r2.C5357a;
import s2.AbstractC5530A;
import s2.AbstractC5535e;

/* loaded from: classes2.dex */
public final class y implements AbstractC3170m {

    /* renamed from: Y  reason: collision with root package name */
    public final s2.u f10658Y;

    public y(int i10) {
        if (i10 != 1) {
            this.f10658Y = new s2.u(10);
        } else {
            this.f10658Y = new s2.u();
        }
    }

    public final M a(r rVar, A9.a aVar) {
        s2.u uVar = this.f10658Y;
        M m10 = null;
        int i10 = 0;
        while (true) {
            try {
                rVar.n(uVar.f45193a, 0, 10);
                uVar.F(0);
                if (uVar.w() != 4801587) {
                    break;
                }
                uVar.G(3);
                int t10 = uVar.t();
                int i11 = t10 + 10;
                if (m10 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(uVar.f45193a, 0, bArr, 0, 10);
                    rVar.n(bArr, 10, t10);
                    m10 = new Y2.i(aVar).d0(i11, bArr);
                } else {
                    rVar.e(t10);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        rVar.k();
        rVar.e(i10);
        return m10;
    }

    @Override // g3.AbstractC3170m
    public final /* synthetic */ AbstractC3162e e(byte[] bArr, int i10, int i11) {
        return AbstractC2469q0.b(this, bArr, i10, i11);
    }

    @Override // g3.AbstractC3170m
    public final void f(byte[] bArr, int i10, int i11, C3169l c3169l, AbstractC5535e abstractC5535e) {
        boolean z10;
        r2.b bVar;
        boolean z11;
        s2.u uVar = this.f10658Y;
        uVar.D(i10 + i11, bArr);
        uVar.F(i10);
        ArrayList arrayList = new ArrayList();
        while (uVar.a() > 0) {
            if (uVar.a() >= 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            Gi.e.k("Incomplete Mp4Webvtt Top Level box header found.", z10);
            int g10 = uVar.g();
            if (uVar.g() == 1987343459) {
                int i12 = g10 - 8;
                CharSequence charSequence = null;
                C5357a c5357a = null;
                while (i12 > 0) {
                    if (i12 >= 8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Gi.e.k("Incomplete vtt cue box header found.", z11);
                    int g11 = uVar.g();
                    int g12 = uVar.g();
                    int i13 = g11 - 8;
                    byte[] bArr2 = uVar.f45193a;
                    int i14 = uVar.f45194b;
                    int i15 = AbstractC5530A.f45131a;
                    String str = new String(bArr2, i14, i13, w8.e.f48221c);
                    uVar.G(i13);
                    i12 = (i12 - 8) - i13;
                    if (g12 == 1937011815) {
                        C4911g c4911g = new C4911g();
                        AbstractC4912h.e(str, c4911g);
                        c5357a = c4911g.a();
                    } else if (g12 == 1885436268) {
                        charSequence = AbstractC4912h.f(null, str.trim(), Collections.emptyList());
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (c5357a != null) {
                    c5357a.f44320a = charSequence;
                    bVar = c5357a.a();
                } else {
                    Pattern pattern = AbstractC4912h.f40569a;
                    C4911g c4911g2 = new C4911g();
                    c4911g2.f40560c = charSequence;
                    bVar = c4911g2.a().a();
                }
                arrayList.add(bVar);
            } else {
                uVar.G(g10 - 8);
            }
        }
        abstractC5535e.accept(new C3158a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // g3.AbstractC3170m
    public final /* synthetic */ void b() {
    }
}
