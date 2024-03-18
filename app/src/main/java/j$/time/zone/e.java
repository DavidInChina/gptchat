package j$.time.zone;

import android.gov.nist.core.Separators;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.r;
import j$.time.k;
import j$.time.temporal.o;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a  reason: collision with root package name */
    private final k f35189a;

    /* renamed from: b  reason: collision with root package name */
    private final byte f35190b;

    /* renamed from: c  reason: collision with root package name */
    private final j$.time.c f35191c;

    /* renamed from: d  reason: collision with root package name */
    private final j$.time.i f35192d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f35193e;

    /* renamed from: f  reason: collision with root package name */
    private final d f35194f;

    /* renamed from: g  reason: collision with root package name */
    private final ZoneOffset f35195g;

    /* renamed from: h  reason: collision with root package name */
    private final ZoneOffset f35196h;

    /* renamed from: i  reason: collision with root package name */
    private final ZoneOffset f35197i;

    e(k kVar, int i10, j$.time.c cVar, j$.time.i iVar, boolean z10, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f35189a = kVar;
        this.f35190b = (byte) i10;
        this.f35191c = cVar;
        this.f35192d = iVar;
        this.f35193e = z10;
        this.f35194f = dVar;
        this.f35195g = zoneOffset;
        this.f35196h = zoneOffset2;
        this.f35197i = zoneOffset3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e b(DataInput dataInput) {
        int readInt = dataInput.readInt();
        k Q = k.Q(readInt >>> 28);
        int i10 = ((264241152 & readInt) >>> 22) - 32;
        int i11 = (3670016 & readInt) >>> 19;
        j$.time.c L10 = i11 == 0 ? null : j$.time.c.L(i11);
        int i12 = (507904 & readInt) >>> 14;
        d dVar = d.values()[(readInt & 12288) >>> 12];
        int i13 = (readInt & 4080) >>> 4;
        int i14 = (readInt & 12) >>> 2;
        int i15 = readInt & 3;
        j$.time.i X10 = i12 == 31 ? j$.time.i.X(dataInput.readInt()) : j$.time.i.U(i12 % 24);
        ZoneOffset V10 = ZoneOffset.V(i13 == 255 ? dataInput.readInt() : (i13 - 128) * 900);
        ZoneOffset V11 = i14 == 3 ? ZoneOffset.V(dataInput.readInt()) : ZoneOffset.V((i14 * 1800) + V10.T());
        ZoneOffset V12 = i15 == 3 ? ZoneOffset.V(dataInput.readInt()) : ZoneOffset.V((i15 * 1800) + V10.T());
        boolean z10 = i12 == 24;
        Objects.requireNonNull(Q, "month");
        Objects.requireNonNull(X10, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(V10, "standardOffset");
        Objects.requireNonNull(V11, "offsetBefore");
        Objects.requireNonNull(V12, "offsetAfter");
        if (i10 < -28 || i10 > 31 || i10 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z10 && !X10.equals(j$.time.i.f35086g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (X10.S() != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(Q, i10, L10, X10, z10, dVar, V10, V11, V12);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final b a(int i10) {
        LocalDate localDate;
        int T;
        ZoneOffset zoneOffset;
        o oVar;
        j$.time.c cVar = this.f35191c;
        k kVar = this.f35189a;
        byte b10 = this.f35190b;
        if (b10 < 0) {
            localDate = LocalDate.X(i10, kVar, kVar.O(r.f34946d.K(i10)) + 1 + b10);
            if (cVar != null) {
                oVar = new o(cVar.getValue(), 1);
                localDate = localDate.r(oVar);
            }
        } else {
            localDate = LocalDate.X(i10, kVar, b10);
            if (cVar != null) {
                oVar = new o(cVar.getValue(), 0);
                localDate = localDate.r(oVar);
            }
        }
        if (this.f35193e) {
            localDate = localDate.a0(1L);
        }
        LocalDateTime V10 = LocalDateTime.V(localDate, this.f35192d);
        d dVar = this.f35194f;
        dVar.getClass();
        int i11 = c.f35187a[dVar.ordinal()];
        ZoneOffset zoneOffset2 = this.f35196h;
        if (i11 != 1) {
            if (i11 == 2) {
                T = zoneOffset2.T();
                zoneOffset = this.f35195g;
            }
            return new b(V10, zoneOffset2, this.f35197i);
        }
        T = zoneOffset2.T();
        zoneOffset = ZoneOffset.UTC;
        V10 = V10.Z(T - zoneOffset.T());
        return new b(V10, zoneOffset2, this.f35197i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(DataOutput dataOutput) {
        j$.time.i iVar = this.f35192d;
        boolean z10 = this.f35193e;
        int f02 = z10 ? 86400 : iVar.f0();
        int T = this.f35195g.T();
        ZoneOffset zoneOffset = this.f35196h;
        int T10 = zoneOffset.T() - T;
        ZoneOffset zoneOffset2 = this.f35197i;
        int T11 = zoneOffset2.T() - T;
        int R10 = f02 % 3600 == 0 ? z10 ? 24 : iVar.R() : 31;
        int i10 = T % 900 == 0 ? (T / 900) + 128 : 255;
        int i11 = (T10 == 0 || T10 == 1800 || T10 == 3600) ? T10 / 1800 : 3;
        int i12 = (T11 == 0 || T11 == 1800 || T11 == 3600) ? T11 / 1800 : 3;
        j$.time.c cVar = this.f35191c;
        dataOutput.writeInt((this.f35189a.getValue() << 28) + ((this.f35190b + 32) << 22) + ((cVar == null ? 0 : cVar.getValue()) << 19) + (R10 << 14) + (this.f35194f.ordinal() << 12) + (i10 << 4) + (i11 << 2) + i12);
        if (R10 == 31) {
            dataOutput.writeInt(f02);
        }
        if (i10 == 255) {
            dataOutput.writeInt(T);
        }
        if (i11 == 3) {
            dataOutput.writeInt(zoneOffset.T());
        }
        if (i12 == 3) {
            dataOutput.writeInt(zoneOffset2.T());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f35189a == eVar.f35189a && this.f35190b == eVar.f35190b && this.f35191c == eVar.f35191c && this.f35194f == eVar.f35194f && this.f35192d.equals(eVar.f35192d) && this.f35193e == eVar.f35193e && this.f35195g.equals(eVar.f35195g) && this.f35196h.equals(eVar.f35196h) && this.f35197i.equals(eVar.f35197i);
    }

    public final int hashCode() {
        int f02 = ((this.f35192d.f0() + (this.f35193e ? 1 : 0)) << 15) + (this.f35189a.ordinal() << 11) + ((this.f35190b + 32) << 5);
        j$.time.c cVar = this.f35191c;
        return ((this.f35195g.hashCode() ^ (this.f35194f.ordinal() + (f02 + ((cVar == null ? 7 : cVar.ordinal()) << 2)))) ^ this.f35196h.hashCode()) ^ this.f35197i.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.f35196h;
        ZoneOffset zoneOffset2 = this.f35197i;
        sb2.append(zoneOffset.compareTo(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb2.append(zoneOffset);
        sb2.append(" to ");
        sb2.append(zoneOffset2);
        sb2.append(", ");
        k kVar = this.f35189a;
        byte b10 = this.f35190b;
        j$.time.c cVar = this.f35191c;
        if (cVar != null) {
            if (b10 == -1) {
                sb2.append(cVar.name());
                str = " on or before last day of ";
            } else if (b10 < 0) {
                sb2.append(cVar.name());
                sb2.append(" on or before last day minus ");
                sb2.append((-b10) - 1);
                str = " of ";
            } else {
                sb2.append(cVar.name());
                sb2.append(" on or after ");
            }
            sb2.append(str);
            sb2.append(kVar.name());
            sb2.append(" at ");
            sb2.append(!this.f35193e ? "24:00" : this.f35192d.toString());
            sb2.append(Separators.SP);
            sb2.append(this.f35194f);
            sb2.append(", standard offset ");
            sb2.append(this.f35195g);
            sb2.append(']');
            return sb2.toString();
        }
        sb2.append(kVar.name());
        sb2.append(' ');
        sb2.append((int) b10);
        sb2.append(" at ");
        sb2.append(!this.f35193e ? "24:00" : this.f35192d.toString());
        sb2.append(Separators.SP);
        sb2.append(this.f35194f);
        sb2.append(", standard offset ");
        sb2.append(this.f35195g);
        sb2.append(']');
        return sb2.toString();
    }
}
