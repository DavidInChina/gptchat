package j$.time.zone;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC3699b;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class ZoneRules implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    private static final long[] f35169i = new long[0];

    /* renamed from: j  reason: collision with root package name */
    private static final e[] f35170j = new e[0];

    /* renamed from: k  reason: collision with root package name */
    private static final LocalDateTime[] f35171k = new LocalDateTime[0];

    /* renamed from: l  reason: collision with root package name */
    private static final b[] f35172l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a  reason: collision with root package name */
    private final long[] f35173a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset[] f35174b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f35175c;

    /* renamed from: d  reason: collision with root package name */
    private final LocalDateTime[] f35176d;

    /* renamed from: e  reason: collision with root package name */
    private final ZoneOffset[] f35177e;

    /* renamed from: f  reason: collision with root package name */
    private final e[] f35178f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeZone f35179g;

    /* renamed from: h  reason: collision with root package name */
    private final transient ConcurrentHashMap f35180h;

    private ZoneRules(ZoneOffset zoneOffset) {
        this.f35180h = new ConcurrentHashMap();
        this.f35174b = r0;
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        long[] jArr = f35169i;
        this.f35173a = jArr;
        this.f35175c = jArr;
        this.f35176d = f35171k;
        this.f35177e = zoneOffsetArr;
        this.f35178f = f35170j;
        this.f35179g = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneRules(TimeZone timeZone) {
        this.f35180h = new ConcurrentHashMap();
        this.f35174b = r0;
        ZoneOffset[] zoneOffsetArr = {j(timeZone.getRawOffset())};
        long[] jArr = f35169i;
        this.f35173a = jArr;
        this.f35175c = jArr;
        this.f35176d = f35171k;
        this.f35177e = zoneOffsetArr;
        this.f35178f = f35170j;
        this.f35179g = timeZone;
    }

    private ZoneRules(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        LocalDateTime p10;
        this.f35180h = new ConcurrentHashMap();
        this.f35173a = jArr;
        this.f35174b = zoneOffsetArr;
        this.f35175c = jArr2;
        this.f35177e = zoneOffsetArr2;
        this.f35178f = eVarArr;
        if (jArr2.length == 0) {
            this.f35176d = f35171k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < jArr2.length) {
                int i11 = i10 + 1;
                b bVar = new b(jArr2[i10], zoneOffsetArr2[i10], zoneOffsetArr2[i11]);
                if (bVar.A()) {
                    arrayList.add(bVar.p());
                    p10 = bVar.g();
                } else {
                    arrayList.add(bVar.g());
                    p10 = bVar.p();
                }
                arrayList.add(p10);
                i10 = i11;
            }
            this.f35176d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f35179g = null;
    }

    private static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime p10 = bVar.p();
        boolean A10 = bVar.A();
        boolean S = localDateTime.S(p10);
        return A10 ? S ? bVar.w() : localDateTime.S(bVar.g()) ? bVar : bVar.s() : !S ? bVar.s() : localDateTime.S(bVar.g()) ? bVar.w() : bVar;
    }

    private b[] b(int i10) {
        long j6;
        Integer valueOf = Integer.valueOf(i10);
        ConcurrentHashMap concurrentHashMap = this.f35180h;
        b[] bVarArr = (b[]) concurrentHashMap.get(valueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.f35179g;
        if (timeZone == null) {
            e[] eVarArr = this.f35178f;
            b[] bVarArr2 = new b[eVarArr.length];
            for (int i11 = 0; i11 < eVarArr.length; i11++) {
                bVarArr2[i11] = eVarArr[i11].a(i10);
            }
            if (i10 < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, bVarArr2);
            }
            return bVarArr2;
        }
        b[] bVarArr3 = f35172l;
        if (i10 < 1800) {
            return bVarArr3;
        }
        long n10 = AbstractC3699b.n(LocalDateTime.T(i10 - 1), this.f35174b[0]);
        int offset = timeZone.getOffset(n10 * 1000);
        long j10 = 31968000 + n10;
        while (n10 < j10) {
            long j11 = 7776000 + n10;
            long j12 = n10;
            if (offset != timeZone.getOffset(j11 * 1000)) {
                n10 = j12;
                while (j11 - n10 > 1) {
                    int i12 = offset;
                    long j13 = j10;
                    long p10 = j$.com.android.tools.r8.a.p(j11 + n10, 2L);
                    if (timeZone.getOffset(p10 * 1000) == i12) {
                        n10 = p10;
                    } else {
                        j11 = p10;
                    }
                    offset = i12;
                    j10 = j13;
                }
                j6 = j10;
                int i13 = offset;
                if (timeZone.getOffset(n10 * 1000) == i13) {
                    n10 = j11;
                }
                ZoneOffset j14 = j(i13);
                offset = timeZone.getOffset(n10 * 1000);
                ZoneOffset j15 = j(offset);
                if (c(n10, j15) == i10) {
                    bVarArr3 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length + 1);
                    bVarArr3[bVarArr3.length - 1] = new b(n10, j14, j15);
                }
            } else {
                j6 = j10;
                n10 = j11;
            }
            j10 = j6;
        }
        if (1916 <= i10 && i10 < 2100) {
            concurrentHashMap.putIfAbsent(valueOf, bVarArr3);
        }
        return bVarArr3;
    }

    private static int c(long j6, ZoneOffset zoneOffset) {
        return LocalDate.ofEpochDay(j$.com.android.tools.r8.a.p(j6 + zoneOffset.T(), 86400)).getYear();
    }

    private Object e(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.f35174b;
        int i10 = 0;
        TimeZone timeZone = this.f35179g;
        if (timeZone != null) {
            b[] b10 = b(localDateTime.getYear());
            if (b10.length == 0) {
                return j(timeZone.getOffset(AbstractC3699b.n(localDateTime, zoneOffsetArr[0]) * 1000));
            }
            int length = b10.length;
            while (i10 < length) {
                b bVar = b10[i10];
                Object a5 = a(localDateTime, bVar);
                if ((a5 instanceof b) || a5.equals(bVar.w())) {
                    return a5;
                }
                i10++;
                obj = a5;
            }
            return obj;
        } else if (this.f35175c.length == 0) {
            return zoneOffsetArr[0];
        } else {
            int length2 = this.f35178f.length;
            LocalDateTime[] localDateTimeArr = this.f35176d;
            if (length2 > 0 && localDateTime.R(localDateTimeArr[localDateTimeArr.length - 1])) {
                b[] b11 = b(localDateTime.getYear());
                int length3 = b11.length;
                while (i10 < length3) {
                    b bVar2 = b11[i10];
                    Object a10 = a(localDateTime, bVar2);
                    if ((a10 instanceof b) || a10.equals(bVar2.w())) {
                        return a10;
                    }
                    i10++;
                    obj = a10;
                }
                return obj;
            }
            int binarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
            ZoneOffset[] zoneOffsetArr2 = this.f35177e;
            if (binarySearch == -1) {
                return zoneOffsetArr2[0];
            }
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            } else if (binarySearch < localDateTimeArr.length - 1) {
                int i11 = binarySearch + 1;
                if (localDateTimeArr[binarySearch].equals(localDateTimeArr[i11])) {
                    binarySearch = i11;
                }
            }
            if ((binarySearch & 1) != 0) {
                return zoneOffsetArr2[(binarySearch / 2) + 1];
            }
            LocalDateTime localDateTime2 = localDateTimeArr[binarySearch];
            LocalDateTime localDateTime3 = localDateTimeArr[binarySearch + 1];
            int i12 = binarySearch / 2;
            ZoneOffset zoneOffset = zoneOffsetArr2[i12];
            ZoneOffset zoneOffset2 = zoneOffsetArr2[i12 + 1];
            return zoneOffset2.T() > zoneOffset.T() ? new b(localDateTime2, zoneOffset, zoneOffset2) : new b(localDateTime3, zoneOffset, zoneOffset2);
        }
    }

    public static ZoneRules i(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return new ZoneRules(zoneOffset);
    }

    private static ZoneOffset j(int i10) {
        return ZoneOffset.V(i10 / 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneRules k(DataInput dataInput) {
        int readInt = dataInput.readInt();
        long[] jArr = f35169i;
        long[] jArr2 = readInt == 0 ? jArr : new long[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            jArr2[i10] = a.a(dataInput);
        }
        int i11 = readInt + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            zoneOffsetArr[i12] = a.b(dataInput);
        }
        int readInt2 = dataInput.readInt();
        if (readInt2 != 0) {
            jArr = new long[readInt2];
        }
        long[] jArr3 = jArr;
        for (int i13 = 0; i13 < readInt2; i13++) {
            jArr3[i13] = a.a(dataInput);
        }
        int i14 = readInt2 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            zoneOffsetArr2[i15] = a.b(dataInput);
        }
        int readByte = dataInput.readByte();
        e[] eVarArr = readByte == 0 ? f35170j : new e[readByte];
        for (int i16 = 0; i16 < readByte; i16++) {
            eVarArr[i16] = e.b(dataInput);
        }
        return new ZoneRules(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f35179g != null ? (byte) 100 : (byte) 1, this);
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f35179g;
        if (timeZone != null) {
            return j(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f35175c;
        if (jArr.length == 0) {
            return this.f35174b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f35178f.length;
        ZoneOffset[] zoneOffsetArr = this.f35177e;
        if (length <= 0 || epochSecond <= jArr[jArr.length - 1]) {
            int binarySearch = Arrays.binarySearch(jArr, epochSecond);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            return zoneOffsetArr[binarySearch + 1];
        }
        b[] b10 = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
        b bVar = null;
        for (int i10 = 0; i10 < b10.length; i10++) {
            bVar = b10[i10];
            if (epochSecond < bVar.N()) {
                return bVar.w();
            }
        }
        return bVar.s();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneRules)) {
            return false;
        }
        ZoneRules zoneRules = (ZoneRules) obj;
        return Objects.equals(this.f35179g, zoneRules.f35179g) && Arrays.equals(this.f35173a, zoneRules.f35173a) && Arrays.equals(this.f35174b, zoneRules.f35174b) && Arrays.equals(this.f35175c, zoneRules.f35175c) && Arrays.equals(this.f35177e, zoneRules.f35177e) && Arrays.equals(this.f35178f, zoneRules.f35178f);
    }

    public final b f(LocalDateTime localDateTime) {
        Object e10 = e(localDateTime);
        if (e10 instanceof b) {
            return (b) e10;
        }
        return null;
    }

    public final List g(LocalDateTime localDateTime) {
        Object e10 = e(localDateTime);
        return e10 instanceof b ? ((b) e10).z() : Collections.singletonList((ZoneOffset) e10);
    }

    public final boolean h(Instant instant) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.f35179g;
        if (timeZone != null) {
            zoneOffset = j(timeZone.getRawOffset());
        } else {
            int length = this.f35175c.length;
            ZoneOffset[] zoneOffsetArr = this.f35174b;
            if (length == 0) {
                zoneOffset = zoneOffsetArr[0];
            } else {
                int binarySearch = Arrays.binarySearch(this.f35173a, instant.getEpochSecond());
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 2;
                }
                zoneOffset = zoneOffsetArr[binarySearch + 1];
            }
        }
        return !zoneOffset.equals(d(instant));
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f35179g) ^ Arrays.hashCode(this.f35173a)) ^ Arrays.hashCode(this.f35174b)) ^ Arrays.hashCode(this.f35175c)) ^ Arrays.hashCode(this.f35177e)) ^ Arrays.hashCode(this.f35178f);
    }

    public boolean isFixedOffset() {
        b bVar;
        TimeZone timeZone = this.f35179g;
        if (timeZone == null) {
            return this.f35175c.length == 0;
        } else if (timeZone.useDaylightTime() || timeZone.getDSTSavings() != 0) {
            return false;
        } else {
            Instant now = Instant.now();
            long epochSecond = now.getEpochSecond();
            if (now.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                epochSecond++;
            }
            int c10 = c(epochSecond, d(now));
            b[] b10 = b(c10);
            int length = b10.length - 1;
            while (true) {
                if (length < 0) {
                    if (c10 > 1800) {
                        b[] b11 = b(c10 - 1);
                        int length2 = b11.length - 1;
                        while (true) {
                            if (length2 < 0) {
                                int offset = timeZone.getOffset((epochSecond - 1) * 1000);
                                long epochDay = LocalDate.of(1800, 1, 1).toEpochDay() * 86400;
                                for (long min = Math.min(epochSecond - 31104000, (Clock.systemUTC().b() / 1000) + 31968000); epochDay <= min; min -= 7776000) {
                                    int offset2 = timeZone.getOffset(min * 1000);
                                    if (offset != offset2) {
                                        int c11 = c(min, j(offset2));
                                        b[] b12 = b(c11 + 1);
                                        int length3 = b12.length - 1;
                                        while (true) {
                                            if (length3 < 0) {
                                                b[] b13 = b(c11);
                                                bVar = b13[b13.length - 1];
                                                break;
                                            } else if (epochSecond > b12[length3].N()) {
                                                bVar = b12[length3];
                                                break;
                                            } else {
                                                length3--;
                                            }
                                        }
                                    }
                                }
                            } else if (epochSecond > b11[length2].N()) {
                                bVar = b11[length2];
                                break;
                            } else {
                                length2--;
                            }
                        }
                    }
                    bVar = null;
                } else if (epochSecond > b10[length].N()) {
                    bVar = b10[length];
                    break;
                } else {
                    length--;
                }
            }
            return bVar == null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(DataOutput dataOutput) {
        long[] jArr = this.f35173a;
        dataOutput.writeInt(jArr.length);
        for (long j6 : jArr) {
            a.c(j6, dataOutput);
        }
        for (ZoneOffset zoneOffset : this.f35174b) {
            a.d(zoneOffset, dataOutput);
        }
        long[] jArr2 = this.f35175c;
        dataOutput.writeInt(jArr2.length);
        for (long j10 : jArr2) {
            a.c(j10, dataOutput);
        }
        for (ZoneOffset zoneOffset2 : this.f35177e) {
            a.d(zoneOffset2, dataOutput);
        }
        e[] eVarArr = this.f35178f;
        dataOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.c(dataOutput);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f35179g.getID());
    }

    public final String toString() {
        StringBuilder sb2;
        TimeZone timeZone = this.f35179g;
        if (timeZone != null) {
            String id2 = timeZone.getID();
            sb2 = new StringBuilder("ZoneRules[timeZone=");
            sb2.append(id2);
        } else {
            ZoneOffset[] zoneOffsetArr = this.f35174b;
            ZoneOffset zoneOffset = zoneOffsetArr[zoneOffsetArr.length - 1];
            sb2 = new StringBuilder("ZoneRules[currentStandardOffset=");
            sb2.append(zoneOffset);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
