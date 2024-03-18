package j$.time.chrono;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.chrono.g  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3704g implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f34917e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a  reason: collision with root package name */
    private final k f34918a;

    /* renamed from: b  reason: collision with root package name */
    final int f34919b;

    /* renamed from: c  reason: collision with root package name */
    final int f34920c;

    /* renamed from: d  reason: collision with root package name */
    final int f34921d;

    static {
        j$.com.android.tools.r8.a.m(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3704g(k kVar, int i10, int i11, int i12) {
        Objects.requireNonNull(kVar, "chrono");
        this.f34918a = kVar;
        this.f34919b = i10;
        this.f34920c = i11;
        this.f34921d = i12;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f34918a.getId());
        dataOutput.writeInt(this.f34919b);
        dataOutput.writeInt(this.f34920c);
        dataOutput.writeInt(this.f34921d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3704g)) {
            return false;
        }
        C3704g c3704g = (C3704g) obj;
        if (this.f34919b == c3704g.f34919b && this.f34920c == c3704g.f34920c && this.f34921d == c3704g.f34921d) {
            if (((AbstractC3698a) this.f34918a).equals(c3704g.f34918a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC3698a) this.f34918a).hashCode() ^ (Integer.rotateLeft(this.f34921d, 16) + (Integer.rotateLeft(this.f34920c, 8) + this.f34919b));
    }

    public final String toString() {
        k kVar = this.f34918a;
        int i10 = this.f34921d;
        int i11 = this.f34920c;
        int i12 = this.f34919b;
        if (i12 == 0 && i11 == 0 && i10 == 0) {
            String id2 = ((AbstractC3698a) kVar).getId();
            return id2 + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((AbstractC3698a) kVar).getId());
        sb2.append(" P");
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('Y');
        }
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('D');
        }
        return sb2.toString();
    }

    protected Object writeReplace() {
        return new D((byte) 9, this);
    }
}
