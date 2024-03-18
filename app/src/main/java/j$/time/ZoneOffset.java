package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import livekit.org.webrtc.WebrtcBuildVersion;

/* loaded from: classes3.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.n, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: b  reason: collision with root package name */
    private final int f34891b;

    /* renamed from: c  reason: collision with root package name */
    private final transient String f34892c;

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentHashMap f34887d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap f34888e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = V(0);

    /* renamed from: f  reason: collision with root package name */
    public static final ZoneOffset f34889f = V(-64800);

    /* renamed from: g  reason: collision with root package name */
    public static final ZoneOffset f34890g = V(64800);

    private ZoneOffset(int i10) {
        String str;
        this.f34891b = i10;
        if (i10 == 0) {
            str = "Z";
        } else {
            int abs = Math.abs(i10);
            StringBuilder sb2 = new StringBuilder();
            int i11 = abs / 3600;
            int i12 = (abs / 60) % 60;
            sb2.append(i10 < 0 ? "-" : "+");
            sb2.append(i11 < 10 ? WebrtcBuildVersion.maint_version : "");
            sb2.append(i11);
            String str2 = ":";
            sb2.append(i12 < 10 ? ":0" : str2);
            sb2.append(i12);
            int i13 = abs % 60;
            if (i13 != 0) {
                sb2.append(i13 < 10 ? ":0" : str2);
                sb2.append(i13);
            }
            str = sb2.toString();
        }
        this.f34892c = str;
    }

    public static ZoneOffset S(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporalAccessor.z(j$.time.temporal.q.i());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        String name = temporalAccessor.getClass().getName();
        throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + temporalAccessor + " of type " + name);
    }

    public static ZoneOffset U(int i10, int i11, int i12) {
        if (i10 < -18 || i10 > 18) {
            throw new DateTimeException("Zone offset hours not in valid range: value " + i10 + " is not in the range -18 to 18");
        }
        if (i10 > 0) {
            if (i11 < 0 || i12 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i10 < 0) {
            if (i11 > 0 || i12 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i11 > 0 && i12 < 0) || (i11 < 0 && i12 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (i11 < -59 || i11 > 59) {
            throw new DateTimeException("Zone offset minutes not in valid range: value " + i11 + " is not in the range -59 to 59");
        } else if (i12 < -59 || i12 > 59) {
            throw new DateTimeException("Zone offset seconds not in valid range: value " + i12 + " is not in the range -59 to 59");
        } else if (Math.abs(i10) == 18 && (i11 | i12) != 0) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        } else {
            return V((i11 * 60) + (i10 * 3600) + i12);
        }
    }

    public static ZoneOffset V(int i10) {
        if (i10 < -64800 || i10 > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i10 % 900 != 0) {
            return new ZoneOffset(i10);
        }
        Integer valueOf = Integer.valueOf(i10);
        ConcurrentHashMap concurrentHashMap = f34887d;
        ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i10));
        ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
        f34888e.putIfAbsent(zoneOffset2.f34892c, zoneOffset2);
        return zoneOffset2;
    }

    private static int W(CharSequence charSequence, int i10, boolean z10) {
        if (z10 && charSequence.charAt(i10 - 1) != ':') {
            throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char charAt = charSequence.charAt(i10);
        char charAt2 = charSequence.charAt(i10 + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffset X(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? V(dataInput.readInt()) : V(readByte * 900);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ZoneOffset of(String str) {
        int i10;
        int i11;
        int i12;
        char charAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) f34888e.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + WebrtcBuildVersion.maint_version + str.charAt(1);
        } else if (length != 3) {
            if (length == 5) {
                i12 = W(str, 1, false);
                i11 = W(str, 3, false);
            } else if (length != 6) {
                if (length == 7) {
                    i12 = W(str, 1, false);
                    i11 = W(str, 3, false);
                    i10 = W(str, 5, false);
                } else if (length != 9) {
                    throw new DateTimeException("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                } else {
                    i12 = W(str, 1, false);
                    i11 = W(str, 4, true);
                    i10 = W(str, 7, true);
                }
                charAt = str.charAt(0);
                if (charAt == '+' && charAt != '-') {
                    throw new DateTimeException("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                }
                return charAt == '-' ? U(-i12, -i11, -i10) : U(i12, i11, i10);
            } else {
                i12 = W(str, 1, false);
                i11 = W(str, 4, true);
            }
            i10 = 0;
            charAt = str.charAt(0);
            if (charAt == '+') {
            }
            if (charAt == '-') {
            }
        }
        i12 = W(str, 1, false);
        i11 = 0;
        i10 = 0;
        charAt = str.charAt(0);
        if (charAt == '+') {
        }
        if (charAt == '-') {
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 8, this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(this.f34891b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.ZoneId
    public final void Q(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        Y(dataOutput);
    }

    /* renamed from: R */
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f34891b - this.f34891b;
    }

    public final int T() {
        return this.f34891b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Y(DataOutput dataOutput) {
        int i10 = this.f34891b;
        int i11 = i10 % 900 == 0 ? i10 / 900 : 127;
        dataOutput.writeByte(i11);
        if (i11 == 127) {
            dataOutput.writeInt(i10);
        }
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneOffset)) {
            return false;
        }
        return this.f34891b == ((ZoneOffset) obj).f34891b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.OFFSET_SECONDS : rVar != null && rVar.z(this);
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.f34892c;
    }

    @Override // j$.time.ZoneId
    public final ZoneRules getRules() {
        return ZoneRules.i(this);
    }

    @Override // j$.time.ZoneId
    public int hashCode() {
        return this.f34891b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f34891b;
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new DateTimeException(b.a("Unsupported field: ", rVar));
        }
        return j$.time.temporal.q.d(this, rVar).a(w(rVar), rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        return j$.time.temporal.q.d(this, rVar);
    }

    @Override // j$.time.ZoneId
    public String toString() {
        return this.f34892c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f34891b;
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new DateTimeException(b.a("Unsupported field: ", rVar));
        }
        return rVar.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        return (tVar == j$.time.temporal.q.i() || tVar == j$.time.temporal.q.k()) ? this : j$.time.temporal.q.c(this, tVar);
    }
}
