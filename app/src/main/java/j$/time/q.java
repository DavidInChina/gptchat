package j$.time;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class q implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a  reason: collision with root package name */
    private byte f35105a;

    /* renamed from: b  reason: collision with root package name */
    private Object f35106b;

    public q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(byte b10, Object obj) {
        this.f35105a = b10;
        this.f35106b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b10, ObjectInput objectInput) {
        switch (b10) {
            case 1:
                Duration duration = Duration.f34874c;
                return Duration.w(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.EPOCH;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.MIN;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return i.d0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.MIN;
                LocalDate localDate2 = LocalDate.MIN;
                return LocalDateTime.V(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), i.d0(objectInput));
            case 6:
                return ZonedDateTime.R(objectInput);
            case 7:
                int i10 = v.f35165d;
                return ZoneId.L(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.X(objectInput);
            case 9:
                return o.P(objectInput);
            case 10:
                return OffsetDateTime.R(objectInput);
            case 11:
                int i11 = s.f35109b;
                return s.L(objectInput.readInt());
            case 12:
                return u.R(objectInput);
            case 13:
                return m.L(objectInput);
            case 14:
                return p.d(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f35106b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f35105a = readByte;
        this.f35106b = b(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b10 = this.f35105a;
        Object obj = this.f35106b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                ((Duration) obj).z(objectOutput);
                return;
            case 2:
                ((Instant) obj).S(objectOutput);
                return;
            case 3:
                ((LocalDate) obj).i0(objectOutput);
                return;
            case 4:
                ((i) obj).i0(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).f0(objectOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).U(objectOutput);
                return;
            case 7:
                ((v) obj).S(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).Y(objectOutput);
                return;
            case 9:
                ((o) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((s) obj).R(objectOutput);
                return;
            case 12:
                ((u) obj).U(objectOutput);
                return;
            case 13:
                ((m) obj).O(objectOutput);
                return;
            case 14:
                ((p) obj).f(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
