package j$.time.format;

import com.statsig.androidsdk.ErrorBoundaryKt;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC3699b;
import j$.time.temporal.TemporalAccessor;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.i  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3715i implements AbstractC3713g {
    @Override // j$.time.format.AbstractC3713g
    public final boolean g(A a5, StringBuilder sb2) {
        Long e10 = a5.e(j$.time.temporal.a.INSTANT_SECONDS);
        TemporalAccessor d10 = a5.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = d10.f(aVar) ? Long.valueOf(a5.d().w(aVar)) : null;
        int i10 = 0;
        if (e10 == null) {
            return false;
        }
        long longValue = e10.longValue();
        int O10 = aVar.O(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j6 = longValue - 253402300800L;
            long p10 = j$.com.android.tools.r8.a.p(j6, 315569520000L) + 1;
            LocalDateTime W6 = LocalDateTime.W(j$.com.android.tools.r8.a.o(j6, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (p10 > 0) {
                sb2.append('+');
                sb2.append(p10);
            }
            sb2.append(W6);
            if (W6.Q() == 0) {
                sb2.append(":00");
            }
        } else {
            long j10 = longValue + 62167219200L;
            long j11 = j10 / 315569520000L;
            long j12 = j10 % 315569520000L;
            LocalDateTime W10 = LocalDateTime.W(j12 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb2.length();
            sb2.append(W10);
            if (W10.Q() == 0) {
                sb2.append(":00");
            }
            if (j11 < 0) {
                if (W10.getYear() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j11 - 1));
                } else if (j12 == 0) {
                    sb2.insert(length, j11);
                } else {
                    sb2.insert(length + 1, Math.abs(j11));
                }
            }
        }
        if (O10 > 0) {
            sb2.append('.');
            int i11 = 100000000;
            while (true) {
                if (O10 <= 0 && i10 % 3 == 0 && i10 >= -2) {
                    break;
                }
                int i12 = O10 / i11;
                sb2.append((char) (i12 + 48));
                O10 -= i12 * i11;
                i11 /= 10;
                i10++;
            }
        }
        sb2.append('Z');
        return true;
    }

    @Override // j$.time.format.AbstractC3713g
    public final int p(y yVar, CharSequence charSequence, int i10) {
        int i11;
        int i12;
        x xVar = new x();
        xVar.a(DateTimeFormatter.f34977h);
        xVar.e('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        xVar.p(aVar, 2);
        xVar.e(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        xVar.p(aVar2, 2);
        xVar.e(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        xVar.p(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        int i13 = 0;
        xVar.b(aVar4, 0, 9, true);
        xVar.e('Z');
        C3712f g10 = xVar.z(Locale.getDefault()).g();
        y d10 = yVar.d();
        int p10 = g10.p(d10, charSequence, i10);
        if (p10 < 0) {
            return p10;
        }
        long longValue = d10.j(j$.time.temporal.a.YEAR).longValue();
        int intValue = d10.j(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int intValue2 = d10.j(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int intValue3 = d10.j(aVar).intValue();
        int intValue4 = d10.j(aVar2).intValue();
        Long j6 = d10.j(aVar3);
        Long j10 = d10.j(aVar4);
        int intValue5 = j6 != null ? j6.intValue() : 0;
        int intValue6 = j10 != null ? j10.intValue() : 0;
        if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
            i12 = 0;
            i11 = intValue5;
            i13 = 1;
        } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
            yVar.p();
            i12 = intValue3;
            i11 = 59;
        } else {
            i12 = intValue3;
            i11 = intValue5;
        }
        try {
            return yVar.o(aVar4, intValue6, i10, yVar.o(j$.time.temporal.a.INSTANT_SECONDS, j$.com.android.tools.r8.a.q(longValue / 10000, 315569520000L) + AbstractC3699b.n(LocalDateTime.U(((int) longValue) % ErrorBoundaryKt.SAMPLING_RATE, intValue, intValue2, i12, intValue4, i11).Y(i13), ZoneOffset.UTC), i10, p10));
        } catch (RuntimeException unused) {
            return ~i10;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
