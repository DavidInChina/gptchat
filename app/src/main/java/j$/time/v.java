package j$.time;

import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class v extends ZoneId {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f35165d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: b  reason: collision with root package name */
    private final String f35166b;

    /* renamed from: c  reason: collision with root package name */
    private final transient ZoneRules f35167c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(String str, ZoneRules zoneRules) {
        this.f35166b = str;
        this.f35167c = zoneRules;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v R(String str, boolean z10) {
        ZoneRules zoneRules;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i10 == 0) && ((charAt < '0' || charAt > '9' || i10 == 0) && ((charAt != '~' || i10 == 0) && ((charAt != '.' || i10 == 0) && ((charAt != '_' || i10 == 0) && ((charAt != '+' || i10 == 0) && (charAt != '-' || i10 == 0))))))))) {
                    throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                zoneRules = j$.time.zone.i.b(str, true);
            } catch (j$.time.zone.f e10) {
                if (z10) {
                    throw e10;
                }
                zoneRules = null;
            }
            return new v(str, zoneRules);
        }
        throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 7, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.ZoneId
    public final void Q(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f35166b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void S(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f35166b);
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.f35166b;
    }

    @Override // j$.time.ZoneId
    public final ZoneRules getRules() {
        ZoneRules zoneRules = this.f35167c;
        return zoneRules != null ? zoneRules : j$.time.zone.i.b(this.f35166b, false);
    }
}
