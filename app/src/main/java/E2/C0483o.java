package E2;

import android.net.Uri;
import java.util.Map;
import v2.AbstractC5969h;

/* renamed from: E2.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483o implements AbstractC5969h {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5969h f4387a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4388b;

    /* renamed from: c  reason: collision with root package name */
    public final J f4389c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f4390d;

    /* renamed from: e  reason: collision with root package name */
    public int f4391e;

    public C0483o(v2.D d10, int i10, J j6) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        this.f4387a = d10;
        this.f4388b = i10;
        this.f4389c = j6;
        this.f4390d = new byte[1];
        this.f4391e = i10;
    }

    @Override // v2.AbstractC5969h
    public final long a(v2.l lVar) {
        throw new UnsupportedOperationException();
    }

    @Override // v2.AbstractC5969h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // v2.AbstractC5969h
    public final void g(v2.F f6) {
        f6.getClass();
        this.f4387a.g(f6);
    }

    @Override // v2.AbstractC5969h
    public final Uri getUri() {
        return this.f4387a.getUri();
    }

    @Override // v2.AbstractC5969h
    public final Map j() {
        return this.f4387a.j();
    }

    @Override // p2.AbstractC5060m
    public final int read(byte[] bArr, int i10, int i11) {
        long max;
        int i12 = this.f4391e;
        AbstractC5969h abstractC5969h = this.f4387a;
        if (i12 == 0) {
            byte[] bArr2 = this.f4390d;
            if (abstractC5969h.read(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    int i15 = 0;
                    while (i14 > 0) {
                        int read = abstractC5969h.read(bArr3, i15, i14);
                        if (read != -1) {
                            i15 += read;
                            i14 -= read;
                        }
                    }
                    while (i13 > 0 && bArr3[i13 - 1] == 0) {
                        i13--;
                    }
                    if (i13 > 0) {
                        s2.u uVar = new s2.u(i13, bArr3);
                        J j6 = this.f4389c;
                        if (!j6.f4162m) {
                            max = j6.f4159j;
                        } else {
                            max = Math.max(j6.f4163n.o(true), j6.f4159j);
                        }
                        long j10 = max;
                        int a5 = uVar.a();
                        X x10 = j6.f4161l;
                        x10.getClass();
                        x10.d(a5, 0, uVar);
                        x10.e(j10, 1, a5, 0, null);
                        j6.f4162m = true;
                    }
                }
                this.f4391e = this.f4388b;
            }
            return -1;
        }
        int read2 = abstractC5969h.read(bArr, i10, Math.min(this.f4391e, i11));
        if (read2 != -1) {
            this.f4391e -= read2;
        }
        return read2;
    }
}
