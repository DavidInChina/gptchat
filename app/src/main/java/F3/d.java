package f3;

import K4.J;
import L2.v;
import java.util.Arrays;
import p2.C5065s;
import s2.u;

/* loaded from: classes.dex */
public final class d extends j {

    /* renamed from: n  reason: collision with root package name */
    public v f29543n;

    /* renamed from: o  reason: collision with root package name */
    public c f29544o;

    @Override // f3.j
    public final long b(u uVar) {
        byte[] bArr = uVar.f45193a;
        if (bArr[0] == -1) {
            int i10 = (bArr[2] & 255) >> 4;
            if (i10 == 6 || i10 == 7) {
                uVar.G(4);
                uVar.A();
            }
            int N10 = Gi.e.N(i10, uVar);
            uVar.F(0);
            return N10;
        }
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, f3.c] */
    @Override // f3.j
    public final boolean c(u uVar, long j6, U3.l lVar) {
        byte[] bArr = uVar.f45193a;
        v vVar = this.f29543n;
        if (vVar == null) {
            v vVar2 = new v(17, bArr);
            this.f29543n = vVar2;
            lVar.f17423Z = vVar2.c(Arrays.copyOfRange(bArr, 9, uVar.f45195c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            U3.c R10 = J.R(uVar);
            v vVar3 = new v(vVar.f10642a, vVar.f10643b, vVar.f10644c, vVar.f10645d, vVar.f10646e, vVar.f10648g, vVar.f10649h, vVar.f10651j, R10, vVar.f10653l);
            this.f29543n = vVar3;
            ?? obj = new Object();
            obj.f29539Y = vVar3;
            obj.f29540Z = R10;
            obj.f29541h0 = -1L;
            obj.f29542i0 = -1L;
            this.f29544o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            c cVar = this.f29544o;
            if (cVar != null) {
                cVar.f29541h0 = j6;
                lVar.f17424h0 = cVar;
            }
            ((C5065s) lVar.f17423Z).getClass();
            return false;
        }
    }

    @Override // f3.j
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f29543n = null;
            this.f29544o = null;
        }
    }
}
