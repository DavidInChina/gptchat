package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3837u2 extends AbstractC3751d0 {

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ long f35744s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ long f35745t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3837u2(AbstractC3745c abstractC3745c, int i10, long j6, long j10) {
        super(abstractC3745c, i10);
        this.f35744s = j6;
        this.f35745t = j10;
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [j$.util.stream.J3, j$.util.Spliterator] */
    @Override // j$.util.stream.AbstractC3745c
    final H0 T0(Spliterator spliterator, AbstractC3745c abstractC3745c, IntFunction intFunction) {
        long j6;
        long j10;
        long k02 = abstractC3745c.k0(spliterator);
        if (k02 <= 0 || !spliterator.hasCharacteristics(16384)) {
            if (EnumC3759e3.ORDERED.s(abstractC3745c.s0())) {
                return (H0) new A2(this, abstractC3745c, spliterator, intFunction, this.f35744s, this.f35745t).invoke();
            }
            j$.util.I i10 = (j$.util.I) abstractC3745c.a1(spliterator);
            long j11 = this.f35744s;
            int i11 = (j11 > k02 ? 1 : (j11 == k02 ? 0 : -1));
            long j12 = this.f35745t;
            if (i11 <= 0) {
                j6 = j12 >= 0 ? Math.min(j12, k02 - j11) : k02 - j11;
                j10 = 0;
            } else {
                j6 = j12;
                j10 = j11;
            }
            return AbstractC3855y0.c0(this, new J3(i10, j10, j6), true);
        }
        return AbstractC3855y0.c0(abstractC3745c, AbstractC3855y0.Y(abstractC3745c.Q0(), spliterator, this.f35744s, this.f35745t), true);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.J3, j$.util.Spliterator] */
    @Override // j$.util.stream.AbstractC3745c
    final Spliterator U0(AbstractC3745c abstractC3745c, Spliterator spliterator) {
        long j6;
        long j10;
        long k02 = abstractC3745c.k0(spliterator);
        int i10 = (k02 > 0L ? 1 : (k02 == 0L ? 0 : -1));
        long j11 = this.f35745t;
        if (i10 > 0 && spliterator.hasCharacteristics(16384)) {
            long j12 = this.f35744s;
            return new A3((j$.util.I) abstractC3745c.a1(spliterator), j12, AbstractC3855y0.X(j12, j11));
        }
        if (!EnumC3759e3.ORDERED.s(abstractC3745c.s0())) {
            j$.util.I i11 = (j$.util.I) abstractC3745c.a1(spliterator);
            long j13 = this.f35744s;
            if (j13 <= k02) {
                long j14 = k02 - j13;
                if (j11 >= 0) {
                    j14 = Math.min(j11, j14);
                }
                j10 = 0;
                j6 = j14;
            } else {
                j6 = j11;
                j10 = j13;
            }
            return new J3(i11, j10, j6);
        }
        return ((H0) new A2(this, abstractC3745c, spliterator, new N0(5), this.f35744s, this.f35745t).invoke()).mo101spliterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3745c
    public final AbstractC3818q2 W0(int i10, AbstractC3818q2 abstractC3818q2) {
        return new C3832t2(this, abstractC3818q2);
    }
}
