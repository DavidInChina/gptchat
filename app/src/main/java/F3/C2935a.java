package f3;

import L2.A;
import L2.B;
import L2.C;
import java.math.BigInteger;
import s2.AbstractC5530A;

/* renamed from: f3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2935a implements B {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f29526a;

    public C2935a(b bVar) {
        this.f29526a = bVar;
    }

    @Override // L2.B
    public final boolean e() {
        return true;
    }

    @Override // L2.B
    public final A i(long j6) {
        b bVar = this.f29526a;
        BigInteger valueOf = BigInteger.valueOf((bVar.f29530i0.f29571i * j6) / 1000000);
        long j10 = bVar.f29529h0;
        long j11 = bVar.f29528Z;
        C c10 = new C(j6, AbstractC5530A.j((valueOf.multiply(BigInteger.valueOf(j10 - j11)).divide(BigInteger.valueOf(bVar.f29532k0)).longValue() + j11) - 30000, bVar.f29528Z, j10 - 1));
        return new A(c10, c10);
    }

    @Override // L2.B
    public final long j() {
        b bVar = this.f29526a;
        return (bVar.f29532k0 * 1000000) / bVar.f29530i0.f29571i;
    }
}
