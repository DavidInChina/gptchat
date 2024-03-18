package L2;

import java.io.EOFException;
import p2.AbstractC5060m;
import p2.C5065s;

/* loaded from: classes2.dex */
public final class p implements G {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f10637a = new byte[4096];

    @Override // L2.G
    public final void a(int i10, s2.u uVar) {
        d(i10, 0, uVar);
    }

    @Override // L2.G
    public final int c(AbstractC5060m abstractC5060m, int i10, boolean z10) {
        return f(abstractC5060m, i10, z10);
    }

    @Override // L2.G
    public final void d(int i10, int i11, s2.u uVar) {
        uVar.G(i10);
    }

    public final int f(AbstractC5060m abstractC5060m, int i10, boolean z10) {
        byte[] bArr = this.f10637a;
        int read = abstractC5060m.read(bArr, 0, Math.min(bArr.length, i10));
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override // L2.G
    public final void b(C5065s c5065s) {
    }

    @Override // L2.G
    public final void e(long j6, int i10, int i11, int i12, F f6) {
    }
}
