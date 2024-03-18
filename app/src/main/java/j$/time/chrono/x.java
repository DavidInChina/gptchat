package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class x implements l, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final x f34955d;

    /* renamed from: e  reason: collision with root package name */
    private static final x[] f34956e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a  reason: collision with root package name */
    private final transient int f34957a;

    /* renamed from: b  reason: collision with root package name */
    private final transient LocalDate f34958b;

    /* renamed from: c  reason: collision with root package name */
    private final transient String f34959c;

    static {
        x xVar = new x(-1, LocalDate.of(1868, 1, 1), "Meiji");
        f34955d = xVar;
        x xVar2 = new x(0, LocalDate.of(1912, 7, 30), "Taisho");
        x xVar3 = new x(1, LocalDate.of(1926, 12, 25), "Showa");
        x xVar4 = new x(2, LocalDate.of(1989, 1, 8), "Heisei");
        x xVar5 = new x(3, LocalDate.of(2019, 5, 1), "Reiwa");
        f34956e = r8;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4, xVar5};
    }

    private x(int i10, LocalDate localDate, String str) {
        this.f34957a = i10;
        this.f34958b = localDate;
        this.f34959c = str;
    }

    public static x[] D() {
        x[] xVarArr = f34956e;
        return (x[]) Arrays.copyOf(xVarArr, xVarArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x h(LocalDate localDate) {
        if (!localDate.T(w.f34951d)) {
            x[] xVarArr = f34956e;
            for (int length = xVarArr.length - 1; length >= 0; length--) {
                x xVar = xVarArr[length];
                if (localDate.compareTo((ChronoLocalDate) xVar.f34958b) >= 0) {
                    return xVar;
                }
            }
            return null;
        }
        throw new DateTimeException("JapaneseDate before Meiji 6 are not supported");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x i() {
        x[] xVarArr = f34956e;
        return xVarArr[xVarArr.length - 1];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static x t(int i10) {
        int i11 = i10 + 1;
        if (i11 >= 0) {
            x[] xVarArr = f34956e;
            if (i11 < xVarArr.length) {
                return xVarArr[i11];
            }
        }
        throw new DateTimeException("Invalid era: " + i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long v() {
        x[] xVarArr;
        long f6 = j$.time.temporal.a.DAY_OF_YEAR.p().f();
        for (x xVar : f34956e) {
            f6 = Math.min(f6, (xVar.f34958b.J() - xVar.f34958b.S()) + 1);
            if (xVar.q() != null) {
                f6 = Math.min(f6, xVar.q().f34958b.S() - 1);
            }
        }
        return f6;
    }

    private Object writeReplace() {
        return new D((byte) 5, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long x() {
        int year = 1000000000 - i().f34958b.getYear();
        x[] xVarArr = f34956e;
        int year2 = xVarArr[0].f34958b.getYear();
        for (int i10 = 1; i10 < xVarArr.length; i10++) {
            x xVar = xVarArr[i10];
            year = Math.min(year, (xVar.f34958b.getYear() - year2) + 1);
            year2 = xVar.f34958b.getYear();
        }
        return year;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(getValue(), j$.time.temporal.a.ERA);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(DataOutput dataOutput) {
        dataOutput.writeByte(this.f34957a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return AbstractC3699b.i(this, rVar);
    }

    @Override // j$.time.chrono.l
    public final int getValue() {
        return this.f34957a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final LocalDate n() {
        return this.f34958b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int p(j$.time.temporal.r rVar) {
        return AbstractC3699b.f(this, (j$.time.temporal.a) rVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final x q() {
        if (this == i()) {
            return null;
        }
        return t(this.f34957a + 1);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return rVar == aVar ? u.f34949d.F(aVar) : j$.time.temporal.q.d(this, rVar);
    }

    public final String toString() {
        return this.f34959c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long w(j$.time.temporal.r rVar) {
        return AbstractC3699b.g(this, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object z(j$.time.temporal.t tVar) {
        return AbstractC3699b.m(this, tVar);
    }
}
