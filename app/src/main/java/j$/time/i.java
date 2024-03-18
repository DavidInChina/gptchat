package j$.time;

import com.revenuecat.purchases.common.UtilsKt;
import j$.time.chrono.AbstractC3699b;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import livekit.org.webrtc.WebrtcBuildVersion;

/* loaded from: classes3.dex */
public final class i implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final i f35084e;

    /* renamed from: f  reason: collision with root package name */
    public static final i f35085f;

    /* renamed from: g  reason: collision with root package name */
    public static final i f35086g;

    /* renamed from: h  reason: collision with root package name */
    private static final i[] f35087h = new i[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a  reason: collision with root package name */
    private final byte f35088a;

    /* renamed from: b  reason: collision with root package name */
    private final byte f35089b;

    /* renamed from: c  reason: collision with root package name */
    private final byte f35090c;

    /* renamed from: d  reason: collision with root package name */
    private final int f35091d;

    static {
        int i10 = 0;
        while (true) {
            i[] iVarArr = f35087h;
            if (i10 >= iVarArr.length) {
                i iVar = iVarArr[0];
                f35086g = iVar;
                f35084e = iVar;
                f35085f = new i(23, 59, 59, 999999999);
                return;
            }
            iVarArr[i10] = new i(i10, 0, 0, 0);
            i10++;
        }
    }

    private i(int i10, int i11, int i12, int i13) {
        this.f35088a = (byte) i10;
        this.f35089b = (byte) i11;
        this.f35090c = (byte) i12;
        this.f35091d = i13;
    }

    private static i O(int i10, int i11, int i12, int i13) {
        return ((i11 | i12) | i13) == 0 ? f35087h[i10] : new i(i10, i11, i12, i13);
    }

    public static i P(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        i iVar = (i) temporalAccessor.z(j$.time.temporal.q.g());
        if (iVar != null) {
            return iVar;
        }
        String name = temporalAccessor.getClass().getName();
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + name);
    }

    private int Q(j$.time.temporal.r rVar) {
        int i10 = h.f35082a[((j$.time.temporal.a) rVar).ordinal()];
        byte b10 = this.f35089b;
        int i11 = this.f35091d;
        byte b11 = this.f35088a;
        switch (i10) {
            case 1:
                return i11;
            case 2:
                throw new DateTimeException("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i11 / 1000;
            case 4:
                throw new DateTimeException("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i11 / UtilsKt.MICROS_MULTIPLIER;
            case 6:
                return (int) (e0() / 1000000);
            case 7:
                return this.f35090c;
            case 8:
                return f0();
            case 9:
                return b10;
            case 10:
                return (b11 * 60) + b10;
            case 11:
                return b11 % 12;
            case 12:
                int i12 = b11 % 12;
                if (i12 % 12 != 0) {
                    return i12;
                }
                return 12;
            case 13:
                return b11;
            case 14:
                if (b11 != 0) {
                    return b11;
                }
                return 24;
            case 15:
                return b11 / 12;
            default:
                throw new DateTimeException(b.a("Unsupported field: ", rVar));
        }
    }

    public static i U(int i10) {
        j$.time.temporal.a.HOUR_OF_DAY.P(i10);
        return f35087h[i10];
    }

    public static i V(int i10, int i11, int i12, int i13) {
        j$.time.temporal.a.HOUR_OF_DAY.P(i10);
        j$.time.temporal.a.MINUTE_OF_HOUR.P(i11);
        j$.time.temporal.a.SECOND_OF_MINUTE.P(i12);
        j$.time.temporal.a.NANO_OF_SECOND.P(i13);
        return O(i10, i11, i12, i13);
    }

    public static i W(long j6) {
        j$.time.temporal.a.NANO_OF_DAY.P(j6);
        int i10 = (int) (j6 / 3600000000000L);
        long j10 = j6 - (i10 * 3600000000000L);
        int i11 = (int) (j10 / 60000000000L);
        long j11 = j10 - (i11 * 60000000000L);
        int i12 = (int) (j11 / 1000000000);
        return O(i10, i11, i12, (int) (j11 - (i12 * 1000000000)));
    }

    public static i X(long j6) {
        j$.time.temporal.a.SECOND_OF_DAY.P(j6);
        int i10 = (int) (j6 / 3600);
        long j10 = j6 - (i10 * 3600);
        int i11 = (int) (j10 / 60);
        return O(i10, i11, (int) (j10 - (i11 * 60)), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i d0(DataInput dataInput) {
        int i10;
        int i11;
        int readByte = dataInput.readByte();
        int i12 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i10 = 0;
            i11 = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                int i13 = ~readByte2;
                i11 = 0;
                i12 = i13;
                i10 = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    i10 = ~readByte3;
                } else {
                    i12 = dataInput.readInt();
                    i10 = readByte3;
                }
                i11 = i12;
                i12 = readByte2;
            }
        }
        return V(readByte, i12, i10, i11);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 4, this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(e0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    /* renamed from: L */
    public final int compareTo(i iVar) {
        int compare = Integer.compare(this.f35088a, iVar.f35088a);
        if (compare == 0) {
            int compare2 = Integer.compare(this.f35089b, iVar.f35089b);
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Integer.compare(this.f35090c, iVar.f35090c);
            return compare3 == 0 ? Integer.compare(this.f35091d, iVar.f35091d) : compare3;
        }
        return compare;
    }

    public final int R() {
        return this.f35088a;
    }

    public final int S() {
        return this.f35091d;
    }

    public final int T() {
        return this.f35090c;
    }

    /* renamed from: Y */
    public final i mo88e(long j6, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            switch (h.f35083b[((j$.time.temporal.b) uVar).ordinal()]) {
                case 1:
                    return b0(j6);
                case 2:
                    return b0((j6 % 86400000000L) * 1000);
                case 3:
                    return b0((j6 % 86400000) * 1000000);
                case 4:
                    return c0(j6);
                case 5:
                    return a0(j6);
                case 6:
                    return Z(j6);
                case 7:
                    return Z((j6 % 2) * 12);
                default:
                    throw new DateTimeException("Unsupported unit: " + uVar);
            }
        }
        return (i) uVar.p(this, j6);
    }

    public final i Z(long j6) {
        if (j6 == 0) {
            return this;
        }
        return O(((((int) (j6 % 24)) + this.f35088a) + 24) % 24, this.f35089b, this.f35090c, this.f35091d);
    }

    public final i a0(long j6) {
        if (j6 == 0) {
            return this;
        }
        int i10 = (this.f35088a * 60) + this.f35089b;
        int i11 = ((((int) (j6 % 1440)) + i10) + 1440) % 1440;
        return i10 == i11 ? this : O(i11 / 60, i11 % 60, this.f35090c, this.f35091d);
    }

    public final i b0(long j6) {
        if (j6 == 0) {
            return this;
        }
        long e02 = e0();
        long j10 = (((j6 % 86400000000000L) + e02) + 86400000000000L) % 86400000000000L;
        return e02 == j10 ? this : O((int) (j10 / 3600000000000L), (int) ((j10 / 60000000000L) % 60), (int) ((j10 / 1000000000) % 60), (int) (j10 % 1000000000));
    }

    public final i c0(long j6) {
        if (j6 == 0) {
            return this;
        }
        int i10 = (this.f35089b * 60) + (this.f35088a * 3600) + this.f35090c;
        int i11 = ((((int) (j6 % 86400)) + i10) + 86400) % 86400;
        return i10 == i11 ? this : O(i11 / 3600, (i11 / 60) % 60, i11 % 60, this.f35091d);
    }

    public final long e0() {
        return (this.f35090c * 1000000000) + (this.f35089b * 60000000000L) + (this.f35088a * 3600000000000L) + this.f35091d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f35088a == iVar.f35088a && this.f35089b == iVar.f35089b && this.f35090c == iVar.f35090c && this.f35091d == iVar.f35091d;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar.r() : rVar != null && rVar.z(this);
    }

    public final int f0() {
        return (this.f35089b * 60) + (this.f35088a * 3600) + this.f35090c;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m g(long j6, j$.time.temporal.b bVar) {
        return j6 == Long.MIN_VALUE ? mo88e(Long.MAX_VALUE, bVar).mo88e(1L, bVar) : mo88e(-j6, bVar);
    }

    /* renamed from: g0 */
    public final i d(long j6, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            aVar.P(j6);
            int i10 = h.f35082a[aVar.ordinal()];
            byte b10 = this.f35089b;
            byte b11 = this.f35090c;
            int i11 = this.f35091d;
            byte b12 = this.f35088a;
            switch (i10) {
                case 1:
                    return h0((int) j6);
                case 2:
                    return W(j6);
                case 3:
                    return h0(((int) j6) * 1000);
                case 4:
                    return W(j6 * 1000);
                case 5:
                    return h0(((int) j6) * UtilsKt.MICROS_MULTIPLIER);
                case 6:
                    return W(j6 * 1000000);
                case 7:
                    int i12 = (int) j6;
                    if (b11 == i12) {
                        return this;
                    }
                    j$.time.temporal.a.SECOND_OF_MINUTE.P(i12);
                    return O(b12, b10, i12, i11);
                case 8:
                    return c0(j6 - f0());
                case 9:
                    int i13 = (int) j6;
                    if (b10 == i13) {
                        return this;
                    }
                    j$.time.temporal.a.MINUTE_OF_HOUR.P(i13);
                    return O(b12, i13, b11, i11);
                case 10:
                    return a0(j6 - ((b12 * 60) + b10));
                case 11:
                    return Z(j6 - (b12 % 12));
                case 12:
                    if (j6 == 12) {
                        j6 = 0;
                    }
                    return Z(j6 - (b12 % 12));
                case 13:
                    int i14 = (int) j6;
                    if (b12 == i14) {
                        return this;
                    }
                    j$.time.temporal.a.HOUR_OF_DAY.P(i14);
                    return O(i14, b10, b11, i11);
                case 14:
                    if (j6 == 24) {
                        j6 = 0;
                    }
                    int i15 = (int) j6;
                    if (b12 == i15) {
                        return this;
                    }
                    j$.time.temporal.a.HOUR_OF_DAY.P(i15);
                    return O(i15, b10, b11, i11);
                case 15:
                    return Z((j6 - (b12 / 12)) * 12);
                default:
                    throw new DateTimeException(b.a("Unsupported field: ", rVar));
            }
        }
        return (i) rVar.A(this, j6);
    }

    public final i h0(int i10) {
        if (this.f35091d == i10) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.P(i10);
        return O(this.f35088a, this.f35089b, this.f35090c, i10);
    }

    public final int hashCode() {
        long e02 = e0();
        return (int) (e02 ^ (e02 >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i0(DataOutput dataOutput) {
        int i10;
        byte b10 = this.f35090c;
        byte b11 = this.f35088a;
        byte b12 = this.f35089b;
        int i11 = this.f35091d;
        if (i11 != 0) {
            dataOutput.writeByte(b11);
            dataOutput.writeByte(b12);
            dataOutput.writeByte(b10);
            dataOutput.writeInt(i11);
            return;
        }
        if (b10 != 0) {
            dataOutput.writeByte(b11);
            dataOutput.writeByte(b12);
            i10 = ~b10;
        } else if (b12 == 0) {
            i10 = ~b11;
        } else {
            dataOutput.writeByte(b11);
            i10 = ~b12;
        }
        dataOutput.writeByte(i10);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? Q(rVar) : j$.time.temporal.q.a(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m r(LocalDate localDate) {
        boolean z10 = localDate instanceof i;
        TemporalAccessor temporalAccessor = localDate;
        if (!z10) {
            localDate.getClass();
            temporalAccessor = AbstractC3699b.a(localDate, this);
        }
        return (i) temporalAccessor;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        return j$.time.temporal.q.d(this, rVar);
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.f35088a;
        sb2.append(b10 < 10 ? WebrtcBuildVersion.maint_version : "");
        sb2.append((int) b10);
        String str = ":";
        byte b11 = this.f35089b;
        sb2.append(b11 < 10 ? ":0" : str);
        sb2.append((int) b11);
        byte b12 = this.f35090c;
        int i11 = this.f35091d;
        if (b12 > 0 || i11 > 0) {
            if (b12 < 10) {
                str = ":0";
            }
            sb2.append(str);
            sb2.append((int) b12);
            if (i11 > 0) {
                sb2.append('.');
                int i12 = UtilsKt.MICROS_MULTIPLIER;
                if (i11 % UtilsKt.MICROS_MULTIPLIER == 0) {
                    i10 = (i11 / UtilsKt.MICROS_MULTIPLIER) + 1000;
                } else {
                    if (i11 % 1000 == 0) {
                        i11 /= 1000;
                    } else {
                        i12 = 1000000000;
                    }
                    i10 = i11 + i12;
                }
                sb2.append(Integer.toString(i10).substring(1));
            }
        }
        return sb2.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.NANO_OF_DAY ? e0() : rVar == j$.time.temporal.a.MICRO_OF_DAY ? e0() / 1000 : Q(rVar) : rVar.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.q.e() || tVar == j$.time.temporal.q.l() || tVar == j$.time.temporal.q.k() || tVar == j$.time.temporal.q.i()) {
            return null;
        }
        if (tVar == j$.time.temporal.q.g()) {
            return this;
        }
        if (tVar == j$.time.temporal.q.f()) {
            return null;
        }
        return tVar == j$.time.temporal.q.j() ? j$.time.temporal.b.NANOS : tVar.a(this);
    }
}
