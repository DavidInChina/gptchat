package e3;

import L2.G;
import s2.AbstractC5530A;
import s2.u;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final G f28820a;

    /* renamed from: d  reason: collision with root package name */
    public s f28823d;

    /* renamed from: e  reason: collision with root package name */
    public f f28824e;

    /* renamed from: f  reason: collision with root package name */
    public int f28825f;

    /* renamed from: g  reason: collision with root package name */
    public int f28826g;

    /* renamed from: h  reason: collision with root package name */
    public int f28827h;

    /* renamed from: i  reason: collision with root package name */
    public int f28828i;

    /* renamed from: l  reason: collision with root package name */
    public boolean f28831l;

    /* renamed from: b  reason: collision with root package name */
    public final r f28821b = new r();

    /* renamed from: c  reason: collision with root package name */
    public final u f28822c = new u();

    /* renamed from: j  reason: collision with root package name */
    public final u f28829j = new u(1);

    /* renamed from: k  reason: collision with root package name */
    public final u f28830k = new u();

    public i(G g10, s sVar, f fVar) {
        this.f28820a = g10;
        this.f28823d = sVar;
        this.f28824e = fVar;
        this.f28823d = sVar;
        this.f28824e = fVar;
        g10.b(sVar.f28936a.f28908f);
        d();
    }

    public final q a() {
        if (!this.f28831l) {
            return null;
        }
        r rVar = this.f28821b;
        f fVar = rVar.f28919a;
        int i10 = AbstractC5530A.f45131a;
        int i11 = fVar.f28812a;
        q qVar = rVar.f28931m;
        if (qVar == null) {
            q[] qVarArr = this.f28823d.f28936a.f28913k;
            if (qVarArr == null) {
                qVar = null;
            } else {
                qVar = qVarArr[i11];
            }
        }
        if (qVar == null || !qVar.f28914a) {
            return null;
        }
        return qVar;
    }

    public final boolean b() {
        this.f28825f++;
        if (!this.f28831l) {
            return false;
        }
        int i10 = this.f28826g + 1;
        this.f28826g = i10;
        int[] iArr = this.f28821b.f28925g;
        int i11 = this.f28827h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.f28827h = i11 + 1;
        this.f28826g = 0;
        return false;
    }

    public final int c(int i10, int i11) {
        u uVar;
        boolean z10;
        boolean z11;
        int i12;
        q a5 = a();
        if (a5 == null) {
            return 0;
        }
        r rVar = this.f28821b;
        int i13 = a5.f28917d;
        if (i13 != 0) {
            uVar = rVar.f28932n;
        } else {
            int i14 = AbstractC5530A.f45131a;
            byte[] bArr = a5.f28918e;
            int length = bArr.length;
            u uVar2 = this.f28830k;
            uVar2.D(length, bArr);
            i13 = bArr.length;
            uVar = uVar2;
        }
        int i15 = this.f28825f;
        if (rVar.f28929k && rVar.f28930l[i15]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && i11 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        u uVar3 = this.f28829j;
        byte[] bArr2 = uVar3.f45193a;
        if (z11) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        bArr2[0] = (byte) (i12 | i13);
        uVar3.F(0);
        G g10 = this.f28820a;
        g10.d(1, 1, uVar3);
        g10.d(i13, 1, uVar);
        if (!z11) {
            return i13 + 1;
        }
        u uVar4 = this.f28822c;
        if (!z10) {
            uVar4.C(8);
            byte[] bArr3 = uVar4.f45193a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) 0;
            bArr3[3] = (byte) (i11 & 255);
            bArr3[4] = (byte) ((i10 >> 24) & 255);
            bArr3[5] = (byte) ((i10 >> 16) & 255);
            bArr3[6] = (byte) ((i10 >> 8) & 255);
            bArr3[7] = (byte) (i10 & 255);
            g10.d(8, 1, uVar4);
            return i13 + 9;
        }
        u uVar5 = rVar.f28932n;
        int z12 = uVar5.z();
        uVar5.G(-2);
        int i16 = (z12 * 6) + 2;
        if (i11 != 0) {
            uVar4.C(i16);
            byte[] bArr4 = uVar4.f45193a;
            uVar5.e(bArr4, 0, i16);
            int i17 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i11;
            bArr4[2] = (byte) ((i17 >> 8) & 255);
            bArr4[3] = (byte) (i17 & 255);
        } else {
            uVar4 = uVar5;
        }
        g10.d(i16, 1, uVar4);
        return i13 + 1 + i16;
    }

    public final void d() {
        r rVar = this.f28821b;
        rVar.f28922d = 0;
        rVar.f28934p = 0L;
        rVar.f28935q = false;
        rVar.f28929k = false;
        rVar.f28933o = false;
        rVar.f28931m = null;
        this.f28825f = 0;
        this.f28827h = 0;
        this.f28826g = 0;
        this.f28828i = 0;
        this.f28831l = false;
    }
}
