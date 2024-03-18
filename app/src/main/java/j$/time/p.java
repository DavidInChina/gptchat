package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class p implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final p f35101d = new p(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a  reason: collision with root package name */
    private final int f35102a;

    /* renamed from: b  reason: collision with root package name */
    private final int f35103b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35104c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.com.android.tools.r8.a.m(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    private p(int i10, int i11, int i12) {
        this.f35102a = i10;
        this.f35103b = i11;
        this.f35104c = i12;
    }

    public static p c(int i10) {
        return i10 == 0 ? f35101d : new p(0, 0, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p d(DataInput dataInput) {
        int readInt = dataInput.readInt();
        int readInt2 = dataInput.readInt();
        int readInt3 = dataInput.readInt();
        return ((readInt | readInt2) | readInt3) == 0 ? f35101d : new p(readInt, readInt2, readInt3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 14, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j$.time.temporal.m a(ChronoLocalDate chronoLocalDate) {
        j$.time.temporal.m mVar;
        long e10;
        j$.time.temporal.b bVar;
        Objects.requireNonNull(chronoLocalDate, "temporal");
        j$.time.chrono.k kVar = (j$.time.chrono.k) chronoLocalDate.z(j$.time.temporal.q.e());
        if (kVar != null && !j$.time.chrono.r.f34946d.equals(kVar)) {
            throw new DateTimeException("Chronology mismatch, expected: ISO, actual: " + kVar.getId());
        } else if (this.f35103b == 0) {
            int i10 = this.f35102a;
            mVar = chronoLocalDate;
            if (i10 != 0) {
                e10 = i10;
                bVar = j$.time.temporal.b.YEARS;
                mVar = chronoLocalDate.mo88e(e10, (j$.time.temporal.u) bVar);
            }
            int i11 = this.f35104c;
            return i11 == 0 ? mVar.mo88e(i11, j$.time.temporal.b.DAYS) : mVar;
        } else {
            e10 = e();
            mVar = chronoLocalDate;
            if (e10 != 0) {
                bVar = j$.time.temporal.b.MONTHS;
                mVar = chronoLocalDate.mo88e(e10, (j$.time.temporal.u) bVar);
            }
            int i112 = this.f35104c;
            if (i112 == 0) {
            }
        }
    }

    public final int b() {
        return this.f35104c;
    }

    public final long e() {
        return (this.f35102a * 12) + this.f35103b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f35102a == pVar.f35102a && this.f35103b == pVar.f35103b && this.f35104c == pVar.f35104c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(DataOutput dataOutput) {
        dataOutput.writeInt(this.f35102a);
        dataOutput.writeInt(this.f35103b);
        dataOutput.writeInt(this.f35104c);
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f35104c, 16) + Integer.rotateLeft(this.f35103b, 8) + this.f35102a;
    }

    public final String toString() {
        if (this == f35101d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder("P");
        int i10 = this.f35102a;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.f35103b;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.f35104c;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }
}
