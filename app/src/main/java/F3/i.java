package f3;

import c1.AbstractC2279d;
import java.util.ArrayList;
import java.util.Arrays;
import p2.C5065s;
import p2.M;
import p2.r;
import r9.y;
import s2.u;
import x8.N;

/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f29560o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p  reason: collision with root package name */
    public static final byte[] f29561p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n  reason: collision with root package name */
    public boolean f29562n;

    public static boolean e(u uVar, byte[] bArr) {
        if (uVar.a() < bArr.length) {
            return false;
        }
        int i10 = uVar.f45194b;
        byte[] bArr2 = new byte[bArr.length];
        uVar.e(bArr2, 0, bArr.length);
        uVar.F(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // f3.j
    public final long b(u uVar) {
        byte[] bArr = uVar.f45193a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f29571i * AbstractC2279d.o(b11, b10)) / 1000000;
    }

    @Override // f3.j
    public final boolean c(u uVar, long j6, U3.l lVar) {
        if (e(uVar, f29560o)) {
            byte[] copyOf = Arrays.copyOf(uVar.f45193a, uVar.f45195c);
            int i10 = copyOf[9] & 255;
            ArrayList i11 = AbstractC2279d.i(copyOf);
            if (((C5065s) lVar.f17423Z) != null) {
                return true;
            }
            r rVar = new r();
            rVar.f42237k = "audio/opus";
            rVar.f42250x = i10;
            rVar.f42251y = 48000;
            rVar.f42239m = i11;
            lVar.f17423Z = new C5065s(rVar);
            return true;
        } else if (e(uVar, f29561p)) {
            Gi.e.o((C5065s) lVar.f17423Z);
            if (this.f29562n) {
                return true;
            }
            this.f29562n = true;
            uVar.G(8);
            M P02 = y.P0(N.i0((String[]) y.V0(uVar, false, false).f12352i0));
            if (P02 == null) {
                return true;
            }
            r b10 = ((C5065s) lVar.f17423Z).b();
            b10.f42235i = P02.c(((C5065s) lVar.f17423Z).f42317o0);
            lVar.f17423Z = new C5065s(b10);
            return true;
        } else {
            Gi.e.o((C5065s) lVar.f17423Z);
            return false;
        }
    }

    @Override // f3.j
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f29562n = false;
        }
    }
}
