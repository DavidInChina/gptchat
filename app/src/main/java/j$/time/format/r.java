package j$.time.format;

import android.gov.nist.core.Separators;
import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.chrono.AbstractC3699b;
import j$.time.chrono.ChronoLocalDate;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class r extends l {

    /* renamed from: i  reason: collision with root package name */
    static final LocalDate f35043i = LocalDate.of(2000, 1, 1);

    /* renamed from: g  reason: collision with root package name */
    private final int f35044g;

    /* renamed from: h  reason: collision with root package name */
    private final ChronoLocalDate f35045h;

    private r(j$.time.temporal.r rVar, int i10, int i11, int i12, ChronoLocalDate chronoLocalDate, int i13) {
        super(rVar, i10, i11, G.NOT_NEGATIVE, i13);
        this.f35044g = i12;
        this.f35045h = chronoLocalDate;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(j$.time.temporal.r rVar, LocalDate localDate) {
        this(rVar, 2, 2, 0, localDate, 0);
        if (localDate == null) {
            long j6 = 0;
            if (!rVar.p().i(j6)) {
                throw new IllegalArgumentException("The base value must be within the range of the field");
            }
            if (j6 + l.f35018f[2] > 2147483647L) {
                throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ r(j$.time.temporal.r rVar, LocalDate localDate, int i10) {
        this(rVar, 2, 2, 0, localDate, i10);
    }

    @Override // j$.time.format.l
    final long b(A a5, long j6) {
        long abs = Math.abs(j6);
        ChronoLocalDate chronoLocalDate = this.f35045h;
        long p10 = chronoLocalDate != null ? AbstractC3699b.p(a5.d()).q(chronoLocalDate).p(this.f35019a) : this.f35044g;
        int i10 = (j6 > p10 ? 1 : (j6 == p10 ? 0 : -1));
        long[] jArr = l.f35018f;
        if (i10 >= 0) {
            long j10 = jArr[this.f35020b];
            if (j6 < p10 + j10) {
                return abs % j10;
            }
        }
        return abs % jArr[this.f35021c];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.l
    public final boolean c(y yVar) {
        if (!yVar.l()) {
            return false;
        }
        return super.c(yVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [j$.time.format.q] */
    @Override // j$.time.format.l
    public final int d(final y yVar, final long j6, final int i10, final int i11) {
        int i12;
        ChronoLocalDate chronoLocalDate = this.f35045h;
        if (chronoLocalDate != null) {
            i12 = yVar.h().q(chronoLocalDate).p(this.f35019a);
            yVar.a(new Consumer() { // from class: j$.time.format.q
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    j$.time.chrono.k kVar = (j$.time.chrono.k) obj;
                    r.this.d(yVar, j6, i10, i11);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            i12 = this.f35044g;
        }
        int i13 = i11 - i10;
        int i14 = this.f35020b;
        if (i13 == i14 && j6 >= 0) {
            long j10 = l.f35018f[i14];
            long j11 = i12;
            long j12 = j11 - (j11 % j10);
            j6 = i12 > 0 ? j12 + j6 : j12 - j6;
            if (j6 < j11) {
                j6 += j10;
            }
        }
        return yVar.o(this.f35019a, j6, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.l
    public final l e() {
        if (this.f35023e == -1) {
            return this;
        }
        return new r(this.f35019a, this.f35020b, this.f35021c, this.f35044g, this.f35045h, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.l
    public final l f(int i10) {
        int i11 = this.f35020b;
        int i12 = this.f35021c;
        return new r(this.f35019a, i11, i12, this.f35044g, this.f35045h, this.f35023e + i10);
    }

    @Override // j$.time.format.l
    public final String toString() {
        Integer valueOf = Integer.valueOf(this.f35044g);
        Object obj = this.f35045h;
        if (obj == null) {
            obj = Objects.requireNonNull(valueOf, "defaultObj");
        }
        return "ReducedValue(" + this.f35019a + Separators.COMMA + this.f35020b + Separators.COMMA + this.f35021c + Separators.COMMA + obj + Separators.RPAREN;
    }
}
