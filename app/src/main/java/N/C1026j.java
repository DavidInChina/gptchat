package N;

import d1.AbstractC2586u;
import l8.AbstractC4344b;
import q0.C5251c;

/* renamed from: N.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1026j implements AbstractC2586u {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC1027k f12356a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC1031o f12357b;

    /* renamed from: c  reason: collision with root package name */
    public long f12358c = C5251c.f43619b;

    public C1026j(EnumC1027k enumC1027k, AbstractC1031o abstractC1031o) {
        this.f12356a = enumC1027k;
        this.f12357b = abstractC1031o;
        int i10 = C5251c.f43622e;
    }

    @Override // d1.AbstractC2586u
    public final long a(Z0.j jVar, long j6, Z0.l lVar, long j10) {
        int i10;
        long b10 = this.f12357b.b();
        if (!R4.b.z1(b10)) {
            b10 = this.f12358c;
        }
        this.f12358c = b10;
        int ordinal = this.f12356a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i10 = ((int) (j10 >> 32)) / 2;
                } else {
                    throw new RuntimeException();
                }
            } else {
                i10 = (int) (j10 >> 32);
            }
        } else {
            i10 = 0;
        }
        long c10 = kotlin.jvm.internal.m.c(AbstractC4344b.Y0(C5251c.d(b10)), AbstractC4344b.Y0(C5251c.e(b10)));
        int i11 = jVar.f22800a;
        int i12 = Z0.i.f22798c;
        return kotlin.jvm.internal.m.c((i11 + ((int) (c10 >> 32))) - i10, jVar.f22801b + ((int) (c10 & 4294967295L)));
    }
}
